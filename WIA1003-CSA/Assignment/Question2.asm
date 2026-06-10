INCLUDE Irvine32.inc

.data
    startNum DWORD 1                    ; Tracks the first number of the current row

.code
main PROC
    mov ecx, 8                          ; Outer loop runs 8 times (for 8 rows)

OuterLoop:
    push ecx                            ; Save outer loop counter to stack
    
    mov eax, startNum                   ; Number to print starts at 'startNum'
    mov ecx, 9
    sub ecx, startNum                   ; Inner loop runs (9 - startNum) times

InnerLoop:
    call WriteDec                       ; Print the number in EAX
    inc eax                             ; Increment number for the next print
    loop InnerLoop

    call Crlf                           ; Move to the next line
    inc startNum                        ; Increase starting number for the next row
    
    pop ecx                             ; Restore outer loop counter from stack
    loop OuterLoop

    exit
main ENDP
END main