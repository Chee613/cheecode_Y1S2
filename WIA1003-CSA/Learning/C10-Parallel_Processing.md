# Chapter 10: Parallel Processing

# 1. Big idea of parallel processing

**Parallel processing** means using more than one processor, core, or computer to do work at the same time.

```text
Single processing:
Task A -> Task B -> Task C -> Task D

Parallel processing:
Processor 1 -> Task A
Processor 2 -> Task B
Processor 3 -> Task C
Processor 4 -> Task D
```

We need parallel processing because one processor has limits. Pipelining improves performance inside a processor, but parallel processing uses multiple processing resources to increase total throughput.

---

# 2. Instruction stream and data stream

An **instruction stream** is a sequence of instructions.

```assembly
LOAD A
ADD B
STORE C
```

A **data stream** is the data being processed.

```text
A = 5
B = 3
```

Flynn’s taxonomy classifies systems based on how many instruction streams and data streams they use. The Chapter 20 notes list four categories: SISD, SIMD, MISD, and MIMD. 

---

# 3. Flynn’s taxonomy

| Type | Full name                          | Meaning                                                               | Example                 |
| ---- | ---------------------------------- | --------------------------------------------------------------------- | ----------------------- |
| SISD | Single Instruction Single Data     | One instruction stream, one data stream                               | Basic uniprocessor      |
| SIMD | Single Instruction Multiple Data   | Same instruction applied to many data items                           | Vector/array processor  |
| MISD | Multiple Instruction Single Data   | Different instructions applied to same data stream                    | Not commercially common |
| MIMD | Multiple Instruction Multiple Data | Different processors execute different instructions on different data | SMP, NUMA, clusters     |

## SISD

```text
Control Unit -> Processing Unit -> One data stream
```

One processor executes one instruction stream on one data stream.

## SIMD

```text
             One instruction
                   |
        -----------------------
        |          |          |
      Data 1     Data 2     Data 3
```

Same instruction, many data items.

Example:

```text
ADD 10 to [2, 4, 6, 8]
Result = [12, 14, 16, 18]
```

## MISD

Multiple instruction streams operate on one data stream. Your notes say this is not commercially implemented. 

## MIMD

```text
CPU 1 -> Instruction stream 1 -> Data 1
CPU 2 -> Instruction stream 2 -> Data 2
CPU 3 -> Instruction stream 3 -> Data 3
```

This is the most important for Chapter 10 because **SMP, NUMA, and clusters** belong here. Tutorial 09 also asks these three system organizations directly. 

---

# 4. Alternative MIMD organizations

MIMD systems can be divided into:

```text
MIMD
 |
 +--> Shared-memory systems
 |      +--> SMP
 |      +--> NUMA
 |
 +--> Distributed-memory systems
        +--> Clusters
```

## Shared memory

All processors access a common memory space.

```text
CPU 1 ----\
CPU 2 ----- > Shared Memory
CPU 3 ----/
```

## Distributed memory

Each processor/computer has its own memory.

```text
CPU 1 + Memory 1 <--> Network <--> CPU 2 + Memory 2
```

---

# 5. Symmetric Multiprocessor, SMP

## Meaning

**SMP** stands for **Symmetric Multiprocessor**.

An SMP is one computer system with multiple similar processors sharing memory and I/O. Tutorial 09 lists the SMP characteristics: two or more comparable processors, shared memory and I/O, shared bus/internal connection, roughly identical memory access time, all processors can perform the same functions, and one integrated OS. 

```text
          +----------------+
          |  Main Memory   |
          +----------------+
             ^    ^    ^
             |    |    |
        +-------------------+
        | Interconnection   |
        +-------------------+
             |    |    |
           CPU1 CPU2 CPU3
```

## Why “symmetric”?

All processors are similar and can perform the same functions.

```text
Wrong idea:
CPU 1 = boss
CPU 2 = worker
CPU 3 = worker

Correct SMP idea:
CPU 1, CPU 2, CPU 3 are equal in function
```

