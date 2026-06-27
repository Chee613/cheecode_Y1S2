# Chapter 8: Instruction Set Architecture

## 1. Machine Instruction

A **machine instruction** is a command that the processor can understand and execute.

Simple meaning:

```text
Machine instruction = CPU-level command
```

Example:

```assembly
LOAD R1, A
ADD  R1, R2
STORE X, R1
```

Meaning:

```text
LOAD R1, A   → R1 ← Memory[A]
ADD R1, R2   → R1 ← R1 + R2
STORE X, R1  → Memory[X] ← R1
```

The lecture says the operation of a processor is determined by the instructions it executes, and the full collection of instructions a processor can execute is called the **instruction set**. 

---

## 2. Instruction Set

An **instruction set** is the CPU’s vocabulary.

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

Different CPU families may have different instruction sets.

Example:

```text
x86 instruction set ≠ ARM instruction set
```

---

## 3. Elements of a Machine Instruction

A machine instruction normally contains these elements:

| Element                    | Meaning                               |
| -------------------------- | ------------------------------------- |
| Opcode                     | Tells CPU what operation to perform   |
| Source operand reference   | Tells where input data comes from     |
| Result operand reference   | Tells where result is stored          |
| Next instruction reference | Tells where next instruction is found |

The PPT lists these as typical instruction elements and says the opcode is represented by a binary code. 

Example:

```assembly
ADD R1, R2
```

Possible interpretation:

```text
Opcode = ADD
Source operand = R2
Destination/result operand = R1
```

For a two-address style:

```text
R1 ← R1 + R2
```

---

## 4. Operand Locations

An **operand** is the data used by an instruction.

Example:

```assembly
ADD R1, R2
```

`R1` and `R2` are operands.

The PPT lists these possible operand locations: 

| Operand location    | Example        | Meaning                             |
| ------------------- | -------------- | ----------------------------------- |
| Main/virtual memory | `LOAD R1, A`   | Operand is in memory                |
| Processor register  | `ADD R1, R2`   | Operand is in CPU register          |
| Immediate value     | `MOV R1, #5`   | Operand value is inside instruction |
| I/O device          | `IN R1, PORT1` | Operand comes from I/O device       |

---

## 5. Address vs Content

This is one of the most common mistakes.

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

But:

```assembly
MOV R1, #1000
```

means:

```text
R1 ← 1000
```

because `#1000` is an immediate value.

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

Important calculations:

```text
4-bit opcode field   → 2^4 = 16 possible operations
4-bit register field → 2^4 = 16 possible registers
8-bit address field  → 2^8 = 256 possible addresses
```

The PPT says an instruction is a sequence of bits divided into fields, and the processor reads it into the instruction register before extracting the fields. 

---

## 7. Mnemonics

A **mnemonic** is a human-readable name for a machine instruction.

Examples:

| Mnemonic     | Meaning          |
| ------------ | ---------------- |
| ADD          | Add              |
| SUB          | Subtract         |
| MUL          | Multiply         |
| DIV          | Divide           |
| LOAD         | Load from memory |
| STOR / STORE | Store to memory  |

Important:

```text
The CPU stores binary opcodes, not the letters ADD or SUB.
```

The PPT gives examples such as `ADD`, `SUB`, `MUL`, `DIV`, `LOAD`, and `STOR`. 

---

# 8. Instruction Types

The PPT groups machine instructions into four main types: 

| Type            | Meaning                  | Examples                  |
| --------------- | ------------------------ | ------------------------- |
| Data processing | Arithmetic and logic     | `ADD`, `SUB`, `AND`, `OR` |
| Data storage    | Register/memory movement | `LOAD`, `STORE`, `MOV`    |
| Data movement   | I/O movement             | `IN`, `OUT`               |
| Control         | Test and branch          | `CMP`, `JUMP`, `BRZ`      |

---

## 8.1 Data Processing Instructions

These perform calculations or logical operations.

Examples:

```assembly
ADD R1, R2
SUB R1, R2
MUL R1, R2
DIV R1, R2
AND R1, R2
OR  R1, R2
```

Example:

```text
R1 = 10
R2 = 3

ADD R1, R2

R1 = 13
```

---

## 8.2 Data Storage Instructions

These move data between memory and registers.

```assembly
LOAD R1, A
STORE X, R1
MOV R1, R2
```

Meaning:

```text
LOAD R1, A   → R1 ← Memory[A]
STORE X, R1  → Memory[X] ← R1
MOV R1, R2   → R1 ← R2
```

