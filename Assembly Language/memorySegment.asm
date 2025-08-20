segment.text    ;code segment
    global _start   ;must be declare for linker
    
_start:     ;tell linker entry point
    mov edx,len     ;message length
    mov ecx,msg     ;message to write
    mov ebx,1       ;file descriptor
    mov eax,4       ;system call number(sys_write)
    