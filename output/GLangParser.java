// Generated from GLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMTYPE=2, PRINT=3, READ=4, ID=5, INT=6, REAL=7, NEWLINE=8, ASSIGN=9, 
		ADD=10, MULTIPLY=11, SUBTRACT=12, DIVIDE=13, WS=14;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_semicolonStat = 2, RULE_expr = 3, 
		RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "semicolonStat", "expr", "value"
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

	@Override
	public String getGrammarFileName() { return "GLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GLangParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				line();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) );
			setState(15);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public SemicolonStatContext semicolonStat() {
			return getRuleContext(SemicolonStatContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(GLangParser.NEWLINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			semicolonStat();
			setState(18);
			match(T__0);
			setState(19);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SemicolonStatContext extends ParserRuleContext {
		public SemicolonStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolonStat; }
	 
		public SemicolonStatContext() { }
		public void copyFrom(SemicolonStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends SemicolonStatContext {
		public TerminalNode PRINT() { return getToken(GLangParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public PrintContext(SemicolonStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends SemicolonStatContext {
		public TerminalNode READ() { return getToken(GLangParser.READ, 0); }
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public ReadContext(SemicolonStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareContext extends SemicolonStatContext {
		public TerminalNode NUMTYPE() { return getToken(GLangParser.NUMTYPE, 0); }
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public DeclareContext(SemicolonStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitDeclare(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignNewContext extends SemicolonStatContext {
		public TerminalNode NUMTYPE() { return getToken(GLangParser.NUMTYPE, 0); }
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignNewContext(SemicolonStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterAssignNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitAssignNew(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends SemicolonStatContext {
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(GLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(SemicolonStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitAssign(this);
		}
	}

	public final SemicolonStatContext semicolonStat() throws RecognitionException {
		SemicolonStatContext _localctx = new SemicolonStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_semicolonStat);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(PRINT);
				setState(22);
				match(ID);
				}
				break;
			case 2:
				_localctx = new AssignNewContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(NUMTYPE);
				setState(24);
				match(ID);
				setState(25);
				match(ASSIGN);
				setState(26);
				expr();
				}
				break;
			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(ID);
				setState(28);
				match(ASSIGN);
				setState(29);
				expr();
				}
				break;
			case 4:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(NUMTYPE);
				setState(31);
				match(ID);
				}
				break;
			case 5:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(READ);
				setState(33);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public SingleExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitSingleExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ADD() { return getToken(GLangParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitAddExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractExpressionContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(GLangParser.SUBTRACT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubtractExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitSubtractExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyExpressionContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(GLangParser.MULTIPLY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MultiplyExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitMultiplyExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideExpressionContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(GLangParser.DIVIDE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DivideExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitDivideExpression(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				value();
				}
				break;
			case 2:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				value();
				setState(38);
				match(ADD);
				setState(39);
				expr();
				}
				break;
			case 3:
				_localctx = new MultiplyExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				value();
				setState(42);
				match(MULTIPLY);
				setState(43);
				expr();
				}
				break;
			case 4:
				_localctx = new SubtractExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				value();
				setState(46);
				match(SUBTRACT);
				setState(47);
				expr();
				}
				break;
			case 5:
				_localctx = new DivideExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				value();
				setState(50);
				match(DIVIDE);
				setState(51);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueIDContext extends ValueContext {
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public ValueIDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterValueID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitValueID(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueREALContext extends ValueContext {
		public TerminalNode REAL() { return getToken(GLangParser.REAL, 0); }
		public ValueREALContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterValueREAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitValueREAL(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueINTContext extends ValueContext {
		public TerminalNode INT() { return getToken(GLangParser.INT, 0); }
		public ValueINTContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterValueINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitValueINT(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ValueIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(ID);
				}
				break;
			case INT:
				_localctx = new ValueINTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new ValueREALContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(REAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e=\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"#\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00036\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		";\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0000B\u0000\u000b\u0001\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000"+
		"\u0000\u0004\"\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000"+
		"\b:\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000"+
		"\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0005\u0001\u0000\u0000"+
		"\u0013\u0014\u0005\b\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0005\u0003\u0000\u0000\u0016#\u0005\u0005\u0000\u0000\u0017\u0018"+
		"\u0005\u0002\u0000\u0000\u0018\u0019\u0005\u0005\u0000\u0000\u0019\u001a"+
		"\u0005\t\u0000\u0000\u001a#\u0003\u0006\u0003\u0000\u001b\u001c\u0005"+
		"\u0005\u0000\u0000\u001c\u001d\u0005\t\u0000\u0000\u001d#\u0003\u0006"+
		"\u0003\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f#\u0005\u0005\u0000"+
		"\u0000 !\u0005\u0004\u0000\u0000!#\u0005\u0005\u0000\u0000\"\u0015\u0001"+
		"\u0000\u0000\u0000\"\u0017\u0001\u0000\u0000\u0000\"\u001b\u0001\u0000"+
		"\u0000\u0000\"\u001e\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#\u0005\u0001\u0000\u0000\u0000$6\u0003\b\u0004\u0000%&\u0003\b\u0004"+
		"\u0000&\'\u0005\n\u0000\u0000\'(\u0003\u0006\u0003\u0000(6\u0001\u0000"+
		"\u0000\u0000)*\u0003\b\u0004\u0000*+\u0005\u000b\u0000\u0000+,\u0003\u0006"+
		"\u0003\u0000,6\u0001\u0000\u0000\u0000-.\u0003\b\u0004\u0000./\u0005\f"+
		"\u0000\u0000/0\u0003\u0006\u0003\u000006\u0001\u0000\u0000\u000012\u0003"+
		"\b\u0004\u000023\u0005\r\u0000\u000034\u0003\u0006\u0003\u000046\u0001"+
		"\u0000\u0000\u00005$\u0001\u0000\u0000\u00005%\u0001\u0000\u0000\u0000"+
		"5)\u0001\u0000\u0000\u00005-\u0001\u0000\u0000\u000051\u0001\u0000\u0000"+
		"\u00006\u0007\u0001\u0000\u0000\u00007;\u0005\u0005\u0000\u00008;\u0005"+
		"\u0006\u0000\u00009;\u0005\u0007\u0000\u0000:7\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;\t\u0001\u0000\u0000"+
		"\u0000\u0004\r\"5:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}