grammar Bot;

@header {

import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;
import co.edu.javeriana.bot.ast.*;

}


@parser::members {
	
Map<String,Object> symbolTable = new HashMap<String,Object>();

private Bot bot;

public BotParser(TokenStream input, Bot bot) {
    this(input);
    this.bot = bot;
}

}


program: {
		 List<ASTNode>body = new ArrayList<ASTNode>();
		 Map<String,Object> symbolTable = new HashMap<String,Object>();
		 Map<String,Object> funcTable = new HashMap<String,Object>();
		}
		(sentence {body.add($sentence.node);})*
		{
			for(ASTNode n:body){
				n.execute(symbolTable);
			}
		};

sentence returns [ASTNode node]: 
				
			  pick {$node = $pick.node;}
			 | drop {$node = $drop.node;}
			 | defvar {$node = $defvar.node;}
			 | assignvar {$node = $assignvar.node;}
			 | conditionif {$node = $conditionif.node;}
			 | conditionwhile {$node = $conditionwhile.node;}
			 | read  {$node = $read.node;}
			 |print {$node = $print.node;} 
			 |function {$node = $function.node;}
			| movUp {$node = $movUp.node;}
			 | movDown {$node = $movDown.node;}
			 | movRight {$node = $movRight.node;}
			 | movLeft {$node = $movLeft.node;};



pick returns [ASTNode node]: PICK SEMICOLON{
	bot.pick();
	$node = new Pick(this.bot);
};
drop returns [ASTNode node]: DROP SEMICOLON{
	bot.drop();
	$node = new Drop(this.bot);
};

//Sentencia de variables
defvar returns [ASTNode node]: VAR ID {
	$node = new DefVar($ID.text);	 
} (ASSIGNVAR expression {$node = new AssignVar($ID.text, $expression.node);})? SEMICOLON;

assignvar returns [ASTNode node]: ID ASSIGNVAR  expression SEMICOLON
{
	$node = new AssignVar($ID.text,$expression.node );
};






//Sentencia de condicionales
conditionif returns [ASTNode node]:{
		List<ASTNode> body = new ArrayList<ASTNode>();
		List<ASTNode> elseBody = new ArrayList<ASTNode>();
		} IF expression ASSIGNFUN (s1=sentence{body.add($s1.node);})*
		(ELSE (s2=sentence {elseBody.add($s2.node);})*)?
		 END SEMICOLON{
		 	$node = new If($expression.node,body,elseBody);
		 } ;
		

//Sentencia de while
conditionwhile returns [ASTNode node]:{
			List<ASTNode> body = new ArrayList<ASTNode>();
		} WHILE expression ASSIGNFUN (sentence{body.add($sentence.node);})* END SEMICOLON{
			$node = new While($expression.node,body);
		
		};




//Impresion y lectura de pantalla
read returns [ASTNode node]:READ ID SEMICOLON{
		$node = new Read($ID.text);
	};

print returns [ASTNode node]:WRITE expression  SEMICOLON{
		$node = new Print($expression.node);
		};


function returns [ASTNode node]:
			{
				Boolean returnFun = false;
				ASTNode returnNode = new Constant("NA");
			}
			DEFINE t1= ID PAR_OPEN
			{
				List<String> params = new ArrayList<String>();
				List<ASTNode> body = new ArrayList<ASTNode>();
			}  (VAR t2=ID{params.add($t2.text);})?
			(COMMA t3 = ID{params.add($t3.text);})*
			 PAR_CLOSE ASSIGNFUN (s1=sentence{body.add($s1.node);})*
			 (RETURN andOr{
			 	returnFun= true;
			 	returnNode = $andOr.node;
			 })?
			 END SEMICOLON{
			 	$node = new Function($t1.text, params, body, returnFun, returnNode);
	
				} ;


expression returns [ASTNode node]:
	t1 = andOr{$node = $t1.node;}
	|NOT t2 = andOr{$node = new Negation($t2.node);};
	
andOr returns [ASTNode node]:
	t1 = comparison{$node = $t1.node;}
	(AND t2 = comparison{$node = new And($node, $t2.node);}
	|OR t3 = comparison{$node = new Or($node, $t3.node);}		
	)*;
	
