package co.edu.javeriana.bot.ast;

import java.util.Map;

import org.jpavlich.bot.Bot;

public class MovRight implements ASTNode {

	private Bot bot;
	private ASTNode move;

	public MovRight(Bot bot, ASTNode move) {
		super();
		this.bot = bot;
		this.move = move;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		float value = (Float) move.execute(symbolTable);
		bot.right((int) value);
		return null;
	}

}
