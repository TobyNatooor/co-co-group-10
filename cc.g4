grammar cc;

start : (cmd)* EOF ;

cmd : IDENTIFIER DECLARE IDENTIFIER
    | IDENTIFIER DECLARE exp
    ;

args : IDENTIFIER
    | args ',' args
    ;

exps : exp
    | exps ',' exp
    ;

exp : SIGNAL
    | NEG exp
    | exp PRIME
    | IDENTIFIER '(' args ')' '=' exp
    | IDENTIFIER '(' exps ')'
    | exp ('*') exp
    | exp exp
    | exp EQUALS exp
    | exp EQUALS VALUE
    | IDENTIFIER
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
