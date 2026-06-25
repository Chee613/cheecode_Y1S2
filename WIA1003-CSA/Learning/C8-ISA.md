# Chapter 8: Instruction Set Architecture

## 1. Machine Instruction

A **machine instruction** is a command that the processor can understand and execute.

Simple idea:

```text
Machine instruction = CPU-level command
```

Example assembly-like instructions:

```assembly
LOAD R1, A
ADD R1, R2
STORE X, R1
```

Meaning:

```text
LOAD R1, A   → R1 ← Memory[A]
ADD R1, R2   → R1 ← R1 + R2
STORE X, R1  → Memory[X] ← R1
```

The lecture says the operation of a processor is determined by the instructions it executes, called machine instructions or computer instructions. A collection of instructions that a processor can execute is called the **instruction set**. 

---

## 2. Instruction Set

An **instruction set** is the full collection of commands that a CPU can execute.

Simple analogy:

```text
Instruction set = CPU vocabulary
```

Example instruction set may contain:

```text
ADD
SUB
MUL
DIV
LOAD
STORE
MOV
JUMP
CALL
RETURN
```

Different CPUs may have different instruction sets.

---

## 3. Elements of a Machine Instruction

A machine instruction usually contains several elements:

| Element                    | Meaning                                             |
| -------------------------- | --------------------------------------------------- |
| Opcode                     | Operation code, tells CPU what operation to perform |
| Source operand reference   | Where the input data comes from                     |
| Result operand reference   | Where to store the result                           |
| Next instruction reference | Where to fetch the next instruction                 |

The lecture states that an instruction may contain an opcode, source operand reference, result operand reference, and next instruction reference. The opcode is represented by a binary code. 

Example:

```assembly
ADD R1, R2
```

Possible meaning:

```text
Opcode = ADD
Source operand = R2
Result operand = R1
```

For a two-address style:

```text
R1 ← R1 + R2
```

---

## 4. Operand Locations

An operand is the data used by an instruction.

Example:

```assembly
ADD R1, R2
```

`R1` and `R2` are operands.

The lecture lists these possible operand locations:

| Operand location       | Example        |
| ---------------------- | -------------- |
| Main or virtual memory | `LOAD R1, A`   |
| Processor register     | `ADD R1, R2`   |
| Immediate value        | `MOV R1, #5`   |
| I/O device             | `IN R1, PORT1` |



---

## 5. Important Difference: Address vs Content

This is a common exam mistake.

Given:

```text
Memory[1000] = 25
```

Instruction:

```assembly
LOAD R1, 1000
```

Usually means:

```text
R1 ← Memory[1000]
R1 ← 25
```

It does **not** mean:

```text
R1 ← 1000
```

Unless immediate addressing is used:

```assembly
MOV R1, #1000
```

Then:

```text
R1 ← 1000
```

---

## 6. Instruction Format

An **instruction format** is the bit layout of an instruction.

Example 16-bit instruction:

```text
+--------+----------+----------+
| Opcode | Register | Address  |
+--------+----------+----------+
| 4 bits | 4 bits   | 8 bits   |
+--------+----------+----------+
```

Meaning:

```text
Opcode field  = tells operation
Register field = tells register number
Address field = tells memory address
```

Important calculations:

```text
4-bit opcode field  → 2^4 = 16 possible operations
4-bit register field → 2^4 = 16 possible registers
8-bit address field → 2^8 = 256 possible addresses
```

The lecture says an instruction is represented by a sequence of bits divided into fields, and the processor reads the instruction into the instruction register, then extracts the fields. 

---

## 7. Mnemonics

A **mnemonic** is a human-readable abbreviation for a machine instruction.

Examples:

| Mnemonic     | Meaning          |
| ------------ | ---------------- |
| ADD          | Add              |
| SUB          | Subtract         |
| MUL          | Multiply         |
| DIV          | Divide           |
| LOAD         | Load from memory |
| STOR / STORE | Store to memory  |

The CPU does not store the word `ADD` as letters. It stores a binary opcode. Mnemonics are mainly for humans. The lecture gives examples such as `ADD`, `SUB`, `MUL`, `DIV`, `LOAD`, and `STOR`. 

---

## 8. Instruction Types

The lecture groups instruction types into four main categories: **data processing**, **data storage**, **data movement**, and **control**. 

