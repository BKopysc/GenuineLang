import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ErrorListener extends BaseErrorListener {
    public static final ErrorListener INSTANCE = new ErrorListener();

    public ErrorListener() {
        super();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorMsg = String.format("Parsing error, line %s:%s :: [%s]", line, charPositionInLine, msg);
        System.err.println(errorMsg);
        System.exit(1);
    }
}