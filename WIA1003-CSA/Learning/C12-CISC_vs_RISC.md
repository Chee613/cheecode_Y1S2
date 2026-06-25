# Chapter 12: CISC vs RISC

# 1. Big Picture

CISC vs RISC is about **instruction set design**.

A processor works by fetching and executing instructions from memory. The instruction tells the CPU what action to perform. Your earlier notes explain that the processor fetches an instruction, loads it into the Instruction Register, interprets it, and performs the required action. 

So the main design question is:

```text
Should the CPU have many powerful instructions,
or fewer simple instructions?
```

That question gives us:

```text
CISC = Complex Instruction Set Computer
RISC = Reduced Instruction Set Computer
```

---

# 2. What is CISC?

## Definition

**CISC** means **Complex Instruction Set Computer**.

A CISC processor has a large instruction set. One instruction may do many small operations.

Example:

```asm
MULT 2:3, 5:2
```

This may mean:

```text
Memory[2:3] = Memory[2:3] × Memory[5:2]
```

One instruction may involve:

```text
Read memory
Read another memory location
Multiply
Store result back to memory
```

---

## Why CISC was useful

CISC was useful historically because:

```text
Memory was expensive.
Program size mattered.
Fewer instructions saved memory.
```

So designers made powerful instructions to reduce the number of assembly instructions.

Example:

```asm
; CISC-style
ADD X, A, B
```

Instead of:

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2
STORE R3, X
```

---

## How CISC works

CISC shifts more work into hardware.

```text
Program instruction
        ↓
Complex decoder/control unit
        ↓
Many internal micro-steps
        ↓
ALU + registers + memory
```

One CISC instruction may take many clock cycles. Your performance notes remind us that most instructions require multiple clock cycles, and some instructions may need many cycles. 

---

# 3. What is RISC?

## Definition

**RISC** means **Reduced Instruction Set Computer**.

A RISC processor uses fewer and simpler instruction types.

The main idea is:

```text
Make instructions simple, regular, and fast.
```

Tutorial 09 lists important RISC characteristics: one instruction per cycle, register-to-register operations, many registers, simple addressing modes, and fixed-length instruction formats. 

---

## Why RISC was useful

RISC appeared because designers noticed that many complex instructions were rarely used.

So instead of spending hardware on hundreds of complex instructions, RISC focuses on common simple instructions.

```text
Optimize the instructions that programs use most often.
```

---

## How RISC works

RISC usually uses a **load/store architecture**.

This means:

```text
Only LOAD and STORE access memory.
Arithmetic and logic operations use registers.
```

Example:

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2
STORE R3, X
```

Meaning:

```text
R1 = Memory[A]
R2 = Memory[B]
R3 = R1 + R2
Memory[X] = R3
```

---

# 4. CISC vs RISC Comparison Table

| Feature                | CISC                                | RISC                             |
| ---------------------- | ----------------------------------- | -------------------------------- |
| Full name              | Complex Instruction Set Computer    | Reduced Instruction Set Computer |
| Instruction set        | Large                               | Small                            |
| Instruction complexity | Complex instructions                | Simple instructions              |
| Instruction length     | Often variable length               | Usually fixed length             |
| Memory access          | Many instructions may access memory | Mainly LOAD and STORE            |
| Operation style        | Memory-to-memory possible           | Register-to-register             |
| Registers              | Usually fewer historically          | Usually more                     |
| Addressing modes       | Many and complex                    | Few and simple                   |
| Control unit           | More complex                        | Simpler                          |
| Pipelining             | Harder                              | Easier                           |
| Compiler role          | Less burden historically            | More burden                      |
| Code size              | Smaller                             | Larger                           |
| Hardware emphasis      | High                                | Lower                            |
| Software emphasis      | Lower                               | Higher                           |

---

# 5. Instruction Length

## CISC

CISC often uses variable-length instructions.

Example:

```text
Instruction 1: 1 byte
Instruction 2: 3 bytes
Instruction 3: 6 bytes
```

Variable-length instructions can make code compact, but they increase CPU decoding complexity. Your ISA notes say variable-length instructions provide many variations efficiently and compactly, but increase processor complexity; RISC and superscalar machines can exploit fixed-length instructions for improved performance. 

---

## RISC

RISC usually uses fixed-length instructions.

Example:

```text
Instruction 1: 32 bits
Instruction 2: 32 bits
Instruction 3: 32 bits
```

This helps the CPU know where the next instruction begins.

```text
PC = 1000
Fetch 32-bit instruction
Next instruction = 1004
```

---

# 6. Memory Access Difference

## CISC style

```asm
ADD X, A, B
```

Possible meaning:

```text
X = A + B
```

The instruction can directly use memory operands.

---

