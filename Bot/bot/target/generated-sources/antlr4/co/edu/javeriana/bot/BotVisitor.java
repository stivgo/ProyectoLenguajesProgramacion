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
	 * Visit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPick(BotParser.PickContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(BotParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(BotParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#asignvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignvar(BotParser.AsignvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#twicevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwicevar(BotParser.TwicevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(BotParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#conditionif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionif(BotParser.ConditionifContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#conditionifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionifelse(BotParser.ConditionifelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#conditionwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionwhile(BotParser.ConditionwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(BotParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#readscreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadscreen(BotParser.ReadscreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#printscreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintscreen(BotParser.PrintscreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#datoprint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatoprint(BotParser.DatoprintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BotParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(BotParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BotParser.ExpressionContext ctx);
}