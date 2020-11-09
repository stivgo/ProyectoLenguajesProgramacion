package co.edu.javeriana.bot.ast;

import java.util.Map;
import java.util.Scanner;

public class Read implements ASTNode {

	private String name;
	private Scanner input;
	
	public Read(String name) {
		super();
		input = new Scanner(System.in);
		this.name= name;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		System.out.println("Ingrese el valor de la varible "+name+" :");
		String word = input.nextLine();
		symbolTable.put(name, word);
		
		return null;
	}

}
