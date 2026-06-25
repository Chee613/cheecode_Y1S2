# Chapter 1: Introduction to Computer System

# 1. What is a Computer System?

A **computer system** is a machine that accepts data, processes data, stores data, moves data, and controls all operations.

Simple view:

```text
Input → Processing → Output
           ↓
        Storage
```

Example:

```text
You type: 5 + 3
Computer processes: 5 + 3 = 8
Computer displays: 8
```

A computer system is not only the CPU. It includes:

```text
CPU
Memory
Input devices
Output devices
Storage
Interconnection system
```

---

# 2. Computer Architecture vs Computer Organization

Tutorial 1 gives these examples:

```text
Computer Architecture:
- Instruction set
- I/O mechanism

Computer Organization:
- Control signals
- Memory technology
```



---

## 2.1 Computer Architecture

**Computer architecture** means the features of a computer that are visible to the programmer.

It answers:

```text
What can the computer do?
What instructions can it execute?
What features can the programmer use?
```

Examples:

```text
Instruction set
Number of registers
Data types
I/O mechanism
Addressing modes
```

Example instruction:

```asm
ADD R1, R2, R3
```

This means:

```text
R1 = R2 + R3
```

The fact that the CPU supports `ADD` is part of **architecture**.

---

## 2.2 Computer Organization

**Computer organization** means how the hardware is internally built to support the architecture.

It answers:

```text
How is the computer implemented?
How are signals sent?
What memory technology is used?
How are CPU parts connected?
```

Examples:

```text
Control signals
Memory technology
ALU design
Bus structure
Cache design
```

---

## 2.3 Easy Difference

```text
Architecture = what the programmer sees
Organization = how the hardware works inside
```

Car analogy:

```text
Architecture:
- Steering wheel
- Brake pedal
- Gear system

Organization:
- Engine design
- Brake mechanism
- Wiring
```

Computer analogy:

```text
Architecture:
- ADD instruction exists

Organization:
- ALU performs addition
- Control unit sends signals
- Registers hold values
```

---

## Common Mistakes

Wrong:

```text
Instruction set is organization.
```

Correct:

```text
Instruction set is architecture.
```

Wrong:

```text
Control signal is architecture.
```

Correct:

```text
Control signal is organization.
```

---

## Viva Questions

**Q1. Give two examples of computer architecture.**
Answer: Instruction set and I/O mechanism.

**Q2. Give two examples of computer organization.**
Answer: Control signals and memory technology.

**Q3. Is instruction set architecture or organization?**
Answer: Architecture.

**Q4. Is memory technology architecture or organization?**
Answer: Organization.

---

# 3. Structure vs Function

Tutorial 1 says:

```text
Structure:
The way components are interrelated.

Function:
The operation of each component as part of the structure.
```



---

## 3.1 Structure

**Structure** means how the parts of a system are connected.

It asks:

```text
What are the components?
How are they connected?
```

Example:

```text
CPU is connected to memory.
CPU is connected to I/O modules.
Memory and I/O communicate through buses.
```

Simple diagram:

```text
        CPU
         |
 ┌───────┼───────┐
Memory   Bus     I/O
```

---

## 3.2 Function

**Function** means what each part does.

It asks:

```text
What is the job of this component?
What operation does it perform?
```

Examples:

```text
CPU processes data.
Memory stores data.
I/O moves data.
Control unit controls operations.
```

---

## 3.3 Easy Difference

```text
Structure = how parts are connected
Function  = what parts do
```

Example:

```text
CPU connected to memory = structure
CPU processes data = function
```

---

## Common Mistakes

Wrong:

```text
ALU connected to registers is function.
```

Correct:

```text
ALU connected to registers is structure.
```

Wrong:

```text
ALU performs addition is structure.
```

Correct:

```text
ALU performs addition is function.
```

---

## Viva Questions

**Q1. What is structure?**
Answer: The way components are interrelated.

**Q2. What is function?**
Answer: The operation of each component.

**Q3. Is “CPU connected to memory” structure or function?**
Answer: Structure.

**Q4. Is “ALU performs arithmetic” structure or function?**
Answer: Function.

---

# 4. Four Functions of a Computer

Tutorial 1 lists the 4 functions of a computer as:

```text
1. Data Processing
2. Data Storage
3. Data Movement
4. Control
```



---

## 4.1 Data Processing

