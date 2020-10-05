// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BotParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(BotParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#movUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovUp(BotParser.MovUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#movDown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovDown(BotParser.MovDownContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#movRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovRight(BotParser.MovRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#movLeft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovLeft(BotParser.MovLeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BotParser.ExpressionContext ctx);
}