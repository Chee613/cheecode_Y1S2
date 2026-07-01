# Chapter 4 Memory Hierarchy: 50 Extreme-Hard Questions

## Question 1

**Question:** A 32 KiB direct-mapped cache uses 64-byte lines and 32-bit byte addresses. What is the tag size?

**Choices:**
- **A.** 15 bits
- **B.** 17 bits
- **C.** 9 bits
- **D.** 23 bits

**Correct Answer:** 17 bits

**Explanation:** There are 512 lines, so tag = 32 − 9 line bits − 6 offset bits = 17.

---

## Question 2

**Question:** The cache in Question 1 is changed to 2-way set associative at equal capacity. What address split results?

**Choices:**
- **A.** [16-bit tag][10-bit set][6-bit offset]
- **B.** [17-bit tag][9-bit set][6-bit offset]
- **C.** [18-bit tag][8-bit set][6-bit offset]
- **D.** [19-bit tag][7-bit set][6-bit offset]

**Correct Answer:** [18-bit tag][8-bit set][6-bit offset]

**Explanation:** Two ways give 256 sets, requiring 8 set bits and leaving 18 tag bits.

---

## Question 3

**Question:** A 16-byte line contains byte address 0x1234. What are its memory block number and offset?

**Choices:**
- **A.** Block 0x1234 and offset 0
- **B.** Block 0x124 and offset 0x3
- **C.** Block 0x12 and offset 0x34
- **D.** Block 0x123 and offset 0x4

**Correct Answer:** Block 0x123 and offset 0x4

**Explanation:** Division by 16 gives block 0x123 with remainder 0x4.

---

## Question 4

**Question:** In a direct cache with 64 lines, which line receives memory block 291?

**Choices:**
- **A.** 35
- **B.** 3
- **C.** 64
- **D.** 227

**Correct Answer:** 35

**Explanation:** Direct mapping uses 291 mod 64 = 35.

---

## Question 5

**Question:** A 4-way cache has 1024 total lines. Which set receives memory block 777?

**Choices:**
- **A.** Set 256
- **B.** Set 9
- **C.** Set 137
- **D.** Set 777

**Correct Answer:** Set 9

**Explanation:** There are 1024/4 = 256 sets, and 777 mod 256 = 9.

---

## Question 6

**Question:** A fully associative cache has 128 lines and 32-byte blocks under 32-bit addressing. What address fields are needed?

**Choices:**
- **A.** [32-bit tag]
- **B.** [20-bit tag][7-bit line][5-bit offset]
- **C.** [27-bit tag][5-bit offset]
- **D.** [25-bit tag][7-bit set]

**Correct Answer:** [27-bit tag][5-bit offset]

**Explanation:** Associative mapping has no line field; 5 offset bits leave 27 tag bits.

---

## Question 7

**Question:** A direct cache has four lines. Starting empty, blocks 0, 4, 0, 8 are accessed. What is the hit/miss sequence?

**Choices:**
- **A.** Hit, miss, miss, hit
- **B.** Miss, miss, hit, miss
- **C.** Miss, hit, hit, miss
- **D.** Miss, miss, miss, miss

**Correct Answer:** Miss, miss, miss, miss

**Explanation:** All blocks map to line 0 and repeatedly replace one another.

---

## Question 8

**Question:** One 2-way set starts empty and sees blocks A, B, A, C under LRU. Which block is evicted by C?

**Choices:**
- **A.** B
- **B.** Neither block
- **C.** C
- **D.** A

**Correct Answer:** B

**Explanation:** A was most recently reused, so B is least recently used.

---

## Question 9

**Question:** One 3-line fully associative cache sees A, B, C, A, D under FIFO. Which block is evicted?

**Choices:**
- **A.** B
- **B.** A
- **C.** D
- **D.** C

**Correct Answer:** A

**Explanation:** FIFO evicts the earliest inserted block even though A was recently referenced.

---

## Question 10

**Question:** A full cache contains A, B, C with access counts 9, 2, 2. Under pure LFU, what extra rule is required before inserting D?

