// Generated from /vagrant/src/main/java/com/hwwu/lamlite/parser/LamLite.g4 by ANTLR 4.4.1-dev
package com.hwwu.lamlite.parser;
 
import java.util.Arrays; 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LamLiteParser}.
 */
public interface LamLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull LamLiteParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull LamLiteParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nested}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void enterNested(@NotNull LamLiteParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void exitNested(@NotNull LamLiteParser.NestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#patternAny}.
	 * @param ctx the parse tree
	 */
	void enterPatternAny(@NotNull LamLiteParser.PatternAnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#patternAny}.
	 * @param ctx the parse tree
	 */
	void exitPatternAny(@NotNull LamLiteParser.PatternAnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#patternConstant}.
	 * @param ctx the parse tree
	 */
	void enterPatternConstant(@NotNull LamLiteParser.PatternConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#patternConstant}.
	 * @param ctx the parse tree
	 */
	void exitPatternConstant(@NotNull LamLiteParser.PatternConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#termConstant}.
	 * @param ctx the parse tree
	 */
	void enterTermConstant(@NotNull LamLiteParser.TermConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#termConstant}.
	 * @param ctx the parse tree
	 */
	void exitTermConstant(@NotNull LamLiteParser.TermConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull LamLiteParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull LamLiteParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#termLambda}.
	 * @param ctx the parse tree
	 */
	void enterTermLambda(@NotNull LamLiteParser.TermLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#termLambda}.
	 * @param ctx the parse tree
	 */
	void exitTermLambda(@NotNull LamLiteParser.TermLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(@NotNull LamLiteParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(@NotNull LamLiteParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#termVariable}.
	 * @param ctx the parse tree
	 */
	void enterTermVariable(@NotNull LamLiteParser.TermVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#termVariable}.
	 * @param ctx the parse tree
	 */
	void exitTermVariable(@NotNull LamLiteParser.TermVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#patternVariable}.
	 * @param ctx the parse tree
	 */
	void enterPatternVariable(@NotNull LamLiteParser.PatternVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#patternVariable}.
	 * @param ctx the parse tree
	 */
	void exitPatternVariable(@NotNull LamLiteParser.PatternVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull LamLiteParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull LamLiteParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull LamLiteParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull LamLiteParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#patternOperator}.
	 * @param ctx the parse tree
	 */
	void enterPatternOperator(@NotNull LamLiteParser.PatternOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#patternOperator}.
	 * @param ctx the parse tree
	 */
	void exitPatternOperator(@NotNull LamLiteParser.PatternOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(@NotNull LamLiteParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(@NotNull LamLiteParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull LamLiteParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull LamLiteParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull LamLiteParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull LamLiteParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#docstr}.
	 * @param ctx the parse tree
	 */
	void enterDocstr(@NotNull LamLiteParser.DocstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#docstr}.
	 * @param ctx the parse tree
	 */
	void exitDocstr(@NotNull LamLiteParser.DocstrContext ctx);
}