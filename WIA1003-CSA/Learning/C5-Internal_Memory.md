# Chapter 5: Internal Memory

# 1. Chapter 5 Big Picture

Chapter 5 is about **internal memory**. The uploaded Chapter 5 slide sequence covers memory cell operation, semiconductor memory types, RAM, DRAM, SRAM, ROM, flash memory, DRAM organisation, refreshing, packaging, error correction, SDRAM, DDR SDRAM, and nonvolatile RAM technologies. 

Internal memory means memory that is directly used by the CPU while the computer is running.

```text
Internal Memory
│
├── Memory Cell Operation
├── Semiconductor Memory Types
├── RAM
│   ├── DRAM
│   └── SRAM
├── ROM
│   ├── PROM
│   ├── EPROM
│   ├── EEPROM
│   └── Flash Memory
├── DRAM Organisation
├── Refreshing
├── Packaging
├── Error Correction
├── SDRAM
├── DDR SDRAM
└── Nonvolatile RAM Technologies
    ├── STT-RAM
    ├── PCRAM
    └── ReRAM
```

---

# 2. Memory Cell Operation

## What it means

A **memory cell** is the smallest storage unit in memory.

```text
1 memory cell usually stores 1 bit.
1 bit = 0 or 1.
```

A memory cell must support three basic actions:

```text
1. Select
2. Read
3. Write
```

## Why we need it

A computer stores everything as bits:

```text
numbers
letters
instructions
images
programs
```

So the computer needs tiny circuits that can store `0` or `1`.

## How it works

Simple memory cell idea:

```text
Address line ──► selects the memory cell
Control line ──► tells read or write
Data line    ◄─► carries the bit
```

Text diagram:

```text
        Address / Select
              │
              ▼
        ┌───────────┐
Data ◄─►│ Memory    │
        │ Cell      │
        └───────────┘
              ▲
              │
        Read / Write control
```

## Common mistakes

```text
Wrong: 1 memory cell = 1 byte
Correct: 1 memory cell usually = 1 bit

Wrong: Read means put data into memory
Correct: Read means get data from memory

Wrong: Write means get data from memory
Correct: Write means put data into memory
```

---

# 3. Semiconductor Memory

## What it means

**Semiconductor memory** is memory made using semiconductor electronic circuits.

Examples:

```text
RAM
ROM
cache
flash memory
```

Tutorial 5 says semiconductor memory is made using semiconductor material, is usually used as internal memory such as RAM, ROM, and cache, supports random access, may be volatile or nonvolatile, and has fast access speed compared with external storage. 

## Why we need it

The CPU needs fast memory nearby.

External storage such as hard disk or SSD is much slower than internal memory.

```text
CPU needs data quickly
        │
        ▼
Internal semiconductor memory is used
```

## Key properties

```text
- Made using semiconductor material
- Used as internal memory
- Supports random access
- Can be volatile or nonvolatile
- Faster than external storage
```

## Random access meaning

Random access means any location can be accessed directly.

```text
Address 100 can be accessed directly.
Address 5000 can be accessed directly.
Address 2 can be accessed directly.
```

It does **not** mean the data is random.

---

# 4. RAM

## What it means

RAM stands for:

```text
Random Access Memory
```

RAM is read/write memory used while programs are running.

## Why we need RAM

When you open a program, the program must be loaded from storage into RAM so the CPU can use it quickly.

```text
SSD / hard disk
      │
      ▼
RAM
      │
      ▼
CPU
```

## How it works

The CPU sends an address to RAM.

```text
CPU sends address
        │
        ▼
RAM selects location
        │
        ▼
RAM reads or writes data
```

## Volatile memory

Most RAM is volatile.

```text
Volatile = data is lost when power is off.
```

Example:

```text
You open a document.
It is loaded into RAM.
If power is suddenly off and not saved,
the RAM data disappears.
```

---

# 5. DRAM

## What it means

DRAM stands for:

```text
Dynamic Random Access Memory
```

DRAM stores data using electrical charge in a capacitor. Tutorial 5 says DRAM is considered analog-like because it stores data as electrical charge in a capacitor, and the charge gradually leaks away, so DRAM must be refreshed. 

## Why we need DRAM

DRAM is used as main memory because it is:

```text
cheap
dense
large capacity
```

## How DRAM stores bits

```text
Charged capacitor    = 1
Discharged capacitor = 0
```

Simple DRAM cell:

```text
Word line
    │
    ▼
Transistor ─── Capacitor
                  │
                  ▼
              stores charge
```

## Why DRAM needs refresh

A capacitor leaks charge over time.

```text
At first:
stored 1 = strong charge

After some time:
charge becomes weaker

Too late:
may be read wrongly
```

So DRAM must be refreshed.

```text
Refresh = restore the charge before data is lost.
```

## Common mistakes

```text
Wrong: DRAM keeps data forever
Correct: DRAM is volatile

Wrong: DRAM does not need refresh
Correct: DRAM needs refresh

Wrong: DRAM is used for cache
Correct: DRAM is mainly used for main memory
```

---

# 6. SRAM

## What it means

SRAM stands for:

```text
Static Random Access Memory
```

