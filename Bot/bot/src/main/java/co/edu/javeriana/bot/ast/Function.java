package co.edu.javeriana.bot.ast;

import java.util.List;
import java.util.Map;

public class Function implements ASTNode {
	
	private String name;
	private List<String> params;
	private List<ASTNode> sentences;
	private Boolean returnFun;
	private ASTNode keyReturn;
	

	
	public Function(String name, List<String> params, List<ASTNode> sentences, Boolean returnFun, ASTNode keyReturn) {
		super();
		this.name = name;
		this.params = params;
		this.sentences = sentences;
		this.returnFun = returnFun;
		this.keyReturn = keyReturn;
	}



	@Override
	public Object execute(Map<String, Object> symbolTable) {
		symbolTable.put(name, this);
		return null;
	}



	public String getName() {
		return name;
	}



	public List<String> getParams() {
		return params;
	}



	public List<ASTNode> getSentences() {
		return sentences;
	}



	public Boolean getReturnFun() {
		return returnFun;
	}



	public ASTNode getKeyReturn() {
		return keyReturn;
	}
	
	

}
