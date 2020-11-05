grammar Bot;

@header {

import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;

}


@parser::members {
	
Map<String,Object> symbolTable = new HashMap<String,Object>();

private Bot bot;

public BotParser(TokenStream input, Bot bot) {
    this(input);
    this.bot = bot;
}

}


program: sentence*;

sentence: movUp | movDown | movRight | movLeft | pick | drop  | defvar | asignvar
		| twicevar | conditionif | conditionifelse | conditionwhile| readscreen 
		|printscreen |function;

//Sentencias del robot
movUp: UP expression SEMICOLON {
	System.out.println("ARRIBA ");
	System.out.println($expression.value);
	bot.up((Integer)$expression.value);
};
movDown:DOWN expression SEMICOLON{
	System.out.println("ABAJO ");
	System.out.println($expression.value);
	bot.down((Integer)$expression.value);
};
movRight: RIGHT expression SEMICOLON{
	System.out.println("DERECHA ");
	System.out.println($expression.value);
	bot.right((Integer)$expression.value);
};
movLeft: LEFT expression SEMICOLON{
	System.out.println("IZQUIERDA ");
	System.out.println($expression.value);
	bot.left((Integer)$expression.value);
};

pick: PICK SEMICOLON{
	bot.pick();
};
drop: DROP SEMICOLON{
	bot.drop();
};

//Sentencia de variables
defvar: VAR ID SEMICOLON{
	 symbolTable.put($ID.text,0); 
};

asignvar: ID ASSIGNVAR  dato SEMICOLON
{
	symbolTable.put($ID.text,$dato.value);
	System.out.println($dato.value);
};

twicevar: VAR ID  ASSIGNVAR  dato SEMICOLON
{
	symbolTable.put($ID.text,$dato.value);
	System.out.println($dato.value);
};

//Sentencia de tipos de datos
dato returns [Object value]: NUMBER 
| BOOL TRUE  { $value = "True";} 
| BOOL FALSE { $value = "False";} 
| STRING ID STRING { $value =  $ID.text;} ;

//DEFINIR NUMERO CON DECIMALES
//number returns [Object value]:;
//booltrue returns [Object value]: BOOL TRUE;
//boolfalse returns [Object value]: BOOL FALSE;
//DEFINIR STRING 
//string returns [Object value]:STRING ID STRING { $value = $ID.text;} ;

//Sentencia de condicionales
conditionif:IF condition ASSIGNFUN sentence* END SEMICOLON ;
conditionifelse:IF condition ASSIGNFUN sentence* ELSE sentence* END SEMICOLON ;

//Sentencia de while
conditionwhile: WHILE condition ASSIGNFUN sentence* END SEMICOLON;




//DEFINIR POSIBLES CONDICIONES
condition:;

//Impresion y lectura de pantalla
readscreen:READ SEMICOLON;
printscreen:WRITE datoprint  SEMICOLON;

datoprint returns [Object value]:
ID { $value =  symbolTable.get($ID.text);} ;

function:DEFINE ID PAR_OPEN  VAR params PAR_CLOSE ASSIGNFUN sentence* END SEMICOLON ;

params:;

expression returns [Object value]: 
		NUMBER{$value = Integer.parseInt($NUMBER.text);}; 

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



//--------------TIPOS DE DATOS

NUMBER: [0-9]+; //COMPLETAR DECIMAL
STRING:'"';
BOOL:'@';
TRUE:'T';
FALSE:'F';

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
//FUNCION

//-------------VARIABLES
ID: [a-zA-Z_][a-zA-Z0-9_]*;

//----------------------INVOCACION DE FUNCIONES
//INVOCACION


WS
:
	[ \t\r\n]+ -> skip
;