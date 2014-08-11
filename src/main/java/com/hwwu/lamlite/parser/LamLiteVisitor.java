// Generated from C:\Users\IBM_ADMIN\Documents\GitHub\lam-lite\src\main\java\com\hwwu\lamlite\parser\LamLite.g4 by ANTLR 4.3
package com.hwwu.lamlite.parser;
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
	 * Visit a parse tree produced by {@link LamLiteParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull LamLiteParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#exp_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_id(@NotNull LamLiteParser.Exp_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(@NotNull LamLiteParser.ModuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#exp_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_app(@NotNull LamLiteParser.Exp_appContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#pattern_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_id(@NotNull LamLiteParser.Pattern_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#pattern_any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_any(@NotNull LamLiteParser.Pattern_anyContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#exp_let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_let(@NotNull LamLiteParser.Exp_letContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#exp_lam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_lam(@NotNull LamLiteParser.Exp_lamContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#exp_ite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_ite(@NotNull LamLiteParser.Exp_iteContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(@NotNull LamLiteParser.PatternContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull LamLiteParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#pattern_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_constant(@NotNull LamLiteParser.Pattern_constantContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(@NotNull LamLiteParser.BindingContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#require}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequire(@NotNull LamLiteParser.RequireContext ctx);

	/**
	 * Visit a parse tree produced by {@link LamLiteParser#exp_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_constant(@NotNull LamLiteParser.Exp_constantContext ctx);

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