| Instruction type | Meaning                            | Examples                  |
| ---------------- | ---------------------------------- | ------------------------- |
| Data processing  | Arithmetic and logic operations    | `ADD`, `SUB`, `AND`, `OR` |
| Data storage     | Move data between memory/registers | `LOAD`, `STORE`, `MOV`    |
| Data movement    | I/O operations                     | `IN`, `OUT`               |
| Control          | Test and branch                    | `CMP`, `JUMP`, `BRZ`      |

---

## 9. Data Processing Instructions

Data processing instructions perform arithmetic or logical operations.

Examples:

```assembly
ADD R1, R2
SUB R1, R2
MUL R1, R2
DIV R1, R2
AND R1, R2
OR R1, R2
```

Example:

```text
R1 = 10
R2 = 3
ADD R1, R2
R1 = 13
```

---

## 10. Data Storage Instructions

Data storage instructions move data between memory and registers.

Examples:

```assembly
LOAD R1, A
STORE X, R1
MOV R1, R2
```

Meanings:

```text
LOAD R1, A    → R1 ← Memory[A]
STORE X, R1   → Memory[X] ← R1
MOV R1, R2    → R1 ← R2
```

Common mistake:

```text
LOAD = memory to register
STORE = register to memory
```

---

## 11. Data Movement Instructions

In this chapter, **data movement** mainly means I/O.

Examples:

```assembly
IN R1, KEYBOARD
OUT SCREEN, R1
```

Meaning:

```text
IN R1, KEYBOARD  → read input into R1
OUT SCREEN, R1   → send R1 to output device
```

---

## 12. Control Instructions

Control instructions change the normal instruction sequence.

Examples:

```assembly
JUMP 200
BRZ 300
CALL PROC1
RETURN
```

Normal flow:

```text
100 → 101 → 102 → 103
```

With jump:

```text
100 → 200 → 201
```

A branch changes the **Program Counter, PC**.

---

# 13. Number of Addresses in Instructions

The lecture explains instruction formats based on how many addresses are contained in each instruction. 

## 13.1 Four-address instruction idea

A full instruction could theoretically contain:

```text
1. Source operand 1
2. Source operand 2
3. Destination/result operand
4. Next instruction address
```

Example:

```assembly
ADD X, A, B, NEXT
```

Meaning:

```text
X ← A + B
Next instruction = NEXT
```

But most machines do not explicitly include the next instruction address because the **PC** automatically gives the next instruction.

---

## 13.2 Three-address instruction

Format:

```assembly
OP A, B, C
```

Meaning:

```text
A ← B OP C
```

Example:

```assembly
ADD X, A, B
```

Meaning:

```text
X ← A + B
```

Advantage:

```text
Clear and fewer instructions needed.
```

Disadvantage:

```text
Instruction is longer because it contains three addresses.
```

---

## 13.3 Two-address instruction

Format:

```assembly
OP A, B
```

Meaning:

```text
A ← A OP B
```

Example:

```assembly
ADD R1, R2
```

Meaning:

```text
R1 ← R1 + R2
```

To calculate:

```text
X = A + B
```

Two-address version:

```assembly
MOVE X, A
ADD X, B
```

---

## 13.4 One-address instruction

One-address machines use an implicit accumulator, `AC`.

Format:

```assembly
OP A
```

Meaning:

```text
AC ← AC OP A
```

Example:

```assembly
LOAD A
ADD B
STORE X
```

Meaning:

```text
AC ← A
AC ← AC + B
X ← AC
```

So:

```text
X = A + B
```

---

## 13.5 Zero-address instruction

Zero-address machines use a stack.

Example:

```assembly
PUSH A
PUSH B
ADD
POP X
```

Meaning:

```text
Push A
Push B
ADD top two stack values
Pop result into X
```

---

## 13.6 Address format summary

| Type      | Format       | Meaning              |
| --------- | ------------ | -------------------- |
| 3-address | `OP A, B, C` | `A ← B OP C`         |
| 2-address | `OP A, B`    | `A ← A OP B`         |
| 1-address | `OP A`       | `AC ← AC OP A`       |
| 0-address | `OP`         | Use top stack values |

---

# 14. Tutorial 8 Question 7

Question:

```text
X = (A + B × C) / (D − E × F)
```

