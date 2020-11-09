package co.edu.javeriana.bot.ast;

import java.util.Map;

public class GreaterThan implements ASTNode {
	private ASTNode comparison1;
	private ASTNode comparison2;
	
	public GreaterThan(ASTNode comparison1, ASTNode comparison2) {
		super();
		this.comparison1 = comparison1;
		this.comparison2 = comparison2;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		if((float)comparison1.execute(symbolTable) > (float)comparison2.execute(symbolTable)) {
			return true;
		}
		return false;
	}

}
