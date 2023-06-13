// grammar for the language GLang

grammar GLang;

program: startBlock
    ;
    
startBlock: (defaultLine? NEWLINE)* 
;

nestedBlock: (basicLine? NEWLINE)*
;

nestedFunctionBlock: (functionLine? NEWLINE)*
;

defaultLine: functionStat
| basicLine
;

basicLine: instructionStat
| semicolonStat ';'
    ;

functionLine: returnStat
    | instructionStat
    | semicolonStat ';'
    ;

functionStat: FUNCTION_OP NUMTYPE ID '(' functionParams ')' DO_OP nestedFunctionBlock END_OP #functionDef
    ;

functionParams: (NUMTYPE ID (',' NUMTYPE ID)*)?
    ;

semicolonStat: PRINT ID         #print
    | functionCall              #call
	| NUMTYPE ID ASSIGN expr #assignNew
	| ID ASSIGN expr            #assign
    | NUMTYPE ID             #declare
	| READ ID                   #read
   ;

functionCall: ID '(' functionCallParams ')'
    ;

functionCallParams: (expr (',' expr)*)? 
    ;

returnStat: 'return' value ';'
;


expr: value #singleExpression
    | value ADD expr #addExpression
    | value MULTIPLY expr #multiplyExpression
    | value SUBTRACT expr #subtractExpression
    | value DIVIDE expr #divideExpression
    | functionCall #functionCallExpression
    ;

value: ID #valueID
    | INT #valueINT
    | REAL #valueREAL
    ;



NUMTYPE: 'int' | 'real';

PRINT:	'print'
   ;

READ:	'read'
   ;


ID:   ('a'..'z'|'A'..'Z')+
   ;


INT:   '0'..'9'+
    ;

REAL: [0-9]+ '.' [0-9]+
    ;

NEWLINE:	'\r'? '\n'
    ;

ASSIGN: '=';
ADD: '+';
MULTIPLY: '*';
SUBTRACT: '-';
DIVIDE: '/';



WS: [ \t\r\f]+ -> skip ;
