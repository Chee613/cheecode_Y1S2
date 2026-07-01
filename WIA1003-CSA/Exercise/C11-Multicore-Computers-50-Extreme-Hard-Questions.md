# Chapter 11 Multicore Computers: 50 Extreme-Hard Questions

## Question 1

**Question:** Why did power limits push processors toward multicore?

**Choices:**
- **A.** Several moderate cores can improve throughput without extreme frequency
- **B.** Multicore needs no software
- **C.** More cores eliminate heat
- **D.** Clock rate has no effect on power

**Correct Answer:** Several moderate cores can improve throughput without extreme frequency

**Explanation:** Frequency and density scaling raised power beyond practical cooling.

---

## Question 2

**Question:** What does Pollacks rule suggest?

**Choices:**
- **A.** Core count equals clock rate
- **B.** Single-core performance grows roughly with the square root of complexity
- **C.** Power is always zero
- **D.** Performance grows linearly with transistor count forever

**Correct Answer:** Single-core performance grows roughly with the square root of complexity

**Explanation:** Large complexity increases bring diminishing single-thread gains.

---

## Question 3

**Question:** What workload benefits most from multicore?

**Choices:**
- **A.** One instruction with no data
- **B.** A powered-off program
- **C.** Independent or well-partitioned parallel work
- **D.** A strictly serial dependency chain

**Correct Answer:** Independent or well-partitioned parallel work

**Explanation:** Cores need concurrently executable threads or tasks.

---

## Question 4

**Question:** What is coarse-grained threading?

**Choices:**
- **A.** One instruction per thread
- **B.** Switching threads every cycle
- **C.** No synchronization ever
- **D.** A few large tasks run mostly independently

**Correct Answer:** A few large tasks run mostly independently

**Explanation:** Large work units reduce scheduling overhead but may limit load balance.

---

## Question 5

**Question:** What is fine-grained threading?

**Choices:**
- **A.** Work is divided into many small units
- **B.** Threads cannot communicate
- **C.** Each core uses a different ISA
- **D.** Only one long task exists

**Correct Answer:** Work is divided into many small units

**Explanation:** Small units improve balance but raise coordination overhead.

---

## Question 6

**Question:** Why can hybrid threading outperform purely coarse or fine schemes?

**Choices:**
- **A.** It forces equal task duration
- **B.** It balances parallel coverage against scheduling overhead
- **C.** It removes dependencies mathematically
- **D.** It uses no cores

**Correct Answer:** It balances parallel coverage against scheduling overhead

**Explanation:** Different subsystems can use different granularities.

---

## Question 7

**Question:** What benefit does private L1 plus shared L2 provide?

**Choices:**
- **A.** L2 duplicates nothing always
- **B.** No coherence is needed
- **C.** Fast local hits with flexible shared capacity
- **D.** Every L1 hit accesses all cores

**Correct Answer:** Fast local hits with flexible shared capacity

**Explanation:** Private L1 reduces latency while shared L2 can absorb uneven demands.

---

## Question 8

**Question:** Why can private L2 caches reduce interference?

**Choices:**
- **A.** They eliminate all duplication
- **B.** They make remote memory local
- **C.** They require no tags
- **D.** One cores working set is less likely to evict anothers

**Correct Answer:** One cores working set is less likely to evict anothers

**Explanation:** Partitioned capacity isolates per-core cache activity.

---

## Question 9

**Question:** What does SMT share?

**Choices:**
- **A.** One cores execution resources among hardware threads
- **B.** Main memory among separate computers only
- **C.** One instruction across GPU lanes
- **D.** A disk parity block

**Correct Answer:** One cores execution resources among hardware threads

**Explanation:** Threads fill otherwise idle pipeline slots within a core.

---

## Question 10

**Question:** Four cores each support four SMT threads. How many hardware contexts exist?

**Choices:**
- **A.** 8
- **B.** 16
- **C.** 4
- **D.** 32

**Correct Answer:** 16

**Explanation:** 4×4 = 16 logical hardware threads.

---

## Question 11

**Question:** What defines heterogeneous multicore?

**Choices:**
- **A.** It uses no cache
- **B.** The system has one register
- **C.** Cores or accelerators have different capabilities
- **D.** Every core is identical

**Correct Answer:** Cores or accelerators have different capabilities

