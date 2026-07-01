# Chapter 9 Pipelining: 50 Extreme-Hard Questions

## Question 1

**Question:** What does pipelining primarily improve?

**Choices:**
- **A.** Single-instruction semantics
- **B.** Program instruction count
- **C.** Instruction throughput
- **D.** Memory capacity

**Correct Answer:** Instruction throughput

**Explanation:** Overlapping stages completes more instructions per unit time.

---

## Question 2

**Question:** Why can pipeline latency exceed unpipelined latency?

**Choices:**
- **A.** Throughput equals latency
- **B.** Pipelining deletes stages
- **C.** Branches remove clocks
- **D.** Every stage adds latch overhead

**Correct Answer:** Every stage adds latch overhead

**Explanation:** Partitioning adds register delay even when logic work is unchanged.

---

## Question 3

**Question:** What are the six stages in order?

**Choices:**
- **A.** FI, DI, CO, FO, EI, WO
- **B.** DI, FI, EI, CO, WO, FO
- **C.** FI, FO, DI, WO, CO, EI
- **D.** CO, FI, WO, DI, FO, EI

**Correct Answer:** FI, DI, CO, FO, EI, WO

**Explanation:** The stages fetch/decode, calculate/fetch operands, execute, then write.

---

## Question 4

**Question:** What differs between CO and FO?

**Choices:**
- **A.** They are identical
- **B.** CO computes an operand address; FO retrieves the operand
- **C.** CO fetches instructions; FO branches
- **D.** CO writes data; FO decodes

**Correct Answer:** CO computes an operand address; FO retrieves the operand

**Explanation:** Address generation precedes the actual operand access.

---

## Question 5

**Question:** Two stages need one memory port simultaneously. What hazard?

**Choices:**
- **A.** Control hazard
- **B.** RAW hazard
- **C.** Structural hazard
- **D.** WAW hazard

**Correct Answer:** Structural hazard

**Explanation:** A hardware resource cannot serve both requests at once.

---

## Question 6

**Question:** I1 writes R1 and I2 reads R1. What hazard?

**Choices:**
- **A.** Control
- **B.** WAR
- **C.** WAW
- **D.** RAW

**Correct Answer:** RAW

**Explanation:** I2 requires the new value produced by I1.

---

## Question 7

**Question:** I1 reads R1 and later I2 writes R1 too early. What hazard?

**Choices:**
- **A.** WAR
- **B.** RAW
- **C.** WAW
- **D.** Structural

**Correct Answer:** WAR

**Explanation:** The early write could destroy the old value before I1 reads it.

---

## Question 8

**Question:** I1 and I2 both write R1 and complete out of order. What hazard?

**Choices:**
- **A.** RAW
- **B.** WAW
- **C.** WAR
- **D.** Control

**Correct Answer:** WAW

**Explanation:** Final state must reflect program write order.

---

## Question 9

**Question:** Which mechanism resolves many RAW hazards without waiting for register writeback?

**Choices:**
- **A.** Increasing instruction count
- **B.** Disabling the ALU
- **C.** Forwarding
- **D.** Flushing every instruction

**Correct Answer:** Forwarding

**Explanation:** The producer result is routed directly to the consumer input.

---

## Question 10

**Question:** What does a pipeline bubble represent?

**Choices:**
- **A.** A second pipeline
- **B.** A completed instruction
- **C.** A branch target cache
- **D.** An idle slot inserted to delay progress

**Correct Answer:** An idle slot inserted to delay progress

**Explanation:** Stalling holds dependent work while an empty slot moves forward.

---

## Question 11

**Question:** Why can compiler reordering hide latency?

**Choices:**
- **A.** Independent instructions fill cycles between producer and consumer
- **B.** It guarantees no interrupts
- **C.** It removes registers
- **D.** It changes arithmetic results

**Correct Answer:** Independent instructions fill cycles between producer and consumer

**Explanation:** Useful unrelated work replaces stall cycles while preserving dependencies.

