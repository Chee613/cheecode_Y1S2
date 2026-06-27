# Chapter 4 Cache Calculation: Extreme Practice Set

Based on your **Chapter 4 cache memory notes** and **Tutorial 4**. Tutorial 4 covers direct mapping address breakdown, cache line/set calculation, replacement policies, write-through/write-back, average memory access time, and the two-level cache formula.  
Your Chapter 4 note also explains set-associative mapping using `m = v × k` and `i = j mod v`, plus replacement algorithms and line-size effects.  

---

## Progress Tracker

**Done:**
Cache mapping, address breakdown, replacement policies, write policy, AMAT, two-level cache.

**Today:**
Hard cache calculation question bank.

**Left:**
You attempt them first. Then we can solve one by one like exam training.

---

# Formula Box You Must Use

```text
Cache capacity = number of lines × line size

Number of lines = cache capacity / line size

Direct mapping:
i = j mod m

Set-associative:
m = v × k
i = j mod v

Offset bits = log2(block size)

Direct mapping:
Address = [Tag][Line][Offset]

Associative mapping:
Address = [Tag][Offset]

Set-associative mapping:
Address = [Tag][Set][Offset]

AMAT:
Ta = H × hit time + (1 - H) × miss time

Two-level cache from Tutorial 4:
Ta = (Tc1 × H1) + (Tc2 × (H2 - H1)) + (Tm × (1 - H2))
```

---

# Extreme Question 1: Direct Mapping Binary Address Trap

A computer has:

```text
Main memory: byte-addressable
Address size: 20 bits
Cache size: 4 KB
Line size: 16 bytes
Mapping: direct mapped
```

Answer all:

1. How many cache lines are there?
2. How many offset bits?
3. How many line bits?
4. How many tag bits?
5. Divide the address format into `[Tag][Line][Offset]`.
6. For each address below, find:

   * block number
   * cache line number
   * tag
   * byte offset

Addresses:

```text
A1 = 0001 0010 1100 1010 1111
A2 = 1111 0010 1100 1010 1111
A3 = 0001 0010 1100 1011 0000
A4 = 0001 0010 1101 1010 1111
```

7. Which addresses definitely map to the same cache line?
8. Which addresses are in the same memory block?
9. If cache starts empty and access sequence is:

```text
A1, A2, A1, A3, A4, A1
```

find hit/miss for each access.

---

# Extreme Question 2: Hex Address Breakdown

A system has:

```text
32-bit byte address
Cache size = 64 KB
Line size = 64 bytes
Direct mapped cache
```

Addresses:

```text
0x0000A13C
0x0001A13C
0x0000A17F
0x0000B13C
0xFFFFA13C
```

Find for each address:

1. Tag bits, line bits, offset bits.
2. Tag value in hexadecimal.
3. Line number in hexadecimal and decimal.
4. Offset in hexadecimal and decimal.
5. Which addresses conflict in direct mapping?
6. Which addresses belong to the same cache block?
7. If the cache is initially empty, trace this sequence:

```text
0x0000A13C
0x0000A17F
0x0001A13C
0x0000A13C
0xFFFFA13C
0x0000A17F
```

Find total hits, misses, and hit ratio.

---

# Extreme Question 3: Direct Mapping with Word-Addressable Memory

This is a trick question.

A machine has:

```text
Main memory: word-addressable
Word size: 4 bytes
Address size: 16 bits
Cache size: 2 KB
Line size: 8 words
Mapping: direct mapped
```

Answer:

1. How many bytes are in one line?
2. How many words are in one line?
3. Since the memory is word-addressable, how many offset bits are needed?
4. How many cache lines?
5. How many line bits?
6. How many tag bits?
7. Address format?
8. For word address:

```text
1011 0101 1110 1011
```

find tag, line, and word offset.
9. Explain why the answer would be different if the memory were byte-addressable.

---

# Extreme Question 4: Set-Associative Calculation Nightmare

A cache has:

```text
Address size: 36 bits
Cache capacity: 512 KB
Line size: 128 bytes
Associativity: 8-way set associative
```

Find:

1. Number of cache lines.
2. Number of sets.
3. Offset bits.
4. Set bits.
5. Tag bits.
6. Address format.
7. For address:

```text
0x123456789
```

find:

* tag
* set index
* offset

8. Which cache set does main memory block `987654` map to?
9. If two blocks map to the same set, can they both exist at the same time?
10. What is the maximum number of blocks from the same set that can exist at the same time?

---

# Extreme Question 5: 4-Way Set Associative LRU Trace

A cache has:

```text
Address size: 16 bits
Cache size: 256 bytes
Line size: 16 bytes
4-way set associative
Replacement policy: LRU
Initially empty
```

Access sequence in hexadecimal:

```text
0x0000
0x0010
0x0020
0x0030
0x0040
0x0000
0x0050
0x0010
0x0060
0x0020
0x0070
0x0000
```

Answer:

1. Number of lines.
2. Number of sets.
3. Offset bits.
4. Set bits.
5. Tag bits.
6. For every access, find:

   * block number
   * set number
   * tag
   * hit or miss
   * if miss and replacement happens, which tag is evicted
7. Final cache content for each set.
8. Total hits.
9. Total misses.
10. Hit ratio.

---

# Extreme Question 6: Same Trace, Compare LRU vs FIFO

Use the same cache as Question 5:

```text
Cache size: 256 bytes
Line size: 16 bytes
4-way set associative
```

But now compare two replacement policies:

```text
LRU
FIFO
```

Access sequence:

```text
0x0000
0x0040
0x0080
0x00C0
0x0000
0x0100
0x0040
0x0140
0x0080
0x0180
0x0000
```

Answer:

1. Do all addresses map to the same set? Prove it.
2. Trace using LRU.
3. Trace using FIFO.
4. Which policy gives more hits?
5. Explain why FIFO may evict a recently used block.
6. Explain why LRU may perform better here.

---

# Extreme Question 7: Fully Associative Cache with LFU Tie-Breaker

A fully associative cache has:

```text
Cache size: 64 bytes
Line size: 8 bytes
Replacement policy: LFU
Tie-breaker: LRU
Initially empty
Address size: 16 bits
```

Access sequence:

```text
0x0000
0x0008
0x0010
0x0018
0x0000
0x0008
0x0020
0x0028
0x0010
0x0030
0x0000
0x0038
```

Answer:

1. How many cache lines?
2. What is the address format for fully associative mapping?
3. For every access, find block number and tag.
4. Trace hit/miss.
5. Track frequency count for every block.
6. When LFU ties happen, apply LRU.
7. Final cache content.
8. Total hits, misses, hit ratio.

---

# Extreme Question 8: AMAT with Critical Word First

A direct-mapped cache has:

```text
Hit time = 3 ns
Line size = 64 bytes
Word size = 4 bytes
Hit ratio = 0.92
Main memory first-word access = 80 ns
Each following word = 6 ns
```

Case A: Cache waits for the whole line, then re-executes cache access.

Case B: Critical word first is used. CPU can continue as soon as the requested word arrives. Assume requested word arrives first.

Answer:

1. Words per line.
2. Miss time for Case A.
3. AMAT for Case A.
4. Miss time for Case B.
5. AMAT for Case B.
6. How much faster is Case B?
7. Why does critical word first not reduce the full block transfer time, but still improves CPU waiting time?

---

# Extreme Question 9: Find the Required Hit Ratio

A cache has:

```text
Hit time = 2 ns
Line size = 32 bytes
Word size = 4 bytes
Main memory first-word access = 60 ns
Each remaining word = 4 ns
Cache waits for full line, then re-executes cache access.
```

Question:

What minimum hit ratio is required so that:

```text
Average memory access time ≤ 6 ns
```

Answer:

1. Words per line.
2. Miss time.
3. Set up the AMAT inequality.
4. Solve for hit ratio `H`.
5. Is `H = 0.90` enough?
6. Is `H = 0.95` enough?

---

# Extreme Question 10: Line Size Optimization

A cache has:

```text
Cache hit time = 2.5 ns
Word size = 4 bytes
Main memory first-word time = 50 ns
Each later word = 5 ns
Cache waits for full line, then re-executes hit
```

Three possible line sizes:

| Line size | Hit ratio |
| --------: | --------: |
|  32 bytes |      0.93 |
|  64 bytes |      0.95 |
| 128 bytes |      0.97 |
| 256 bytes |     0.975 |

For each line size:

1. Find words per line.
2. Find miss time.
3. Find AMAT.
4. Which line size is best?
5. Explain why the largest line size may not be best even though it has the highest hit ratio.

This is a harder version of Tutorial 4 Question 7, which compares 64-byte and 128-byte line sizes. 

---

# Extreme Question 11: Two-Level Cache Reverse Engineering

A system has:

```text
Tc1 = 1 ns
Tc2 = 8 ns
Tm  = 100 ns
H1  = 0.90
H2  = unknown combined L1/L2 hit ratio
```

Tutorial 4 gives the two-level formula:

```text
Ta = (Tc1 × H1) + (Tc2 × (H2 - H1)) + (Tm × (1 - H2))
```



Answer:

1. Write the formula using the given values.
2. Find `H2` if target average access time is:

```text
Ta = 4 ns
```

3. Is the required `H2` realistic?
4. What happens to `Ta` if `H2 = 0.98`?
5. What happens to `Ta` if `H2 = 0.95`?
6. Why is `H2 - H1` used instead of just `H2`?

---

# Extreme Question 12: Two-Level Cache with Local L2 Hit Ratio

This is out-of-box because it uses a different formula style.

A system has:

```text
L1 hit time = 1 ns
L2 access time after L1 miss = 7 ns
Main memory time after L2 miss = 90 ns
L1 hit ratio = 0.88
Local L2 hit ratio = 0.75
```

