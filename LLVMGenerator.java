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

   
}