**Choices:**
- **A.** Direct mapping
- **B.** A dirty bit for every byte
- **C.** A tie-break rule between B and C
- **D.** A larger offset field

**Correct Answer:** A tie-break rule between B and C

**Explanation:** Both B and C have the minimum frequency, so LFU alone is ambiguous.

---

## Question 11

**Question:** Which write policy keeps main memory current after every cache write?

**Choices:**
- **A.** Exclusive caching
- **B.** Write allocate
- **C.** Write-back
- **D.** Write-through

**Correct Answer:** Write-through

**Explanation:** Write-through sends each update to both cache and main memory.

---

## Question 12

**Question:** A clean write-back line is modified three times, then evicted. How many main-memory writes are required for those modifications?

**Choices:**
- **A.** 1
- **B.** 0
- **C.** 3
- **D.** 4

**Correct Answer:** 1

**Explanation:** The dirty line is written once on eviction, combining the three cache updates.

---

## Question 13

**Question:** Which pairing is common when stores are expected to reuse the written block soon?

**Choices:**
- **A.** Read-only with FIFO
- **B.** Write-back with write allocate
- **C.** Write-through with no write allocate only
- **D.** Exclusive cache with no tags

**Correct Answer:** Write-back with write allocate

**Explanation:** Write allocate fetches the block so later writes can hit, and write-back avoids immediate memory traffic.

---

## Question 14

**Question:** On a write miss under no-write-allocate, what happens?

**Choices:**
- **A.** The write is discarded
- **B.** The entire block must enter cache
- **C.** The value is written to lower memory without first loading the line
- **D.** The cache line is marked dirty without data

**Correct Answer:** The value is written to lower memory without first loading the line

**Explanation:** No-write-allocate bypasses cache allocation for the missed store.

---

## Question 15

**Question:** A dirty line is selected as a victim in a write-back cache. What must occur before replacement?

**Choices:**
- **A.** The requested block is discarded
- **B.** All cache lines are invalidated
- **C.** Its tag alone is copied to the CPU
- **D.** Its modified block must be copied to lower memory

**Correct Answer:** Its modified block must be copied to lower memory

**Explanation:** Dirty data exists only in the cache and would otherwise be lost.

---

## Question 16

**Question:** Hit time is 2.5 ns, hit ratio is 0.95, and complete miss time is 127.5 ns. Using the notes formula, what is average access time?

**Choices:**
- **A.** 8.75 ns
- **B.** 127.5 ns
- **C.** 9.00 ns
- **D.** 6.25 ns

**Correct Answer:** 8.75 ns

**Explanation:** 0.95(2.5) + 0.05(127.5) = 8.75 ns.

---

## Question 17

**Question:** A cache hit takes 1 ns. A miss takes 101 ns total and occurs 2% of the time. What is average access time?

**Choices:**
- **A.** 101 ns
- **B.** 3 ns
- **C.** 1.02 ns
- **D.** 2.02 ns

**Correct Answer:** 3 ns

**Explanation:** 0.98(1) + 0.02(101) = 3 ns.

---

## Question 18

**Question:** For L1 time 1 ns, L2 time 5 ns, memory time 80 ns, H1 = 0.90 and combined H2 = 0.98, what is Ta?

**Choices:**
- **A.** 8.5 ns
- **B.** 2.5 ns
- **C.** 2.9 ns
- **D.** 6.6 ns

**Correct Answer:** 2.9 ns

**Explanation:** Ta = 1(0.90) + 5(0.08) + 80(0.02) = 2.9 ns.

---

## Question 19

**Question:** If H1 = 0.92 and combined H2 = 0.97, what fraction hits in L2 only?

**Choices:**
- **A.** 0.97
- **B.** 0.03
- **C.** 0.92
- **D.** 0.05

**Correct Answer:** 0.05

**Explanation:** The L2-only fraction is H2 − H1 = 0.05.

---

## Question 20

