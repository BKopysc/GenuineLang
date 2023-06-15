/*
 * This class is responsible for generating LLVM code from the AST.
 * It will be called by the main class.
 */

import java.util.List;
import java.util.ArrayList;

// Object to store the text of the LLVM code
class TextObject{
    String str;
    TextObject(String text){
        this.str = text;
    }
}

// Generator class
class LLVMGenerator {
    
    static String header_text = "";
    static TextObject basic_text = new TextObject(""); // default text context
    static TextObject functions_text = new TextObject(""); // functions text context
   private static List<Integer> func_args = new ArrayList<>(); // temp list to store function args
    static int reg = 1; // register counter
    static int temp_reg = 0; // temp register counter to store the value of reg
    private static TextObject main_text = basic_text; // text context to be used

// register methods
    static void save_reg(){
      temp_reg = reg;
    }

    static void restore_reg(){
      reg = temp_reg;
    }

    static void reg_to_zero(){
      reg = 0;
    }


// functions methods
   static void declare_function(String type, String name, List<String> argsTypes, List<String> argsNames){
      save_reg();
      reg_to_zero();
      String args = "";
      for(int i=0; i<argsTypes.size(); i++){
         args += argsTypes.get(i)+" %"+reg;
         if( i < argsTypes.size()-1 ) args += ", ";
         func_args.add(reg);
         reg++;
      }
      main_text = functions_text;
      main_text.str += "define "+type+" @"+name+"("+args+") { \n";
      reg++;
      load_function_args(argsTypes, argsNames);
   }

   static void end_function(){
      main_text.str += "}\n\n";
      main_text = basic_text;
      restore_reg();
   }

   static void create_return(String type, String value){
      main_text.str += "ret "+type+" "+value+"\n";
   }

   static void call_function(String type, String name, List<String> argsTypes, List<String> argsNames){
      String args = "";
      for(int i=0; i<argsTypes.size(); i++){
         args += argsTypes.get(i)+" "+argsNames.get(i);
         if( i < argsTypes.size()-1 ) args += ", ";
      }
      main_text.str += "%"+reg+" = call "+type+" @"+name+"("+args+")\n";
      reg++;
   }

   private static void load_function_args(List<String> argsTypes, List<String> argsNames){

      for(int i = 0; i < argsTypes.size(); i++){
         main_text.str += "%"+argsNames.get(i)+" = alloca "+argsTypes.get(i)+"\n";
      }


      for(int i = 0; i < argsTypes.size(); i++){
         main_text.str += "store "+argsTypes.get(i)+" %"+func_args.get(i)+", "+argsTypes.get(i)+"* %"+argsNames.get(i)+"\n";
      }
      func_args.clear();
   }

// basic methods
    static void declare_int(String id){
      main_text.str += "%"+id+" = alloca i32\n";
   }

   static void declare_real(String id){
        main_text.str += "%"+id+" = alloca double\n";
    }

      static void assign_int(String id, String value){
      main_text.str += "store i32 "+value+", i32* %"+id+"\n";
   }

    static void assign_real(String id, String value){
      main_text.str += "store double "+value+", double* %"+id+"\n";
   }

   static void load_int(String id){
      main_text.str += "%"+reg+" = load i32, i32* %"+id+"\n";
      reg++;
   }
 
    static void load_real(String id){
        main_text.str += "%"+reg+" = load double, double* %"+id+"\n";
        reg++;
    }
 
    static void printf_int(String id){
      main_text.str += "%"+reg+" = load i32, i32* %"+id+"\n";
      reg++;
      main_text.str += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }
 
   static void printf_real(String id){
      main_text.str += "%"+reg+" = load double, double* %"+id+"\n";
      reg++;
      main_text.str += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpr, i64 0, i64 0), double %"+(reg-1)+")\n";
      reg++;
   }
 
      static void scanf(String id, VarType type){
 
        String type_str = "i32";
        String declaration = "@strscani";
        if( type == VarType.REAL ){
            type_str = "double";
            declaration = "@strscanr";
        }
 
      main_text.str += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* " + declaration +", i32 0, i32 0), "
       + type_str + "* %"+id+")\n";
      reg++;      
   }

   static void scanf_int(String id){
      main_text.str += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strscani, i32 0, i32 0), i32* %"+id+")\n";
      reg++;      
   }

   static void scanf_real(String id){
       main_text.str += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strscanr, i64 0, i64 0), double* %"+id+")\n";
       reg++;
   }

// arithmetic operations
    static void add_i32(String val1, String val2){
      main_text.str += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_real(String val1, String val2){
      main_text.str += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
   }

   static void mul_i32(String val1, String val2){
      main_text.str += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mul_real(String val1, String val2){
      main_text.str += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }

    static void sub_i32(String val1, String val2){
      main_text.str += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
      reg++;
   }
 
   static void sub_real(String val1, String val2){
      main_text.str += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
      reg++;
   }
 
   static void div_i32(String val1, String val2){
      main_text.str += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
      reg++;
   }
 
   static void div_real(String val1, String val2){
      main_text.str += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
      reg++;
   }

// i32 conditionals

   static void less_i32(String val1, String val2){
      main_text.str += "%"+reg+" = icmp slt i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void less_equal_i32(String val1, String val2){
      main_text.str += "%"+reg+" = icmp sle i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_i32(String val1, String val2){
      main_text.str += "%"+reg+" = icmp sgt i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_equal_i32(String val1, String val2){
      main_text.str += "%"+reg+" = icmp sge i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void equal_i32(String val1, String val2){
      main_text.str += "%"+reg+" = icmp eq i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void not_equal_i32(String val1, String val2){
      main_text.str += "%"+reg+" = icmp ne i32 "+val1+", "+val2+"\n";
      reg++;
   }

   //real conditionals

   static void less_real(String val1, String val2){
      main_text.str += "%"+reg+" = fcmp olt double "+val1+", "+val2+"\n";
      reg++;
   }

   static void less_equal_real(String val1, String val2){
      main_text.str += "%"+reg+" = fcmp ole double "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_real(String val1, String val2){
      main_text.str += "%"+reg+" = fcmp ogt double "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_equal_real(String val1, String val2){
      main_text.str += "%"+reg+" = fcmp oge double "+val1+", "+val2+"\n";
      reg++;
   }

   static void equal_real(String val1, String val2){
      main_text.str += "%"+reg+" = fcmp oeq double "+val1+", "+val2+"\n";
      reg++;
   }

   static void not_equal_real(String val1, String val2){
      main_text.str += "%"+reg+" = fcmp one double "+val1+", "+val2+"\n";
      reg++;
   }

   // boolean compare utils

   static void br_compare(String compareVal, String trueVal, String endVal){
      main_text.str += "br i1 "+compareVal+", label %"+trueVal+", label %"+endVal+"\n";
   }

   static void create_label(String label){
      main_text.str += label+":\n";
   }

   static void single_br(String label){
      main_text.str += "br label %"+label+"\n";
   }

   //generate code
 
    static String generate(){
      String text = "";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpr = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strscani = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strscanr = constant [4 x i8] c\"%lf\\00\"\n";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += header_text;
      text += "\ndefine i32 @main() nounwind{\n";
      text += basic_text.str;
      text += "ret i32 0 }\n\n";

      text += functions_text.str;
      return text;
   }
}
