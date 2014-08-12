// Generated from /vagrant/src/main/java/com/hwwu/lamlite/parser/LamLite.g4 by ANTLR 4.4.1-dev
package com.hwwu.lamlite.parser;
 
import java.util.Arrays; 

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LamLiteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LamLiteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull LamLiteParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(@NotNull LamLiteParser.NestedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#patternAny}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternAny(@NotNull LamLiteParser.PatternAnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#patternConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternConstant(@NotNull LamLiteParser.PatternConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#termConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermConstant(@NotNull LamLiteParser.TermConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(@NotNull LamLiteParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#termLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermLambda(@NotNull LamLiteParser.TermLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull LamLiteParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#termVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermVariable(@NotNull LamLiteParser.TermVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#patternVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternVariable(@NotNull LamLiteParser.PatternVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull LamLiteParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull LamLiteParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#patternOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternOperator(@NotNull LamLiteParser.PatternOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(@NotNull LamLiteParser.BindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link LamLiteParser#termnode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull LamLiteParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull LamLiteParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LamLiteParser#docstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocstr(@NotNull LamLiteParser.DocstrContext ctx);
}