## RISC style

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2
STORE R3, X
```

Only `LOAD` and `STORE` access memory. The `ADD` instruction works only on registers.

Tutorial 09 directly states that RISC operations are mostly performed in CPU registers, and memory is accessed through explicit `LOAD` and `STORE` instructions. 

---

# 7. Why Registers Matter in RISC

Registers are tiny, fast storage locations inside the CPU.

```text
CPU
+----------------------+
| Registers            |
| ALU                  |
| Control Unit         |
+----------------------+

Main Memory
+----------------------+
| Program + Data       |
+----------------------+
```

RISC uses many registers to reduce memory access.

Example:

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2

LOAD R4, C
ADD  R5, R3, R4
STORE R5, X
```

Here, `R3` keeps the temporary result instead of storing it to memory and loading it again.

---

# 8. Addressing Modes

## What is addressing mode?

An addressing mode tells the CPU **how to find the operand**.

Examples:

```asm
ADD R1, R2          ; register addressing
LOAD R1, [1000]     ; direct memory addressing
LOAD R1, [R2 + 8]   ; base + offset addressing
```

---

## CISC

CISC usually supports many addressing modes.

Example:

```asm
ADD R1, [1000]
ADD R1, [R2]
ADD R1, [R2 + 8]
ADD R1, [R2 + R3 * 4 + 100]
```

This is flexible but harder to decode.

---

## RISC

RISC uses fewer and simpler addressing modes.

Example:

```asm
LOAD R1, [R2 + 8]
STORE R3, [R4 + 12]
```

Tutorial 09 says RISC avoids complex address calculations to keep instruction decoding fast. 

---

# 9. Pipelining and RISC

RISC is easier to pipeline because instructions are usually:

```text
Fixed length
Simple format
Simple to decode
Register-based
Similar execution time
```

Pipeline example:

```text
Cycle:        1    2    3    4    5
Instr 1:     IF   ID   EX   MEM  WB
Instr 2:          IF   ID   EX   MEM
Instr 3:               IF   ID   EX
```

CISC is harder to pipeline because instructions may have different lengths, different formats, and different execution times.

But important:

```text
Modern CISC processors still use pipelines.
They just need more complex hardware to do it.
```

---

# 10. CISC-to-RISC

## Meaning

**CISC-to-RISC** means a CISC CPU keeps its CISC instruction set externally, but internally breaks complex instructions into simpler operations.

Example:

```asm
MULT A, B
```

Internally becomes:

```text
LOAD internal_temp1, A
LOAD internal_temp2, B
MULTIPLY internal_temp3, internal_temp1, internal_temp2
STORE result
```

---

## Why it happens

This lets a CISC CPU:

```text
Keep compatibility with old CISC programs
Use simpler internal operations
Improve pipelining and scheduling
```

Text diagram:

```text
CISC instruction outside
        ↓
Instruction translation
        ↓
RISC-like internal micro-operations
        ↓
Pipeline execution
```

---

# 11. RISC-to-CISC

## Meaning

**RISC-to-CISC** means RISC processors added more complex performance features over time.

Examples:

```text
More registers
On-chip cache
More functional units
Floating-point hardware
Special instructions
Deeper pipelines
Superscalar execution
```

So modern RISC is not always “simple hardware.”

---

## Why it happens

RISC started simple, but performance demands increased.

Designers added more hardware to improve speed.

Example:

```text
More functional units allow more instructions to execute in parallel.
On-chip cache reduces memory waiting.
Floating-point unit improves scientific/math performance.
```

---

# 12. Why the CISC/RISC Boundary Became Vague

The old view:

```text
CISC = complex
RISC = simple
```

Modern reality:

```text
CISC uses RISC-like internal operations.
RISC uses complex performance features.
```

So the boundary is no longer very clear. Your CISC vs RISC slides explicitly include sections like **Debate becoming moot**, **No Big Difference Now**, **CISC to RISC**, and **RISC to CISC**, showing this convergence. 

---

# 13. Embedded Processor Exception

Your CISC vs RISC slides include an **embedded processor exception** section. 

Embedded processors are used inside special-purpose devices.

Examples:

```text
Smartwatch
Microwave
Printer
Router
Car controller
IoT sensor
```

Embedded systems care about:

```text
Low power
Low heat
Small chip area
Low cost
Battery life
Integrated peripherals
```

So CISC can be unsuitable because complex hardware may consume more power and generate more heat.

---

# 14. MIPS/Watt

## Formula

```text
MIPS per watt = MIPS ÷ watts
```

Example:

| CPU | MIPS | Power | MIPS/Watt |
| --- | ---: | ----: | --------: |
| A   |  100 |  10 W |        10 |
| B   |   60 |   2 W |        30 |

CPU A is faster, but CPU B is more power-efficient.

For embedded devices, CPU B may be better.

