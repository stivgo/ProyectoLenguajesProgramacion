package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Negation implements ASTNode {

	private ASTNode node;
	
	public Negation(ASTNode node) {
		super();
		this.node = node;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Boolean value = (Boolean)node.execute(symbolTable);
		return !value;
	}

}
