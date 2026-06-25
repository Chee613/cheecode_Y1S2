# Chapter 9: Pipelining — Complete Revision Notes

## 1. Big Idea of Pipelining

### What pipelining means

Pipelining is a processor technique where the CPU divides instruction execution into smaller stages and overlaps multiple instructions.

Instead of doing this:

```text
Instruction 1: Fetch → Decode → Execute → Write
Instruction 2: Fetch → Decode → Execute → Write
Instruction 3: Fetch → Decode → Execute → Write
```

The CPU does this:

```text
Cycle 1: I1 Fetch
Cycle 2: I1 Decode   + I2 Fetch
Cycle 3: I1 Execute  + I2 Decode  + I3 Fetch
Cycle 4: I1 Write    + I2 Execute + I3 Decode + I4 Fetch
```

So many instructions are inside the processor at the same time, but each is at a different stage.

---

## 2. Why Pipelining Improves Performance

Pipelining improves **throughput**.

Throughput means:

```text
How many instructions are completed per unit time.
```

Important:

```text
Pipelining does not necessarily make one instruction faster.
Pipelining makes many instructions finish faster overall.
```

### Simple analogy

Making burgers:

```text
Without pipeline:
Burger 1: Cook → Pack → Serve
Burger 2: Cook → Pack → Serve

With pipeline:
Time 1: Burger 1 cooking
Time 2: Burger 1 packing  + Burger 2 cooking
Time 3: Burger 1 serving  + Burger 2 packing + Burger 3 cooking
```

One burger may still take the same total time, but after the pipeline is full, burgers come out faster.

---

## 3. Latency vs Throughput

### Latency

Latency is:

```text
Time taken for ONE instruction to pass through the entire pipeline.
```

Example:

```text
5-stage pipeline
Each stage = 2 ns

Latency = 5 × 2 ns = 10 ns
```

### Throughput

Throughput is:

```text
How frequently completed instructions come out.
```

Example:

```text
After pipeline is full:
1 instruction may complete every cycle.
```

### Key exam point

```text
Pipelining improves throughput, not necessarily latency.
```

---

## 4. Two-Stage Pipeline

A simple pipeline has two stages:

```text
Fetch → Execute
```

### Example: 4 instructions

Assume:

```text
Fetch = 1 time unit
Execute = 1 time unit
```

Without pipeline:

```text
Each instruction = 2 time units

4 instructions = 4 × 2 = 8 time units
```

Timing diagram:

```text
Time:          1   2   3   4   5   6   7   8
Instruction 1 F   E
Instruction 2         F   E
Instruction 3                 F   E
Instruction 4                         F   E
```

With pipeline:

```text
Time:          1   2   3   4   5
Instruction 1 F   E
Instruction 2     F   E
Instruction 3         F   E
Instruction 4             F   E
```

Pipelined time:

```text
5 time units
```

Speedup:

```text
Speedup = unpipelined time / pipelined time
        = 8 / 5
        = 1.6
```

---

## 5. Six-Stage Instruction Pipeline

A common textbook pipeline has six stages:

```text
FI → DI → CO → FO → EI → WO
```

### Stage meanings

| Stage | Full name           | Meaning                                    |
| ----- | ------------------- | ------------------------------------------ |
| FI    | Fetch Instruction   | Fetch the instruction from memory/cache    |
| DI    | Decode Instruction  | Decode opcode and operands                 |
| CO    | Calculate Operands  | Calculate effective address                |
| FO    | Fetch Operands      | Fetch operand values from memory/registers |
| EI    | Execute Instruction | Perform ALU/control operation              |
| WO    | Write Operand       | Write result back                          |

---

## 6. Six Stages Explained

### FI: Fetch Instruction

The CPU gets the instruction from memory or cache.

Example:

```asm
ADD R1, R2
```

FI fetches the instruction itself.

Common mistake:

```text
FI fetches the instruction, not the data operand.
```

---

### DI: Decode Instruction

The CPU understands the instruction.

Example:

```asm
ADD R1, R2
```

Decode result:

