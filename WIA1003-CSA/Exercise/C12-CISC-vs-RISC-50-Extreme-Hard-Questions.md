# Chapter 12 CISC vs RISC: 50 Extreme-Hard Questions

## Question 1

**Question:** What historically motivated CISC?

**Choices:**
- **A.** No need for compatibility
- **B.** Dense programs and simpler compilers when memory was expensive
- **C.** Perfect pipelines
- **D.** Unlimited transistor budgets

**Correct Answer:** Dense programs and simpler compilers when memory was expensive

**Explanation:** Rich instructions reduced code bytes and compiler burden.

---

## Question 2

**Question:** What historically motivated RISC?

**Choices:**
- **A.** Memory-to-memory operations were always fastest
- **B.** Registers were too expensive to use
- **C.** Frequent simple operations could pipeline efficiently
- **D.** Variable length simplifies fetch

**Correct Answer:** Frequent simple operations could pipeline efficiently

**Explanation:** Simple regular instructions favor fast decode and overlap.

---

## Question 3

**Question:** Which style commonly permits memory-to-memory arithmetic?

**Choices:**
- **A.** SIMD only
- **B.** DMA
- **C.** Pure load/store RISC
- **D.** CISC

**Correct Answer:** CISC

**Explanation:** Complex instructions may directly name memory operands.

---

## Question 4

**Question:** What does load/store architecture require?

**Choices:**
- **A.** Arithmetic uses registers; explicit loads/stores access memory
- **B.** Instructions have no operands
- **C.** Every ALU instruction accesses memory
- **D.** Registers are forbidden

**Correct Answer:** Arithmetic uses registers; explicit loads/stores access memory

**Explanation:** Separating memory operations regularizes the datapath.

---

## Question 5

**Question:** Why do fixed instruction lengths help pipelines?

**Choices:**
- **A.** They eliminate branches
- **B.** Fetch boundaries and decoding are predictable
- **C.** They guarantee fewer instructions
- **D.** They make all programs smaller

**Correct Answer:** Fetch boundaries and decoding are predictable

**Explanation:** Regular alignment simplifies front-end control.

---

## Question 6

**Question:** Why can variable-length CISC improve code density?

**Choices:**
- **A.** No operands are encoded
- **B.** Every instruction is longer
- **C.** Common operations use short encodings while complex ones use longer forms
- **D.** All constants occupy registers

**Correct Answer:** Common operations use short encodings while complex ones use longer forms

**Explanation:** Encoding space is spent according to instruction needs.

---

## Question 7

**Question:** Why does RISC usually provide many registers?

**Choices:**
- **A.** To remove compilers
- **B.** To increase disk capacity
- **C.** To implement block erase
- **D.** To keep operands out of memory

**Correct Answer:** To keep operands out of memory

**Explanation:** Register reuse reduces slow load/store traffic.

---

## Question 8

**Question:** What is compiler-based register allocation?

**Choices:**
- **A.** Software maps active values to a limited register set
- **B.** Hardware creates infinite registers
- **C.** The OS stores every value on disk
- **D.** A cache policy

**Correct Answer:** Software maps active values to a limited register set

**Explanation:** The compiler chooses which values remain in registers and when to spill.

---

## Question 9

**Question:** What do register windows optimize?

**Choices:**
- **A.** Disk seeks
- **B.** Procedure calls by overlapping caller and callee register sets
- **C.** Branch prediction only
- **D.** GPU transfers

**Correct Answer:** Procedure calls by overlapping caller and callee register sets

**Explanation:** Overlapping windows pass values with fewer memory saves/restores.

---

## Question 10

**Question:** What is CISC-to-RISC translation?

**Choices:**
- **A.** A RISC compiler emits only CISC bytes
- **B.** Clock rate becomes code size
- **C.** Complex instructions decode into simpler internal micro-operations
- **D.** Registers become memory

**Correct Answer:** Complex instructions decode into simpler internal micro-operations

**Explanation:** Modern CISC front ends can feed a RISC-like execution core.

---

## Question 11

**Question:** What is RISC-to-CISC evolution?

**Choices:**
- **A.** RISC removes every instruction
- **B.** Code becomes hardware wiring
- **C.** A CISC chip loses compatibility
- **D.** A RISC ISA gains richer instructions and features over time