---

## Question 12

**Question:** What creates a control hazard?

**Choices:**
- **A.** Two instructions read one register
- **B.** The next PC is uncertain after a branch
- **C.** One cache has two ports
- **D.** A load hits cache

**Correct Answer:** The next PC is uncertain after a branch

**Explanation:** Fetch cannot know the correct path until branch direction and target resolve.

---

## Question 13

**Question:** What does a pipeline flush do?

**Choices:**
- **A.** Doubles stage speed
- **B.** Writes all cache lines
- **C.** Discards wrong-path instructions
- **D.** Corrects Hamming bits

**Correct Answer:** Discards wrong-path instructions

**Explanation:** Speculatively fetched work must not update architectural state.

---

## Question 14

**Question:** What is branch penalty?

**Choices:**
- **A.** The number of branch opcodes
- **B.** Cache capacity
- **C.** Instruction length
- **D.** Lost cycles caused by resolving or mispredicting a branch

**Correct Answer:** Lost cycles caused by resolving or mispredicting a branch

**Explanation:** A branch can stall fetch or force wrong-path work to be discarded.

---

## Question 15

**Question:** Why is predict-always-taken imperfect for loops?

**Choices:**
- **A.** It usually misses the loop exit
- **B.** It changes the condition
- **C.** It cannot predict backward branches
- **D.** It misses every iteration

**Correct Answer:** It usually misses the loop exit

**Explanation:** Repeated taken iterations end with one not-taken outcome.

---

## Question 16

**Question:** What does a branch history table store?

**Choices:**
- **A.** Only return addresses
- **B.** Recent branch behavior indexed by branch identity
- **C.** All program data
- **D.** Cache dirty bits

**Correct Answer:** Recent branch behavior indexed by branch identity

**Explanation:** Dynamic prediction uses past outcomes to forecast future direction.

---

## Question 17

**Question:** What is a delayed branch?

**Choices:**
- **A.** A cache miss
- **B.** A branch that never executes
- **C.** An instruction after the branch executes before transfer takes effect
- **D.** A branch resolved by DMA

**Correct Answer:** An instruction after the branch executes before transfer takes effect

**Explanation:** The ISA exposes a delay slot that software tries to fill usefully.

---

## Question 18

**Question:** What makes a delay-slot instruction safe?

**Choices:**
- **A.** It accesses an invalid address
- **B.** It must overwrite the branch condition
- **C.** It always causes an exception
- **D.** Its correctness is independent of branch direction

**Correct Answer:** Its correctness is independent of branch direction

**Explanation:** The slot executes regardless of whether control transfers.

---

## Question 19

**Question:** What does a loop buffer exploit?

**Choices:**
- **A.** Repeated execution of a short instruction sequence
- **B.** Random data writes
- **C.** Disk striping
- **D.** Multiple address buses

**Correct Answer:** Repeated execution of a short instruction sequence

**Explanation:** Keeping loop instructions nearby avoids repeated fetches.

---

## Question 20

**Question:** Why can multiple instruction streams reduce branch stalls?

**Choices:**
- **A.** They eliminate branch conditions
- **B.** The processor can fetch both paths but spends more hardware
- **C.** They use no cache
- **D.** They serialize execution

**Correct Answer:** The processor can fetch both paths but spends more hardware

**Explanation:** Both alternatives are available when the outcome arrives, at substantial resource cost.

---

## Question 21

**Question:** What is the BIUs main pipeline role?

**Choices:**
- **A.** Perform every ALU operation
- **B.** Choose source-language types
- **C.** Fetch instruction bytes and handle bus traffic
- **D.** Store only flags

**Correct Answer:** Fetch instruction bytes and handle bus traffic

**Explanation:** The bus interface unit supplies prefetched bytes to the execution unit.

---

## Question 22

**Question:** Why is the 80486 pipeline harder than a textbook fixed-instruction pipeline?

