# Chapter 2 Performance: 50 Extreme-Hard Questions

## Question 1

**Question:** A processor upgrade doubles the peak instruction-issue width, but a workload's elapsed time is unchanged. Which observation most directly explains the result without contradicting the upgrade claim?

**Choices:**
- **A.** Wider issue always doubles the instruction count
- **B.** Superscalar execution can operate only on multicore processors
- **C.** The system clock must have stopped during execution
- **D.** The workload was limited by memory or I/O rather than issue width

**Correct Answer:** The workload was limited by memory or I/O rather than issue width

**Explanation:** A wider issue width helps only when enough independent instructions and data are available. A different bottleneck can leave total elapsed time unchanged.

---

## Question 2

**Question:** Instructions I1 and I2 are dependent, while I3 is independent of both. I1 misses in cache. Which technique can most directly allow useful execution to continue before I1 completes?

**Choices:**
- **A.** Data-flow analysis schedules I3 ahead of the stalled I2
- **B.** Increasing I2's dependency on I1
- **C.** Counting I1 and I2 as one instruction
- **D.** Replacing the cache with a slower memory

**Correct Answer:** Data-flow analysis schedules I3 ahead of the stalled I2

**Explanation:** Data-flow analysis identifies that I2 must wait for I1 but I3 need not. Executing I3 uses resources that might otherwise be idle.

---

## Question 3

**Question:** A branch predictor is always correct, but speculative execution is disabled. Which statement is most accurate?

**Choices:**
- **A.** Branch prediction and speculative execution are exactly the same mechanism
- **B.** The prediction identifies the likely path, but the processor may still wait before executing it
- **C.** Correct prediction guarantees that every instruction finishes in one cycle
- **D.** The processor must produce an incorrect architectural result

**Correct Answer:** The prediction identifies the likely path, but the processor may still wait before executing it

**Explanation:** Prediction supplies a guess; speculation acts on that guess before certainty. Disabling speculation can therefore leave some potential latency hiding unused.

---

## Question 4

**Question:** Which redesign best addresses a processor that spends most cycles waiting for main memory while preserving program semantics?

**Choices:**
- **A.** Replace parallel execution with strictly serial execution
- **B.** Increase only the number of branch opcodes
- **C.** Improve cache effectiveness and memory-transfer bandwidth
- **D.** Report performance using a larger MIPS number

**Correct Answer:** Improve cache effectiveness and memory-transfer bandwidth

**Explanation:** Better caching reduces memory-access frequency, while wider or faster transfers reduce the cost of accesses that remain. Both target the measured bottleneck.

---

## Question 5

**Question:** True or false: An ideal pipeline reduces the latency of every individual instruction by the same factor as it increases long-run instruction throughput.

**Choices:**
- **A.** True
- **B.** False

**Correct Answer:** False

**Explanation:** Pipelining primarily overlaps instructions to improve throughput. A single instruction still traverses all stages and may have similar or greater latency.

---

## Question 6

**Question:** A program is perfectly serial but performs the same vector operation on millions of independent data items. Which hardware is potentially useful only after the software exposes data parallelism?

**Choices:**
- **A.** A GPU or multicore processor
- **B.** A smaller instruction cache with more misses
- **C.** A longer clock cycle
- **D.** A lower-bandwidth bus

**Correct Answer:** A GPU or multicore processor

**Explanation:** Parallel hardware helps only if work can be divided into concurrently executable pieces. Independent vector elements provide that opportunity once software expresses it.

---

## Question 7

**Question:** Which change can increase processor clock rate yet reduce total system performance?

**Choices:**
- **A.** Instruction count and CPI both decrease at the same clock rate
- **B.** The higher rate also causes enough extra cache misses and stalls to raise execution time
- **C.** Memory latency and instruction count both become zero
- **D.** Clock cycle time decreases while every other quantity remains constant

**Correct Answer:** The higher rate also causes enough extra cache misses and stalls to raise execution time

**Explanation:** CPU time depends on instruction count, CPI, and clock rate. A CPI increase from added stalls can outweigh a higher clock rate.

---

## Question 8

**Question:** A designer widens a memory bus from 64 bits to 256 bits without changing latency or transfer frequency. For long sequential transfers with no other bottleneck, what is the ideal bandwidth multiplier?

**Choices:**
- **A.** 2
- **B.** 8
- **C.** 4
- **D.** 16

**Correct Answer:** 4

