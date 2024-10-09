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
		RULE_start = 0, RULE_section = 1, RULE_value = 2, RULE_def = 3, RULE_updt = 4, 
		RULE_exp = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "section", "value", "def", "updt", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hardware'", "':'", "'//'", "'/*'", "'*/'", "'inputs'", "'outputs'", 
			"'latches'", "'def'", "'updates'", "'siminputs'", "'='", "'('", "','", 
			"')'", "'/'", "'''", "'*'", "'+'"
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
		public SectionContext section;
		public List<SectionContext> scs = new ArrayList<SectionContext>();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4034L) != 0)) {
				{
				{
				setState(12);
				((StartContext)_localctx).section = section();
				((StartContext)_localctx).scs.add(((StartContext)_localctx).section);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitSiminputs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitUpdates(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsContext extends SectionContext {
		public DefContext def;
		public List<DefContext> d = new ArrayList<DefContext>();
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public DefinitionsContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitHardware(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		int _la;
		try {
			int _alt;
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new HardwareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				((HardwareContext)_localctx).s = match(T__0);
				setState(21);
				match(T__1);
				setState(22);
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
				setState(23);
				((InputsContext)_localctx).s = match(T__5);
				setState(24);
				match(T__1);
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(25);
					((InputsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((InputsContext)_localctx).x.add(((InputsContext)_localctx).IDENTIFIER);
					}
					}
					setState(28); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__6:
				_localctx = new OutputsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				((OutputsContext)_localctx).s = match(T__6);
				setState(31);
				match(T__1);
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					((OutputsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((OutputsContext)_localctx).x.add(((OutputsContext)_localctx).IDENTIFIER);
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__7:
				_localctx = new LatchesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				((LatchesContext)_localctx).s = match(T__7);
				setState(38);
				match(T__1);
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					((LatchesContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((LatchesContext)_localctx).x.add(((LatchesContext)_localctx).IDENTIFIER);
					}
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__8:
				_localctx = new DefinitionsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(44);
						match(T__8);
						setState(45);
						match(T__1);
						setState(46);
						((DefinitionsContext)_localctx).def = def();
						((DefinitionsContext)_localctx).d.add(((DefinitionsContext)_localctx).def);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(49); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__9:
				_localctx = new UpdatesContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				((UpdatesContext)_localctx).s = match(T__9);
				setState(52);
				match(T__1);
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					((UpdatesContext)_localctx).updt = updt();
					((UpdatesContext)_localctx).u.add(((UpdatesContext)_localctx).updt);
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				}
				break;
			case T__10:
				_localctx = new SiminputsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				((SiminputsContext)_localctx).s = match(T__10);
				setState(59);
				match(T__1);
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					((SiminputsContext)_localctx).value = value();
					((SiminputsContext)_localctx).v.add(((SiminputsContext)_localctx).value);
					}
					}
					setState(63); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			_localctx = new ValContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((ValContext)_localctx).x = match(IDENTIFIER);
			setState(68);
			match(T__11);
			setState(69);
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
	public static class DefContext extends ParserRuleContext {
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
	 
		public DefContext() { }
		public void copyFrom(DefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefineContext extends DefContext {
		public Token x;
		public Token IDENTIFIER;
		public List<Token> a = new ArrayList<Token>();
		public ExpContext e;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ccParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ccParser.IDENTIFIER, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DefineContext(DefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def);
		int _la;
		try {
			_localctx = new DefineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((DefineContext)_localctx).x = match(IDENTIFIER);
			setState(72);
			match(T__12);
			setState(73);
			((DefineContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((DefineContext)_localctx).a.add(((DefineContext)_localctx).IDENTIFIER);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(74);
				match(T__13);
				setState(75);
				((DefineContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((DefineContext)_localctx).a.add(((DefineContext)_localctx).IDENTIFIER);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__14);
			setState(82);
			match(T__11);
			setState(83);
			((DefineContext)_localctx).e = exp(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdtContext updt() throws RecognitionException {
		UpdtContext _localctx = new UpdtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_updt);
		try {
			_localctx = new UpdateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((UpdateContext)_localctx).x = match(IDENTIFIER);
			setState(86);
			match(T__11);
			setState(87);
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
		public ExpContext e2;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends ExpContext {
		public Token v;
		public ExpContext exp;
		public List<ExpContext> e = new ArrayList<ExpContext>();
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAndB(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitAndA(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PriContext extends ExpContext {
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(ccParser.IDENTIFIER, 0); }
		public PriContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).enterPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ccListener ) ((ccListener)listener).exitPri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitPri(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitNe(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ccVisitor ) return ((ccVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				((VarContext)_localctx).x = match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__12);
				setState(92);
				((ParenContext)_localctx).e = exp(0);
				setState(93);
				match(T__14);
				}
				break;
			case 3:
				{
				_localctx = new NeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(T__15);
				setState(96);
				((NeContext)_localctx).e = exp(6);
				}
				break;
			case 4:
				{
				_localctx = new PriContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				((PriContext)_localctx).x = match(IDENTIFIER);
				setState(98);
				match(T__16);
				}
				break;
			case 5:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				((FunCallContext)_localctx).v = match(IDENTIFIER);
				setState(100);
				match(T__12);
				setState(101);
				((FunCallContext)_localctx).exp = exp(0);
				((FunCallContext)_localctx).e.add(((FunCallContext)_localctx).exp);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(102);
					match(T__13);
					setState(103);
					((FunCallContext)_localctx).exp = exp(0);
					((FunCallContext)_localctx).e.add(((FunCallContext)_localctx).exp);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(121);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndAContext(new ExpContext(_parentctx, _parentState));
						((AndAContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						match(T__17);
						setState(115);
						((AndAContext)_localctx).e2 = exp(4);
						}
						break;
					case 2:
						{
						_localctx = new AndBContext(new ExpContext(_parentctx, _parentState));
						((AndBContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(117);
						((AndBContext)_localctx).e2 = exp(3);
						}
						break;
					case 3:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(118);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(119);
						match(T__18);
						setState(120);
						((OrContext)_localctx).e2 = exp(2);
						}
						break;
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		case 5:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000"+
		"\f\u0000\u0011\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001b\b\u0001"+
		"\u000b\u0001\f\u0001\u001c\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\"\b\u0001\u000b\u0001\f\u0001#\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001)\b\u0001\u000b\u0001\f\u0001*\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u00010\b\u0001\u000b\u0001\f\u00011\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u00017\b\u0001\u000b\u0001\f\u00018\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0004\u0001>\b\u0001\u000b\u0001\f\u0001?\u0003\u0001B\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003"+
		"\f\u0003P\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005i\b\u0005\n\u0005\f\u0005l\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005p\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005z\b"+
		"\u0005\n\u0005\f\u0005}\t\u0005\u0001\u0005\u0000\u0001\n\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000\u0003\u0005\u008e\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004C\u0001"+
		"\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000"+
		"\u0000\no\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f"+
		"\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0012\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0013\u0005"+
		"\u0000\u0000\u0001\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0001\u0000\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016B\b\u0000"+
		"\u0000\u0000\u0017\u0018\u0005\u0006\u0000\u0000\u0018\u001a\u0005\u0002"+
		"\u0000\u0000\u0019\u001b\u0005\u0014\u0000\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001dB\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f!\u0005\u0002\u0000\u0000"+
		" \"\u0005\u0014\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$B\u0001\u0000"+
		"\u0000\u0000%&\u0005\b\u0000\u0000&(\u0005\u0002\u0000\u0000\')\u0005"+
		"\u0014\u0000\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+B\u0001\u0000\u0000"+
		"\u0000,-\u0005\t\u0000\u0000-.\u0005\u0002\u0000\u0000.0\u0003\u0006\u0003"+
		"\u0000/,\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u00002B\u0001\u0000\u0000\u000034\u0005"+
		"\n\u0000\u000046\u0005\u0002\u0000\u000057\u0003\b\u0004\u000065\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009B\u0001\u0000\u0000\u0000:;\u0005\u000b\u0000"+
		"\u0000;=\u0005\u0002\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A\u0014\u0001\u0000\u0000"+
		"\u0000A\u0017\u0001\u0000\u0000\u0000A\u001e\u0001\u0000\u0000\u0000A"+
		"%\u0001\u0000\u0000\u0000A/\u0001\u0000\u0000\u0000A3\u0001\u0000\u0000"+
		"\u0000A:\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0014\u0000\u0000DE\u0005\f\u0000\u0000EF\u0005\u0015\u0000\u0000F\u0005"+
		"\u0001\u0000\u0000\u0000GH\u0005\u0014\u0000\u0000HI\u0005\r\u0000\u0000"+
		"IN\u0005\u0014\u0000\u0000JK\u0005\u000e\u0000\u0000KM\u0005\u0014\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QR\u0005\u000f\u0000\u0000RS\u0005\f\u0000\u0000ST\u0003"+
		"\n\u0005\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0005\u0014\u0000\u0000"+
		"VW\u0005\f\u0000\u0000WX\u0003\n\u0005\u0000X\t\u0001\u0000\u0000\u0000"+
		"YZ\u0006\u0005\uffff\uffff\u0000Zp\u0005\u0014\u0000\u0000[\\\u0005\r"+
		"\u0000\u0000\\]\u0003\n\u0005\u0000]^\u0005\u000f\u0000\u0000^p\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0010\u0000\u0000`p\u0003\n\u0005\u0006ab\u0005"+
		"\u0014\u0000\u0000bp\u0005\u0011\u0000\u0000cd\u0005\u0014\u0000\u0000"+
		"de\u0005\r\u0000\u0000ej\u0003\n\u0005\u0000fg\u0005\u000e\u0000\u0000"+
		"gi\u0003\n\u0005\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u000f\u0000\u0000np\u0001\u0000"+
		"\u0000\u0000oY\u0001\u0000\u0000\u0000o[\u0001\u0000\u0000\u0000o_\u0001"+
		"\u0000\u0000\u0000oa\u0001\u0000\u0000\u0000oc\u0001\u0000\u0000\u0000"+
		"p{\u0001\u0000\u0000\u0000qr\n\u0003\u0000\u0000rs\u0005\u0012\u0000\u0000"+
		"sz\u0003\n\u0005\u0004tu\n\u0002\u0000\u0000uz\u0003\n\u0005\u0003vw\n"+
		"\u0001\u0000\u0000wx\u0005\u0013\u0000\u0000xz\u0003\n\u0005\u0002yq\u0001"+
		"\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u000b\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000\r\u000f"+
		"\u001c#*18?ANjoy{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}