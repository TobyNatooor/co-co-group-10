grammar cc;

start : exp EOF ;

exps : exp
     | exps ',' exps
     ;

exp : SIGNAL
    | IDENTIFIER '(' exps ')'
    | '(' exp ')'
    | '/' exp
    | exp ('*' | ' ') exp
    | exp '+' exp
    ;

IDENTIFIER : [a-z] [a-zA-Z]*;
SIGNAL : [A-Z] [a-z]* ;

WHITESPACE : [ \n\t]+ -> skip ;

ANYTHING : . ;