**Explanation:** Each transfer carries four times as many bits because 256/64 = 4. The assumption excludes overheads that would prevent ideal scaling.

---

## Question 9

**Question:** Which statement correctly distinguishes superscalar execution from multicore execution?

**Choices:**
- **A.** They are two names for the same organization
- **B.** Superscalar requires multiple chips; multicore requires one execution unit
- **C.** Superscalar means higher clock frequency; multicore means lower CPI
- **D.** Superscalar issues multiple instructions within one core, whereas multicore provides multiple processing cores

**Correct Answer:** Superscalar issues multiple instructions within one core, whereas multicore provides multiple processing cores

**Explanation:** Superscalar parallelism exists among execution units in one core. Multicore parallelism exists among distinct cores on a chip.

---

## Question 10

**Question:** Why can smaller logic gates eventually fail to deliver proportional clock-rate gains?

**Choices:**
- **A.** Power density, heat, interconnect RC delay, and memory latency become limiting
- **B.** Smaller gates force every program to execute more source-code lines
- **C.** Clock cycle time is mathematically independent of clock rate
- **D.** Cache memory becomes identical to magnetic disk

**Correct Answer:** Power density, heat, interconnect RC delay, and memory latency become limiting

**Explanation:** Physical and system-level limits increasingly dominate as transistor switching improves. Raising frequency alone cannot remove those limits.

---

## Question 11

**Question:** A program achieves an overall speedup of 4 on 8 identical cores with zero parallel overhead. According to Amdahl's Law, what fraction of the original execution time is parallelizable?

**Choices:**
- **A.** 75.00%
- **B.** 85.71%
- **C.** 80.00%
- **D.** 87.50%

**Correct Answer:** 85.71%

**Explanation:** Solving 4 = 1/[(1-f)+f/8] gives f = 6/7, or approximately 85.71%.

---

## Question 12

**Question:** A workload is 96% parallelizable and runs on 12 cores with no overhead. What speedup does Amdahl's Law predict?

**Choices:**
- **A.** 6.00
- **B.** 10.00
- **C.** 8.33
- **D.** 11.52

**Correct Answer:** 8.33

**Explanation:** Speedup = 1/[0.04 + 0.96/12] = 1/0.12 = 8.33.

---

## Question 13

**Question:** A program is 92% parallelizable. Ignoring overhead, by what factor does its execution time improve when moving from 8 cores to 32 cores?

**Choices:**
- **A.** 2.91
- **B.** 4.00
- **C.** 1.23
- **D.** 1.79

**Correct Answer:** 1.79

**Explanation:** The normalized times are 0.08 + 0.92/8 = 0.195 and 0.08 + 0.92/32 = 0.10875. Their ratio is approximately 1.79.

---

## Question 14

**Question:** Of an original runtime, 30% cannot be improved, 50% is accelerated by 10 times, and 20% is accelerated by 4 times. What is the overall speedup?

**Choices:**
- **A.** 2.50
- **B.** 4.00
- **C.** 2.00
- **D.** 7.00

**Correct Answer:** 2.50

**Explanation:** The new normalized time is 0.30 + 0.50/10 + 0.20/4 = 0.40. Overall speedup is 1/0.40 = 2.50.

---

## Question 15

**Question:** Choose two statements that must be true for the basic Amdahl model used in this chapter.

**Choices:**
- **A.** Doubling cores always halves execution time
- **B.** The serial fraction limits speedup even as the processor count approaches infinity
- **C.** Parallel overhead must grow linearly with the core count
- **D.** The modeled workload size remains fixed while resources are increased

**Correct Answer:** The serial fraction limits speedup even as the processor count approaches infinity; The modeled workload size remains fixed while resources are increased

**Explanation:** Basic Amdahl analysis assumes a fixed workload and exposes the serial fraction as the asymptotic limit. It does not require a particular overhead model or perfect scaling.

---

## Question 16

**Question:** A program is 90% parallelizable. What is the smallest integer number of cores needed to reach at least 95% of its theoretical infinite-core speedup, assuming zero overhead?

**Choices:**
- **A.** 190
- **B.** 95
- **C.** 171
- **D.** 90

**Correct Answer:** 171

**Explanation:** Infinite-core speedup is 10, so the target is 9.5. Solving 1/(0.1 + 0.9/n) >= 9.5 gives n >= 171.

---

## Question 17

