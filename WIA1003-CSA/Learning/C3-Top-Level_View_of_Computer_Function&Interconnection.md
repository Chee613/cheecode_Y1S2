# Chapter 3: A Top-Level View of Computer Function and Interconnection

## 1. Big Picture

Chapter 3 explains how the main parts of a computer work together.

Main question:

```text
How does a computer fetch instructions, execute them, handle interrupts,
move data, and connect CPU, memory, and I/O devices?
```

Main topics:

```text
1. Computer components
2. Computer function
3. Instruction fetch and execute
4. Interrupts
5. I/O function
6. Interconnection structures
7. Bus interconnection
8. Point-to-point interconnect
9. QPI
10. PCI Express
```

---

# 2. Von Neumann Architecture

## What it means

Modern computers are mainly based on von Neumann architecture.

It has three key ideas:

```text
1. Data and instructions are stored in one read-write memory.
2. Memory contents are addressable by location.
3. Instructions execute sequentially unless explicitly changed.
```

---

## Why we need it

Before stored-program computers, a machine might need to be rewired for a new task.

With von Neumann architecture:

```text
Change the program in memory
        ↓
Computer performs a different task
```

Same hardware can run many programs.

Examples:

```text
Calculator
Browser
Game
Word processor
Compiler
```

---

## Simple memory example

```text
Address     Content
300         LOAD 940       instruction
301         ADD 941        instruction
302         STORE 941      instruction
940         0003           data
941         0002           data
```

Instructions and data are both stored in memory.

---

## Common mistakes

```text
Mistake 1:
Thinking instructions and data must always be in separate memories.

Correct:
In von Neumann architecture, instructions and data share one memory.

Mistake 2:
Thinking memory automatically knows whether something is instruction or data.

Correct:
The CPU decides how to interpret the bits depending on what it is doing.
```

---

## Viva questions

**Q1. What are the three key concepts of von Neumann architecture?**

```text
1. Data and instructions are stored in one read-write memory.
2. Memory is addressable by location.
3. Execution occurs sequentially unless explicitly modified.
```

**Q2. Why is von Neumann architecture flexible?**

Because the computer can perform a new task by loading a new program into memory, without rewiring the hardware.

---

# 3. Hardwired Program vs Software

## Hardwired program

A hardwired program means the task is built directly into hardware wiring.

```text
Data → Fixed hardware → Result
```

Changing the task may require changing the hardware.

---

## Software program

Software is a sequence of instruction codes.

```text
Instruction 1
Instruction 2
Instruction 3
...
```

The hardware reads each instruction and generates control signals.

---

## Why software is important

Without software:

```text
New task → change hardware
```

With software:

```text
New task → change instructions in memory
```

---

## Simple diagram

```text
Hardwired approach:

Data ---> Special-purpose hardware ---> Result


Software approach:

Data --------+
             v
        General CPU ---> Result
             ^
             |
        Instructions
```

---

## Common mistakes

```text
Mistake:
Thinking software and hardware are unrelated.

Correct:
Software controls what hardware does.
```

---

# 4. Main Computer Components

A computer has these major components:

```text
1. CPU
2. Memory
3. Input module
4. Output module
5. I/O modules
```

---

## Simple structure

```text
                 +----------------------+
                 |        Memory        |
                 | Instructions + Data  |
                 +----------^-----------+
                            |
                            v
+---------+        +------------------+        +----------+
| Input   | -----> |       CPU        | -----> | Output   |
| Module  |        | Instruction      |        | Module   |
+---------+        | Interpreter      |        +----------+
                   | Arithmetic/Logic |
                   +------------------+
```

---

# 5. CPU

## What it means

CPU stands for Central Processing Unit.

The CPU does two main things:

```text
1. Interprets instructions
2. Performs arithmetic and logic operations
```

---

## CPU parts in this chapter

```text
Instruction interpreter
Arithmetic and logic function module
```

The instruction interpreter reads instruction codes and generates control signals.

The arithmetic/logic part performs operations such as:

```text
ADD
SUBTRACT
COMPARE
AND
OR
```

---

## Common mistakes

```text
Mistake:
Thinking CPU only does arithmetic.

Correct:
CPU also fetches instructions, controls execution, moves data,
communicates with memory/I/O, and handles interrupts.
```

---

# 6. Memory

## What it means

Memory stores:

```text
Instructions
Data
```

Memory is made of locations.

Each location has an address.

---

## Example

```text
Address     Content
300         1940
301         5941
302         2941
940         0003
941         0002
```

Important:

```text
Address = location number
Content = value stored at that location
```

---

## Common mistake

