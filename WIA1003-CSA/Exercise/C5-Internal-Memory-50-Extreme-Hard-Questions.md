# Chapter 5 Internal Memory: 50 Extreme-Hard Questions

## Question 1

**Question:** Which storage element explains both DRAM density and its need for refresh?

**Choices:**
- **A.** A multi-transistor latch per bit
- **B.** A magnetic platter sector
- **C.** One capacitor and one transistor per bit
- **D.** A fuse array

**Correct Answer:** One capacitor and one transistor per bit

**Explanation:** The compact capacitor leaks charge, enabling density but requiring refresh.

---

## Question 2

**Question:** Why is SRAM normally faster but less dense than DRAM?

**Choices:**
- **A.** It erases only in blocks
- **B.** It stores bits as disk sectors
- **C.** It multiplexes no addresses
- **D.** Its stable latch avoids refresh but uses more transistors per bit

**Correct Answer:** Its stable latch avoids refresh but uses more transistors per bit

**Explanation:** The larger latch cell costs area but can be read without destructive capacitor sensing.

---

## Question 3

**Question:** True or false: Random-access semiconductor memory guarantees identical total program latency for every request.

**Choices:**
- **A.** False
- **B.** True

**Correct Answer:** False

**Explanation:** Random access describes the addressing method; queues, banks, rows, and timing still vary latency.

---

## Question 4

**Question:** Which ROM type is electrically programmable once by the user?

**Choices:**
- **A.** EEPROM
- **B.** PROM
- **C.** EPROM
- **D.** Mask ROM

**Correct Answer:** PROM

**Explanation:** PROM fuses or antifuses are programmed once after manufacture.

---

## Question 5

**Question:** Which device supports electrical erase and rewrite at individual-byte granularity?

**Choices:**
- **A.** EPROM
- **B.** Mask ROM
- **C.** EEPROM
- **D.** NAND flash

**Correct Answer:** EEPROM

**Explanation:** EEPROM can alter bytes electrically, unlike block-oriented flash.

---

## Question 6

**Question:** Why is NAND flash preferred for high-capacity storage?

**Choices:**
- **A.** It provides the fastest random code execution
- **B.** It needs no controller
- **C.** It erases individual bits
- **D.** Series cells provide high density and low cost per bit

**Correct Answer:** Series cells provide high density and low cost per bit

**Explanation:** NAND organization sacrifices random-read simplicity for dense storage.

---

## Question 7

**Question:** Why is NOR flash suitable for execute-in-place code?

**Choices:**
- **A.** It provides efficient random reads
- **B.** It is volatile
- **C.** It requires sequential page access only
- **D.** It stores bits in DRAM capacitors

**Correct Answer:** It provides efficient random reads

**Explanation:** NOR connects cells for direct addressing of code locations.

---

## Question 8

**Question:** A 4M × 4 DRAM has what total capacity?

**Choices:**
- **A.** 16 MB or 2 Mb
- **B.** 16 Mb or 2 MB
- **C.** 4 Mb or 4 MB
- **D.** 4 MB or 32 Mb

**Correct Answer:** 16 Mb or 2 MB

**Explanation:** Four million locations times 4 bits gives 16 Mbits = 2 Mbytes.

---

## Question 9

**Question:** How many address bits select one of 4M locations?

**Choices:**
- **A.** 20
- **B.** 24
- **C.** 22
- **D.** 16

**Correct Answer:** 22

**Explanation:** 4M = 4×2^20 = 2^22 locations.

---

## Question 10

**Question:** A 4M × 4 chip uses equal row and column fields. How many multiplexed address pins are needed?

**Choices:**
- **A.** 16
- **B.** 4
- **C.** 22
- **D.** 11

**Correct Answer:** 11

**Explanation:** The 22-bit address is supplied as an 11-bit row then an 11-bit column.

---

## Question 11

**Question:** What do RAS and CAS select?

**Choices:**
- **A.** Row address then column address
- **B.** Read action then cache action
- **C.** Refresh address then CPU status
- **D.** ROM array then SRAM array

**Correct Answer:** Row address then column address

**Explanation:** Address multiplexing sends row and column components at different times.

---

## Question 12

**Question:** How many ×4 chips operate in parallel to provide a 32-bit word?

**Choices:**
- **A.** 16
- **B.** 8
- **C.** 4
- **D.** 32

**Correct Answer:** 8

**Explanation:** Each chip contributes 4 bits, so 32/4 = 8 chips.

---

## Question 13

**Question:** Four banks of 256 KiB form a 1 MiB module. How many bank-select bits are required?

