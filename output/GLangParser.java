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
		NOT_EQUAL=10, GREATER=11, LESS=12, GREATER_EQUAL=13, LESS_EQUAL=14, IF_OP=15, 
		DO_OP=16, ELSE_OP=17, END_OP=18, WHILE_OP=19, FUNCTION_OP=20, ID=21, INT=22, 
		REAL=23, NEWLINE=24, ASSIGN=25, ADD=26, MULTIPLY=27, SUBTRACT=28, DIVIDE=29, 
		WS=30;
	public static final int
		RULE_program = 0, RULE_startBlock = 1, RULE_nestedBlock = 2, RULE_nestedFunctionBlock = 3, 
		RULE_defaultLine = 4, RULE_basicLine = 5, RULE_functionLine = 6, RULE_functionStat = 7, 
		RULE_functionParams = 8, RULE_functionHeader = 9, RULE_functionInit = 10, 
		RULE_semicolonStat = 11, RULE_functionCall = 12, RULE_returnStat = 13, 
		RULE_instructionStat = 14, RULE_elseBlock = 15, RULE_ifCondition = 16, 
		RULE_elseCondition = 17, RULE_condition = 18, RULE_expr = 19, RULE_value = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "startBlock", "nestedBlock", "nestedFunctionBlock", "defaultLine", 
			"basicLine", "functionLine", "functionStat", "functionParams", "functionHeader", 
			"functionInit", "semicolonStat", "functionCall", "returnStat", "instructionStat", 
			"elseBlock", "ifCondition", "elseCondition", "condition", "expr", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'('", "')'", "'return'", null, "'print'", "'read'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'if'", "'do'", "'else'", 
			"'end'", "'while'", "'function'", null, null, null, null, "'='", "'+'", 
			"'*'", "'-'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NUMTYPE", "PRINT", "READ", "EQUAL", 
			"NOT_EQUAL", "GREATER", "LESS", "GREATER_EQUAL", "LESS_EQUAL", "IF_OP", 
			"DO_OP", "ELSE_OP", "END_OP", "WHILE_OP", "FUNCTION_OP", "ID", "INT", 
			"REAL", "NEWLINE", "ASSIGN", "ADD", "MULTIPLY", "SUBTRACT", "DIVIDE", 
			"WS"
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
			setState(42);
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20480448L) != 0)) {
				{
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3703232L) != 0)) {
					{
					setState(44);
					defaultLine();
					}
				}

				setState(47);
				match(NEWLINE);
				}
				}
				setState(52);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19431872L) != 0)) {
				{
				{
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2654656L) != 0)) {
					{
					setState(53);
					basicLine();
					}
				}

				setState(56);
				match(NEWLINE);
				}
				}
				setState(61);
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
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19431872L) != 0)) {
				{
				{
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2654656L) != 0)) {
					{
					setState(62);
					functionLine();
					}
				}

				setState(65);
				match(NEWLINE);
				}
				}
				setState(70);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
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
				setState(72);
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
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_OP:
			case WHILE_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				instructionStat();
				}
				break;
			case NUMTYPE:
			case PRINT:
			case READ:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				semicolonStat();
				setState(77);
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_OP:
			case WHILE_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				instructionStat();
				}
				break;
			case NUMTYPE:
			case PRINT:
			case READ:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				semicolonStat();
				setState(83);
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
		public FunctionHeaderContext functionHeader() {
			return getRuleContext(FunctionHeaderContext.class,0);
		}
		public NestedFunctionBlockContext nestedFunctionBlock() {
			return getRuleContext(NestedFunctionBlockContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
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
			setState(87);
			match(FUNCTION_OP);
			setState(88);
			functionHeader();
			setState(89);
			nestedFunctionBlock();
			setState(90);
			returnStat();
			setState(91);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMTYPE) {
				{
				setState(93);
				match(NUMTYPE);
				setState(94);
				match(ID);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(95);
					match(T__1);
					setState(96);
					match(NUMTYPE);
					setState(97);
					match(ID);
					}
					}
					setState(102);
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
	public static class FunctionHeaderContext extends ParserRuleContext {
		public FunctionInitContext functionInit() {
			return getRuleContext(FunctionInitContext.class,0);
		}
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public TerminalNode DO_OP() { return getToken(GLangParser.DO_OP, 0); }
		public TerminalNode NEWLINE() { return getToken(GLangParser.NEWLINE, 0); }
		public FunctionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionHeader(this);
		}
	}

	public final FunctionHeaderContext functionHeader() throws RecognitionException {
		FunctionHeaderContext _localctx = new FunctionHeaderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			functionInit();
			setState(106);
			match(T__2);
			setState(107);
			functionParams();
			setState(108);
			match(T__3);
			setState(109);
			match(DO_OP);
			setState(110);
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
	public static class FunctionInitContext extends ParserRuleContext {
		public TerminalNode NUMTYPE() { return getToken(GLangParser.NUMTYPE, 0); }
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public FunctionInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterFunctionInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitFunctionInit(this);
		}
	}

	public final FunctionInitContext functionInit() throws RecognitionException {
		FunctionInitContext _localctx = new FunctionInitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NUMTYPE);
			setState(113);
			match(ID);
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
	public static class SingleCallContext extends SemicolonStatContext {
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SingleCallContext(SemicolonStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterSingleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitSingleCall(this);
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
		enterRule(_localctx, 22, RULE_semicolonStat);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(PRINT);
				setState(116);
				match(ID);
				}
				break;
			case 2:
				_localctx = new SingleCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(ID);
				setState(118);
				functionCall();
				}
				break;
			case 3:
				_localctx = new AssignNewContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(NUMTYPE);
				setState(120);
				match(ID);
				setState(121);
				match(ASSIGN);
				setState(122);
				expr();
				}
				break;
			case 4:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(ID);
				setState(124);
				match(ASSIGN);
				setState(125);
				expr();
				}
				break;
			case 5:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(NUMTYPE);
				setState(127);
				match(ID);
				}
				break;
			case 6:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(READ);
				setState(129);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 24, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__2);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
				{
				setState(133);
				expr();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(134);
					match(T__1);
					setState(135);
					expr();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
			match(T__3);
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
		public TerminalNode NEWLINE() { return getToken(GLangParser.NEWLINE, 0); }
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
		enterRule(_localctx, 26, RULE_returnStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__4);
			setState(146);
			value();
			setState(147);
			match(T__0);
			setState(148);
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
		public ElseConditionContext elseCondition() {
			return getRuleContext(ElseConditionContext.class,0);
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
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
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
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode DO_OP() { return getToken(GLangParser.DO_OP, 0); }
		public NestedBlockContext nestedBlock() {
			return getRuleContext(NestedBlockContext.class,0);
		}
		public TerminalNode ELSE_OP() { return getToken(GLangParser.ELSE_OP, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_instructionStat);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new SingleIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(IF_OP);
				setState(151);
				ifCondition();
				setState(152);
				match(DO_OP);
				setState(153);
				nestedBlock();
				setState(154);
				match(END_OP);
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(IF_OP);
				setState(157);
				ifCondition();
				setState(158);
				match(DO_OP);
				setState(159);
				nestedBlock();
				setState(160);
				match(ELSE_OP);
				setState(161);
				elseBlock();
				setState(162);
				match(END_OP);
				}
				break;
			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(WHILE_OP);
				setState(165);
				elseCondition();
				setState(166);
				match(DO_OP);
				setState(167);
				nestedBlock();
				setState(168);
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
	public static class ElseBlockContext extends ParserRuleContext {
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	 
		public ElseBlockContext() { }
		public void copyFrom(ElseBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedElseBlockContext extends ElseBlockContext {
		public NestedBlockContext nestedBlock() {
			return getRuleContext(NestedBlockContext.class,0);
		}
		public NestedElseBlockContext(ElseBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterNestedElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitNestedElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseBlock);
		try {
			_localctx = new NestedElseBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			nestedBlock();
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
	public static class IfConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			condition();
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
	public static class ElseConditionContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ElseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitElseCondition(this);
		}
	}

	public final ElseConditionContext elseCondition() throws RecognitionException {
		ElseConditionContext _localctx = new ElseConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			condition();
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
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualConditionContext extends ConditionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(GLangParser.NOT_EQUAL, 0); }
		public NotEqualConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).enterNotEqualCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLangListener ) ((GLangListener)listener).exitNotEqualCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new EqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				expr();
				setState(179);
				match(EQUAL);
				setState(180);
				expr();
				}
				break;
			case 2:
				_localctx = new GreaterConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				expr();
				setState(183);
				match(GREATER);
				setState(184);
				expr();
				}
				break;
			case 3:
				_localctx = new LessConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				expr();
				setState(187);
				match(LESS);
				setState(188);
				expr();
				}
				break;
			case 4:
				_localctx = new GreaterEqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				expr();
				setState(191);
				match(GREATER_EQUAL);
				setState(192);
				expr();
				}
				break;
			case 5:
				_localctx = new LessEqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				expr();
				setState(195);
				match(LESS_EQUAL);
				setState(196);
				expr();
				}
				break;
			case 6:
				_localctx = new NotEqualConditionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				expr();
				setState(199);
				match(NOT_EQUAL);
				setState(200);
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
		public TerminalNode ID() { return getToken(GLangParser.ID, 0); }
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
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SingleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				value();
				}
				break;
			case 2:
				_localctx = new AddExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				value();
				setState(206);
				match(ADD);
				setState(207);
				expr();
				}
				break;
			case 3:
				_localctx = new SubtractExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				value();
				setState(210);
				match(SUBTRACT);
				setState(211);
				expr();
				}
				break;
			case 4:
				_localctx = new MultiplyExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				value();
				setState(214);
				match(MULTIPLY);
				setState(215);
				expr();
				}
				break;
			case 5:
				_localctx = new DivideExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				value();
				setState(218);
				match(DIVIDE);
				setState(219);
				expr();
				}
				break;
			case 6:
				_localctx = new FunctionCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				match(ID);
				setState(222);
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
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new ValueIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(ID);
				}
				break;
			case INT:
				_localctx = new ValueINTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new ValueREALContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
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
		"\u0004\u0001\u001e\u00e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0005\u00011\b\u0001"+
		"\n\u0001\f\u00014\t\u0001\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002"+
		"\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0003\u0003\u0003"+
		"@\b\u0003\u0001\u0003\u0005\u0003C\b\u0003\n\u0003\f\u0003F\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bc\b\b\n\b\f\bf\t\b\u0003\bh\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0083\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0089\b\f\n\f\f\f\u008c\t\f\u0003\f\u008e\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ab\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00cb\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00e0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00e5\b"+
		"\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0000\u00f1"+
		"\u0000*\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004;"+
		"\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bI\u0001\u0000"+
		"\u0000\u0000\nO\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000e"+
		"W\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012i\u0001"+
		"\u0000\u0000\u0000\u0014p\u0001\u0000\u0000\u0000\u0016\u0082\u0001\u0000"+
		"\u0000\u0000\u0018\u0084\u0001\u0000\u0000\u0000\u001a\u0091\u0001\u0000"+
		"\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e\u00ac\u0001\u0000"+
		"\u0000\u0000 \u00ae\u0001\u0000\u0000\u0000\"\u00b0\u0001\u0000\u0000"+
		"\u0000$\u00ca\u0001\u0000\u0000\u0000&\u00df\u0001\u0000\u0000\u0000("+
		"\u00e4\u0001\u0000\u0000\u0000*+\u0003\u0002\u0001\u0000+\u0001\u0001"+
		"\u0000\u0000\u0000,.\u0003\b\u0004\u0000-,\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0005\u0018\u0000\u0000"+
		"0-\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000057\u0003\n\u0005\u000065\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0005\u0018\u0000\u0000"+
		"96\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>@\u0003\f\u0006\u0000?>\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0005\u0018\u0000\u0000"+
		"B?\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000GJ\u0003\u000e\u0007\u0000HJ\u0003\n\u0005\u0000IG\u0001"+
		"\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000"+
		"KP\u0003\u001c\u000e\u0000LM\u0003\u0016\u000b\u0000MN\u0005\u0001\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000"+
		"\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QV\u0003\u001c\u000e\u0000"+
		"RS\u0003\u0016\u000b\u0000ST\u0005\u0001\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000V\r\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0014\u0000\u0000XY\u0003\u0012\t\u0000YZ\u0003\u0006"+
		"\u0003\u0000Z[\u0003\u001a\r\u0000[\\\u0005\u0012\u0000\u0000\\\u000f"+
		"\u0001\u0000\u0000\u0000]^\u0005\u0006\u0000\u0000^d\u0005\u0015\u0000"+
		"\u0000_`\u0005\u0002\u0000\u0000`a\u0005\u0006\u0000\u0000ac\u0005\u0015"+
		"\u0000\u0000b_\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000g]\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0003\u0014\n\u0000jk\u0005\u0003"+
		"\u0000\u0000kl\u0003\u0010\b\u0000lm\u0005\u0004\u0000\u0000mn\u0005\u0010"+
		"\u0000\u0000no\u0005\u0018\u0000\u0000o\u0013\u0001\u0000\u0000\u0000"+
		"pq\u0005\u0006\u0000\u0000qr\u0005\u0015\u0000\u0000r\u0015\u0001\u0000"+
		"\u0000\u0000st\u0005\u0007\u0000\u0000t\u0083\u0005\u0015\u0000\u0000"+
		"uv\u0005\u0015\u0000\u0000v\u0083\u0003\u0018\f\u0000wx\u0005\u0006\u0000"+
		"\u0000xy\u0005\u0015\u0000\u0000yz\u0005\u0019\u0000\u0000z\u0083\u0003"+
		"&\u0013\u0000{|\u0005\u0015\u0000\u0000|}\u0005\u0019\u0000\u0000}\u0083"+
		"\u0003&\u0013\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\u0083\u0005\u0015"+
		"\u0000\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0083\u0005\u0015\u0000"+
		"\u0000\u0082s\u0001\u0000\u0000\u0000\u0082u\u0001\u0000\u0000\u0000\u0082"+
		"w\u0001\u0000\u0000\u0000\u0082{\u0001\u0000\u0000\u0000\u0082~\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0017\u0001"+
		"\u0000\u0000\u0000\u0084\u008d\u0005\u0003\u0000\u0000\u0085\u008a\u0003"+
		"&\u0013\u0000\u0086\u0087\u0005\u0002\u0000\u0000\u0087\u0089\u0003&\u0013"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0004\u0000"+
		"\u0000\u0090\u0019\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0005\u0000"+
		"\u0000\u0092\u0093\u0003(\u0014\u0000\u0093\u0094\u0005\u0001\u0000\u0000"+
		"\u0094\u0095\u0005\u0018\u0000\u0000\u0095\u001b\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0005\u000f\u0000\u0000\u0097\u0098\u0003 \u0010\u0000\u0098"+
		"\u0099\u0005\u0010\u0000\u0000\u0099\u009a\u0003\u0004\u0002\u0000\u009a"+
		"\u009b\u0005\u0012\u0000\u0000\u009b\u00ab\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u000f\u0000\u0000\u009d\u009e\u0003 \u0010\u0000\u009e\u009f"+
		"\u0005\u0010\u0000\u0000\u009f\u00a0\u0003\u0004\u0002\u0000\u00a0\u00a1"+
		"\u0005\u0011\u0000\u0000\u00a1\u00a2\u0003\u001e\u000f\u0000\u00a2\u00a3"+
		"\u0005\u0012\u0000\u0000\u00a3\u00ab\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0013\u0000\u0000\u00a5\u00a6\u0003\"\u0011\u0000\u00a6\u00a7\u0005"+
		"\u0010\u0000\u0000\u00a7\u00a8\u0003\u0004\u0002\u0000\u00a8\u00a9\u0005"+
		"\u0012\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u0096\u0001"+
		"\u0000\u0000\u0000\u00aa\u009c\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001"+
		"\u0000\u0000\u0000\u00ab\u001d\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003"+
		"\u0004\u0002\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae\u00af\u0003"+
		"$\u0012\u0000\u00af!\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003$\u0012"+
		"\u0000\u00b1#\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003&\u0013\u0000\u00b3"+
		"\u00b4\u0005\t\u0000\u0000\u00b4\u00b5\u0003&\u0013\u0000\u00b5\u00cb"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003&\u0013\u0000\u00b7\u00b8\u0005"+
		"\u000b\u0000\u0000\u00b8\u00b9\u0003&\u0013\u0000\u00b9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0003&\u0013\u0000\u00bb\u00bc\u0005\f\u0000"+
		"\u0000\u00bc\u00bd\u0003&\u0013\u0000\u00bd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0003&\u0013\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0"+
		"\u00c1\u0003&\u0013\u0000\u00c1\u00cb\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0003&\u0013\u0000\u00c3\u00c4\u0005\u000e\u0000\u0000\u00c4\u00c5\u0003"+
		"&\u0013\u0000\u00c5\u00cb\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003&\u0013"+
		"\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u00c9\u0003&\u0013\u0000"+
		"\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00b2\u0001\u0000\u0000\u0000"+
		"\u00ca\u00b6\u0001\u0000\u0000\u0000\u00ca\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ca\u00be\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c6\u0001\u0000\u0000\u0000\u00cb%\u0001\u0000\u0000\u0000\u00cc"+
		"\u00e0\u0003(\u0014\u0000\u00cd\u00ce\u0003(\u0014\u0000\u00ce\u00cf\u0005"+
		"\u001a\u0000\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0\u00e0\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0003(\u0014\u0000\u00d2\u00d3\u0005\u001c\u0000"+
		"\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0003(\u0014\u0000\u00d6\u00d7\u0005\u001b\u0000\u0000\u00d7"+
		"\u00d8\u0003&\u0013\u0000\u00d8\u00e0\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0003(\u0014\u0000\u00da\u00db\u0005\u001d\u0000\u0000\u00db\u00dc\u0003"+
		"&\u0013\u0000\u00dc\u00e0\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u0015"+
		"\u0000\u0000\u00de\u00e0\u0003\u0018\f\u0000\u00df\u00cc\u0001\u0000\u0000"+
		"\u0000\u00df\u00cd\u0001\u0000\u0000\u0000\u00df\u00d1\u0001\u0000\u0000"+
		"\u0000\u00df\u00d5\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\'\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e5\u0005\u0015\u0000\u0000\u00e2\u00e5\u0005\u0016\u0000\u0000"+
		"\u00e3\u00e5\u0005\u0017\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5)\u0001\u0000\u0000\u0000\u0012-26;?DIOUdg\u0082\u008a\u008d\u00aa"+
		"\u00ca\u00df\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}