**Correct Answer:** A RISC ISA gains richer instructions and features over time

**Explanation:** Practical demands blur the original minimalism.

---

## Question 12

**Question:** Why is the CISC/RISC boundary now vague?

**Choices:**
- **A.** Implementations borrow techniques from both philosophies
- **B.** All ISAs are identical
- **C.** Instruction sets no longer exist
- **D.** Both acronyms mean the same words

**Correct Answer:** Implementations borrow techniques from both philosophies

**Explanation:** External encoding and internal execution style need not match.

---

## Question 13

**Question:** Why can CISC be unattractive in a tiny embedded design?

**Choices:**
- **A.** It requires a GPU
- **B.** Complex decode consumes area and power that may not be justified
- **C.** It has no compact instructions
- **D.** CISC cannot execute code

**Correct Answer:** Complex decode consumes area and power that may not be justified

**Explanation:** Embedded systems often value predictable simplicity and efficiency.

---

## Question 14

**Question:** What does MIPS/W measure?

**Choices:**
- **A.** Clock cycles per watt only
- **B.** Code bytes per register
- **C.** Instruction throughput per unit power
- **D.** Memory size per instruction

**Correct Answer:** Instruction throughput per unit power

**Explanation:** It is an energy-efficiency rate, not raw performance alone.

---

## Question 15

**Question:** Why can a lower-MIPS processor still finish a task sooner?

**Choices:**
- **A.** Power fixes instruction count
- **B.** MIPS equals execution time
- **C.** RISC always needs one instruction
- **D.** It may need fewer instructions for that workload

**Correct Answer:** It may need fewer instructions for that workload

**Explanation:** MIPS comparisons ignore ISA and compiler instruction-count differences.

---

## Question 16

**Question:** A CISC multiply updates a memory operand directly. What advantage is shown?

**Choices:**
- **A.** Fewer explicit instructions and compact code
- **B.** No decode complexity
- **C.** No memory traffic
- **D.** Guaranteed one-cycle execution

**Correct Answer:** Fewer explicit instructions and compact code

**Explanation:** One complex operation replaces loads, arithmetic, and store instructions.

---

## Question 17

**Question:** What disadvantage can that memory-to-memory multiply have?

**Choices:**
- **A.** It uses no operands
- **B.** Variable multi-step execution complicates pipelines
- **C.** It cannot multiply
- **D.** It always consumes less power

**Correct Answer:** Variable multi-step execution complicates pipelines

**Explanation:** Complex memory behavior makes timing and decode less regular.

---

## Question 18

**Question:** A RISC sequence uses LOAD, LOAD, MUL, STORE. What advantage is shown?

**Choices:**
- **A.** One instruction total
- **B.** Smaller code in every case
- **C.** Simple stages and explicit data movement
- **D.** No registers

**Correct Answer:** Simple stages and explicit data movement

**Explanation:** Regular operations map cleanly onto a pipeline.

---

## Question 19

**Question:** What disadvantage does the RISC sequence show?

**Choices:**
- **A.** Impossible compilation
- **B.** No parallelism
- **C.** No memory access
- **D.** More instructions and potentially larger code

**Correct Answer:** More instructions and potentially larger code

**Explanation:** Decomposing one semantic operation increases instruction count.

---

## Question 20

**Question:** Why did transistor abundance weaken the original CISC rationale?

**Choices:**
- **A.** Memory and compiler constraints changed while on-chip decode became affordable
- **B.** Power ceased to matter
- **C.** Instructions stopped using bits
- **D.** Registers became impossible

**Correct Answer:** Memory and compiler constraints changed while on-chip decode became affordable

**Explanation:** Technology shifted which costs dominated design.

---

## Question 21

**Question:** Which design usually has more addressing modes?

**Choices:**
- **A.** RISC
- **B.** CISC
- **C.** Both must have exactly one
- **D.** Neither uses addresses

**Correct Answer:** CISC

**Explanation:** Complex ISAs commonly encode many ways to locate operands.

---

## Question 22

**Question:** Why does fewer addressing modes help a RISC pipeline?