```text
Mistake:
Thinking address and content are the same.

Correct:
Address tells where the data is.
Content is the actual stored value.
```

Example:

```text
Address: 940
Content: 0003
```

---

# 7. MAR, MBR, I/OAR, I/OBR

These registers help CPU communicate with memory and I/O.

---

## MAR: Memory Address Register

```text
MAR = memory address
```

It stores the address for the next memory read or write.

Example:

```text
MAR = 940
```

Meaning:

```text
CPU wants to access memory address 940.
```

---

## MBR: Memory Buffer Register

```text
MBR = memory data
```

It stores data being transferred to or from memory.

Example:

```text
Memory[940] = 0003
MBR = 0003
```

---

## I/OAR: I/O Address Register

```text
I/OAR = I/O device address
```

It identifies which I/O device the CPU wants to communicate with.

---

## I/OBR: I/O Buffer Register

```text
I/OBR = I/O data
```

It holds data being exchanged between CPU and I/O module.

---

## Very important comparison

```text
MAR   = memory address
MBR   = memory data

I/OAR = I/O device address
I/OBR = I/O data
```

---

## Common mistakes

```text
Mistake 1:
MAR stores data.

Correct:
MAR stores address.

Mistake 2:
MBR stores address.

Correct:
MBR stores data.
```

---

# 8. Program Execution

## What it means

Program execution means the CPU runs instructions stored in memory.

Basic cycle:

```text
Fetch instruction
        ↓
Execute instruction
        ↓
Fetch next instruction
        ↓
Execute next instruction
```

---

# 9. Instruction Cycle

## What it means

An instruction cycle is the complete process for one instruction.

Simple form:

```text
Instruction Cycle = Fetch Cycle + Execute Cycle
```

---

## Fetch cycle

The CPU gets the next instruction from memory.

Important registers:

```text
PC = Program Counter
IR = Instruction Register
```

---

## PC: Program Counter

```text
PC = address of next instruction
```

Example:

```text
PC = 300
```

Meaning:

```text
Next instruction is at memory address 300.
```

---

## IR: Instruction Register

```text
IR = fetched instruction
```

Example:

```text
IR = 1940
```

Meaning:

```text
The CPU has fetched instruction 1940.
```

---

## Fetch cycle example

Given:

```text
PC = 300
Memory[300] = 1940
```

Steps:

```text
1. CPU reads PC.
2. CPU fetches Memory[300].
3. IR = 1940.
4. PC increments to 301.
```

---

## Execute cycle

The CPU performs what the instruction says.

Example:

```text
Instruction: LOAD 940
```

Meaning:

```text
Read data from memory address 940 and load it into AC.
```

---

# 10. Four Categories of Instruction Actions

Instructions generally perform one or more of these:

```text
1. Processor-memory
2. Processor-I/O
3. Data processing
4. Control
```

---

## 10.1 Processor-memory

Data moves between CPU and memory.

Examples:

```assembly
LOAD 940
STORE 941
```

Meaning:

```text
LOAD 940  = Memory[940] → CPU
STORE 941 = CPU → Memory[941]
```

---

## 10.2 Processor-I/O

Data moves between CPU and I/O module.

Examples:

```text
Keyboard input → CPU
CPU → Printer output
```

---

## 10.3 Data processing

CPU performs arithmetic or logic.

Examples:

```assembly
ADD 941
SUB 500
AND R1, R2
```

---

## 10.4 Control

Changes the normal instruction sequence.

Normally:

```text
300 → 301 → 302 → 303
```

Control instruction:

```assembly
JUMP 182
```

Changes PC:

```text
PC = 182
```

---

# 11. Simple Machine Example

The lecture uses a hypothetical machine.

Characteristics:

```text
Instruction length = 16 bits
Data length = 16 bits
Opcode = 4 bits
Address field = 12 bits
Single data register = AC
```

---

## Opcode calculation

Opcode field:

```text
4 bits
```

Number of possible opcodes:

```text
2^4 = 16
```

---

## Address calculation

Address field:

```text
12 bits
```

Number of directly addressable memory words:

```text
2^12 = 4096 words
```

This is also:

```text
4K words
```

because:

```text
1K = 1024
4K = 4096
```

---

## Instruction format

```text
+------------+------------------------+
|  Opcode    |        Address         |
|  4 bits    |        12 bits         |
+------------+------------------------+
```

Example:

```text
1940
```

Can be read as:

```text
1    940
↑    ↑
LOAD address
```

---

# 12. Example Program: Add Two Memory Values

Program:

```assembly
LOAD 940
ADD 941
STORE 941
```

Memory:

```text
Address     Content
300         1940
301         5941
302         2941
940         0003
941         0002
```

Assume:

```text
1 = LOAD
5 = ADD
2 = STORE
```

---

## Step 1: LOAD 940

Fetch:

```text
PC = 300
IR = Memory[300] = 1940
PC = 301
```

Execute:

```text
AC = Memory[940]
AC = 0003
```

---

## Step 2: ADD 941

Fetch:

```text
IR = Memory[301] = 5941
PC = 302
```

Execute:

```text
AC = AC + Memory[941]
AC = 0003 + 0002
AC = 0005
```

---

## Step 3: STORE 941

Fetch:

```text
IR = Memory[302] = 2941
PC = 303
```

Execute:

```text
Memory[941] = AC
Memory[941] = 0005
```

---

## Final result

```text
Memory[940] = 0003
Memory[941] = 0005
AC = 0005
```

---

## Common mistakes

```text
Mistake 1:
LOAD 940 means load the number 940.

Correct:
LOAD 940 means load the content at address 940.

Mistake 2:
STORE changes AC.

Correct:
STORE copies AC into memory. AC usually remains unchanged.
```

---

# 13. Detailed Instruction Cycle State Diagram

The detailed instruction cycle states are:

```text
iac → if → iod → oac → of → do → oac → os
```

---

## Meaning of each state

```text
iac = Instruction Address Calculation
if  = Instruction Fetch
iod = Instruction Operation Decoding
oac = Operand Address Calculation
of  = Operand Fetch
do  = Data Operation
os  = Operand Store
```

---

## 13.1 iac: Instruction Address Calculation

Determines the address of the next instruction.

Example:

```text
If instruction size = 16 bits
and memory word = 16 bits,
PC = PC + 1
```

If memory is byte-addressable:

```text
16-bit instruction = 2 bytes
PC = PC + 2
```

---

## 13.2 if: Instruction Fetch

Reads instruction from memory into CPU.

```text
Memory[PC] → IR
```

---

## 13.3 iod: Instruction Operation Decoding

CPU decodes the instruction.

Example:

```text
5941
```

If:

```text
5 = ADD
```

Then:

```assembly
ADD 941
```

---

## 13.4 oac: Operand Address Calculation

Finds the address of the operand.

Example:

```assembly
ADD 941
```

Operand address:

```text
941
```

---

## 13.5 of: Operand Fetch

Gets the operand value.

Example:

```text
Memory[941] = 0002
```

Operand fetch gets:

```text
0002
```

---

## 13.6 do: Data Operation

Performs the actual operation.

Example:

```text
AC = AC + Memory[941]
```

---

## 13.7 os: Operand Store

Stores result into memory or sends it to I/O.

Example:

```assembly
STORE 941
```

Means:

```text
Memory[941] = AC
```

---

## Important idea

Not every instruction uses every state.

Some states may be skipped.

Some states may repeat.

Example:

```assembly
ADD A, B
```

Possible state sequence:

```text
iac, if, iod, oac, of, oac, of, do, oac, os
```

Because the CPU may need to:

```text
1. Fetch instruction
2. Fetch operand A
3. Fetch operand B
4. Add
5. Store result
```

---

# 14. Interrupts

## What it means

An interrupt is a signal that tells the CPU:

```text
Pause normal execution temporarily.
Something needs attention.
```

---

## Why interrupts are needed

External devices are usually slower than the CPU.

Without interrupts, the CPU may waste time waiting.

Example:

```text
CPU sends data to printer.
Printer is slow.
CPU waits.
CPU time is wasted.
```

With interrupts:

```text
CPU starts I/O operation.
CPU continues other work.
Device interrupts CPU when ready.
```

---

# 15. Four Classes of Interrupts

```text
1. Program interrupt
2. Timer interrupt
3. I/O interrupt
4. Hardware failure interrupt
```

---

## 15.1 Program interrupt

Generated by something during instruction execution.

Examples:

```text
Division by zero
Arithmetic overflow
Illegal instruction
Memory access violation
```

---

## 15.2 Timer interrupt

Generated by a timer.

Used by the operating system for regular tasks.

Example:

```text
OS scheduler runs every fixed time interval.
```

---

## 15.3 I/O interrupt

Generated by an I/O controller.

Examples:

```text
Keyboard key pressed
Disk read completed
Printer ready
```

---

## 15.4 Hardware failure interrupt

Generated by hardware problems.

Examples:

```text
Power failure
Memory parity error
```

---

# 16. Interrupt Cycle

With interrupts, instruction cycle becomes:

```text
Fetch → Execute → Interrupt Check
```

---