**Data processing** means changing data into useful information.

Example:

```text
Input: 5 and 3
Process: 5 + 3
Output: 8
```

Assembly-style example:

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2
```

If:

```text
A = 5
B = 3
```

Then:

```text
R3 = 8
```

The CPU, especially the **ALU**, performs data processing.

---

## 4.2 Data Storage

**Data storage** means keeping data and instructions.

Examples:

```text
Registers
Cache
RAM
SSD
Hard disk
USB drive
```

Temporary storage:

```text
Registers
Cache
RAM
```

Permanent or long-term storage:

```text
SSD
Hard disk
USB drive
```

Example:

```text
RAM stores a running program.
SSD stores saved files.
Registers store temporary CPU values.
```

---

## 4.3 Data Movement

**Data movement** means transferring data from one place to another.

Examples:

```text
Keyboard → Computer
Computer → Monitor
Memory → CPU
CPU → Memory
Computer → Printer
Computer → Network
```

Example instruction:

```asm
LOAD R1, A
```

Meaning:

```text
Move data from memory location A into register R1.
```

Another example:

```asm
STORE C, R3
```

Meaning:

```text
Move data from register R3 into memory location C.
```

---

## 4.4 Control

**Control** means coordinating all computer operations.

It decides:

```text
What happens first?
What happens next?
Which component should work?
When should data move?
When should data be processed?
```

The **Control Unit** performs this job inside the CPU.

Simple diagram:

```text
              Control Unit
                   |
     ┌─────────────┼─────────────┐
     |             |             |
    ALU        Registers       Memory/I/O
```

---

## 4.5 Example Using All Four Functions

Task:

```text
User types: 2 + 3
Computer displays: 5
```

Steps:

```text
1. Keyboard sends input.
   → Data Movement

2. Computer stores input temporarily.
   → Data Storage

3. CPU calculates 2 + 3.
   → Data Processing

4. Monitor displays 5.
   → Data Movement

5. Control unit manages the whole sequence.
   → Control
```

---

## Exam Memory Box

```text
Processing = calculate / transform data
Storage    = keep data and instructions
Movement   = transfer data
Control    = manage all operations
```

---

# 5. Computer Structure

A computer has four main structural components:

```text
1. CPU / Processor
2. Main Memory
3. Input/Output Modules
4. Interconnection System
```

Simple structure:

```text
                 ┌─────────┐
                 │   CPU   │
                 └────┬────┘
                      │
        ┌─────────────┼─────────────┐
        │             │             │
   Main Memory       I/O      Interconnection
```

---

## 5.1 CPU / Processor

The **CPU** executes instructions and processes data.

It performs tasks like:

```text
Fetch instruction
Decode instruction
Execute instruction
Process data
Control operations
```

Example:

```asm
LOAD R1, A
ADD  R1, B
STORE C, R1
```

The CPU executes these instructions one by one.

---

## 5.2 Main Memory

**Main memory** stores data and instructions currently being used.

Usually, main memory means **RAM**.

Example memory layout:

```text
Address 100 → instruction
Address 101 → instruction
Address 200 → data A
Address 201 → data B
```

Important idea:

```text
Memory locations have addresses.
CPU uses addresses to read/write data.
```

---

## 5.3 Input/Output Modules

**I/O modules** connect the computer to external devices.

Examples:

```text
Keyboard
Mouse
Monitor
Printer
USB drive
Network card
Disk controller
```

Input example:

```text
Keyboard → I/O module → CPU
```

Output example:

```text
CPU → I/O module → Monitor
```

---

## 5.4 Interconnection System

The **interconnection system** connects CPU, memory, and I/O.

It is like a road for data.

```text
CPU ─── Bus ─── Memory
CPU ─── Bus ─── I/O
```

Without interconnection, the parts cannot communicate.

---

## Exam Memory Box

```text
CPU = executes instructions
Memory = stores data and instructions
I/O = connects to external devices
Interconnection = connects CPU, memory, and I/O
```

---

# 6. CPU Structure

Tutorial 1 says the main CPU structures are:

```text
1. Control Unit
2. Arithmetic and Logic Unit, ALU
3. Registers
4. CPU interconnection
```



Simple diagram:

```text
┌───────────────────────────────┐
│              CPU              │
│                               │
│   ┌───────────────────────┐   │
│   │     Control Unit      │   │
│   └───────────┬───────────┘   │
│               │               │
│   ┌───────────▼───────────┐   │
│   │         ALU           │   │
│   └───────────┬───────────┘   │
│               │               │
│   ┌───────────▼───────────┐   │
│   │       Registers       │   │
│   └───────────────────────┘   │
│                               │
│      CPU Interconnection      │
└───────────────────────────────┘
```

---

## 6.1 Control Unit

The **Control Unit** controls the operation of the CPU and the computer.

It tells other parts what to do.

Example:

```asm
ADD R1, R2, R3
```

The Control Unit tells:

```text
R2: send value
R3: send value
ALU: perform addition
R1: receive result
```

Important:

```text
Control Unit controls.
ALU calculates.
```

---

## 6.2 ALU

**ALU** stands for:

```text
Arithmetic and Logic Unit
```

It performs:

```text
Arithmetic operations:
- Addition
- Subtraction
- Multiplication
- Division