**Choices:**
- **A.** It guarantees cache hits
- **B.** It doubles memory capacity
- **C.** Effective-address behavior is more regular
- **D.** It eliminates data hazards

**Correct Answer:** Effective-address behavior is more regular

**Explanation:** Uniform operand access simplifies decode and execution timing.

---

## Question 23

**Question:** A 32-bit fixed-length ISA has PC = 1000. What is the sequential next PC?

**Choices:**
- **A.** 1002
- **B.** 1001
- **C.** 1032
- **D.** 1004

**Correct Answer:** 1004

**Explanation:** A 32-bit instruction occupies four byte addresses.

---

## Question 24

**Question:** Variable-length instructions of 3 and 6 bytes begin at PC 1000. After both execute sequentially, what is PC?

**Choices:**
- **A.** 1009
- **B.** 1006
- **C.** 1008
- **D.** 1012

**Correct Answer:** 1009

**Explanation:** The PC advances by 3 + 6 = 9 bytes.

---

## Question 25

**Question:** What is the best modern classification rule?

**Choices:**
- **A.** Classify solely by company name
- **B.** Treat CISC/RISC as design tendencies, not a strict binary
- **C.** Any fixed length is CISC
- **D.** Any microcode is RISC

**Correct Answer:** Treat CISC/RISC as design tendencies, not a strict binary

**Explanation:** Contemporary ISAs and microarchitectures mix features.

---

## Question 26

**Question:** A processor delivers 100 MIPS while consuming 5 W. What is its efficiency?

**Choices:**
- **A.** 500 MIPS/W
- **B.** 0.05 MIPS/W
- **C.** 20 MIPS/W
- **D.** 100 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 27

**Question:** A processor delivers 120 MIPS while consuming 6 W. What is its efficiency?

**Choices:**
- **A.** 120 MIPS/W
- **B.** 720 MIPS/W
- **C.** 0.05 MIPS/W
- **D.** 20 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 28

**Question:** A processor delivers 150 MIPS while consuming 10 W. What is its efficiency?

**Choices:**
- **A.** 15 MIPS/W
- **B.** 1500 MIPS/W
- **C.** 0.0667 MIPS/W
- **D.** 150 MIPS/W

**Correct Answer:** 15 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 15.

---

## Question 29

**Question:** A processor delivers 200 MIPS while consuming 8 W. What is its efficiency?

**Choices:**
- **A.** 1600 MIPS/W
- **B.** 25 MIPS/W
- **C.** 0.04 MIPS/W
- **D.** 200 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 30

**Question:** A processor delivers 250 MIPS while consuming 10 W. What is its efficiency?

**Choices:**
- **A.** 0.04 MIPS/W
- **B.** 2500 MIPS/W
- **C.** 25 MIPS/W
- **D.** 250 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 31

**Question:** A processor delivers 300 MIPS while consuming 12 W. What is its efficiency?

**Choices:**
- **A.** 3600 MIPS/W
- **B.** 300 MIPS/W
- **C.** 0.04 MIPS/W
- **D.** 25 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 32

**Question:** A processor delivers 360 MIPS while consuming 15 W. What is its efficiency?

**Choices:**
- **A.** 24 MIPS/W
- **B.** 5400 MIPS/W
- **C.** 0.0417 MIPS/W
- **D.** 360 MIPS/W

**Correct Answer:** 24 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 24.

---

## Question 33

**Question:** A processor delivers 400 MIPS while consuming 20 W. What is its efficiency?

**Choices:**
- **A.** 8000 MIPS/W
- **B.** 20 MIPS/W
- **C.** 0.05 MIPS/W
- **D.** 400 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 34

**Question:** A processor delivers 450 MIPS while consuming 18 W. What is its efficiency?

**Choices:**
- **A.** 0.04 MIPS/W
- **B.** 450 MIPS/W
- **C.** 25 MIPS/W
- **D.** 8100 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 35

**Question:** A processor delivers 500 MIPS while consuming 25 W. What is its efficiency?

**Choices:**
- **A.** 0.05 MIPS/W
- **B.** 500 MIPS/W
- **C.** 12500 MIPS/W
- **D.** 20 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 36

**Question:** A processor delivers 600 MIPS while consuming 24 W. What is its efficiency?