Use sequential formula:

```text
AMAT = L1 time + L1 miss rate × (L2 time + L2 miss rate × memory time)
```

Answer:

1. L1 miss rate.
2. L2 miss rate.
3. AMAT.
4. Convert the local L2 hit ratio into combined L1/L2 hit ratio.
5. Now try using Tutorial 4 weighted formula.
6. Do both methods give the same result if definitions are handled correctly?
7. Explain the difference between:

   * local L2 hit ratio
   * combined L1/L2 hit ratio

---

# Extreme Question 13: Dirty Bit and Write-Back Traffic

A 2-way set-associative cache has:

```text
Cache size = 128 bytes
Line size = 16 bytes
Address size = 12 bits
Replacement = LRU
Write policy = write-back
Write miss policy = write-allocate
Initially empty
```

Access sequence:

```text
R 0x000
W 0x040
W 0x080
R 0x000
W 0x0C0
R 0x040
W 0x100
R 0x080
```

Answer:

1. Number of lines.
2. Number of sets.
3. Offset bits, set bits, tag bits.
4. For every access:

   * read/write
   * tag
   * set
   * hit/miss
   * dirty bit after access
   * whether eviction happens
   * whether memory write-back happens
5. How many memory block reads occur?
6. How many memory block write-backs occur?
7. Final cache contents.
8. Which cache lines are dirty at the end?

This connects to Tutorial 4’s write-back explanation: write-back updates cache first and main memory later when a modified block is swapped out. 

---

# Extreme Question 14: Write-Through vs Write-Back Memory Traffic

A cache has:

```text
Line size = 32 bytes
Write-through policy: every write updates main memory
Write-back policy: dirty block written only when evicted
Write-allocate for both cases
```

Access sequence:

```text
W A
W A
W A
W B
W C
W D
W A
```

Assume:

```text
Cache can hold only 2 blocks.
Fully associative.
Replacement policy = LRU.
A, B, C, D are different memory blocks.
```

Answer:

1. Trace the sequence using write-through.
2. Count number of main memory writes.
3. Trace the sequence using write-back.
4. Count number of main memory write-backs.
5. Which policy creates less memory traffic?
6. In what situation could write-through be easier to manage?
7. Why can write-back make main memory temporarily stale?

---

# Extreme Question 15: Cache Conflict Attack Pattern

A direct-mapped cache has:

```text
Cache size = 1 KB
Line size = 32 bytes
Address size = 20 bits
```

A program repeatedly accesses:

```text
0x00000
0x00400
0x00800
0x00C00
0x00000
0x00400
0x00800
0x00C00
```

Answer:

1. Number of cache lines.
2. Offset bits.
3. Line bits.
4. Tag bits.
5. Find line number for each address.
6. Explain why this access pattern is bad for direct mapping.
7. Hit/miss trace from empty cache.
8. Hit ratio.
9. Would a 4-way set-associative cache with the same capacity and line size improve this trace?
10. Prove your answer by calculating number of sets and mapping the blocks.

---

# Extreme Question 16: Block Boundary Trap

A byte-addressable system has:

```text
Line size = 32 bytes
```

For each address, find the full address range of the block containing it:

```text
0x00000000
0x0000001F
0x00000020
0x0000003A
0x0000ABCD
0xFFFF_FFFF
```

Answer:

1. Block start address.
2. Block end address.
3. Offset inside block.
4. Block number.

Hint:

```text
Block start = address with offset bits cleared
Block end = block start + line size - 1
```

This is a harder version of Tutorial 4 Question 3(c), where an 8-byte block containing a given address must be found. 

---

# Extreme Question 17: Cache Capacity Including Metadata

A cache has:

```text
Data capacity = 32 KB
Line size = 64 bytes
Address size = 32 bits
Mapping = direct mapped
Each line has:
1 valid bit
1 dirty bit
Tag bits
Data block
```

Answer:

1. Number of lines.
2. Offset bits.
3. Line bits.
4. Tag bits.
5. Metadata bits per line.
6. Data bits per line.
7. Total data storage bits.
8. Total metadata bits.
9. Total physical cache storage in bits.
10. Percentage overhead caused by valid, dirty, and tag bits.

This is out-of-box because many students forget that real cache stores tag and control bits, not only data.

---

# Extreme Question 18: Mixed Mapping Comparison

A system has:

```text
Address size = 24 bits
Cache data capacity = 16 KB
Line size = 32 bytes
```

Compare these three organizations:

```text
A. Direct mapped
B. Fully associative
C. 4-way set associative
```

For each organization, find:

1. Number of lines.
2. Offset bits.
3. Line bits or set bits.
4. Tag bits.
5. Number of tag comparisons per access.
6. Which has simplest hardware?
7. Which has greatest flexibility?
8. Which is the compromise?
9. Which one is most likely to suffer conflict misses?
10. Which one needs replacement policy?

---

# Extreme Question 19: Multi-Level Cache with Inclusion

