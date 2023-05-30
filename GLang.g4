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


