// grammar for the language GLang

grammar GLang;

program: line+ EOF
    ;
    
line: semicolonStat ';' NEWLINE
    ;

semicolonStat: PRINT ID 
	| numTypeDef ID ASSIGN expr
	| ID ASSIGN expr 
	| READ ID 
   ;

expr: value
    | value operator expr
    ;
    
operator: ADD
    | MULTIPLY
    | SUBTRACT
    | DIVIDE
    ;

value: ID 
    | INT
    | REAL
    ;

numTypeDef: 'int' | 'real';

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

WS: [ \t\n\r\f]+ -> skip ;
