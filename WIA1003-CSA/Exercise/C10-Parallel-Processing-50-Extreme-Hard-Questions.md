# Chapter 10 Parallel Processing: 50 Extreme-Hard Questions

## Question 1

**Question:** Which Flynn class describes one instruction operating on many data elements?

**Choices:**
- **A.** MISD
- **B.** SISD
- **C.** MIMD
- **D.** SIMD

**Correct Answer:** SIMD

**Explanation:** A shared instruction stream controls multiple data streams.

---

## Question 2

**Question:** Which Flynn class describes ordinary independent multicore tasks?

**Choices:**
- **A.** MIMD
- **B.** SIMD
- **C.** SISD
- **D.** MISD

**Correct Answer:** MIMD

**Explanation:** Different cores can execute different instruction streams on different data.

---

## Question 3

**Question:** Why is MISD rare?

**Choices:**
- **A.** It is identical to SISD
- **B.** Few general workloads need multiple instruction streams on the same data stream
- **C.** It cannot be built
- **D.** It has no instructions

**Correct Answer:** Few general workloads need multiple instruction streams on the same data stream

**Explanation:** Its unusual dataflow has limited mainstream applicability.

---

## Question 4

**Question:** What makes an SMP symmetric?

**Choices:**
- **A.** Every processor has private memory only
- **B.** Processors use different ISAs
- **C.** Peer processors share memory and one OS with comparable access
- **D.** One master executes all application code

**Correct Answer:** Peer processors share memory and one OS with comparable access

**Explanation:** No processor is permanently assigned a subordinate role.

---

## Question 5

**Question:** What limits a bus-based SMP as processor count grows?

**Choices:**
- **A.** Uniform access becomes zero time
- **B.** No cache is possible
- **C.** Too many private instruction sets
- **D.** Shared-bus bandwidth and arbitration contention

**Correct Answer:** Shared-bus bandwidth and arbitration contention

**Explanation:** More processors compete for one finite communication path.

---

## Question 6

**Question:** Why can two unsynchronized updates lose money in a shared balance?

**Choices:**
- **A.** Read-modify-write operations can interleave
- **B.** Memory has no addresses
- **C.** Caches always add values
- **D.** The OS serializes every instruction

**Correct Answer:** Read-modify-write operations can interleave

**Explanation:** Both processors may read the old balance and overwrite one update.

---

## Question 7

**Question:** What is cache coherence?

**Choices:**
- **A.** Making every cache the same size
- **B.** Keeping shared cached copies consistent with writes
- **C.** Eliminating private caches
- **D.** Scheduling threads equally

**Correct Answer:** Keeping shared cached copies consistent with writes

**Explanation:** Processors must not continue using stale values for shared blocks.

---

## Question 8

**Question:** What is the main scaling advantage of a directory protocol?

**Choices:**
- **A.** It works only on one bus
- **B.** Every write updates every byte globally
- **C.** Messages target known sharers instead of broadcasting to all nodes
- **D.** It needs no metadata

**Correct Answer:** Messages target known sharers instead of broadcasting to all nodes

**Explanation:** A directory records ownership and sharers for selective communication.

---

## Question 9

**Question:** What is the main scaling weakness of snooping?

**Choices:**
- **A.** It cannot invalidate lines
- **B.** It stores no state
- **C.** It requires distributed memory
- **D.** Every cache monitors broadcast coherence traffic

**Correct Answer:** Every cache monitors broadcast coherence traffic

**Explanation:** Broadcast bandwidth and electrical reach limit large systems.

---

## Question 10

**Question:** Write-invalidate does what after one processor writes a shared line?

**Choices:**
- **A.** Marks other cached copies invalid
- **B.** Sends the new value to every cache on every write
- **C.** Disables the writer
- **D.** Writes only to disk

**Correct Answer:** Marks other cached copies invalid

**Explanation:** The writer gains exclusive ownership while others must miss before reuse.

---

## Question 11

**Question:** Write-update differs by doing what?

**Choices:**
- **A.** Changing the instruction set
- **B.** Broadcasting the new value to sharers
- **C.** Deleting every copy
- **D.** Avoiding all traffic

**Correct Answer:** Broadcasting the new value to sharers

**Explanation:** Other copies remain valid but coherence traffic occurs on each write.

---

## Question 12

**Question:** In MESI, what does Modified mean?

**Choices:**
- **A.** Many caches have clean copies
- **B.** This cache has the only clean copy
- **C.** This cache has the only dirty copy
- **D.** The line is unusable

**Correct Answer:** This cache has the only dirty copy

**Explanation:** Memory is stale and the owner must supply or write back the data.

---

