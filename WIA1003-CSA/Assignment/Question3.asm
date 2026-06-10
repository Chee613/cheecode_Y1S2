INCLUDE Irvine32.inc

.data
    promptMsg BYTE "Enter 32-bit integer : ", 0
    resultMsg BYTE "The sum of 32-bit integers is : ", 0
    myArray   DWORD 3 DUP(?)            ; Uninitialized array to hold 3 integers

.code
main PROC
    ; --- Phase 1: Get Inputs ---
    mov ecx, 3                          ; Loop 3 times
    mov esi, OFFSET myArray             ; Point ESI to the start of the array

InputLoop:
    mov edx, OFFSET promptMsg
    call WriteString
    call ReadInt                        ; Read signed integer into EAX
    mov [esi], eax                      ; Store EAX into the array
    add esi, TYPE myArray               ; Move pointer to next DWORD (add 4)
    loop InputLoop

    ; --- Phase 2: Calculate Sum ---
    mov ecx, 3                          ; Reset loop counter
    mov esi, OFFSET myArray             ; Reset pointer to the start of the array
    mov eax, 0                          ; Clear EAX to hold the sum

SumLoop:
    add eax, [esi]                      ; Add current array element to sum
    add esi, TYPE myArray               ; Move pointer to next element
    loop SumLoop

    ; --- Phase 3: Display Results ---
    mov edx, OFFSET resultMsg
    call WriteString
    call WriteInt                       ; WriteInt outputs with a '+' or '-' sign
    call Crlf

    exit
main ENDP
END main
