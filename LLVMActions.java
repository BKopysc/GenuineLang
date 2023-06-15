/*
 * This class is responsible for generating LLVM Actions
 * It will be called by the main class.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

enum VarType{
    INT,
    REAL,
    UNKNOWN
}

enum ConditionType{
    EQUAL,
    NOT_EQUAL,
    LESS,
    LESS_EQUAL,
    GREATER,
    GREATER_EQUAL
}

class Value{
    public String id;
    public VarType type;
    public int length;
    public Value( String id, VarType type, int length ){
        this.id = id;
        this.type = type;
        this.length = length;
    }
}

class BrCompareLabel{
    public String compareId;
    public String cleanCompareId;
    public String trueId;
    public String falseId;
    public String extraId;
    public BrCompareLabel( String compareId){
        this.compareId = compareId;
        this.cleanCompareId = compareId.replace("%", "");
        this.trueId = "true"+cleanCompareId;
        this.falseId = "false"+cleanCompareId;
        this.extraId = "extra"+cleanCompareId;
    }
}

class BrLabel{
    public String targetId;
    public BrLabel( String targetId ){
        this.targetId = "target" + targetId;
    }
}

class FunctionObj{
    String name;
    VarType type;
    List<VarType> argsTypes;
    List<String> argsNames;
    public FunctionObj( String name, VarType type){
        this.name = name;
        this.type = type;
        this.argsTypes = null;
        this.argsNames = null;
    }
}


public class LLVMActions extends GLangBaseListener {

    HashMap<String, Value> variables = new HashMap<String, Value>();
    HashMap<String, Value> localVariables = new HashMap<String, Value>();
    HashMap<String, FunctionObj> functions = new HashMap<String, FunctionObj>();
    
    Map<String, Value> defaultVariablesMap = this.variables;

    Stack<Value> stack = new Stack<Value>();
    Stack<BrCompareLabel> brCompareStack = new Stack<BrCompareLabel>();
    Stack<BrLabel> brStack = new Stack<BrLabel>();

    String currentFunction = "";
    boolean isFunctionHeader = false;
    boolean isInstructionBlock = false;
    

    @Override
    public void enterFunctionDef(GLangParser.FunctionDefContext ctx) { 
        isFunctionHeader = true;
        defaultVariablesMap = localVariables; // change default variables map to local variables
    }

    @Override
    public void exitFunctionInit(GLangParser.FunctionInitContext ctx){
        String functionName = ctx.ID().getText();
        String functionType = ctx.NUMTYPE().getText().toUpperCase();

        if( functions.containsKey(functionName) ){
            error(ctx.getStart().getLine(), "function "+functionName+" already defined");
        }
        FunctionObj functionObj = new FunctionObj(functionName, VarType.valueOf(functionType));
        functions.put(functionName, functionObj);
        currentFunction = functionName;
    }

    @Override
    public void exitFunctionHeader(GLangParser.FunctionHeaderContext ctx) {
        isFunctionHeader = false;
        FunctionObj functionObj = null;
        try{
            functionObj = functions.get(currentFunction);
        } catch (Exception e){
            error(ctx.getStart().getLine(), "function "+currentFunction+" not defined");
        }

        
        String functionType = functionObj.type.toString() == "INT" ? "i32" : "double";
        List<String> argsTypes = functionObj.argsTypes.stream()
            .map(x -> x.toString() == "INT" ? "i32" : "double").toList();
        
        List<String> argsName = functionObj.argsNames;

        LLVMGenerator.declare_function(functionType, functionObj.name, argsTypes, argsName );
    }

    @Override
    public void exitFunctionDef(GLangParser.FunctionDefContext ctx) { 
        defaultVariablesMap = variables; // change default variables map to global variables
        localVariables.clear();
        currentFunction = "";

        LLVMGenerator.end_function();
    }

    @Override
    public void exitReturnStat(GLangParser.ReturnStatContext ctx) { 
        FunctionObj functionObj = null;
        try{
            functionObj = functions.get(currentFunction);
        } catch (Exception e){
            error(ctx.getStart().getLine(), "function "+currentFunction+" not defined");
        }
        
        Value value = stack.pop();
        if( value.type != functionObj.type ){
            error(ctx.getStart().getLine(), "return type error");
        }

        String retType = value.type.toString() == "INT" ? "i32" : "double";

        LLVMGenerator.create_return(retType, value.id);
    }

    @Override
    public void exitFunctionParams(GLangParser.FunctionParamsContext ctx) { 
        List<String> argsName = ctx.ID().stream()
            .map(x -> x.getText()).toList();
        List<VarType> argsType = ctx.NUMTYPE().stream()
            .map(x -> VarType.valueOf(x.getText().toUpperCase())).toList();

        if( argsName.size() != argsType.size() ){
            error(ctx.getStart().getLine(), "function params error");
        }

        for(int i=0; i<argsName.size(); i++){
            Value valueTemp = new Value(argsName.get(i), argsType.get(i), 0);
            defaultVariablesMap.put(valueTemp.id, valueTemp);
        }

        functions.get(currentFunction).argsTypes = argsType;
        functions.get(currentFunction).argsNames = argsName;
    }

    @Override
    public void exitSingleCall(GLangParser.SingleCallContext ctx) { 
        String functionName = ctx.ID().getText();
        FunctionObj functionObj = null;
        try{
            functionObj = functions.get(functionName);
        } catch (RuntimeException e){
            error(ctx.getStart().getLine(), "function "+functionName+" not defined");
            return;
        }

        List<VarType> argsTypes = functionObj.argsTypes;
        List<String> argsNames = functionObj.argsNames;

        List<Value> args = new ArrayList<Value>();
        for(int i=0; i<argsTypes.size(); i++){
            if( stack.isEmpty() ){
                error(ctx.getStart().getLine(), "function args error [stack]");
            }
            Value value = stack.pop();
            if( value.type != argsTypes.get(i) ){
                error(ctx.getStart().getLine(), "function args type error");
            }
            args.add(0,value);
        }

                List<String> finalArgsTypes = args.stream()
            .map(x -> x.type.toString() == "INT" ? "i32" : "double").toList();
        List<String> finalArgsNames = args.stream()
            .map(x -> x.id).toList();

        String functionType = functionObj.type.toString() == "INT" ? "i32" : "double";
        LLVMGenerator.call_function(functionType, functionName, finalArgsTypes, finalArgsNames);
    }

    @Override
    public void exitFunctionCallExpression(GLangParser.FunctionCallExpressionContext ctx) {
        String functionName = ctx.ID().getText();
        FunctionObj functionObj = null;
        try{
            functionObj = functions.get(functionName);
        } catch (RuntimeException e){
            error(ctx.getStart().getLine(), "function "+functionName+" not defined");
            return;
        }

        List<VarType> argsTypes = functionObj.argsTypes;
        List<String> argsNames = functionObj.argsNames;

        List<Value> args = new ArrayList<Value>();
        for(int i=0; i<argsTypes.size(); i++){
            if( stack.isEmpty() ){
                error(ctx.getStart().getLine(), "function args error [stack]");
            }
            Value value = stack.pop();
            if( value.type != argsTypes.get(i) ){
                error(ctx.getStart().getLine(), "function args type error");
            }
            args.add(0,value);
        }

        String functionType = functionObj.type.toString() == "INT" ? "i32" : "double";

        List<String> finalArgsTypes = args.stream()
            .map(x -> x.type.toString() == "INT" ? "i32" : "double").toList();
        List<String> finalArgsNames = args.stream()
            .map(x -> x.id).toList();

        LLVMGenerator.call_function(functionType, functionName, finalArgsTypes, finalArgsNames);
        stack.push( new Value("%"+(LLVMGenerator.reg-1), functionObj.type, 0)); 
    }

    @Override
    public void enterInstructionStat(GLangParser.InstructionStatContext ctx){
        isInstructionBlock = true;
    }

    @Override
    public void exitInstructionStat(GLangParser.InstructionStatContext ctx){
        isInstructionBlock = false;
    }

    @Override 
    public void exitValueID(GLangParser.ValueIDContext ctx) { 
        if(isFunctionHeader){
            return;
        }

       if( ctx.ID() != null ){
         String ID = ctx.ID().getText();     
         if( defaultVariablesMap.containsKey(ID) ) {
            Value v = defaultVariablesMap.get( ID );
            if( v.type == VarType.INT ){
               LLVMGenerator.load_int( ID );
            }
            if( v.type == VarType.REAL ){
               LLVMGenerator.load_real( ID );
            }
            stack.push( new Value("%"+(LLVMGenerator.reg-1), v.type, v.length)); 
         } else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);         
         }
       } 
    }

    @Override
    public void exitValueINT(GLangParser.ValueINTContext ctx) { 
        if(isFunctionHeader){
            return;
        }

        stack.push( new Value(ctx.INT().getText(), VarType.INT, 0) );
    }

    @Override
    public void exitValueREAL(GLangParser.ValueREALContext ctx) { 
        if(isFunctionHeader){
            return;
        }

        stack.push( new Value(ctx.REAL().getText(), VarType.REAL, 0) );
    }

    @Override
    public void exitAssignNew(GLangParser.AssignNewContext ctx) { 
       String ID = ctx.ID().getText();
       String NUMTYPE = ctx.NUMTYPE().getText().toUpperCase();

       Value v = stack.pop();

        if(isInstructionBlock){
            error(ctx.getStart().getLine(), "declare inside instruction block is not allowed");
            return;
        }

        if( !v.type.toString().equals(NUMTYPE) ){
            error(ctx.getStart().getLine(), "type mismatch: "+ NUMTYPE + " and " + v.type);
        }

        if(NUMTYPE != null && defaultVariablesMap.containsKey(ID)){
            error(ctx.getStart().getLine(), "variable already declared: "+ID);
        }

       if( !defaultVariablesMap.containsKey(ID) ) {
          defaultVariablesMap.put(ID, v);

          if( v.type == VarType.INT ){
             LLVMGenerator.declare_int(ID);
          } 
          if( v.type == VarType.REAL ){
             LLVMGenerator.declare_real(ID);
          } 
       }   
       if( v.type == VarType.INT ){
         LLVMGenerator.assign_int(ID, v.id);
       } 
       if( v.type == VarType.REAL ){
        LLVMGenerator.assign_real(ID, v.id);
       } 
    }

    @Override
    public void exitAssign(GLangParser.AssignContext ctx){
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        if( !defaultVariablesMap.containsKey(ID) ) {
            error(ctx.getStart().getLine(), "unknown variable: "+ID);
        }
        Value v2 = defaultVariablesMap.get(ID);
        if( v.type != v2.type ){
            error(ctx.getStart().getLine(), "type mismatch: "+ v2.type + " and " + v.type);
        }
        if( v.type == VarType.INT ){
            LLVMGenerator.assign_int(ID, v.id);
        }
        if( v.type == VarType.REAL ){
            LLVMGenerator.assign_real(ID, v.id);
        }
    }

   @Override
    public void exitDeclare(GLangParser.DeclareContext ctx){
        String ID = ctx.ID().getText();
 
        String NUM_TYPE = ctx.NUMTYPE().getText().toUpperCase();
 
        if( defaultVariablesMap.containsKey(ID) ) {
            error(ctx.getStart().getLine(), "variable already declared: "+ID);
        }
 
        Value v = new Value(ID, VarType.valueOf(NUM_TYPE), 0);
        defaultVariablesMap.put(ID, v);
 
        switch(VarType.valueOf(NUM_TYPE)){
            case INT:
                LLVMGenerator.declare_int(ID);
                break;
            case REAL:
                LLVMGenerator.declare_real(ID);
                break;
            default:
                error(ctx.getStart().getLine(), "unknown type: "+NUM_TYPE);
        }
 
 
    }
 
    @Override
    public void exitPrint(GLangParser.PrintContext ctx) { 
        String ID = ctx.ID().getText();
        if( defaultVariablesMap.containsKey(ID) ) {
          Value v = defaultVariablesMap.get( ID );
          if( v.type != null ) {
             if( v.type == VarType.INT ){
                LLVMGenerator.printf_int( ID );
             }
             if( v.type == VarType.REAL ){
                LLVMGenerator.printf_real( ID );
             }
          }  
       } else {
          error(ctx.getStart().getLine(), "unknown variable: " +ID);
       }       
    }
 
    @Override
    public void exitRead(GLangParser.ReadContext ctx) {
       String ID = ctx.ID().getText();
       if( ! defaultVariablesMap.containsKey(ID) ) {
        error(ctx.getStart().getLine(), "undeclared variable: " +ID);         
       } 

       switch (defaultVariablesMap.get(ID).type) {
           case INT:
               LLVMGenerator.scanf_int(ID);
               break;
           case REAL:
               LLVMGenerator.scanf_real(ID);
               break;
           default:
               error(ctx.getStart().getLine(), "unknown type: "+defaultVariablesMap.get(ID).type);
       }
    } 

    @Override 
    public void exitAddExpression(GLangParser.AddExpressionContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.add_i32(v1.id, v2.id); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) ); 
          }
	  if( v1.type == VarType.REAL ){
             LLVMGenerator.add_real(v1.id, v2.id); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "add type mismatch: " + v1.type + " " + v2.type);
       }
    }

    @Override
    public void exitMultiplyExpression(GLangParser.MultiplyExpressionContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                 LLVMGenerator.mul_i32(v1.id, v2.id); 
                 stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) ); 
            }
            if( v1.type == VarType.REAL ){
                 LLVMGenerator.mul_real(v1.id, v2.id); 
                 stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) ); 
             }
         } else {
            error(ctx.getStart().getLine(), "multiply type mismatch: " + v1.type + " " + v2.type);
         }
    }
   
   @Override
   public void exitSubtractExpression(GLangParser.SubtractExpressionContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                 LLVMGenerator.sub_i32(v1.id, v2.id); 
                 stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) ); 
            }
            if( v1.type == VarType.REAL ){
                 LLVMGenerator.sub_real(v1.id, v2.id); 
                 stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) ); 
             }
         } else {
            error(ctx.getStart().getLine(), "subtract type mismatch: " + v1.type + " and " + v2.type);
         }
   }
 
   @Override
    public void exitDivideExpression(GLangParser.DivideExpressionContext ctx) { 
         Value v1 = stack.pop();
         Value v2 = stack.pop();
         if( v1.type == v2.type ) {
                if( v1.type == VarType.INT ){
                  LLVMGenerator.div_i32(v1.id, v2.id); 
                  stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT,0) ); 
                }
                if( v1.type == VarType.REAL ){
                  LLVMGenerator.div_real(v1.id, v2.id); 
                  stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL,0) ); 
                 }
            } else {
                error(ctx.getStart().getLine(), "divide type mismatch: " + v1.type + " and " + v2.type);
            }
    }

    @Override
    public void exitLessCondition(GLangParser.LessConditionContext ctx){
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        conditionCompare(v2, v1, ConditionType.LESS, ctx.getStart().getLine());
    }

    @Override
    public void exitLessEqualCondition(GLangParser.LessEqualConditionContext ctx){
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        conditionCompare(v2, v1, ConditionType.LESS_EQUAL, ctx.getStart().getLine());
    }

    @Override
    public void exitGreaterCondition(GLangParser.GreaterConditionContext ctx){
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        conditionCompare(v2, v1, ConditionType.GREATER, ctx.getStart().getLine());
    }


    @Override
    public void exitGreaterEqualCondition(GLangParser.GreaterEqualConditionContext ctx){
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        conditionCompare(v2, v1, ConditionType.GREATER_EQUAL, ctx.getStart().getLine());
    }

    @Override
    public void exitEqualCondition(GLangParser.EqualConditionContext ctx){
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        conditionCompare(v2, v1, ConditionType.EQUAL, ctx.getStart().getLine());
    }

    @Override
    public void exitNotEqualCondition(GLangParser.NotEqualConditionContext ctx){
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        conditionCompare(v2, v1, ConditionType.NOT_EQUAL, ctx.getStart().getLine());
    }


    public void conditionCompare(Value v2, Value v1, ConditionType cType, int ctxLine){

        if( v1.type != v2.type ) {
            error(ctxLine, "type mismatch [in condition]: " + v1.type + " and " + v2.type);
        } 
           
         if( v1.type == VarType.INT ){

            switch (cType) {
                case LESS:
                    LLVMGenerator.less_i32(v1.id, v2.id);
                    break;
                case GREATER:
                    LLVMGenerator.greater_i32(v1.id, v2.id);
                    break;
                case EQUAL:
                    LLVMGenerator.equal_i32(v1.id, v2.id);
                    break;
                case LESS_EQUAL:
                    LLVMGenerator.less_equal_i32(v1.id, v2.id);
                    break;
                case GREATER_EQUAL:
                    LLVMGenerator.greater_equal_i32(v1.id, v2.id);
                    break;
                case NOT_EQUAL:
                    LLVMGenerator.not_equal_i32(v1.id, v2.id);
                    break;
                default:
                    break;
            }
        }
            
        if( v1.type == VarType.REAL ){
            switch (cType){
                case LESS:
                    LLVMGenerator.less_real(v1.id, v2.id);
                    break;
                case GREATER:
                    LLVMGenerator.greater_real(v1.id, v2.id);
                    break;
                case EQUAL:
                    LLVMGenerator.equal_real(v1.id, v2.id);
                    break;
                case LESS_EQUAL:
                    LLVMGenerator.less_equal_real(v1.id, v2.id);
                    break;
                case GREATER_EQUAL:
                    LLVMGenerator.greater_equal_real(v1.id, v2.id);
                    break;
                case NOT_EQUAL:
                    LLVMGenerator.not_equal_real(v1.id, v2.id);
                    break;
                default:
                    break;
            }
        }

        BrCompareLabel brCompare = new BrCompareLabel("%"+(LLVMGenerator.reg-1));
        brCompareStack.push(brCompare);
        LLVMGenerator.br_compare(brCompare.compareId, brCompare.trueId, brCompare.falseId);
        LLVMGenerator.create_label(brCompare.trueId);

    }

    @Override
    public void exitSingleIf(GLangParser.SingleIfContext ctx){
        BrCompareLabel brCompare = brCompareStack.pop();
        LLVMGenerator.single_br(brCompare.falseId);
        LLVMGenerator.create_label(brCompare.falseId);
    }

    @Override
    public void enterNestedElseBlock(GLangParser.NestedElseBlockContext ctx){
        BrCompareLabel brCompare = brCompareStack.peek();

        LLVMGenerator.single_br(brCompare.extraId);
        LLVMGenerator.create_label(brCompare.falseId);
    }

    @Override
    public void exitIfElse(GLangParser.IfElseContext ctx){
        BrCompareLabel brCompare = brCompareStack.pop();
        LLVMGenerator.single_br(brCompare.extraId);
        LLVMGenerator.create_label(brCompare.extraId);
    }


    @Override
    public void enterWhile(GLangParser.WhileContext ctx){
        BrLabel brLabel = new BrLabel(Integer.toString(LLVMGenerator.reg-1));
        brStack.push(brLabel);
        LLVMGenerator.single_br(brLabel.targetId);
        LLVMGenerator.create_label(brLabel.targetId);
    }

    @Override
    public void exitWhile(GLangParser.WhileContext ctx){
        BrLabel brLabel = brStack.pop();
        LLVMGenerator.single_br(brLabel.targetId);
        BrCompareLabel brCompare = brCompareStack.pop();
        LLVMGenerator.create_label(brCompare.falseId);
    }

    @Override 
    public void exitProgram(GLangParser.ProgramContext ctx) { 

       System.out.println( LLVMGenerator.generate() );
    }
 
    void error(int line, String msg){
        String errorMsg = String.format("Compilation Error, line %s :: [%s]",line,msg);
       System.err.println(errorMsg);
       System.exit(1);
   } 

}