SRAM stores data using flip-flop circuits. Tutorial 5 says SRAM is considered digital because it uses flip-flop circuits, which have two stable states representing `0` and `1`, so SRAM does not need refreshing as long as power is supplied. 

## Why we need SRAM

SRAM is very fast, so it is used for cache memory.

```text
CPU
 │
 ▼
Cache memory using SRAM
 │
 ▼
Main memory using DRAM
```

## How SRAM stores data

A flip-flop has two stable states:

```text
State 0 = stores 0
State 1 = stores 1
```

## Important point

SRAM does not need refresh, but it is still volatile.

```text
Power ON  -> SRAM keeps data
Power OFF -> SRAM loses data
```

## Common mistakes

```text
Wrong: SRAM means synchronous RAM
Correct: SRAM means static RAM

Wrong: SRAM is nonvolatile
Correct: SRAM is volatile

Wrong: SRAM is cheaper than DRAM
Correct: SRAM is more expensive than DRAM
```

---

# 7. SRAM vs DRAM

Tutorial 5 compares SRAM and DRAM by storage element, refresh requirement, speed, cost, density, capacity, and typical use. 

| Feature         | SRAM           | DRAM        |
| --------------- | -------------- | ----------- |
| Full name       | Static RAM     | Dynamic RAM |
| Storage element | Flip-flop      | Capacitor   |
| Refresh needed? | No             | Yes         |
| Speed           | Faster         | Slower      |
| Cost            | More expensive | Cheaper     |
| Density         | Lower          | Higher      |
| Capacity        | Smaller        | Larger      |
| Typical use     | Cache memory   | Main memory |
| Volatile?       | Yes            | Yes         |

## Why DRAM has larger capacity

Tutorial 5 explains that DRAM has a simpler cell structure, usually one transistor and one capacitor, while SRAM usually uses several transistors, commonly six. Therefore, DRAM cells are smaller, so more cells fit into the same chip area. 

```text
Smaller cell
    │
    ▼
More cells per chip
    │
    ▼
Higher density
    │
    ▼
Larger capacity
```

## Exam sentence

```text
SRAM is faster but expensive, so it is used for cache.
DRAM is slower but cheaper and denser, so it is used for main memory.
```

---

# 8. ROM

## What it means

ROM stands for:

```text
Read Only Memory
```

ROM is memory that is mainly read during normal operation.

## Why we need ROM

When a computer first turns on, RAM is empty.

The CPU needs startup instructions from somewhere.

```text
Power ON
   │
   ▼
CPU starts
   │
   ▼
CPU reads firmware / BIOS from ROM
```

## ROM is usually nonvolatile

```text
Nonvolatile = keeps data even when power is off.
```

## Applications of ROM

Tutorial 5 lists ROM applications as firmware, BIOS, microcontroller programs, lookup tables, and system startup instructions. 

```text
- Firmware
- BIOS
- Microcontroller programs
- Lookup tables
- System startup instructions
```

---

# 9. Types of ROM

## Mask ROM

Mask ROM is programmed during manufacturing.

```text
Programmed at factory
Cannot normally be changed
Good for mass production
```

## PROM

PROM stands for:

```text
Programmable Read Only Memory
```

It can be programmed once.

```text
Blank at first
User/programmer writes it once
Cannot normally erase it
```

## EPROM

EPROM stands for:

```text
Erasable Programmable Read Only Memory
```

Tutorial 5 says EPROM is erased using ultraviolet light and usually must be removed from the system to erase. 

```text
Erase method: ultraviolet light
Main feature: usually removed from system to erase
```

## EEPROM

EEPROM stands for:

```text
Electrically Erasable Programmable Read Only Memory
```

Tutorial 5 says EEPROM uses electrical signals and can erase and rewrite individual bytes. 

```text
Erase method: electrical signals
Main feature: individual bytes can be erased/rewrite
```

## Flash Memory

Flash memory is electrically erasable and nonvolatile.

Tutorial 5 says flash memory uses electrical signals, erases data in blocks, and is faster and denser than EEPROM. 

```text
Erase method: electrical signals
Main feature: block erase
```

---

# 10. EPROM vs EEPROM vs Flash

| Type   | Erase method       | Main feature                                 |
| ------ | ------------------ | -------------------------------------------- |
| EPROM  | Ultraviolet light  | Usually removed from system to erase         |
| EEPROM | Electrical signals | Can erase/rewrite individual bytes           |
| Flash  | Electrical signals | Erases blocks, faster and denser than EEPROM |

## Memory trick

```text
EPROM  -> UV erase
EEPROM -> Electrical byte erase
Flash  -> Electrical block erase
```

---

# 11. Flash Memory Operation

## What it means

Flash memory is a type of semiconductor memory that is nonvolatile.

The Chapter 5 slide notes say flash memory is used for both internal and external memory applications. It is intermediate between EPROM and EEPROM in cost and functionality, uses electrical erasing like EEPROM, can erase blocks rather than the whole chip, does not provide byte-level erasure, and uses one transistor per bit for high density. 

## Why flash memory is useful

Flash memory keeps data without power.

```text
Power OFF
   │
   ▼
Flash memory still keeps data
```