## Question 13

**Question:** In MESI, what does Exclusive mean?

**Choices:**
- **A.** All caches have the line
- **B.** This cache has a dirty shared copy
- **C.** The line is invalid
- **D.** This cache has the only clean copy

**Correct Answer:** This cache has the only clean copy

**Explanation:** Memory agrees, so a local write can silently change E to M.

---

## Question 14

**Question:** A write hits a Shared MESI line. What action is needed?

**Choices:**
- **A.** Invalidate other sharers before modifying
- **B.** Change directly to Invalid
- **C.** Read from disk
- **D.** Write silently with no coherence message

**Correct Answer:** Invalidate other sharers before modifying

**Explanation:** The writer must obtain exclusive ownership.

---

## Question 15

**Question:** Another processor reads a line held Modified. What must the owner do?

**Choices:**
- **A.** Ignore the request
- **B.** Supply or write back the current data and downgrade state
- **C.** Invalidate the requester
- **D.** Change the data value

**Correct Answer:** Supply or write back the current data and downgrade state

**Explanation:** Memory lacks the newest copy, so the owner participates in the read.

---

## Question 16

**Question:** What distinguishes a cluster from an SMP?

**Choices:**
- **A.** SMP nodes use separate operating systems only
- **B.** Cluster processors always share one physical memory
- **C.** Cluster nodes are complete computers connected by a network
- **D.** They are identical terms

**Correct Answer:** Cluster nodes are complete computers connected by a network

**Explanation:** A cluster couples machines more loosely than shared-memory processors.

---

## Question 17

**Question:** What is a principal cluster benefit?

**Choices:**
- **A.** No operating system
- **B.** Zero communication cost
- **C.** Uniform register access across machines
- **D.** Scalable availability through multiple nodes

**Correct Answer:** Scalable availability through multiple nodes

**Explanation:** Nodes can distribute load and continue service after some failures.

---

## Question 18

**Question:** What defines NUMA?

**Choices:**
- **A.** Memory access time depends on which node owns the memory
- **B.** Every node has a separate ISA
- **C.** No shared address space exists
- **D.** All memory is equally distant

**Correct Answer:** Memory access time depends on which node owns the memory

**Explanation:** Local memory is faster than remote memory within a shared address space.

---

## Question 19

**Question:** What placement policy helps NUMA performance?

**Choices:**
- **A.** Move every page remotely
- **B.** Keep threads near the memory pages they use
- **C.** Disable caches
- **D.** Broadcast every load

**Correct Answer:** Keep threads near the memory pages they use

**Explanation:** Affinity reduces expensive inter-node accesses.

---

## Question 20

**Question:** Why can false sharing cause coherence traffic?

**Choices:**
- **A.** The cache has no blocks
- **B.** Processors write the same variable only
- **C.** Independent variables occupy the same cache line
- **D.** The variables are in registers

**Correct Answer:** Independent variables occupy the same cache line

**Explanation:** Coherence operates at line granularity, so unrelated writes invalidate each other.

---

## Question 21

**Question:** Which remedy targets false sharing?

**Choices:**
- **A.** Increase branch penalties
- **B.** Remove synchronization
- **C.** Use a slower bus
- **D.** Pad or align hot variables onto separate cache lines

**Correct Answer:** Pad or align hot variables onto separate cache lines

**Explanation:** Separating writable data prevents line-level ownership ping-pong.

---

## Question 22

**Question:** When is write-update preferable to write-invalidate?

**Choices:**
- **A.** Many processors read each newly written value before the next write
- **B.** One processor writes repeatedly without readers
- **C.** The line is never shared
- **D.** Network bandwidth is scarce

**Correct Answer:** Many processors read each newly written value before the next write

**Explanation:** Updating can avoid subsequent read misses when fresh values are widely consumed.

---

## Question 23

**Question:** Why is hardware coherence usually transparent to software?

**Choices:**
- **A.** The compiler disables caching
- **B.** Caches exchange protocol messages automatically
- **C.** Only one processor executes
- **D.** Programs never share data

**Correct Answer:** Caches exchange protocol messages automatically

**Explanation:** The protocol maintains line states beneath ordinary loads and stores.

---

## Question 24

**Question:** What lower bound limits scheduling five tasks of 2,4,6,8,10 thousand cycles on four processors?

**Choices:**
- **A.** 30,000 cycles
- **B.** 8,000 cycles
- **C.** 10,000 cycles
- **D.** 7,500 cycles

**Correct Answer:** 10,000 cycles

**Explanation:** The longest indivisible task alone takes 10,000 cycles, exceeding the average-load bound.

---

## Question 25