```text
Opcode = ADD
Operands = R1, R2
Meaning = R1 = R1 + R2
```

Common mistake:

```text
Decode is not execution.
Decode only understands the instruction.
```

---

### CO: Calculate Operands

This stage calculates the effective address if memory is involved.

Example:

```asm
LOAD R1, 100(R2)
```

If:

```text
R2 = 500
```

Then:

```text
Effective address = 100 + 500 = 600
```

Common mistake:

```text
CO calculates the address.
FO fetches the actual value.
```

---

### FO: Fetch Operands

This stage fetches the actual data.

Example:

```asm
LOAD R1, 100(R2)
```

If CO calculated address 600:

```text
FO fetches Memory[600]
```

---

### EI: Execute Instruction

This stage performs the actual operation.

Example:

```asm
ADD R1, R2
```

EI does:

```text
ALU calculates R1 + R2
```

---

### WO: Write Operand

This stage stores the result.

Example:

```asm
ADD R1, R2
```

WO writes:

```text
R1 = result
```

---

## 7. Six-Stage Pipeline Timing Diagram

For 9 instructions and 6 stages:

### Without pipelining

```text
Unpipelined time = k × n
                 = 6 × 9
                 = 54 time units
```

### With pipelining

```text
Pipelined time = k + (n - 1)
               = 6 + (9 - 1)
               = 14 time units
```

Timing diagram:

```text
Time:          1   2   3   4   5   6   7   8   9   10  11  12  13  14
Instruction 1 FI  DI  CO  FO  EI  WO
Instruction 2     FI  DI  CO  FO  EI  WO
Instruction 3         FI  DI  CO  FO  EI  WO
Instruction 4             FI  DI  CO  FO  EI  WO
Instruction 5                 FI  DI  CO  FO  EI  WO
Instruction 6                     FI  DI  CO  FO  EI  WO
Instruction 7                         FI  DI  CO  FO  EI  WO
Instruction 8                             FI  DI  CO  FO  EI  WO
Instruction 9                                 FI  DI  CO  FO  EI  WO
```

Speedup:

```text
Speedup = 54 / 14
        ≈ 3.86
```

Important:

```text
A 6-stage pipeline does not always give 6× speedup.
```

---

## 8. General Pipeline Formula

Let:

```text
k = number of pipeline stages
n = number of instructions
```

Then:

```text
Unpipelined time = k × n
```

```text
Pipelined time = k + (n - 1)
```

```text
Speedup = (k × n) / [k + (n - 1)]
```

---

## 9. Example: 600 Instructions with 6-Stage Pipeline

Given:

```text
k = 6
n = 600
```

Unpipelined:

```text
6 × 600 = 3600 time units
```

Pipelined:

```text
6 + (600 - 1)
= 6 + 599
= 605 time units
```

Speedup:

```text
3600 / 605 ≈ 5.95
```

Why close to 6?

```text
Because with many instructions, pipeline filling time becomes less significant.
```

---

## 10. Pipeline Latches

A latch is a small storage element between pipeline stages.

Diagram:

```text
[Stage 1] → [Latch] → [Stage 2] → [Latch] → [Stage 3]
```

### Why latches are needed

They hold intermediate results between stages.

Example:

```text
Fetch stage produces instruction bits.
Latch stores them.
Decode stage reads them in the next cycle.
```

### Problem

Latches add delay.

This delay is called:

```text
Latch latency
```

---

## 11. Latch Latency Calculation

Given:

```text
Unpipelined cycle time = 10 ns
Latch latency = 0.5 ns
```

Formula:

```text
Pipelined cycle time = (Unpipelined cycle time / number of stages) + latch latency
```

```text
Cycle time = (10 / k) + 0.5
```

Latency:

```text
Latency = k × cycle time
```

### Answer table

| Stages | Cycle time calculation | Cycle time |            Latency |
| -----: | ---------------------: | ---------: | -----------------: |
|      2 |             10/2 + 0.5 |     5.5 ns |    2 × 5.5 = 11 ns |
|      4 |             10/4 + 0.5 |     3.0 ns |    4 × 3.0 = 12 ns |
|      8 |             10/8 + 0.5 |    1.75 ns |   8 × 1.75 = 14 ns |
|     16 |            10/16 + 0.5 |   1.125 ns | 16 × 1.125 = 18 ns |