**Question:** Doubling line size raises hit ratio but worsens average time. Which cause is most plausible?

**Choices:**
- **A.** Longer line-fill time outweighs fewer misses
- **B.** Offset bits disappear
- **C.** Temporal locality becomes impossible
- **D.** Tags no longer exist

**Correct Answer:** Longer line-fill time outweighs fewer misses

**Explanation:** Larger blocks cost more to transfer and can also increase pollution.

---

## Question 21

**Question:** Why can a split I-cache and D-cache sustain more accesses per cycle than a unified cache?

**Choices:**
- **A.** It eliminates all misses
- **B.** Instruction fetch and data access can proceed simultaneously
- **C.** It requires only one port
- **D.** It stores no tags

**Correct Answer:** Instruction fetch and data access can proceed simultaneously

**Explanation:** Separate structures reduce contention between instruction and data traffic.

---

## Question 22

**Question:** In an inclusive L1/L2 hierarchy, L2 evicts a block still present in L1. What action preserves inclusion?

**Choices:**
- **A.** Copy the tag into the PC
- **B.** Ignore the eviction
- **C.** Invalidate the L1 copy
- **D.** Mark only L2 dirty

**Correct Answer:** Invalidate the L1 copy

**Explanation:** Every L1 block must also exist in L2 under inclusion.

---

## Question 23

**Question:** What capacity advantage can an exclusive two-level hierarchy provide?

**Choices:**
- **A.** Tags become unnecessary
- **B.** L2 never stores data
- **C.** Every block appears in both levels
- **D.** L1 and L2 avoid duplicating the same blocks

**Correct Answer:** L1 and L2 avoid duplicating the same blocks

**Explanation:** Nonduplicated contents make combined effective capacity closer to L1 + L2.

---

## Question 24

**Question:** A loop repeatedly accesses one scalar variable. Which locality dominates?

**Choices:**
- **A.** Temporal locality
- **B.** Spatial locality only
- **C.** Instruction locality only
- **D.** No locality

**Correct Answer:** Temporal locality

**Explanation:** The same location is reused after short intervals.

---

## Question 25

**Question:** A program scans a contiguous array once. Which locality primarily benefits cache?

**Choices:**
- **A.** Temporal locality of each element
- **B.** Spatial locality
- **C.** No locality
- **D.** Control locality

**Correct Answer:** Spatial locality

**Explanation:** One fetched line supplies neighboring elements used soon afterward.

---

## Question 26

**Question:** A 64 KiB cache with 128-byte lines contains how many lines?

**Choices:**
- **A.** 256
- **B.** 1024
- **C.** 512
- **D.** 8192

**Correct Answer:** 512

**Explanation:** 64 KiB / 128 B = 512 lines.

---

## Question 27

**Question:** A 24-bit byte address uses 32-byte blocks in a direct cache with 256 lines. What is the tag size?

**Choices:**
- **A.** 19 bits
- **B.** 13 bits
- **C.** 8 bits
- **D.** 11 bits

**Correct Answer:** 11 bits

**Explanation:** Offset = 5 and line = 8, leaving 24 − 13 = 11 tag bits.

---

## Question 28

**Question:** For the cache in Question 27, which line receives address 0x00A3F4?

**Choices:**
- **A.** 31
- **B.** 20
- **C.** 63
- **D.** 244

**Correct Answer:** 31

**Explanation:** Block = floor(0xA3F4/32) = 0x51F, and 0x51F mod 256 = 31.

---

## Question 29

**Question:** Two byte addresses differ only in offset bits. What must be true?

**Choices:**
- **A.** They map to different sets
- **B.** They are in the same memory block
- **C.** One must miss
- **D.** Their tags differ

**Correct Answer:** They are in the same memory block

**Explanation:** Tag and index identify the same block; only the byte position changes.

---

## Question 30

**Question:** Two addresses have the same direct-cache line index but different tags. What happens when accessed alternately?

**Choices:**
- **A.** The offset field expands
- **B.** They always hit together
- **C.** They can cause conflict misses
- **D.** They share one memory block