## If no interrupt

```text
Continue to next fetch cycle.
```

---

## If interrupt occurs

CPU does:

```text
1. Suspends current program.
2. Saves context.
3. Saves PC.
4. Sets PC to interrupt handler address.
5. Executes interrupt handler.
6. Restores context.
7. Resumes original program.
```

---

## Interrupt handler

An interrupt handler is a special routine that services the interrupt.

Example:

```text
Keyboard interrupt → keyboard handler
Printer interrupt  → printer handler
Timer interrupt    → timer handler
```

---

## Context

Context means the information needed to continue the program later.

Important context includes:

```text
PC
Registers
Status information
```

---

## Example

Original program:

```text
100: LOAD A
101: ADD B
102: STORE C
103: HALT
```

Suppose interrupt occurs after instruction 101.

Then:

```text
PC = 102
```

CPU saves PC = 102.

Then it jumps to interrupt handler:

```text
900: HANDLE INTERRUPT
901: RETURN
```

After handler:

```text
PC = 102
```

Original program resumes at:

```text
102: STORE C
```

---

# 17. Multiple Interrupts

Multiple interrupts mean more than one interrupt occurs before the previous one is fully handled.

Example:

```text
CPU handling printer interrupt
        ↓
Disk interrupt occurs
        ↓
Communication interrupt occurs
```

There are two approaches.

---

## 17.1 Disabled interrupts

CPU disables other interrupts while handling one interrupt.

Flow:

```text
1. Interrupt occurs.
2. CPU enters interrupt handler.
3. Other interrupts are disabled.
4. New interrupt waits as pending.
5. Current handler finishes.
6. Interrupts enabled again.
7. Pending interrupt is handled.
```

Advantage:

```text
Simple.
Interrupts are handled one by one.
```

Disadvantage:

```text
Urgent interrupts may be delayed.
Time-critical data may be lost.
```

---

## 17.2 Defined priorities

Each interrupt has a priority.

Higher-priority interrupt can interrupt lower-priority ISR.

Example:

```text
Device                 Priority
Printer                2
Disk                   4
Communication line     5
```

Highest priority:

```text
Communication line
```

---

## Priority example

Timeline:

```text
t = 0    User program runs
t = 10   Printer interrupt occurs
t = 15   Communication interrupt occurs
t = 20   Disk interrupt occurs
```

Order:

```text
User program
→ Printer ISR
→ Communication ISR
→ Disk ISR
→ Printer ISR resumes
→ User program resumes
```

Reason:

```text
Communication priority 5 > Printer priority 2
Disk priority 4 < Communication priority 5
Disk priority 4 > Printer priority 2
```

---

# 18. I/O Function

## What it means

I/O function means how the computer exchanges data with external devices.

Examples:

```text
Keyboard
Mouse
Monitor
Printer
Disk
Network card
Sensor
```

---

## I/O module

The CPU usually communicates with external devices through I/O modules.

```text
CPU ↔ I/O Module ↔ External Device
```

Example:

```text
CPU ↔ Disk Controller ↔ Disk Drive
```

---

# 19. Types of Data Transfers

There are five main transfer types:

```text
1. Memory to processor
2. Processor to memory
3. I/O to processor
4. Processor to I/O
5. I/O to or from memory
```

---

## 19.1 Memory to processor

CPU reads instruction or data from memory.

Example:

```assembly
LOAD 940
```

Meaning:

```text
Memory[940] → CPU
```

---

## 19.2 Processor to memory

CPU writes data to memory.

Example:

```assembly
STORE 941
```

Meaning:

```text
CPU → Memory[941]
```

---

## 19.3 I/O to processor

CPU reads data from I/O module.

Example:

```text
Keyboard → I/O module → CPU
```

---

## 19.4 Processor to I/O

CPU sends data to I/O module.

Example:

```text
CPU → I/O module → Printer
```

---

## 19.5 I/O to or from memory

I/O module exchanges data directly with memory.

This uses DMA.

---

# 20. DMA: Direct Memory Access

## What it means

DMA allows I/O module to transfer data directly to or from memory without CPU moving every data item.

---

## Why we need DMA

Without DMA:

```text
Disk → CPU → Memory
Disk → CPU → Memory
Disk → CPU → Memory
...
```

CPU is busy moving data.

With DMA:

```text
Disk → I/O Module → Memory
```

CPU only sets up the transfer.

---

## DMA steps

```text
1. CPU tells DMA/I/O module what to transfer.
2. DMA module transfers data directly with memory.
3. CPU can do other work.
4. DMA interrupts CPU when complete.
```

---

## Common mistake

