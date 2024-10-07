grammar cc;

start : section* EOF;

// =============== GRAMMAR ================

section  : 'hardware' DECLARE ~('//' | '/*' | '*/')
         | 'inputs' DECLARE IDENTIFIER+
         | 'outputs' DECLARE IDENTIFIER+
         | 'latches' DECLARE IDENTIFIER+
         | 'def' DECLARE IDENTIFIER '(' args ')' '=' exp
         | 'updates' DECLARE updt+
         | 'siminputs' DECLARE value+
         ;

value: IDENTIFIER EQUALS VALUE;

updt: IDENTIFIER EQUALS exp+;

args : IDENTIFIER
     | args ',' args
     ;

exps : exp
     | exp ',' exps
     ;

exp : IDENTIFIER
    | '(' exp ')'
    | NEG exp
    | exp PRIME
    | IDENTIFIER '(' exps ')'
    | exp '*' exp
    | exp exp
    | exp '+' exp
    ;

// =============== TOKENS ================

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]*;
SIGNAL : [a-zA-Z] [a-zA-Z0-9]* ;
DECLARE : ':';
PARENS : '(' | ')';
NEG : '/';
PRIME : '\'';
EQUALS : '=';
VALUE : [0-1]+ ;
LNSKIP : '\n';

// =============== SKIPPING ================

LN_COMMENT : '//' ~[\r\n]* -> skip;
BLK_COMMENT : '/*' .*? '*/' -> skip;
WHITESPACE : [ \r\t\n]+ -> skip ;

ANYTHING : . ;