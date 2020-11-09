package co.edu.javeriana.bot.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class While implements ASTNode {
	
	private ASTNode condition;
	private List<ASTNode> body;

	public While(ASTNode condition, List<ASTNode> body) {
		super();
		this.condition = condition;
		this.body = body;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Map<String, Object> aux = new HashMap<String, Object>();
		
		for( Map.Entry<String, Object> entry : symbolTable.entrySet())
		{
			aux.put(entry.getKey(), symbolTable.get(entry.getKey()));
		}
		
		while( (Boolean)condition.execute(aux) )
		{
			for(ASTNode n : body)
			{
				n.execute(aux);
			}
		}
		
		for( Map.Entry<String, Object> entry : symbolTable.entrySet())
		{
			symbolTable.put(entry.getKey(), aux.get(entry.getKey()));
		}
		
		return null;
	}

}