---

# 15. IC Manufacturing Economics

The slides include an **Economics of IC Manufacturing** section and transistor-count examples. 

The key idea:

```text
Designers have a transistor budget.
They must decide how to spend it.
```

Possible uses of transistors:

```text
Complex instruction decoder
Registers
Cache
Pipeline logic
Branch prediction
Floating-point unit
Extra ALUs
Multiple cores
```

---

# 16. Transistor Count Story

## Around 500k transistors

A RISC CPU could use fewer transistors for the CPU core and spend more on on-chip cache.

```text
500k transistors

RISC:
+------------------+
| Simple CPU core  |
| On-chip cache    |
+------------------+

CISC:
+------------------+
| Complex CPU core |
| Little/no cache  |
+------------------+
```

So RISC had an advantage because of cache, not only because it was RISC.

---

## Around 2M transistors

CISC could now include both:

```text
Complex CISC core
On-chip cache
```

So CISC became competitive again.

---

## Around 5M transistors

Superscalar became important.

Superscalar prefers instructions that are:

```text
Simple
Regular
Easy to decode
Easy to schedule
```

This pushed CISC processors to become internally more RISC-like.

---

## Around 50M transistors

Both CISC and RISC processors could include many advanced features:

```text
Large cache
Branch prediction
Out-of-order execution
Superscalar execution
Floating-point units
Multiple cores
```

So CISC and RISC became more similar.

---

# 17. Case Study: Multiplying Two Numbers in Memory

The slide case study compares CISC and RISC using multiplication of two memory values. 

Goal:

```text
Memory[2:3] = Memory[2:3] × Memory[5:2]
```

---

## CISC Approach

```asm
MULT 2:3, 5:2
```

Meaning:

```text
Take value at memory location 2:3
Take value at memory location 5:2
Multiply them
Store result back into 2:3
```

If:

```text
Memory[2:3] = 6
Memory[5:2] = 4
```

After:

```asm
MULT 2:3, 5:2
```

Result:

```text
Memory[2:3] = 24
Memory[5:2] = 4
```

### CISC advantages

```text
Shorter code
Fewer assembly instructions
Closer to high-level language
```

### CISC disadvantages

```text
Complex hardware
Complex decoder
May take multiple cycles
Harder to pipeline
```

---

## RISC Approach

```asm
LOAD  A, 2:3
LOAD  B, 5:2
PROD  A, B
STORE 2:3, A
```

Step-by-step:

```text
LOAD A, 2:3     → A = Memory[2:3]
LOAD B, 5:2     → B = Memory[5:2]
PROD A, B       → A = A × B
STORE 2:3, A    → Memory[2:3] = A
```

If:

```text
Memory[2:3] = 6
Memory[5:2] = 4
```

Trace:

```text
A = 6
B = 4
A = 6 × 4 = 24
Memory[2:3] = 24
```

### RISC advantages

```text
Simple instructions
Easy to pipeline
Clear LOAD/STORE separation
Register-to-register execution
Simpler hardware
```

### RISC disadvantages

```text
More instructions
Larger code size
Compiler must work harder
```

---

# 18. CISC vs RISC Case Study Summary

| Feature           | CISC                      | RISC                            |
| ----------------- | ------------------------- | ------------------------------- |
| Code              | `MULT 2:3, 5:2`           | `LOAD`, `LOAD`, `PROD`, `STORE` |
| Instruction count | 1                         | 4                               |
| Memory access     | Hidden inside instruction | Explicit                        |
| Register use      | Hidden internally         | Visible                         |
| Hardware burden   | Higher                    | Lower                           |
| Compiler burden   | Lower                     | Higher                          |
| Code size         | Smaller                   | Larger                          |
| Pipelining        | Harder                    | Easier                          |

---

# 19. Tutorial 09 Question 1

## Characteristics of RISC Organization

Tutorial 09 asks for the characteristics that distinguish RISC organization. 

A good exam answer:

```text
The main characteristics of RISC organization are:

1. One instruction per cycle
RISC instructions are simple enough to be executed quickly and are suitable for pipelining.

2. Register-to-register operations
Most arithmetic and logic operations are done using CPU registers. Memory is accessed mainly using LOAD and STORE.

3. Large number of registers
RISC processors use many general-purpose registers or register windows to reduce memory access.

4. Simple and few addressing modes
RISC avoids complex address calculations so instruction decoding is faster.

5. Fixed-length simple instruction formats
RISC instructions are usually the same size, such as 32 bits, making fetching and decoding predictable.
```

---

# 20. Tutorial 09 Question 2

## Two Approaches to Minimize Register-Memory Operations

Tutorial 09 asks for two approaches used to minimize register-memory operations in RISC machines: software/compiler-based approach and hardware/register-window approach. 

---

