# Chapter 11: Multicore Computers

# 1. Why Multicore Processors Exist

Earlier CPU designers tried to improve performance by making one processor core more powerful.

The main techniques were:

1. **Pipelining**
2. **Superscalar execution**
3. **Simultaneous multithreading, SMT**

Chapter 21 explains that these techniques increase instruction-level parallelism, but each has limits because more hardware complexity means more control logic, more interconnections, more design difficulty, and more power. 

## 1.1 Pipelining

Pipelining divides instruction execution into stages.

```text
Instruction 1: Fetch → Decode → Execute → Write
Instruction 2:         Fetch → Decode → Execute → Write
Instruction 3:                 Fetch → Decode → Execute → Write
```

**Meaning:** Many instructions are overlapped.

**Why needed:** It improves throughput.

**Limit:** Too many pipeline stages increase logic, control signals, and branch penalty.

---

## 1.2 Superscalar

Superscalar processors have multiple execution pipelines.

```text
Pipeline A → ADD instruction
Pipeline B → MUL instruction
Pipeline C → LOAD instruction
```

**Meaning:** One core may execute multiple independent instructions in the same clock cycle.

**Limit:** Instructions must be independent. Hazards and dependencies reduce the benefit.

---

## 1.3 SMT

SMT allows multiple hardware threads to share one core’s execution resources.

```text
One physical core
├── Thread 1 registers
├── Thread 2 registers
└── Shared pipelines
```

**Meaning:** If one thread stalls, another thread may use the pipeline.

**Limit:** Threads still share the same core hardware.

---

# 2. Power, Memory, and Pollack’s Rule

Chapter 21 explains that as chip density and clock frequency increased, power requirements also increased. One way to control power density is to use more chip area for cache memory because memory logic has lower power density than processor logic. 

## Pollack’s Rule

```text
Performance increase ≈ square root of complexity increase
```

Example:

```text
If core complexity doubles:
performance increase ≈ √2
                     ≈ 1.414
                     ≈ 40% improvement
```

So doubling core complexity does **not** double performance.

This is one reason designers moved toward:

```text
many simpler cores
instead of
one extremely complex core
```

---

# 3. Performance Effect of Multiple Cores

Multicore performance depends on whether the program can be divided into parallel parts. Chapter 21 states that a program may contain a serial fraction and a parallel fraction. Even 10% serial code can strongly limit speedup. 

## 3.1 Serial and Parallel Fractions

```text
f     = parallel fraction
1 - f = serial fraction
n     = number of cores/processors
```

## 3.2 Multicore Speedup Formula

```text
Speedup = 1 / [(1 - f) + f/n]
```

Only the parallel part is divided by `n`.

The serial part is not divided.

---

## 3.3 Example: f = 0.9, n = 8

```text
Speedup = 1 / [(1 - 0.9) + 0.9/8]
        = 1 / [0.1 + 0.1125]
        = 1 / 0.2125
        = 4.7059
```

Final:

```text
Speedup ≈ 4.7×
```

So:

```text
8 cores do not automatically give 8× speedup.
```

---

# 4. Effective Applications for Multicore

Chapter 21 lists four important application types that can benefit from multicore processors. 

## 4.1 Multithreaded Native Applications

One process has many threads.

```text
Application
├── Thread 1
├── Thread 2
├── Thread 3
└── Thread 4
```

Example:

```text
Video editor
├── decode video
├── process audio
├── apply filter
└── export frame
```

---

## 4.2 Multiprocess Applications

Many processes run at the same time.

```text
Core 1 → Process A
Core 2 → Process B
Core 3 → Process C
Core 4 → Process D
```

Example:

```text
Web server handling many users
```

---

## 4.3 Java Applications

Java supports threading strongly. The JVM is also a multithreaded process that provides scheduling and memory management for Java applications. 

```text
Java program
   ↓
JVM
   ↓
Operating system
   ↓
CPU cores
```

---

## 4.4 Multi-instance Applications

Multiple copies of the same application run in parallel.

```text
Core 1 → App instance 1
Core 2 → App instance 2
Core 3 → App instance 3
Core 4 → App instance 4
```

Virtualization can isolate each instance.

---

# 5. Threading Granularity

Threading granularity means:

```text
the smallest unit of work that can be usefully parallelized
```

Chapter 21 explains that finer granularity gives more flexibility, but more execution time may be spent on threading overhead. 