This makes it useful for:

```text
USB drives
memory cards
SSD
firmware storage
embedded systems
```

## Floating gate idea

The slide notes explain that a flash cell adds a second gate called a **floating gate**. Initially, the cell represents binary `1`. When electrons become trapped on the floating gate, they remain even if power is disconnected, and the cell represents binary `0`. Applying voltage in the opposite direction removes electrons and returns the cell to binary `1`. 

Simple version:

```text
No trapped electrons  -> binary 1
Trapped electrons     -> binary 0
```

Diagram:

```text
Normal transistor:
Gate controls current flow

Flash cell:
Control gate
Floating gate  <- stores trapped electrons
Source / Drain
```

---

# 12. Figure 6.18: Flash Memory Structures

The Chapter 5 notes say there are two distinctive types of flash memory: **NOR** and **NAND**. In NOR flash, cells are connected in parallel to bit lines and can be read/write/erased individually. NAND flash uses transistor arrays with 16 or 32 transistors in series. 

## Word line and bit line

```text
Word line = selects a memory cell/transistor
Bit line  = carries the data signal
```

Simple idea:

```text
Word line chooses the cell.
Bit line carries the result.
```

---

## 12.1 NOR Flash Structure

### What it means

NOR flash cells are connected in parallel to the bit line.

```text
NOR flash idea:

Bit line
  │
  ├── Cell 0
  ├── Cell 1
  ├── Cell 2
  ├── Cell 3
  └── Cell 4
```

### Why NOR is useful

NOR flash provides high-speed random access. The notes say it can read and write specific locations and retrieve a single byte. 

So NOR is good for:

```text
firmware
program code
microcontroller memory
embedded systems
```

### How it works

If a selected memory cell is turned on by the corresponding word line, the bit line goes low. This is similar to a NOR logic gate. 

```text
Select word line
      │
      ▼
Selected memory cell affects bit line
      │
      ▼
Circuit reads 0 or 1
```

---

## 12.2 NAND Flash Structure

### What it means

NAND flash cells are connected in series.

```text
NAND flash idea:

Bit line
  │
 Cell 0
  │
 Cell 1
  │
 Cell 2
  │
 Cell 3
  │
Ground
```

### Why NAND is useful

NAND flash has higher bit density and greater write speed than NOR, but it reads and writes in blocks/pages rather than by random byte access. 

So NAND is good for:

```text
USB flash drives
memory cards
SSDs
large file storage
```

The notes say NAND is better suited for external memory such as USB flash drives, memory cards, and SSDs. 

### How it works

The bit line goes low only if all corresponding word-line transistors are turned on. This is similar to a NAND logic gate. 

---

# 13. NOR vs NAND Flash

| Feature            | NOR Flash                  | NAND Flash            |
| ------------------ | -------------------------- | --------------------- |
| Cell connection    | Parallel                   | Series                |
| Basic access style | Bit/specific location      | Block/page            |
| Random access      | Strong                     | Weak                  |
| Code execution     | Good                       | Not ideal             |
| File storage       | Not ideal                  | Good                  |
| Density            | Lower                      | Higher                |
| Write speed        | Lower                      | Higher                |
| Cost per bit       | Higher                     | Lower                 |
| Typical use        | Firmware, embedded systems | SSD, USB, memory card |

## Exam sentence

```text
NOR flash is better for code execution because it supports fast random access.
NAND flash is better for large storage because it is denser, cheaper per bit, and has better write speed.
```

## Common mistakes

```text
Wrong: NOR and NAND flash are the same.
Correct: NOR and NAND have different structures and uses.

Wrong: NAND is best for executing firmware directly.
Correct: NOR is better for direct code execution.

Wrong: NOR is usually used for SSD storage.
Correct: NAND is commonly used for SSDs.
```

---

# 14. Figure 6.19: Kiviat Graphs for Flash Memory

## What it means

A **Kiviat graph** is also called a radar chart or spider chart.

It compares many features at the same time.

Figure 6.19 compares NOR and NAND flash using characteristics such as:

```text
cost per bit
file storage use
code execution
capacity
write speed
read speed
active power
standby power
```

The slide notes say the exact quantitative values may change year by year, but the relative differences between NOR and NAND have remained stable. 

## How to read it

Do not read it as “bigger shape is always better.”

Each axis has its own meaning.

Example:

```text
Cost per bit:
Low is better.

Code execution:
Easy is better.

Capacity:
High is better.
```

## NOR profile

NOR is strong for:

```text
code execution
random access
single-byte access
read access to specific locations
```

## NAND profile

NAND is strong for:

```text
file storage
capacity
write speed
bit density
lower cost per bit
```

## Memory trick

```text
NOR  = Code
NAND = Storage
```

---

# 15. DRAM Chip Organisation

The Chapter 5 slides include a section called **Typical 16 Mb DRAM (4M × 4)** and **Organisation in detail**. 

## What `4M × 4` means

```text
4M × 4
```

means:

```text
4M addressable locations
Each location stores 4 bits
```

Total capacity:

```text
4M × 4 bits = 16M bits = 16 Mb
```

Convert to bytes:

```text
16 Mb ÷ 8 = 2 MB
```

Important:

```text
Mb = megabits
MB = megabytes
```

## Address bits

```text
4M = 4 × 2^20
   = 2^2 × 2^20
   = 2^22 locations
```

So we need:

```text
22 address bits
```

because:

```text
2^22 = 4M
```

---

# 16. Row and Column Addressing

DRAM is organised like a 2D array.

```text
          Columns
        0  1  2  3
Row 0   □  □  □  □
Row 1   □  □  □  □
Row 2   □  □  □  □
```

To select one cell:

```text
1. Select row
2. Select column
3. Read/write data
```

For `4M × 4`:

```text
4M locations = 2^22
```

This can be split as:

```text
2^11 rows × 2^11 columns = 2^22 locations
```

So:

```text
Row bits = 11
Column bits = 11
```

---

# 17. Address Multiplexing

## What it means

Address multiplexing means using the same address pins twice.

```text
First use  -> row address
Second use -> column address
```

## Why we need it

Without multiplexing:

```text
Need 22 address pins
```

With multiplexing:

```text
Use 11 pins for row first
Use same 11 pins for column later
```

This reduces chip pin count.

## RAS and CAS

```text
RAS = Row Address Strobe
CAS = Column Address Strobe
```

Memory trick:

```text
RAS starts with R -> Row
CAS starts with C -> Column
```

---

# 18. Refreshing

The Chapter 5 slides include **Refreshing** after DRAM organisation. 

## What it means

Refreshing means restoring charge in DRAM cells.

```text
DRAM cell stores charge.
Charge leaks over time.
Refresh restores charge.
```

## Why it is needed

Without refresh:

```text
Stored 1 becomes weak.
Weak charge may be read wrongly as 0.
```

## How it works

Refresh is often done row by row.

```text
Refresh Row 0
Refresh Row 1
Refresh Row 2
...
Repeat
```

## Common mistake

```text
Wrong: Refresh means saving data to SSD.
Correct: Refresh means restoring capacitor charge inside DRAM.
```

---

# 19. Packaging and Memory Modules

The Chapter 5 slides include **Packaging**, **256kByte Module Organisation**, and **1MByte Module Organisation**. 

## What packaging means

A memory chip may not provide enough data width or capacity by itself.

So several chips are combined into a memory module.

Example:

```text
One chip outputs 4 bits.
System needs 32-bit data bus.

32 ÷ 4 = 8 chips needed.
```

Diagram:

```text
Address ──┬── Chip 0 -> 4 bits
          ├── Chip 1 -> 4 bits
          ├── Chip 2 -> 4 bits
          ├── Chip 3 -> 4 bits
          ├── Chip 4 -> 4 bits
          ├── Chip 5 -> 4 bits
          ├── Chip 6 -> 4 bits
          └── Chip 7 -> 4 bits

Total = 32 bits
```

---

# 20. 256 KB Module Organisation

```text
256 KB = 256 × 1024 bytes
       = 262,144 bytes
```

In bits:

```text
262,144 × 8 = 2,097,152 bits
             = 2 Mb
```

If each chip is:

```text
256K × 1
```

Then eight chips give:

```text
256K × 8 = 256K bytes = 256 KB
```

---

# 21. 1 MB Module Organisation

```text
1 MB = 1024 KB
```

One way to build 1 MB:

```text
4 × 256 KB = 1024 KB = 1 MB
```

Bank selection:

```text
00 -> Bank 0
01 -> Bank 1
10 -> Bank 2
11 -> Bank 3
```

For 4 banks:

```text
4 banks = 2^2
Need 2 bank-select bits
```

---

# 22. Memory Errors

The Chapter 5 slides include **Error Correction** and **Error Correcting Code Function**, while Tutorial 5 asks about hard and soft errors.  

A memory error means a stored bit becomes wrong.

Example:

```text
Correct: 11000010
Wrong:   11001010
             ↑
          bit error
```

## Hard Error

Tutorial 5 says hard errors are permanent physical faults in memory hardware. 

```text
Hard error = permanent fault
```

Example:

```text
A memory cell is damaged and always reads 0.
```

## Soft Error

Tutorial 5 says soft errors are temporary errors caused by events such as electrical noise or radiation. 

```text
Soft error = temporary disturbance
```

Examples:

```text
electrical noise
radiation
random charge disturbance
```

---

# 23. Error Detection vs Error Correction

```text
Error detection:
Tells us something is wrong.

Error correction:
Finds the wrong bit and fixes it.
```

## ECC

ECC stands for:

```text
Error Correcting Code
```

ECC stores:

```text
Data bits + check bits
```

During write:

```text
Data
 │
 ▼
Generate check bits
 │
 ▼
Store data + check bits
```

During read:

```text
Read data + check bits
 │
 ▼
Check pattern
 │
 ├── no error
 ├── correct error
 └── report serious error
```

---

# 24. Hamming Code

Tutorial 5 asks for the Hamming code check bits for the 8-bit data word `11000010`. 

## Formula

```text
2^r ≥ m + r + 1
```

where:

```text
m = number of data bits
r = number of check bits
```

For the data word:

```text
11000010
```