---

# 6. SMP characteristics

## 1. Two or more similar processors

```text
CPU 1
CPU 2
CPU 3
```

More processors can execute more work in parallel.

## 2. Shared main memory

```text
CPU 1 ----\
CPU 2 ----- > Main Memory
CPU 3 ----/
```

Processors communicate by reading/writing shared memory.

## 3. Shared I/O

All processors can access I/O devices such as disk, network card, and printer.

## 4. Uniform memory access time

In SMP, memory access time is approximately the same for each processor.

```text
CPU 1 -> Memory block A: about same time
CPU 2 -> Memory block A: about same time
```

This is different from NUMA.

## 5. One integrated OS

One operating system manages all processors.

```text
One OS
 |
 +--> CPU 1
 +--> CPU 2
 +--> CPU 3
```

---

# 7. Bus-based SMP

A common SMP organization uses a **time-shared bus**. The Chapter 20 notes describe the time-shared bus as the simplest mechanism for constructing a multiprocessor system. 

```text
CPU 1 ----\
CPU 2 -----\
CPU 3 ------> Shared Bus ---> Main Memory / I/O
CPU 4 -----/
```

## Bus contains

```text
Address bus  -> carries address
Data bus     -> carries data
Control bus  -> carries read/write/control signals
```

## Three bus features

| Feature      | Meaning                                  |
| ------------ | ---------------------------------------- |
| Addressing   | Identify source/destination              |
| Arbitration  | Decide who gets the bus                  |
| Time-sharing | Only one module controls bus at one time |

## Advantages

| Advantage   | Explanation                                                 |
| ----------- | ----------------------------------------------------------- |
| Simplicity  | Easy to design and understand                               |
| Flexibility | Easy to add processors                                      |
| Reliability | Failure of one attached device should not fail whole system |

## Main disadvantage

The bus becomes a bottleneck.

```text
CPU 1 wants memory
CPU 2 wants memory
CPU 3 wants memory
CPU 4 wants memory

But only one bus transfer can happen at a time.
```

So adding more processors does not always give more speed.

---

# 8. Multiprocessor operating system issues

An SMP needs one OS that can manage many CPUs safely.

## Main OS design issues

| Issue                             | Meaning                                                     |
| --------------------------------- | ----------------------------------------------------------- |
| Simultaneous concurrent processes | Many processors may run OS/user code at the same time       |
| Scheduling                        | Assign ready tasks to available processors                  |
| Synchronization                   | Protect shared resources and control event order            |
| Memory management                 | Coordinate shared pages, memory protection, and consistency |
| Reliability and fault tolerance   | Continue running even if one processor fails                |

## Synchronization example

Without synchronization:

```text
Balance = 100

CPU 1 reads 100, adds 50 -> writes 150
CPU 2 reads 100, subtracts 30 -> writes 70

Final wrong answer = 70
```

Correct final answer should be:

```text
100 + 50 - 30 = 120
```

So the OS must use synchronization.

---

# 9. Cache coherence problem

Each processor usually has its own cache.

```text
CPU 1 + Cache 1
CPU 2 + Cache 2
CPU 3 + Cache 3
        |
        v
   Shared Memory
```

Problem:

```text
Memory X = 10
CPU 1 cache X = 10
CPU 2 cache X = 10
```

CPU 1 writes:

```text
CPU 1 cache X = 20
```

But CPU 2 may still have:

```text
CPU 2 cache X = 10  old value
```

This is the **cache coherence problem**. Hardware cache coherence is needed when multiple caches exist so processors do not access invalid/stale data. 

---

# 10. Software vs hardware cache coherence

Tutorial 09 asks the difference between software and hardware cache coherence. 

