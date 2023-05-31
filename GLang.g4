// grammar for the language GLang

grammar GLang;

program: line+ EOF
    ;
    
line: semicolonStat ';' NEWLINE
    ;

semicolonStat: PRINT ID         #print
	| NUMTYPE ID ASSIGN expr #assignNew
	| ID ASSIGN expr            #assign
    | NUMTYPE ID             #declare
	| READ ID                   #read
   ;

expr: value #singleExpression
    | value operator expr #operatorExpression
    ;
    
operator: ADD #add
    | MULTIPLY #multiply
    | SUBTRACT #subtract
    | DIVIDE #divide
    ;

value: ID 
    | INT
    | REAL
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

WS: [ \t\n\r\f]+ -> skip ;