Memory trick:

```text
LOAD  = memory to CPU/register
STORE = CPU/register to memory
```

---

## 8.3 Data Movement Instructions

In this chapter, **data movement** mainly means I/O.

```assembly
IN  R1, KEYBOARD
OUT SCREEN, R1
```

Meaning:

```text
IN  R1, KEYBOARD → read input into R1
OUT SCREEN, R1   → send R1 to output device
```

---

## 8.4 Control Instructions

Control instructions change the normal sequence of execution.

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

A branch mainly changes the **Program Counter, PC**.

---

# 9. Number of Addresses in Instructions

The PPT explains instruction formats based on the number of addresses contained in each instruction. 

---

## 9.1 Four-address instruction idea

A complete instruction could theoretically contain:

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
Next instruction address = NEXT
```

Most machines do not include the fourth address because the **PC** normally handles the next instruction automatically.

---

## 9.2 Three-address instruction

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
Fewer instructions needed.
```

Disadvantage:

```text
Each instruction is longer.
```

---

## 9.3 Two-address instruction

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

Use:

```assembly
MOVE X, A
ADD  X, B
```

---

## 9.4 One-address instruction

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
ADD  B
STORE X
```

Meaning:

```text
AC ← A
AC ← AC + B
X ← AC
```

---

## 9.5 Zero-address instruction

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
Store result in X
```

Summary:

| Type      | Format       | Meaning              |
| --------- | ------------ | -------------------- |
| 3-address | `OP A, B, C` | `A ← B OP C`         |
| 2-address | `OP A, B`    | `A ← A OP B`         |
| 1-address | `OP A`       | `AC ← AC OP A`       |
| 0-address | `OP`         | Use stack top values |

---

# 10. Tutorial 8 Question 7

Question:

```text
X = (A + B × C) / (D − E × F)
```

Tutorial 8 asks for one-address, two-address, and three-address versions. 

---

## 10.1 Three-address solution

```assembly
MUL R1, B, C      ; R1 ← B × C
ADD R1, A, R1     ; R1 ← A + B × C

MUL R2, E, F      ; R2 ← E × F
SUB R2, D, R2     ; R2 ← D − E × F

DIV X, R1, R2     ; X ← R1 / R2
```

---

## 10.2 Two-address solution

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

## 10.3 One-address solution

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

Common mistake:

```assembly
MOVE R2, E
MUL  R2, F
SUB  R2, D
```

This gives:

```text
E × F − D
```

But the expression needs:

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

# 11. Instruction Set Design Issues

The PPT and Tutorial 8 list five important instruction set design issues:  

| Design issue         | Meaning                                                |
| -------------------- | ------------------------------------------------------ |
| Operation repertoire | Which operations are provided and how complex they are |
| Data types           | What kinds of data instructions can operate on         |
| Instruction format   | Instruction length, number of addresses, field sizes   |
| Registers            | Number and use of processor registers                  |
| Addressing           | How operands are specified or located                  |

Exam answer:

```text
The five important instruction set design issues are operation repertoire,
data types, instruction format, registers, and addressing.
```

---

# 12. Types of Operands

The PPT lists four important operand types: 

```text
1. Addresses
2. Numbers
3. Characters
4. Logical data
```

---

## 12.1 Addresses

An address tells the CPU where data is stored.

```assembly
LOAD R1, 1000
```

Meaning:

```text
R1 ← Memory[1000]
```

---

## 12.2 Numbers

Common numeric types:

```text
1. Binary integer / fixed point
2. Binary floating point
3. Decimal / packed decimal
```

Example overflow:

```text
4-bit unsigned range = 0 to 15

15 + 1 = 16
```

But 16 cannot fit in 4 bits.

---

## 12.3 Packed Decimal

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

## 12.4 Characters

Characters are stored using binary codes.

Example ASCII/IRA:

```text
'A' = 65 decimal = 01000001
```

ASCII/IRA uses 7-bit patterns:

```text
2^7 = 128 possible characters
```

The PPT also mentions EBCDIC as another character code. 

---

## 12.5 Logical Data

Logical data treats bits as separate true/false values.

Example:

```text
10110010
```

Can be viewed as:

```text
1 0 1 1 0 0 1 0
```

Useful for:

```text
flags
masks
bit manipulation
Boolean arrays
```

Example mask:

```text
  10110110
AND 00001111
=   00000110
```

