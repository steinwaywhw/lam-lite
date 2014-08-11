// Generated from C:\Users\IBM_ADMIN\Documents\GitHub\lam-lite\src\main\java\com\hwwu\lamlite\parser\LamLite.g4 by ANTLR 4.3
package com.hwwu.lamlite.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LamLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MODIFIER=1, K_THIS=2, K_REQUIRE=3, K_MODULE=4, K_PUBLIC=5, K_AS=6, K_LAM=7, 
		K_FUN=8, K_VAL=9, K_IF=10, K_THEN=11, K_ELSE=12, K_LET=13, K_IN=14, K_END=15, 
		K_WHERE=16, K_CASE=17, K_OF=18, IDENTIFIER=19, VOID_LITERAL=20, NULL_LITERAL=21, 
		BOOLEAN_LITERAL=22, INTEGER_LITERAL=23, STRING_LITERAL=24, LPAREN=25, 
		RPAREN=26, LBRACE=27, RBRACE=28, LBRACK=29, RBRACK=30, SEMI=31, COMMA=32, 
		DOT=33, EQ=34, GT=35, LT=36, BANG=37, TILDE=38, QUESTION=39, COLON=40, 
		EQEQ=41, LE=42, GE=43, NOTEQUAL=44, AND=45, OR=46, INC=47, DEC=48, ADD=49, 
		SUB=50, MUL=51, DIV=52, BITAND=53, BITOR=54, CARET=55, MOD=56, ARROW=57, 
		BIGARROW=58, COLONCOLON=59, DOLLAR=60, UNDERSCORE=61, COMMENT_DOC=62, 
		COMMENT_BLOCK=63, COMMENT_LINE=64, REST_COMMENT=65, WS=66, LETTER=67;
	public static final String[] tokenNames = {
		"<INVALID>", "MODIFIER", "'this'", "'require'", "'module'", "'public'", 
		"'as'", "'lam'", "'fun'", "'val'", "'if'", "'then'", "'else'", "'let'", 
		"'in'", "'end'", "'where'", "'case'", "'of'", "IDENTIFIER", "VOID_LITERAL", 
		"'null'", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "STRING_LITERAL", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", 
		"'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'->'", "'=>'", "'::'", "'$'", "'_'", "COMMENT_DOC", "COMMENT_BLOCK", 
		"COMMENT_LINE", "REST_COMMENT", "WS", "LETTER"
	};
	public static final int
		RULE_program = 0, RULE_module = 1, RULE_docstr = 2, RULE_require = 3, 
		RULE_binding = 4, RULE_expression = 5, RULE_exp_id = 6, RULE_exp_ite = 7, 
		RULE_exp_let = 8, RULE_exp_constant = 9, RULE_exp_lam = 10, RULE_exp_app = 11, 
		RULE_pattern = 12, RULE_pattern_any = 13, RULE_pattern_constant = 14, 
		RULE_pattern_id = 15, RULE_literal = 16;
	public static final String[] ruleNames = {
		"program", "module", "docstr", "require", "binding", "expression", "exp_id", 
		"exp_ite", "exp_let", "exp_constant", "exp_lam", "exp_app", "pattern", 
		"pattern_any", "pattern_constant", "pattern_id", "literal"
	};

	@Override
	public String getGrammarFileName() { return "LamLite.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LamLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); module();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODIFIER) | (1L << K_REQUIRE) | (1L << K_LAM) | (1L << K_VAL) | (1L << K_IF) | (1L << K_LET) | (1L << IDENTIFIER) | (1L << VOID_LITERAL) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << INTEGER_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << COMMENT_DOC))) != 0) );
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

	public static class ModuleContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<RequireContext> require() {
			return getRuleContexts(RequireContext.class);
		}
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public RequireContext require(int i) {
			return getRuleContext(RequireContext.class,i);
		}
		public DocstrContext docstr(int i) {
			return getRuleContext(DocstrContext.class,i);
		}
		public List<DocstrContext> docstr() {
			return getRuleContexts(DocstrContext.class);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(43);
					switch (_input.LA(1)) {
					case COMMENT_DOC:
						{
						setState(39); docstr();
						}
						break;
					case K_REQUIRE:
						{
						setState(40); require();
						}
						break;
					case MODIFIER:
					case K_VAL:
						{
						setState(41); binding();
						}
						break;
					case K_LAM:
					case K_IF:
					case K_LET:
					case IDENTIFIER:
					case VOID_LITERAL:
					case NULL_LITERAL:
					case BOOLEAN_LITERAL:
					case INTEGER_LITERAL:
					case STRING_LITERAL:
					case LPAREN:
						{
						setState(42); expression(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DocstrContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT_DOC() { return getTokens(LamLiteParser.COMMENT_DOC); }
		public TerminalNode COMMENT_DOC(int i) {
			return getToken(LamLiteParser.COMMENT_DOC, i);
		}
		public DocstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterDocstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitDocstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitDocstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocstrContext docstr() throws RecognitionException {
		DocstrContext _localctx = new DocstrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_docstr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(47); match(COMMENT_DOC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class RequireContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LamLiteParser.IDENTIFIER, 0); }
		public TerminalNode K_AS() { return getToken(LamLiteParser.K_AS, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LamLiteParser.STRING_LITERAL, 0); }
		public TerminalNode K_REQUIRE() { return getToken(LamLiteParser.K_REQUIRE, 0); }
		public RequireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterRequire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitRequire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitRequire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireContext require() throws RecognitionException {
		RequireContext _localctx = new RequireContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_require);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(K_REQUIRE);
			setState(53); match(STRING_LITERAL);
			setState(54); match(K_AS);
			setState(55); match(IDENTIFIER);
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

	public static class BindingContext extends ParserRuleContext {
		public TerminalNode MODIFIER() { return getToken(LamLiteParser.MODIFIER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LamLiteParser.IDENTIFIER, 0); }
		public TerminalNode K_VAL() { return getToken(LamLiteParser.K_VAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQ() { return getToken(LamLiteParser.EQ, 0); }
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(57); match(MODIFIER);
				}
			}

			setState(60); match(K_VAL);
			setState(61); match(IDENTIFIER);
			setState(62); match(EQ);
			setState(63); expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Exp_idContext exp_id() {
			return getRuleContext(Exp_idContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LamLiteParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LamLiteParser.DIV, 0); }
		public Exp_lamContext exp_lam() {
			return getRuleContext(Exp_lamContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LamLiteParser.RPAREN, 0); }
		public Exp_iteContext exp_ite() {
			return getRuleContext(Exp_iteContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(LamLiteParser.LPAREN, 0); }
		public Exp_letContext exp_let() {
			return getRuleContext(Exp_letContext.class,0);
		}
		public Exp_constantContext exp_constant() {
			return getRuleContext(Exp_constantContext.class,0);
		}
		public Exp_appContext exp_app() {
			return getRuleContext(Exp_appContext.class,0);
		}
		public TerminalNode SUB() { return getToken(LamLiteParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(LamLiteParser.ADD, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(66); exp_constant();
				}
				break;

			case 2:
				{
				setState(67); exp_lam();
				}
				break;

			case 3:
				{
				setState(68); exp_app();
				}
				break;

			case 4:
				{
				setState(69); exp_id();
				}
				break;

			case 5:
				{
				setState(70); exp_ite();
				}
				break;

			case 6:
				{
				setState(71); exp_let();
				}
				break;

			case 7:
				{
				setState(72); match(LPAREN);
				setState(73); expression(0);
				setState(74); match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(79); match(ADD);
						setState(80); expression(9);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(81);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(82); match(SUB);
						setState(83); expression(8);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(85); match(MUL);
						setState(86); expression(7);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(88); match(DIV);
						setState(89); expression(6);
						}
						break;
					}
					} 
				}
				setState(94);
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

	public static class Exp_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LamLiteParser.IDENTIFIER, 0); }
		public Exp_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterExp_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitExp_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitExp_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_idContext exp_id() throws RecognitionException {
		Exp_idContext _localctx = new Exp_idContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(IDENTIFIER);
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

	public static class Exp_iteContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(LamLiteParser.K_ELSE, 0); }
		public TerminalNode K_THEN() { return getToken(LamLiteParser.K_THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode K_IF() { return getToken(LamLiteParser.K_IF, 0); }
		public Exp_iteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_ite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterExp_ite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitExp_ite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitExp_ite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_iteContext exp_ite() throws RecognitionException {
		Exp_iteContext _localctx = new Exp_iteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exp_ite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(K_IF);
			setState(98); expression(0);
			setState(99); match(K_THEN);
			setState(100); expression(0);
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(101); match(K_ELSE);
				setState(102); expression(0);
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

	public static class Exp_letContext extends ParserRuleContext {
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode K_LET() { return getToken(LamLiteParser.K_LET, 0); }
		public TerminalNode K_IN() { return getToken(LamLiteParser.K_IN, 0); }
		public Exp_letContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterExp_let(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitExp_let(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitExp_let(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_letContext exp_let() throws RecognitionException {
		Exp_letContext _localctx = new Exp_letContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(K_LET);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFIER || _la==K_VAL) {
				{
				{
				setState(106); binding();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112); match(K_IN);
			setState(113); expression(0);
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

	public static class Exp_constantContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Exp_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterExp_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitExp_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitExp_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_constantContext exp_constant() throws RecognitionException {
		Exp_constantContext _localctx = new Exp_constantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); literal();
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

	public static class Exp_lamContext extends ParserRuleContext {
		public TerminalNode K_LAM() { return getToken(LamLiteParser.K_LAM, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LamLiteParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(LamLiteParser.IDENTIFIER); }
		public TerminalNode RPAREN() { return getToken(LamLiteParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LamLiteParser.LPAREN, 0); }
		public TerminalNode BIGARROW() { return getToken(LamLiteParser.BIGARROW, 0); }
		public Exp_lamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_lam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterExp_lam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitExp_lam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitExp_lam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_lamContext exp_lam() throws RecognitionException {
		Exp_lamContext _localctx = new Exp_lamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp_lam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(K_LAM);
			setState(119);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(118); match(LPAREN);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(121); match(IDENTIFIER);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			_la = _input.LA(1);
			if (_la==RPAREN) {
				{
				setState(127); match(RPAREN);
				}
			}

			setState(130); match(BIGARROW);
			setState(131); expression(0);
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

	public static class Exp_appContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(LamLiteParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(LamLiteParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LPAREN() { return getToken(LamLiteParser.LPAREN, 0); }
		public Exp_appContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterExp_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitExp_app(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitExp_app(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_appContext exp_app() throws RecognitionException {
		Exp_appContext _localctx = new Exp_appContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_app);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133); match(IDENTIFIER);
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(134); match(LPAREN);
				}
				break;
			}
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137); expression(0);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(143); match(RPAREN);
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

	public static class PatternContext extends ParserRuleContext {
		public Pattern_constantContext pattern_constant() {
			return getRuleContext(Pattern_constantContext.class,0);
		}
		public Pattern_anyContext pattern_any() {
			return getRuleContext(Pattern_anyContext.class,0);
		}
		public Pattern_idContext pattern_id() {
			return getRuleContext(Pattern_idContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pattern);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case VOID_LITERAL:
			case NULL_LITERAL:
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(146); pattern_constant();
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); pattern_any();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); pattern_id();
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

	public static class Pattern_anyContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(LamLiteParser.UNDERSCORE, 0); }
		public Pattern_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPattern_any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPattern_any(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPattern_any(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_anyContext pattern_any() throws RecognitionException {
		Pattern_anyContext _localctx = new Pattern_anyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pattern_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(UNDERSCORE);
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

	public static class Pattern_constantContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Pattern_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPattern_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPattern_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPattern_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_constantContext pattern_constant() throws RecognitionException {
		Pattern_constantContext _localctx = new Pattern_constantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pattern_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); literal();
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

	public static class Pattern_idContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LamLiteParser.IDENTIFIER, 0); }
		public Pattern_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPattern_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPattern_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPattern_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_idContext pattern_id() throws RecognitionException {
		Pattern_idContext _localctx = new Pattern_idContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pattern_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(IDENTIFIER);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(LamLiteParser.INTEGER_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(LamLiteParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LamLiteParser.STRING_LITERAL, 0); }
		public TerminalNode VOID_LITERAL() { return getToken(LamLiteParser.VOID_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(LamLiteParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID_LITERAL) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << INTEGER_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);

		case 1: return precpred(_ctx, 7);

		case 2: return precpred(_ctx, 6);

		case 3: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u00a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\3\3\6\3.\n\3\r\3\16\3/\3\4\6\4\63"+
		"\n\4\r\4\16\4\64\3\5\3\5\3\5\3\5\3\5\3\6\5\6=\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7]\n\7\f\7\16\7`\13\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\7\nn\n\n\f\n\16\nq\13\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\5\fz\n\f\3\f\7\f}\n\f\f\f\16\f\u0080\13\f\3\f\5\f"+
		"\u0083\n\f\3\f\3\f\3\f\3\r\3\r\5\r\u008a\n\r\3\r\7\r\u008d\n\r\f\r\16"+
		"\r\u0090\13\r\3\r\5\r\u0093\n\r\3\16\3\16\3\16\5\16\u0098\n\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\3\f\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\3\3\2\26\32\u00ab\2%\3\2\2\2\4-\3\2\2\2\6\62\3\2"+
		"\2\2\b\66\3\2\2\2\n<\3\2\2\2\fN\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22k\3"+
		"\2\2\2\24u\3\2\2\2\26w\3\2\2\2\30\u0087\3\2\2\2\32\u0097\3\2\2\2\34\u0099"+
		"\3\2\2\2\36\u009b\3\2\2\2 \u009d\3\2\2\2\"\u009f\3\2\2\2$&\5\4\3\2%$\3"+
		"\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2\2).\5\6\4\2*.\5\b\5\2"+
		"+.\5\n\6\2,.\5\f\7\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61\63\7@\2\2\62\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66\67\7\5\2\2\678\7\32"+
		"\2\289\7\b\2\29:\7\25\2\2:\t\3\2\2\2;=\7\3\2\2<;\3\2\2\2<=\3\2\2\2=>\3"+
		"\2\2\2>?\7\13\2\2?@\7\25\2\2@A\7$\2\2AB\5\f\7\2B\13\3\2\2\2CD\b\7\1\2"+
		"DO\5\24\13\2EO\5\26\f\2FO\5\30\r\2GO\5\16\b\2HO\5\20\t\2IO\5\22\n\2JK"+
		"\7\33\2\2KL\5\f\7\2LM\7\34\2\2MO\3\2\2\2NC\3\2\2\2NE\3\2\2\2NF\3\2\2\2"+
		"NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2O^\3\2\2\2PQ\f\n\2\2QR\7\63\2"+
		"\2R]\5\f\7\13ST\f\t\2\2TU\7\64\2\2U]\5\f\7\nVW\f\b\2\2WX\7\65\2\2X]\5"+
		"\f\7\tYZ\f\7\2\2Z[\7\66\2\2[]\5\f\7\b\\P\3\2\2\2\\S\3\2\2\2\\V\3\2\2\2"+
		"\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\r\3\2\2\2`^\3\2\2\2ab\7\25"+
		"\2\2b\17\3\2\2\2cd\7\f\2\2de\5\f\7\2ef\7\r\2\2fi\5\f\7\2gh\7\16\2\2hj"+
		"\5\f\7\2ig\3\2\2\2ij\3\2\2\2j\21\3\2\2\2ko\7\17\2\2ln\5\n\6\2ml\3\2\2"+
		"\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\20\2\2st\5\f"+
		"\7\2t\23\3\2\2\2uv\5\"\22\2v\25\3\2\2\2wy\7\t\2\2xz\7\33\2\2yx\3\2\2\2"+
		"yz\3\2\2\2z~\3\2\2\2{}\7\25\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\7\34\2\2\u0082\u0081"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7<\2\2\u0085"+
		"\u0086\5\f\7\2\u0086\27\3\2\2\2\u0087\u0089\7\25\2\2\u0088\u008a\7\33"+
		"\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\3\2\2\2\u008b"+
		"\u008d\5\f\7\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\7\34\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\31\3\2\2"+
		"\2\u0094\u0098\5\36\20\2\u0095\u0098\5\34\17\2\u0096\u0098\5 \21\2\u0097"+
		"\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\33\3\2\2"+
		"\2\u0099\u009a\7?\2\2\u009a\35\3\2\2\2\u009b\u009c\5\"\22\2\u009c\37\3"+
		"\2\2\2\u009d\u009e\7\25\2\2\u009e!\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0#"+
		"\3\2\2\2\23\'-/\64<N\\^ioy~\u0082\u0089\u008e\u0092\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}