| Type               | Main responsibility        | How it works                                      | Advantage                 | Disadvantage                              |
| ------------------ | -------------------------- | ------------------------------------------------- | ------------------------- | ----------------------------------------- |
| Software coherence | Compiler + OS              | Detect shared data, avoid caching or flush caches | Less hardware complexity  | Conservative, may reduce cache efficiency |
| Hardware coherence | Cache controllers/hardware | Uses protocols at run time                        | Automatic and transparent | More complex hardware                     |

## Software example

Compiler decides:

```text
Shared variable X should not be cached.
```

## Hardware example

Cache controller detects:

```text
CPU 1 writes X.
CPU 2 has old X.
Invalidate CPU 2's copy.
```

---

# 11. Directory protocol

A **directory protocol** keeps a record of which cache has which memory line.

```text
Directory entry for X:
CPU 1 has X? Yes
CPU 2 has X? Yes
CPU 3 has X? No
```

## How it works

If CPU 1 wants to write X:

```text
1. CPU 1 asks directory for exclusive access.
2. Directory checks who has X.
3. Directory tells other caches to invalidate X.
4. CPU 1 writes X.
```

## Good for

Large systems with complex interconnections.

## Main problem

Directory/controller can become a bottleneck.

---

# 12. Snoopy protocol

A **snoopy protocol** means every cache controller watches the shared bus.

```text
CPU 1 broadcasts: "I am writing X"

CPU 2 cache snoops bus:
Do I have X? Yes -> invalidate/update

CPU 3 cache snoops bus:
Do I have X? No -> ignore
```

## Good for

Bus-based SMP because all processors can observe the shared bus.

## Main problem

Too many broadcasts can increase bus traffic.

---

# 13. Write-invalidate vs write-update

| Method           | Meaning                                       | Result                             |
| ---------------- | --------------------------------------------- | ---------------------------------- |
| Write-invalidate | Other cache copies are marked invalid         | Only writer has valid updated copy |
| Write-update     | Other cache copies are updated with new value | All copies remain updated          |

## Write-invalidate example

Before:

```text
CPU 1 cache X = 10
CPU 2 cache X = 10
CPU 3 cache X = 10
```

CPU 1 writes X = 20.

After:

```text
CPU 1 cache X = 20
CPU 2 cache X = Invalid
CPU 3 cache X = Invalid
```

## Write-update example

CPU 1 writes X = 20.

After:

```text
CPU 1 cache X = 20
CPU 2 cache X = 20
CPU 3 cache X = 20
```

---

# 14. MESI protocol

MESI is a hardware cache coherence protocol.

Tutorial 09 defines the four MESI states: Modified, Exclusive, Shared, and Invalid. 

| State        | Meaning                                                           |
| ------------ | ----------------------------------------------------------------- |
| Modified, M  | Cache line changed; memory is old; this cache has only valid copy |
| Exclusive, E | Cache line matches memory; only this cache has it                 |
| Shared, S    | Cache line matches memory; other caches may also have it          |
| Invalid, I   | Cache line is not valid and must be fetched again if needed       |

## Important comparison

```text
Modified:
Only my cache has it.
Memory is old.

Exclusive:
Only my cache has it.
Memory is correct.

Shared:
Other caches may also have it.
Memory is correct.

Invalid:
Do not use this cache line.
```

---

# 15. MESI state transitions

## Read hit

If CPU reads a valid line:

```text
M -> M
E -> E
S -> S
```

State usually does not change.

## Write hit in Modified

```text
M -> M
```

Already owns latest copy.

## Write hit in Exclusive

```text
E -> M
```

Because after writing, cache differs from memory.

## Write hit in Shared

```text
S -> M
```

But first, other shared copies must be invalidated.

```text
CPU 1: S -> M
CPU 2: S -> I
CPU 3: S -> I
```

## Read miss with no other copy

```text
I -> E
```

Only this cache has the clean copy.

## Read miss with another cache copy

```text
I -> S
```

Because now more than one cache has it.

## Another CPU reads my Modified line

