/*
 * This class is responsible for generating LLVM Actions
 * It will be called by the main class.
 */

import java.util.HashMap;
import java.util.Stack;

enum VarType{
    INT,
    REAL,
    UNKNOWN
}

// enum IfType{
//     SINGLE,
//     IFELSE,
//     NONE
// }

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
    //public String cleanTargetId;
    public BrLabel( String targetId ){
        this.targetId = "target" + targetId;
        //this.cleanTargetId = targetId.replace("%", "");
    }
}


public class LLVMActions extends GLangBaseListener {

    HashMap<String, Value> variables = new HashMap<String, Value>();
    Stack<Value> stack = new Stack<Value>();
    Stack<BrCompareLabel> brCompareStack = new Stack<BrCompareLabel>();
    Stack<BrLabel> brStack = new Stack<BrLabel>();

    @Override 
    public void exitValueID(GLangParser.ValueIDContext ctx) { 
        //System.err.println("exitValue: " + ctx.ID() + " " + ctx.getText());
       if( ctx.ID() != null ){
         String ID = ctx.ID().getText();     
         if( variables.containsKey(ID) ) {
            Value v = variables.get( ID );
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
        //System.err.println("exitValueINT: " + ctx.INT().getText());
        stack.push( new Value(ctx.INT().getText(), VarType.INT, 0) );
    }

    @Override
    public void exitValueREAL(GLangParser.ValueREALContext ctx) { 
        //System.err.println("exitValueREAL: " + ctx.REAL().getText());
        stack.push( new Value(ctx.REAL().getText(), VarType.REAL, 0) );
    }

    @Override
    public void exitAssignNew(GLangParser.AssignNewContext ctx) { 
       // System.err.println("exitAssignNew");
       String ID = ctx.ID().getText();
       String NUMTYPE = ctx.NUMTYPE().getText().toUpperCase();

       Value v = stack.pop();

        if( !v.type.toString().equals(NUMTYPE) ){
            error(ctx.getStart().getLine(), "type mismatch: "+ NUMTYPE + " and " + v.type);
        }

        if(NUMTYPE != null && variables.containsKey(ID)){
            error(ctx.getStart().getLine(), "variable already declared: "+ID);
        }

       if( !variables.containsKey(ID) ) {
          variables.put(ID, v);

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
        //System.err.println("exitAssign");
        String ID = ctx.ID().getText();
        Value v = stack.pop();
        if( !variables.containsKey(ID) ) {
            error(ctx.getStart().getLine(), "unknown variable: "+ID);
        }
        Value v2 = variables.get(ID);
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
        //System.err.println("exitDeclare");
        String ID = ctx.ID().getText();
 
        String NUM_TYPE = ctx.NUMTYPE().getText().toUpperCase();
 
        if( variables.containsKey(ID) ) {
            error(ctx.getStart().getLine(), "variable already declared: "+ID);
        }
 
        Value v = new Value(ID, VarType.valueOf(NUM_TYPE), 0);
        variables.put(ID, v);
 
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
        //System.err.println("exitPrint");
        String ID = ctx.ID().getText();
        if( variables.containsKey(ID) ) {
          Value v = variables.get( ID );
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
        //System.err.println("exitRead");
       String ID = ctx.ID().getText();
       if( ! variables.containsKey(ID) ) {
        error(ctx.getStart().getLine(), "undeclared variable: " +ID);         
       } 

       switch (variables.get(ID).type) {
           case INT:
               LLVMGenerator.scanf_int(ID);
               break;
           case REAL:
               LLVMGenerator.scanf_real(ID);
               break;
           default:
               error(ctx.getStart().getLine(), "unknown type: "+variables.get(ID).type);
       }
    } 

    @Override 
    public void exitAddExpression(GLangParser.AddExpressionContext ctx) { 
        //System.err.println("exitAdd");
       Value v1 = stack.pop();
       //System.err.println(v1.id +" "+ v1.type +" "+ v1.length);
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
       // System.err.println("exitMultiply");
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
        System.err.println("exitLessCondition");
        Value v2 = stack.pop();
        Value v1 = stack.pop();

        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.less_i32(v1.id, v2.id);
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.less_real(v1.id, v2.id);
            }

            BrCompareLabel brCompare = new BrCompareLabel("%"+(LLVMGenerator.reg-1));
            brCompareStack.push(brCompare);
            LLVMGenerator.br_compare(brCompare.compareId, brCompare.trueId, brCompare.falseId);
            LLVMGenerator.create_label(brCompare.trueId);


        } else {
            error(ctx.getStart().getLine(), "less condition type mismatch: " + v1.type + " and " + v2.type);
        }

        System.err.println(v1.id + " " + v2.id);
    }

    //TODO: More conditions: greater, equal, less_equal, greater_equal, not_equal


    @Override
    public void enterSingleIf(GLangParser.SingleIfContext ctx){
        System.err.println("enterSingleIf");
    }

    @Override
    public void exitSingleIf(GLangParser.SingleIfContext ctx){
        System.err.println("exitSingleIf");

        BrCompareLabel brCompare = brCompareStack.pop();
        LLVMGenerator.single_br(brCompare.falseId);
        LLVMGenerator.create_label(brCompare.falseId);
    }

    @Override
    public void enterNestedElseBlock(GLangParser.NestedElseBlockContext ctx){
        System.err.println("enterNestedElseBlock");
        BrCompareLabel brCompare = brCompareStack.peek();

        LLVMGenerator.single_br(brCompare.extraId);
        LLVMGenerator.create_label(brCompare.falseId);
    }

    @Override
    public void exitIfElse(GLangParser.IfElseContext ctx){
        System.err.println("exitIfElse");
        BrCompareLabel brCompare = brCompareStack.pop();
        LLVMGenerator.single_br(brCompare.extraId);
        LLVMGenerator.create_label(brCompare.extraId);
    }


    @Override
    public void enterWhile(GLangParser.WhileContext ctx){
        System.err.println("enterWhile");
        BrLabel brLabel = new BrLabel(Integer.toString(LLVMGenerator.reg-1));
        brStack.push(brLabel);
        LLVMGenerator.single_br(brLabel.targetId);
        LLVMGenerator.create_label(brLabel.targetId);
    }

    @Override
    public void exitWhile(GLangParser.WhileContext ctx){
        System.err.println("exitWhile");
        BrLabel brLabel = brStack.pop();
        LLVMGenerator.single_br(brLabel.targetId);
        BrCompareLabel brCompare = brCompareStack.pop();
        LLVMGenerator.create_label(brCompare.falseId);
    }

   
    @Override 
    public void exitProgram(GLangParser.ProgramContext ctx) { 
       // System.err.println("exitProgram");

       System.out.println( LLVMGenerator.generate() );
    }
 
    void error(int line, String msg){
        String errorMsg = String.format("Compilation Error, line %s :: [%s]",line,msg);
       System.err.println(errorMsg);
       System.exit(1);
   } 

}