**Question:** A program is 98% parallelizable on 64 cores, but synchronization adds normalized time 0.0005(n-1). What speedup is obtained relative to normalized original time 1?

**Choices:**
- **A.** 28.16
- **B.** 32.00
- **C.** 50.00
- **D.** 14.97

**Correct Answer:** 14.97

**Explanation:** New time = 0.02 + 0.98/64 + 0.0005(63) = 0.0668125. The speedup is approximately 1/0.0668125 = 14.97.

---

## Question 18

**Question:** A workload spends 25% of its time in a serial section and 75% in a section that could use 8 cores. You may either make the serial section twice as fast or run the parallel section on 8 cores. Which option gives the larger overall speedup?

**Choices:**
- **A.** Parallelize the 75% section, producing a speedup of 2.91
- **B.** Both options produce a speedup of 2.00
- **C.** Accelerate the serial section, producing a speedup of 1.14
- **D.** Neither option changes execution time

**Correct Answer:** Parallelize the 75% section, producing a speedup of 2.91

**Explanation:** The parallel option gives 1/(0.25 + 0.75/8) = 2.91, while halving the serial part gives only 1/(0.125 + 0.75) = 1.14.

---

## Question 19

**Question:** A server completes 480 requests per second, and average response time is 25 ms. According to Little's Law, how many requests are in the system on average?

**Choices:**
- **A.** 12,000
- **B.** 12
- **C.** 120
- **D.** 19.2

**Correct Answer:** 12

**Explanation:** N = XR = 480 x 0.025 = 12 requests.

---

## Question 20

**Question:** A storage system averages 60 outstanding requests and sustains 750 requests per second. What is its average response time?

**Choices:**
- **A.** 8 ms
- **B.** 125 ms
- **C.** 80 ms
- **D.** 450 ms

**Correct Answer:** 80 ms

**Explanation:** R = N/X = 60/750 = 0.08 seconds, which is 80 ms.

---

## Question 21

**Question:** Average concurrency rises from 20 to 40 requests while throughput remains fixed at 250 requests per second. Under steady-state Little's Law assumptions, what happens to average response time?

**Choices:**
- **A.** It falls from 80 ms to 40 ms
- **B.** It remains 80 ms
- **C.** It rises from 160 ms to 320 ms
- **D.** It rises from 80 ms to 160 ms

**Correct Answer:** It rises from 80 ms to 160 ms

**Explanation:** R = N/X, so the original response is 20/250 = 80 ms and the new response is 40/250 = 160 ms.

---

## Question 22

**Question:** Requests flow through two stable stages at 300 requests per second. Stage 1 averages 10 ms and Stage 2 averages 40 ms. What is the average total number of requests across both stages?

**Choices:**
- **A.** 15
- **B.** 12
- **C.** 3
- **D.** 50

**Correct Answer:** 15

**Explanation:** Little's Law gives 300(0.01) = 3 requests in Stage 1 and 300(0.04) = 12 in Stage 2, totaling 15.

---

## Question 23

**Question:** A service has throughput 1,000 requests per second and an average of 50 requests in the system. What can be concluded about its 99th-percentile response time using only Little's Law?

**Choices:**
- **A.** It is at most 50 ms
- **B.** It cannot be determined from the given averages
- **C.** It is at least 50 ms
- **D.** It is exactly 50 ms

**Correct Answer:** It cannot be determined from the given averages

**Explanation:** Little's Law yields an average response time of 50 ms, not a percentile. Many latency distributions can share the same average.

---

## Question 24

**Question:** An instruction mix is 20% ALU at CPI 1, 30% load/store at CPI 2, 40% floating point at CPI 4, and 10% branch at base CPI 3. Each branch additionally pays a 5-cycle penalty with probability 20%. What is the effective CPI?

**Choices:**
- **A.** 3.10
- **B.** 3.70
- **C.** 2.80
- **D.** 2.70

**Correct Answer:** 2.80

**Explanation:** Branch CPI is 3 + 0.2(5) = 4, so effective CPI = 0.2(1) + 0.3(2) + 0.4(4) + 0.1(4) = 2.8.

---

## Question 25

**Question:** A program executes 1.2 billion instructions at CPI 1.5 on a 3 GHz processor. What is its CPU execution time?

**Choices:**
- **A.** 1.80 s
- **B.** 0.40 s
- **C.** 5.40 s
- **D.** 0.60 s

**Correct Answer:** 0.60 s