```text
Mistake:
DMA means CPU is not involved at all.

Correct:
CPU starts/configures DMA, then DMA performs the main transfer.
```

---

# 21. Interconnection Structure

## What it means

An interconnection structure is the set of paths connecting:

```text
Processor
Memory
I/O modules
```

---

## Why we need it

The modules must exchange information.

Examples:

```text
CPU fetches instruction from memory.
CPU writes result to memory.
I/O transfers data to CPU.
DMA transfers data to memory.
```

---

# 22. Bus Interconnection

## What is a bus?

A bus is a communication pathway connecting two or more devices.

Key feature:

```text
A bus is shared.
```

That means many devices connect to the same pathway.

---

## Shared bus problem

Only one device can transmit at a time.

If two devices transmit together:

```text
Signals overlap and become garbled.
```

---

## System bus

A system bus connects major computer components:

```text
CPU
Memory
I/O
```

---

# 23. Bus Lines

A bus usually has many lines.

Each line carries binary signals:

```text
0 or 1
```

Several lines can transfer bits in parallel.

Example:

```text
8 bus lines → 8 bits at once
16 bus lines → 16 bits at once
32 bus lines → 32 bits at once
```

---

# 24. Data Bus, Address Bus, Control Bus

Bus lines are commonly grouped into:

```text
1. Data bus
2. Address bus
3. Control bus
```

---

## 24.1 Data bus

Carries actual data.

Example:

```text
Memory[940] = 0003
```

During:

```assembly
LOAD 940
```

The value `0003` travels on the data bus.

---

## 24.2 Address bus

Carries the memory or I/O address.

Example:

```assembly
LOAD 940
```

The address `940` travels on the address bus.

---

## 24.3 Control bus

Carries command and timing signals.

Examples:

```text
Memory Read
Memory Write
I/O Read
I/O Write
Interrupt Request
Interrupt ACK
Bus Request
Bus Grant
Clock
Reset
```

---

## Easy comparison

```text
Address bus = where?
Data bus    = what?
Control bus = what action / when?
```

---

# 25. Bus Width

## Data bus width

Data bus width determines how much data can transfer at once.

```text
8-bit data bus  = 1 byte per transfer
16-bit data bus = 2 bytes per transfer
32-bit data bus = 4 bytes per transfer
64-bit data bus = 8 bytes per transfer
```

Formula:

```text
Bytes per transfer = data bus width / 8
```

---

## Address bus width

Address bus width determines how many locations can be addressed.

Formula:

```text
Number of locations = 2^n
```

where:

```text
n = number of address lines
```

Example:

```text
12 address lines:
2^12 = 4096 locations
```

---

# 26. Basic Bus Operation

## CPU reads memory

Example:

```assembly
LOAD 940
```

Steps:

```text
1. CPU obtains bus.
2. CPU puts 940 on address bus.
3. CPU sends Memory Read on control bus.
4. Memory puts data on data bus.
5. CPU reads data.
```

---

## CPU writes memory

Example:

```assembly
STORE 941
```

Steps:

```text
1. CPU obtains bus.
2. CPU puts 941 on address bus.
3. CPU puts data on data bus.
4. CPU sends Memory Write on control bus.
5. Memory stores the data.
```

---

# 27. Single-Bus vs Multiple-Bus Architecture

## Single-bus architecture

All major traffic uses one shared bus.

```text
CPU ===== Memory ===== I/O
```

Advantage:

```text
Simple and cheaper.
```

Disadvantage:

```text
Traffic jam / contention.
```

---

## Multiple-bus architecture

Uses more than one bus.

Example:

```text
CPU-memory traffic uses high-speed bus.
I/O traffic uses separate I/O bus.
```

Advantage:

```text
Reduces contention.
Improves performance.
Separates fast CPU-memory traffic from slower I/O traffic.
```

---

# 28. Synchronous Bus vs Asynchronous Bus

## Synchronous bus

A synchronous bus uses a common clock.

```text
All devices follow clock timing.
```

Example:

```text
Clock cycle 1: address placed
Clock cycle 2: read signal
Clock cycle 3: data ready
Clock cycle 4: data accepted
```

Advantages:

```text
Simple timing
Easy control
Good for similar-speed devices
```

Disadvantage:

```text
Slow devices may force longer fixed timing.
```

---

## Asynchronous bus

An asynchronous bus does not use one centralized clock for all events.

Instead, it uses handshaking.

Examples of handshaking signals:

```text
Ready
Acknowledge
Request
Complete
```

Advantages:

```text
Works well with devices of different speeds.
Fast and slow devices can share the bus more flexibly.
```

