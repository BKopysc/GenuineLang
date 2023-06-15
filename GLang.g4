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

functionLine: instructionStat
    | semicolonStat ';'
    ;

functionStat: FUNCTION_OP functionHeader nestedFunctionBlock returnStat END_OP #functionDef
    ;

functionParams: (NUMTYPE ID (',' NUMTYPE ID)*)?
    ;

functionHeader: functionInit '(' functionParams ')' DO_OP NEWLINE
    ;

functionInit: NUMTYPE ID
    ;

semicolonStat: PRINT ID         #print
    | ID functionCall              #singleCall
	| NUMTYPE ID ASSIGN expr #assignNew
	| ID ASSIGN expr            #assign
    | NUMTYPE ID             #declare
	| READ ID                   #read
   ;

functionCall: '(' (expr (',' expr)*)?  ')'
    ;

// functionCallParams: (expr (',' expr)*)? 
//     ;

returnStat: 'return' value ';' NEWLINE
;

instructionStat: instructionStatChild
    ;

instructionStatChild: IF_OP ifCondition DO_OP nestedBlock END_OP #singleIf
     | IF_OP ifCondition DO_OP nestedBlock ELSE_OP elseBlock END_OP #ifElse
     | WHILE_OP elseCondition DO_OP nestedBlock END_OP #while
    ;

elseBlock: nestedBlock #nestedElseBlock
    ;

ifCondition: condition 
    ;

elseCondition: condition 
    ;

condition: expr EQUAL expr #equalCondition
    | expr GREATER expr #greaterCondition
    | expr LESS expr #lessCondition
    | expr GREATER_EQUAL expr #greaterEqualCondition
    | expr LESS_EQUAL expr #lessEqualCondition
    | expr NOT_EQUAL expr #notEqualCondition
    ;

expr: value #singleExpression
    | value ADD expr #addExpression
	| value SUBTRACT expr #subtractExpression
    | value MULTIPLY expr #multiplyExpression
	| value DIVIDE expr #divideExpression
    | ID functionCall #functionCallExpression
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

EQUAL: '==';
NOT_EQUAL: '!=';
GREATER: '>';
LESS: '<';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';
IF_OP: 'if';
DO_OP: 'do';
ELSE_OP: 'else';
END_OP: 'end';
WHILE_OP: 'while';
FUNCTION_OP: 'function';

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
