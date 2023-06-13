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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUMTYPE=6, PRINT=7, READ=8, EQUAL=9, 
		GREATER=10, LESS=11, GREATER_EQUAL=12, LESS_EQUAL=13, IF_OP=14, DO_OP=15, 
		ELSE_OP=16, END_OP=17, WHILE_OP=18, FUNCTION_OP=19, ID=20, INT=21, REAL=22, 
		NEWLINE=23, ASSIGN=24, ADD=25, MULTIPLY=26, SUBTRACT=27, DIVIDE=28, WS=29;
	public static final int
		RULE_program = 0, RULE_startBlock = 1, RULE_nestedBlock = 2, RULE_nestedFunctionBlock = 3, 
		RULE_defaultLine = 4, RULE_basicLine = 5, RULE_functionLine = 6, RULE_functionStat = 7, 
		RULE_functionParams = 8, RULE_semicolonStat = 9, RULE_functionCall = 10, 
		RULE_functionCallParams = 11, RULE_returnStat = 12, RULE_instructionStat = 13, 
		RULE_condition = 14, RULE_expr = 15, RULE_value = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "startBlock", "nestedBlock", "nestedFunctionBlock", "defaultLine", 
			"basicLine", "functionLine", "functionStat", "functionParams", "semicolonStat", 
			"functionCall", "functionCallParams", "returnStat", "instructionStat", 
			"condition", "expr", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'return'", null, "'print'", "'read'", 
			"'=='", "'>'", "'<'", "'>='", "'<='", "'if'", "'do'", "'else'", "'end'", 
			"'while'", "'function'", null, null, null, null, "'='", "'+'", "'*'", 
			"'-'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NUMTYPE", "PRINT", "READ", "EQUAL", 
			"GREATER", "LESS", "GREATER_EQUAL", "LESS_EQUAL", "IF_OP", "DO_OP", "ELSE_OP", 
			"END_OP", "WHILE_OP", "FUNCTION_OP", "ID", "INT", "REAL", "NEWLINE", 
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
		public StartBlockContext startBlock() {
			return getRuleContext(StartBlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			startBlock();
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
	public static class StartBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GLangParser.NEWLINE, i);
		}
		public List<DefaultLineContext> defaultLine() {
			return getRuleContexts(DefaultLineContext.class);
		}
		public DefaultLineContext defaultLine(int i) {
			return getRuleContext(DefaultLineContext.class,i);
		}
		public StartBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterStartBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitStartBlock(this);
		}
	}

	public final StartBlockContext startBlock() throws RecognitionException {
		StartBlockContext _localctx = new StartBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_startBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10240448L) != 0)) {
				{
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1851840L) != 0)) {
					{
					setState(36);
					defaultLine();
					}
				}

				setState(39);
				match(NEWLINE);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class NestedBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GLangParser.NEWLINE, i);
		}
		public List<BasicLineContext> basicLine() {
			return getRuleContexts(BasicLineContext.class);
		}
		public BasicLineContext basicLine(int i) {
			return getRuleContext(BasicLineContext.class,i);
		}
		public NestedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterNestedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitNestedBlock(this);
		}
	}

	public final NestedBlockContext nestedBlock() throws RecognitionException {
		NestedBlockContext _localctx = new NestedBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nestedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9716160L) != 0)) {
				{
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1327552L) != 0)) {
					{
					setState(45);
					basicLine();
					}
				}

				setState(48);
				match(NEWLINE);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class NestedFunctionBlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GLangParser.NEWLINE, i);
		}
		public List<FunctionLineContext> functionLine() {
			return getRuleContexts(FunctionLineContext.class);
		}
		public FunctionLineContext functionLine(int i) {
			return getRuleContext(FunctionLineContext.class,i);
		}
		public NestedFunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedFunctionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterNestedFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitNestedFunctionBlock(this);
		}
	}

	public final NestedFunctionBlockContext nestedFunctionBlock() throws RecognitionException {
		NestedFunctionBlockContext _localctx = new NestedFunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nestedFunctionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9716192L) != 0)) {
				{
				{
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1327584L) != 0)) {
					{
					setState(54);
					functionLine();
					}
				}

				setState(57);
				match(NEWLINE);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class DefaultLineContext extends ParserRuleContext {
		public FunctionStatContext functionStat() {
			return getRuleContext(FunctionStatContext.class,0);
		}
		public BasicLineContext basicLine() {
			return getRuleContext(BasicLineContext.class,0);
		}
		public DefaultLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterDefaultLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitDefaultLine(this);
		}
	}

	public final DefaultLineContext defaultLine() throws RecognitionException {
		DefaultLineContext _localctx = new DefaultLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defaultLine);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				functionStat();
				}
				break;
			case NUMTYPE:
			case PRINT:
			case READ:
			case IF_OP:
			case WHILE_OP:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				basicLine();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasicLineContext extends ParserRuleContext {
		public InstructionStatContext instructionStat() {
			return getRuleContext(InstructionStatContext.class,0);
		}
		public SemicolonStatContext semicolonStat() {
			return getRuleContext(SemicolonStatContext.class,0);
		}
		public BasicLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterBasicLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitBasicLine(this);
		}
	}

	public final BasicLineContext basicLine() throws RecognitionException {
		BasicLineContext _localctx = new BasicLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_basicLine);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_OP:
			case WHILE_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				instructionStat();
				}
				break;
			case NUMTYPE:
			case PRINT:
			case READ:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				semicolonStat();
				setState(69);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionLineContext extends ParserRuleContext {
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public InstructionStatContext instructionStat() {
			return getRuleContext(InstructionStatContext.class,0);
		}
		public SemicolonStatContext semicolonStat() {
			return getRuleContext(SemicolonStatContext.class,0);
		}
		public FunctionLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionLine(this);
		}
	}

	public final FunctionLineContext functionLine() throws RecognitionException {
		FunctionLineContext _localctx = new FunctionLineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionLine);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				returnStat();
				}
				break;
			case IF_OP:
			case WHILE_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				instructionStat();
				}
				break;
			case NUMTYPE:
			case PRINT:
			case READ:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				semicolonStat();
				setState(76);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStatContext extends ParserRuleContext {
		public FunctionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStat; }
	 
		public FunctionStatContext() { }
		public void copyFrom(FunctionStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends FunctionStatContext {
		public TerminalNode FUNCTION_OP() { return getToken(GLangParser.FUNCTION_OP, 0); }
		public TerminalNode NUMTYPE() { return getToken(GLangParser.NUMTYPE, 0); }
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public TerminalNode DO_OP() { return getToken(GLangParser.DO_OP, 0); }
		public NestedFunctionBlockContext nestedFunctionBlock() {
			return getRuleContext(NestedFunctionBlockContext.class,0);
		}
		public TerminalNode END_OP() { return getToken(GLangParser.END_OP, 0); }
		public FunctionDefContext(FunctionStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionDef(this);
		}
	}

	public final FunctionStatContext functionStat() throws RecognitionException {
		FunctionStatContext _localctx = new FunctionStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionStat);
		try {
			_localctx = new FunctionDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FUNCTION_OP);
			setState(81);
			match(NUMTYPE);
			setState(82);
			match(ID);
			setState(83);
			match(T__1);
			setState(84);
			functionParams();
			setState(85);
			match(T__2);
			setState(86);
			match(DO_OP);
			setState(87);
			nestedFunctionBlock();
			setState(88);
			match(END_OP);
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
	public static class FunctionParamsContext extends ParserRuleContext {
		public List<TerminalNode> NUMTYPE() { return getTokens(GLangParser.NUMTYPE); }
		public TerminalNode NUMTYPE(int i) {
			return getToken(GLangParser.NUMTYPE, i);
		}
		public List<TerminalNode> ID() { return getTokens(GLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GLangParser.ID, i);
		}
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionParams(this);
		}
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMTYPE) {
				{
				setState(90);
				match(NUMTYPE);
				setState(91);
				match(ID);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(92);
					match(T__3);
					setState(93);
					match(NUMTYPE);
					setState(94);
					match(ID);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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
	public static class CallContext extends SemicolonStatContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CallContext(SemicolonStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitCall(this);
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
		enterRule(_localctx, 18, RULE_semicolonStat);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(PRINT);
				setState(103);
				match(ID);
				}
				break;
			case 2:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				functionCall();
				}
				break;
			case 3:
				_localctx = new AssignNewContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(NUMTYPE);
				setState(106);
				match(ID);
				setState(107);
				match(ASSIGN);
				setState(108);
				expr();
				}
				break;
			case 4:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(ID);
				setState(110);
				match(ASSIGN);
				setState(111);
				expr();
				}
				break;
			case 5:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(NUMTYPE);
				setState(113);
				match(ID);
				}
				break;
			case 6:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(READ);
				setState(115);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public FunctionCallParamsContext functionCallParams() {
			return getRuleContext(FunctionCallParamsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(119);
			match(T__1);
			setState(120);
			functionCallParams();
			setState(121);
			match(T__2);
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
	public static class FunctionCallParamsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionCallParams(this);
		}
	}

	public final FunctionCallParamsContext functionCallParams() throws RecognitionException {
		FunctionCallParamsContext _localctx = new FunctionCallParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(123);
				expr();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(124);
					match(T__3);
					setState(125);
					expr();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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
	public static class ReturnStatContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitReturnStat(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__4);
			setState(134);
			value();
			setState(135);
			match(T__0);
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
	public static class InstructionStatContext extends ParserRuleContext {
		public InstructionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionStat; }
	 
		public InstructionStatContext() { }
		public void copyFrom(InstructionStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends InstructionStatContext {
		public TerminalNode WHILE_OP() { return getToken(GLangParser.WHILE_OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO_OP() { return getToken(GLangParser.DO_OP, 0); }
		public NestedBlockContext nestedBlock() {
			return getRuleContext(NestedBlockContext.class,0);
		}
		public TerminalNode END_OP() { return getToken(GLangParser.END_OP, 0); }
		public WhileContext(InstructionStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitWhile(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleIfContext extends InstructionStatContext {
		public TerminalNode IF_OP() { return getToken(GLangParser.IF_OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO_OP() { return getToken(GLangParser.DO_OP, 0); }
		public NestedBlockContext nestedBlock() {
			return getRuleContext(NestedBlockContext.class,0);
		}
		public TerminalNode END_OP() { return getToken(GLangParser.END_OP, 0); }
		public SingleIfContext(InstructionStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterSingleIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitSingleIf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends InstructionStatContext {
		public TerminalNode IF_OP() { return getToken(GLangParser.IF_OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO_OP() { return getToken(GLangParser.DO_OP, 0); }
		public List<NestedBlockContext> nestedBlock() {
			return getRuleContexts(NestedBlockContext.class);
		}
		public NestedBlockContext nestedBlock(int i) {
			return getRuleContext(NestedBlockContext.class,i);
		}
		public TerminalNode ELSE_OP() { return getToken(GLangParser.ELSE_OP, 0); }
		public TerminalNode END_OP() { return getToken(GLangParser.END_OP, 0); }
		public IfElseContext(InstructionStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitIfElse(this);
		}
	}

	public final InstructionStatContext instructionStat() throws RecognitionException {
		InstructionStatContext _localctx = new InstructionStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instructionStat);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SingleIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(IF_OP);
				setState(138);
				condition();
				setState(139);
				match(DO_OP);
				setState(140);
				nestedBlock();
				setState(141);
				match(END_OP);
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IF_OP);
				setState(144);
				condition();
				setState(145);
				match(DO_OP);
				setState(146);
				nestedBlock();
				setState(147);
				match(ELSE_OP);
				setState(148);
				nestedBlock();
				setState(149);
				match(END_OP);
				}
				break;
			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(WHILE_OP);
				setState(152);
				condition();
				setState(153);
				match(DO_OP);
				setState(154);
				nestedBlock();
				setState(155);
				match(END_OP);
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessConditionContext extends ConditionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(GLangParser.LESS, 0); }
		public LessConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterLessCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitLessCondition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualConditionContext extends ConditionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(GLangParser.EQUAL, 0); }
		public EqualConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterEqualCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitEqualCondition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualConditionContext extends ConditionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(GLangParser.GREATER_EQUAL, 0); }
		public GreaterEqualConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterGreaterEqualCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitGreaterEqualCondition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualConditionContext extends ConditionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(GLangParser.LESS_EQUAL, 0); }
		public LessEqualConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterLessEqualCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitLessEqualCondition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterConditionContext extends ConditionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(GLangParser.GREATER, 0); }
		public GreaterConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterGreaterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitGreaterCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new EqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				expr();
				setState(160);
				match(EQUAL);
				setState(161);
				expr();
				}
				break;
			case 2:
				_localctx = new GreaterConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				expr();
				setState(164);
				match(GREATER);
				setState(165);
				expr();
				}
				break;
			case 3:
				_localctx = new LessConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				expr();
				setState(168);
				match(LESS);
				setState(169);
				expr();
				}
				break;
			case 4:
				_localctx = new GreaterEqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				expr();
				setState(172);
				match(GREATER_EQUAL);
				setState(173);
				expr();
				}
				break;
			case 5:
				_localctx = new LessEqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				expr();
				setState(176);
				match(LESS_EQUAL);
				setState(177);
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
	public static class FunctionCallExpressionContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionCallExpression(this);
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
		enterRule(_localctx, 30, RULE_expr);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SingleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				value();
				}
				break;
			case 2:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				value();
				setState(183);
				match(ADD);
				setState(184);
				expr();
				}
				break;
			case 3:
				_localctx = new MultiplyExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				value();
				setState(187);
				match(MULTIPLY);
				setState(188);
				expr();
				}
				break;
			case 4:
				_localctx = new SubtractExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				value();
				setState(191);
				match(SUBTRACT);
				setState(192);
				expr();
				}
				break;
			case 5:
				_localctx = new DivideExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				value();
				setState(195);
				match(DIVIDE);
				setState(196);
				expr();
				}
				break;
			case 6:
				_localctx = new FunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				functionCall();
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
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ValueIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(ID);
				}
				break;
			case INT:
				_localctx = new ValueINTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new ValueREALContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
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
		"\u0004\u0001\u001d\u00cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0003"+
		"\u0001&\b\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001"+
		"\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0005\u00022\b\u0002\n\u0002"+
		"\f\u00025\t\u0002\u0001\u0003\u0003\u00038\b\u0003\u0001\u0003\u0005\u0003"+
		";\b\u0003\n\u0003\f\u0003>\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"B\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"H\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006O\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0003"+
		"\be\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tu\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u007f\b\u000b\n\u000b\f\u000b\u0082\t\u000b\u0003\u000b\u0084"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009e"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b4\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c8"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cd\b\u0010"+
		"\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0000\u00dd\u0000\""+
		"\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u00043\u0001\u0000"+
		"\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000"+
		"\nG\u0001\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eP\u0001\u0000"+
		"\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000"+
		"\u0014v\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000\u0000\u0018"+
		"\u0085\u0001\u0000\u0000\u0000\u001a\u009d\u0001\u0000\u0000\u0000\u001c"+
		"\u00b3\u0001\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000 \u00cc"+
		"\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#\u0001\u0001\u0000"+
		"\u0000\u0000$&\u0003\b\u0004\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0005\u0017\u0000\u0000(%\u0001"+
		"\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000-/\u0003\n\u0005\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000002\u0005\u0017\u0000\u00001.\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u00004\u0005\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000068\u0003\f\u0006\u000076\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0005\u0017\u0000\u0000:7\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?B\u0003\u000e\u0007\u0000@B\u0003\n\u0005\u0000A?\u0001\u0000"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000CH\u0003"+
		"\u001a\r\u0000DE\u0003\u0012\t\u0000EF\u0005\u0001\u0000\u0000FH\u0001"+
		"\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000"+
		"H\u000b\u0001\u0000\u0000\u0000IO\u0003\u0018\f\u0000JO\u0003\u001a\r"+
		"\u0000KL\u0003\u0012\t\u0000LM\u0005\u0001\u0000\u0000MO\u0001\u0000\u0000"+
		"\u0000NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000"+
		"\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u0013\u0000\u0000QR\u0005"+
		"\u0006\u0000\u0000RS\u0005\u0014\u0000\u0000ST\u0005\u0002\u0000\u0000"+
		"TU\u0003\u0010\b\u0000UV\u0005\u0003\u0000\u0000VW\u0005\u000f\u0000\u0000"+
		"WX\u0003\u0006\u0003\u0000XY\u0005\u0011\u0000\u0000Y\u000f\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0006\u0000\u0000[a\u0005\u0014\u0000\u0000\\]\u0005"+
		"\u0004\u0000\u0000]^\u0005\u0006\u0000\u0000^`\u0005\u0014\u0000\u0000"+
		"_\\\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000dZ\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0011"+
		"\u0001\u0000\u0000\u0000fg\u0005\u0007\u0000\u0000gu\u0005\u0014\u0000"+
		"\u0000hu\u0003\u0014\n\u0000ij\u0005\u0006\u0000\u0000jk\u0005\u0014\u0000"+
		"\u0000kl\u0005\u0018\u0000\u0000lu\u0003\u001e\u000f\u0000mn\u0005\u0014"+
		"\u0000\u0000no\u0005\u0018\u0000\u0000ou\u0003\u001e\u000f\u0000pq\u0005"+
		"\u0006\u0000\u0000qu\u0005\u0014\u0000\u0000rs\u0005\b\u0000\u0000su\u0005"+
		"\u0014\u0000\u0000tf\u0001\u0000\u0000\u0000th\u0001\u0000\u0000\u0000"+
		"ti\u0001\u0000\u0000\u0000tm\u0001\u0000\u0000\u0000tp\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000u\u0013\u0001\u0000\u0000\u0000vw\u0005"+
		"\u0014\u0000\u0000wx\u0005\u0002\u0000\u0000xy\u0003\u0016\u000b\u0000"+
		"yz\u0005\u0003\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{\u0080\u0003"+
		"\u001e\u000f\u0000|}\u0005\u0004\u0000\u0000}\u007f\u0003\u001e\u000f"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083{\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0017\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u0087\u0003"+
		" \u0010\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0019\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u008b\u0003\u001c"+
		"\u000e\u0000\u008b\u008c\u0005\u000f\u0000\u0000\u008c\u008d\u0003\u0004"+
		"\u0002\u0000\u008d\u008e\u0005\u0011\u0000\u0000\u008e\u009e\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u0003\u001c"+
		"\u000e\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u0093\u0003\u0004"+
		"\u0002\u0000\u0093\u0094\u0005\u0010\u0000\u0000\u0094\u0095\u0003\u0004"+
		"\u0002\u0000\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u009e\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u0012\u0000\u0000\u0098\u0099\u0003\u001c"+
		"\u000e\u0000\u0099\u009a\u0005\u000f\u0000\u0000\u009a\u009b\u0003\u0004"+
		"\u0002\u0000\u009b\u009c\u0005\u0011\u0000\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u0089\u0001\u0000\u0000\u0000\u009d\u008f\u0001\u0000"+
		"\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009e\u001b\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0003\u001e\u000f\u0000\u00a0\u00a1\u0005\t\u0000"+
		"\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00b4\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0003\u001e\u000f\u0000\u00a4\u00a5\u0005\n\u0000\u0000"+
		"\u00a5\u00a6\u0003\u001e\u000f\u0000\u00a6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0003\u001e\u000f\u0000\u00a8\u00a9\u0005\u000b\u0000\u0000"+
		"\u00a9\u00aa\u0003\u001e\u000f\u0000\u00aa\u00b4\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0003\u001e\u000f\u0000\u00ac\u00ad\u0005\f\u0000\u0000\u00ad"+
		"\u00ae\u0003\u001e\u000f\u0000\u00ae\u00b4\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0003\u001e\u000f\u0000\u00b0\u00b1\u0005\r\u0000\u0000\u00b1\u00b2"+
		"\u0003\u001e\u000f\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u009f"+
		"\u0001\u0000\u0000\u0000\u00b3\u00a3\u0001\u0000\u0000\u0000\u00b3\u00a7"+
		"\u0001\u0000\u0000\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00af"+
		"\u0001\u0000\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000\u00b5\u00c8"+
		"\u0003 \u0010\u0000\u00b6\u00b7\u0003 \u0010\u0000\u00b7\u00b8\u0005\u0019"+
		"\u0000\u0000\u00b8\u00b9\u0003\u001e\u000f\u0000\u00b9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0003 \u0010\u0000\u00bb\u00bc\u0005\u001a\u0000"+
		"\u0000\u00bc\u00bd\u0003\u001e\u000f\u0000\u00bd\u00c8\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0003 \u0010\u0000\u00bf\u00c0\u0005\u001b\u0000\u0000"+
		"\u00c0\u00c1\u0003\u001e\u000f\u0000\u00c1\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0003 \u0010\u0000\u00c3\u00c4\u0005\u001c\u0000\u0000\u00c4"+
		"\u00c5\u0003\u001e\u000f\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0003\u0014\n\u0000\u00c7\u00b5\u0001\u0000\u0000\u0000\u00c7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ba\u0001\u0000\u0000\u0000\u00c7\u00be"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00cd"+
		"\u0005\u0014\u0000\u0000\u00ca\u00cd\u0005\u0015\u0000\u0000\u00cb\u00cd"+
		"\u0005\u0016\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd!\u0001"+
		"\u0000\u0000\u0000\u0012%*.37<AGNadt\u0080\u0083\u009d\u00b3\u00c7\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}