Write instructions for one-address, two-address, and three-address machines. Tutorial 8 gives this expression and provides allowed operations such as `LOAD`, `STORE`, `ADD`, `SUB`, `MUL`, `DIV`, and `MOVE`. 

---

## 14.1 Three-address solution

```assembly
MUL R1, B, C      ; R1 ← B × C
ADD R1, A, R1     ; R1 ← A + B × C

MUL R2, E, F      ; R2 ← E × F
SUB R2, D, R2     ; R2 ← D − E × F

DIV X, R1, R2     ; X ← R1 / R2
```

---

## 14.2 Two-address solution

```assembly
MOVE R1, B
MUL  R1, C
ADD  R1, A

MOVE R2, E
MUL  R2, F

MOVE R3, D
SUB  R3, R2

DIV  R1, R3
MOVE X, R1
```

Meaning:

```text
R1 = A + B × C
R3 = D − E × F
X = R1 / R3
```

---

## 14.3 One-address solution

```assembly
LOAD E
MUL  F
STORE T1

LOAD D
SUB  T1
STORE T2

LOAD B
MUL  C
ADD  A

DIV  T2
STORE X
```

Meaning:

```text
T1 = E × F
T2 = D − E × F
AC = A + B × C
X = AC / T2
```

---

## 14.4 Common mistake in Tutorial 8 Q7

Wrong denominator:

```assembly
MOVE R2, E
MUL  R2, F
SUB  R2, D
```

This gives:

```text
R2 = E × F − D
```

But we need:

```text
D − E × F
```

Correct:

```assembly
MOVE R2, E
MUL  R2, F
MOVE R3, D
SUB  R3, R2
```

---

# 15. Instruction Set Design Issues

Tutorial 8 asks for five important instruction set design issues. The lecture lists: **operation repertoire, data types, instruction format, registers, and addressing**.  

| Design issue         | Meaning                                                |
| -------------------- | ------------------------------------------------------ |
| Operation repertoire | Which operations are provided and how complex they are |
| Data types           | What types of data instructions can operate on         |
| Instruction format   | Instruction length, field sizes, number of addresses   |
| Registers            | Number and use of processor registers                  |
| Addressing           | How operands are specified or located                  |

Exam-style answer:

```text
The five important instruction set design issues are operation repertoire,
data types, instruction format, registers, and addressing.

Operation repertoire decides what operations are provided and how complex they are.

Data types decide what kinds of data the instructions can operate on.

Instruction format decides instruction length, number of addresses, and field sizes.

Registers decide how many processor registers can be referenced and how they are used.

Addressing decides the modes used to specify operand locations.
```

---

# 16. Types of Operands

The lecture lists four important operand types: **addresses, numbers, characters, and logical data**. 

---

## 16.1 Addresses

An address tells the CPU where data is stored.

Example:

```assembly
LOAD R1, 1000
```

Meaning:

```text
R1 ← Memory[1000]
```

---

## 16.2 Numbers

Numbers are used for arithmetic.

Common number types:

```text
1. Binary integer / fixed point
2. Binary floating point
3. Decimal / packed decimal
```

Example:

```text
4-bit unsigned range = 0000 to 1111 = 0 to 15
```

Overflow example:

```text
15 + 1 = 16
```

But 16 cannot fit in 4 bits.

---

## 16.3 Packed decimal

Packed decimal stores each decimal digit using 4 bits.

Example:

```text
246
```

Digits:

```text
2 = 0010
4 = 0100
6 = 0110
```

Packed decimal:

```text
0010 0100 0110
```

---

## 16.4 Characters

Characters are text symbols represented using binary codes.

Examples:

```text
'A'
'B'
'7'
'?'
space
newline
```

ASCII / IRA uses 7-bit patterns:

```text
2^7 = 128 possible characters
```

Example:

```text
'A' = 65 decimal = 01000001 binary
```

The lecture also mentions EBCDIC, an 8-bit character code used on IBM mainframes. 

---

## 16.5 Logical data

Logical data treats bits as separate true/false values.

Example:

```text
10110010
```

Can be seen as:

```text
1 0 1 1 0 0 1 0
```

Useful for:

```text
Flags
Masks
Bit manipulation
Boolean arrays
```

Example mask:

```text
  10110110
AND 00001111
=   00000110
```