**Explanation:** CPU time = (1.2 x 10^9)(1.5)/(3 x 10^9) = 0.60 seconds.

---

## Question 26

**Question:** Compiler A produces 800 million instructions with CPI 2.25 on a 3.6 GHz CPU. Compiler B produces 1 billion instructions with CPI 1.6 on a 3.2 GHz CPU. Which compiled program has the lower CPU time?

**Choices:**
- **A.** They tie at 0.50 s
- **B.** They tie at 2.00 s
- **C.** Compiler B by 20%
- **D.** Compiler A by 20%

**Correct Answer:** They tie at 0.50 s

**Explanation:** A takes 0.8(2.25)/3.6 = 0.50 s, and B takes 1.0(1.6)/3.2 = 0.50 s.

---

## Question 27

**Question:** What is the clock cycle time of a 4 GHz processor?

**Choices:**
- **A.** 4 ns
- **B.** 0.25 ns
- **C.** 0.25 ps
- **D.** 2.5 ps

**Correct Answer:** 0.25 ns

**Explanation:** Cycle time = 1/(4 x 10^9) seconds = 0.25 x 10^-9 seconds = 0.25 ns.

---

## Question 28

**Question:** Relative to an old design, a new design raises clock rate by 25%, reduces instruction count by 8%, but raises CPI by 10%. What is the speedup?

**Choices:**
- **A.** 1.012
- **B.** 1.125
- **C.** 1.235
- **D.** 1.375

**Correct Answer:** 1.235

**Explanation:** Speedup = 1.25/[0.92(1.10)] = approximately 1.235.

---

## Question 29

**Question:** A processor executes 700 million instructions in 0.42 seconds at 2.5 GHz. What is the effective CPI?

**Choices:**
- **A.** 1.05
- **B.** 2.50
- **C.** 0.60
- **D.** 1.50

**Correct Answer:** 1.50

**Explanation:** CPI = time x clock rate / instruction count = 0.42(2.5 x 10^9)/(700 x 10^6) = 1.5.

---

## Question 30

**Question:** Machine A executes a workload using 2 billion instructions in 1.0 s; Machine B executes the same workload using 1.2 billion instructions in 0.8 s. Which conclusion is correct?

**Choices:**
- **A.** B is faster despite having a lower MIPS rate
- **B.** MIPS proves that A completes the workload in 0.5 s
- **C.** A is faster because its MIPS rate is 2,000 versus B's 1,500
- **D.** Both machines have equal performance because they run the same workload

**Correct Answer:** B is faster despite having a lower MIPS rate

**Explanation:** B's elapsed time is lower, which is the decisive measure for the same workload. Different instruction counts make raw MIPS misleading across machines.

---

## Question 31

**Question:** A processor has base CPI 1.2. It has 0.04 cache misses per instruction with a 40-cycle penalty, and 15% of instructions are branches with an 8% misprediction rate and a 12-cycle penalty. Assuming penalties do not overlap, what is total CPI?

**Choices:**
- **A.** 3.104
- **B.** 2.944
- **C.** 2.800
- **D.** 1.744

**Correct Answer:** 2.944

**Explanation:** Cache stalls add 0.04(40) = 1.6 cycles and branch stalls add 0.15(0.08)(12) = 0.144. Total CPI is 1.2 + 1.6 + 0.144 = 2.944.

---

## Question 32

**Question:** For the processor in Question 31, a cache redesign halves the misses per instruction and changes nothing else. What speedup results?

**Choices:**
- **A.** 1.200
- **B.** 1.500
- **C.** 1.373
- **D.** 2.000

**Correct Answer:** 1.373

**Explanation:** New CPI = 1.2 + 0.02(40) + 0.144 = 2.144. With equal instruction count and clock rate, speedup = 2.944/2.144 = approximately 1.373.

---

## Question 33

**Question:** Computer A has CPI 1.7 and cycle time 0.4 ns. Computer B has CPI 1.1 and cycle time 0.6 ns for the same instruction count. Which is faster, and by what factor?

**Choices:**
- **A.** A is 1.03 times faster
- **B.** B is 1.55 times faster
- **C.** A is 1.55 times faster
- **D.** B is 1.03 times faster

**Correct Answer:** B is 1.03 times faster

**Explanation:** A needs 0.68 ns per instruction on average, while B needs 0.66 ns. The speedup of B over A is 0.68/0.66 = approximately 1.03.

---

## Question 34

