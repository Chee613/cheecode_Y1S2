INCLUDE Irvine32.inc

.data
    promptMsg BYTE "Enter mark (0-100): ", 0
    gradeMsg  BYTE "Grade: ", 0

.code
main PROC
    mov edx, OFFSET promptMsg
    call WriteString
    call ReadDec                        ; Read unsigned integer into EAX

    mov edx, OFFSET gradeMsg
    call WriteString

    call CalcGrade                      ; Call custom procedure to determine grade
    call WriteChar                      ; Print the character returned in AL
    call Crlf

    exit
main ENDP

; ---------------------------------------------------------
; CalcGrade
; Receives: EAX (integer 0-100)
; Returns:  AL (ASCII character representing the grade)
; ---------------------------------------------------------
CalcGrade PROC
    cmp eax, 90
    jae AssignA                         ; If EAX >= 90, jump to AssignA
    cmp eax, 80
    jae AssignB                         ; If EAX >= 80, jump to AssignB
    cmp eax, 70
    jae AssignC                         ; If EAX >= 70, jump to AssignC
    cmp eax, 60
    jae AssignD                         ; If EAX >= 60, jump to AssignD
    jmp AssignF                         ; Else, it's an F

AssignA: 
    mov al, 'A'
    jmp Done
AssignB: 
    mov al, 'B'
    jmp Done
AssignC: 
    mov al, 'C'
    jmp Done
AssignD: 
    mov al, 'D'
    jmp Done
AssignF: 
    mov al, 'F'

Done:
    ret                                 ; Return to main program
CalcGrade ENDP

END main