**Choices:**
- **A.** 4
- **B.** 1
- **C.** 2
- **D.** 8

**Correct Answer:** 2

**Explanation:** Two bits select one of 2^2 = 4 banks.

---

## Question 14

**Question:** Which fault is most likely repaired by replacing a failed memory chip?

**Choices:**
- **A.** Refresh cycle
- **B.** CAS latency
- **C.** Soft error
- **D.** Hard error

**Correct Answer:** Hard error

**Explanation:** A hard error is a persistent physical defect.

---

## Question 15

**Question:** A cosmic ray flips one stored bit but later writes work normally. What occurred?

**Choices:**
- **A.** Soft error
- **B.** Wear leveling
- **C.** Address multiplexing
- **D.** Hard error

**Correct Answer:** Soft error

**Explanation:** A transient disturbance changes data without permanent device damage.

---

## Question 16

**Question:** What condition must Hamming check-bit count r satisfy for m data bits?

**Choices:**
- **A.** 2r = m
- **B.** 2^r ≥ m + r + 1
- **C.** r = m/8 always
- **D.** 2^m ≥ r + 1

**Correct Answer:** 2^r ≥ m + r + 1

**Explanation:** The syndrome needs codes for every bit position plus the no-error state.

---

## Question 17

**Question:** How many Hamming check bits are required for 8 data bits?

**Choices:**
- **A.** 5
- **B.** 3
- **C.** 4
- **D.** 8

**Correct Answer:** 4

**Explanation:** r = 3 fails 8 ≥ 12, while r = 4 satisfies 16 ≥ 13.

---

## Question 18

**Question:** Which positions contain Hamming check bits?

**Choices:**
- **A.** Prime numbers
- **B.** The final r positions
- **C.** Odd positions only
- **D.** Powers of two

**Correct Answer:** Powers of two

**Explanation:** Positions 1, 2, 4, 8, and so on are reserved for checks.

---

## Question 19

**Question:** A nonzero Hamming syndrome equals 6. What does it identify?

**Choices:**
- **A.** Bit position 6 as erroneous
- **B.** Six different errors
- **C.** No error
- **D.** Check bit 6 only

**Correct Answer:** Bit position 6 as erroneous

**Explanation:** The binary syndrome indexes the single erroneous bit.

---

## Question 20

**Question:** What can ordinary single-error-correcting Hamming code guarantee?

**Choices:**
- **A.** Eliminate check bits
- **B.** Correct one flipped bit
- **C.** Prevent all hard faults
- **D.** Correct every two-bit error

**Correct Answer:** Correct one flipped bit

**Explanation:** Its syndrome uniquely identifies one erroneous position.

---

## Question 21

**Question:** Why does SDRAM outperform asynchronous DRAM on bursts?

**Choices:**
- **A.** It never refreshes
- **B.** It uses SRAM cells
- **C.** Clock synchronization and burst mode reduce repeated setup overhead
- **D.** It erases blocks before reading

**Correct Answer:** Clock synchronization and burst mode reduce repeated setup overhead

**Explanation:** After initial access, sequential units are clocked out efficiently.

---

## Question 22

**Question:** CAS latency is 3. What does the number describe?

**Choices:**
- **A.** Three address pins
- **B.** Three bytes per burst
- **C.** Three refreshes per row
- **D.** Three clock cycles from read command to first data

**Correct Answer:** Three clock cycles from read command to first data

**Explanation:** CAS latency is a cycle count, not an absolute time by itself.

---

## Question 23

**Question:** Why is DDR called double data rate?

**Choices:**
- **A.** It transfers on both clock edges
- **B.** It doubles address width
- **C.** It contains two RAM modules
- **D.** It stores two bits per capacitor

**Correct Answer:** It transfers on both clock edges

**Explanation:** Rising and falling edges both carry transfers.

---

## Question 24

**Question:** DDR4 retained an 8-bit prefetch but improved concurrency mainly through what feature?

**Choices:**
- **A.** Single-bank operation
- **B.** Bank groups
- **C.** Magnetic junctions
- **D.** Byte erase

**Correct Answer:** Bank groups

**Explanation:** Independent bank groups allow more parallel internal activity.

---

## Question 25

**Question:** What does an SDRAM mode register configure?

**Choices:**
- **A.** Hamming fault location
- **B.** Physical chip capacity
- **C.** Burst length and latency behavior
- **D.** Permanent ROM contents

**Correct Answer:** Burst length and latency behavior

**Explanation:** The mode register controls operating parameters rather than user data.

---

## Question 26

**Question:** A burst length of 8 on a 64-bit bus transfers how much payload?

