.model small
.stack 100h

.data
msg db 'Displaying 9 stars', 0Ah, '$'  ; '$' is required for INT 21h, 0Ah = newline
s2  db '*********$',0   ; 9 stars followed by '$'

.code
main:
    mov ax, @data
    mov ds, ax

    ; Print message
    mov ah, 09h
    lea dx, msg
    int 21h

    ; Print stars
    mov ah, 09h
    lea dx, s2
    int 21h

    ; Exit to DOS
    mov ah, 4Ch
    int 21h
end main