**Question:** An optimization reduces instruction count to 80% of its original value, raises CPI to 115% of its original value, and lowers clock rate to 95% of its original value. What is the net speedup?

**Choices:**
- **A.** 1.033
- **B.** 1.250
- **C.** 0.968
- **D.** 1.150

**Correct Answer:** 1.033

**Explanation:** New/old time = 0.80(1.15)/0.95 = 0.9684, so speedup = 1/0.9684 = approximately 1.033.

---

## Question 35

**Question:** A numerical kernel performs 6 billion floating-point operations in 2 seconds. What is its performance in MFLOPS?

**Choices:**
- **A.** 3
- **B.** 3,000
- **C.** 300
- **D.** 12,000

**Correct Answer:** 3,000

**Explanation:** MFLOPS = 6 x 10^9/(2 x 10^6) = 3,000.

---

## Question 36

**Question:** A unit completes 1.2 billion fused multiply-add instructions per second, and the benchmark counts each fused multiply-add as two floating-point operations. What rate should be reported?

**Choices:**
- **A.** 1,200 MFLOPS
- **B.** 600 MFLOPS
- **C.** 2,400 MFLOPS
- **D.** 4,800 MFLOPS

**Correct Answer:** 2,400 MFLOPS

**Explanation:** The operation rate is 2(1.2 billion) = 2.4 billion FLOPs per second, or 2,400 MFLOPS.

---

## Question 37

**Question:** A processor reports rates of 120, 80, and 60 tasks per second on three equal-sized workloads. What is the harmonic mean rate?

**Choices:**
- **A.** 75
- **B.** 90
- **C.** 86.67
- **D.** 80

**Correct Answer:** 80

**Explanation:** The harmonic mean is 3/(1/120 + 1/80 + 1/60) = 80 tasks per second.

---

## Question 38

**Question:** A system has normalized benchmark ratios 2, 0.5, 8, and 0.25. What is their geometric mean?

**Choices:**
- **A.** 1.189
- **B.** 1.000
- **C.** 2.000
- **D.** 2.688

**Correct Answer:** 1.189

**Explanation:** The product is 2, and the fourth root of 2 is approximately 1.189.

---

## Question 39

**Question:** A vehicle-like workload covers equal amounts of work at rates 100 units/s and 300 units/s. Which average rate correctly represents the total work divided by total time?

**Choices:**
- **A.** 200 units/s
- **B.** 150 units/s
- **C.** 173.2 units/s
- **D.** 250 units/s

**Correct Answer:** 150 units/s

**Explanation:** Equal work at different rates requires the harmonic mean: 2/(1/100 + 1/300) = 150 units/s.

---

## Question 40

**Question:** A SPEC benchmark takes 500 seconds on the reference machine and 125 seconds on the tested machine. What is the tested machine's normalized speed ratio for that benchmark?

**Choices:**
- **A.** 2
- **B.** 0.25
- **C.** 4
- **D.** 625

**Correct Answer:** 4

**Explanation:** The speed ratio is reference time/test time = 500/125 = 4.

---

## Question 41

**Question:** A machine obtains normalized speed ratios 4, 2, and 0.5 on three benchmarks. What is the suite's geometric-mean ratio?

**Choices:**
- **A.** 4.000
- **B.** 1.333
- **C.** 2.167
- **D.** 1.587

**Correct Answer:** 1.587

**Explanation:** The geometric mean is the cube root of 4(2)(0.5) = 4, which is approximately 1.587.

---

## Question 42

**Question:** What is the strongest reason to compare both SPEC base and peak metrics?

**Choices:**
- **A.** Base emphasizes comparable strict compilation rules, while peak permits more aggressive benchmark-specific optimization
- **B.** Base measures disk capacity, while peak measures monitor resolution
- **C.** Base is always faster than peak by definition
- **D.** Peak forbids compiler optimization, while base requires it

**Correct Answer:** Base emphasizes comparable strict compilation rules, while peak permits more aggressive benchmark-specific optimization

**Explanation:** Base results favor consistent comparison under stricter rules. Peak results show performance available with more extensive allowed tuning.

---

## Question 43

**Question:** Which SPEC-style metric is conceptually best suited to reveal the benefit of running many independent copies on a multicore server?

**Choices:**
- **A.** A single-task latency metric only
- **B.** A rate metric
- **C.** Clock cycle time alone
- **D.** Static instruction count alone

**Correct Answer:** A rate metric

