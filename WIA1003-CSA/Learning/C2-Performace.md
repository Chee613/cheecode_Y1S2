# Chapter 2 :Performance Concept

# 1. Big idea of Chapter 2

Computer performance means:

> How fast and efficiently a computer completes work.

In Chapter 2, we do not only ask:

```text
Is the CPU clock speed high?
```

We ask:

```text
How long does the whole program take?
What affects the execution time?
Can the processor, memory, bus, and I/O keep up with each other?
```

Your lecture notes explain that computer cost keeps dropping while performance and capacity keep increasing, and modern applications such as image processing, 3D rendering, speech recognition, video conferencing, multimedia authoring, and simulation modeling require powerful computer systems. 

---

# 2. Designing for performance

## Meaning

Designing for performance means designing the computer so that it can complete tasks faster.

Important components:

```text
CPU
Memory
Cache
Bus / interconnection
I/O devices
Software
Compiler
```

## Why it matters

A fast CPU alone is not enough.

Example:

```text
Fast CPU + slow memory = CPU waits
Fast CPU + slow bus    = data transfer bottleneck
Fast CPU + slow I/O    = program delay
```

So performance depends on the whole system, not only the processor.

---

# 3. Microprocessor speed techniques

Your notes say modern processors use techniques such as pipelining, branch prediction, superscalar execution, data flow analysis, and speculative execution to keep the processor busy and improve performance. 

## 3.1 Pipelining

### Meaning

Pipelining splits instruction execution into stages.

Example stages:

```text
Fetch → Decode → Execute → Write back
```

Without pipelining:

```text
I1: F D E W
I2:         F D E W
I3:                 F D E W
```

With pipelining:

```text
Time: 1  2  3  4  5  6
I1:   F  D  E  W
I2:      F  D  E  W
I3:         F  D  E  W
```

### Why we need it

It increases **throughput**, meaning more instructions finish per unit time.

### Common mistake

Pipelining does not usually make one single instruction much faster. It makes the CPU complete many instructions more efficiently.

---

## 3.2 Branch prediction

### Meaning

Branch prediction means the CPU guesses the next path after a branch instruction.

Example:

```assembly
CMP R1, 0
JE  LABEL
```

The CPU guesses whether the jump will happen.

### Why we need it

If the CPU waits for every branch decision, the pipeline becomes empty and performance drops.

### Common mistake

Wrong prediction does not produce wrong final result. The CPU discards wrongly fetched/executed instructions.

---

## 3.3 Superscalar execution

### Meaning

Superscalar execution means the CPU can issue more than one instruction per clock cycle.

Example:

```assembly
ADD R1, R2, R3
SUB R4, R5, R6
```

If independent, both can run in parallel.

### Common mistake

Superscalar is not the same as multicore.

```text
Superscalar = multiple execution units inside one core
Multicore   = multiple cores on one chip
```

---

## 3.4 Data flow analysis

### Meaning

The CPU checks which instructions depend on previous results.

Example:

```assembly
1. LOAD R1, A
2. ADD  R2, R1, B
3. MUL  R5, R6, R7
```

Instruction 2 depends on Instruction 1.
Instruction 3 is independent and may execute while waiting.

---

## 3.5 Speculative execution

### Meaning

The CPU executes likely future instructions before it is fully sure they are needed.

```text
Predict path → execute early → keep result only if prediction is correct
```

### Common mistake

Branch prediction guesses. Speculative execution actually starts executing the guessed path.

---

# 4. Performance balance

## Meaning

Performance balance means adjusting computer organization so that CPU, memory, I/O, and interconnection structures work well together.

Your notes explain that designers must balance processor components, main memory, I/O devices, and interconnection structures because performance changes at different rates in different technologies. 

## Techniques used

Your notes list these examples:

```text
1. Retrieve more bits at one time using wider DRAM and wider buses.
2. Improve the DRAM interface using cache or buffering.
3. Reduce memory access frequency using cache.
4. Increase interconnection bandwidth using faster buses and bus hierarchy.
```

These are directly from the performance balance section. 

---

# 5. Improvements in chip organization and architecture

Your notes list three approaches to improving processor speed: increase hardware speed, increase cache size/speed, and change processor organization using parallelism. 

## 5.1 Increase hardware speed

Smaller logic gates allow:

```text
more gates packed together
shorter signal distance
higher clock rate
lower propagation time
```

## 5.2 Increase cache size and speed

Cache is small fast memory near the CPU.

```text
CPU → Cache → Main Memory
```

Cache helps because CPU can get frequently used data faster.

## 5.3 Change processor organization

Use parallelism:

```text
Pipelining
Superscalar
Multicore
Speculative execution
```

---

# 6. Clock speed limits

We cannot simply increase clock speed forever.

Problems:

```text
1. More power consumption
2. More heat
3. RC delay
4. Memory latency
5. Design complexity
```

