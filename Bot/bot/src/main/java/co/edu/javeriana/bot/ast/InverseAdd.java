package co.edu.javeriana.bot.ast;

import java.util.Map;

public class InverseAdd implements ASTNode {
	
	private Object number;

	public InverseAdd(Object number) {
		super();
		this.number = number;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Float value = (Float)number; 
		return value * (-1);
	}

}