---

# 13. x86 Data Types

The PPT contains a detailed x86 data type table. It includes general sizes, signed/unsigned integers, BCD, pointers, bit fields, strings, floating point, and packed SIMD data.  

---

## 13.1 x86 General Data Sizes

| x86 type        |     Size |
| --------------- | -------: |
| Byte            |   8 bits |
| Word            |  16 bits |
| Doubleword      |  32 bits |
| Quadword        |  64 bits |
| Double quadword | 128 bits |

Common mistake:

```text
In x86, word = 16 bits.
```

---

## 13.2 Integer vs Ordinal

| Type    | Meaning                       |
| ------- | ----------------------------- |
| Integer | Signed two’s complement value |
| Ordinal | Unsigned integer              |

Example 8-bit value:

```text
11111111
```

As signed integer:

```text
-1
```

As unsigned ordinal:

```text
255
```

---

## 13.3 Unpacked BCD

One decimal digit per byte.

Example digit `7`:

```text
00000111
```

---

## 13.4 Packed BCD

Two decimal digits per byte.

Example:

```text
59
```

Packed BCD:

```text
0101 1001
```

---

## 13.5 Near Pointer and Far Pointer

| Pointer type | Contains                  | Meaning                              |
| ------------ | ------------------------- | ------------------------------------ |
| Near pointer | Offset/effective address  | Address within current/known segment |
| Far pointer  | Segment selector + offset | Full logical address                 |

Important:

```text
Near/far does not mean physically near or far.
It describes how much address information is stored.
```

---

## 13.6 Bit Field, Bit String, Byte String

| Type        | Meaning                                      |
| ----------- | -------------------------------------------- |
| Bit field   | Contiguous bits, each bit can be independent |
| Bit string  | Long sequence of bits                        |
| Byte string | Sequence of bytes/words/doublewords          |

---

## 13.7 Floating Point

x86 supports floating-point data types using IEEE 754-style representations. 

Used for:

```text
fractions
scientific calculation
graphics
engineering
machine learning
```

---

## 13.8 Packed SIMD Data

SIMD means:

```text
Single Instruction, Multiple Data
```

Packed SIMD means multiple small data values are packed into one larger register and processed in parallel.

Examples:

```text
Packed byte
Packed word
Packed doubleword
Packed floating-point values
```

The PPT links this to multimedia extensions such as MMX and SSE. 

---

## 13.9 x86 Little-endian

The PPT says x86 uses little-endian style. 

Example value:

```text
0x12345678
```

Stored starting at address 1000:

```text
1000 → 78
1001 → 56
1002 → 34
1003 → 12
```

Little-endian rule:

```text
Lowest address stores least significant byte.
```

---

# 14. ARM Data Types

The PPT says ARM supports: 

| ARM type |    Size |
| -------- | ------: |
| Byte     |  8 bits |
| Halfword | 16 bits |
| Word     | 32 bits |

Important comparison:

```text
x86 word = 16 bits
ARM word = 32 bits
```

---

## 14.1 Alignment

A halfword should start at an address divisible by 2.

```text
1000, 1002, 1004 = halfword-aligned
```

A word should start at an address divisible by 4.

```text
1000, 1004, 1008 = word-aligned
```

---

## 14.2 ARM Nonaligned Access

The PPT lists three possible ARM treatments for nonaligned access: 

| Case                     | Meaning                                                 |
| ------------------------ | ------------------------------------------------------- |
| Default case             | Address may be treated as aligned; word load may rotate |
| Alignment checking       | Data abort/alignment fault                              |
| Unaligned access enabled | CPU performs extra memory accesses transparently        |

---

## 14.3 Signed and Unsigned ARM Data

ARM byte, halfword, and word can be interpreted as unsigned or signed two’s complement values.

Example:

```text
11111111
```

Unsigned:

```text
255
```

Signed:

```text
-1
```

---

## 14.4 ARM Floating Point

The PPT says many ARM implementations omit floating-point hardware to save power and area. Floating point may be done in software or by optional floating-point coprocessor. 

---

## 14.5 ARM Endian Support

ARM has an **E-bit** that controls endian format for load/store. 

Value:

```text
0x12345678
```

Big-endian:

```text
1000 → 12
1001 → 34
1002 → 56
1003 → 78
```

Little-endian:

```text
1000 → 78
1001 → 56
1002 → 34
1003 → 12
```

---

# 15. Types of Operations