**Question:** A schedule finishes those tasks in 10,000 cycles versus 30,000 sequentially. What speedup?

**Choices:**
- **A.** 2.5
- **B.** 4
- **C.** 10
- **D.** 3

**Correct Answer:** 3

**Explanation:** 30,000/10,000 = 3.

---

## Question 26

**Question:** Each processor delivers 10 MIPS; parallel fraction is 0.5 on 2 processors. What effective MIPS follows?

**Choices:**
- **A.** 13.33 MIPS
- **B.** 5 MIPS
- **C.** 20 MIPS
- **D.** 10 MIPS

**Correct Answer:** 13.33 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 13.33.

---

## Question 27

**Question:** Each processor delivers 8 MIPS; parallel fraction is 0.6 on 4 processors. What effective MIPS follows?

**Choices:**
- **A.** 8 MIPS
- **B.** 14.55 MIPS
- **C.** 2 MIPS
- **D.** 32 MIPS

**Correct Answer:** 14.55 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 14.55.

---

## Question 28

**Question:** Each processor delivers 6 MIPS; parallel fraction is 0.7 on 8 processors. What effective MIPS follows?

**Choices:**
- **A.** 6 MIPS
- **B.** 48 MIPS
- **C.** 15.48 MIPS
- **D.** 0.75 MIPS

**Correct Answer:** 15.48 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 15.48.

---

## Question 29

**Question:** Each processor delivers 12 MIPS; parallel fraction is 0.75 on 3 processors. What effective MIPS follows?

**Choices:**
- **A.** 36 MIPS
- **B.** 4 MIPS
- **C.** 12 MIPS
- **D.** 24 MIPS

**Correct Answer:** 24 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 24.

---

## Question 30

**Question:** Each processor delivers 5 MIPS; parallel fraction is 0.8 on 4 processors. What effective MIPS follows?

**Choices:**
- **A.** 12.5 MIPS
- **B.** 5 MIPS
- **C.** 1.25 MIPS
- **D.** 20 MIPS

**Correct Answer:** 12.5 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 12.5.

---

## Question 31

**Question:** Each processor delivers 10 MIPS; parallel fraction is 0.82 on 8 processors. What effective MIPS follows?

**Choices:**
- **A.** 80 MIPS
- **B.** 35.4 MIPS
- **C.** 10 MIPS
- **D.** 1.25 MIPS

**Correct Answer:** 35.4 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 35.4.

---

## Question 32

**Question:** Each processor delivers 4 MIPS; parallel fraction is 0.85 on 16 processors. What effective MIPS follows?

**Choices:**
- **A.** 4 MIPS
- **B.** 0.25 MIPS
- **C.** 19.69 MIPS
- **D.** 64 MIPS

**Correct Answer:** 19.69 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 19.69.

---

## Question 33

**Question:** Each processor delivers 7 MIPS; parallel fraction is 0.88 on 8 processors. What effective MIPS follows?

**Choices:**
- **A.** 7 MIPS
- **B.** 0.88 MIPS
- **C.** 56 MIPS
- **D.** 30.43 MIPS

**Correct Answer:** 30.43 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 30.43.

---

## Question 34

**Question:** Each processor delivers 9 MIPS; parallel fraction is 0.9 on 4 processors. What effective MIPS follows?

**Choices:**
- **A.** 27.69 MIPS
- **B.** 36 MIPS
- **C.** 9 MIPS
- **D.** 2.25 MIPS

**Correct Answer:** 27.69 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 27.69.

---

## Question 35

**Question:** Each processor delivers 6 MIPS; parallel fraction is 0.9 on 16 processors. What effective MIPS follows?

**Choices:**
- **A.** 96 MIPS
- **B.** 38.4 MIPS
- **C.** 6 MIPS
- **D.** 0.38 MIPS

**Correct Answer:** 38.4 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 38.4.

---

## Question 36

**Question:** Each processor delivers 12 MIPS; parallel fraction is 0.92 on 8 processors. What effective MIPS follows?

**Choices:**
- **A.** 1.5 MIPS
- **B.** 96 MIPS
- **C.** 61.54 MIPS
- **D.** 12 MIPS

**Correct Answer:** 61.54 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 61.54.

---

## Question 37

**Question:** Each processor delivers 5 MIPS; parallel fraction is 0.93 on 16 processors. What effective MIPS follows?

**Choices:**
- **A.** 5 MIPS
- **B.** 80 MIPS
- **C.** 0.31 MIPS
- **D.** 39.02 MIPS

**Correct Answer:** 39.02 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 39.02.

---

## Question 38

**Question:** Each processor delivers 8 MIPS; parallel fraction is 0.94 on 32 processors. What effective MIPS follows?