**Choices:**
- **A.** 25 MIPS/W
- **B.** 14400 MIPS/W
- **C.** 0.04 MIPS/W
- **D.** 600 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 37

**Question:** A processor delivers 720 MIPS while consuming 30 W. What is its efficiency?

**Choices:**
- **A.** 0.0417 MIPS/W
- **B.** 24 MIPS/W
- **C.** 720 MIPS/W
- **D.** 21600 MIPS/W

**Correct Answer:** 24 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 24.

---

## Question 38

**Question:** A processor delivers 800 MIPS while consuming 40 W. What is its efficiency?

**Choices:**
- **A.** 0.05 MIPS/W
- **B.** 32000 MIPS/W
- **C.** 20 MIPS/W
- **D.** 800 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 39

**Question:** A processor delivers 900 MIPS while consuming 36 W. What is its efficiency?

**Choices:**
- **A.** 0.04 MIPS/W
- **B.** 900 MIPS/W
- **C.** 32400 MIPS/W
- **D.** 25 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 40

**Question:** A processor delivers 1000 MIPS while consuming 50 W. What is its efficiency?

**Choices:**
- **A.** 20 MIPS/W
- **B.** 50000 MIPS/W
- **C.** 0.05 MIPS/W
- **D.** 1000 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 41

**Question:** A processor delivers 1100 MIPS while consuming 44 W. What is its efficiency?

**Choices:**
- **A.** 1100 MIPS/W
- **B.** 25 MIPS/W
- **C.** 0.04 MIPS/W
- **D.** 48400 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 42

**Question:** A processor delivers 1200 MIPS while consuming 60 W. What is its efficiency?

**Choices:**
- **A.** 1200 MIPS/W
- **B.** 72000 MIPS/W
- **C.** 20 MIPS/W
- **D.** 0.05 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 43

**Question:** A processor delivers 1400 MIPS while consuming 56 W. What is its efficiency?

**Choices:**
- **A.** 1400 MIPS/W
- **B.** 78400 MIPS/W
- **C.** 0.04 MIPS/W
- **D.** 25 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 44

**Question:** A processor delivers 1500 MIPS while consuming 75 W. What is its efficiency?

**Choices:**
- **A.** 20 MIPS/W
- **B.** 112500 MIPS/W
- **C.** 0.05 MIPS/W
- **D.** 1500 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 45

**Question:** A processor delivers 1600 MIPS while consuming 64 W. What is its efficiency?

**Choices:**
- **A.** 102400 MIPS/W
- **B.** 25 MIPS/W
- **C.** 0.04 MIPS/W
- **D.** 1600 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 46

**Question:** A processor delivers 1800 MIPS while consuming 90 W. What is its efficiency?

**Choices:**
- **A.** 1800 MIPS/W
- **B.** 162000 MIPS/W
- **C.** 20 MIPS/W
- **D.** 0.05 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 47

**Question:** A processor delivers 2000 MIPS while consuming 80 W. What is its efficiency?

**Choices:**
- **A.** 0.04 MIPS/W
- **B.** 160000 MIPS/W
- **C.** 2000 MIPS/W
- **D.** 25 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.

---

## Question 48

**Question:** A processor delivers 2400 MIPS while consuming 120 W. What is its efficiency?

**Choices:**
- **A.** 20 MIPS/W
- **B.** 288000 MIPS/W
- **C.** 0.05 MIPS/W
- **D.** 2400 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 49

**Question:** A processor delivers 3000 MIPS while consuming 150 W. What is its efficiency?

**Choices:**
- **A.** 450000 MIPS/W
- **B.** 20 MIPS/W
- **C.** 0.05 MIPS/W
- **D.** 3000 MIPS/W

**Correct Answer:** 20 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 20.

---

## Question 50

**Question:** A processor delivers 3600 MIPS while consuming 144 W. What is its efficiency?

**Choices:**
- **A.** 0.04 MIPS/W
- **B.** 518400 MIPS/W
- **C.** 25 MIPS/W
- **D.** 3600 MIPS/W

**Correct Answer:** 25 MIPS/W

**Explanation:** MIPS/W = MIPS ÷ watts = 25.