---

# 17. Types of Operations

The lecture lists operation types such as data transfer, arithmetic, logical, conversion, transfer of control, and I/O. 

---

## 17.1 Data transfer operations

Data transfer operations move data from source to destination.

Examples:

```assembly
MOV R1, R2
LOAD R1, A
STORE X, R1
XCHG R1, R2
PUSH R1
POP R1
```

Meanings:

```text
MOV R1, R2    → R1 ← R2
LOAD R1, A    → R1 ← Memory[A]
STORE X, R1   → Memory[X] ← R1
XCHG R1, R2   → swap R1 and R2
PUSH R1       → put R1 on stack
POP R1        → take top stack value into R1
```

The lecture says data transfer instructions must specify source and destination locations, data length, and addressing mode. 

---

## 17.2 Arithmetic operations

Arithmetic operations perform mathematical calculations.

Examples:

```assembly
ADD R1, R2
SUB R1, R2
MUL R1, R2
DIV R1, R2
INC R1
DEC R1
NEG R1
ABS R1
```

Meanings:

```text
ADD R1, R2 → R1 ← R1 + R2
SUB R1, R2 → R1 ← R1 - R2
MUL R1, R2 → R1 ← R1 × R2
DIV R1, R2 → R1 ← R1 / R2
INC R1     → R1 ← R1 + 1
DEC R1     → R1 ← R1 - 1
NEG R1     → R1 ← -R1
ABS R1     → R1 ← |R1|
```

Arithmetic operations may set flags such as:

```text
Zero flag
Sign flag
Carry flag
Overflow flag
```

---

## 17.3 Logical operations

Logical operations work on bits.

Main logical operations:

| Operation | Rule                       |
| --------- | -------------------------- |
| NOT       | Flip each bit              |
| AND       | 1 only if both bits are 1  |
| OR        | 1 if at least one bit is 1 |
| XOR       | 1 if bits are different    |

The lecture table includes basic logical operations such as NOT, AND, OR, XOR, and equality. 

Examples:

```text
NOT 10110010 = 01001101
```

```text
  1100
AND 1010
=   1000
```

```text
  1100
OR  1010
=   1110
```

```text
  1100
XOR 1010
=   0110
```

---

# 18. Shift and Rotate Operations

The lecture explains logical shift, arithmetic shift, and rotate using examples in Figure 13.6 and Table 13.7. 

---

## 18.1 Logical shift

Logical shift moves bits left or right.

Rules:

```text
Bits shifted out are lost.
Empty positions are filled with 0.
```

Example logical right shift:

```text
10100110 >> 3 = 00010100
```

Example logical left shift:

```text
10100110 << 3 = 00110000
```

---

## 18.2 Arithmetic shift

Arithmetic shift treats the bit pattern as a signed integer.

Main rule:

```text
Preserve the sign bit.
```

Arithmetic right shift:

```text
10100110 arithmetic right shift 3 = 11110100
```

Why?

```text
Original sign bit = 1
So new left bits are filled with 1
```

Arithmetic left shift keeps the sign bit and shifts the remaining bits left according to the lecture table. 

---

## 18.3 Rotate

Rotate moves bits around without losing them.

Right rotate example:

```text
10100110 right rotate 3 = 11010100
```

Left rotate example:

```text
10100110 left rotate 3 = 00110101
```

Difference:

| Operation              | Bits lost? | Fill/wrap rule     |
| ---------------------- | ---------- | ------------------ |
| Logical shift          | Yes        | Fill with 0        |
| Arithmetic right shift | Yes        | Fill with sign bit |
| Rotate                 | No         | Bits wrap around   |

---

# 19. Tutorial 8 Question 5

Question:

```text
What is the difference between arithmetic shift and logical shift?
```

Answer:

```text
A logical shift moves all bits left or right. Bits shifted out are lost, and empty
positions are filled with 0.

An arithmetic shift treats the operand as a signed integer. For arithmetic right
shift, the sign bit is copied into the new leftmost positions to preserve the sign.
For arithmetic left shift, the sign bit is retained while the remaining bits shift left.
```

Tutorial 8 includes this question, and the lecture’s shift section explains the difference.  

---

# 20. Tutorial 8 Question 8

Original bit pattern:

```text
10101110
```