Logic operations:
- AND
- OR
- NOT
- Comparison
```

Example:

```text
R2 = 5
R3 = 3
ADD R1, R2, R3
```

Result:

```text
R1 = 8
```

Diagram:

```text
R2 = 5 ───┐
          ├── ALU ADD ───> R1 = 8
R3 = 3 ───┘
```

---

## 6.3 Registers

**Registers** are small, fast storage locations inside the CPU.

They temporarily hold:

```text
Data
Instructions
Addresses
Intermediate results
```

Example:

```asm
LOAD R1, A
LOAD R2, B
ADD  R3, R1, R2
STORE C, R3
```

Meaning:

```text
R1 stores A temporarily.
R2 stores B temporarily.
R3 stores result temporarily.
```

Registers are faster than RAM but much smaller.

---

## 6.4 CPU Interconnection

**CPU interconnection** provides communication between:

```text
Control Unit
ALU
Registers
```

It allows data and control signals to move inside the CPU.

Example:

```asm
ADD R3, R1, R2
```

Data movement:

```text
R1 ───┐
      ├──> ALU ───> R3
R2 ───┘
```

---

## Exam Memory Box

```text
Control Unit = controls CPU operation
ALU = performs arithmetic and logic
Registers = temporary internal CPU storage
CPU interconnection = communication path inside CPU
```

---

# 7. Brief History of Computers

Chapter 1 includes the history of:

```text
Vacuum tubes
Transistors
Integrated Circuits
LSI
```



Timeline:

```text
Vacuum Tubes
     ↓
Transistors
     ↓
Integrated Circuits
     ↓
Large Scale Integration, LSI
```

---

## 7.1 Vacuum Tubes

Vacuum tubes were early electronic switches.

They represent:

```text
ON  = 1
OFF = 0
```

Tutorial 1 asks what switches were used in EDVAC. The answer is:

```text
Vacuum tubes
```



Disadvantages:

```text
Large
Hot
Used much power
Less reliable
```

---

## 7.2 Transistors

Transistors replaced vacuum tubes.

They are also electronic switches, but they are:

```text
Smaller
Faster
More reliable
Use less power
Produce less heat
```

Simple comparison:

```text
Vacuum tube = big old switch
Transistor  = small modern switch
```

---

## 7.3 Integrated Circuits, IC

An **Integrated Circuit**, or **IC**, puts many components into one chip.

Before IC:

```text
Separate components connected manually
```

With IC:

```text
Many components integrated into one chip
```

Tutorial 1 asks what two elements are used in integrated circuits for processing and storage.

Answer:

```text
Gates are used for data processing.
Memory cells are used for data storage.
```



---

## 7.4 Gates

A **gate** is a logic circuit used for processing.

Examples:

```text
AND gate
OR gate
NOT gate
```

Example AND gate:

```text
A B | Output
0 0 |   0
0 1 |   0
1 0 |   0
1 1 |   1
```

---

## 7.5 Memory Cells

A **memory cell** stores data.

Simple idea:

```text
1 memory cell stores 1 bit.
A bit can be 0 or 1.
```

Many memory cells form memory.

---

## 7.6 Large Scale Integration, LSI

**LSI** means:

```text
Large Scale Integration
```

It means placing many more components into one chip.

Simple comparison:

```text
IC  = many components on one chip
LSI = very many components on one chip
```

Benefits:

```text
Smaller computers
Faster computers
Cheaper production
More powerful processors
Larger memory chips
```

---

# 8. IBM 7094 and Data Channels

Tutorial 1 asks:

```text
What is the main difference of IBM 7094 with the IAS computer?
```

Answer:

```text
IBM 7094 uses data channels.
```



A **data channel** helps transfer data, especially between I/O devices and memory.

Simple idea:

```text
Without data channel:
CPU handles more I/O transfer work.

