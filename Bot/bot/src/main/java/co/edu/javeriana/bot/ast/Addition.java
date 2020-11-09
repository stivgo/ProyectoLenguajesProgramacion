package co.edu.javeriana.bot.ast;

import java.util.Map;

public class Addition implements ASTNode {
	
	private ASTNode operand1;
	private ASTNode operand2;

	public Addition(ASTNode operand1, ASTNode operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable) {
		
		Boolean op1;
		Boolean op2;
		
		try {
			op1 = isValidFloat( String.valueOf(operand1.execute(symbolTable)));
	    } catch(NumberFormatException nfe) {
	    	op1 = true;
	    }
		try {
			op2 = isValidFloat( String.valueOf(operand2.execute(symbolTable)));
	    } catch(NumberFormatException nfe) {
	    	op2 = true;
	    }
		
		if(op1 && op2) {
			return (float)operand1.execute(symbolTable) + (float)operand2.execute(symbolTable);
		}
		else if (op1==true && op2==false) {
			return String.valueOf((float)operand1.execute(symbolTable)) + String.valueOf(operand2.execute(symbolTable));
		}
		else if (op1==false && op2==true) {
			return String.valueOf(operand1.execute(symbolTable)) + String.valueOf((float)operand2.execute(symbolTable));
		}else {
			return (String)operand1.execute(symbolTable) + (String)operand2.execute(symbolTable);
		}
		
	}
	
	private static boolean isValidFloat(String s) {
	    boolean isValid = true;
	   
	    try {
	        Float.parseFloat(s);
	    } catch(NumberFormatException nfe) {
	        isValid = false;
	    }

	    return isValid;
	}

}