**Explanation:** Different engines target performance, efficiency, or workload classes.

---

## Question 12

**Question:** Why are GPUs strong at throughput workloads?

**Choices:**
- **A.** They have no memory hierarchy
- **B.** They minimize every serial latency
- **C.** They run one lane only
- **D.** Many simple lanes execute highly parallel arithmetic

**Correct Answer:** Many simple lanes execute highly parallel arithmetic

**Explanation:** GPU area favors massive data parallelism over complex control.

---

## Question 13

**Question:** What often erases GPU acceleration gains for small jobs?

**Choices:**
- **A.** CPU–GPU transfer and launch overhead
- **B.** The GPU has no ALU
- **C.** GFLOPS are measured in bytes
- **D.** Too much serial CPU cache

**Correct Answer:** CPU–GPU transfer and launch overhead

**Explanation:** Fixed movement and setup costs can exceed short computation.

---

## Question 14

**Question:** What HSA feature reduces explicit CPU–GPU copying?

**Choices:**
- **A.** Separate incompatible memories only
- **B.** A shared coherent address space
- **C.** No virtual memory
- **D.** One-way interrupts

**Correct Answer:** A shared coherent address space

**Explanation:** Unified addressing lets processors share structures more directly.

---

## Question 15

**Question:** Why pair a CPU with a DSP?

**Choices:**
- **A.** DSPs replace every branch
- **B.** CPUs cannot add
- **C.** DSPs efficiently execute repetitive signal-processing kernels
- **D.** DSPs store magnetic data

**Correct Answer:** DSPs efficiently execute repetitive signal-processing kernels

**Explanation:** Specialized datapaths suit multiply-accumulate and streaming work.

---

## Question 16

**Question:** What is big.LITTLEs central idea?

**Choices:**
- **A.** Remove task migration
- **B.** Run all cores at maximum power always
- **C.** Pair CPU with disk
- **D.** Use efficient small cores for light work and fast large cores for demanding work

**Correct Answer:** Use efficient small cores for light work and fast large cores for demanding work

**Explanation:** Workload-aware migration improves energy efficiency.

---

## Question 17

**Question:** In MOESI, what does Owned add beyond MESI?

**Choices:**
- **A.** A dirty line may be shared while one cache supplies data
- **B.** Every cache may write simultaneously
- **C.** Memory is always newest
- **D.** The line is invalid

**Correct Answer:** A dirty line may be shared while one cache supplies data

**Explanation:** Owned identifies the responsible dirty supplier while other caches hold shared copies.

---

## Question 18

**Question:** What does the GIC manage?

**Choices:**
- **A.** GPU arithmetic
- **B.** Interrupt routing and prioritization among cores
- **C.** Cache replacement
- **D.** DRAM refresh

**Correct Answer:** Interrupt routing and prioritization among cores

**Explanation:** The Generic Interrupt Controller directs interrupt sources to processors.

---

## Question 19

**Question:** What does the SCU manage?

**Choices:**
- **A.** Instruction decoding only
- **B.** Disk sectors
- **C.** Snooping and cache consistency among cores
- **D.** Optical tracking

**Correct Answer:** Snooping and cache consistency among cores

**Explanation:** The Snoop Control Unit coordinates coherent cache behavior.

---

## Question 20

**Question:** What does prefetching risk?

**Choices:**
- **A.** Reducing address width
- **B.** Eliminating all misses
- **C.** Changing program semantics
- **D.** Wasted bandwidth and cache pollution when predictions are wrong

**Correct Answer:** Wasted bandwidth and cache pollution when predictions are wrong

**Explanation:** Speculative data can displace useful lines and consume interconnect capacity.

---

## Question 21

**Question:** Why can shared cache improve utilization?

**Choices:**
- **A.** Idle cores leave capacity available to active cores
- **B.** It guarantees no contention
- **C.** It has no latency
- **D.** It removes coherence

**Correct Answer:** Idle cores leave capacity available to active cores

**Explanation:** Dynamic sharing avoids rigid per-core partitions.

---

## Question 22

**Question:** Why can shared cache hurt predictability?

**Choices:**
- **A.** It is always smaller
- **B.** Other cores can evict a cores lines
- **C.** It disables SMT
- **D.** It cannot store instructions