we have:

```text
m = 8
```

Try `r = 3`:

```text
2^3 ≥ 8 + 3 + 1
8 ≥ 12  false
```

Try `r = 4`:

```text
2^4 ≥ 8 + 4 + 1
16 ≥ 13 true
```

So:

```text
r = 4
```

## Check bit positions

Check bits go in positions:

```text
1, 2, 4, 8
```

Data bits go in the remaining positions:

```text
3, 5, 6, 7, 9, 10, 11, 12
```

## Place the data

Data:

```text
D1 D2 D3 D4 D5 D6 D7 D8
1  1  0  0  0  0  1  0
```

Layout:

```text
Position:  1  2  3  4  5  6  7  8  9  10 11 12
Type:      C1 C2 D1 C4 D2 D3 D4 C8 D5 D6 D7 D8
Value:     ?  ?  1  ?  1  0  0  ?  0  0  1  0
```

## Check groups

```text
C1 checks: 1, 3, 5, 7, 9, 11
C2 checks: 2, 3, 6, 7, 10, 11
C4 checks: 4, 5, 6, 7, 12
C8 checks: 8, 9, 10, 11, 12
```

Using even parity:

```text
C1 = 1
C2 = 0
C4 = 1
C8 = 1
```

So:

```text
Check bits = 1011
```

Final stored Hamming code:

```text
101110010010
```

This matches the Tutorial 5 handwritten answer, which gives check bits `1011` and stored Hamming code `101110010010`. 

---

# 25. Advanced DRAM Organisation

The Chapter 5 slides continue into **Advanced DRAM Organization** and **Synchronous DRAM (SDRAM)**. 

## Why advanced DRAM is needed

The CPU is fast, but DRAM is slower.

```text
Fast CPU
   │
   ▼
Waiting for slower memory
```

Advanced DRAM improves data transfer using:

```text
clock synchronization
burst transfer
multiple banks
prefetch buffer
double data rate transfer
```

---

# 26. SDRAM

## What it means

SDRAM stands for:

```text
Synchronous Dynamic Random Access Memory
```

Tutorial 5 says the “S” in SDRAM means synchronous, and its task is to synchronize DRAM operation with the system clock. It also supports burst mode, where a series of data bits can be transferred rapidly after the first access. 

## Why we need SDRAM

SDRAM coordinates memory operations with the system clock.

```text
Clock tick
   │
   ▼
Memory command happens at predictable timing
```

This improves coordination between memory and processor timing.

---

# 27. SDRAM Pin Assignments

The Chapter 5 slides list SDRAM pin assignments such as address pins, bank address lines, clock input, chip select, RAS, CAS, WE, DQ, and DQM. 

| Pin        | Meaning               | Beginner explanation       |
| ---------- | --------------------- | -------------------------- |
| A0 to A13  | Address inputs        | Choose row/column address  |
| BA0, BA1   | Bank address lines    | Choose internal bank       |
| CLK        | Clock input           | Timing signal              |
| CKE        | Clock enable          | Enables clock operation    |
| CS         | Chip select           | Selects SDRAM chip         |
| RAS        | Row address strobe    | Row control                |
| CAS        | Column address strobe | Column control             |
| WE         | Write enable          | Controls write/read action |
| DQ0 to DQ7 | Data input/output     | Carries data bits          |
| DQM        | Data mask             | Masks/controls data        |

Diagram:

```text
Memory Controller
        │
        ├── Address A0-A13 ─────► SDRAM
        ├── Bank BA0-BA1 ───────► SDRAM
        ├── Control signals ────► SDRAM
        ├── Clock CLK ──────────► SDRAM
        └── Data DQ0-DQ7 ◄─────► SDRAM
```

---

# 28. Burst Mode

The slides say SDRAM uses burst mode to eliminate address setup time and row/column precharge time after the first access. In burst mode, a series of data bits can be clocked out rapidly after the first bit has been accessed. 

## What it means

```text
Burst mode = transfer several data units after one starting access
```

Example:

```text
Starting address = 1000
Burst length = 4

Data transferred:
1000, 1001, 1002, 1003
```

## Why it is useful

Programs often access sequential data.

Example:

```text
array[0]
array[1]
array[2]
array[3]
```

Burst mode handles this efficiently.

---

# 29. Mode Register

The Chapter 5 slides say the SDRAM mode register customizes SDRAM for system needs. It specifies burst length and allows adjustment of latency between receiving a read request and beginning data transfer. 

## What it stores

```text
burst length
burst type
CAS latency
```

Diagram:

```text
┌────────────────────┐
│ SDRAM Mode Register │
├────────────────────┤
│ Burst length        │
│ Burst type          │
│ CAS latency         │
└────────────────────┘
```

---

# 30. CAS Latency

## What it means

CAS latency is the delay between a read command and when the first data appears.

```text
CAS latency = waiting clock cycles before first data
```

Example:

```text
CAS latency = 2
```

means:

```text
Wait 2 clock cycles before first data appears.
```

The SDRAM timing slide example uses burst length `4` and latency `2`. The delay from the start of the command to when the first data appears is equal to the CAS latency set in the mode register. 

---

