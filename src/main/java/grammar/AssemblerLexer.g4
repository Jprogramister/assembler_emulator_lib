
lexer grammar AssemblerLexer;

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

NUMBER: HEX_NUMBER | INT;
HEX_NUMBER: [0-9A-Z][0-9A-Z][0-9A-Z][0-9A-Z][hH];
INT : [0-9]+;
NEWLINE : '\r'? '\n';
WS : [ \t]+ -> skip;

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

fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;
fragment DIGIT : [0-9] ;
ID : LETTER (LETTER|DIGIT)*;