**Correct Answer:** They can cause conflict misses

**Explanation:** Only one different-tag block can occupy that indexed line.

---

## Question 31

**Question:** A direct cache suffers heavy conflicts between two hot blocks. Which equal-capacity change most directly helps?

**Choices:**
- **A.** Change write-through to write-back only
- **B.** Use smaller tags
- **C.** Disable locality
- **D.** Increase associativity

**Correct Answer:** Increase associativity

**Explanation:** More ways let blocks with the same index coexist.

---

## Question 32

**Question:** A fully associative cache still misses after its first fill on a working set larger than cache capacity. What miss type dominates?

**Choices:**
- **A.** Capacity misses
- **B.** Conflict misses
- **C.** Write-through misses
- **D.** Compulsory misses only

**Correct Answer:** Capacity misses

**Explanation:** Associativity removes index conflicts but cannot hold an oversized working set.

---

## Question 33

**Question:** A block has never been loaded before. How is its first miss classified?

**Choices:**
- **A.** Coherence hit
- **B.** Compulsory miss
- **C.** Dirty miss
- **D.** Conflict miss

**Correct Answer:** Compulsory miss

**Explanation:** The first reference cannot hit because the block has not entered cache.

---

## Question 34

**Question:** An 8-way cache has 2048 lines. How many sets and set bits are there?

**Choices:**
- **A.** 2048 sets and 11 bits
- **B.** 128 sets and 7 bits
- **C.** 256 sets and 8 bits
- **D.** 16 sets and 4 bits

**Correct Answer:** 256 sets and 8 bits

**Explanation:** 2048/8 = 256 = 2^8 sets.

---

## Question 35

**Question:** A 36-bit address, 64-byte line, and 1024-set cache uses what tag size?

**Choices:**
- **A.** 10 bits
- **B.** 16 bits
- **C.** 26 bits
- **D.** 20 bits

**Correct Answer:** 20 bits

**Explanation:** Six offset plus ten set bits leave 36 − 16 = 20 tag bits.

---

## Question 36

**Question:** A cache contains 256 lines of 32 bytes each. What is its data capacity excluding tags?

**Choices:**
- **A.** 8 KiB
- **B.** 16 KiB
- **C.** 4 KiB
- **D.** 8192 KiB

**Correct Answer:** 8 KiB

**Explanation:** 256×32 = 8192 bytes = 8 KiB.

---

## Question 37

**Question:** A write-through cache performs 10 million stores/s and coalesces none. What lower-memory write rate must it support?

**Choices:**
- **A.** 1 million writes/s
- **B.** 10 million writes/s
- **C.** Zero writes/s
- **D.** 20 million writes/s

**Correct Answer:** 10 million writes/s

**Explanation:** Each cache store immediately generates one lower-memory write.

---

## Question 38

**Question:** A write-back cache evicts 200,000 lines/s and 30% are dirty. What writeback rate results?

**Choices:**
- **A.** 140,000 lines/s
- **B.** 200,000 lines/s
- **C.** 60,000 lines/s
- **D.** 6,000 lines/s

**Correct Answer:** 60,000 lines/s

**Explanation:** Only dirty victims write back: 0.30×200,000 = 60,000.

---

## Question 39

**Question:** A 64-byte line is filled over a bus carrying 16 bytes per transfer. How many data transfers are required?

**Choices:**
- **A.** 16
- **B.** 2
- **C.** 8
- **D.** 4

**Correct Answer:** 4

**Explanation:** The fill needs 64/16 = 4 transfers.

---

## Question 40

**Question:** A cache lookup compares four tags in parallel. What organization is implied at the indexed location?

**Choices:**
- **A.** 4-way set associative
- **B.** Direct mapped
- **C.** Write-through only
- **D.** Fully associative with four total bytes

**Correct Answer:** 4-way set associative

**Explanation:** Each indexed set offers four candidate lines whose tags are checked.

---

## Question 41

