package co.edu.javeriana.bot.ast;

import java.util.Map;

import org.jpavlich.bot.Bot;

public class MovLeft implements ASTNode {

	private Bot bot;
	private ASTNode move;

	public MovLeft(Bot bot, ASTNode move) {
		super();
		this.bot = bot;
		this.move = move;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		float value = (Float) move.execute(symbolTable);
		bot.left((int) value);
		return null;
	}
}