### Key lesson

As stages increase:

```text
Cycle time decreases.
But latency may increase because latch overhead is added at every stage.
```

---

## 12. Pipeline Hazards

A pipeline hazard is a situation where the pipeline cannot continue normally.

The pipeline may need to stall.

A stall is also called a:

```text
Pipeline bubble
```

### Three types of hazards

```text
1. Resource hazard
2. Data hazard
3. Control hazard
```

---

## 13. Resource Hazard / Structural Hazard

### What it means

A resource hazard happens when two pipeline stages need the same hardware resource at the same time.

It is also called a structural hazard.

Examples of resources:

```text
Memory
Cache
ALU
Register file
Bus
```

### Example

In a six-stage pipeline:

```text
FI = fetch instruction from memory
FO = fetch operand from memory
WO = write result to memory
```

If all three need memory at the same time and memory has only one port:

```text
Resource hazard occurs.
```

Diagram:

```text
FI  ──┐
FO  ──┼──→ Memory
WO  ──┘
```

If memory can only serve one request at a time, some stage must wait.

### Solutions

```text
1. Stall the pipeline
2. Add more memory ports
3. Use separate instruction cache and data cache
4. Add more ALUs
5. Add more register file ports
```

---

## 14. Data Hazards

A data hazard happens when instructions depend on the same register or memory value.

Main types:

```text
RAW
WAR
WAW
```

---

## 15. RAW: Read After Write

RAW means:

```text
Instruction 1 writes a value.
Instruction 2 reads that value.
```

Correct order:

```text
Write first → Read later
```

Example:

```asm
ADD R1, R2      ; R1 = R1 + R2
SUB R3, R1      ; R3 = R3 - R1
```

`SUB` needs the new value of `R1`.

If `SUB` reads too early, it reads the old value.

RAW is also called:

```text
True dependency
```

### RAW example with values

Before:

```text
R1 = 10
R2 = 5
R3 = 100
```

Instruction 1:

```asm
ADD R1, R2
```

Result:

```text
R1 = 15
```

Instruction 2:

```asm
SUB R3, R1
```

Correct:

```text
R3 = 100 - 15 = 85
```

Wrong if old value used:

```text
R3 = 100 - 10 = 90
```

---

## 16. WAR: Write After Read

WAR means:

```text
Instruction 1 reads a value.
Instruction 2 writes to the same location.
```

Correct order:

```text
Read old value first → Write new value later
```

Example:

```asm
I1: ADD R3, R1      ; reads R1
I2: MOV R1, R4      ; writes R1
```

If `I2` writes too early, `I1` may read the wrong new value.

WAR is also called:

```text
Antidependency
```

---

## 17. WAW: Write After Write

WAW means:

```text
Instruction 1 writes to a location.
Instruction 2 also writes to the same location.
```

Correct order:

```text
I1 writes first.
I2 writes second.
```

Example:

```asm
I1: ADD R1, R2
I2: MOV R1, R5
```

Correct final value should come from `I2`.

WAW is also called:

```text
Output dependency
```

---

## 18. Summary: RAW vs WAR vs WAW

| Hazard | Full name         | Pattern                  | Meaning                             |
| ------ | ----------------- | ------------------------ | ----------------------------------- |
| RAW    | Read After Write  | I1 writes X, I2 reads X  | I2 needs I1 result                  |
| WAR    | Write After Read  | I1 reads X, I2 writes X  | I1 needs old value before overwrite |
| WAW    | Write After Write | I1 writes X, I2 writes X | Write order must be preserved       |

Memory trick:

```text
RAW = Need new value
WAR = Need old value
WAW = Need correct final write order
```

---

## 19. How to Handle Data Hazards

### Method 1: Stall / bubble

The CPU waits until the data is safe.

```text
Hazard detected → insert bubble → continue
```

Simple but slower.

---

### Method 2: Forwarding / bypassing

