// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;
import co.edu.javeriana.bot.ast.*;


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
	 * Visit a parse tree produced by {@link BotParser#assignvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignvar(BotParser.AssignvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#conditionif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionif(BotParser.ConditionifContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#conditionwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionwhile(BotParser.ConditionwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(BotParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BotParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BotParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BotParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#andOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(BotParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(BotParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(BotParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BotParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BotParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BotParser#executeFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteFun(BotParser.ExecuteFunContext ctx);
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
}