The PPT lists operation categories such as: 

```text
Data transfer
Arithmetic
Logical
Conversion
Transfer of control
I/O
System control
```

---

## 15.1 Data Transfer

Examples:

```assembly
MOV R1, R2
LOAD R1, A
STORE X, R1
XCHG R1, R2
PUSH R1
POP R1
```

Meaning:

```text
MOV   → copy
LOAD  → memory to register
STORE → register to memory
XCHG  → swap
PUSH  → put on stack
POP   → take from stack
```

The PPT says data transfer instructions must specify source/destination, data length, and addressing mode. 

---

## 15.2 Arithmetic

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

Arithmetic operations may set flags such as zero, sign, carry, and overflow. 

---

## 15.3 Logical Operations

The PPT includes basic logical operations such as NOT, AND, OR, XOR, and equality. 

| Operation | Meaning                    |
| --------- | -------------------------- |
| NOT       | Flip bits                  |
| AND       | 1 only if both bits are 1  |
| OR        | 1 if at least one bit is 1 |
| XOR       | 1 if bits are different    |

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

# 16. Shift and Rotate

The PPT explains logical shift, arithmetic shift, and rotate. 

---

## 16.1 Logical Shift

Logical shift moves bits left or right.

Rules:

```text
Bits shifted out are lost.
Empty positions are filled with 0.
```

Example:

```text
10100110 logical right shift 3 = 00010100
10100110 logical left shift 3  = 00110000
```

---

## 16.2 Arithmetic Shift

Arithmetic shift treats the value as a signed integer.

Main rule:

```text
Preserve the sign bit.
```

Example:

```text
10100110 arithmetic right shift 3 = 11110100
```

because sign bit is `1`.

---

## 16.3 Rotate

Rotate moves bits around without losing them.

```text
10100110 right rotate 3 = 11010100
10100110 left rotate 3  = 00110101
```

Difference:

| Operation              | Bits lost? | Fill/wrap rule     |
| ---------------------- | ---------- | ------------------ |
| Logical shift          | Yes        | Fill with 0        |
| Arithmetic right shift | Yes        | Fill with sign bit |
| Rotate                 | No         | Bits wrap around   |

---

# 17. Tutorial 8 Question 8

Original:

```text
10101110
```

Shift/rotate by 4 bits. 

| Operation                | Answer     |
| ------------------------ | ---------- |
| Logical right shift 4    | `00001010` |
| Logical left shift 4     | `11100000` |
| Arithmetic right shift 4 | `11111010` |
| Arithmetic left shift 4  | `11100000` |
| Right rotate 4           | `11101010` |
| Left rotate 4            | `11101010` |

Reason:

```text
Logical right fills with 0.
Arithmetic right fills with sign bit 1.
Rotate wraps bits around.
```

---

# 18. x86 Operation Tables

The PPT includes detailed x86 operation tables. 

---

## 18.1 x86 Data Transfer

| Instruction        | Meaning                        |
| ------------------ | ------------------------------ |
| `MOV Dest, Source` | Copy source to destination     |
| `XCHG Op1, Op2`    | Swap operands                  |
| `PUSH Source`      | Push source onto stack         |
| `POP Dest`         | Pop stack top into destination |

---

## 18.2 x86 Arithmetic / Compare

Examples:

```assembly
ADD EAX, EBX
SUB EAX, EBX
INC EAX
DEC EAX
NEG EAX
CMP EAX, EBX
```

`CMP EAX, EBX` means:

```text
Internally calculate EAX - EBX.
Do not store result.
Update flags.
```

---

## 18.3 x86 EFLAGS

The PPT says x86 `EFLAGS` includes condition codes such as carry, parity, auxiliary, zero, sign, and overflow. 

| Flag | Meaning              |
| ---- | -------------------- |
| CF   | Carry flag           |
| PF   | Parity flag          |
| AF   | Auxiliary carry flag |
| ZF   | Zero flag            |
| SF   | Sign flag            |
| OF   | Overflow flag        |

---

## 18.4 x86 Logical

| Instruction        | Meaning                                |
| ------------------ | -------------------------------------- |
| `NOT Op`           | Invert bits                            |
| `AND Dest, Source` | Bitwise AND, store result              |
| `OR Dest, Source`  | Bitwise OR, store result               |
| `XOR Dest, Source` | Bitwise XOR, store result              |
| `TEST Op1, Op2`    | AND only for flags; operands unchanged |

Important:

```text
AND changes destination.
TEST does not change operands.
```

---

## 18.5 x86 Shift and Rotate

The PPT lists `SAL`, `SAR`, `SHR`, `ROL`, `ROR`, `RCL`, and `RCR`. 

| Instruction | Meaning                                            |
| ----------- | -------------------------------------------------- |
| `SAL`       | Shift arithmetic left; same as logical left in x86 |
| `SHR`       | Logical right shift, fill with 0                   |
| `SAR`       | Arithmetic right shift, fill with sign bit         |
| `ROL`       | Rotate left                                        |
| `ROR`       | Rotate right                                       |
| `RCL`       | Rotate left through carry                          |
| `RCR`       | Rotate right through carry                         |

Example:

```text
10101110 SHR 1 = 01010111
10101110 SAR 1 = 11010111
```

---

## 18.6 x86 Control Transfer

| Instruction | Meaning                                  |
| ----------- | ---------------------------------------- |
| `CALL proc` | Save return info and branch to procedure |
| `RET`       | Return from procedure                    |
| `JMP Dest`  | Unconditional jump                       |
| `Jcc Dest`  | Conditional jump based on flags          |
| `NOP`       | No operation                             |
| `HLT`       | Halt processor                           |
| `WAIT`      | Wait/check floating-point exception      |
| `INT Nr`    | Software interrupt                       |

The PPT says `CALL` saves linking information on the stack and `RET` returns using the address on top of the stack. 

---

## 18.7 x86 I/O

| Instruction        | Meaning                        |
| ------------------ | ------------------------------ |
| `IN Dest, Source`  | Copy from I/O port to register |
| `INS Dest, Source` | Copy from I/O port to memory   |
| `OUT Dest, Source` | Copy from register to I/O port |



---

# 19. MMX / SIMD

The PPT says Intel introduced MMX for multimedia tasks and that MMX uses SIMD: one instruction operates on multiple small data items at once. 

---

## 19.1 SIMD Meaning

```text
SIMD = Single Instruction, Multiple Data
```

Example:

```text
A = [10, 20, 30, 40]
B = [ 1,  2,  3,  4]

SIMD add:
A + B = [11, 22, 33, 44]
```

---

## 19.2 MMX Packed Data Types

| MMX type          | 64-bit value contains  |
| ----------------- | ---------------------- |
| Packed byte       | Eight 8-bit bytes      |
| Packed word       | Four 16-bit words      |
| Packed doubleword | Two 32-bit doublewords |



---

## 19.3 Wraparound Arithmetic

Unsigned byte range:

```text
0 to 255
```

Example:

```text
250 + 10 = 260
```

With 8-bit wraparound:

```text
260 - 256 = 4
```

So:

```text
250 + 10 = 4
```

---

## 19.4 Saturation Arithmetic

Saturation clamps the result.

For unsigned byte:

```text
Minimum = 0
Maximum = 255
```

Example:

```text
250 + 10 = 255
```

because result exceeds 255.

The PPT says MMX introduces saturation arithmetic for byte and 16-bit word operands. 

---

## 19.5 MMX Instruction Categories

The PPT’s MMX table includes: 

| Category         | Examples                                             |
| ---------------- | ---------------------------------------------------- |
| Arithmetic       | `PADD`, `PADDS`, `PADDUS`, `PSUB`, `PSUBS`, `PSUBUS` |
| Multiply         | `PMULHW`, `PMULLW`, `PMADDWD`                        |
| Comparison       | `PCMPEQ`, `PCMPGT`                                   |
| Conversion       | `PACKUSWB`, `PACKSS`, `PUNPCKH`, `PUNPCKL`           |
| Logical          | `PAND`, `PANDN`, `POR`, `PXOR`                       |
| Shift            | `PSLL`, `PSRL`, `PSRA`                               |
| Data transfer    | `MOVD`, `MOVQ`                                       |
| State management | `EMMS`                                               |

---

## 19.6 EMMS

`EMMS` means:

```text
Empty MMX State
```

It clears MMX state so floating-point operations can work properly afterward. 

---

# 20. 16-bit Word Character Unpacking Example

The PPT says logical shifts can isolate fields inside a word. It gives an example where one 16-bit word contains two 8-bit characters. 

Example word:

```text
01000001 01000010
```

This contains:

```text
01000001 = 'A'
01000010 = 'B'
```

Layout:

```text
+----------+----------+
| left A   | right B  |
| 8 bits   | 8 bits   |
+----------+----------+
```

