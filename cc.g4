grammar cc;

start : exp* EOF ;

exps : exp
    | exps ',' exps
    ;

exp : SIGNAL                    // Signal
    | exp '*' exp               // And
    // | exp ('*' | ' ') exp
    // | exp exp
    | exp '+' exp               // Or
    | '/' SIGNAL                // Negation
    | IDENTIFIER '(' exps ')'   // Definitions
    | exp '\''
    | '(' exp ')'
    | exp '=' exp
    | exp '=' VALUE
    | IDENTIFIER ':' exp
    | IDENTIFIER ':' IDENTIFIER
    ;

// Apostrophe before forward slash?
// SIGNAL != exp?


IDENTIFIER : [a-z] [a-zA-Z]* ;
SIGNAL : [A-Z] [a-z]* ;
VALUE : [0-9]* ;

WHITESPACE : [ \r\n\t]+ -> skip ;

ANYTHING : . ;