**Correct Answer:** Other cores can evict a cores lines

**Explanation:** Cross-core interference makes hit behavior workload-dependent.

---

## Question 23

**Question:** An A15 gives twice A7 performance/MHz while A7 is three times as energy efficient. Which core suits background work?

**Choices:**
- **A.** Neither core
- **B.** A15 always
- **C.** A7
- **D.** GPU only

**Correct Answer:** A7

**Explanation:** Light work favors the efficiency core when peak latency is unnecessary.

---

## Question 24

**Question:** A 40-bit link runs at 8 GT/s. What one-direction raw bandwidth results?

**Choices:**
- **A.** 20 GB/s
- **B.** 320 GB/s
- **C.** 8 GB/s
- **D.** 40 GB/s

**Correct Answer:** 40 GB/s

**Explanation:** 8×10^9×40/8 = 40×10^9 bytes/s.

---

## Question 25

**Question:** Why is cache coherence necessary in multicore?

**Choices:**
- **A.** Cores may cache different copies of shared data
- **B.** Every core uses only registers
- **C.** Caches are always shared physically
- **D.** Programs never communicate

**Correct Answer:** Cores may cache different copies of shared data

**Explanation:** Writes must become visible according to the memory model.

---

## Question 26

**Question:** An engine runs at 3.8 GHz with 4 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 15.2 GFLOPS
- **B.** 121.6 GFLOPS
- **C.** 30.4 GFLOPS
- **D.** 32 GFLOPS

**Correct Answer:** 121.6 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 121.6.

---

## Question 27

**Question:** An engine runs at 0.8 GHz with 384 cores and 2 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 307.2 GFLOPS
- **B.** 1.6 GFLOPS
- **C.** 614.4 GFLOPS
- **D.** 768 GFLOPS

**Correct Answer:** 614.4 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 614.4.

---

## Question 28

**Question:** An engine runs at 2.5 GHz with 8 cores and 4 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 10 GFLOPS
- **B.** 32 GFLOPS
- **C.** 20 GFLOPS
- **D.** 80 GFLOPS

**Correct Answer:** 80 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 80.

---

## Question 29

**Question:** An engine runs at 3.2 GHz with 16 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 409.6 GFLOPS
- **B.** 51.2 GFLOPS
- **C.** 25.6 GFLOPS
- **D.** 128 GFLOPS

**Correct Answer:** 409.6 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 409.6.

---

## Question 30

**Question:** An engine runs at 1.5 GHz with 32 cores and 4 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 48 GFLOPS
- **B.** 192 GFLOPS
- **C.** 128 GFLOPS
- **D.** 6 GFLOPS

**Correct Answer:** 192 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 192.

---

## Question 31

**Question:** An engine runs at 2 GHz with 64 cores and 2 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 4 GFLOPS
- **B.** 128 GFLOPS
- **C.** 256 GFLOPS
- **D.** 128 GFLOPS

**Correct Answer:** 256 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 256.

---

## Question 32

**Question:** An engine runs at 4 GHz with 6 cores and 16 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 24 GFLOPS
- **B.** 64 GFLOPS
- **C.** 96 GFLOPS
- **D.** 384 GFLOPS

**Correct Answer:** 384 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 384.

---

## Question 33

**Question:** An engine runs at 1.2 GHz with 128 cores and 2 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 307.2 GFLOPS
- **B.** 2.4 GFLOPS
- **C.** 256 GFLOPS
- **D.** 153.6 GFLOPS

**Correct Answer:** 307.2 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 307.2.

---

## Question 34

**Question:** An engine runs at 2.8 GHz with 12 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 33.6 GFLOPS
- **B.** 268.8 GFLOPS
- **C.** 22.4 GFLOPS
- **D.** 96 GFLOPS

**Correct Answer:** 268.8 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 268.8.

---

## Question 35

**Question:** An engine runs at 3 GHz with 24 cores and 4 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 72 GFLOPS
- **B.** 12 GFLOPS
- **C.** 288 GFLOPS
- **D.** 96 GFLOPS

**Correct Answer:** 288 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 288.

---

## Question 36

**Question:** An engine runs at 1 GHz with 256 cores and 2 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 512 GFLOPS
- **B.** 256 GFLOPS
- **C.** 2 GFLOPS
- **D.** 512 GFLOPS

