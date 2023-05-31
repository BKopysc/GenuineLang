// Generated from GLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMTYPE=2, PRINT=3, READ=4, ID=5, INT=6, REAL=7, NEWLINE=8, ASSIGN=9, 
		ADD=10, MULTIPLY=11, SUBTRACT=12, DIVIDE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUMTYPE", "PRINT", "READ", "ID", "INT", "REAL", "NEWLINE", "ASSIGN", 
			"ADD", "MULTIPLY", "SUBTRACT", "DIVIDE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, "'print'", "'read'", null, null, null, null, "'='", 
			"'+'", "'*'", "'-'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMTYPE", "PRINT", "READ", "ID", "INT", "REAL", "NEWLINE", 
			"ASSIGN", "ADD", "MULTIPLY", "SUBTRACT", "DIVIDE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e^\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u00045\b\u0004\u000b\u0004\f\u0004"+
		"6\u0001\u0005\u0004\u0005:\b\u0005\u000b\u0005\f\u0005;\u0001\u0006\u0004"+
		"\u0006?\b\u0006\u000b\u0006\f\u0006@\u0001\u0006\u0001\u0006\u0004\u0006"+
		"E\b\u0006\u000b\u0006\f\u0006F\u0001\u0007\u0003\u0007J\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rY\b\r\u000b\r\f\rZ\u0001"+
		"\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\f\r  d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000"+
		"\u0000\u0005(\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t"+
		"4\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000"+
		"\u0013O\u0001\u0000\u0000\u0000\u0015Q\u0001\u0000\u0000\u0000\u0017S"+
		"\u0001\u0000\u0000\u0000\u0019U\u0001\u0000\u0000\u0000\u001bX\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005;\u0000\u0000\u001e\u0002\u0001\u0000\u0000"+
		"\u0000\u001f \u0005i\u0000\u0000 !\u0005n\u0000\u0000!\'\u0005t\u0000"+
		"\u0000\"#\u0005r\u0000\u0000#$\u0005e\u0000\u0000$%\u0005a\u0000\u0000"+
		"%\'\u0005l\u0000\u0000&\u001f\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000"+
		"\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005p\u0000\u0000)*\u0005r\u0000"+
		"\u0000*+\u0005i\u0000\u0000+,\u0005n\u0000\u0000,-\u0005t\u0000\u0000"+
		"-\u0006\u0001\u0000\u0000\u0000./\u0005r\u0000\u0000/0\u0005e\u0000\u0000"+
		"01\u0005a\u0000\u000012\u0005d\u0000\u00002\b\u0001\u0000\u0000\u0000"+
		"35\u0007\u0000\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\n\u0001\u0000"+
		"\u0000\u00008:\u000209\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\f\u0001\u0000"+
		"\u0000\u0000=?\u0007\u0001\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BD\u0005.\u0000\u0000CE\u0007\u0001\u0000\u0000"+
		"DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HJ\u0005"+
		"\r\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KL\u0005\n\u0000\u0000L\u0010\u0001\u0000\u0000\u0000"+
		"MN\u0005=\u0000\u0000N\u0012\u0001\u0000\u0000\u0000OP\u0005+\u0000\u0000"+
		"P\u0014\u0001\u0000\u0000\u0000QR\u0005*\u0000\u0000R\u0016\u0001\u0000"+
		"\u0000\u0000ST\u0005-\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005"+
		"/\u0000\u0000V\u001a\u0001\u0000\u0000\u0000WY\u0007\u0002\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0006\r"+
		"\u0000\u0000]\u001c\u0001\u0000\u0000\u0000\b\u0000&6;@FIZ\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}