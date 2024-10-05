grammar cc;

start : cmd* EOF ;

cmd :  IDENTIFIER ':' exp
    ;

exps : exp
    | exps ',' exps
    ;

exp : SIGNAL
    | IDENTIFIER '(' exps ')'
    | IDENTIFIER '\''
    | exp '=' exp
    | '(' exp ')'
    | '/' exp
    | exp ('*' | ' ') exp
    | exp '+' exp
    ;

IDENTIFIER : [a-z] [a-zA-Z]*;
SIGNAL : [A-Z] [a-z]* ;

WHITESPACE : [ \r\n\t]+ -> skip ;

ANYTHING : . ;
