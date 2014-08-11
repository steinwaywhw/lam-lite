// Generated from C:\Users\IBM_ADMIN\Documents\GitHub\lam-lite\src\main\java\com\hwwu\lamlite\parser\LamLite.g4 by ANTLR 4.3
package com.hwwu.lamlite.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LamLiteParser}.
 */
public interface LamLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LamLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull LamLiteParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull LamLiteParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#exp_id}.
	 * @param ctx the parse tree
	 */
	void enterExp_id(@NotNull LamLiteParser.Exp_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#exp_id}.
	 * @param ctx the parse tree
	 */
	void exitExp_id(@NotNull LamLiteParser.Exp_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(@NotNull LamLiteParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(@NotNull LamLiteParser.ModuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#exp_app}.
	 * @param ctx the parse tree
	 */
	void enterExp_app(@NotNull LamLiteParser.Exp_appContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#exp_app}.
	 * @param ctx the parse tree
	 */
	void exitExp_app(@NotNull LamLiteParser.Exp_appContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#pattern_id}.
	 * @param ctx the parse tree
	 */
	void enterPattern_id(@NotNull LamLiteParser.Pattern_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#pattern_id}.
	 * @param ctx the parse tree
	 */
	void exitPattern_id(@NotNull LamLiteParser.Pattern_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#pattern_any}.
	 * @param ctx the parse tree
	 */
	void enterPattern_any(@NotNull LamLiteParser.Pattern_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#pattern_any}.
	 * @param ctx the parse tree
	 */
	void exitPattern_any(@NotNull LamLiteParser.Pattern_anyContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#exp_let}.
	 * @param ctx the parse tree
	 */
	void enterExp_let(@NotNull LamLiteParser.Exp_letContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#exp_let}.
	 * @param ctx the parse tree
	 */
	void exitExp_let(@NotNull LamLiteParser.Exp_letContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#exp_lam}.
	 * @param ctx the parse tree
	 */
	void enterExp_lam(@NotNull LamLiteParser.Exp_lamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#exp_lam}.
	 * @param ctx the parse tree
	 */
	void exitExp_lam(@NotNull LamLiteParser.Exp_lamContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#exp_ite}.
	 * @param ctx the parse tree
	 */
	void enterExp_ite(@NotNull LamLiteParser.Exp_iteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#exp_ite}.
	 * @param ctx the parse tree
	 */
	void exitExp_ite(@NotNull LamLiteParser.Exp_iteContext ctx);

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
	 * Enter a parse tree produced by {@link LamLiteParser#pattern_constant}.
	 * @param ctx the parse tree
	 */
	void enterPattern_constant(@NotNull LamLiteParser.Pattern_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#pattern_constant}.
	 * @param ctx the parse tree
	 */
	void exitPattern_constant(@NotNull LamLiteParser.Pattern_constantContext ctx);

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
	 * Enter a parse tree produced by {@link LamLiteParser#require}.
	 * @param ctx the parse tree
	 */
	void enterRequire(@NotNull LamLiteParser.RequireContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#require}.
	 * @param ctx the parse tree
	 */
	void exitRequire(@NotNull LamLiteParser.RequireContext ctx);

	/**
	 * Enter a parse tree produced by {@link LamLiteParser#exp_constant}.
	 * @param ctx the parse tree
	 */
	void enterExp_constant(@NotNull LamLiteParser.Exp_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LamLiteParser#exp_constant}.
	 * @param ctx the parse tree
	 */
	void exitExp_constant(@NotNull LamLiteParser.Exp_constantContext ctx);

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