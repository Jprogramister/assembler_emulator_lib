mov AX , 1
add ax, 2
mov bx, 1
sub ax, bx
SOME_LABEL:
push ax
pop ax
jmp SOME_LABEL
