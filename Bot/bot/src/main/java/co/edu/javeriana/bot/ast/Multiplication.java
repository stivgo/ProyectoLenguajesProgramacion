package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Multiplication implements ASTNode {
	
	private ASTNode operand1;
	private ASTNode operand2;

	public Multiplication(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return (float)operand1.execute(symbolTable) * (float)operand2.execute(symbolTable);
	}

}