A CPU has:

```text
L1 cache line size = 32 bytes
L2 cache line size = 64 bytes
Inclusive policy
```

Assume L2 evicts the 64-byte block:

```text
0x00001000 to 0x0000103F
```

Answer:

1. Which L1 32-byte blocks must be invalidated?
2. Why?
3. What would happen under noninclusive policy?
4. What would happen under exclusive policy when a block is promoted from L2 to L1?
5. Explain how this relates to inclusion policy.

Your Chapter 4 note explains that inclusive policy may require corresponding L1 blocks to be evicted when an L2 block is evicted, while noninclusive policy may allow L1 to keep parts of a recently evicted L2 block. 

---

# Extreme Question 20: Design Your Own Best Cache

You are designing cache for a workload.

Workload behavior:

```text
70% sequential array access
20% repeated access to a small loop
10% random pointer chasing
```

You can choose:

```text
Line size: 16, 32, 64, 128 bytes
Mapping: direct, 2-way, 4-way, fully associative
Write policy: write-through or write-back
Replacement: LRU, FIFO, LFU
```

Answer:

1. Which line size would you choose? Why?
2. Which mapping would you choose? Why?
3. Which replacement policy would you choose? Why?
4. Which write policy would you choose? Why?
5. What trade-off are you making?
6. Which workload part benefits from spatial locality?
7. Which workload part benefits from temporal locality?
8. Which workload part is hardest for cache?
9. What calculation would you need to prove your design is best?

This question is “out of the box” because it is not only calculation. It tests whether you understand why cache design choices exist.

---

# Answer Key: Extreme Cache Questions

## Q1 Answer: Direct Mapping Binary Address Trap

Given:

```text
Address size = 20 bits
Cache size = 4 KB = 4096 bytes
Line size = 16 bytes
Direct mapped
```

```text
Number of lines = 4096 / 16 = 256 lines
Offset bits = log2(16) = 4 bits
Line bits = log2(256) = 8 bits
Tag bits = 20 - 8 - 4 = 8 bits
```

Address format:

```text
[ Tag ][ Line ][ Offset ]
  8 bits 8 bits 4 bits
```

| Address                       | Block no. | Tag | Line | Offset |
| ----------------------------- | --------: | --: | ---: | -----: |
| A1 `0001 0010 1100 1010 1111` |      4810 |  18 |  202 |     15 |
| A2 `1111 0010 1100 1010 1111` |     62154 | 242 |  202 |     15 |
| A3 `0001 0010 1100 1011 0000` |      4811 |  18 |  203 |      0 |
| A4 `0001 0010 1101 1010 1111` |      4826 |  18 |  218 |     15 |

Same cache line:

```text
A1 and A2 map to line 202.
```

Same memory block:

```text
None among A1, A2, A3, A4.
A1 is offset 15 of its block.
A3 is offset 0 of the next block.
```

Access sequence:

```text
A1, A2, A1, A3, A4, A1
```

| Access | Result | Reason                         |
| ------ | ------ | ------------------------------ |
| A1     | Miss   | cache empty                    |
| A2     | Miss   | same line as A1, different tag |
| A1     | Miss   | A2 replaced A1                 |
| A3     | Miss   | new line                       |
| A4     | Miss   | new line                       |
| A1     | Hit    | A1 still in line 202           |

```text
Hits = 1
Misses = 5
Hit ratio = 1/6 = 16.67%
```

---

## Q2 Answer: Hex Address Breakdown

Given:

```text
32-bit address
Cache size = 64 KB
Line size = 64 bytes
Direct mapped
```

```text
Number of lines = 64 KB / 64 = 1024 lines
Offset bits = log2(64) = 6 bits
Line bits = log2(1024) = 10 bits
Tag bits = 32 - 10 - 6 = 16 bits
```

Address format:

```text
[ Tag ][ Line ][ Offset ]
 16 bits 10 bits 6 bits
```

| Address      |  Tag hex | Line hex | Line dec | Offset hex | Offset dec |
| ------------ | -------: | -------: | -------: | ---------: | ---------: |
| `0x0000A13C` | `0x0000` |  `0x284` |      644 |     `0x3C` |         60 |
| `0x0001A13C` | `0x0001` |  `0x284` |      644 |     `0x3C` |         60 |
| `0x0000A17F` | `0x0000` |  `0x285` |      645 |     `0x3F` |         63 |
| `0x0000B13C` | `0x0000` |  `0x2C4` |      708 |     `0x3C` |         60 |
| `0xFFFFA13C` | `0xFFFF` |  `0x284` |      644 |     `0x3C` |         60 |

Conflict in direct mapping:

```text
0x0000A13C
0x0001A13C
0xFFFFA13C

All map to line 0x284 but have different tags.
```

Same cache block:

```text
None among the listed different addresses.
```

Trace:

```text
0x0000A13C  -> Miss
0x0000A17F  -> Miss
0x0001A13C  -> Miss
0x0000A13C  -> Miss
0xFFFFA13C  -> Miss
0x0000A17F  -> Hit
```