# 31. SDRAM Read Timing Example

Given:

```text
Burst length = 4
CAS latency = 2
```

Meaning:

```text
READ command
    │
    ├── wait 2 cycles
    │
    ▼
Output 4 data units
```

Text timing diagram:

```text
Clock:    ↑      ↑      ↑      ↑      ↑      ↑
Command:  READ   wait   wait   D0     D1     D2     D3
Latency:         1      2
Burst:                         1st    2nd    3rd    4th
```

---

# 32. DDR SDRAM

DDR SDRAM stands for:

```text
Double Data Rate Synchronous Dynamic Random Access Memory
```

The Chapter 5 slides say DDR achieves higher data rates in three ways: data transfer on both rising and falling clock edges, higher bus clock rate, and buffering. 

## Why it is called Double Data Rate

Normal SDRAM transfers once per clock cycle.

```text
Clock:    ↑    ↑    ↑
Data:     D0   D1   D2
```

DDR transfers on both rising and falling edges.

```text
Clock:    ↑ ↓  ↑ ↓  ↑ ↓
Data:     D0 D1 D2 D3 D4 D5
```

So:

```text
DDR transfers 2 times per clock cycle.
```

---

# 33. DDR Prefetch Buffer

The Chapter 5 slides say DDR1 uses a 2-bit prefetch buffer. The prefetch buffer is a memory cache located on the SDRAM chip and lets the chip preposition bits to be placed on the data bus quickly. 

## Why it is needed

The DRAM core is slower than the interface.

So DDR fetches data internally in parallel, then serializes it out through the interface.

```text
DRAM core
   │
   ▼
Prefetch buffer
   │
   ▼
DDR I/O bus
```

## DDR1 example

```text
Prefetch 2 words
    │
    ├── rising edge  -> word 1
    └── falling edge -> word 2
```

---

# 34. DDR Generations

The Chapter 5 slides compare DDR1, DDR2, DDR3, and DDR4 using prefetch buffer, voltage level, and front side bus data rates. 

| Feature                  |         DDR1 |          DDR2 |          DDR3 |           DDR4 |
| ------------------------ | -----------: | ------------: | ------------: | -------------: |
| Prefetch buffer          |       2 bits |        4 bits |        8 bits |         8 bits |
| Voltage level            |        2.5 V |         1.8 V |         1.5 V |          1.2 V |
| Front side bus data rate | 200–400 Mbps | 400–1066 Mbps | 800–2133 Mbps | 2133–4266 Mbps |

## Trend

```text
Newer DDR:
- higher data rate
- lower voltage
- better organisation
```

## DDR4 bank groups

The slides say DDR4 does not increase prefetch buffer size to 16 bits. Instead, DDR4 introduces bank groups, allowing prefetches to operate in parallel across bank groups. 

```text
DDR3:
8-bit prefetch

DDR4:
8-bit prefetch + bank groups
```

---

# 35. Figure 6.20: Nonvolatile RAM within the Memory Hierarchy

The Chapter 5 notes explain that the traditional memory hierarchy has three major levels: SRAM, DRAM, and hard disk. SRAM is fast but expensive and least dense. DRAM is cheaper, denser, and slower than SRAM. Hard disk has high density and low cost per bit but slow access. 

## Memory hierarchy idea

```text
Top:
Higher performance
Higher endurance
Higher cost per bit
Lower capacity

Bottom:
Lower performance
Lower cost per bit
Higher capacity
Higher density
```

Diagram:

```text
          Fast, expensive, small
                  ▲
                  │
               SRAM
               DRAM
            NAND Flash
              Hard Disk
                  │
                  ▼
          Cheap, dense, large
```

## Where flash fits

Flash is nonvolatile.

```text
Flash memory keeps data without power.
```

The notes say NOR flash is best suited to storing programs and static application data in embedded systems, while NAND flash has characteristics intermediate between DRAM and hard disks. 

```text
NOR flash  -> embedded program/static data
NAND flash -> between DRAM and hard disk
```

---

# 36. Emerging Nonvolatile RAM Technologies

The Chapter 5 notes say newer nonvolatile semiconductor memories are being developed beyond flash memory, especially:

```text
STT-RAM
PCRAM
ReRAM
```

They are in volume production but are still mostly used in specialty applications because NAND flash and NOR flash still dominate many applications. 

## Where they fit

Based on Figure 6.20:

```text
STT-RAM -> near SRAM/DRAM
PCRAM   -> near DRAM/NAND flash
ReRAM   -> near NAND flash/hard disk
```

---

# 37. Figure 6.21: Nonvolatile RAM Technologies

Figure 6.21 shows three nonvolatile RAM technologies:

```text
(a) STT-RAM
(b) PCRAM
(c) ReRAM
```

They are called **nonvolatile RAM** because they are RAM-like technologies that can keep data without power.

---

# 38. STT-RAM

## What it means

STT-RAM stands for:

```text
Spin-Transfer Torque RAM
```

The notes say STT-RAM is a new type of Magnetic RAM, featuring nonvolatility, fast read/write speed under 10 ns, high programming endurance over 10¹⁵ cycles, and zero standby power. 

## How it stores data