Shift or rotate by 4 bits. Tutorial 8 asks for logical right/left shift, arithmetic right/left shift, right rotate, and left rotate. 

Split into two 4-bit groups:

```text
1010 1110
```

Final answers:

| Operation                | Answer     |
| ------------------------ | ---------- |
| Logical right shift 4    | `00001010` |
| Logical left shift 4     | `11100000` |
| Arithmetic right shift 4 | `11111010` |
| Arithmetic left shift 4  | `11100000` |
| Right rotate 4           | `11101010` |
| Left rotate 4            | `11101010` |

Reasoning:

```text
Logical right shift fills left side with 0.
Arithmetic right shift fills left side with sign bit 1.
Logical left shift fills right side with 0.
Rotate wraps bits around, so no bit is lost.
```

---

# 21. Conversion Operations

Conversion operations change data from one representation to another.

Examples:

```text
Decimal to binary
Integer to floating point
Character code conversion
EBCDIC to ASCII / IRA
```

The lecture says conversion instructions change the format of data or operate on the format of data. 

Example idea:

```text
Character '7' ≠ numeric value 7
```

A program may need to convert character input into a number before arithmetic.

---

# 22. Transfer of Control Operations

Transfer of control operations change the normal sequence of instruction execution.

Examples:

```assembly
JUMP 200
BRZ 300
CALL PROC1
RETURN
```

The lecture explains transfer of control as operations that update the Program Counter and support branching, procedure calls, and returns. 

---

## 22.1 Why transfer of control is needed

Tutorial 8 asks why transfer of control instructions are needed. 

Answer:

```text
Transfer of control instructions are needed because programs do not always execute
sequentially. They allow the processor to change the normal instruction sequence by
updating the Program Counter. They are needed for decisions, loops, procedure calls,
returns, and error handling.
```

---

## 22.2 Unconditional branch

Always jumps.

```assembly
JUMP 500
```

Meaning:

```text
PC ← 500
```

---

## 22.3 Conditional branch

Jumps only if a condition is true.

Example:

```assembly
BRZ 500
```

Meaning:

```text
Branch to 500 if zero flag is set.
```

Example flow:

```assembly
SUB R1, R2
BRZ SAME
```

If `R1 - R2 = 0`, then zero flag is set and the branch is taken.

---

## 22.4 Procedure call and return

Example:

```assembly
CALL PROC1
RETURN
```

`CALL` does two things:

```text
1. Saves return address
2. Jumps to procedure
```

`RETURN` does:

```text
Go back to saved return address
```

Flow:

```text
Main program:
400: LOAD R1, A
401: CALL PROC1
402: STORE X, R1

Procedure:
500: ADD R1, #1
501: RETURN
```

Execution:

```text
400 → 401 → 500 → 501 → 402
```

The lecture says procedures support **economy** and **modularity**. 

---

# 23. I/O Operations

I/O operations allow the computer to communicate with external devices.

Examples:

```assembly
IN R1, KEYBOARD
OUT SCREEN, R1
```

Meaning:

```text
IN R1, KEYBOARD → R1 ← data from keyboard
OUT SCREEN, R1  → send R1 to screen
```

The lecture describes I/O approaches including isolated programmed I/O, memory-mapped programmed I/O, DMA, and I/O processor. 

---

## 23.1 Isolated I/O

Memory addresses and I/O port addresses are separate.

Example:

```assembly
IN R1, PORT1
OUT PORT2, R1
```

---

## 23.2 Memory-mapped I/O

I/O device registers appear as memory addresses.

Example:

```assembly
STORE 9000, R1
```

Address `9000` may refer to an I/O device register, not normal RAM.

---

## 23.3 DMA

DMA means **Direct Memory Access**.

Simple idea:

```text
I/O device ↔ memory directly
```

The CPU starts the transfer, but the DMA module moves the data without the CPU moving every word.

---

## 23.4 I/O processor

An I/O processor or I/O channel is a special processor that handles I/O tasks.

Simple diagram:

```text
Main CPU
   |
   v
I/O Processor
   |
   +---- Disk
   +---- Printer
   +---- Network device
```

---

# 24. System Control Operations

System control operations are powerful instructions used to control system-level functions.

Examples:

```text
Modify control registers
Change memory protection
Access process control blocks
Disable or enable interrupts
```