Disadvantages:

```text
More complex.
Handshaking adds overhead.
```

---

## Easy memory trick

```text
Synchronous = Same clock
Asynchronous = Ask and acknowledge
```

---

# 29. Bus Transfer Rate Calculation

Tutorial question:

```text
A 32-bit microprocessor has:
16-bit external data bus
16-MHz input clock
Minimum bus cycle = 4 clock cycles

Find maximum data transfer rate in bytes/s.
```

---

## Step 1: Find bus cycles per second

```text
Clock frequency = 16 MHz
                = 16,000,000 cycles/s

One bus cycle = 4 clock cycles

Bus cycles/s = 16,000,000 / 4
             = 4,000,000 bus cycles/s
```

---

## Step 2: Convert data bus width to bytes

```text
External data bus = 16 bits

16 bits / 8 = 2 bytes
```

So:

```text
Each bus cycle transfers 2 bytes.
```

---

## Step 3: Calculate transfer rate

```text
Transfer rate = bus cycles/s × bytes per bus cycle

Transfer rate = 4,000,000 × 2
              = 8,000,000 bytes/s
```

Final answer:

```text
8,000,000 bytes/s = 8 MB/s
```

---

## Common trap

The processor is 32-bit, but external data bus is 16-bit.

For bus transfer rate, use:

```text
16-bit external data bus
```

not:

```text
32-bit processor size
```

---

# 30. Point-to-Point Interconnect

## What it means

Point-to-point interconnect uses direct links between pairs of components.

Bus:

```text
CPU ===== Memory ===== I/O
       shared path
```

Point-to-point:

```text
CPU -------- Memory
CPU -------- I/O Hub
CPU -------- CPU/Core
```

---

## Why we need it

A shared bus can become a bottleneck.

Point-to-point interconnect gives:

```text
Less contention
Higher bandwidth
More direct paths
Better scalability
```

---

## Key features

```text
1. Multiple direct connections
2. Layered protocol architecture
3. Packetized data transfer
```

---

# 31. QPI: QuickPath Interconnect

## What it means

QPI stands for QuickPath Interconnect.

It is a point-to-point interconnect used for high-speed system communication.

---

## QPI layers

QPI has four layers:

```text
1. Physical layer
2. Link layer
3. Routing layer
4. Protocol layer
```

---

## 31.1 Physical layer

Deals with actual wires, circuits, and signals.

Important unit:

```text
Phit = physical unit
```

In QPI:

```text
1 Phit = 20 bits
```

---

## 31.2 Link layer

Responsible for reliable transmission and flow control.

Important unit:

```text
Flit = flow control unit
```

In QPI:

```text
1 Flit = 80 bits
```

A flit has:

```text
72-bit payload
8-bit CRC
```

---

## 31.3 Routing layer

Determines path of packets through the interconnect.

Example:

```text
Core A → Core B → Core D
```

---

## 31.4 Protocol layer

Defines high-level packet rules.

Also handles cache coherency.

Cache coherency means:

```text
Keeping cached copies of memory data consistent.
```

---

# 32. QPI Bandwidth Calculation

Given:

```text
QPI speed = 6.4 GT/s
Width = 20 bits per transfer
```

---

## Step 1: Multiply transfers by bits

```text
6.4 billion transfers/s × 20 bits/transfer
= 128 billion bits/s
= 128 Gb/s
```

---

## Step 2: Convert bits to bytes

```text
128 Gb/s ÷ 8 = 16 GB/s
```

So one direction:

```text
16 GB/s
```

---

## Step 3: Bidirectional total

QPI can transfer both directions:

```text
A → B = 16 GB/s
B → A = 16 GB/s
```

Total:

```text
32 GB/s
```

---

# 33. PCI Express, PCIe

## What it means

PCIe stands for Peripheral Component Interconnect Express.

It is a high-speed point-to-point interconnect mainly used for I/O devices.

Examples:

```text
Graphics card
Network card
SSD controller
Disk controller
USB controller
```

---

## Why PCIe is needed

Older PCI was bus-based.

Modern devices need higher data rate.

PCIe gives:

```text
Point-to-point links
Higher capacity
Packet-based transfer
Layered architecture
```

---

# 34. PCIe Main Components

## 34.1 Root complex

Connects CPU/memory subsystem to PCIe fabric.

```text
CPU + Memory
     |
Root Complex
     |
PCIe devices
```

---

## 34.2 Switch

Connects one PCIe link to multiple PCIe devices.

```text
Root Complex
     |
   Switch
  /  |   \
SSD GPU Network
```

---

## 34.3 Endpoint

An endpoint is an actual PCIe device.