**Correct Answer:** 512 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 512.

---

## Question 37

**Question:** An engine runs at 1.8 GHz with 48 cores and 4 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 345.6 GFLOPS
- **B.** 86.4 GFLOPS
- **C.** 7.2 GFLOPS
- **D.** 192 GFLOPS

**Correct Answer:** 345.6 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 345.6.

---

## Question 38

**Question:** An engine runs at 2.2 GHz with 20 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 160 GFLOPS
- **B.** 352 GFLOPS
- **C.** 17.6 GFLOPS
- **D.** 44 GFLOPS

**Correct Answer:** 352 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 352.

---

## Question 39

**Question:** An engine runs at 3.5 GHz with 10 cores and 16 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 35 GFLOPS
- **B.** 56 GFLOPS
- **C.** 560 GFLOPS
- **D.** 160 GFLOPS

**Correct Answer:** 560 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 560.

---

## Question 40

**Question:** An engine runs at 0.9 GHz with 512 cores and 2 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 1024 GFLOPS
- **B.** 460.8 GFLOPS
- **C.** 1.8 GFLOPS
- **D.** 921.6 GFLOPS

**Correct Answer:** 921.6 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 921.6.

---

## Question 41

**Question:** An engine runs at 2.6 GHz with 14 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 291.2 GFLOPS
- **B.** 36.4 GFLOPS
- **C.** 20.8 GFLOPS
- **D.** 112 GFLOPS

**Correct Answer:** 291.2 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 291.2.

---

## Question 42

**Question:** An engine runs at 1.6 GHz with 80 cores and 4 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 128 GFLOPS
- **B.** 512 GFLOPS
- **C.** 6.4 GFLOPS
- **D.** 320 GFLOPS

**Correct Answer:** 512 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 512.

---

## Question 43

**Question:** An engine runs at 3.3 GHz with 18 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 59.4 GFLOPS
- **B.** 26.4 GFLOPS
- **C.** 475.2 GFLOPS
- **D.** 144 GFLOPS

**Correct Answer:** 475.2 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 475.2.

---

## Question 44

**Question:** An engine runs at 2.4 GHz with 30 cores and 4 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 120 GFLOPS
- **B.** 72 GFLOPS
- **C.** 9.6 GFLOPS
- **D.** 288 GFLOPS

**Correct Answer:** 288 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 288.

---

## Question 45

**Question:** An engine runs at 1.1 GHz with 160 cores and 2 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 352 GFLOPS
- **B.** 176 GFLOPS
- **C.** 2.2 GFLOPS
- **D.** 320 GFLOPS

**Correct Answer:** 352 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 352.

---

## Question 46

**Question:** An engine runs at 3.6 GHz with 8 cores and 16 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 128 GFLOPS
- **B.** 460.8 GFLOPS
- **C.** 57.6 GFLOPS
- **D.** 28.8 GFLOPS

**Correct Answer:** 460.8 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 460.8.

---

## Question 47

**Question:** An engine runs at 2.7 GHz with 22 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 21.6 GFLOPS
- **B.** 59.4 GFLOPS
- **C.** 475.2 GFLOPS
- **D.** 176 GFLOPS

**Correct Answer:** 475.2 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 475.2.

---

## Question 48

**Question:** An engine runs at 1.4 GHz with 96 cores and 4 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 384 GFLOPS
- **B.** 5.6 GFLOPS
- **C.** 134.4 GFLOPS
- **D.** 537.6 GFLOPS

**Correct Answer:** 537.6 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 537.6.

---

## Question 49

**Question:** An engine runs at 2.1 GHz with 40 cores and 8 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 672 GFLOPS
- **B.** 84 GFLOPS
- **C.** 16.8 GFLOPS
- **D.** 320 GFLOPS

**Correct Answer:** 672 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 672.

---

## Question 50

**Question:** An engine runs at 0.7 GHz with 640 cores and 2 FLOPs/core/cycle. What peak rate follows?

**Choices:**
- **A.** 1.4 GFLOPS
- **B.** 896 GFLOPS
- **C.** 448 GFLOPS
- **D.** 1280 GFLOPS

**Correct Answer:** 896 GFLOPS

**Explanation:** Peak GFLOPS = GHz×cores×FLOPs per cycle = 896.