## 5.1 Coarse-Grained Threading

Large tasks.

```text
Core 1 → Sound engine
Core 2 → Physics engine
Core 3 → AI engine
Core 4 → Rendering engine
```

**Advantage:** Low overhead.
**Disadvantage:** Poor load balancing if one task is much larger.

---

## 5.2 Fine-Grained Threading

Small tasks.

```text
Task 1 → Core 1
Task 2 → Core 2
Task 3 → Core 3
Task 4 → Core 4
```

**Advantage:** Better flexibility and load balancing.
**Disadvantage:** More scheduling and synchronization overhead.

---

## 5.3 Hybrid Threading

Hybrid threading combines coarse and fine threading.

Chapter 21 uses Valve’s Source engine as an example. Valve found coarse threading could give up to 2× performance in artificial cases, but real gameplay improvement was around 1.2×. Fine-grain threading was difficult because work-unit times varied and dependency management was complex. Valve found hybrid threading more promising. 

Example:

```text
Sound mixing → coarse task on one processor

Rendering module
├── build scene list
├── compute bone transformations
├── draw objects
└── render reflections
```

---

# 6. Multicore Organization Alternatives

Chapter 21 shows four multicore cache organizations in Figure 21.6. 

## 6.1 Private L1 Only

```text
Core 1 → private L1
Core 2 → private L1
```

No shared on-chip cache.

---

## 6.2 Private L1 + Private L2

```text
Core 1 → L1 → private L2
Core 2 → L1 → private L2
```

Good when each core mostly uses its own data.

---

## 6.3 Private L1 + Shared L2

```text
Core 1 → L1 ┐
Core 2 → L1 ├── shared L2
Core 3 → L1 ┘
```

Useful when cores share data.

---

## 6.4 Private L1 + Private L2 + Shared L3

```text
Core 1 → L1 → L2 ┐
Core 2 → L1 → L2 ├── shared L3
Core 3 → L1 → L2 ┘
```

This is common in modern high-performance processors.

Example from note:

```text
Intel Core i7
```

---

## 6.5 Advantages of Shared Higher-Level Cache

Shared cache can:

1. Reduce miss rates through constructive interference
2. Avoid duplicating shared data
3. Dynamically allocate cache capacity to cores
4. Make inter-core communication easier
5. Reduce cache-coherence burden at higher cache levels

---

# 7. Superscalar Cores vs SMT Cores

A multicore chip can use:

```text
superscalar cores
or
SMT cores
```

Chapter 21 explains that Intel Core Duo uses superscalar cores, while Intel Core i7 uses SMT cores. A 4-core processor with 4 SMT threads per core can appear as 16 hardware-level threads to software. 

```text
4 cores × 4 SMT threads = 16 logical hardware threads
```

Important:

```text
16 logical threads ≠ 16 full physical cores
```

---

# 8. Heterogeneous Multicore

A homogeneous multicore processor has identical cores.

```text
CPU core + CPU core + CPU core
```

A heterogeneous multicore processor has more than one kind of core.

```text
CPU core + GPU core
CPU core + DSP core
A7 core + A15 core
```

Chapter 21 defines heterogeneous multicore as a processor chip that includes more than one kind of core. 

---

# 9. CPU + GPU Heterogeneous Multicore

GPUs support many parallel execution threads and are suitable for vector and matrix processing. Chapter 21 says GPUs are useful for graphics, scientific applications, and repetitive operations on structured data. 

## CPU vs GPU

| Feature  | CPU                  | GPU                             |
| -------- | -------------------- | ------------------------------- |
| Strength | General control      | Massive parallel work           |
| Cores    | Fewer, powerful      | Many, simpler                   |
| Good for | Branching, OS, logic | Matrix, vector, image, graphics |
| Example  | Run program control  | Process millions of pixels      |

---

## Table 21.1 GFLOPS Calculation

Formula:

```text
GFLOPS = clock frequency in GHz × cores × FLOPS per core
```

CPU:

```text
3.8 × 4 × 8 = 121.6 GFLOPS
```

GPU:

```text
0.8 × 384 × 2 = 614.4 GFLOPS
```

So the GPU has much higher theoretical floating-point performance, but only for suitable parallel workloads. 

---

# 10. CPU-GPU Data Transfer Problem

Old CPU-GPU systems often had separate physical memory.

