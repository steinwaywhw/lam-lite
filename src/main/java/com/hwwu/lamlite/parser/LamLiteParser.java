// Generated from /vagrant/src/main/java/com/hwwu/lamlite/parser/LamLite.g4 by ANTLR 4.4.1-dev
package com.hwwu.lamlite.parser;
 
import java.util.Arrays; 

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
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, K_INT=4, K_STRING=5, K_BOOL=6, K_THIS=7, K_REQUIRE=8, 
		K_MODULE=9, K_PUBLIC=10, K_AS=11, K_LAM=12, K_FUN=13, K_VAL=14, K_IF=15, 
		K_THEN=16, K_ELSE=17, K_LET=18, K_IN=19, K_END=20, K_WHERE=21, K_CASE=22, 
		K_OF=23, VOID_LITERAL=24, NULL_LITERAL=25, BOOLEAN_LITERAL=26, INTEGER_LITERAL=27, 
		STRING_LITERAL=28, LPAREN=29, RPAREN=30, LBRACE=31, RBRACE=32, LBRACK=33, 
		RBRACK=34, SEMI=35, COMMA=36, DOT=37, IDNAME=38, IDOPERATOR=39, COMMENT_DOC=40, 
		COMMENT_BLOCK=41, COMMENT_LINE=42, REST_COMMENT=43, WS=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'=>'", "'_'", "'='", "'int'", "'string'", "'bool'", "'this'", 
		"'require'", "'module'", "'public'", "'as'", "'lam'", "'fun'", "'val'", 
		"'if'", "'then'", "'else'", "'let'", "'in'", "'end'", "'where'", "'case'", 
		"'of'", "VOID_LITERAL", "'null'", "BOOLEAN_LITERAL", "INTEGER_LITERAL", 
		"STRING_LITERAL", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'", "IDNAME", "IDOPERATOR", "COMMENT_DOC", "COMMENT_BLOCK", "COMMENT_LINE", 
		"REST_COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_binding = 1, RULE_pattern = 2, RULE_patternOperator = 3, 
		RULE_patternAny = 4, RULE_patternVariable = 5, RULE_patternConstant = 6, 
		RULE_term = 7, RULE_termnode = 8, RULE_termConstant = 9, RULE_termVariable = 10, 
		RULE_termLambda = 11, RULE_docstr = 12, RULE_literal = 13;
	public static final String[] ruleNames = {
		"program", "binding", "pattern", "patternOperator", "patternAny", "patternVariable", 
		"patternConstant", "term", "termnode", "termConstant", "termVariable", 
		"termLambda", "docstr", "literal"
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
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28); binding();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_VAL );
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode K_VAL() { return getToken(LamLiteParser.K_VAL, 0); }
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
		enterRule(_localctx, 2, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(K_VAL);
			setState(34); pattern();
			setState(35); match(T__0);
			setState(36); term();
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
		public PatternConstantContext patternConstant() {
			return getRuleContext(PatternConstantContext.class,0);
		}
		public PatternVariableContext patternVariable() {
			return getRuleContext(PatternVariableContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LamLiteParser.RPAREN, 0); }
		public PatternAnyContext patternAny() {
			return getRuleContext(PatternAnyContext.class,0);
		}
		public PatternOperatorContext patternOperator() {
			return getRuleContext(PatternOperatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LamLiteParser.LPAREN, 0); }
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
		enterRule(_localctx, 4, RULE_pattern);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case IDNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); patternVariable();
				}
				break;
			case IDOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); patternOperator();
				}
				break;
			case VOID_LITERAL:
			case NULL_LITERAL:
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); patternConstant();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(41); patternAny();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(42); match(LPAREN);
				setState(43); pattern();
				setState(44); match(RPAREN);
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

	public static class PatternOperatorContext extends ParserRuleContext {
		public TerminalNode IDOPERATOR() { return getToken(LamLiteParser.IDOPERATOR, 0); }
		public PatternOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPatternOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPatternOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPatternOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternOperatorContext patternOperator() throws RecognitionException {
		PatternOperatorContext _localctx = new PatternOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_patternOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(IDOPERATOR);
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

	public static class PatternAnyContext extends ParserRuleContext {
		public PatternAnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternAny; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPatternAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPatternAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPatternAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternAnyContext patternAny() throws RecognitionException {
		PatternAnyContext _localctx = new PatternAnyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_patternAny);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(T__1);
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

	public static class PatternVariableContext extends ParserRuleContext {
		public TerminalNode IDNAME() { return getToken(LamLiteParser.IDNAME, 0); }
		public PatternVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPatternVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPatternVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPatternVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternVariableContext patternVariable() throws RecognitionException {
		PatternVariableContext _localctx = new PatternVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_patternVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(IDNAME);
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

	public static class PatternConstantContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PatternConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterPatternConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitPatternConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitPatternConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternConstantContext patternConstant() throws RecognitionException {
		PatternConstantContext _localctx = new PatternConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_patternConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); literal();
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
		public List<TermnodeContext> termnode() {
			return getRuleContexts(TermnodeContext.class);
		}
		public TermnodeContext termnode(int i) {
			return getRuleContext(TermnodeContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			int _alt;
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); termnode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); termnode();
				setState(59); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(58); termnode();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(61); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TermnodeContext extends ParserRuleContext {
		public TermnodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termnode; }
	 
		public TermnodeContext() { }
		public void copyFrom(TermnodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LambdaContext extends TermnodeContext {
		public TermLambdaContext termLambda() {
			return getRuleContext(TermLambdaContext.class,0);
		}
		public LambdaContext(TermnodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends TermnodeContext {
		public TermConstantContext termConstant() {
			return getRuleContext(TermConstantContext.class,0);
		}
		public ConstantContext(TermnodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedContext extends TermnodeContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LamLiteParser.RPAREN, 0); }
		public TerminalNode LPAREN() { return getToken(LamLiteParser.LPAREN, 0); }
		public NestedContext(TermnodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends TermnodeContext {
		public TermVariableContext termVariable() {
			return getRuleContext(TermVariableContext.class,0);
		}
		public VariableContext(TermnodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermnodeContext termnode() throws RecognitionException {
		TermnodeContext _localctx = new TermnodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termnode);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case VOID_LITERAL:
			case NULL_LITERAL:
			case BOOLEAN_LITERAL:
			case INTEGER_LITERAL:
			case STRING_LITERAL:
				_localctx = new ConstantContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65); termConstant();
				}
				break;
			case IDNAME:
			case IDOPERATOR:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66); termVariable();
				}
				break;
			case K_LAM:
				_localctx = new LambdaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67); termLambda();
				}
				break;
			case LPAREN:
				_localctx = new NestedContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68); match(LPAREN);
				setState(69); term();
				setState(70); match(RPAREN);
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

	public static class TermConstantContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TermConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterTermConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitTermConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitTermConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermConstantContext termConstant() throws RecognitionException {
		TermConstantContext _localctx = new TermConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_termConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); literal();
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

	public static class TermVariableContext extends ParserRuleContext {
		public TerminalNode IDNAME() { return getToken(LamLiteParser.IDNAME, 0); }
		public TerminalNode IDOPERATOR() { return getToken(LamLiteParser.IDOPERATOR, 0); }
		public TermVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterTermVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitTermVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitTermVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermVariableContext termVariable() throws RecognitionException {
		TermVariableContext _localctx = new TermVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_termVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==IDNAME || _la==IDOPERATOR) ) {
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

	public static class TermLambdaContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode K_LAM() { return getToken(LamLiteParser.K_LAM, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public TermLambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termLambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).enterTermLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamLiteListener ) ((LamLiteListener)listener).exitTermLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamLiteVisitor ) return ((LamLiteVisitor<? extends T>)visitor).visitTermLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermLambdaContext termLambda() throws RecognitionException {
		TermLambdaContext _localctx = new TermLambdaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termLambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(K_LAM);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79); pattern();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << VOID_LITERAL) | (1L << NULL_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << INTEGER_LITERAL) | (1L << STRING_LITERAL) | (1L << LPAREN) | (1L << IDNAME) | (1L << IDOPERATOR))) != 0) );
			setState(84); match(T__2);
			setState(85); term();
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
		enterRule(_localctx, 24, RULE_docstr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87); match(COMMENT_DOC);
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMENT_DOC );
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
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.a\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\6\t>\n\t\r\t\16\t?\5\tB\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nK\n\n\3\13\3\13\3\f\3\f\3\r\3\r\6\rS\n\r\r\r\16\rT\3\r\3"+
		"\r\3\r\3\16\6\16[\n\16\r\16\16\16\\\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\4\3\2()\3\2\32\36^\2\37\3\2\2\2\4#\3\2\2\2"+
		"\6\60\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\168\3\2\2\2\20A\3"+
		"\2\2\2\22J\3\2\2\2\24L\3\2\2\2\26N\3\2\2\2\30P\3\2\2\2\32Z\3\2\2\2\34"+
		"^\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"\3\3\2\2\2#$\7\20\2\2$%\5\6\4\2%&\7\5\2\2&\'\5\20\t\2\'\5\3\2\2\2(\61"+
		"\5\f\7\2)\61\5\b\5\2*\61\5\16\b\2+\61\5\n\6\2,-\7\37\2\2-.\5\6\4\2./\7"+
		" \2\2/\61\3\2\2\2\60(\3\2\2\2\60)\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60,"+
		"\3\2\2\2\61\7\3\2\2\2\62\63\7)\2\2\63\t\3\2\2\2\64\65\7\4\2\2\65\13\3"+
		"\2\2\2\66\67\7(\2\2\67\r\3\2\2\289\5\34\17\29\17\3\2\2\2:B\5\22\n\2;="+
		"\5\22\n\2<>\5\22\n\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2"+
		"A:\3\2\2\2A;\3\2\2\2B\21\3\2\2\2CK\5\24\13\2DK\5\26\f\2EK\5\30\r\2FG\7"+
		"\37\2\2GH\5\20\t\2HI\7 \2\2IK\3\2\2\2JC\3\2\2\2JD\3\2\2\2JE\3\2\2\2JF"+
		"\3\2\2\2K\23\3\2\2\2LM\5\34\17\2M\25\3\2\2\2NO\t\2\2\2O\27\3\2\2\2PR\7"+
		"\16\2\2QS\5\6\4\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW"+
		"\7\3\2\2WX\5\20\t\2X\31\3\2\2\2Y[\7*\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]\33\3\2\2\2^_\t\3\2\2_\35\3\2\2\2\t!\60?AJT\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}