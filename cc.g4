grammar cc;

start : (cmd)* EOF ;

cmd : IDENTIFIER DECLARE exp
    | IDENTIFIER DECLARE IDENTIFIER
    ;

exp : SIGNAL
    | NEG exp
    | exp PRIME
    | exp ('*') exp
    | exp exp
    | exp EQUALS exp
    | exp EQUALS VALUE
    ;

IDENTIFIER : [a-z] [a-zA-Z]*;
SIGNAL : [A-Z] [a-z]* ;
DECLARE : ':';
PARENS : '(' | ')';
NEG : '/';
PRIME : '\'';
EQUALS : '=';
VALUE : [0-1]+ ;
SPACE : ' ' -> channel(HIDDEN) ;
WHITESPACE : [\r\n\t]+ -> skip ;

ANYTHING : . ;
