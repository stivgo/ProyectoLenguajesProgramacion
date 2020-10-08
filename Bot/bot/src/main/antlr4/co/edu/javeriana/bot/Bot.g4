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


program:
	sentence*;

sentence: movUp | movDown | movRight | movLeft;

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
ID: [a-zA-Z_][a-zA-Z0-9_]*;
ASSIGN: '<-';
SEMICOLON: ';';
VAR:'\'';
STRING:'"';
BOOL:'@';
//DECLARAR VARIABLE
//ASIGNAR VARIABLE
//ASIGNACION DECLARACION DE VARIABLES


//--------------TIPOS DE DATOS
//STRING
NUMBER: [0-9]+; //COMPLETAR DECIMAL
//BOOL

//----------------CONDICIONALES
IF: 'if';
ASIGNIF:'->';
ELSE: 'else';
END: 'end';


//-------------------CICLOS
WHILE:'while';

//----------IMPRESION Y LECTURA
//LECTURA
//ESCRITURA

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


//----------------------INVOCACION DE FUNCIONES
//INVOCACION


WS
:
	[ \t\r\n]+ -> skip
;