```text
My cache: M -> S
Other cache: I -> S
Memory updated
```

Chapter 21 also describes MESI-based coherency where a modified line can be transferred to another requesting cache and coherence is maintained. 

---

# 16. Clustering

A **cluster** is a group of independent computers connected together to work as one system.

Tutorial 09 defines clusters as independent whole computers, called nodes, interconnected by a high-speed network. 

```text
Cluster
 |
 +--> Node 1 = Computer 1
 +--> Node 2 = Computer 2
 +--> Node 3 = Computer 3
```

Each node has its own CPU, memory, storage, I/O, and usually OS.

## Cluster vs SMP

| Feature       | SMP                            | Cluster                          |
| ------------- | ------------------------------ | -------------------------------- |
| Basic unit    | Processors inside one computer | Independent computers            |
| Memory        | Shared memory                  | Each node usually has own memory |
| Communication | Shared memory                  | Network/messages/files           |
| Coupling      | Tightly coupled                | Loosely coupled                  |
| Scalability   | Limited                        | Very high                        |

## Benefits of clustering

Tutorial 09 lists these benefits: absolute scalability, incremental scalability, high availability/fault tolerance, and price/performance. 

| Benefit                 | Meaning                                      |
| ----------------------- | -------------------------------------------- |
| Absolute scalability    | Can build very large systems with many nodes |
| Incremental scalability | Can add nodes one by one                     |
| High availability       | If one node fails, others can take over      |
| Price/performance       | Uses cheaper commodity computers             |

---

# 17. NUMA

**NUMA** stands for **Non-Uniform Memory Access**.

Tutorial 09 defines NUMA as shared-memory architecture where access time depends on memory location. A processor can access its own local memory faster than memory located on another processor’s node. 

```text
Node 1: CPU 1 + Local Memory 1
Node 2: CPU 2 + Local Memory 2
Node 3: CPU 3 + Local Memory 3
```

## Local memory

Memory close to the processor.

```text
CPU 1 -> Memory 1 = fast
```

## Remote memory

Memory attached to another node.

```text
CPU 1 -> interconnection -> Memory 3 = slower
```

## SMP vs NUMA

| Feature                | SMP                            | NUMA                           |
| ---------------------- | ------------------------------ | ------------------------------ |
| Memory access time     | Approximately same             | Depends on memory location     |
| Memory structure       | Common shared memory           | Distributed among nodes        |
| Local vs remote memory | Not important                  | Very important                 |
| Scalability            | Lower                          | Better than simple SMP         |
| OS concern             | Schedule processes across CPUs | Keep process close to its data |

## NUMA vs cluster

| Feature       | NUMA                  | Cluster                |
| ------------- | --------------------- | ---------------------- |
| Memory view   | Shared address space  | Separate node memories |
| Communication | Shared memory access  | Network/messages       |
| Node meaning  | Processor-memory node | Independent computer   |
| Coupling      | More tightly coupled  | Loosely coupled        |

---

# 18. Tutorial 09 calculations

## Q1: Effective MIPS with parallel fraction α

Given:

```text
α = fraction of code that can run in parallel
n = number of processors
x = speed of each processor in MIPS
```

Sequential part:

```text
1 - α
```

Parallel part:

```text
α
```

Effective MIPS:

```text
Effective MIPS = x / [(1 - α) + α/n]
```

Tutorial 09 asks this formula and then asks for α when `n = 16`, `x = 6 MIPS`, and system performance is `54 MIPS`. 

Substitute:

```text
54 = 6 / [(1 - α) + α/16]
```

Solve:

```text
(1 - α) + α/16 = 6/54
1 - α + α/16 = 1/9
1 - 15α/16 = 1/9
15α/16 = 8/9
α = (8/9)(16/15)
α = 128/135
α ≈ 0.948
```

Answer:

```text
α ≈ 94.8%
```

## Q2: Task scheduling speedup

