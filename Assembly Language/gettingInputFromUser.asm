.model small
.stack 100h

.data
    msg1 db 'Enter a number (0-9): $'
    msg2 db 0Dh, 0Ah, 'You entered: $'

.code
main:
    mov ax, @data
    mov ds, ax

    ; Show prompt message
    mov ah, 09h
    lea dx, msg1
    int 21h

    ; Read a character from keyboard
    mov ah, 01h
    int 21h
    mov bl, al   ; store input in BL

    ; Print newline + message
    mov ah, 09h
    lea dx, msg2
    int 21h

    ; Print the character (in BL)
    mov dl, bl
    mov ah, 02h
    int 21h

    ; Exit to DOS
    mov ah, 4Ch
    int 21h

end main