The I/O device reads lower 8 bits.

---

## 20.1 Send left-hand character

```assembly
LOAD R1, WORD
SHR  R1, 8
OUT  DEVICE, R1
```

Example:

```text
Before:
01000001 01000010

After SHR 8:
00000000 01000001
```

Lower 8 bits now contain `'A'`.

---

## 20.2 Send right-hand character

```assembly
LOAD R1, WORD
AND  R1, 0000000011111111
OUT  DEVICE, R1
```

Example:

```text
  01000001 01000010
AND 00000000 11111111
=   00000000 01000010
```

Lower 8 bits contain `'B'`.

---

# 21. Conversion Operations: EAS/390 Translate Example

The PPT gives the EAS/390 Translate instruction:

```assembly
TR R1(L), R2
```

It translates `L` bytes starting at the address in `R1`, using a translation table starting at the address in `R2`. 

---

## 21.1 Translation Table Idea

A 256-byte table is used because:

```text
2^8 = 256 possible byte values
```

If table starts at:

```text
1000
```

then input byte `F1` uses table address:

```text
1000 + F1 = 10F1
```

---

## 21.2 PPT Example: Translate `1984`

Given: 

```text
R1 = 2100
R2 = 1000
Memory[2100–2103] = F1 F9 F8 F4
```

Instruction:

```assembly
TR R1(4), R2
```

Digit table:

| EBCDIC | Table address | IRA/ASCII |
| ------ | ------------- | --------- |
| `F1`   | `10F1`        | `31`      |
| `F9`   | `10F9`        | `39`      |
| `F8`   | `10F8`        | `38`      |
| `F4`   | `10F4`        | `34`      |

Final memory:

```text
Memory[2100–2103] = 31 39 38 34
```

The characters are still:

```text
1984
```

But the encoding changed from EBCDIC to IRA/ASCII.

---

# 22. Transfer of Control

Transfer of control changes normal instruction sequence.

Examples:

```assembly
JUMP 200
BRZ 300
CALL PROC1
RETURN
```

The PPT says transfer of control updates the Program Counter and supports branching, procedure calls, and returns. 

---

## 22.1 Why Needed

Tutorial 8 asks why transfer of control instructions are needed. 

Answer:

```text
They are needed because programs do not always execute sequentially.
They allow decisions, loops, procedure calls, returns, and error handling.
```

---

## 22.2 CALL and RETURN

```assembly
CALL PROC1
```

Meaning:

```text
Save return address.
Jump to procedure.
```

```assembly
RETURN
```

Meaning:

```text
Go back to saved return address.
```

Flow:

```text
400 → CALL PROC1 → procedure → RETURN → 401
```

---

# 23. I/O Operations and System Control

The PPT says I/O can be handled by isolated programmed I/O, memory-mapped programmed I/O, DMA, or I/O processor. 

---

## 23.1 Isolated I/O

Uses separate I/O address space.

```assembly
IN  R1, PORT1
OUT PORT2, R1
```

---

## 23.2 Memory-mapped I/O

I/O device registers appear as memory addresses.

```assembly
STORE 9000, R1
```

Address `9000` may be a device register.

---

## 23.3 DMA

DMA means:

```text
Direct Memory Access
```

Device and memory transfer data directly, while CPU mainly starts and ends the transfer.

---

## 23.4 I/O Processor

A special I/O processor/channel controls I/O operations, reducing CPU burden.

---

## 23.5 System Control

System control instructions are privileged. They are usually reserved for the operating system. 

Examples:

```text
Modify control registers
Change memory protection
Access process control blocks
Enable/disable interrupts
```

---

# 24. ARM Operation Types

The PPT lists ARM operation categories: load/store, branch, data-processing, multiply, parallel addition/subtraction, extend, and status register access. 

---

## 24.1 ARM Load/Store Architecture

ARM is a load/store architecture.

Meaning:

```text
Only load/store instructions access memory.
Arithmetic/logical instructions operate on registers or immediates.
```

Example:

```assembly
LDR R2, [A]
ADD R1, R1, R2
```

Not:

```assembly
ADD R1, R1, [A]
```

---

## 24.2 ARM Load and Store

```assembly
LDR R1, [R2]
```

Meaning:

```text
R1 ← Memory[R2]
```

```assembly
STR R1, [R2]
```

Meaning:

```text
Memory[R2] ← R1
```

---

