
grammar Assembler;

programm: stat+;

stat
    : unaryOperation NEWLINE
    | binaryOperation NEWLINE
    | instruction NEWLINE
    | labelDef NEWLINE
    ;

// definition of label for usage in jmp instruction
labelDef: ID ':';

// operations with once argument
unaryOperation
    : unaryOperator NUMBER # unaryOperationConst
    | unaryOperator register # unaryOperationRegister
    ;

unaryOperator
    : PUSH
    | POP
    ;

// operations with two arguments
binaryOperation
    : binaryOperator register COMMA register  # binaryExprRegisters
    | binaryOperator register COMMA NUMBER # binaryExprRegisterConst
    ;

binaryOperator
    : MOV
    | ADD
    | SUB
    | DIV
    | MUL
    ;

// instructions which have not results of execution
instruction
    : CALL
    | RET
    | JMP
    ;

register
    : commonRegister // registers for common usage
    | codeRegister // registers for code navigation
    | stackRegister // registers for stack navigation
    | dataRegister // registers for data navigation
    ;

codeRegister: CS | CP;
CS : C S;
CP : C P;

stackRegister: SS | SP;
SS : S S;
SP : S P;

dataRegister: DS | DP;
DS : D S;
DP : D P;

commonRegister
    : AX | AL | AH
    | BX | BH | BL
    | CX | CH | CL
    | DX | DH | DL
    ;

AX : A X;
AL : A L;
AH : A H;

BX : B X;
BH : B H;
BL : B L;


PUSH : P U S H;
POP : P O P;
MOV : M O V;
ADD : A D D;
SUB : S U B;
DIV : D I V;
MUL : M U L;
CALL : C A L L;
RET : R E T;
JMP : J M P;

fragment P : ('p'|'P');
fragment B : ('b'|'B');
fragment D : ('d'|'D');
fragment C : ('c'|'C');
fragment A : ('a'|'A');
fragment L : ('l'|'L');
fragment H : ('h'|'H');
fragment X : ('x'|'X');
fragment S : ('s'|'S');
fragment U : ('u'|'U');
fragment O : ('o'|'O');
fragment M : ('m'|'M');
fragment V : ('v'|'V');
fragment I : ('i'|'I');
fragment R : ('r'|'R');
fragment E : ('e'|'E');
fragment T : ('t'|'T');
fragment J : ('j'|'J');

COMMA: ',';
NUMBER: HEX_NUMBER | INT;
HEX_NUMBER: [0-9A-Z][0-9A-Z][0-9A-Z][0-9A-Z][hH];
INT : [0-9]+;
NEWLINE : '\r'? '\n';
WS : [ \t]+ -> skip;

fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;
fragment DIGIT : [0-9] ;
ID : LETTER (LETTER|DIGIT)*;