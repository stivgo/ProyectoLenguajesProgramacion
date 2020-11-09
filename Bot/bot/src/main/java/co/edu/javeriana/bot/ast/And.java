package co.edu.javeriana.bot.ast;

import java.util.Map;

public class And implements ASTNode {
	
	private ASTNode comparison1;
	private ASTNode comparison2;
	
	public And(ASTNode comparison1, ASTNode comparison2) {
		super();
		this.comparison1 = comparison1;
		this.comparison2 = comparison2;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Boolean value1 = (Boolean)comparison1.execute(symbolTable);
		Boolean value2 = (Boolean)comparison2.execute(symbolTable);
		return (value1 && value2);
	}

}
