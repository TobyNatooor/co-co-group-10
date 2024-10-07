grammar cc;

start : (IDENTIFIER | SIGNAL | DECLARE | PARENS | NEG | PRIME | EQUALS | VALUE)* EOF ;



IDENTIFIER : [a-z] [a-zA-Z]*;
SIGNAL : [A-Z] [a-z]* ;
DECLARE : ':';
PARENS : '(' | ')';
NEG : '/';
PRIME : '\'';
EQUALS : '=';
VALUE : [0-1]+ ;
WHITESPACE : [ \r\n\t]+ -> skip ;

ANYTHING : . ;
