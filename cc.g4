grammar cc;

start : section* EOF;

// =============== GRAMMAR ================

section  : s='hardware' ':' t=~('//' | '/*' | '*/')             # Hardware      
         | s='inputs' ':' x=ids                                 # Inputs
         | s='outputs' ':' x=ids                                # Outputs
         | s='latches' ':' x=ids                                # Latches
         | s='def' ':' x=IDENTIFIER '(' a=args ')' '=' e=exp    # Def    
         | s='updates' ':' u=updt+                              # Updates       
         | s='siminputs' ':' v=value+                           # Siminputs
         ;

ids : IDENTIFIER
    | ids IDENTIFIER
    ;

value: x=IDENTIFIER '=' v=VALUE      # Val
     ;     

updt: x=IDENTIFIER '=' e=exp     # Update
    ;    

args : a=IDENTIFIER         # ArgUni
     | a=args ',' b=args    # ArgMulti
     ;

exps : e=exp                # ExUni
     | e1=exp ',' e2=exps   # ExMulti
     ;

exp : x=IDENTIFIER                  # Var
    | '(' e=exp ')'                 # Paren
    | '/' e=exp                     # Ne
    | e=exp '\''                    # Pri
    | v=IDENTIFIER '(' e=exps ')'   # FunCall
    | e1=exp '*' e2=exp             # AndA
    | e1=exp e2=exp                 # AndB
    | e1=exp '+' e=exp              # Or
    ;

// =============== TOKENS ================

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]*;
VALUE : [0-1]+ ;

// =============== SKIPPING ================

LN_COMMENT : '//' ~[\r\n]* -> skip;
BLK_COMMENT : '/*' .*? '*/' -> skip;
WHITESPACE : [ \r\t\n]+ -> skip ;

ANYTHING : . ;