```text
CPU memory → copy data → GPU memory
GPU processes data
GPU memory → copy result → CPU memory
```

This can cause performance penalty.

So GPU is useful only when:

```text
computation benefit > data transfer cost
```

---

# 11. Heterogeneous System Architecture, HSA

HSA tries to make CPU and GPU cooperate better. Chapter 21 lists these HSA features: shared virtual memory, virtual memory paging, coherent memory policy, and unified programming interface. 

## HSA Main Ideas

```text
CPU and GPU can see the same virtual memory space.
CPU and GPU caches see up-to-date data.
Programmers can use CPU serial power and GPU parallel power more easily.
```

Diagram:

```text
CPU serial work ┐
                ├── shared virtual memory
GPU parallel work ┘
```

---

# 12. CPU + DSP Heterogeneous Multicore

A DSP is a **Digital Signal Processor**.

DSPs are designed for signal-processing tasks such as:

```text
audio
video
sensor data
radio signals
communication signals
```

Chapter 21 gives the TI 66AK2H12 as an example. It includes four ARM Cortex-A15 cores and eight TI C66x DSP cores. Each DSP has L1 data cache, L1 program cache, and 1 MB dedicated SRAM that can be configured as L2 cache, local memory, or both. 

## DSP Organization Idea

```text
ARM CPU cores → control and general processing
DSP cores     → signal-processing calculations
```

---

# 13. big.LITTLE Architecture

big.LITTLE is heterogeneous multicore with equivalent ISA cores but different performance and power levels.

Chapter 21 explains that Figure 21.9 has high-performance Cortex-A15 cores and lower-power Cortex-A7 cores. A7 handles light tasks like background work, music, texts, and calls. A15 handles high-intensity tasks like video, gaming, and navigation. 

```text
LITTLE cores → low power, light tasks
big cores    → high performance, heavy tasks
```

## Cortex-A7 vs Cortex-A15

Chapter 21 states:

```text
Cortex-A7:
- in-order CPU
- 8 to 10 pipeline stages
- simpler
- lower energy

Cortex-A15:
- out-of-order CPU
- 15 to 24 pipeline stages
- more complex
- higher performance
```

A15 gives roughly twice the performance per MHz of A7, while A7 is roughly three times as energy efficient. 

---

# 14. Cache Coherence in Multicore

Cache coherence is needed when multiple caches may contain copies of the same memory block.

Problem:

```text
Core 1 cache: X = 9
Core 2 cache: X = 5
```

Core 2 has stale data.

Chapter 21 says multiple caches require a cache-coherence scheme to avoid access to invalid data. It also explains that software techniques can be used, but the software burden is too high in SoC chips, so hardware coherence is commonly used. 

---

## 14.1 Software Cache Coherence

Software manages coherence by:

```text
cleaning cache
invalidating cache
flushing cache
rereading memory
```

Tutorial 9 says software cache coherence relies on compiler and operating system support and imposes a heavier software burden. 

---

## 14.2 Hardware Cache Coherence

Hardware coherence uses mechanisms such as:

```text
Directory protocol
Snoopy protocol
```

Tutorial 9 explains that hardware coherence monitors memory traffic in real time and automatically updates or invalidates cache lines. 

---

# 15. ACE and MOESI

ACE means:

```text
Advanced Extensible Interface Coherence Extensions
```

Chapter 21 says ACE is ARM’s hardware coherence capability. It supports coherency between dissimilar processors, such as Cortex-A15 and Cortex-A7, enabling big.LITTLE. 

---

## 15.1 MOESI States

MOESI has five states:

```text
M = Modified
O = Owned
E = Exclusive
S = Shared
I = Invalid
```

## 15.2 Meaning of Each State

| State     | Meaning                                                     |
| --------- | ----------------------------------------------------------- |
| Modified  | Cache has the only valid copy and it is dirty               |
| Owned     | Dirty shared copy; this cache is responsible for write-back |
| Exclusive | Only this cache has the clean copy                          |
| Shared    | Multiple caches may have the copy                           |
| Invalid   | Cache line cannot be used                                   |

The important extra state compared with MESI is:

```text
Owned
```

Owned allows dirty data to be shared without immediate write-back to memory. 

---

# 16. Intel Core i7-5960X Example

Chapter 21 uses Intel Core i7-5960X as a real multicore example. It has eight cores, each core has a dedicated L2 cache, and all eight cores share a 20 MB L3 cache. Intel also uses hardware prefetching. 

