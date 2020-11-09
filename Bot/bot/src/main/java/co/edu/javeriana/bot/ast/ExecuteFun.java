package co.edu.javeriana.bot.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExecuteFun implements ASTNode {
	
	private String name;
	private List<ASTNode> arguments;

	public ExecuteFun(String name, List<ASTNode> arguments) {
		super();
		this.name = name;
		this.arguments = arguments;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		Function func = (Function)symbolTable.get(name);
		Map<String, Object> funcTable = new HashMap<String, Object>();
		List<String> params = func.getParams();
		List<ASTNode> setences = func.getSentences();
		
		if( params.size() != arguments.size() )
		{
			System.out.println("Numero de argumentos invalidos");
		}
		else
		{
			int cont = 0;
			
			for( ASTNode n : arguments)
			{
				funcTable.put(params.get(cont), n.execute(symbolTable));
				cont++;
			}
			
			for( ASTNode n : setences)
			{
				n.execute(funcTable);
			}
		}
		if( func.getReturnFun() )
		{
			return func.getKeyReturn().execute(funcTable);
		}
		return null;
	}

}
