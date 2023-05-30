/*
 * This is the main class for the program.
 * It will be used to run the program.
 */
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        CharStream input = CharStreams.fromFileName(args[0]);
        GLangLexer lexer = new GLangLexer();
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GLangParsers parser = new GLangParsers(tokens);
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new LLVMActions(), tree);
    }
}