Chapter 21 notes explain that designers used pipelining, superscalar, SMT, and high clock frequencies to maintain performance, but power requirements increased as chip density and clock frequency rose. 

---

# 7. Multicore, MIC, GPU, GPGPU

## 7.1 Multicore

A multicore processor has multiple cores on one chip.

```text
+-----------------------+
| Core 1 | Core 2       |
| Core 3 | Core 4       |
+-----------------------+
```

Multicore improves performance only when software can divide work into parallel parts.

## 7.2 MIC

MIC means **Many Integrated Core**.

Your notes say chip manufacturers moved toward more than 50 cores per chip, leading to the term many integrated core. 

## 7.3 GPU

GPU means **Graphics Processing Unit**.

A GPU is designed for many parallel operations, especially graphics and video.

## 7.4 GPGPU

GPGPU means **General-Purpose computing on GPU**.

Your notes explain that GPUs are increasingly used for repetitive computations, and when broad applications use GPU processing, the term GPGPU is used. 

---

# 8. Amdahl’s Law

## Meaning

Amdahl’s Law shows that speedup is limited by the part of the program that cannot be improved.

Formula:

```text
Speedup = 1 / [(1 - f) + (f / n)]
```

Where:

```text
f     = fraction that can be parallelized
1 - f = serial fraction
n     = number of processors / cores
```

## Example

```text
f = 0.8
n = 4
```

```text
Speedup = 1 / [(1 - 0.8) + (0.8 / 4)]
        = 1 / [0.2 + 0.2]
        = 1 / 0.4
        = 2.5
```

Even with 4 cores, speedup is only 2.5 because 20% is serial.

## Maximum speedup

If `n` becomes very large:

```text
Maximum speedup = 1 / (1 - f)
```

Example:

```text
If f = 0.9,
Maximum speedup = 1 / 0.1 = 10
```

---

# 9. Little’s Law

## Meaning

Little’s Law connects:

```text
Number of items in system
Throughput
Response time
```

Formula:

```text
N = X × R
```

Where:

```text
N = average number of items in system
X = throughput
R = response time
```

## Rearranged formulas

```text
X = N / R
R = N / X
```

## Example

```text
X = 200 requests/second
R = 0.1 second
```

```text
N = X × R
N = 200 × 0.1
N = 20 requests
```

---

# 10. Clock speed and clock cycle time

Your notes explain that CPU operations are governed by a system clock; clock rate is measured in cycles per second or Hertz, and one clock pulse is a clock cycle or clock tick. The time between pulses is cycle time. 

## Clock rate

```text
Clock rate = cycles per second
```

Example:

```text
1 GHz = 1,000,000,000 cycles/second
```

## Clock cycle time

```text
Clock cycle time = 1 / Clock rate
```

Example:

```text
Clock rate = 2 GHz
Clock cycle time = 1 / (2 × 10^9)
                 = 0.5 ns
```

---

# 11. CPI

## Meaning

CPI means **Cycles Per Instruction**.

```text
CPI = average number of clock cycles per instruction
```

## Formula

```text
CPI = Total clock cycles / Instruction count
```

## Effective CPI

```text
Effective CPI = Σ(CPIᵢ × Fᵢ)
```

Where:

```text
CPIᵢ = CPI of instruction type i
Fᵢ   = fraction of that instruction type
```

---

# 12. CPU execution time

Tutorial 2 includes these formulas: CPU time equals instruction count × CPI × clock cycle time, or instruction count × CPI divided by clock rate. It also lists CPU clock cycles as instruction count × CPI. 

## Main formulas

```text
CPU clock cycles = Instruction count × CPI
```

```text
CPU time = Instruction count × CPI × Clock cycle time
```

```text
CPU time = (Instruction count × CPI) / Clock rate
```

## Important idea

Performance depends on:

```text
Instruction count
CPI
Clock cycle time
```

So high GHz alone is not enough.

---

# 13. MIPS

## Meaning

MIPS means:

```text
Millions of Instructions Per Second
```

## Formula

```text
MIPS = Instruction count / (Execution time × 10^6)
```

Alternative formula:

```text
MIPS = Clock rate / (CPI × 10^6)
```

## Common warning

MIPS can be misleading because different instruction sets may require different numbers of instructions for the same task.

---

# 14. MFLOPS

## Meaning

MFLOPS means:

```text
Millions of Floating-Point Operations Per Second
```

## Formula

```text
MFLOPS = Floating-point operations / (Execution time × 10^6)
```

Used for:

```text
scientific computing
graphics
simulation
machine learning numerical work
```

---

# 15. Arithmetic mean, harmonic mean, geometric mean

## 15.1 Arithmetic mean

Used for normal values.

```text
Arithmetic mean = (x1 + x2 + ... + xn) / n
```

Example:

```text
(10 + 20 + 30) / 3 = 20
```

---

## 15.2 Harmonic mean

Used for rates such as speed, MIPS, and throughput.

```text
Harmonic mean = n / [(1/x1) + (1/x2) + ... + (1/xn)]
```

Example:

```text
Harmonic mean of 100 and 50

= 2 / [(1/100) + (1/50)]
= 2 / [0.01 + 0.02]
= 66.67
```

---

## 15.3 Geometric mean

Used for ratios and normalized benchmark results.

```text
Geometric mean = (x1 × x2 × ... × xn)^(1/n)
```

Example:

```text
Geometric mean of 2, 4, 8

= ³√(2 × 4 × 8)
= ³√64
= 4
```

SPEC uses geometric mean for normalized ratios and throughput ratios. 

---

# 16. Benchmarks and SPEC

## Benchmark

A benchmark is a standard test program used to compare computer performance.

## Benchmark suite

A benchmark suite is a collection of benchmark programs.

## SPEC

SPEC means:

```text
System Performance Evaluation Corporation
```

SPEC defines benchmark suites for evaluating computer systems.

## SPEC CPU2017

SPEC CPU2017 focuses on processor-intensive applications.

Your notes define key SPEC terms:

```text
Reference machine = baseline system
Base metric       = strict compilation guidelines
Peak metric       = optimized compiler output
Speed metric      = time to execute one compiled benchmark
Rate metric       = how many tasks are completed in a certain time
```

The notes also say rate metric measures throughput and allows simultaneous tasks to take advantage of multiple processors. 

## SPEC metric examples

```text
SPECspeed2017_int_base
SPECspeed2017_int_peak
SPECrate2017_int_base
SPECrate2017_int_peak
```

These use geometric means of normalized ratios or throughput ratios. 

---

# 17. Tutorial 2 key calculations

## Question 1

Given:

```text
Clock rate = 80 MHz
Instruction count = 100,000
```

| Instruction type   |  Count | CPI |
| ------------------ | -----: | --: |
| Integer Arithmetic | 45,000 |   1 |
| Data Transfer      | 32,000 |   2 |
| Floating Point     | 15,000 |   2 |
| Control Transfer   |  8,000 |   2 |

Total cycles:

```text
= 45,000×1 + 32,000×2 + 15,000×2 + 8,000×2
= 45,000 + 64,000 + 30,000 + 16,000
= 155,000 cycles
```

Effective CPI:

```text
Effective CPI = 155,000 / 100,000
              = 1.55
```

Execution time:

```text
CPU time = Total cycles / Clock rate
         = 155,000 / (80 × 10^6)
         = 0.0019375 s
         = 1.9375 ms
```

MIPS:

```text
MIPS = 100,000 / (0.0019375 × 10^6)
     ≈ 51.61
```

Tutorial 2 asks exactly for effective CPI, MIPS rate, and execution time using this instruction mix. 

---

## Question 2

Given:

```text
Clock rate = 100 MHz
Instruction count = 10,000,000
Execution time = 0.25 s
```

CPI:

```text
CPI = (CPU time × Clock rate) / Instruction count
    = (0.25 × 100 × 10^6) / 10,000,000
    = 2.5
```

MIPS:

```text
MIPS = Instruction count / (Execution time × 10^6)
     = 10,000,000 / (0.25 × 10^6)
     = 40
```

Superscalar?

```text
CPI = 2.5 > 1
```

So it is **not likely superscalar** based on this benchmark.

---

## Question 3

Given:

```text
Old clock = 50 MHz
New clock = 75 MHz
Old MIPS = p
```

Same architecture means CPI is assumed same.

```text
p' / p = 75 / 50 = 1.5
```

Answer:

```text
p' = 1.5p
```

If execution time only drops from 250s to 220s, possible reason:

```text
Memory, cache, bus, or I/O bottleneck prevents full improvement.
```

Tutorial 2 asks this exact clock-frequency replacement question. 

---

## Question 4

Computer A:

```text
Clock cycle time = 250 ps
CPI = 2.0
```

Computer B:

```text
Clock cycle time = 500 ps
CPI = 1.2
```

Compare:

```text
A = 2.0 × 250 ps = 500 ps/instruction
B = 1.2 × 500 ps = 600 ps/instruction
```

Answer:

```text
Computer A is faster.
```

Speedup:

```text
Speedup = 600 / 500 = 1.2
```

Computer A is **1.2 times faster**.

---

## Question 5

Instruction classes:

| Class | Cycles |
| ----- | -----: |
| A     |      1 |
| B     |      2 |
| C     |      3 |

First code:

```text
2 of A, 1 of B, 2 of C
```

```text
Total cycles = 2×1 + 1×2 + 2×3
             = 10 cycles
CPI = 10 / 5 = 2
```

Second code:

```text
4 of A, 1 of B, 1 of C
```

```text
Total cycles = 4×1 + 1×2 + 1×3
             = 9 cycles
CPI = 9 / 6 = 1.5
```

Answer:

```text
Second code is faster.
Speedup = 10 / 9 = 1.11 times
```

Tutorial 2 asks this exact compiler code comparison and asks for CPI of each code. 

---

# 18. Formula sheet

```text
Clock cycle time = 1 / Clock rate
```

```text
CPU clock cycles = Instruction count × CPI
```

```text
CPU time = Instruction count × CPI × Clock cycle time
```

```text
CPU time = (Instruction count × CPI) / Clock rate
```

```text
CPI = Total clock cycles / Instruction count
```

```text
Effective CPI = Σ(CPIᵢ × Fᵢ)
```

```text
MIPS = Instruction count / (Execution time × 10^6)
```

```text
MIPS = Clock rate / (CPI × 10^6)
```

```text
MFLOPS = Floating-point operations / (Execution time × 10^6)
```

```text
Amdahl’s Law:
Speedup = 1 / [(1 - f) + (f / n)]
```

```text
Maximum Amdahl speedup = 1 / (1 - f)
```

```text
Little’s Law:
N = X × R
```

```text
Arithmetic mean = (x1 + x2 + ... + xn) / n
```

```text
Harmonic mean = n / [(1/x1) + (1/x2) + ... + (1/xn)]
```

```text
Geometric mean = (x1 × x2 × ... × xn)^(1/n)
```

---

# 19. Common mistakes checklist

1. **Thinking GHz alone means faster CPU**
   Correct idea: use CPU time formula.

2. **Forgetting unit conversion**

   ```text
   MHz = 10^6 Hz
   GHz = 10^9 Hz
   ns = 10^-9 s
   ps = 10^-12 s
   ```

3. **Using instruction count only**
   Fewer instructions do not always mean faster program.

4. **Comparing CPI only**
   Need `CPI × clock cycle time`.

5. **Using arithmetic mean for rates or ratios**

   ```text
   Rates → harmonic mean
   Ratios → geometric mean
   ```

6. **Forgetting serial part in Amdahl’s Law**
   Serial part is `1 - f`.

7. **Mixing MIPS and MFLOPS**
   MIPS counts instructions. MFLOPS counts floating-point operations.

8. **Thinking 4 cores always gives 4× speedup**
   Only true if the program is fully parallel and has no overhead.

---

# 20. Viva / exam quick questions

**Q1. What is computer performance?**
How fast and efficiently a computer completes work.

**Q2. Why is clock speed alone not enough?**
Because CPU time also depends on instruction count and CPI.

**Q3. What is CPI?**
Average number of cycles needed per instruction.

**Q4. State CPU execution time formula.**
`CPU time = Instruction count × CPI × Clock cycle time`.

**Q5. What is MIPS?**
Millions of Instructions Per Second.

**Q6. What is MFLOPS?**
Millions of Floating-Point Operations Per Second.

**Q7. What does Amdahl’s Law show?**
Speedup is limited by the serial part of a program.

**Q8. What does Little’s Law show?**
Average number in system equals throughput multiplied by response time.

**Q9. What is performance balance?**
Balancing CPU, memory, I/O, and interconnection performance so one part does not bottleneck the system.

**Q10. What is SPEC?**
A benchmark organization that defines benchmark suites for comparing computer systems.

**Q11. Which mean is used for SPEC normalized ratios?**
Geometric mean.

**Q12. Which mean is suitable for rates like MIPS?**
Harmonic mean.

---

# 21. Chapter 2 final memory map

```text
Chapter 2: Performance Concepts
│
├── Why performance matters
│
├── CPU speed techniques
│   ├── Pipelining
│   ├── Branch prediction
│   ├── Superscalar execution
│   ├── Data flow analysis
│   └── Speculative execution
│
├── Performance balance
│   ├── CPU
│   ├── Memory
│   ├── Cache
│   ├── Bus
│   └── I/O
│
├── Chip improvements
│   ├── Smaller gates
│   ├── Faster cache
│   └── Parallelism
│
├── Parallel processing trend
│   ├── Multicore
│   ├── MIC
│   ├── GPU
│   └── GPGPU
│
├── Laws
│   ├── Amdahl’s Law
│   └── Little’s Law
│
├── Basic formulas
│   ├── Clock rate
│   ├── Clock cycle time
│   ├── CPI
│   ├── CPU time
│   ├── MIPS
│   └── MFLOPS
│
├── Means
│   ├── Arithmetic mean
│   ├── Harmonic mean
│   └── Geometric mean
│
└── Benchmarks
    ├── Benchmark principles
    ├── SPEC
    ├── Speed metric
    ├── Rate metric
    ├── Base metric
    └── Peak metric
```

Chapter 2 is now complete.
