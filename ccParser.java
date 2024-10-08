// Generated from cc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, IDENTIFIER=20, VALUE=21, LN_COMMENT=22, BLK_COMMENT=23, 
		WHITESPACE=24, ANYTHING=25;
	public static final int
		RULE_start = 0, RULE_section = 1, RULE_value = 2, RULE_updt = 3, RULE_args = 4, 
		RULE_exps = 5, RULE_exp = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "section", "value", "updt", "args", "exps", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hardware'", "':'", "'//'", "'/*'", "'*/'", "'inputs'", "'outputs'", 
			"'latches'", "'def'", "'('", "')'", "'='", "'updates'", "'siminputs'", 
			"','", "'/'", "'''", "'*'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IDENTIFIER", "VALUE", 
			"LN_COMMENT", "BLK_COMMENT", "WHITESPACE", "ANYTHING"
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
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ccParser.EOF, 0); }
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25538L) != 0)) {
				{
				{
				setState(14);
				section();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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
	public static class SectionContext extends ParserRuleContext {
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	 
		public SectionContext() { }
		public void copyFrom(SectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LatchesContext extends SectionContext {
		public Token s;
		public Token IDENTIFIER;
		public List<Token> x = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public LatchesContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitLatches(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SiminputsContext extends SectionContext {
		public Token s;
		public ValueContext value;
		public List<ValueContext> v = new ArrayList<ValueContext>();
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public SiminputsContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterSiminputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitSiminputs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefContext extends SectionContext {
		public Token s;
		public Token x;
		public ArgsContext a;
		public ExpContext e;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitDef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdatesContext extends SectionContext {
		public Token s;
		public UpdtContext updt;
		public List<UpdtContext> u = new ArrayList<UpdtContext>();
		public List<UpdtContext> updt() {
			return getRuleContexts(UpdtContext.class);
		}
		public UpdtContext updt(int i) {
			return getRuleContext(UpdtContext.class,i);
		}
		public UpdatesContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdates(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputsContext extends SectionContext {
		public Token s;
		public Token IDENTIFIER;
		public List<Token> x = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public OutputsContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOutputs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HardwareContext extends SectionContext {
		public Token s;
		public Token t;
		public HardwareContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterHardware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitHardware(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputsContext extends SectionContext {
		public Token s;
		public Token IDENTIFIER;
		public List<Token> x = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public InputsContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitInputs(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new HardwareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				((HardwareContext)_localctx).s = match(T__0);
				setState(23);
				match(T__1);
				setState(24);
				((HardwareContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
					((HardwareContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__5:
				_localctx = new InputsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				((InputsContext)_localctx).s = match(T__5);
				setState(26);
				match(T__1);
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(27);
					((InputsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((InputsContext)_localctx).x.add(((InputsContext)_localctx).IDENTIFIER);
					}
					}
					setState(30); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__6:
				_localctx = new OutputsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				((OutputsContext)_localctx).s = match(T__6);
				setState(33);
				match(T__1);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					((OutputsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((OutputsContext)_localctx).x.add(((OutputsContext)_localctx).IDENTIFIER);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__7:
				_localctx = new LatchesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				((LatchesContext)_localctx).s = match(T__7);
				setState(40);
				match(T__1);
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(41);
					((LatchesContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((LatchesContext)_localctx).x.add(((LatchesContext)_localctx).IDENTIFIER);
					}
					}
					setState(44); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__8:
				_localctx = new DefContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				((DefContext)_localctx).s = match(T__8);
				setState(47);
				match(T__1);
				setState(48);
				((DefContext)_localctx).x = match(IDENTIFIER);
				setState(49);
				match(T__9);
				setState(50);
				((DefContext)_localctx).a = args(0);
				setState(51);
				match(T__10);
				setState(52);
				match(T__11);
				setState(53);
				((DefContext)_localctx).e = exp(0);
				}
				break;
			case T__12:
				_localctx = new UpdatesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				((UpdatesContext)_localctx).s = match(T__12);
				setState(56);
				match(T__1);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57);
					((UpdatesContext)_localctx).updt = updt();
					((UpdatesContext)_localctx).u.add(((UpdatesContext)_localctx).updt);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__13:
				_localctx = new SiminputsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				((SiminputsContext)_localctx).s = match(T__13);
				setState(63);
				match(T__1);
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					((SiminputsContext)_localctx).value = value();
					((SiminputsContext)_localctx).v.add(((SiminputsContext)_localctx).value);
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
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
	public static class ValContext extends ValueContext {
		public Token x;
		public Token v;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public TerminalNode VALUE() { return getToken(ccParser.VALUE, 0); }
		public ValContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitVal(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			_localctx = new ValContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((ValContext)_localctx).x = match(IDENTIFIER);
			setState(72);
			match(T__11);
			setState(73);
			((ValContext)_localctx).v = match(VALUE);
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
	public static class UpdtContext extends ParserRuleContext {
		public UpdtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updt; }
	 
		public UpdtContext() { }
		public void copyFrom(UpdtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends UpdtContext {
		public Token x;
		public ExpContext e;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UpdateContext(UpdtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitUpdate(this);
		}
	}

	public final UpdtContext updt() throws RecognitionException {
		UpdtContext _localctx = new UpdtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_updt);
		try {
			_localctx = new UpdateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((UpdateContext)_localctx).x = match(IDENTIFIER);
			setState(76);
			match(T__11);
			setState(77);
			((UpdateContext)_localctx).e = exp(0);
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
	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgMultiContext extends ArgsContext {
		public ArgsContext a;
		public ArgsContext b;
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public ArgMultiContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterArgMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitArgMulti(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgUniContext extends ArgsContext {
		public Token a;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public ArgUniContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterArgUni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitArgUni(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgUniContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(80);
			((ArgUniContext)_localctx).a = match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgMultiContext(new ArgsContext(_parentctx, _parentState));
					((ArgMultiContext)_localctx).a = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					match(T__14);
					setState(84);
					((ArgMultiContext)_localctx).b = args(2);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpsContext extends ParserRuleContext {
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	 
		public ExpsContext() { }
		public void copyFrom(ExpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExMultiContext extends ExpsContext {
		public ExpContext e1;
		public ExpsContext e2;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public ExMultiContext(ExpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterExMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitExMulti(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExUniContext extends ExpsContext {
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExUniContext(ExpsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterExUni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitExUni(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exps);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExUniContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((ExUniContext)_localctx).e = exp(0);
				}
				break;
			case 2:
				_localctx = new ExMultiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((ExMultiContext)_localctx).e1 = exp(0);
				setState(92);
				match(T__14);
				setState(93);
				((ExMultiContext)_localctx).e2 = exps();
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ExpContext {
		public Token v;
		public ExpsContext e;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public FunCallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitFunCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndBContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndBContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAndB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAndB(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndAContext extends ExpContext {
		public ExpContext e1;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndAContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterAndA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitAndA(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExpContext {
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public VarContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitVar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PriContext extends ExpContext {
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PriContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitPri(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeContext extends ExpContext {
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NeContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterNe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitNe(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExpContext {
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitParen(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				((VarContext)_localctx).x = match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(T__9);
				setState(100);
				((ParenContext)_localctx).e = exp(0);
				setState(101);
				match(T__10);
				}
				break;
			case 3:
				{
				_localctx = new NeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(T__15);
				setState(104);
				((NeContext)_localctx).e = exp(6);
				}
				break;
			case 4:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((FunCallContext)_localctx).v = match(IDENTIFIER);
				setState(106);
				match(T__9);
				setState(107);
				((FunCallContext)_localctx).e = exps();
				setState(108);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AndAContext(new ExpContext(_parentctx, _parentState));
						((AndAContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						match(T__17);
						setState(114);
						((AndAContext)_localctx).e2 = exp(4);
						}
						break;
					case 2:
						{
						_localctx = new AndBContext(new ExpContext(_parentctx, _parentState));
						((AndBContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						((AndBContext)_localctx).e2 = exp(3);
						}
						break;
					case 3:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(118);
						match(T__18);
						setState(119);
						((OrContext)_localctx).e = exp(2);
						}
						break;
					case 4:
						{
						_localctx = new PriContext(new ExpContext(_parentctx, _parentState));
						((PriContext)_localctx).e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						match(T__16);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 6:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u0080\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000"+
		"\u0010\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u001d\b\u0001\u000b\u0001\f\u0001\u001e\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001$\b\u0001\u000b\u0001\f\u0001%\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001+\b\u0001\u000b\u0001\f\u0001,\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		";\b\u0001\u000b\u0001\f\u0001<\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001B\b\u0001\u000b\u0001\f\u0001C\u0003\u0001F\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004Y\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005`\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006~\t\u0006\u0001\u0006"+
		"\u0000\u0002\b\f\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001"+
		"\u0000\u0003\u0005\u008d\u0000\u0011\u0001\u0000\u0000\u0000\u0002E\u0001"+
		"\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000"+
		"\u0000\bO\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fn\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001"+
		"\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u0017\u0005"+
		"\u0001\u0000\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018F\b\u0000"+
		"\u0000\u0000\u0019\u001a\u0005\u0006\u0000\u0000\u001a\u001c\u0005\u0002"+
		"\u0000\u0000\u001b\u001d\u0005\u0014\u0000\u0000\u001c\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001fF\u0001\u0000\u0000"+
		"\u0000 !\u0005\u0007\u0000\u0000!#\u0005\u0002\u0000\u0000\"$\u0005\u0014"+
		"\u0000\u0000#\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&F\u0001\u0000\u0000\u0000"+
		"\'(\u0005\b\u0000\u0000(*\u0005\u0002\u0000\u0000)+\u0005\u0014\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-F\u0001\u0000\u0000\u0000./\u0005"+
		"\t\u0000\u0000/0\u0005\u0002\u0000\u000001\u0005\u0014\u0000\u000012\u0005"+
		"\n\u0000\u000023\u0003\b\u0004\u000034\u0005\u000b\u0000\u000045\u0005"+
		"\f\u0000\u000056\u0003\f\u0006\u00006F\u0001\u0000\u0000\u000078\u0005"+
		"\r\u0000\u00008:\u0005\u0002\u0000\u00009;\u0003\u0006\u0003\u0000:9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=F\u0001\u0000\u0000\u0000>?\u0005\u000e\u0000"+
		"\u0000?A\u0005\u0002\u0000\u0000@B\u0003\u0004\u0002\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000E\u0016\u0001\u0000\u0000"+
		"\u0000E\u0019\u0001\u0000\u0000\u0000E \u0001\u0000\u0000\u0000E\'\u0001"+
		"\u0000\u0000\u0000E.\u0001\u0000\u0000\u0000E7\u0001\u0000\u0000\u0000"+
		"E>\u0001\u0000\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GH\u0005\u0014"+
		"\u0000\u0000HI\u0005\f\u0000\u0000IJ\u0005\u0015\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KL\u0005\u0014\u0000\u0000LM\u0005\f\u0000\u0000MN\u0003"+
		"\f\u0006\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0006\u0004\uffff\uffff"+
		"\u0000PQ\u0005\u0014\u0000\u0000QW\u0001\u0000\u0000\u0000RS\n\u0001\u0000"+
		"\u0000ST\u0005\u000f\u0000\u0000TV\u0003\b\u0004\u0002UR\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X\t\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z`\u0003"+
		"\f\u0006\u0000[\\\u0003\f\u0006\u0000\\]\u0005\u000f\u0000\u0000]^\u0003"+
		"\n\u0005\u0000^`\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000_[\u0001"+
		"\u0000\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0006\u0006\uffff"+
		"\uffff\u0000bo\u0005\u0014\u0000\u0000cd\u0005\n\u0000\u0000de\u0003\f"+
		"\u0006\u0000ef\u0005\u000b\u0000\u0000fo\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0010\u0000\u0000ho\u0003\f\u0006\u0006ij\u0005\u0014\u0000\u0000jk\u0005"+
		"\n\u0000\u0000kl\u0003\n\u0005\u0000lm\u0005\u000b\u0000\u0000mo\u0001"+
		"\u0000\u0000\u0000na\u0001\u0000\u0000\u0000nc\u0001\u0000\u0000\u0000"+
		"ng\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000o|\u0001\u0000\u0000"+
		"\u0000pq\n\u0003\u0000\u0000qr\u0005\u0012\u0000\u0000r{\u0003\f\u0006"+
		"\u0004st\n\u0002\u0000\u0000t{\u0003\f\u0006\u0003uv\n\u0001\u0000\u0000"+
		"vw\u0005\u0013\u0000\u0000w{\u0003\f\u0006\u0002xy\n\u0005\u0000\u0000"+
		"y{\u0005\u0011\u0000\u0000zp\u0001\u0000\u0000\u0000zs\u0001\u0000\u0000"+
		"\u0000zu\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\r\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\f\u0011\u001e%,<CEW_nz|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}