```text
Hits = 1
Misses = 5
Hit ratio = 1/6 = 16.67%
```

---

## Q3 Answer: Word-Addressable Memory Trap

Given:

```text
Memory is word-addressable
Word size = 4 bytes
Address size = 16 bits
Cache size = 2 KB
Line size = 8 words
Direct mapped
```

```text
Line size in bytes = 8 × 4 = 32 bytes
Number of cache lines = 2048 / 32 = 64 lines
```

Because memory is **word-addressable**, offset chooses word inside line:

```text
Offset bits = log2(8 words) = 3 bits
Line bits = log2(64) = 6 bits
Tag bits = 16 - 6 - 3 = 7 bits
```

Address format:

```text
[ Tag ][ Line ][ Word Offset ]
 7 bits 6 bits 3 bits
```

Address:

```text
1011 0101 1110 1011
```

Split:

```text
1011010 111101 011
```

So:

```text
Tag = 1011010
Line = 111101
Word offset = 011
```

If memory were byte-addressable, offset would be:

```text
32 bytes = 2^5
Offset = 5 bits
```

So byte-addressable format would be:

```text
[ Tag ][ Line ][ Byte Offset ]
 5 bits 6 bits 5 bits
```

---

## Q4 Answer: 8-Way Set Associative

Given:

```text
Address size = 36 bits
Cache = 512 KB
Line size = 128 bytes
8-way set associative
```

```text
Cache size = 512 × 1024 = 524288 bytes
Number of lines = 524288 / 128 = 4096 lines
Number of sets = 4096 / 8 = 512 sets
Offset bits = log2(128) = 7 bits
Set bits = log2(512) = 9 bits
Tag bits = 36 - 9 - 7 = 20 bits
```

Address format:

```text
[ Tag ][ Set ][ Offset ]
 20 bits 9 bits 7 bits
```

For address:

```text
0x123456789
```

Answer:

```text
Tag = 0x12345
Set index = 0x0CF = 207
Offset = 0x09 = 9
```

Block `987654` maps to:

```text
Set = 987654 mod 512 = 6
```

Can two blocks in the same set exist at the same time?

```text
Yes, up to 8 blocks, because it is 8-way.
```

---

## Q5 Answer: 4-Way Set Associative LRU Trace

Given:

```text
Cache size = 256 bytes
Line size = 16 bytes
4-way set associative
Address size = 16 bits
```

```text
Number of lines = 256 / 16 = 16
Number of sets = 16 / 4 = 4
Offset bits = log2(16) = 4
Set bits = log2(4) = 2
Tag bits = 16 - 2 - 4 = 10
```

| Access   | Block | Set | Tag | Hit/Miss | Evicted |
| -------- | ----: | --: | --: | -------- | ------- |
| `0x0000` |     0 |   0 |   0 | Miss     | -       |
| `0x0010` |     1 |   1 |   0 | Miss     | -       |
| `0x0020` |     2 |   2 |   0 | Miss     | -       |
| `0x0030` |     3 |   3 |   0 | Miss     | -       |
| `0x0040` |     4 |   0 |   1 | Miss     | -       |
| `0x0000` |     0 |   0 |   0 | Hit      | -       |
| `0x0050` |     5 |   1 |   1 | Miss     | -       |
| `0x0010` |     1 |   1 |   0 | Hit      | -       |
| `0x0060` |     6 |   2 |   1 | Miss     | -       |
| `0x0020` |     2 |   2 |   0 | Hit      | -       |
| `0x0070` |     7 |   3 |   1 | Miss     | -       |
| `0x0000` |     0 |   0 |   0 | Hit      | -       |

```text
Hits = 4
Misses = 8
Hit ratio = 4/12 = 33.33%
```

No eviction happens because no set stores more than 4 blocks.

---

## Q6 Answer: LRU vs FIFO

All addresses map to the same set.

Why?

```text
Line size = 16 bytes
Cache has 4 sets
Set = block number mod 4
```

The addresses are separated by `0x40 = 64 bytes`.

```text
64 / 16 = 4 blocks apart
```

So all block numbers differ by multiples of 4, meaning:

```text
block mod 4 = 0
```

### LRU result

```text
Hits = 1
Misses = 10
Hit ratio = 1/11 = 9.09%
```

### FIFO result

```text
Hits = 3
Misses = 8
Hit ratio = 3/11 = 27.27%
```

Important out-of-box lesson:

```text
FIFO performs better for this specific sequence.
LRU is usually better in many real programs, but not always.
```

---

## Q7 Answer: Fully Associative LFU

Given:

```text
Cache size = 64 bytes
Line size = 8 bytes
Fully associative
```

```text
Number of lines = 64 / 8 = 8
Offset bits = log2(8) = 3
Tag bits = 16 - 3 = 13
```

Address format:

```text
[ Tag ][ Offset ]
 13 bits 3 bits
```