**Choices:**
- **A.** 32 bytes
- **B.** 8 bytes
- **C.** 512 bytes
- **D.** 64 bytes

**Correct Answer:** 64 bytes

**Explanation:** Eight transfers of 8 bytes each yield 64 bytes.

---

## Question 27

**Question:** A 64-bit DDR channel runs from an 800 MHz clock. What ideal transfer rate results?

**Choices:**
- **A.** 12.8 GB/s
- **B.** 800 MB/s
- **C.** 51.2 GB/s
- **D.** 6.4 GB/s

**Correct Answer:** 12.8 GB/s

**Explanation:** DDR gives 1.6 GT/s, and 1.6 billion×8 bytes = 12.8 GB/s.

---

## Question 28

**Question:** DDR CAS latency is 16 cycles at an 800 MHz clock. What is first-data latency?

**Choices:**
- **A.** 1.25 ns
- **B.** 20 ns
- **C.** 10 ns
- **D.** 16 ns

**Correct Answer:** 20 ns

**Explanation:** Sixteen cycles divided by 800 MHz equals 20 ns.

---

## Question 29

**Question:** A 256K × 8 chip stores how many bytes?

**Choices:**
- **A.** 2 MiB
- **B.** 32 KiB
- **C.** 256 KiB
- **D.** 256 bytes

**Correct Answer:** 256 KiB

**Explanation:** Each address stores one byte, so 256K locations store 256 KiB.

---

## Question 30

**Question:** How many 256K × 8 chips are needed for 1 MiB at the same 8-bit width?

**Choices:**
- **A.** 2
- **B.** 16
- **C.** 8
- **D.** 4

**Correct Answer:** 4

**Explanation:** Capacity scales by four while width stays 8 bits.

---

## Question 31

**Question:** A module needs 1M × 32 using 1M × 8 chips. How many chips are required?

**Choices:**
- **A.** 4
- **B.** 8
- **C.** 16
- **D.** 32

**Correct Answer:** 4

**Explanation:** Four chips in parallel provide 4×8 = 32 data bits.

---

## Question 32

**Question:** A module needs 4M × 16 using 1M × 8 chips. How many chips are required?

**Choices:**
- **A.** 2
- **B.** 8
- **C.** 4
- **D.** 16

**Correct Answer:** 8

**Explanation:** Two chips provide width 16, and four such banks provide 4M depth.

---

## Question 33

**Question:** A memory has 26 data bits per protected word. What minimum r satisfies Hamming SEC?

**Choices:**
- **A.** 6
- **B.** 4
- **C.** 5
- **D.** 8

**Correct Answer:** 5

**Explanation:** 2^5 = 32 equals 26 + 5 + 1.

---

## Question 34

**Question:** A memory has 57 data bits per protected word. What minimum r satisfies Hamming SEC?

**Choices:**
- **A.** 7
- **B.** 5
- **C.** 8
- **D.** 6

**Correct Answer:** 6

**Explanation:** 2^6 = 64 equals 57 + 6 + 1.

---

## Question 35

**Question:** Eight check bits protect 64 data bits. What storage overhead is added?

**Choices:**
- **A.** 12.5%
- **B.** 8%
- **C.** 11.1%
- **D.** 64%

**Correct Answer:** 12.5%

**Explanation:** Check overhead relative to data is 8/64 = 12.5%.

---

## Question 36

**Question:** Why can a DRAM read be described as destructive?

**Choices:**
- **A.** The address pins melt
- **B.** Sensing disturbs the tiny capacitor charge, so data must be restored
- **C.** RAS disables refresh permanently
- **D.** Every read erases the whole chip

**Correct Answer:** Sensing disturbs the tiny capacitor charge, so data must be restored

**Explanation:** The sense amplifier detects and then rewrites the cell state.

---

## Question 37

**Question:** What is the main benefit of multiplexing DRAM row and column addresses?

**Choices:**
- **A.** More bits per capacitor
- **B.** No refresh
- **C.** Fewer package address pins
- **D.** Byte-level flash erase

**Correct Answer:** Fewer package address pins

**Explanation:** The same pins carry row and column bits at different times.

---

## Question 38

**Question:** If refresh occupies 2% of DRAM cycles, what maximum fraction remains for normal access?

**Choices:**
- **A.** 2%
- **B.** 102%
- **C.** 50%
- **D.** 98%

**Correct Answer:** 98%

**Explanation:** Ignoring other overhead, 100% − 2% = 98% remains.

---

## Question 39

**Question:** Why is SRAM commonly used for cache rather than main memory?