STT-RAM uses an MTJ:

```text
MTJ = Magnetic Tunnel Junction
```

It has:

```text
Reference layer = fixed magnetic direction
Free layer      = magnetic direction can change
```

The notes say the MTJ has low resistance when magnetizations are parallel and high resistance when they are anti-parallel. 

```text
Parallel magnetic direction     -> low resistance
Anti-parallel magnetic direction -> high resistance
```

## Possible use

The notes say STT-RAM is a good candidate for either cache or main memory. 

```text
STT-RAM possible use:
- cache
- main memory
```

---

# 39. PCRAM

## What it means

PCRAM stands for:

```text
Phase-Change RAM
```

The notes say PCRAM is based on a chalcogenide alloy material, similar to materials used in optical storage media such as CDs and DVDs. 

## How it stores data

PCRAM uses resistance differences between two phases:

```text
Crystalline phase = low resistance
Amorphous phase   = high resistance
```

## SET operation

```text
SET -> heat material above crystallization temperature
    -> material becomes crystalline
    -> low resistance
```

## RESET operation

```text
RESET -> larger current melts material
      -> current is cut off quickly
      -> material quenches into amorphous state
      -> high resistance
```

The notes describe SET as crystallizing the material by heating it, and RESET as using larger current then cutting it off to melt and quench the material into the amorphous state. 

## Possible use

The notes say PCRAM is a good candidate to replace or supplement DRAM for main memory. 

---

# 40. ReRAM

## What it means

ReRAM stands for:

```text
Resistive RAM
```

The notes say ReRAM works by creating resistance rather than directly storing charge. Electric current changes the resistance of the material, and the resistance state is measured as `1` or `0`. 

## How it stores data

```text
Low resistance  -> one binary value
High resistance -> another binary value
```

In Figure 6.21, the ReRAM diagram shows:

```text
Reduction -> low resistance
Oxidation -> high resistance
```

## Possible use

The notes say ReRAM designs are low voltage, have endurance far superior to flash memory, and are good candidates to replace or supplement both secondary storage and main memory. 

---

# 41. STT-RAM vs PCRAM vs ReRAM

| Technology | Stores data using  | Main resistance idea                    | Possible role                    |
| ---------- | ------------------ | --------------------------------------- | -------------------------------- |
| STT-RAM    | Magnetic direction | Parallel vs anti-parallel magnetization | Cache or main memory             |
| PCRAM      | Phase change       | Crystalline vs amorphous phase          | Main memory                      |
| ReRAM      | Resistance change  | Low vs high resistance state            | Main memory or secondary storage |

## Memory trick

```text
STT-RAM -> Spin / magnetism
PCRAM   -> Phase change
ReRAM   -> Resistance
```

---

# 42. Tutorial 5 Recap

Tutorial 5 asks nine questions covering semiconductor memory, DRAM/SRAM, ROM, EPROM/EEPROM/flash, SRAM vs DRAM, SDRAM, memory errors, and Hamming code. 

## Q1. Key properties of semiconductor memory

```text
- Made using semiconductor material
- Used as internal memory
- Examples: RAM, ROM, cache
- Supports random access
- May be volatile or nonvolatile
- Faster than external storage
```

## Q2. Why one RAM is analog and the other is digital

```text
DRAM:
- Analog-like
- Stores electrical charge in capacitor
- Charge leaks
- Needs refresh

SRAM:
- Digital
- Uses flip-flop
- Two stable states
- Does not need refresh while power is supplied
```

## Q3. ROM applications

```text
- Firmware
- BIOS
- Microcontroller programs
- Lookup tables
- System startup instructions
```

## Q4. EPROM vs EEPROM vs Flash

```text
EPROM:
- Erased using ultraviolet light
- Usually removed from system

EEPROM:
- Erased electrically
- Can erase/rewrite individual bytes

Flash:
- Erased electrically
- Erases blocks
- Faster and denser than EEPROM
```

## Q5. SRAM vs DRAM

```text
SRAM:
- Flip-flop
- No refresh
- Faster
- More expensive
- Lower density
- Smaller capacity
- Cache memory

DRAM:
- Capacitor
- Refresh needed
- Slower
- Cheaper
- Higher density
- Larger capacity
- Main memory
```

## Q6. Why DRAM has larger capacity than SRAM

```text
DRAM cell is simpler and smaller.
SRAM cell uses several transistors.
More DRAM cells fit in the same chip area.
Therefore DRAM has larger capacity.
```

## Q7. Task of “S” in SDRAM

```text
S = Synchronous
Task = synchronize DRAM operation with system clock
```

## Q8. Two error categories

```text
Hard error = permanent physical fault
Soft error = temporary error caused by noise/radiation
```

## Q9. Hamming code for `11000010`

```text
Data word = 11000010
m = 8
Need r = 4 check bits

Check bits = 1011
Stored Hamming code = 101110010010
```

---

# 43. Common Mistakes for Chapter 5

## Mistake 1: Confusing Mb and MB

```text
Mb = megabits
MB = megabytes

8 bits = 1 byte
```

Example:

```text
16 Mb ÷ 8 = 2 MB
```

