// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;


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
	 * Enter a parse tree produced by {@link BotParser#asignvar}.
	 * @param ctx the parse tree
	 */
	void enterAsignvar(BotParser.AsignvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#asignvar}.
	 * @param ctx the parse tree
	 */
	void exitAsignvar(BotParser.AsignvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#twicevar}.
	 * @param ctx the parse tree
	 */
	void enterTwicevar(BotParser.TwicevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#twicevar}.
	 * @param ctx the parse tree
	 */
	void exitTwicevar(BotParser.TwicevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(BotParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(BotParser.DatoContext ctx);
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
	 * Enter a parse tree produced by {@link BotParser#conditionifelse}.
	 * @param ctx the parse tree
	 */
	void enterConditionifelse(BotParser.ConditionifelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#conditionifelse}.
	 * @param ctx the parse tree
	 */
	void exitConditionifelse(BotParser.ConditionifelseContext ctx);
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
	 * Enter a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BotParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BotParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#readscreen}.
	 * @param ctx the parse tree
	 */
	void enterReadscreen(BotParser.ReadscreenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#readscreen}.
	 * @param ctx the parse tree
	 */
	void exitReadscreen(BotParser.ReadscreenContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#printscreen}.
	 * @param ctx the parse tree
	 */
	void enterPrintscreen(BotParser.PrintscreenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#printscreen}.
	 * @param ctx the parse tree
	 */
	void exitPrintscreen(BotParser.PrintscreenContext ctx);
	/**
	 * Enter a parse tree produced by {@link BotParser#datoprint}.
	 * @param ctx the parse tree
	 */
	void enterDatoprint(BotParser.DatoprintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#datoprint}.
	 * @param ctx the parse tree
	 */
	void exitDatoprint(BotParser.DatoprintContext ctx);
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
	 * Enter a parse tree produced by {@link BotParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(BotParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BotParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(BotParser.ParamsContext ctx);
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
}