
grammar AssemblerParser;

import AssemblerLexer;

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

CX : C X;
CH : C H;
CL : C L;

DX : D X;
DH : D H;
DL : D L;
