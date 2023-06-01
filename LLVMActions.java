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


public class LLVMActions extends GLangBaseListener {

    HashMap<String, Value> variables = new HashMap<String, Value>();
    Stack<Value> stack = new Stack<Value>();


    @Override 
    public void exitValue(GLangParser.ValueContext ctx) { 
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
       if( ctx.INT() != null ){
         stack.push( new Value(ctx.INT().getText(), VarType.INT, 0) );
       } 
       if( ctx.REAL() != null ){
        stack.push( new Value(ctx.REAL().getText(), VarType.REAL, 0) );
       } 
    }

    @Override
    public void exitAssignNew(GLangParser.AssignNewContext ctx) { 
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
       String ID = ctx.ID().getText();
       if( ! variables.containsKey(ID) ) {
        error(ctx.getStart().getLine(), "undeclared variable: " +ID);         
       } 
       LLVMGenerator.scanf(ID, variables.get(ID).type);
    } 

    @Override 
    public void exitAdd(GLangParser.AddContext ctx) { 
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.add_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.REAL ){
             LLVMGenerator.add_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "add type mismatch");
       }
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