Examples:

```text
Graphics card
Network card
SSD controller
```

---

# 35. PCIe Layers

PCIe has three layers:

```text
1. Physical layer
2. Data link layer
3. Transaction layer
```

---

## 35.1 Physical layer

Deals with actual signal transmission.

PCIe links use lanes.

Examples:

```text
PCIe x1  = 1 lane
PCIe x4  = 4 lanes
PCIe x8  = 8 lanes
PCIe x16 = 16 lanes
```

---

## 35.2 Transaction layer

Creates and consumes TLPs.

```text
TLP = Transaction Layer Packet
```

TLP format:

```text
+----------+----------+----------+
| Header   | Data     | ECRC     |
+----------+----------+----------+
```

Data field can be up to:

```text
4096 bytes
```

---

## 35.3 Data link layer

Ensures reliable delivery across a PCIe link.

Uses:

```text
DLLP = Data Link Layer Packet
```

Important DLLPs:

```text
Flow control packets
Power management packets
ACK packets
NAK packets
```

---

# 36. PCIe ACK and NAK

## ACK

```text
ACK = packet received correctly
```

## NAK

```text
NAK = error detected, retransmit needed
```

---

## Example

Sender sends packet.

```text
Sender → Receiver: TLP #10
```

If correct:

```text
Receiver → Sender: ACK
Sender discards saved copy
```

If error:

```text
Receiver → Sender: NAK
Sender retransmits packet
```

---

# 37. QPI vs PCIe

| Feature         | QPI                           | PCIe                            |
| --------------- | ----------------------------- | ------------------------------- |
| Main use        | Processor/system interconnect | I/O device interconnect         |
| Style           | Point-to-point                | Point-to-point                  |
| Uses packets    | Yes                           | Yes                             |
| Layers          | 4 layers                      | 3 layers                        |
| Important units | Phit, Flit, Packet            | TLP, DLLP                       |
| Example         | Core to core, core to I/O hub | Root complex to GPU/network/SSD |

---

# 38. Tutorial 3 Summary Answers

## Q1. General categories of computer instruction function

```text
1. Processor-memory
2. Processor-I/O
3. Data processing
4. Control
```

---

## Q2. Possible states of instruction execution

Simple states:

```text
Fetch cycle
Execute cycle
Interrupt cycle
```

Detailed states:

```text
iac, if, iod, oac, of, do, os
```

---

## Q3. Two approaches to multiple interrupts

```text
1. Disabled interrupts
2. Defined priorities
```

---

## Q4. Benefit of multiple-bus architecture

```text
It reduces contention and traffic on the system bus by separating
processor-memory traffic from slower I/O traffic.
```

---

## Q5. Synchronous vs asynchronous bus

```text
Synchronous bus:
Uses a clock.

Asynchronous bus:
Uses handshaking, not one central clock.
```

Advantage of asynchronous bus:

```text
It supports devices with different speeds more flexibly.
```

---

## Q6. Bus transfer rate

Given:

```text
Clock = 16 MHz
Bus cycle = 4 clock cycles
External data bus = 16 bits = 2 bytes
```

Calculation:

```text
Bus cycles/s = 16,000,000 / 4
             = 4,000,000

Transfer rate = 4,000,000 × 2
              = 8,000,000 bytes/s
              = 8 MB/s
```

---

# 39. Common Mistakes in Chapter 3

## Mistake 1: Confusing address and data

```text
Address = where
Data = what
```

---

## Mistake 2: Thinking PC stores instruction

Correct:

```text
PC stores address of next instruction.
IR stores fetched instruction.
```

---

## Mistake 3: Thinking LOAD 940 means load value 940

Correct:

```text
LOAD 940 means load content stored at address 940.
```

---

## Mistake 4: Thinking interrupts are always errors

Correct:

```text
Interrupts can be normal events, such as keyboard input or disk completion.
```

---

## Mistake 5: Thinking disabled interrupts disappear

Correct:

```text
Disabled interrupts usually remain pending.
```

---

## Mistake 6: Confusing bus types

```text
Data bus    = actual data
Address bus = address/location
Control bus = command/timing signals
```

---

## Mistake 7: Using processor size instead of bus width

For bus transfer rate, use external data bus width.

Example:

```text
32-bit processor with 16-bit external data bus
→ use 16 bits
```

---

## Mistake 8: Thinking PCI and PCIe are the same

Correct:

```text
PCI = older bus-based scheme
PCIe = newer point-to-point scheme
```

---

# 40. Final Viva Questions

## Q1. What is von Neumann architecture?