The CPU sends the result directly from one pipeline stage to another without waiting for write-back.

Example:

```text
ALU result → forwarded directly to next instruction
```

This reduces stalls.

---

### Method 3: Compiler reordering

The compiler places an independent instruction between dependent instructions.

Original:

```asm
LOAD R1, [A]
ADD  R2, R1
```

Reordered:

```asm
LOAD R1, [A]
MOV  R5, R6      ; independent instruction
ADD  R2, R1
```

---

## 20. Control Hazard / Branch Hazard

A control hazard happens when the CPU does not know which instruction should be fetched next because of a branch.

It is also called:

```text
Branch hazard
```

Example:

```asm
CMP R1, R2
BEQ TARGET
ADD R3, R4
TARGET:
SUB R5, R6
```

After `BEQ TARGET`, there are two possible paths:

```text
If branch not taken → ADD R3, R4
If branch taken     → SUB R5, R6
```

The pipeline may fetch the wrong path.

---

## 21. Pipeline Flush

Pipeline flush means removing wrongly fetched instructions from the pipeline.

Example:

```text
CPU predicts branch not taken.
CPU fetches ADD R3, R4.
Actually branch is taken.
ADD R3, R4 is wrong.
CPU flushes it.
```

---

## 22. Branch Penalty

Branch penalty is the number of cycles lost because of branch hazard recovery.

Example:

```text
Wrongly fetched 2 instructions
Need 2 cycles to recover

Branch penalty = 2 cycles
```

---

## 23. Branch Handling Techniques

There are five main techniques:

```text
1. Multiple streams
2. Prefetch branch target
3. Loop buffer
4. Branch prediction
5. Delayed branch
```

---

## 24. Multiple Streams

### Meaning

The CPU fetches both possible branch paths.

Example:

```text
Branch instruction
      ├── branch taken path
      └── branch not taken path
```

### Advantage

Both paths are prepared.

### Disadvantage

```text
Requires extra hardware.
Can cause register/memory contention.
Complicated if more branches appear inside each path.
```

---

## 25. Prefetch Branch Target

### Meaning

When a branch is detected, the CPU fetches the branch target early.

Example:

```asm
100: BEQ 200
101: ADD R1, R2
200: SUB R3, R4
```

The CPU fetches:

```text
101 = next sequential instruction
200 = branch target
```

If the branch is taken, target is already available.

### Disadvantage

If branch is not taken, the prefetched target may be wasted.

---

## 26. Loop Buffer

### Meaning

A loop buffer is a small fast memory that stores recently fetched instructions.

Best for loops.

Example:

```asm
LOOP:
    ADD R1, R2
    SUB R3, R4
    DEC R5
    BNE LOOP
```

If the loop buffer contains all loop instructions, the CPU does not need to repeatedly fetch them from main memory.

### Loop buffer vs instruction cache

| Feature  | Loop buffer                              | Instruction cache               |
| -------- | ---------------------------------------- | ------------------------------- |
| Size     | Very small                               | Larger                          |
| Stores   | Recently fetched sequential instructions | Instruction blocks              |
| Best for | Loops                                    | General instruction fetch speed |

---

## 27. Branch Prediction

Branch prediction means the CPU guesses whether a branch will be taken or not taken.

### Static prediction

Static means the rule does not change during execution.

Types:

```text
1. Predict never taken
2. Predict always taken
3. Predict by opcode
```

---

### Predict never taken

CPU assumes branch will not happen.

Example:

```asm
BEQ TARGET
ADD R1, R2
```

CPU fetches:

```text
ADD R1, R2
```

---

### Predict always taken

CPU assumes branch will happen.

Example:

```asm
BEQ TARGET
ADD R1, R2
TARGET:
SUB R3, R4
```

CPU fetches:

```text
SUB R3, R4
```

Useful for loops because loop branches are often taken many times.

---

### Predict by opcode

CPU predicts based on the type of branch instruction.

Some branch opcodes are likely taken, while others are likely not taken.

---

## 28. Dynamic Branch Prediction

Dynamic prediction learns from execution history.

Types:

```text
1. Taken/not-taken switch
2. Branch history table
```

---

### Taken/not-taken switch

Uses a bit to remember recent branch behavior.

Example:

```text
0 = predict not taken
1 = predict taken
```

If branch was taken last time, predict taken next time.

---

### Branch history table

A branch history table stores prediction information for recently executed branch instructions.

Example:

| Branch address | Prediction |
| -------------- | ---------- |
| 100            | taken      |
| 240            | not taken  |
| 500            | taken      |

Process:

```text
1. CPU sees branch.
2. CPU checks branch history table.
3. CPU predicts taken or not taken.
4. Branch executes.
5. CPU updates table.
6. If prediction was wrong, flush wrong path.
```

---

## 29. Delayed Branch

Delayed branch means the instruction immediately after the branch is always executed before the branch takes effect.

That instruction is called the:

```text
Delay slot
```

Example:

```asm
BEQ TARGET
ADD R1, R2      ; delay slot
TARGET:
SUB R3, R4
```

The compiler tries to place a safe useful instruction in the delay slot.

### Safe delay-slot instruction

It must be correct whether the branch is taken or not taken.

Unsafe example:

```asm
BEQ TARGET
ADD R1, R2      ; unsafe if ADD should only run when branch is not taken
TARGET:
SUB R3, R4
```

---

## 30. Branch Techniques Summary

| Technique              | Main idea                 | Advantage              | Weakness                            |
| ---------------------- | ------------------------- | ---------------------- | ----------------------------------- |
| Multiple streams       | Fetch both paths          | Reduces waiting        | Expensive hardware                  |
| Prefetch branch target | Fetch target early        | Faster if branch taken | Wasted if not taken                 |
| Loop buffer            | Store recent instructions | Excellent for loops    | Small and limited                   |
| Branch prediction      | Guess branch outcome      | Good general solution  | Wrong guess causes flush            |
| Delayed branch         | Fill branch delay slot    | Avoids wasted cycle    | Compiler must find safe instruction |

---

## 31. Intel 80486 Pipeline

The Intel 80486 uses a five-stage pipeline:

```text
Fetch → Decode 1 → Decode 2 → Execute → Write Back
```

Diagram:

```text
┌────────┐   ┌──────────┐   ┌──────────┐   ┌─────────┐   ┌────────────┐
│ Fetch  │ → │ Decode 1 │ → │ Decode 2 │ → │ Execute │ → │ Write Back │
└────────┘   └──────────┘   └──────────┘   └─────────┘   └────────────┘
```

---

## 32. Intel 80486 Stages

### Fetch

Fetches instruction bytes from cache or external memory into prefetch buffers.

Important:

```text
x86 instructions are variable length.
So the CPU fetches bytes, not fixed-size instructions.
```

---

### Decode 1

Decodes:

```text
Opcode
Addressing mode
Instruction length information
```

---

### Decode 2

Generates ALU control signals and handles more complex addressing.

Example:

```asm
MOV EAX, [EBX + 100]
```

The CPU must understand:

```text
Effective address = EBX + 100
```

---

### Execute

Performs:

```text
ALU operation
cache access
register update
```

---

### Write Back

Writes the result to the destination register or memory.

Example:

```asm
ADD EAX, EBX
```

Write back:

```text
EAX = result
```

---

## 33. Why 80486 Pipelining Is Harder Than Textbook Pipeline

Because x86 has:

```text
Variable-length instructions
Complex addressing modes
Different instruction types
Memory/cache access differences
Branches
Data dependencies
Resource conflicts
```

So real pipelines are more complicated than simple diagrams.

---

## 34. EU and BIU

### BIU: Bus Interface Unit

The BIU handles communication with memory and I/O.

Functions:

```text
Fetch instructions
Fetch operands
Write results to memory
Communicate through system bus
```

Diagram:

```text
CPU ↔ BIU ↔ System Bus ↔ Memory / I/O
```

---

### EU: Execution Unit

The EU decodes and executes instructions.

Functions:

```text
Decode instruction
Use ALU
Use registers
Update flags
Execute operation
```

---

