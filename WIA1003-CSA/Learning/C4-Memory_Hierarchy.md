# 9. Chapter 4: Memory Hierarchy

## 9.1 Principle of Locality

The **principle of locality** means memory references tend to cluster. Programs usually access a small region of memory repeatedly for a short time. The note explains that this happens because programs use loops, subroutines, sequential instruction execution, arrays, and tables. 

### Temporal locality

Same memory item is likely to be used again soon.

Example:

```c
for (i = 0; i < 100; i++) {
    sum = sum + i;
}
```

`sum` is reused many times.

### Spatial locality

Nearby memory addresses are likely to be used soon.

Example:

```c
A[0], A[1], A[2], A[3]
```

Array elements are stored near each other.

---

## 9.2 Memory Hierarchy

Memory hierarchy exists because memory design has three conflicting goals:

```text
How much?
How fast?
How expensive?
```

The note gives these trade-offs: faster access means higher cost per bit; greater capacity means smaller cost per bit; greater capacity usually means slower access time. 

Diagram:

```text
Fastest, smallest, most expensive

CPU Registers
L1 Cache
L2 Cache
L3 Cache
Main Memory
Secondary Storage

Slowest, largest, cheapest
```

As we go down the hierarchy:

```text
Cost per bit decreases
Capacity increases
Access time increases
CPU access frequency decreases
```

---

## 9.3 Cache Memory Basics

Cache is small, fast memory between CPU and main memory.

```text
CPU <-> Cache <-> Main Memory
```

The note says cache contains copies of portions of main memory. If the processor requests a word and it is in cache, it is delivered quickly. If not, a block is fetched from main memory into cache. 

### Cache hit

Requested data is found in cache.

### Cache miss

Requested data is not found in cache, so the block must be fetched from main memory.

---

## 9.4 Cache Terms

The note defines these cache terms: block, frame, line, tag, and line size. 

```text
Block = minimum unit of transfer between cache and main memory
Line = cache location that can hold one block
Tag = identifier showing which memory block is in the line
Line size = number of data bytes in one line
```

A cache line usually contains:

```text
+-------+-------+-------------+
| Valid | Tag   | Data block  |
+-------+-------+-------------+
```

---

## 9.5 Cache Read Operation

On a cache read:

```text
CPU gives address
Cache checks tag/index
If hit -> send data to CPU
If miss -> fetch block from main memory
```

The note also mentions **critical word first**, where the requested word is fetched first so the CPU can continue while the rest of the block is filled. 

---

## 9.6 Cache Mapping

Because cache has fewer lines than main memory has blocks, mapping decides where a memory block can go. The note summarizes three methods: direct mapped, fully associative, and set associative. 

### Direct mapping

Each main memory block maps to one unique cache line.

Formula:

```text
i = j mod m
```

Where:

```text
i = cache line number
j = main memory block number
m = number of cache lines
```

Address format:

```text
[ Tag ][ Line ][ Offset ]
```

### Associative mapping

A memory block can go into any cache line.

Address format:

```text
[ Tag ][ Offset ]
```

Main disadvantage: hardware must compare the tag with all cache lines.

### Set-associative mapping

A memory block maps to one set, but can go into any line inside that set.

Formula:

```text
m = v × k
i = j mod v
```

Where:

```text
m = total cache lines
v = number of sets
k = lines per set / ways
i = set number
j = memory block number
```

Address format:

```text
[ Tag ][ Set ][ Offset ]
```

---

## 9.7 Address Breakdown Rules

For cache address questions:

```text
Offset bits = log2(block size)
Line bits   = log2(number of cache lines)       direct mapping
Set bits    = log2(number of sets)              set-associative
Tag bits    = total address bits - other fields
```

Example from Tutorial 4:

```text
Main memory = 2^16 bytes
Block size = 8 bytes = 2^3
Cache lines = 32 = 2^5

Offset = 3 bits
Line = 5 bits
Tag = 16 - 5 - 3 = 8 bits
```

So:

```text
[ Tag ][ Line ][ Offset ]
  8      5        3
```

Tutorial 4 uses the same breakdown. 

---

## 9.8 Replacement Policies

Replacement policy decides which old block to remove when cache/set is full.

### LRU

Least Recently Used.

```text
Remove the block not used for the longest time.
```

### FIFO

First In First Out.

```text
Remove the block that entered cache first.
```

### LFU

Least Frequently Used.

```text
Remove the block with the fewest references.
```

Tutorial 4 asks for these three methods and defines them in this way. 

---

## 9.9 Write Policy

### Write-through

Every write updates both cache and main memory immediately.

```text
Cache = updated
Main memory = updated immediately
```

Advantage:

```text
Main memory is always valid.
```

Disadvantage:

```text
More memory traffic.
```

### Write-back

Write updates cache first. Main memory is updated later when the dirty block is replaced.

```text
Cache = updated
Dirty bit = 1
Main memory = updated later
```

Tutorial 4 explains that write-through immediately updates both cache and memory, while write-back updates cache first and may leave main memory invalid until the block is swapped out. 

### Dirty bit

```text
Dirty bit = 0 -> cache line matches main memory
Dirty bit = 1 -> cache line has been modified
```

---

## 9.10 Write Miss Alternatives

### Write allocate

On write miss:

```text
Bring block into cache first,
then write.
```

Usually paired with write-back.

### No write allocate

On write miss:

```text
Do not bring block into cache.
Write directly to main memory.
```

Usually paired with write-through.

---

## 9.11 Line Size Effect

Increasing line size can improve hit ratio because of spatial locality.

But too-large line size can hurt because:

```text
Fewer blocks fit in cache.
Extra words may not be useful.
Miss penalty increases.
```

Tutorial 4 Question 7:

For 64-byte line:

```text
Words per line = 64 / 4 = 16
Miss time = 50 + (15 × 5) + 2.5 = 127.5 ns
Average = (2.5 × 0.95) + (127.5 × 0.05)
        = 8.75 ns
```

For 128-byte line:

```text
Words per line = 128 / 4 = 32
Miss time = 50 + (31 × 5) + 2.5 = 207.5 ns
Average = (2.5 × 0.97) + (207.5 × 0.03)
        = 8.65 ns
```

So in that example, increasing line size improves average access time from `8.75 ns` to `8.65 ns`. 

---

## 9.12 Two-Level Cache Formula

Tutorial 4 defines:

```text
Tc1 = first-level cache access time
Tc2 = second-level cache access time
Tm  = main memory access time
H1  = first-level hit ratio
H2  = combined first/second-level hit ratio
```

Formula:

```text
Ta = (Tc1 × H1) + (Tc2 × (H2 - H1)) + (Tm × (1 - H2))
```



Meaning:

```text
H1        = hit in L1
H2 - H1   = hit in L2 only
1 - H2    = miss both caches, go to main memory
```

---

## 9.13 Unified vs Split Cache

### Unified cache

One cache stores both instructions and data.

Advantages:

```text
Higher hit rate for same size
Balances instruction/data load automatically
Only one cache design needed
```

### Split cache

Separate instruction cache and data cache.

```text
I-cache = instructions
D-cache = data
```

Advantage:

```text
Reduces contention between instruction fetch/decode and execution unit.
Important for pipelining.
```

The note says the trend is toward split L1 caches and unified higher-level caches. 

---

## 9.14 Inclusion Policy

### Inclusive

```text
If data is in L1, it is also in L2.
```

Advantage:

```text
Simplifies searching and cache coherence.
```

### Exclusive

```text
If data is in L1, it is not in L2.
```

Advantage:

```text
Avoids wasting cache capacity with duplicate copies.
```

Disadvantage:

```text
May need to search multiple cache levels during update/invalidation.
```

### Noninclusive

```text
Data in L1 may or may not be in L2.
```

The Chapter 4 note explains all three policies and contrasts their behavior during cache eviction and promotion.  

---

# 10. Final Chapter 4 Exam Checklist

You should now be able to answer:

1. What is the principle of locality?
2. Difference between temporal and spatial locality.
3. Why memory hierarchy is needed.
4. What is cache memory?
5. What is a cache hit and cache miss?
6. Difference between block, line, tag, and offset.
7. Direct mapping formula and address format.
8. Associative mapping address format.
9. Set-associative mapping formula and address format.
10. Why tag is stored in cache.
11. How to calculate tag/line/set/offset bits.
12. LRU vs FIFO vs LFU.
13. Write-through vs write-back.
14. Dirty bit meaning.
15. Write allocate vs no write allocate.
16. How line size affects performance.
17. Average memory access time calculation.
18. Two-level cache formula.
19. Unified vs split cache.
20. Inclusive vs exclusive vs noninclusive policy.

---

# 11. Final Mini Checkpoint

## Q1

Which cache design has separate instruction cache and data cache?

```text
Split cache
```

## Q2

Which inclusion policy guarantees that data in L1 is also in L2?

```text
Inclusive policy
```

## Q3

Which policy avoids duplicate data between L1 and L2?

```text
Exclusive policy
```

## Q4

Which policy says data may or may not be found in lower cache levels?

```text
Noninclusive policy
```

## Q5

What is the trend mentioned in the note?

```text
Split caches at L1, unified caches for higher levels.
```

---

Chapter 4 is complete.
