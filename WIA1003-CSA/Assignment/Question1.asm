INCLUDE Irvine32.inc

.data
    ; Array elements are WORD type as requested
    valArray WORD 0, 2, 5, 9, 10
    
.code
main PROC
    mov esi, 0                          ; Initialize index to 0
    mov ecx, (LENGTHOF valArray) - 1    ; Loop count = number of gaps (4)
    mov eax, 0                          ; EAX will store the total sum

GapLoop:
    movzx ebx, valArray[esi + 2]        ; Move NEXT element into EBX (zero-extended)
    movzx edx, valArray[esi]            ; Move CURRENT element into EDX (zero-extended)
    
    sub ebx, edx                        ; Calculate gap: EBX = EBX - EDX
    add eax, ebx                        ; Add the gap to the total sum
    
    add esi, TYPE valArray              ; Move index to the next WORD (add 2)
    loop GapLoop

    call DumpRegs                       ; Display registers (EAX will show 0000000A)
    exit
main ENDP
END main