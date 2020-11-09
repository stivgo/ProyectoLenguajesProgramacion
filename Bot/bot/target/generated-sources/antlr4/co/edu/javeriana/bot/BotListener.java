// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;
import co.edu.javeriana.bot.ast.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BotParser}.
 */
public interface BotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BotParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BotParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(BotParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(BotParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void enterPick(BotParser.PickContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#pick}.
	 * @param ctx the parse tree
	 */
	void exitPick(BotParser.PickContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(BotParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(BotParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(BotParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(BotParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#assignvar}.
	 * @param ctx the parse tree
	 */
	void enterAssignvar(BotParser.AssignvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#assignvar}.
	 * @param ctx the parse tree
	 */
	void exitAssignvar(BotParser.AssignvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#conditionif}.
	 * @param ctx the parse tree
	 */
	void enterConditionif(BotParser.ConditionifContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#conditionif}.
	 * @param ctx the parse tree
	 */
	void exitConditionif(BotParser.ConditionifContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#conditionwhile}.
	 * @param ctx the parse tree
	 */
	void enterConditionwhile(BotParser.ConditionwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#conditionwhile}.
	 * @param ctx the parse tree
	 */
	void exitConditionwhile(BotParser.ConditionwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(BotParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(BotParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BotParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BotParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BotParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BotParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BotParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BotParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#andOr}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(BotParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#andOr}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(BotParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(BotParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(BotParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(BotParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(BotParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(BotParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(BotParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BotParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BotParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#executeFun}.
	 * @param ctx the parse tree
	 */
	void enterExecuteFun(BotParser.ExecuteFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#executeFun}.
	 * @param ctx the parse tree
	 */
	void exitExecuteFun(BotParser.ExecuteFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#movUp}.
	 * @param ctx the parse tree
	 */
	void enterMovUp(BotParser.MovUpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#movUp}.
	 * @param ctx the parse tree
	 */
	void exitMovUp(BotParser.MovUpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#movDown}.
	 * @param ctx the parse tree
	 */
	void enterMovDown(BotParser.MovDownContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#movDown}.
	 * @param ctx the parse tree
	 */
	void exitMovDown(BotParser.MovDownContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#movRight}.
	 * @param ctx the parse tree
	 */
	void enterMovRight(BotParser.MovRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#movRight}.
	 * @param ctx the parse tree
	 */
	void exitMovRight(BotParser.MovRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#movLeft}.
	 * @param ctx the parse tree
	 */
	void enterMovLeft(BotParser.MovLeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#movLeft}.
	 * @param ctx the parse tree
	 */
	void exitMovLeft(BotParser.MovLeftContext ctx);
}