### BIU vs EU

| Unit | Main job                    |
| ---- | --------------------------- |
| BIU  | Fetch and bus communication |
| EU   | Decode and execute          |

---

## 35. Common Mistakes

### Mistake 1: Thinking pipelining makes one instruction faster

Correct:

```text
Pipelining improves throughput more than latency.
```

---

### Mistake 2: Forgetting pipeline fill time

Wrong:

```text
Pipelined time = n
```

Correct:

```text
Pipelined time = k + (n - 1)
```

---

### Mistake 3: Thinking speedup always equals number of stages

Correct:

```text
Ideal speedup approaches number of stages only for many instructions.
```

---

### Mistake 4: Confusing CO and FO

```text
CO = calculate address
FO = fetch actual operand
```

---

### Mistake 5: Confusing hazard types

```text
Resource hazard = hardware conflict
Data hazard = data dependency
Control hazard = branch path problem
```

---

### Mistake 6: Confusing loop buffer and branch history table

```text
Loop buffer stores instructions.
Branch history table stores prediction information.
```

---

## 36. Exam / Viva Questions

### Q1. What is pipelining?

Pipelining is a technique where instruction execution is divided into stages and multiple instructions are processed at different stages at the same time.

---

### Q2. Why does pipelining improve performance?

Because it overlaps instruction execution stages and increases instruction throughput.

---

### Q3. What is pipeline latency?

Pipeline latency is the time taken for one instruction to pass through the entire pipeline.

---

### Q4. List the six stages of an instruction pipeline.

```text
FI, DI, CO, FO, EI, WO
```

---

### Q5. What is a pipeline hazard?

A pipeline hazard is a situation where the pipeline cannot continue normally and may need to stall.

---

### Q6. What are the three types of pipeline hazards?

```text
Resource hazard
Data hazard
Control hazard
```

---

### Q7. What is a resource hazard?

A resource hazard occurs when two or more pipeline stages need the same hardware resource at the same time.

---

### Q8. What is a RAW hazard?

RAW means Read After Write. A later instruction reads a value before an earlier instruction has written it.

---

### Q9. What is a control hazard?

A control hazard happens when the CPU does not know which instruction to fetch next because of a branch instruction.

---

### Q10. What is branch prediction?

Branch prediction is a technique where the CPU guesses whether a branch will be taken or not taken.

---

### Q11. What is delayed branch?

Delayed branch means the instruction immediately after a branch is executed before the branch takes effect.

---

### Q12. What is the function of BIU?

BIU handles bus communication, instruction fetching, operand fetching, and memory/I/O communication.

---

### Q13. What is the function of EU?

EU decodes and executes instructions using the ALU and registers.

---

## 37. Key Formulas

### Pipelined time

```text
Pipelined time = k + (n - 1)
```

### Unpipelined time

```text
Unpipelined time = k × n
```

### Speedup

```text
Speedup = unpipelined time / pipelined time
```

### Pipelined cycle time with latch latency

```text
Pipelined cycle time = (Unpipelined cycle time / k) + latch latency
```

### Pipeline latency

```text
Latency = number of stages × pipelined cycle time
```

---

## 38. Final Quick Revision Sheet

```text
Pipelining:
Overlapping instruction stages.

Main benefit:
Higher throughput.

Does it reduce single instruction latency?
Not always.

Six stages:
FI = Fetch Instruction
DI = Decode Instruction
CO = Calculate Operand address
FO = Fetch Operand
EI = Execute Instruction
WO = Write Operand

Pipeline time:
k + (n - 1)

Unpipelined time:
k × n

Hazards:
Resource = hardware conflict
Data = dependency problem
Control = branch problem

Data hazards:
RAW = Read After Write
WAR = Write After Read
WAW = Write After Write

Branch techniques:
Multiple streams
Prefetch branch target
Loop buffer
Branch prediction
Delayed branch

Intel 80486:
Fetch → Decode 1 → Decode 2 → Execute → Write Back

BIU:
Fetch and bus communication.

EU:
Decode and execute.
```

---

# End of Chapter 9 Pipelining Notes
