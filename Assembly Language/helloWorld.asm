.model small
.stack 100h
.data
    msg db 'Hello, world!$'   ; '$' ends the string for INT 21h
.code
main:
    mov ax, @data
    mov ds, ax

    mov ah, 09h     ; function to print string
    lea dx, msg     ; load offset of msg into dx
    int 21h         ; DOS interrupt to print string

    mov ah, 4Ch     ; function to exit program
    int 21h

end main