**Question:** Why does LRU become expensive at very high associativity?

**Choices:**
- **A.** It writes every hit to memory
- **B.** It must track a detailed recency order among many ways
- **C.** It removes all tag bits
- **D.** It cannot evict clean lines

**Correct Answer:** It must track a detailed recency order among many ways

**Explanation:** Exact ordering state and update logic grow rapidly with the number of ways.

---

## Question 42

**Question:** A workload alternates sequential scans of two arrays whose combined size fits cache. Which feature is most valuable?

**Choices:**
- **A.** A one-byte line
- **B.** No replacement policy
- **C.** Enough capacity plus spatial locality
- **D.** No address tags

**Correct Answer:** Enough capacity plus spatial locality

**Explanation:** Lines exploit neighboring elements, while capacity prevents the arrays from evicting each other.

---

## Question 43

**Question:** A cache has hit ratio 99% and 1 ns hits, but misses take 1001 ns total. What is average access time?

**Choices:**
- **A.** 1.01 ns
- **B.** 10.01 ns
- **C.** 1001 ns
- **D.** 11 ns

**Correct Answer:** 11 ns

**Explanation:** 0.99(1) + 0.01(1001) = 11 ns, showing that rare long misses dominate.

---

## Question 44

**Question:** A design cuts miss rate from 2% to 1% with unchanged 2 ns hit and 202 ns miss times. What is the speedup in average access time?

**Choices:**
- **A.** 1.50
- **B.** 2.00
- **C.** 1.02
- **D.** 1.98

**Correct Answer:** 1.50

**Explanation:** Old average is 6 ns and new average is 4 ns, so speedup is 6/4 = 1.5.

---

## Question 45

**Question:** In a set with ways [A,B], LRU order oldest→newest is A,B. Access A, then insert C. Which block leaves?

**Choices:**
- **A.** Neither
- **B.** B
- **C.** C
- **D.** A

**Correct Answer:** B

**Explanation:** Accessing A makes it newest, leaving B as the LRU victim.

---

## Question 46

**Question:** A direct cache has 8 lines. What repeating block stride guarantees the same line index?

**Choices:**
- **A.** A stride of 4 bytes always
- **B.** A stride of 7 blocks
- **C.** A stride of 8 blocks
- **D.** A stride of 1 byte

**Correct Answer:** A stride of 8 blocks

**Explanation:** Adding the line count leaves block number modulo 8 unchanged.

---

## Question 47

**Question:** A cache line is valid = 0 but its tag matches the requested address. Is the access a hit?

**Choices:**
- **A.** Only for writes
- **B.** Only under FIFO
- **C.** Yes, tag equality alone is sufficient
- **D.** No, validity is required

**Correct Answer:** No, validity is required

**Explanation:** An invalid line contains no usable cached block regardless of residual tag bits.

---

## Question 48

**Question:** Which metadata combination is minimally needed per write-back cache line?

**Choices:**
- **A.** Valid bit, tag, and dirty bit
- **B.** Only an offset
- **C.** RAS and CAS
- **D.** PC and IR

**Correct Answer:** Valid bit, tag, and dirty bit

**Explanation:** Validity identifies usable content, the tag identifies its block, and dirty records divergence from memory.

---

## Question 49

**Question:** A 2-way cache with 4 sets accesses blocks 0,4,8,0 starting empty under LRU. What is the final access result?

**Choices:**
- **A.** Unaddressable
- **B.** Miss
- **C.** Writeback
- **D.** Hit

**Correct Answer:** Miss

**Explanation:** All map to set 0; after 0,4,8, block 0 has been evicted before its reuse.

---

## Question 50

**Question:** Which single metric is insufficient to choose between two cache designs?

**Choices:**
- **A.** Execution time on the target workload
- **B.** Average memory access time
- **C.** Hit ratio alone
- **D.** Hit time combined with miss behavior

**Correct Answer:** Hit ratio alone

**Explanation:** A higher hit ratio may be defeated by slower hits or much more expensive line fills.
