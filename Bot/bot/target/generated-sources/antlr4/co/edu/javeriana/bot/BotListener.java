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