## Cache Structure

```text
Core 1 → L1 → private L2 ┐
Core 2 → L1 → private L2 ├── shared 20 MB L3
Core 3 → L1 → private L2 ┘
```

## Prefetching

Prefetching means hardware predicts future memory accesses and loads likely-needed data into cache early.

Example:

```text
A[0], A[1], A[2], A[3] ...
```

The hardware may prefetch future array elements.

---

## PCI Express Bandwidth Calculation

Given:

```text
8 GT/s
40 bits per transfer
```

Calculation:

```text
8 × 10^9 × 40 = 320 × 10^9 bits/s
320 × 10^9 bits/s ÷ 8 = 40 × 10^9 bytes/s
```

Final:

```text
40 GB/s
```

Chapter 21 gives the same PCIe result. 

---

# 17. ARM Cortex-A15 MPCore

Chapter 21 introduces Cortex-A15 MPCore as a homogeneous multicore processor using multiple A15 cores. It includes components such as GIC, debug unit, generic timer, trace, core, L1 cache, L2 cache, and SCU. 

## 17.1 Main Structure

```text
ARM Cortex-A15 MPCore
├── multiple A15 cores
├── private L1 instruction/data caches
├── shared L2 memory system
├── GIC
└── SCU
```

---

# 18. GIC: Generic Interrupt Controller

GIC handles interrupts.

Its jobs:

```text
detect interrupts
prioritize interrupts
mask interrupts
route interrupts to target cores
track interrupt status
support software-generated interrupts
```

Simple flow:

```text
Interrupt source
      ↓
GIC
      ↓
Target CPU core
```

---

# 19. SCU: Snoop Control Unit

SCU maintains cache coherency among cores.

```text
SCU = cache consistency controller
```

It helps keep private L1 caches and shared L2 coherent.

## SCU Optimizations

| Feature                       | Meaning                                               |
| ----------------------------- | ----------------------------------------------------- |
| Direct Data Intervention, DDI | Clean data can be copied from one L1 cache to another |
| Duplicated tag RAMs           | SCU checks which core may have a cache line           |
| Migratory lines               | Dirty cache lines can move between CPUs efficiently   |

---

# 20. L2 Cache Coherency in Cortex-A15 MPCore

Each A15 core has private L1 instruction/data caches, while the L2 memory system is shared.

```text
Core 1 L1 ┐
Core 2 L1 ├── shared L2
Core 3 L1 ┘
```

Even with shared L2, private L1 caches can contain stale data. Therefore, SCU is still needed.

Example:

```text
Core 1 L1: X = 20
Core 2 L1: X = 10
Shared L2: X = 10
```

Core 2 must not use old `X = 10`.

---

# 21. Tutorial 9 Calculation 1: Effective MIPS

Tutorial 9 asks: Let α be the percentage of code that can execute simultaneously by `n` processors. The remaining code executes sequentially on one processor. Each processor has execution rate `x MIPS`. 

## Formula

```text
Effective MIPS = x / [(1 - α) + α/n]
```

## Given

```text
n = 16
x = 6 MIPS
Effective MIPS = 54 MIPS
```

## Solve

```text
54 = 6 / [(1 - α) + α/16]
```

Move denominator:

```text
(1 - α) + α/16 = 6/54
```

```text
6/54 = 1/9
```

So:

```text
1 - α + α/16 = 1/9
```

Combine:

```text
1 - 15α/16 = 1/9
```

```text
15α/16 = 8/9
```

```text
α = (8/9) × (16/15)
```

```text
α = 128/135
```

```text
α = 0.9481
```

Final:

```text
α ≈ 94.81%
```

Meaning:

```text
About 94.81% of the program must be parallelizable.
```

---

# 22. Tutorial 9 Calculation 2: Task Scheduling Speedup

Tutorial 9 gives five task times: 2000, 4000, 6000, 8000, and 10000 cycles. Tasks cannot be divided, and there are no communication or synchronization costs. 

## Sequential Time

```text
2000 + 4000 + 6000 + 8000 + 10000 = 30000 cycles
```

## Four Processors

Ideal lower bound:

```text
30000 / 4 = 7500 cycles
```

But the largest single task is:

```text
10000 cycles
```

Since the task cannot be divided, shortest possible time cannot be less than:

