grammar cc;

start : thing* EOF ;

thing : NAME':'(NAME|NUM) ;

NAME : [a-zA-Z]+ ;

NUM : [0-9]+ ;

WHITESPACE : [ \n\t]+ -> skip ;

ANYTHING : . ;