## 24.3 ARM Branch

```assembly
B LABEL
```

Branch only.

```assembly
BL FUNCTION
```

Branch with link.

The PPT says `BL` saves the return address in `LR`, register `R14`. 

---

## 24.4 ARM Data Processing

Example:

```assembly
ADD R0, R1, R2
```

Meaning:

```text
R0 ← R1 + R2
```

ARM also supports a shifter on one operand:

```assembly
ADD R0, R1, R2, LSL #2
```

Meaning:

```text
R0 ← R1 + (R2 << 2)
```

The PPT says ARM includes a hardware shifter that can shift/rotate one operand before ALU operation. 

---

## 24.5 ARM Multiply

```assembly
MUL R0, R1, R2
```

Meaning:

```text
R0 ← R1 × R2
```

The PPT says some ARM multiply instructions can produce long 64-bit results from 32-bit operands. 

---

## 24.6 ARM Parallel Add/Subtract

Example idea:

```text
R1 = [0001][0002]
R2 = [0003][0004]

ADD16 result = [0004][0006]
```

The PPT gives `ADD16` as an example where top halfwords and bottom halfwords are added in parallel. 

---

## 24.7 ARM Extend Instructions

Extend instructions perform sign extension or zero extension.

Example 8-bit value:

```text
11111111
```

Zero-extend to 32 bits:

```text
00000000 00000000 00000000 11111111
```

Sign-extend to 32 bits:

```text
11111111 11111111 11111111 11111111
```

---

## 24.8 ARM Status Register and Conditions

Important flags:

| Flag | Meaning  |
| ---- | -------- |
| N    | Negative |
| Z    | Zero     |
| C    | Carry    |
| V    | Overflow |

Some ARM condition codes from the PPT: 

| Symbol | Meaning                |
| ------ | ---------------------- |
| EQ     | Equal, `Z = 1`         |
| NE     | Not equal, `Z = 0`     |
| MI     | Negative, `N = 1`      |
| PL     | Positive/zero, `N = 0` |
| VS     | Overflow, `V = 1`      |
| VC     | No overflow, `V = 0`   |
| GE     | Signed greater/equal   |
| LT     | Signed less than       |
| GT     | Signed greater than    |
| LE     | Signed less/equal      |
| AL     | Always                 |

ARM conditional execution can reduce branches and improve pipeline efficiency. 

---

# 25. Thumb and Thumb-2

The PPT includes Thumb and Thumb-2 slides. Thumb is a 16-bit recoded subset of ARM, while Thumb-2 mixes 16-bit and 32-bit Thumb instructions. 

---

## 25.1 Why Thumb Exists

Normal ARM instruction:

```text
32 bits = 4 bytes
```

Thumb instruction:

```text
16 bits = 2 bytes
```

Thumb improves **code density**, meaning programs use less memory.

---

## 25.2 How Thumb Saves Bits

The PPT says Thumb saves bits by: 

```text
1. Removing condition field
2. Removing separate update-flag bit
3. Using smaller opcode/type encoding
4. Referencing mainly R0–R7, needing 3 bits instead of 4
5. Simplifying immediate values
```

---

## 25.3 Thumb-2

Thumb-2 allows:

```text
16-bit Thumb instructions
+
32-bit Thumb instructions
```

to mix freely. 

Goal:

```text
Thumb-like code density
+
ARM-like performance
```

The PPT says Thumb-2 reduces the old trade-off between Thumb for size and ARM for performance. 

---

## 25.4 Thumb-2 Encoding

The PPT says bit patterns:

```text
11101
11110
11111
```

indicate a 32-bit Thumb instruction. 

So the CPU can know whether to read:

```text
16 bits
```

or:

```text
32 bits
```

for the next instruction.

---

## 25.5 Thumb-2 Performance / Code Size

The PPT reports: 

```text
Thumb-2 code size can be much smaller than ARM.
Thumb-2 performance can be close to ARM.
Thumb-2 is faster than original Thumb in the benchmark comparison.
```

---

# 26. Final Exam Summary

## 26.1 Key Definitions

| Term                   | Meaning                                    |
| ---------------------- | ------------------------------------------ |
| Machine instruction    | CPU-executable command                     |
| Instruction set        | Collection of instructions CPU can execute |
| Opcode                 | Operation field                            |
| Operand                | Data used by instruction                   |
| Instruction format     | Bit layout of instruction                  |
| Mnemonic               | Human-readable instruction name            |
| Accumulator            | Implicit register in one-address machine   |
| PC                     | Holds next instruction address             |
| Logical shift          | Shift with 0 fill                          |
| Arithmetic shift       | Shift preserving sign bit                  |
| Rotate                 | Shift-like operation where bits wrap       |
| SIMD                   | One instruction, multiple data             |
| Privileged instruction | OS-only/system-level instruction           |