comparison returns [ASTNode node]:
	t1 = addition{$node = $t1.node;}
	(EQ t2 = addition {$node = new Equality($node, $t2.node);}
	|RIGHT t3 = addition {$node = new GreaterThan($node, $t3.node);}
	|LEFT t4 = addition {$node = new LessThan($node, $t4.node);}
	|GEQ t5 = addition {$node = new GreaterEqual($node, $t5.node);}
	|LEQ t6 = addition {$node = new LessEqual($node, $t6.node);}
	|NEQ t7 = addition {$node = new NotEqual($node, $t7.node);}		
	)*;

addition returns [ASTNode node]:
	t1 = factor{$node = $t1.node;} 
	(PLUS t2 = factor {$node = new Addition($node, $t2.node);}
	|MINUS t2 = factor {$node = new Substraction($node, $t2.node);}
	)*;

factor returns [ASTNode node]:
	t1 = term{$node = $t1.node;}
	(MULT t2 = term {$node = new Multiplication($node, $t2.node);}
	|DIV t2 = term {$node = new Division($node, $t2.node);}
	)*;

term returns [ASTNode node]:
	NUMBER { $node = new Constant(Float.parseFloat($NUMBER.text));}
	|MINUS NUMBER { $node = new InverseAdd(Float.parseFloat($NUMBER.text));}
	|BOOLTRUE { $node = new Constant(Boolean.parseBoolean("True"));}
	|BOOLFALSE { $node = new Constant(Boolean.parseBoolean("False"));}
	|ID {$node = new Reference($ID.text);}
	|PAR_OPEN expression{$node = $expression.node;} PAR_CLOSE
	|STRING{
		String string = $STRING.text;
		$node = new Constant(string.substring(1, string.length()-1));
	}
	|executeFun {$node = $executeFun.node;}
	;


executeFun returns [ASTNode node]:
	{
		List<ASTNode> arguments = new ArrayList<ASTNode>();	
	}
	ID PAR_OPEN (p1 = expression{arguments.add($p1.node);})?
	(COMMA p2 = expression{arguments.add($p2.node);})*
	PAR_CLOSE
	{
		$node = new ExecuteFun($ID.text, arguments);	
	};


//Sentencias del robot
movUp returns [ASTNode node]: UP expression SEMICOLON {
	System.out.println("ARRIBA ");
	$node = new MovUp(this.bot,$expression.node );
};

movDown returns [ASTNode node]:DOWN expression SEMICOLON{
	System.out.println("ABAJO ");
	$node = new MovDown(this.bot,$expression.node );
	
};
movRight returns [ASTNode node]: RIGHT expression SEMICOLON{
	System.out.println("DERECHA ");
	$node = new MovRight(this.bot,$expression.node );
	
};
movLeft returns [ASTNode node]: LEFT expression SEMICOLON{
	System.out.println("IZQUIERDA ");
	$node = new MovLeft(this.bot,$expression.node );
};
// Los tokens se escriben a continuación de estos comentarios.
// Todo lo que esté en líneas previas a lo modificaremos cuando hayamos visto Análisis Sintáctico



//------------COMANDOS ROBOT
UP:'^';
DOWN:'V';
LEFT: '<';
RIGHT: '>';
PICK: 'P';
DROP: 'D';


//-------------VARIABLES
ASSIGNVAR: '<-';
SEMICOLON: ';';
VAR:'\'';





//----------------CONDICIONALES
IF: 'if';
ASSIGNFUN:'->';
ELSE: 'else';
END: 'end';


//-------------------CICLOS
WHILE:'while';

//----------IMPRESION Y LECTURA
READ:'?';
WRITE:'$';

//---------------EXPRESIONES ARIMETICAS
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
//INVERSO ADITIVO

//-------------------EXPRESIONES LOGICAS
AND: '&';
OR: '|';
NOT: '!';

//-------------EXPRESIONES DE COMPARACIONES
GT:'>';
LT:'<';
GEQ:'>=';
LEQ: '<=';
EQ: '=';
NEQ: '<>';

//------------------DECLARACION DE FUNCIONES
DEFINE: 'define';
RETURN: 'return';
PAR_OPEN:'(';
PAR_CLOSE:')';
COMMA:',';


//--------------TIPOS DE DATOS
NUMBER: [0-9]+('.'[0-9]+)?;
STRING:'"' ( '\\"' | . )*? '"';
BOOLTRUE:'@T';
BOOLFALSE:'@F';

//-------------VARIABLES
ID: [a-zA-Z_][a-zA-Z0-9_]*;




WS
:
	[ \t\r\n]+ -> skip
;