A computer design where data and instructions are stored in one read-write memory, memory is addressed by location, and execution normally proceeds sequentially.

---

## Q2. What is the function of PC?

PC stores the address of the next instruction to fetch.

---

## Q3. What is the function of IR?

IR stores the instruction that has been fetched.

---

## Q4. What is the difference between MAR and MBR?

```text
MAR = memory address
MBR = memory data
```

---

## Q5. What are the two basic steps of instruction processing?

```text
Fetch
Execute
```

---

## Q6. What are the detailed instruction cycle states?

```text
iac, if, iod, oac, of, do, os
```

---

## Q7. What is an interrupt?

An interrupt is a signal that temporarily suspends normal CPU execution so another event can be handled.

---

## Q8. Why are interrupts useful?

They allow the CPU to do useful work while slow I/O devices are busy.

---

## Q9. What are the four interrupt classes?

```text
Program
Timer
I/O
Hardware failure
```

---

## Q10. What are the two approaches to multiple interrupts?

```text
Disabled interrupts
Defined priorities
```

---

## Q11. What is DMA?

DMA allows an I/O module to transfer data directly with memory without CPU moving every data item.

---

## Q12. What is a bus?

A bus is a shared communication pathway connecting two or more devices.

---

## Q13. Why can only one device transmit on a bus at a time?

Because simultaneous signals overlap and become garbled.

---

## Q14. What are the three bus groups?

```text
Data bus
Address bus
Control bus
```

---

## Q15. What is the difference between synchronous and asynchronous bus?

```text
Synchronous bus uses a clock.
Asynchronous bus uses handshaking.
```

---

## Q16. What is point-to-point interconnect?

A communication structure where each link directly connects two components.

---

## Q17. What is QPI?

QPI is Intel QuickPath Interconnect, a high-speed point-to-point interconnect.

---

## Q18. What are QPI layers?

```text
Physical
Link
Routing
Protocol
```

---

## Q19. What is PCIe?

PCIe is Peripheral Component Interconnect Express, a high-speed point-to-point interconnect for I/O devices.

---

## Q20. What are PCIe layers?

```text
Physical
Data link
Transaction
```

---

# 41. Final Mini Test

## Question 1

Given:

```text
PC = 400
Memory[400] = 1500
```

After fetch, what are PC and IR?

Answer:

```text
IR = 1500
PC = 401
```

Assuming one instruction per memory word.

---

## Question 2

Given:

```text
Memory[500] = 8
Memory[600] = 4
```

Program:

```assembly
LOAD 500
ADD 600
STORE 600
```

Final Memory[600]?

Answer:

```text
LOAD 500  → AC = 8
ADD 600   → AC = 8 + 4 = 12
STORE 600 → Memory[600] = 12
```

Final:

```text
Memory[600] = 12
```

---

## Question 3

A data bus is 32 bits wide. How many bytes can it transfer per bus cycle?

Answer:

```text
32 bits / 8 = 4 bytes
```

---

## Question 4

An address bus has 10 lines. How many locations can be addressed?

Answer:

```text
2^10 = 1024 locations
```

---

## Question 5

Clock = 20 MHz
Bus cycle = 5 clock cycles
Data bus = 32 bits

Find transfer rate.

Answer:

```text
Bus cycles/s = 20,000,000 / 5
             = 4,000,000

32 bits = 4 bytes

Transfer rate = 4,000,000 × 4
              = 16,000,000 bytes/s
              = 16 MB/s
```

---

# 42. Chapter 3 One-Page Memory Map

```text
Chapter 3
│
├── Computer components
│   ├── CPU
│   ├── Memory
│   └── I/O
│
├── Von Neumann architecture
│   ├── Data + instructions in same memory
│   ├── Addressable by location
│   └── Sequential execution
│
├── Instruction cycle
│   ├── Fetch
│   ├── Execute
│   └── Interrupt
│
├── Registers
│   ├── PC
│   ├── IR
│   ├── MAR
│   ├── MBR
│   ├── I/OAR
│   └── I/OBR
│
├── Interrupts
│   ├── Program
│   ├── Timer
│   ├── I/O
│   └── Hardware failure
│
├── Multiple interrupts
│   ├── Disabled interrupts
│   └── Priority interrupts
│
├── I/O function
│   ├── Processor-memory
│   ├── Processor-I/O
│   └── DMA
│
├── Bus interconnection
│   ├── Data bus
│   ├── Address bus
│   ├── Control bus
│   ├── Synchronous bus
│   └── Asynchronous bus
│
└── Point-to-point interconnect
    ├── QPI
    └── PCIe
```

---

# End of Chapter 3 Revision Notes