**Choices:**
- **A.** Its speed justifies cost at small capacity
- **B.** It is nonvolatile
- **C.** It has higher density than DRAM
- **D.** It needs block erase

**Correct Answer:** Its speed justifies cost at small capacity

**Explanation:** SRAM is fast but too costly and area-hungry for large main memory.

---

## Question 40

**Question:** Why is DRAM commonly used for main memory rather than cache?

**Choices:**
- **A.** It is always faster than SRAM
- **B.** Its density and cost support large capacity
- **C.** It is nonvolatile
- **D.** It performs byte erase

**Correct Answer:** Its density and cost support large capacity

**Explanation:** Compact cells provide economical capacity despite refresh and longer latency.

---

## Question 41

**Question:** Which flash operation changes a cell from crystalline low resistance to amorphous high resistance in PCRAM?

**Choices:**
- **A.** Refresh
- **B.** Read
- **C.** RESET
- **D.** SET

**Correct Answer:** RESET

**Explanation:** RESET melts and quenches material into the amorphous high-resistance state.

---

## Question 42

**Question:** Which PCRAM operation forms the crystalline low-resistance state?

**Choices:**
- **A.** TRIM
- **B.** RESET
- **C.** CAS
- **D.** SET

**Correct Answer:** SET

**Explanation:** SET heats the material to crystallize it.

---

## Question 43

**Question:** What stores a bit in STT-RAM?

**Choices:**
- **A.** Relative magnetic orientation in an MTJ
- **B.** A blown PROM fuse only
- **C.** A pit on an optical disc
- **D.** Charge in a DRAM capacitor

**Correct Answer:** Relative magnetic orientation in an MTJ

**Explanation:** Parallel and antiparallel magnetic layers produce different resistance states.

---

## Question 44

**Question:** What physical mechanism characterizes ReRAM?

**Choices:**
- **A.** Refreshing a capacitor
- **B.** Switching resistance through conductive-path formation and rupture
- **C.** Rotating a disk platter
- **D.** Reading a fuse mask

**Correct Answer:** Switching resistance through conductive-path formation and rupture

**Explanation:** ReRAM encodes data as high and low resistance states.

---

## Question 45

**Question:** Which emerging memory is most directly associated with phase change?

**Choices:**
- **A.** STT-RAM
- **B.** SRAM
- **C.** PCRAM
- **D.** Mask ROM

**Correct Answer:** PCRAM

**Explanation:** PCRAM switches material between crystalline and amorphous phases.

---

## Question 46

**Question:** A 16 Mb chip is incorrectly advertised as 16 MB. By what factor is the byte capacity overstated?

**Choices:**
- **A.** 2
- **B.** No overstatement
- **C.** 16
- **D.** 8

**Correct Answer:** 8

**Explanation:** Sixteen megabits equal only 2 megabytes.

---

## Question 47

**Question:** A burst begins at word 1000 with length 4. Which sequential words are transferred?

**Choices:**
- **A.** 1000, 1001, 1002, 1003
- **B.** 1000, 1004, 1008, 1012
- **C.** 999, 1000, 1001, 1002
- **D.** 1001, 1002, 1003, 1004

**Correct Answer:** 1000, 1001, 1002, 1003

**Explanation:** The starting word counts as the first item in the four-word burst.

---

## Question 48

**Question:** A memory controller shortens refresh below the safe interval. What failure becomes likely?

**Choices:**
- **A.** SRAM becomes nonvolatile
- **B.** DRAM charge decays and bits change
- **C.** CAS latency becomes zero
- **D.** ROM gains byte erase

**Correct Answer:** DRAM charge decays and bits change

**Explanation:** Insufficient refresh lets capacitor charge leak beyond reliable sensing levels.

---

## Question 49

**Question:** A design requires nonvolatile random reads for firmware and dense bulk storage. Which pairing best fits?

**Choices:**
- **A.** DRAM for both
- **B.** SRAM for firmware and PROM for bulk storage
- **C.** NOR for firmware and NAND for bulk storage
- **D.** NAND for firmware and SRAM for bulk storage

**Correct Answer:** NOR for firmware and NAND for bulk storage

**Explanation:** NOR favors random code reads; NAND favors density and sequential storage.

---

## Question 50

**Question:** A SEC code corrects a bit, but repeated reads show the same physical location failing. How should the event be classified?

**Choices:**
- **A.** Normal refresh
- **B.** A harmless soft error only
- **C.** CAS latency variation
- **D.** A hard error masked temporarily by ECC

**Correct Answer:** A hard error masked temporarily by ECC

**Explanation:** Persistence at one location indicates a physical fault even if ECC corrects each read.