**Choices:**
- **A.** It cannot fetch memory
- **B.** It has no decode stage
- **C.** It uses only one opcode
- **D.** x86 instructions have variable length and complexity

**Correct Answer:** x86 instructions have variable length and complexity

**Explanation:** Boundary detection and multi-step execution complicate regular stage flow.

---

## Question 23

**Question:** A five-stage pipeline has 2 ns stages. What is single-instruction latency?

**Choices:**
- **A.** 10 ns
- **B.** 2 ns
- **C.** 5 ns
- **D.** 7 ns

**Correct Answer:** 10 ns

**Explanation:** One instruction traverses all five stages.

---

## Question 24

**Question:** Unpipelined logic is 10 ns and latch cost is 0.5 ns. What is a 4-stage cycle time?

**Choices:**
- **A.** 4.5 ns
- **B.** 3 ns
- **C.** 2.5 ns
- **D.** 10.5 ns

**Correct Answer:** 3 ns

**Explanation:** 10/4 + 0.5 = 3 ns.

---

## Question 25

**Question:** For that 4-stage design, what is pipeline latency?

**Choices:**
- **A.** 3 ns
- **B.** 10 ns
- **C.** 12 ns
- **D.** 40 ns

**Correct Answer:** 12 ns

**Explanation:** Four stages at 3 ns each give 12 ns.

---

## Question 26

**Question:** An ideal 2-stage pipeline executes 7 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 7 cycles and speedup 2
- **B.** 14 cycles and speedup 1
- **C.** 9 cycles and speedup 1.56
- **D.** 8 cycles and speedup 1.75

**Correct Answer:** 8 cycles and speedup 1.75

**Explanation:** Pipelined time is k+n−1 = 8; unpipelined time is kn = 14.

---

## Question 27

**Question:** An ideal 3-stage pipeline executes 8 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 10 cycles and speedup 2.4
- **B.** 8 cycles and speedup 3
- **C.** 11 cycles and speedup 2.18
- **D.** 24 cycles and speedup 1

**Correct Answer:** 10 cycles and speedup 2.4

**Explanation:** Pipelined time is k+n−1 = 10; unpipelined time is kn = 24.

---

## Question 28

**Question:** An ideal 4-stage pipeline executes 9 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 9 cycles and speedup 4
- **B.** 12 cycles and speedup 3
- **C.** 36 cycles and speedup 1
- **D.** 13 cycles and speedup 2.77

**Correct Answer:** 12 cycles and speedup 3

**Explanation:** Pipelined time is k+n−1 = 12; unpipelined time is kn = 36.

---

## Question 29

**Question:** An ideal 5-stage pipeline executes 10 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 10 cycles and speedup 5
- **B.** 50 cycles and speedup 1
- **C.** 14 cycles and speedup 3.57
- **D.** 15 cycles and speedup 3.33

**Correct Answer:** 14 cycles and speedup 3.57

**Explanation:** Pipelined time is k+n−1 = 14; unpipelined time is kn = 50.

---

## Question 30

**Question:** An ideal 6-stage pipeline executes 11 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 17 cycles and speedup 3.88
- **B.** 11 cycles and speedup 6
- **C.** 66 cycles and speedup 1
- **D.** 16 cycles and speedup 4.12

**Correct Answer:** 16 cycles and speedup 4.12

**Explanation:** Pipelined time is k+n−1 = 16; unpipelined time is kn = 66.

---

## Question 31

**Question:** An ideal 7-stage pipeline executes 12 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 18 cycles and speedup 4.67
- **B.** 84 cycles and speedup 1
- **C.** 12 cycles and speedup 7
- **D.** 19 cycles and speedup 4.42

**Correct Answer:** 18 cycles and speedup 4.67

**Explanation:** Pipelined time is k+n−1 = 18; unpipelined time is kn = 84.

---

## Question 32

**Question:** An ideal 8-stage pipeline executes 13 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 13 cycles and speedup 8
- **B.** 20 cycles and speedup 5.2
- **C.** 104 cycles and speedup 1
- **D.** 21 cycles and speedup 4.95

