package co.edu.javeriana.bot.ast;

import java.util.Map;

public class RefVar implements ASTNode {
	private String name;

	public RefVar(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return symbolTable.get(name);
	}

}
