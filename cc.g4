grammar cc;

start : scs+=section* EOF;

// =============== GRAMMAR ================

section  : s='hardware' ':' t=~('//' | '/*' | '*/')             # Hardware      
         | s='inputs' ':' x+=IDENTIFIER+                        # Inputs
         | s='outputs' ':' x+=IDENTIFIER+                       # Outputs
         | s='latches' ':' x+=IDENTIFIER+                       # Latches
         | ('def' ':' d+=def)+                                  # Definitions
         | s='updates' ':' u+=updt+                             # Updates       
         | s='siminputs' ':' v+=value+                          # Siminputs
         ;

value: x=IDENTIFIER '=' v=VALUE      # Val
     ;

def : x=IDENTIFIER '(' a+=IDENTIFIER (',' a+=IDENTIFIER)* ')' '=' e=exp # Define
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
    | x=IDENTIFIER '\''                    # Pri
    | v=IDENTIFIER '(' e+=exp (',' e+=exp)* ')'   # FunCall
    | e1=exp '*' e2=exp             # AndA
    | e1=exp e2=exp                 # AndB
    | e1=exp '+' e2=exp              # Or
    ;

// =============== TOKENS ================

IDENTIFIER : [a-zA-Z] [a-zA-Z0-9]*;
VALUE : [0-1]+ ;

// =============== SKIPPING ================

LN_COMMENT : '//' ~[\r\n]* -> skip;
BLK_COMMENT : '/*' .*? '*/' -> skip;
WHITESPACE : [ \r\t\n]+ -> skip ;

ANYTHING : . ;