**Correct Answer:** 20 cycles and speedup 5.2

**Explanation:** Pipelined time is k+n−1 = 20; unpipelined time is kn = 104.

---

## Question 33

**Question:** An ideal 3-stage pipeline executes 20 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 20 cycles and speedup 3
- **B.** 60 cycles and speedup 1
- **C.** 22 cycles and speedup 2.73
- **D.** 23 cycles and speedup 2.61

**Correct Answer:** 22 cycles and speedup 2.73

**Explanation:** Pipelined time is k+n−1 = 22; unpipelined time is kn = 60.

---

## Question 34

**Question:** An ideal 4-stage pipeline executes 25 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 29 cycles and speedup 3.45
- **B.** 25 cycles and speedup 4
- **C.** 100 cycles and speedup 1
- **D.** 28 cycles and speedup 3.57

**Correct Answer:** 28 cycles and speedup 3.57

**Explanation:** Pipelined time is k+n−1 = 28; unpipelined time is kn = 100.

---

## Question 35

**Question:** An ideal 5-stage pipeline executes 30 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 34 cycles and speedup 4.41
- **B.** 35 cycles and speedup 4.29
- **C.** 150 cycles and speedup 1
- **D.** 30 cycles and speedup 5

**Correct Answer:** 34 cycles and speedup 4.41

**Explanation:** Pipelined time is k+n−1 = 34; unpipelined time is kn = 150.

---

## Question 36

**Question:** An ideal 6-stage pipeline executes 40 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 46 cycles and speedup 5.22
- **B.** 45 cycles and speedup 5.33
- **C.** 240 cycles and speedup 1
- **D.** 40 cycles and speedup 6

**Correct Answer:** 45 cycles and speedup 5.33

**Explanation:** Pipelined time is k+n−1 = 45; unpipelined time is kn = 240.

---

## Question 37

**Question:** An ideal 7-stage pipeline executes 50 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 350 cycles and speedup 1
- **B.** 50 cycles and speedup 7
- **C.** 56 cycles and speedup 6.25
- **D.** 57 cycles and speedup 6.14

**Correct Answer:** 56 cycles and speedup 6.25

**Explanation:** Pipelined time is k+n−1 = 56; unpipelined time is kn = 350.

---

## Question 38

**Question:** An ideal 8-stage pipeline executes 60 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 68 cycles and speedup 7.06
- **B.** 60 cycles and speedup 8
- **C.** 480 cycles and speedup 1
- **D.** 67 cycles and speedup 7.16

**Correct Answer:** 67 cycles and speedup 7.16

**Explanation:** Pipelined time is k+n−1 = 67; unpipelined time is kn = 480.

---

## Question 39

**Question:** An ideal 9-stage pipeline executes 70 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 78 cycles and speedup 8.08
- **B.** 79 cycles and speedup 7.97
- **C.** 630 cycles and speedup 1
- **D.** 70 cycles and speedup 9

**Correct Answer:** 78 cycles and speedup 8.08

**Explanation:** Pipelined time is k+n−1 = 78; unpipelined time is kn = 630.

---

## Question 40

**Question:** An ideal 10-stage pipeline executes 80 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 80 cycles and speedup 10
- **B.** 89 cycles and speedup 8.99
- **C.** 800 cycles and speedup 1
- **D.** 90 cycles and speedup 8.89

**Correct Answer:** 89 cycles and speedup 8.99

**Explanation:** Pipelined time is k+n−1 = 89; unpipelined time is kn = 800.

---

## Question 41

**Question:** An ideal 4-stage pipeline executes 100 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 104 cycles and speedup 3.85
- **B.** 100 cycles and speedup 4
- **C.** 103 cycles and speedup 3.88
- **D.** 400 cycles and speedup 1

**Correct Answer:** 103 cycles and speedup 3.88

