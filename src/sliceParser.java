// Generated from C:/Users/Vaishak/Desktop/SER 502/Project/Phase 2\slice.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sliceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, MultiplicationOp=17, 
		AdditionOp=18, CompareInt=19, BooleanAnd=20, BooleanOR=21, CompareBool=22, 
		Bool=23, Num=24, Id=25, Emptyspace=26, Comments=27;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_noreturnOp = 2, RULE_input = 3, 
		RULE_datatype = 4, RULE_stackDec = 5, RULE_stackOp = 6, RULE_stackfunc = 7, 
		RULE_push = 8, RULE_pop = 9, RULE_empty = 10, RULE_condition = 11, RULE_ifpart = 12, 
		RULE_elsepart = 13, RULE_loop = 14, RULE_conditionCheck = 15, RULE_integerCompare = 16, 
		RULE_boolCompare = 17, RULE_assignment = 18, RULE_expr = 19, RULE_subExpr = 20, 
		RULE_term = 21, RULE_subTerm = 22, RULE_factor = 23, RULE_boolExpr = 24, 
		RULE_boolSubExpression = 25, RULE_boolTerm = 26, RULE_subBoolTerm = 27, 
		RULE_boolFactor = 28;
	public static final String[] ruleNames = {
		"program", "block", "noreturnOp", "input", "datatype", "stackDec", "stackOp", 
		"stackfunc", "push", "pop", "empty", "condition", "ifpart", "elsepart", 
		"loop", "conditionCheck", "integerCompare", "boolCompare", "assignment", 
		"expr", "subExpr", "term", "subTerm", "factor", "boolExpr", "boolSubExpression", 
		"boolTerm", "subBoolTerm", "boolFactor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'</'", "'/>'", "'giveout'", "'takein'", "'stack'", "'.push'", "'{'", 
		"'}'", "'.pop'", "'.isEmpty'", "'if'", "'else'", "'while'", "'='", "'('", 
		"')'", null, null, null, "'and'", "'or'", "'is'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "MultiplicationOp", "AdditionOp", "CompareInt", 
		"BooleanAnd", "BooleanOR", "CompareBool", "Bool", "Num", "Id", "Emptyspace", 
		"Comments"
	};
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
	public String getGrammarFileName() { return "slice.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sliceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			block();
			setState(60);
			match(T__1);
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

	public static class BlockContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<NoreturnOpContext> noreturnOp() {
			return getRuleContexts(NoreturnOpContext.class);
		}
		public NoreturnOpContext noreturnOp(int i) {
			return getRuleContext(NoreturnOpContext.class,i);
		}
		public List<StackDecContext> stackDec() {
			return getRuleContexts(StackDecContext.class);
		}
		public StackDecContext stackDec(int i) {
			return getRuleContext(StackDecContext.class,i);
		}
		public List<StackOpContext> stackOp() {
			return getRuleContexts(StackOpContext.class);
		}
		public StackOpContext stackOp(int i) {
			return getRuleContext(StackOpContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__10) | (1L << T__12) | (1L << Id))) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(62);
					assignment();
					}
					break;
				case 2:
					{
					setState(63);
					condition();
					}
					break;
				case 3:
					{
					setState(64);
					loop();
					}
					break;
				case 4:
					{
					setState(65);
					noreturnOp();
					}
					break;
				case 5:
					{
					setState(66);
					stackDec();
					}
					break;
				case 6:
					{
					setState(67);
					stackOp();
					}
					break;
				case 7:
					{
					setState(68);
					input();
					}
					break;
				}
				}
				setState(73);
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

	public static class NoreturnOpContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
		}
		public NoreturnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noreturnOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterNoreturnOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitNoreturnOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitNoreturnOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoreturnOpContext noreturnOp() throws RecognitionException {
		NoreturnOpContext _localctx = new NoreturnOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_noreturnOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(75);
				datatype();
				}
				break;
			case 2:
				{
				setState(76);
				stackOp();
				}
				break;
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(sliceParser.Num, 0); }
		public TerminalNode Bool() { return getToken(sliceParser.Bool, 0); }
		public TerminalNode Id() { return getToken(sliceParser.Id, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Num) | (1L << Id))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StackDecContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(sliceParser.Id, 0); }
		public StackDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterStackDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitStackDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitStackDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackDecContext stackDec() throws RecognitionException {
		StackDecContext _localctx = new StackDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stackDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__4);
			setState(84);
			match(Id);
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

	public static class StackOpContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(sliceParser.Id, 0); }
		public StackfuncContext stackfunc() {
			return getRuleContext(StackfuncContext.class,0);
		}
		public StackOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterStackOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitStackOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitStackOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackOpContext stackOp() throws RecognitionException {
		StackOpContext _localctx = new StackOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stackOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Id);
			setState(87);
			stackfunc();
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

	public static class StackfuncContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public StackfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterStackfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitStackfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitStackfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackfuncContext stackfunc() throws RecognitionException {
		StackfuncContext _localctx = new StackfuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stackfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(89);
				push();
				}
				break;
			case T__8:
				{
				setState(90);
				pop();
				}
				break;
			case T__9:
				{
				setState(91);
				empty();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PushContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__5);
			setState(95);
			match(T__6);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(96);
				datatype();
				}
				break;
			case 2:
				{
				setState(97);
				boolExpr();
				}
				break;
			case 3:
				{
				setState(98);
				expr();
				}
				break;
			}
			setState(101);
			match(T__7);
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

	public static class PopContext extends ParserRuleContext {
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitPop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitPop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__8);
			setState(104);
			match(T__6);
			setState(105);
			match(T__7);
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__9);
			setState(108);
			match(T__6);
			setState(109);
			match(T__7);
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

	public static class ConditionContext extends ParserRuleContext {
		public IfpartContext ifpart() {
			return getRuleContext(IfpartContext.class,0);
		}
		public ElsepartContext elsepart() {
			return getRuleContext(ElsepartContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			ifpart();
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(112);
				elsepart();
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

	public static class IfpartContext extends ParserRuleContext {
		public ConditionCheckContext conditionCheck() {
			return getRuleContext(ConditionCheckContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterIfpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitIfpart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitIfpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfpartContext ifpart() throws RecognitionException {
		IfpartContext _localctx = new IfpartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__10);
			setState(116);
			match(T__6);
			setState(117);
			conditionCheck();
			setState(118);
			match(T__7);
			setState(119);
			match(T__0);
			setState(120);
			block();
			setState(121);
			match(T__1);
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

	public static class ElsepartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterElsepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitElsepart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitElsepart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsepartContext elsepart() throws RecognitionException {
		ElsepartContext _localctx = new ElsepartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elsepart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__11);
			setState(124);
			match(T__0);
			setState(125);
			block();
			setState(126);
			match(T__1);
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

	public static class LoopContext extends ParserRuleContext {
		public ConditionCheckContext conditionCheck() {
			return getRuleContext(ConditionCheckContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__12);
			setState(129);
			match(T__6);
			setState(130);
			conditionCheck();
			setState(131);
			match(T__7);
			setState(132);
			match(T__0);
			setState(133);
			block();
			setState(134);
			match(T__1);
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

	public static class ConditionCheckContext extends ParserRuleContext {
		public BoolCompareContext boolCompare() {
			return getRuleContext(BoolCompareContext.class,0);
		}
		public IntegerCompareContext integerCompare() {
			return getRuleContext(IntegerCompareContext.class,0);
		}
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
		}
		public TerminalNode CompareInt() { return getToken(sliceParser.CompareInt, 0); }
		public TerminalNode Num() { return getToken(sliceParser.Num, 0); }
		public ConditionCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterConditionCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitConditionCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitConditionCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionCheckContext conditionCheck() throws RecognitionException {
		ConditionCheckContext _localctx = new ConditionCheckContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditionCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(136);
				boolCompare();
				}
				break;
			case 2:
				{
				setState(137);
				integerCompare();
				}
				break;
			case 3:
				{
				setState(138);
				stackOp();
				setState(139);
				match(CompareInt);
				setState(140);
				match(Num);
				}
				break;
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

	public static class IntegerCompareContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CompareInt() { return getToken(sliceParser.CompareInt, 0); }
		public IntegerCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterIntegerCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitIntegerCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitIntegerCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerCompareContext integerCompare() throws RecognitionException {
		IntegerCompareContext _localctx = new IntegerCompareContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_integerCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expr();
			setState(145);
			match(CompareInt);
			setState(146);
			expr();
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

	public static class BoolCompareContext extends ParserRuleContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode CompareBool() { return getToken(sliceParser.CompareBool, 0); }
		public BoolCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterBoolCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitBoolCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitBoolCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolCompareContext boolCompare() throws RecognitionException {
		BoolCompareContext _localctx = new BoolCompareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			boolExpr();
			setState(149);
			match(CompareBool);
			setState(150);
			boolExpr();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(sliceParser.Id, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Id);
			setState(153);
			match(T__13);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(154);
				input();
				}
				break;
			case 2:
				{
				setState(155);
				expr();
				}
				break;
			case 3:
				{
				setState(156);
				boolExpr();
				}
				break;
			case 4:
				{
				setState(157);
				stackOp();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<SubExprContext> subExpr() {
			return getRuleContexts(SubExprContext.class);
		}
		public SubExprContext subExpr(int i) {
			return getRuleContext(SubExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(160);
			term();
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AdditionOp) {
				{
				{
				setState(161);
				subExpr();
				}
				}
				setState(166);
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

	public static class SubExprContext extends ParserRuleContext {
		public TerminalNode AdditionOp() { return getToken(sliceParser.AdditionOp, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExprContext subExpr() throws RecognitionException {
		SubExprContext _localctx = new SubExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_subExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(AdditionOp);
			setState(168);
			term();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<SubTermContext> subTerm() {
			return getRuleContexts(SubTermContext.class);
		}
		public SubTermContext subTerm(int i) {
			return getRuleContext(SubTermContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			factor();
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MultiplicationOp) {
				{
				{
				setState(171);
				subTerm();
				}
				}
				setState(176);
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

	public static class SubTermContext extends ParserRuleContext {
		public TerminalNode MultiplicationOp() { return getToken(sliceParser.MultiplicationOp, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SubTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterSubTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitSubTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitSubTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubTermContext subTerm() throws RecognitionException {
		SubTermContext _localctx = new SubTermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MultiplicationOp);
			setState(178);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(sliceParser.Id, 0); }
		public TerminalNode Num() { return getToken(sliceParser.Num, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(180);
				match(Id);
				}
				break;
			case Num:
				{
				setState(181);
				match(Num);
				}
				break;
			case T__6:
				{
				setState(182);
				match(T__6);
				setState(183);
				expr();
				setState(184);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BoolExprContext extends ParserRuleContext {
		public BoolTermContext boolTerm() {
			return getRuleContext(BoolTermContext.class,0);
		}
		public List<BoolSubExpressionContext> boolSubExpression() {
			return getRuleContexts(BoolSubExpressionContext.class);
		}
		public BoolSubExpressionContext boolSubExpression(int i) {
			return getRuleContext(BoolSubExpressionContext.class,i);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(188);
			boolTerm();
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BooleanOR) {
				{
				{
				setState(189);
				boolSubExpression();
				}
				}
				setState(194);
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

	public static class BoolSubExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanOR() { return getToken(sliceParser.BooleanOR, 0); }
		public BoolTermContext boolTerm() {
			return getRuleContext(BoolTermContext.class,0);
		}
		public BoolSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterBoolSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitBoolSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitBoolSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolSubExpressionContext boolSubExpression() throws RecognitionException {
		BoolSubExpressionContext _localctx = new BoolSubExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boolSubExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(BooleanOR);
			setState(196);
			boolTerm();
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

	public static class BoolTermContext extends ParserRuleContext {
		public BoolFactorContext boolFactor() {
			return getRuleContext(BoolFactorContext.class,0);
		}
		public List<SubBoolTermContext> subBoolTerm() {
			return getRuleContexts(SubBoolTermContext.class);
		}
		public SubBoolTermContext subBoolTerm(int i) {
			return getRuleContext(SubBoolTermContext.class,i);
		}
		public BoolTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterBoolTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitBoolTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitBoolTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolTermContext boolTerm() throws RecognitionException {
		BoolTermContext _localctx = new BoolTermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_boolTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(198);
			boolFactor();
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BooleanAnd) {
				{
				{
				setState(199);
				subBoolTerm();
				}
				}
				setState(204);
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

	public static class SubBoolTermContext extends ParserRuleContext {
		public TerminalNode BooleanAnd() { return getToken(sliceParser.BooleanAnd, 0); }
		public BoolFactorContext boolFactor() {
			return getRuleContext(BoolFactorContext.class,0);
		}
		public SubBoolTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subBoolTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterSubBoolTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitSubBoolTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitSubBoolTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubBoolTermContext subBoolTerm() throws RecognitionException {
		SubBoolTermContext _localctx = new SubBoolTermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_subBoolTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(BooleanAnd);
			setState(206);
			boolFactor();
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

	public static class BoolFactorContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(sliceParser.Id, 0); }
		public TerminalNode Bool() { return getToken(sliceParser.Bool, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).enterBoolFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sliceListener ) ((sliceListener)listener).exitBoolFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sliceVisitor ) return ((sliceVisitor<? extends T>)visitor).visitBoolFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolFactorContext boolFactor() throws RecognitionException {
		BoolFactorContext _localctx = new BoolFactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_boolFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(208);
				match(Id);
				}
				break;
			case Bool:
				{
				setState(209);
				match(Bool);
				}
				break;
			case T__14:
				{
				setState(210);
				match(T__14);
				setState(211);
				boolExpr();
				setState(212);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\4\3\4\3\4\5\4P\n\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t_\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\nf\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\5\rt\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0091\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00a1\n\24\3\25\3\25\7\25\u00a5\n\25\f"+
		"\25\16\25\u00a8\13\25\3\26\3\26\3\26\3\27\3\27\7\27\u00af\n\27\f\27\16"+
		"\27\u00b2\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00bd"+
		"\n\31\3\32\3\32\7\32\u00c1\n\32\f\32\16\32\u00c4\13\32\3\33\3\33\3\33"+
		"\3\34\3\34\7\34\u00cb\n\34\f\34\16\34\u00ce\13\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u00d9\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\3\2\31\33\2\u00d7\2<"+
		"\3\2\2\2\4I\3\2\2\2\6L\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16X\3"+
		"\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24i\3\2\2\2\26m\3\2\2\2\30q\3\2\2\2\32"+
		"u\3\2\2\2\34}\3\2\2\2\36\u0082\3\2\2\2 \u0090\3\2\2\2\"\u0092\3\2\2\2"+
		"$\u0096\3\2\2\2&\u009a\3\2\2\2(\u00a2\3\2\2\2*\u00a9\3\2\2\2,\u00ac\3"+
		"\2\2\2.\u00b3\3\2\2\2\60\u00bc\3\2\2\2\62\u00be\3\2\2\2\64\u00c5\3\2\2"+
		"\2\66\u00c8\3\2\2\28\u00cf\3\2\2\2:\u00d8\3\2\2\2<=\7\3\2\2=>\5\4\3\2"+
		">?\7\4\2\2?\3\3\2\2\2@H\5&\24\2AH\5\30\r\2BH\5\36\20\2CH\5\6\4\2DH\5\f"+
		"\7\2EH\5\16\b\2FH\5\b\5\2G@\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3"+
		"\2\2\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KI"+
		"\3\2\2\2LO\7\5\2\2MP\5\n\6\2NP\5\16\b\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2"+
		"QR\7\6\2\2R\t\3\2\2\2ST\t\2\2\2T\13\3\2\2\2UV\7\7\2\2VW\7\33\2\2W\r\3"+
		"\2\2\2XY\7\33\2\2YZ\5\20\t\2Z\17\3\2\2\2[_\5\22\n\2\\_\5\24\13\2]_\5\26"+
		"\f\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\21\3\2\2\2`a\7\b\2\2ae\7\t\2\2bf"+
		"\5\n\6\2cf\5\62\32\2df\5(\25\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2"+
		"gh\7\n\2\2h\23\3\2\2\2ij\7\13\2\2jk\7\t\2\2kl\7\n\2\2l\25\3\2\2\2mn\7"+
		"\f\2\2no\7\t\2\2op\7\n\2\2p\27\3\2\2\2qs\5\32\16\2rt\5\34\17\2sr\3\2\2"+
		"\2st\3\2\2\2t\31\3\2\2\2uv\7\r\2\2vw\7\t\2\2wx\5 \21\2xy\7\n\2\2yz\7\3"+
		"\2\2z{\5\4\3\2{|\7\4\2\2|\33\3\2\2\2}~\7\16\2\2~\177\7\3\2\2\177\u0080"+
		"\5\4\3\2\u0080\u0081\7\4\2\2\u0081\35\3\2\2\2\u0082\u0083\7\17\2\2\u0083"+
		"\u0084\7\t\2\2\u0084\u0085\5 \21\2\u0085\u0086\7\n\2\2\u0086\u0087\7\3"+
		"\2\2\u0087\u0088\5\4\3\2\u0088\u0089\7\4\2\2\u0089\37\3\2\2\2\u008a\u0091"+
		"\5$\23\2\u008b\u0091\5\"\22\2\u008c\u008d\5\16\b\2\u008d\u008e\7\25\2"+
		"\2\u008e\u008f\7\32\2\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091!\3\2\2\2\u0092\u0093\5(\25\2"+
		"\u0093\u0094\7\25\2\2\u0094\u0095\5(\25\2\u0095#\3\2\2\2\u0096\u0097\5"+
		"\62\32\2\u0097\u0098\7\30\2\2\u0098\u0099\5\62\32\2\u0099%\3\2\2\2\u009a"+
		"\u009b\7\33\2\2\u009b\u00a0\7\20\2\2\u009c\u00a1\5\b\5\2\u009d\u00a1\5"+
		"(\25\2\u009e\u00a1\5\62\32\2\u009f\u00a1\5\16\b\2\u00a0\u009c\3\2\2\2"+
		"\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\'\3"+
		"\2\2\2\u00a2\u00a6\5,\27\2\u00a3\u00a5\5*\26\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7)\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\5,\27\2\u00ab+\3"+
		"\2\2\2\u00ac\u00b0\5\60\31\2\u00ad\u00af\5.\30\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1-\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\23\2\2\u00b4\u00b5\5\60\31\2\u00b5"+
		"/\3\2\2\2\u00b6\u00bd\7\33\2\2\u00b7\u00bd\7\32\2\2\u00b8\u00b9\7\t\2"+
		"\2\u00b9\u00ba\5(\25\2\u00ba\u00bb\7\n\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b6"+
		"\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\61\3\2\2\2\u00be"+
		"\u00c2\5\66\34\2\u00bf\u00c1\5\64\33\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\63\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\5\66\34\2\u00c7\65\3\2"+
		"\2\2\u00c8\u00cc\5:\36\2\u00c9\u00cb\58\35\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\67\3\2\2"+
		"\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1\5:\36\2\u00d1"+
		"9\3\2\2\2\u00d2\u00d9\7\33\2\2\u00d3\u00d9\7\31\2\2\u00d4\u00d5\7\21\2"+
		"\2\u00d5\u00d6\5\62\32\2\u00d6\u00d7\7\22\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9;\3\2\2\2"+
		"\20GIO^es\u0090\u00a0\u00a6\u00b0\u00bc\u00c2\u00cc\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}