## Approach 1: Software Approach / Compiler-Based Register Allocation

The compiler decides which variables should stay in registers and which should go to memory.

Example bad code:

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2
STORE R3, X

LOAD R4, X
LOAD R5, C
ADD  R6, R4, R5
STORE R6, Y
```

Problem:

```text
X is stored to memory and loaded again.
```

Better code:

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2

LOAD R4, C
ADD  R5, R3, R4
STORE R5, Y
```

Here, `R3` keeps the value of `X`, so memory access is reduced.

---

## Approach 2: Hardware Approach / Register Windows

The CPU has many physical registers, but each function sees only a small active window.

Example:

```text
Physical registers:
R0 R1 R2 R3 R4 R5 R6 R7 R8 R9
```

Main function sees:

```text
R0 R1 R2 R3 R4 R5
```

Called function sees:

```text
R4 R5 R6 R7 R8 R9
```

Some registers overlap to pass parameters.

This reduces the need to save and restore registers to memory during function calls.

---

# 21. Important Exam Sentences

Memorize these:

```text
CISC uses a large and complex instruction set. One instruction may perform several low-level operations, including memory access and arithmetic. This reduces code size but increases hardware complexity.
```

```text
RISC uses a smaller and simpler instruction set. It emphasizes register-to-register operations, fixed-length instruction formats, simple addressing modes, and LOAD/STORE memory access. This makes pipelining easier but may increase code size.
```

```text
Modern CISC and RISC processors are no longer completely separate. CISC processors often translate complex instructions into simpler internal operations, while RISC processors add complex performance features such as cache, branch prediction, superscalar execution, and floating-point units.
```

---

# 22. Common Mistakes

## Mistake 1

```text
RISC has fewer instructions, so RISC programs are always shorter.
```

Wrong.

Correct:

```text
RISC has fewer instruction types, but RISC programs may need more instructions.
```

---

## Mistake 2

```text
CISC is always faster because it uses fewer instructions.
```

Wrong.

Correct:

```text
A CISC instruction may take many cycles internally.
```

---

## Mistake 3

```text
RISC does not use memory.
```

Wrong.

Correct:

```text
RISC uses memory mainly through LOAD and STORE instructions.
```

---

## Mistake 4

```text
CISC cannot be pipelined.
```

Wrong.

Correct:

```text
Modern CISC CPUs can be pipelined, but the hardware is more complex.
```

---

## Mistake 5

```text
CISC and RISC are still completely separate today.
```

Wrong.

Correct:

```text
Modern processors borrow ideas from both sides.
```

---

# 23. Viva / Exam-Style Questions

## Q1. What does CISC stand for?

Complex Instruction Set Computer.

---

## Q2. What does RISC stand for?

Reduced Instruction Set Computer.

---

## Q3. Why did CISC become popular historically?

Because memory was expensive, and CISC instructions could reduce program size by doing more work per instruction.

---

## Q4. Why did RISC become popular?

Because simple instructions are easier to decode, pipeline, and optimize. Many complex instructions were rarely used.

---

## Q5. What is load/store architecture?

It means only `LOAD` and `STORE` instructions access memory. Arithmetic and logic operations use registers.

---

## Q6. Why is RISC easier to pipeline?

Because RISC instructions are usually fixed-length, simple, regular, and easier to decode.

---

## Q7. Why does CISC usually have smaller code size?

Because one complex instruction can replace several simple instructions.

---

## Q8. Why does RISC use many registers?

To reduce slow memory access and keep frequently used values inside the CPU.

---

## Q9. What is CISC-to-RISC?

It means a CISC processor keeps CISC instructions externally but internally breaks them into simpler RISC-like micro-operations.

---

## Q10. What is RISC-to-CISC?

It means RISC processors add more complex performance features, such as cache, more functional units, floating-point hardware, and deeper pipelines.

---

## Q11. Why is CISC often unsuitable for embedded processors?

Because complex hardware may consume more power, generate more heat, and leave less chip area for integrated peripherals.

---

## Q12. What is MIPS/watt?

It is the number of million instructions per second achieved per watt of power used.

---

# 24. Final Chapter 12 Summary

```text
CISC tries to do more work per instruction.
RISC tries to make each instruction simple and fast.

CISC reduces code size but increases hardware complexity.
RISC simplifies hardware and improves pipelining but may increase code size.

CISC often supports memory-to-memory operations.
RISC usually uses register-to-register operations with LOAD and STORE.

Historically, CISC was useful when memory was expensive.
RISC became attractive when pipelining, compiler optimization, and transistor usage became more important.

Modern processors are mixed.
CISC CPUs use RISC-like internal execution.
RISC CPUs use complex performance features.
So the CISC/RISC boundary is now less clear.
```

Chapter 12 is now complete.