**Explanation:** A rate metric measures throughput from completed tasks over time and can exploit simultaneous execution across cores.

---

## Question 44

**Question:** Every benchmark ratio for every tested machine is recomputed using a reference machine that is exactly twice as fast as the old reference on all benchmarks. What happens to the ranking by geometric mean?

**Choices:**
- **A.** Every geometric mean is multiplied by 4
- **B.** The ranking reverses
- **C.** The ranking is unchanged, although every geometric mean is divided by 2
- **D.** Geometric means become impossible to compute

**Correct Answer:** The ranking is unchanged, although every geometric mean is divided by 2

**Explanation:** Changing to a twice-as-fast reference halves every normalized ratio by the same factor. Common scaling changes scores but not their ordering.

---

## Question 45

**Question:** Why is the geometric mean preferred over the arithmetic mean for normalized performance ratios across a benchmark suite?

**Choices:**
- **A.** It converts every ratio into elapsed time
- **B.** It always equals the fastest benchmark ratio
- **C.** It guarantees that all workloads have identical instruction counts
- **D.** It treats reciprocal speedups and slowdowns symmetrically and is less dependent on the chosen normalization

**Correct Answer:** It treats reciprocal speedups and slowdowns symmetrically and is less dependent on the chosen normalization

**Explanation:** Multiplicative ratios combine naturally through the geometric mean. A factor of 2 and a factor of 1/2 balance, unlike under an arithmetic mean.

---

## Question 46

**Question:** An ideal non-pipelined processor needs 5 ns per instruction. A 5-stage pipeline has a 1 ns stage time and no hazards. How much faster is the pipeline for exactly 100 instructions?

**Choices:**
- **A.** 4.81 times
- **B.** 5.21 times
- **C.** 5.00 times
- **D.** 4.00 times

**Correct Answer:** 4.81 times

**Explanation:** Non-pipelined time is 500 ns, while pipelined time is (5 + 100 - 1)(1 ns) = 104 ns. The finite-workload speedup is 500/104 = approximately 4.81.

---

## Question 47

**Question:** An ideal pipeline has base CPI 1. Branches are 20% of instructions, 5% of branches are mispredicted, and each misprediction costs 15 cycles. What CPI results if no other stalls occur?

**Choices:**
- **A.** 1.01
- **B.** 1.15
- **C.** 1.75
- **D.** 2.50

**Correct Answer:** 1.15

**Explanation:** Misprediction stalls per instruction are 0.20(0.05)(15) = 0.15, so CPI is 1.15.

---

## Question 48

**Question:** A width-4 superscalar processor executes 1,000 instructions. A dependency chain of 400 instructions can advance by at most one instruction per cycle, while all other instructions can fill otherwise available issue slots perfectly. What is the minimum cycle count and resulting IPC?

**Choices:**
- **A.** 600 cycles and IPC 1.67
- **B.** 250 cycles and IPC 4.0
- **C.** 400 cycles and IPC 2.5
- **D.** 1,000 cycles and IPC 1.0

**Correct Answer:** 400 cycles and IPC 2.5

**Explanation:** Width alone requires at least 250 cycles, but the dependency chain requires at least 400, which dominates. IPC is therefore 1,000/400 = 2.5.

---

## Question 49

**Question:** In the measured runtime, 40% is CPU computation and 60% is unavoidable memory waiting. A new processor doubles computation speed but leaves memory behavior unchanged. What is the overall speedup?

**Choices:**
- **A.** 2.00
- **B.** 1.20
- **C.** 1.40
- **D.** 1.25

**Correct Answer:** 1.25

**Explanation:** New normalized time is 0.40/2 + 0.60 = 0.80, so speedup is 1/0.80 = 1.25.

---

## Question 50

**Question:** An original program executes 1 billion instructions at CPI 2 on a 2 GHz CPU. In the new system, clock rate is 3 GHz, instruction count rises by 10%, and CPI falls to 1.5 because cache stalls are reduced. What is the new execution time and overall speedup?

**Choices:**
- **A.** 0.55 s and 1.82 times
- **B.** 1.10 s and 0.91 times
- **C.** 0.73 s and 1.36 times
- **D.** 0.45 s and 2.22 times

**Correct Answer:** 0.55 s and 1.82 times

**Explanation:** Original time is 1 s, while new time is (1.1 x 10^9)(1.5)/(3 x 10^9) = 0.55 s. Speedup is 1/0.55 = approximately 1.82.