Tasks:

```text
2000, 4000, 6000, 8000, 10000 cycles
```

Sequential time:

```text
2000 + 4000 + 6000 + 8000 + 10000 = 30000 cycles
```

Best distribution on 4 processors:

```text
P1: 10000             = 10000
P2: 8000              = 8000
P3: 6000 + 2000       = 8000
P4: 4000              = 4000
```

Parallel execution time is the maximum processor workload:

```text
Parallel time = 10000 cycles
```

Speedup:

```text
Speedup = Sequential time / Parallel time
Speedup = 30000 / 10000
Speedup = 3
```

Answer:

```text
Shortest execution time = 10000 cycles
Speedup = 3
```

---

# 19. Final comparison table

| Topic              | Key idea                                                               |
| ------------------ | ---------------------------------------------------------------------- |
| SISD               | One instruction stream, one data stream                                |
| SIMD               | One instruction stream, multiple data streams                          |
| MISD               | Multiple instruction streams, one data stream, not commercially common |
| MIMD               | Multiple instruction streams, multiple data streams                    |
| SMP                | Shared-memory multiprocessor with equal processor roles                |
| Bus-based SMP      | Simple but bus can become bottleneck                                   |
| Cache coherence    | Keeps multiple cache copies consistent                                 |
| Software coherence | Compiler/OS handles coherence                                          |
| Hardware coherence | Cache controllers handle coherence                                     |
| Directory protocol | Central directory records cache-line ownership                         |
| Snoopy protocol    | Caches monitor bus traffic                                             |
| Write-invalidate   | Other copies become invalid                                            |
| Write-update       | Other copies receive new value                                         |
| MESI               | Modified, Exclusive, Shared, Invalid                                   |
| Cluster            | Independent computers connected by network                             |
| NUMA               | Shared memory, but local memory faster than remote memory              |

---

# 20. Common exam mistakes

1. **Thinking more processors always give perfect speedup.**
   Wrong. Sequential code, communication cost, synchronization, and memory bottlenecks reduce speedup.

2. **Confusing SMP and cluster.**
   SMP is one tightly coupled system with shared memory. A cluster is many independent computers connected by network.

3. **Confusing SMP and NUMA.**
   SMP has approximately equal memory access time. NUMA has local and remote memory with different access times.

4. **Saying Modified means memory is latest.**
   Wrong. Modified means cache is latest and memory is old.

5. **Saying Invalid means main memory is invalid.**
   Wrong. Only that cache line is invalid.

6. **For task scheduling, adding all processor workloads after parallel distribution.**
   Wrong. Parallel time is the **maximum** processor workload, not the sum.

---

# 21. Viva / exam-style questions

1. What is parallel processing?
2. What are SISD, SIMD, MISD, and MIMD?
3. Why are SMP, NUMA, and clusters classified as MIMD?
4. What are the main characteristics of SMP?
5. Why does a bus-based SMP suffer from performance bottleneck?
6. What is cache coherence?
7. What is the difference between software and hardware cache coherence?
8. Compare directory and snoopy protocols.
9. Compare write-invalidate and write-update.
10. What are the four MESI states?
11. What happens when another CPU reads a Modified line?
12. What is a cluster?
13. What are the benefits of clustering?
14. What is NUMA?
15. Why is process placement important in NUMA?
16. Derive the effective MIPS formula.
17. Why is the task scheduling speedup not always equal to the number of processors?

---

# Final checkpoint

You should now be able to answer:

```text
1. Flynn’s taxonomy
2. SMP characteristics
3. Bus-based SMP advantages/disadvantages
4. Multiprocessor OS issues
5. Cache coherence problem
6. Software vs hardware coherence
7. Directory vs snoopy protocols
8. Write-invalidate vs write-update
9. MESI states and transitions
10. Clustering and benefits
11. NUMA
12. Tutorial 09 calculations
```

Chapter 10 is complete.