With data channel:
Data channel helps with I/O transfer.
CPU can focus more on processing.
```

Diagram:

```text
I/O Device ───> Data Channel ───> Memory
                     │
                    CPU
```

---

# 9. Ferromagnetic Material Memory

Tutorial 1 asks:

```text
What is the main disadvantage of ferromagnetic material memory?
```

Answer:

```text
Bulky, expensive, and self-destructive readout.
```



Meaning:

```text
Bulky = physically large
Expensive = high cost
Self-destructive readout = reading may destroy or disturb stored data
```

Simple analogy:

```text
Normal reading:
You read a note. The note remains.

Self-destructive readout:
You read a note. The note gets erased or disturbed.
```

---

# 10. Tutorial 1 Final Answer Sheet

## Q1. Give two examples for Computer Architecture and Computer Organization.

```text
Computer Architecture:
1. Instruction set
2. I/O mechanism

Computer Organization:
1. Control signals
2. Memory technology
```

---

## Q2. Give the meaning of structure and function.

```text
Structure:
The way components are interrelated.

Function:
The operation of each component as part of the structure.
```

---

## Q3. State the 4 functions of computer.

```text
1. Data Processing
2. Data Storage
3. Data Movement
4. Control
```

---

## Q4. What is the function of data processing in computer?

```text
Data processing processes data in storage or from the external environment.
```

---

## Q5. Which type of process involves all 4 functions of computer?

```text
Control function.
```

---

## Q6. What is the main structure of the CPU? Explain the function of the structures.

```text
1. Control Unit
   Controls the operation of the CPU and hence the computer.

2. Arithmetic and Logic Unit, ALU
   Performs the computer’s data processing functions.

3. Registers
   Provide storage to the CPU internally.

4. CPU interconnection
   Provides communication between the control unit, ALU, and registers.
```

---

## Q7. What switches were used in the EDVAC?

```text
Vacuum tubes.
```

---

## Q8. What is the main difference of IBM 7094 with the IAS computer?

```text
IBM 7094 uses data channels.
```

---

## Q9. What are the two elements used in integrated circuits for processing and storage?

```text
Gates are used in data processing.
Memory cells are used for data storage.
```

---

## Q10. What is the main disadvantage of ferromagnetic material memory?

```text
Bulky, expensive, and self-destructive readout.
```

---

# 11. Chapter 1 Super Short Revision

```text
Architecture = what programmer sees
Organization = how hardware is implemented

Structure = how components are connected
Function = what components do

4 computer functions:
1. Data Processing
2. Data Storage
3. Data Movement
4. Control

Computer structure:
1. CPU
2. Memory
3. I/O
4. Interconnection

CPU structure:
1. Control Unit
2. ALU
3. Registers
4. CPU interconnection

History:
Vacuum tubes → Transistors → Integrated Circuits → LSI

EDVAC:
Vacuum tubes

IBM 7094:
Data channels

IC:
Gates for processing
Memory cells for storage

Ferromagnetic memory:
Bulky, expensive, self-destructive readout
```

---

# 12. Final Mini Checkpoint

Try answering these quickly.

## Question 1

Instruction set is architecture or organization?

**Answer:** Architecture.

## Question 2

Control signal is architecture or organization?

**Answer:** Organization.

## Question 3

CPU connected to memory is structure or function?

**Answer:** Structure.

## Question 4

ALU performs addition is structure or function?

**Answer:** Function.

## Question 5

Name the 4 functions of a computer.

**Answer:** Data processing, data storage, data movement, control.

## Question 6

Name the 4 main CPU structures.

**Answer:** Control Unit, ALU, registers, CPU interconnection.

## Question 7

What did EDVAC use as switches?

**Answer:** Vacuum tubes.

## Question 8

What is LSI?

**Answer:** Large Scale Integration.

---

# Chapter 1 Completed

You have finished **Chapter 1: Introduction to Computer System**.