```text
10000 cycles
```

## Best Distribution

```text
Processor 1: 10000
Processor 2: 8000 + 2000 = 10000
Processor 3: 6000 + 4000 = 10000
Processor 4: idle
```

Parallel execution time:

```text
10000 cycles
```

## Speedup

```text
Speedup = sequential time / parallel time
        = 30000 / 10000
        = 3
```

Final:

```text
Speedup = 3×
```

---

# 23. Common Mistakes

1. **Thinking more cores always means proportional speedup**
   Wrong. Serial code and overhead limit speedup.

2. **Dividing the whole program by the number of cores**
   Only the parallel part is divided.

3. **Confusing SMT with multicore**
   SMT gives multiple hardware threads inside one physical core. Multicore gives multiple physical cores.

4. **Thinking shared L2/L3 removes all coherence problems**
   Private L1 caches can still become stale.

5. **Thinking GPU is always faster**
   GPU is faster only for suitable parallel workloads.

6. **Thinking big.LITTLE uses different instruction sets**
   A7 and A15 use equivalent ISA, but differ in power and performance.

7. **Forgetting the Owned state in MOESI**
   Owned is the important extra state compared with MESI.

8. **Using 7500 cycles for Tutorial 9 task scheduling**
   Wrong because the 10000-cycle task cannot be divided.

---

# 24. Viva / Exam-Style Questions

## Q1. Why did designers move toward multicore processors?

Because increasing single-core complexity gives diminishing returns, increases design difficulty, and increases power consumption. Multicore can improve throughput if software can exploit parallelism.

## Q2. Write the multicore speedup formula.

```text
Speedup = 1 / [(1 - f) + f/n]
```

## Q3. What does `f` represent?

`f` is the fraction of execution time that can be parallelized.

## Q4. Why does 8 cores not always give 8× speedup?

Because some code is serial, and there is also overhead from communication, synchronization, scheduling, and cache coherence.

## Q5. What is threading granularity?

It is the smallest unit of work that can be usefully parallelized.

## Q6. What is hybrid threading?

It is a mixture of coarse-grained and fine-grained threading.

## Q7. List four multicore cache organizations.

```text
Private L1 only
Private L1 + private L2
Private L1 + shared L2
Private L1 + private L2 + shared L3
```

## Q8. What is heterogeneous multicore?

A processor chip that contains more than one kind of core.

## Q9. Why are GPUs useful in heterogeneous systems?

Because they can support many parallel execution threads and are good for vector/matrix/data-parallel work.

## Q10. What is HSA?

HSA improves CPU-GPU cooperation using shared virtual memory, coherent memory, and a unified programming interface.

## Q11. What is cache coherence?

It ensures cached copies of shared data remain consistent and prevents cores from using stale data.

## Q12. What are the MOESI states?

```text
Modified
Owned
Exclusive
Shared
Invalid
```

## Q13. What does GIC do?

GIC handles interrupt detection, prioritization, masking, tracking, and distribution to cores.

## Q14. What does SCU do?

SCU maintains cache coherency among cores.

## Q15. What is DDI?

Direct Data Intervention allows clean data to be copied from one core’s L1 cache to another core’s L1 cache.

---

# 25. Final Formula Summary

```text
Multicore speedup:
S = 1 / [(1 - f) + f/n]

Effective MIPS:
Effective MIPS = x / [(1 - α) + α/n]

GFLOPS:
GFLOPS = GHz × cores × FLOPS/core

Bandwidth:
Bandwidth = transfers/s × bits/transfer
8 bits = 1 byte
```

---

# 26. Final Memory Map

```text
Chapter 11 Multicore Computers

Why multicore?
→ single-core complexity and power limits

How much faster?
→ depends on serial vs parallel fraction

What software benefits?
→ multithreaded, multiprocess, Java, multi-instance

How to divide work?
→ coarse, fine, hybrid threading

How are cores/caches arranged?
→ private L1/L2, shared L2/L3

What if core types differ?
→ CPU + GPU, CPU + DSP, big.LITTLE

How to keep data correct?
→ cache coherence, ACE, MESI/MOESI

Real examples?
→ Intel Core i7-5960X
→ ARM Cortex-A15 MPCore
```

---

# Chapter 11 Completed

You have finished **Chapter 11: Multicore Computers**.

Next chapter: **Chapter 12 — CISC vs RISC**.