**Choices:**
- **A.** 89.51 MIPS
- **B.** 256 MIPS
- **C.** 8 MIPS
- **D.** 0.25 MIPS

**Correct Answer:** 89.51 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 89.51.

---

## Question 39

**Question:** Each processor delivers 10 MIPS; parallel fraction is 0.95 on 8 processors. What effective MIPS follows?

**Choices:**
- **A.** 10 MIPS
- **B.** 59.26 MIPS
- **C.** 80 MIPS
- **D.** 1.25 MIPS

**Correct Answer:** 59.26 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 59.26.

---

## Question 40

**Question:** Each processor delivers 6 MIPS; parallel fraction is 0.95 on 16 processors. What effective MIPS follows?

**Choices:**
- **A.** 6 MIPS
- **B.** 96 MIPS
- **C.** 54.86 MIPS
- **D.** 0.38 MIPS

**Correct Answer:** 54.86 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 54.86.

---

## Question 41

**Question:** Each processor delivers 4 MIPS; parallel fraction is 0.96 on 32 processors. What effective MIPS follows?

**Choices:**
- **A.** 4 MIPS
- **B.** 128 MIPS
- **C.** 0.12 MIPS
- **D.** 57.14 MIPS

**Correct Answer:** 57.14 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 57.14.

---

## Question 42

**Question:** Each processor delivers 12 MIPS; parallel fraction is 0.97 on 16 processors. What effective MIPS follows?

**Choices:**
- **A.** 132.41 MIPS
- **B.** 12 MIPS
- **C.** 0.75 MIPS
- **D.** 192 MIPS

**Correct Answer:** 132.41 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 132.41.

---

## Question 43

**Question:** Each processor delivers 5 MIPS; parallel fraction is 0.97 on 64 processors. What effective MIPS follows?

**Choices:**
- **A.** 320 MIPS
- **B.** 110.73 MIPS
- **C.** 5 MIPS
- **D.** 0.08 MIPS

**Correct Answer:** 110.73 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 110.73.

---

## Question 44

**Question:** Each processor delivers 7 MIPS; parallel fraction is 0.98 on 32 processors. What effective MIPS follows?

**Choices:**
- **A.** 7 MIPS
- **B.** 0.22 MIPS
- **C.** 138.27 MIPS
- **D.** 224 MIPS

**Correct Answer:** 138.27 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 138.27.

---

## Question 45

**Question:** Each processor delivers 6 MIPS; parallel fraction is 0.98 on 64 processors. What effective MIPS follows?

**Choices:**
- **A.** 0.09 MIPS
- **B.** 6 MIPS
- **C.** 384 MIPS
- **D.** 169.91 MIPS

**Correct Answer:** 169.91 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 169.91.

---

## Question 46

**Question:** Each processor delivers 8 MIPS; parallel fraction is 0.99 on 16 processors. What effective MIPS follows?

**Choices:**
- **A.** 111.3 MIPS
- **B.** 0.5 MIPS
- **C.** 128 MIPS
- **D.** 8 MIPS

**Correct Answer:** 111.3 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 111.3.

---

## Question 47

**Question:** Each processor delivers 9 MIPS; parallel fraction is 0.99 on 32 processors. What effective MIPS follows?

**Choices:**
- **A.** 288 MIPS
- **B.** 219.85 MIPS
- **C.** 9 MIPS
- **D.** 0.28 MIPS

**Correct Answer:** 219.85 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 219.85.

---

## Question 48

**Question:** Each processor delivers 10 MIPS; parallel fraction is 0.99 on 64 processors. What effective MIPS follows?

**Choices:**
- **A.** 10 MIPS
- **B.** 640 MIPS
- **C.** 392.64 MIPS
- **D.** 0.16 MIPS

**Correct Answer:** 392.64 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 392.64.

---

## Question 49

**Question:** Each processor delivers 4 MIPS; parallel fraction is 0.995 on 64 processors. What effective MIPS follows?

**Choices:**
- **A.** 0.06 MIPS
- **B.** 256 MIPS
- **C.** 4 MIPS
- **D.** 194.68 MIPS

**Correct Answer:** 194.68 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 194.68.

---

## Question 50

**Question:** Each processor delivers 3 MIPS; parallel fraction is 0.999 on 128 processors. What effective MIPS follows?

**Choices:**
- **A.** 340.73 MIPS
- **B.** 384 MIPS
- **C.** 3 MIPS
- **D.** 0.02 MIPS

**Correct Answer:** 340.73 MIPS

**Explanation:** Effective MIPS = x/[(1−α)+α/n] = 340.73.