Access blocks:

```text
0, 1, 2, 3, 0, 1, 4, 5, 2, 6, 0, 7
```

Trace:

```text
0 -> Miss
1 -> Miss
2 -> Miss
3 -> Miss
0 -> Hit
1 -> Hit
4 -> Miss
5 -> Miss
2 -> Hit
6 -> Miss
0 -> Hit
7 -> Miss
```

```text
Hits = 4
Misses = 8
Hit ratio = 4/12 = 33.33%
```

No eviction happens because exactly 8 unique blocks fit into 8 lines.

Final frequency counts:

| Block | Count |
| ----- | ----: |
| 0     |     3 |
| 1     |     2 |
| 2     |     2 |
| 3     |     1 |
| 4     |     1 |
| 5     |     1 |
| 6     |     1 |
| 7     |     1 |

---

## Q8 Answer: AMAT with Critical Word First

Given:

```text
Hit time = 3 ns
Line size = 64 bytes
Word size = 4 bytes
Hit ratio = 0.92
First word = 80 ns
Each following word = 6 ns
```

```text
Words per line = 64 / 4 = 16 words
```

### Case A: wait for whole line

```text
Miss time = 80 + (15 × 6) + 3
          = 80 + 90 + 3
          = 173 ns
```

```text
AMAT = (0.92 × 3) + (0.08 × 173)
     = 2.76 + 13.84
     = 16.60 ns
```

### Case B: critical word first

Requested word arrives first:

```text
Miss time = 80 ns
```

```text
AMAT = (0.92 × 3) + (0.08 × 80)
     = 2.76 + 6.40
     = 9.16 ns
```

Improvement:

```text
16.60 - 9.16 = 7.44 ns faster
```

Critical word first does not stop the full block from being transferred. It just lets the CPU continue earlier.

---

## Q9 Answer: Required Hit Ratio

Given:

```text
Hit time = 2 ns
Line size = 32 bytes
Word size = 4 bytes
First word = 60 ns
Each remaining word = 4 ns
Target AMAT ≤ 6 ns
```

```text
Words per line = 32 / 4 = 8
Miss time = 60 + (7 × 4) + 2
          = 60 + 28 + 2
          = 90 ns
```

Formula:

```text
AMAT = H × 2 + (1 - H) × 90
```

Require:

```text
2H + 90(1 - H) ≤ 6
2H + 90 - 90H ≤ 6
90 - 88H ≤ 6
-88H ≤ -84
H ≥ 84/88
H ≥ 0.9545
```

Answer:

```text
Minimum hit ratio = 95.45%
```

Check:

```text
H = 0.90 is not enough.
H = 0.95 is still not enough.
```

---

## Q10 Answer: Line Size Optimization

Given:

```text
Hit time = 2.5 ns
First word = 50 ns
Later word = 5 ns
Word size = 4 bytes
```

| Line size | Words/line | Hit ratio | Miss time |      AMAT |
| --------: | ---------: | --------: | --------: | --------: |
|  32 bytes |          8 |      0.93 |   87.5 ns |   8.45 ns |
|  64 bytes |         16 |      0.95 |  127.5 ns |   8.75 ns |
| 128 bytes |         32 |      0.97 |  207.5 ns |   8.65 ns |
| 256 bytes |         64 |     0.975 |  367.5 ns | 11.625 ns |

Best:

```text
32-byte line size, because AMAT = 8.45 ns is lowest.
```

Important lesson:

```text
Highest hit ratio does not always mean best performance.
Miss penalty also matters.
```

---

## Q11 Answer: Two-Level Cache Reverse Engineering

Given:

```text
Tc1 = 1 ns
Tc2 = 8 ns
Tm = 100 ns
H1 = 0.90
H2 = unknown
Ta = 4 ns
```

Formula:

```text
Ta = (Tc1 × H1) + (Tc2 × (H2 - H1)) + (Tm × (1 - H2))
```

Substitute:

```text
4 = (1 × 0.90) + (8 × (H2 - 0.90)) + (100 × (1 - H2))
```

Simplify:

```text
4 = 0.90 + 8H2 - 7.20 + 100 - 100H2
4 = 93.70 - 92H2
92H2 = 89.70
H2 = 0.975
```

Answer:

```text
Required H2 = 97.5%
```

If:

```text
H2 = 0.98
Ta = 3.54 ns
```

If:

```text
H2 = 0.95
Ta = 6.30 ns
```

Why use `H2 - H1`?

```text
Because H2 already includes L1 hits.
H2 - H1 means hits found only in L2.
```

---

## Q12 Answer: Local L2 Hit Ratio

Given:

```text
L1 time = 1 ns
L2 time = 7 ns
Memory time = 90 ns
L1 hit ratio = 0.88
Local L2 hit ratio = 0.75
```

```text
L1 miss rate = 1 - 0.88 = 0.12
L2 miss rate = 1 - 0.75 = 0.25
```

Sequential formula:

```text
AMAT = 1 + 0.12 × (7 + 0.25 × 90)
     = 1 + 0.12 × (7 + 22.5)
     = 1 + 0.12 × 29.5
     = 1 + 3.54
     = 4.54 ns
```

Combined L1/L2 hit ratio:

```text
H2 = H1 + (L1 miss rate × local L2 hit ratio)
H2 = 0.88 + (0.12 × 0.75)
H2 = 0.88 + 0.09
H2 = 0.97
```

Breakdown:

```text
L1 hit = 0.88
L2-only hit = 0.09
Main memory = 0.03
```

Weighted form:

```text
AMAT = 0.88(1) + 0.09(1 + 7) + 0.03(1 + 7 + 90)
     = 0.88 + 0.72 + 2.94
     = 4.54 ns
```

Both methods match if definitions are handled correctly.

---

## Q13 Answer: Dirty Bit and Write-Back Traffic

Given:

```text
Cache size = 128 bytes
Line size = 16 bytes
2-way set associative
Address size = 12 bits
Write-back
Write-allocate
LRU
```

```text
Number of lines = 128 / 16 = 8
Number of sets = 8 / 2 = 4
Offset bits = log2(16) = 4
Set bits = log2(4) = 2
Tag bits = 12 - 2 - 4 = 6
```

All addresses map to set 0.

| Access    | Tag | Set | Hit/Miss | Evicted     | Write-back? | Final inserted dirty? |
| --------- | --: | --: | -------- | ----------- | ----------- | --------------------- |
| `R 0x000` |   0 |   0 | Miss     | -           | No          | Clean                 |
| `W 0x040` |   1 |   0 | Miss     | -           | No          | Dirty                 |
| `W 0x080` |   2 |   0 | Miss     | tag 0 clean | No          | Dirty                 |
| `R 0x000` |   0 |   0 | Miss     | tag 1 dirty | Yes         | Clean                 |
| `W 0x0C0` |   3 |   0 | Miss     | tag 2 dirty | Yes         | Dirty                 |
| `R 0x040` |   1 |   0 | Miss     | tag 0 clean | No          | Clean                 |
| `W 0x100` |   4 |   0 | Miss     | tag 3 dirty | Yes         | Dirty                 |
| `R 0x080` |   2 |   0 | Miss     | tag 1 clean | No          | Clean                 |

```text
Memory block reads = 8
Memory write-backs = 3
```

Final cache content in set 0:

```text
Tag 4: dirty
Tag 2: clean
```

Dirty at end:

```text
Only tag 4 is dirty.
```

---

## Q14 Answer: Write-Through vs Write-Back Traffic

Sequence:

```text
W A, W A, W A, W B, W C, W D, W A
```

Cache:

```text
2 blocks
Fully associative
LRU
Write-allocate
```

### Write-through

Every write updates main memory.

```text
Main memory writes = 7
```

Trace:

```text
W A -> Miss
W A -> Hit
W A -> Hit
W B -> Miss
W C -> Miss, evict A
W D -> Miss, evict B
W A -> Miss, evict C
```

### Write-back

Only dirty evicted blocks are written back.

Trace:

```text
W A -> Miss, A dirty
W A -> Hit, A dirty
W A -> Hit, A dirty
W B -> Miss, B dirty
W C -> Miss, evict dirty A -> write-back
W D -> Miss, evict dirty B -> write-back
W A -> Miss, evict dirty C -> write-back
```

```text
Memory write-backs = 3
```

Conclusion:

```text
Write-back creates less write traffic here.
```

But write-through is easier to manage because main memory is always up to date.

---

## Q15 Answer: Cache Conflict Attack Pattern

Given:

```text
Cache size = 1 KB
Line size = 32 bytes
Address size = 20 bits
Direct mapped
```

```text
Number of lines = 1024 / 32 = 32
Offset bits = log2(32) = 5
Line bits = log2(32) = 5
Tag bits = 20 - 5 - 5 = 10
```

Addresses:

| Address   | Block | Line | Tag |
| --------- | ----: | ---: | --: |
| `0x00000` |     0 |    0 |   0 |
| `0x00400` |    32 |    0 |   1 |
| `0x00800` |    64 |    0 |   2 |
| `0x00C00` |    96 |    0 |   3 |

All map to line 0.

Trace:

```text
0x00000 -> Miss
0x00400 -> Miss
0x00800 -> Miss
0x00C00 -> Miss
0x00000 -> Miss
0x00400 -> Miss
0x00800 -> Miss
0x00C00 -> Miss
```

```text
Hits = 0
Misses = 8
Hit ratio = 0%
```

Would 4-way set associative help?

Same cache:

```text
Lines = 32
4-way means sets = 32 / 4 = 8 sets
Set = block mod 8
```

Blocks:

```text
0 mod 8 = 0
32 mod 8 = 0
64 mod 8 = 0
96 mod 8 = 0
```

All map to set 0, but set 0 has 4 ways.

Trace with 4-way:

```text
First 4 accesses = misses
Next 4 accesses = hits
```

```text
Hits = 4
Misses = 4
Hit ratio = 50%
```

So yes, 4-way set associative improves this pattern.

---

## Q16 Answer: Block Boundary Trap

Line size:

```text
32 bytes
Offset bits = 5
```

| Address      |  Block start |    Block end | Offset |    Block no. |
| ------------ | -----------: | -----------: | -----: | -----------: |
| `0x00000000` | `0x00000000` | `0x0000001F` |      0 |            0 |
| `0x0000001F` | `0x00000000` | `0x0000001F` |     31 |            0 |
| `0x00000020` | `0x00000020` | `0x0000003F` |      0 |            1 |
| `0x0000003A` | `0x00000020` | `0x0000003F` |     26 |            1 |
| `0x0000ABCD` | `0x0000ABC0` | `0x0000ABDF` |     13 |      `0x55E` |
| `0xFFFFFFFF` | `0xFFFFFFE0` | `0xFFFFFFFF` |     31 | `0x07FFFFFF` |

---

## Q17 Answer: Cache Capacity Including Metadata

Given:

```text
Data capacity = 32 KB
Line size = 64 bytes
Address size = 32 bits
Direct mapped
Valid bit = 1
Dirty bit = 1
```

```text
Number of lines = 32 KB / 64
                = 32768 / 64
                = 512 lines
```

```text
Offset bits = log2(64) = 6
Line bits = log2(512) = 9
Tag bits = 32 - 9 - 6 = 17
```

Metadata per line:

```text
Valid bit + dirty bit + tag bits
= 1 + 1 + 17
= 19 bits
```

Data bits per line:

```text
64 bytes × 8 = 512 bits
```

Total data bits:

```text
512 lines × 512 bits
= 262144 bits
```

Total metadata bits:

```text
512 × 19
= 9728 bits
```

Total physical cache storage:

```text
262144 + 9728
= 271872 bits
```

Metadata overhead relative to data:

```text
9728 / 262144 × 100%
= 3.71%
```

---

## Q18 Answer: Mixed Mapping Comparison

Given:

```text
Address size = 24 bits
Cache capacity = 16 KB
Line size = 32 bytes
```

```text
Number of lines = 16 KB / 32
                = 16384 / 32
                = 512 lines

Offset bits = log2(32) = 5
```

| Mapping               | Lines | Sets | Offset bits | Index/set bits | Tag bits | Tag comparisons |
| --------------------- | ----: | ---: | ----------: | -------------: | -------: | --------------: |
| Direct                |   512 |    - |           5 |    9 line bits |       10 |               1 |
| Fully associative     |   512 |    - |           5 |              0 |       19 |             512 |
| 4-way set associative |   512 |  128 |           5 |     7 set bits |       12 |               4 |

Answers:

```text
Simplest hardware = direct mapped
Greatest flexibility = fully associative
Compromise = 4-way set associative
Most conflict misses = direct mapped
Needs replacement policy = fully associative and set associative
```

Direct mapping has automatic replacement because each block has only one possible line.

---

## Q19 Answer: Multilevel Cache with Inclusion

Given:

```text
L1 line size = 32 bytes
L2 line size = 64 bytes
Inclusive policy
```

L2 evicts:

```text
0x00001000 to 0x0000103F
```

This contains two L1 blocks:

```text
L1 block 1: 0x00001000 to 0x0000101F
L1 block 2: 0x00001020 to 0x0000103F
```

Under inclusive policy:

```text
Both L1 blocks must be invalidated.
```

Why?

```text
Inclusive means anything in L1 must also exist in L2.
If L2 removes the block, L1 cannot keep it.
```

Under noninclusive policy:

```text
L1 may or may not keep the data depending on design.
There is no strict requirement.
```

Under exclusive policy:

```text
A block promoted from L2 to L1 is usually removed from L2.
The same block should not exist in both levels.
```

---

## Q20 Answer: Design Your Own Best Cache

Workload:

```text
70% sequential array access
20% repeated small loop
10% random pointer chasing
```

A reasonable design:

```text
Line size: 64 bytes
Mapping: 4-way set associative
Replacement: LRU
Write policy: write-back with write-allocate
```

Why 64-byte line?

```text
Sequential array access benefits from spatial locality.
64 bytes brings nearby array elements without making miss penalty too huge.
```

Why 4-way set associative?

```text
It reduces conflict misses better than direct mapping,
but is cheaper than fully associative.
```

Why LRU?

```text
The repeated small loop benefits from temporal locality.
LRU keeps recently used blocks.
```

Why write-back?

```text
If data is updated multiple times, write-back reduces main memory traffic.
```

Hardest workload part:

```text
Random pointer chasing
```

because random access has poor spatial locality and poor predictable temporal locality.

To prove the design is best, calculate:

```text
AMAT = hit time + miss rate × miss penalty
```

or compare miss rates and memory traffic using real traces.

---