## Mistake 2: Thinking SRAM is nonvolatile

```text
SRAM does not need refresh,
but SRAM still loses data when power is off.
```

## Mistake 3: Thinking DRAM and SDRAM are totally different storage cells

```text
SDRAM is still DRAM.
It is synchronous DRAM.
```

## Mistake 4: Thinking flash supports normal byte-level erase

```text
Flash erases blocks, not individual bytes.
```

## Mistake 5: Mixing NOR and NAND

```text
NOR  -> code execution / random access
NAND -> storage / block access
```

## Mistake 6: Putting Hamming check bits at the end

Wrong:

```text
Data + check bits
```

Correct:

```text
Check bits go at positions 1, 2, 4, 8, ...
```

## Mistake 7: Thinking DDR means two RAM sticks

```text
DDR = Double Data Rate.
It transfers data on both rising and falling clock edges.
```

---

# 44. Viva / Exam-Style Questions

1. What is a memory cell?
2. What is semiconductor memory?
3. What does random access mean?
4. Why is RAM volatile?
5. Why does DRAM need refresh?
6. Why is SRAM faster than DRAM?
7. Why is DRAM used for main memory?
8. Why is SRAM used for cache?
9. What are the applications of ROM?
10. What is the difference between EPROM and EEPROM?
11. What is the difference between EEPROM and flash memory?
12. What does `4M × 4` mean?
13. Convert `16 Mb` into MB.
14. What is address multiplexing?
15. What are RAS and CAS?
16. What is memory refreshing?
17. What is ECC?
18. What is the difference between hard errors and soft errors?
19. For Hamming code, why are check bits placed at positions 1, 2, 4, and 8?
20. What is SDRAM?
21. What is burst mode?
22. What is CAS latency?
23. What does DDR mean?
24. How does DDR double the data rate?
25. What is the difference between NOR and NAND flash?
26. What does a Kiviat graph show?
27. Where does NAND flash fit in the memory hierarchy?
28. What is STT-RAM?
29. What is PCRAM?
30. What is ReRAM?

---

# 45. Final Cheat Sheet

```text
RAM:
Read/write volatile working memory.

DRAM:
Uses capacitor charge.
Needs refresh.
Cheap, dense, large capacity.
Used for main memory.

SRAM:
Uses flip-flop.
No refresh needed.
Fast, expensive, lower density.
Used for cache.

ROM:
Nonvolatile memory mainly read during normal use.

EPROM:
Erased by ultraviolet light.

EEPROM:
Electrically erased, byte-level rewrite.

Flash:
Electrically erased, block-level erase.
Nonvolatile.
Uses floating gate.

NOR Flash:
Parallel structure.
Fast random access.
Good for code execution and embedded systems.

NAND Flash:
Series structure.
Block/page access.
High density and good write speed.
Good for SSDs, USB drives, memory cards.

SDRAM:
Synchronous DRAM.
Works with system clock.
Supports burst mode.

DDR SDRAM:
Double Data Rate SDRAM.
Transfers data on rising and falling clock edges.

ECC:
Error Correcting Code.
Uses check bits.

Hamming formula:
2^r ≥ m + r + 1

For 11000010:
Check bits = 1011
Stored Hamming code = 101110010010

STT-RAM:
Uses magnetism/spin-transfer torque.
Candidate for cache or main memory.

PCRAM:
Uses phase change.
Candidate for main memory.

ReRAM:
Uses resistance change.
Candidate for main memory or secondary storage.
```

---

# 46. Chapter 5 Final Mini Test

Try these without looking at the answer:

1. Why does DRAM need refresh?
2. Why is SRAM faster but more expensive?
3. Why does DRAM usually have larger capacity than SRAM?
4. What does `4M × 4` mean?
5. How many MB is `16 Mb`?
6. What is the difference between EPROM and EEPROM?
7. What is the difference between EEPROM and flash?
8. Why is NOR flash good for firmware/code execution?
9. Why is NAND flash good for SSDs?
10. What is a Kiviat graph used for?
11. What is ECC?
12. What are hard and soft errors?
13. What are the Hamming check bits for `11000010`?
14. What does SDRAM mean?
15. What does DDR mean?
16. What is STT-RAM based on?
17. What does PCRAM change?
18. What does ReRAM change?

## Answers

```text
1. DRAM capacitors leak charge.
2. SRAM uses flip-flops and more transistors.
3. DRAM cells are smaller, so more fit on a chip.
4. 4M locations, 4 bits per location.
5. 2 MB.
6. EPROM uses UV erase; EEPROM uses electrical erase.
7. EEPROM can erase bytes; flash erases blocks.
8. NOR supports high-speed random access.
9. NAND has high density and good block/page storage.
10. To compare many characteristics at once.
11. Error Correcting Code.
12. Hard = permanent; soft = temporary.
13. Check bits = 1011.
14. Synchronous Dynamic RAM.
15. Double Data Rate.
16. Magnetism / spin-transfer torque.
17. Material phase.
18. Resistance.
```

Chapter 5 is now updated properly with the missing flash memory structures, Kiviat graphs, nonvolatile RAM hierarchy, and STT-RAM/PCRAM/ReRAM content.
