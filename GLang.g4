// grammar for the language GLang

grammar GLang;

program: line+ EOF
    ;
    
line: stat NEWLINE ;

stat: semicolon_stat ';';

semicolon_stat: PRINT ID 
	| num_type_def ID '=' expr
	| ID '=' expr 
	| READ ID 
   ;

expr: value
    | value '+' expr
    | value '*' expr
    | value '-' expr
    | value '/' expr
    ;

value: ID 
    | INT
    | REAL
    ;
    
num_type_def: 'int' | 'real';

PRINT:    'print'
   ;

READ:    'read'
   ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

INT:   '0'..'9'+
    ;

REAL: [0-9]+ '.' [0-9]+
    ;

NEWLINE:    '\r'? '\n'
    ;

WS: [ \t\n\r\f]+ -> skip ;

