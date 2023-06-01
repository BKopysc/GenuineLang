/*
 * This class is responsible for generating LLVM code from the AST.
 * It will be called by the main class.
 */

// enum VarType{
//     INT,
//     REAL,
//     UNKNOWN
// }

class LLVMGenerator {
    
    static String header_text = "";
    static String main_text = "";
    static int reg = 1;

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

  
 
    static String generate(){
      String text = "";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpr = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strscani = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strscanr = constant [3 x i8] c\"%d\\00\"\n";
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;
      text += "ret i32 0 }\n";
      return text;
   }
}