The lecture says system control instructions are usually privileged instructions that can be executed only when the processor is in a privileged state or running in a special privileged memory area. 

---

## 24.1 User mode vs supervisor mode

```text
User mode:
Normal application programs run here.
Limited permission.

Supervisor / kernel mode:
Operating system runs here.
Privileged instructions allowed.
```

If a user program tries to execute a privileged instruction, the CPU may raise an exception or trap.

---

# 25. Full Chapter 8 Exam Summary

## Key definitions

| Term                   | Meaning                                        |
| ---------------------- | ---------------------------------------------- |
| Machine instruction    | Command executed by CPU                        |
| Instruction set        | Collection of instructions CPU can execute     |
| Opcode                 | Field telling CPU what operation to perform    |
| Operand                | Data used by instruction                       |
| Instruction format     | Bit layout of an instruction                   |
| Mnemonic               | Human-readable instruction name                |
| Accumulator            | Implicit register used in one-address machines |
| Program Counter        | Register holding address of next instruction   |
| Logical shift          | Shift with 0 fill                              |
| Arithmetic shift       | Shift that preserves sign                      |
| Rotate                 | Shift-like operation where bits wrap around    |
| Privileged instruction | Instruction reserved for OS/supervisor mode    |

---

## Most important formulas

```text
Number of possible values = 2^n
```

Examples:

```text
4-bit opcode → 2^4 = 16 operations
7-bit ASCII/IRA → 2^7 = 128 characters
8-bit address field → 2^8 = 256 addresses
3-bit register field → 2^3 = 8 registers
```

---

## Most important instruction meanings

```text
3-address: OP A, B, C → A ← B OP C
2-address: OP A, B    → A ← A OP B
1-address: OP A       → AC ← AC OP A
0-address: OP         → use stack top values
```

---

## Most important common mistakes

1. Confusing address with content.
2. Forgetting that two-address instructions overwrite the first operand.
3. Forgetting that one-address instructions use `AC`.
4. Doing subtraction or division in the wrong order.
5. Treating rotate as shift.
6. Filling logical right shift with sign bit.
7. Filling arithmetic right shift with 0 when sign bit is 1.
8. Forgetting to save intermediate results in expression conversion.
9. Thinking privileged instructions can be used by normal programs.
10. Confusing data storage with I/O data movement.

---

# 26. Viva / Exam Questions

## Q1. What is an instruction set?

An instruction set is the collection of machine instructions that a processor can execute.

## Q2. What are the elements of a machine instruction?

Opcode, source operand reference, result operand reference, and next instruction reference.

## Q3. What are the four possible operand locations?

Main/virtual memory, processor register, immediate value, and I/O device.

## Q4. What are the four instruction types?

Data processing, data storage, data movement, and control.

## Q5. What does `OP A, B, C` mean?

```text
A ← B OP C
```

## Q6. What does `OP A, B` mean?

```text
A ← A OP B
```

## Q7. What does `OP A` mean?

```text
AC ← AC OP A
```

## Q8. Why are transfer of control instructions needed?

They are needed for decisions, loops, procedure calls, returns, and other cases where the next instruction is not simply the next sequential address.

## Q9. What is the difference between logical shift and arithmetic shift?

Logical shift fills empty positions with 0. Arithmetic shift preserves the sign bit, especially for right shifts.

## Q10. What is the difference between shift and rotate?

Shift loses bits that fall off. Rotate wraps those bits around to the other side.

---

# 27. Final Mini Checkpoint

Try answering without looking:

```text
1. What is the purpose of an opcode?
2. What is the difference between source operand and result operand?
3. In two-address format, what does ADD R1, R2 mean?
4. In one-address format, what hidden register is used?
5. What is the answer for 10101110 logical right shift 4?
6. What is the answer for 10101110 arithmetic right shift 4?
7. Why does CALL need to save a return address?
8. Why are system control instructions privileged?
```

Answers:

```text
1. It tells the CPU what operation to perform.
2. Source operand provides input; result operand stores output.
3. R1 ← R1 + R2.
4. Accumulator, AC.
5. 00001010.
6. 11111010.
7. So the CPU knows where to continue after the procedure ends.
8. Because they can affect the whole system, memory protection, interrupts, and security.
```

Chapter 8 is now complete.