---

## 26.2 Important Formulas

```text
Number of possible values = 2^n
```

Examples:

```text
4-bit opcode → 2^4 = 16 operations
7-bit ASCII/IRA → 2^7 = 128 characters
8-bit byte → 2^8 = 256 possible values
3-bit register field → 2^3 = 8 registers
```

---

## 26.3 Most Important Instruction Meanings

```text
3-address: OP A, B, C → A ← B OP C
2-address: OP A, B    → A ← A OP B
1-address: OP A       → AC ← AC OP A
0-address: OP         → use stack top values
```

---

## 26.4 Common Mistakes

1. Confusing address with content.
2. Forgetting two-address instructions overwrite first operand.
3. Forgetting one-address instructions use `AC`.
4. Doing subtraction or division in wrong order.
5. Treating rotate as shift.
6. Filling logical right shift with sign bit.
7. Filling arithmetic right shift with 0 when sign bit is 1.
8. Forgetting to save intermediate results.
9. Thinking x86 word and ARM word are the same.
10. Confusing signed and unsigned interpretation.
11. Confusing wraparound and saturation.
12. Thinking Thumb-2 only has 16-bit instructions.
13. Forgetting `BL` saves return address in `LR/R14`.
14. Thinking system control instructions can be used by normal programs.

---

# 27. Viva / Exam Questions

## Q1. What is an instruction set?

An instruction set is the collection of machine instructions a processor can execute.

## Q2. What are the elements of a machine instruction?

Opcode, source operand reference, result operand reference, and next instruction reference.

## Q3. What are the four operand locations?

Main/virtual memory, processor register, immediate value, and I/O device.

## Q4. What does `OP A, B, C` mean?

```text
A ← B OP C
```

## Q5. What does `OP A, B` mean?

```text
A ← A OP B
```

## Q6. What does `OP A` mean?

```text
AC ← AC OP A
```

## Q7. What is the difference between logical shift and arithmetic shift?

Logical shift fills empty positions with `0`. Arithmetic shift preserves the sign bit, especially for right shifts.

## Q8. What is the difference between shift and rotate?

Shift loses bits. Rotate wraps bits around.

## Q9. What is SIMD?

SIMD means Single Instruction, Multiple Data. One instruction performs the same operation on multiple data items.

## Q10. What is saturation arithmetic?

Saturation arithmetic clamps overflow or underflow results to the maximum or minimum representable value.

## Q11. What is the difference between x86 word and ARM word?

In this PPT:

```text
x86 word = 16 bits
ARM word = 32 bits
```

## Q12. What is Thumb?

Thumb is a 16-bit recoded subset of the ARM instruction set designed to improve code density.

## Q13. What is Thumb-2?

Thumb-2 is an enhanced Thumb ISA that mixes 16-bit and 32-bit Thumb instructions to improve both code density and performance.

---

# 28. Final Mini Checkpoint

Try answering without looking:

```text
1. What is the purpose of an opcode?
2. What is the difference between source operand and result operand?
3. In two-address format, what does ADD R1, R2 mean?
4. In one-address format, what hidden register is used?
5. What is 10101110 logical right shift 4?
6. What is 10101110 arithmetic right shift 4?
7. What does x86 TEST do?
8. What is the difference between SHR and SAR?
9. What is the difference between wraparound and saturation?
10. What does ARM BL save?
11. What does Thumb improve?
12. What does Thumb-2 add compared with original Thumb?
```

Answers:

```text
1. It tells the CPU what operation to perform.
2. Source operand provides input; result operand stores output.
3. R1 ← R1 + R2.
4. Accumulator, AC.
5. 00001010.
6. 11111010.
7. It performs AND for flags only; operands are unchanged.
8. SHR fills with 0; SAR fills with sign bit.
9. Wraparound discards overflow bits; saturation clamps to min/max.
10. Return address in LR/R14.
11. Code density / smaller program size.
12. It adds mixed 16-bit and 32-bit Thumb instructions for better size-performance balance.
```

Chapter 8 is now properly complete, including the slides that were previously skipped.