**Explanation:** Pipelined time is k+n−1 = 103; unpipelined time is kn = 400.

---

## Question 42

**Question:** An ideal 5-stage pipeline executes 120 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 600 cycles and speedup 1
- **B.** 120 cycles and speedup 5
- **C.** 125 cycles and speedup 4.8
- **D.** 124 cycles and speedup 4.84

**Correct Answer:** 124 cycles and speedup 4.84

**Explanation:** Pipelined time is k+n−1 = 124; unpipelined time is kn = 600.

---

## Question 43

**Question:** An ideal 6-stage pipeline executes 150 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 155 cycles and speedup 5.81
- **B.** 150 cycles and speedup 6
- **C.** 900 cycles and speedup 1
- **D.** 156 cycles and speedup 5.77

**Correct Answer:** 155 cycles and speedup 5.81

**Explanation:** Pipelined time is k+n−1 = 155; unpipelined time is kn = 900.

---

## Question 44

**Question:** An ideal 7-stage pipeline executes 180 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 180 cycles and speedup 7
- **B.** 186 cycles and speedup 6.77
- **C.** 1260 cycles and speedup 1
- **D.** 187 cycles and speedup 6.74

**Correct Answer:** 186 cycles and speedup 6.77

**Explanation:** Pipelined time is k+n−1 = 186; unpipelined time is kn = 1260.

---

## Question 45

**Question:** An ideal 8-stage pipeline executes 200 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 1600 cycles and speedup 1
- **B.** 200 cycles and speedup 8
- **C.** 207 cycles and speedup 7.73
- **D.** 208 cycles and speedup 7.69

**Correct Answer:** 207 cycles and speedup 7.73

**Explanation:** Pipelined time is k+n−1 = 207; unpipelined time is kn = 1600.

---

## Question 46

**Question:** An ideal 9-stage pipeline executes 250 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 250 cycles and speedup 9
- **B.** 2250 cycles and speedup 1
- **C.** 259 cycles and speedup 8.69
- **D.** 258 cycles and speedup 8.72

**Correct Answer:** 258 cycles and speedup 8.72

**Explanation:** Pipelined time is k+n−1 = 258; unpipelined time is kn = 2250.

---

## Question 47

**Question:** An ideal 10-stage pipeline executes 300 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 309 cycles and speedup 9.71
- **B.** 300 cycles and speedup 10
- **C.** 310 cycles and speedup 9.68
- **D.** 3000 cycles and speedup 1

**Correct Answer:** 309 cycles and speedup 9.71

**Explanation:** Pipelined time is k+n−1 = 309; unpipelined time is kn = 3000.

---

## Question 48

**Question:** An ideal 12-stage pipeline executes 400 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 400 cycles and speedup 12
- **B.** 411 cycles and speedup 11.68
- **C.** 412 cycles and speedup 11.65
- **D.** 4800 cycles and speedup 1

**Correct Answer:** 411 cycles and speedup 11.68

**Explanation:** Pipelined time is k+n−1 = 411; unpipelined time is kn = 4800.

---

## Question 49

**Question:** An ideal 16-stage pipeline executes 500 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 500 cycles and speedup 16
- **B.** 8000 cycles and speedup 1
- **C.** 515 cycles and speedup 15.53
- **D.** 516 cycles and speedup 15.5

**Correct Answer:** 515 cycles and speedup 15.53

**Explanation:** Pipelined time is k+n−1 = 515; unpipelined time is kn = 8000.

---

## Question 50

**Question:** An ideal 20-stage pipeline executes 600 instructions. What are pipelined time and speedup over unpipelined execution?

**Choices:**
- **A.** 620 cycles and speedup 19.35
- **B.** 600 cycles and speedup 20
- **C.** 12000 cycles and speedup 1
- **D.** 619 cycles and speedup 19.39

**Correct Answer:** 619 cycles and speedup 19.39

**Explanation:** Pipelined time is k+n−1 = 619; unpipelined time is kn = 12000.
