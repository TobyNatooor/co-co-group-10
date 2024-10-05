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
VALUES : (0 | 1)+ ;
