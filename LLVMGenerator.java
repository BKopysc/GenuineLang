/*
 * This class is responsible for generating LLVM code from the AST.
 * It will be called by the main class.
 */

// enum VarType{
//     INT,
//     REAL,
//     UNKNOWN
// }

import java.util.List;

class LLVMGenerator {
    
    static String header_text = "";
    static String basic_text = "";
    static String functions_text = "";
    static int reg = 1;

    private static String main_text = basic_text;

   static void declare_function(String type, String name, List<String> argsTypes, List<String> argsNames){
      String args = "";
      for(int i=0; i<argsTypes.size(); i++){
         args += argsTypes.get(i)+" %"+argsNames.get(i);
         if( i < argsTypes.size()-1 ) args += ", ";
      }
      main_text = functions_text;
      main_text += "declare "+type+" @"+name+"("+args+") { \n";
   }

   static void end_function(){
      main_text += "}\n\n";
      main_text = basic_text;
   }

   static void create_return(String type, String value){
      main_text += "ret "+type+" "+value+"\n";
   }

   static void call_function(String type, String name, List<String> argsTypes, List<String> argsNames){
      String args = "";
      for(int i=0; i<argsTypes.size(); i++){
         args += argsTypes.get(i)+" %"+argsNames.get(i);
         if( i < argsTypes.size()-1 ) args += ", ";
      }
      main_text += "%"+reg+" = call "+type+" @"+name+"("+args+")\n";
      reg++;
   }

    static void declare_int(String id){
      main_text += "%"+id+" = alloca i32\n";
   }

   static void declare_real(String id){
        main_text += "%"+id+" = alloca double\n";
    }

      static void assign_int(String id, String value){
      main_text += "store i32 "+value+", i32* %"+id+"\n";
   }

    static void assign_real(String id, String value){
      main_text += "store double "+value+", double* %"+id+"\n";
   }

   static void load_int(String id){
      main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
      reg++;
   }
 
    static void load_real(String id){
        main_text += "%"+reg+" = load double, double* %"+id+"\n";
        reg++;
    }
 
    static void printf_int(String id){
      main_text += "%"+reg+" = load i32, i32* %"+id+"\n";
      reg++;
      main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }
 
   static void printf_real(String id){
      main_text += "%"+reg+" = load double, double* %"+id+"\n";
      reg++;
      main_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpr, i64 0, i64 0), double %"+(reg-1)+")\n";
      reg++;
   }
 
      static void scanf(String id, VarType type){
 
        String type_str = "i32";
        String declaration = "@strscani";
        if( type == VarType.REAL ){
            type_str = "double";
            declaration = "@strscanr";
        }
 
      main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* " + declaration +", i32 0, i32 0), "
       + type_str + "* %"+id+")\n";
      reg++;      
   }

   static void scanf_int(String id){
      main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strscani, i32 0, i32 0), i32* %"+id+")\n";
      reg++;      
   }

   static void scanf_real(String id){
       main_text += "%"+reg+" = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strscanr, i64 0, i64 0), double* %"+id+")\n";
       reg++;
   }

// arithmetic operations
    static void add_i32(String val1, String val2){
      main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_real(String val1, String val2){
      main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
   }

   static void mul_i32(String val1, String val2){
      main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mul_real(String val1, String val2){
      main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }

    static void sub_i32(String val1, String val2){
      main_text += "%"+reg+" = sub i32 "+val2+", "+val1+"\n";
      reg++;
   }
 
   static void sub_real(String val1, String val2){
      main_text += "%"+reg+" = fsub double "+val2+", "+val1+"\n";
      reg++;
   }
 
   static void div_i32(String val1, String val2){
      main_text += "%"+reg+" = sdiv i32 "+val2+", "+val1+"\n";
      reg++;
   }
 
   static void div_real(String val1, String val2){
      main_text += "%"+reg+" = fdiv double "+val2+", "+val1+"\n";
      reg++;
   }

// i32 conditionals

   static void less_i32(String val1, String val2){
      main_text += "%"+reg+" = icmp slt i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void less_equal_i32(String val1, String val2){
      main_text += "%"+reg+" = icmp sle i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_i32(String val1, String val2){
      main_text += "%"+reg+" = icmp sgt i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_equal_i32(String val1, String val2){
      main_text += "%"+reg+" = icmp sge i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void equal_i32(String val1, String val2){
      main_text += "%"+reg+" = icmp eq i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void not_equal_i32(String val1, String val2){
      main_text += "%"+reg+" = icmp ne i32 "+val1+", "+val2+"\n";
      reg++;
   }

   //real conditionals

   static void less_real(String val1, String val2){
      main_text += "%"+reg+" = fcmp olt double "+val1+", "+val2+"\n";
      reg++;
   }

   static void less_equal_real(String val1, String val2){
      main_text += "%"+reg+" = fcmp ole double "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_real(String val1, String val2){
      main_text += "%"+reg+" = fcmp ogt double "+val1+", "+val2+"\n";
      reg++;
   }

   static void greater_equal_real(String val1, String val2){
      main_text += "%"+reg+" = fcmp oge double "+val1+", "+val2+"\n";
      reg++;
   }

   static void equal_real(String val1, String val2){
      main_text += "%"+reg+" = fcmp oeq double "+val1+", "+val2+"\n";
      reg++;
   }

   static void not_equal_real(String val1, String val2){
      main_text += "%"+reg+" = fcmp one double "+val1+", "+val2+"\n";
      reg++;
   }

   // boolean compare utils

   static void br_compare(String compareVal, String trueVal, String endVal){
      main_text += "br i1 "+compareVal+", label %"+trueVal+", label %"+endVal+"\n";
   }

   static void create_label(String label){
      main_text += label+":\n";
   }

   static void single_br(String label){
      main_text += "br label %"+label+"\n";
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
      text += "define i32 @main() nounwind{\n";
      text += basic_text;
      text += "ret i32 0 }\n";

      text += functions_text;
      return text;
   }
}
