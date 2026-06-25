# Chapter 5: Internal Memory

# Complete Chapter 5 Markdown Revision Notes

## 1. Chapter 5 Big Picture

Chapter 5 studies **internal memory**, especially semiconductor memory used inside the computer system.

Main topics:

```text
Internal Memory
│
├── Memory cell operation
├── Semiconductor memory types
├── RAM
│   ├── DRAM
│   └── SRAM
├── ROM
│   ├── PROM
│   ├── EPROM
│   ├── EEPROM
│   └── Flash memory
├── DRAM chip organisation
├── Refreshing
├── Packaging
├── Error correction
├── Hamming code
├── SDRAM
└── DDR SDRAM
```

---

## 2. Memory Cell Operation

A **memory cell** is the smallest storage unit in memory.

```text
1 memory cell usually stores 1 bit.
1 bit = 0 or 1.
```

Basic operations:

```text
Select
Read
Write
```

Simple diagram:

```text
Address ──► Select cell
Control ──► Read / Write
Data    ◄─► Data in / Data out
```

### Read

```text
Read = get data from memory
```

### Write

```text
Write = put data into memory
```

Common mistake:

```text
Cell ≠ byte

1 cell = 1 bit
8 cells = 8 bits = 1 byte
```

---

## 3. Semiconductor Memory

Semiconductor memory is memory made using semiconductor electronic circuits.

Examples:

```text
RAM
ROM
Cache
Flash memory
```

Key properties:

```text
- Made using semiconductor material
- Used as internal memory
- Supports random access
- Can be volatile or nonvolatile
- Faster than external storage
```

Random access means:

```text
Any memory address can be accessed directly.
```

It does **not** mean random data.

---

## 4. RAM

RAM stands for **Random Access Memory**.

```text
RAM = fast read/write working memory
```

RAM is used when programs are running.

```text
SSD/storage keeps program permanently.
RAM holds active program temporarily.
CPU reads/writes RAM quickly.
```

Most RAM is volatile.

```text
Volatile = data is lost when power is off.
```

---

## 5. DRAM

DRAM stands for **Dynamic Random Access Memory**.

DRAM stores data using a capacitor.

```text
Charged capacitor    = 1
Discharged capacitor = 0
```

DRAM is called dynamic because charge leaks away.

```text
Charge leaks
→ value becomes weak
→ memory must refresh it
```

### DRAM cell idea

```text
Word line
    │
    ▼
Transistor ─── Capacitor
                 │
                 ▼
              stores charge
```

### Why DRAM is used for main memory

```text
- Cheap
- High density
- Large capacity
```

### Weakness

```text
- Slower than SRAM
- Needs refreshing
```

---

## 6. SRAM

SRAM stands for **Static Random Access Memory**.

SRAM stores data using flip-flop circuits.

```text
Flip-flop state 0 = stores 0
Flip-flop state 1 = stores 1
```

It is called static because it does not need refreshing while power is supplied.

Important:

```text
SRAM does not need refresh.
But SRAM is still volatile.
It loses data when power is off.
```

### Why SRAM is used for cache

```text
- Very fast
- Good for CPU cache
```

### Weakness

```text
- More expensive
- Lower density
- Smaller capacity
```

---

## 7. SRAM vs DRAM

| Feature         | SRAM           | DRAM        |
| --------------- | -------------- | ----------- |
| Full name       | Static RAM     | Dynamic RAM |
| Storage element | Flip-flop      | Capacitor   |
| Refresh needed? | No             | Yes         |
| Speed           | Faster         | Slower      |
| Cost            | More expensive | Cheaper     |
| Density         | Lower          | Higher      |
| Capacity        | Smaller        | Larger      |
| Typical use     | Cache          | Main memory |
| Volatile?       | Yes            | Yes         |

Exam sentence:

```text
SRAM is faster but expensive, so it is used for cache.
DRAM is slower but cheaper and denser, so it is used for main memory.
```

---

## 8. ROM

ROM stands for **Read Only Memory**.

```text
ROM = memory mainly read during normal operation
```

ROM is usually nonvolatile.

```text
Nonvolatile = keeps data without power
```

ROM is useful because RAM is empty when the computer first turns on.

```text
Power ON
   │
   ▼
CPU needs startup instructions
   │
   ▼
CPU reads firmware/BIOS from ROM
```

Applications:

```text
Firmware
BIOS
Microcontroller programs
Lookup tables
System startup instructions
```

---

## 9. Types of ROM

### Mask ROM

Programmed during manufacturing.

```text
Fixed at factory
Cannot normally be changed
Good for mass production
```

### PROM

Programmable ROM.

```text
Blank at first
Can be programmed once
Cannot normally be erased
```

### EPROM

Erasable Programmable ROM.

```text
Programmed electrically
Erased using ultraviolet light
Usually removed from system to erase
```

### EEPROM

Electrically Erasable Programmable ROM.

```text
Erased electrically
Can erase/rewrite individual bytes
More convenient than EPROM
```

### Flash Memory

Flash memory is nonvolatile and electrically erasable.

```text
Keeps data without power
Erases data in blocks
Used in USB drives, SSDs, memory cards, firmware
```

Flash memory uses a floating gate. Electrons trapped on the floating gate remain even when power is disconnected. 

---

## 10. EPROM vs EEPROM vs Flash

| Type   | Erase method      | Main feature                 |
| ------ | ----------------- | ---------------------------- |
| EPROM  | Ultraviolet light | Usually removed from system  |
| EEPROM | Electrical signal | Can erase individual bytes   |
| Flash  | Electrical signal | Erases blocks, denser/faster |

Memory trick:

```text
EPROM  -> UV erase
EEPROM -> Electrical erase
Flash  -> Block erase
```

---

## 11. DRAM Chip Organisation

Example from lecture:

```text
Typical 16 Mb DRAM = 4M × 4
```

Meaning:

```text
4M locations
Each location = 4 bits
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

---

## 12. Address Bits for 4M × 4

```text
4M = 4 × 2^20 = 2^22 locations
```

Therefore:

```text
Need 22 address bits.
```

But DRAM often splits address into row and column:

```text
11 row bits
11 column bits
```

because:

```text
2^11 × 2^11 = 2^22 = 4M
```

---

## 13. Row and Column Addressing

DRAM is organised like a 2D array.

```text
          Columns
        0  1  2  3
Row 0   □  □  □  □
Row 1   □  □  □  □
Row 2   □  □  □  □
```

To access one cell:

```text
Choose row
Choose column
Read/write data
```

---

## 14. Address Multiplexing

Address multiplexing means using the same address pins twice.

```text
First use  -> row address
Second use -> column address
```

Why?

```text
Fewer pins
Lower cost
Simpler packaging
```

Signals:

```text
RAS = Row Address Strobe
CAS = Column Address Strobe
```

Memory trick:

```text
RAS -> Row
CAS -> Column
```

---

## 15. Refreshing

DRAM capacitors leak charge.

```text
Stored 1:
█████

After time:
███

Too late:
may be read wrongly
```

Refreshing restores charge.

```text
Refresh = read value and restore charge
```

Usually refresh is done row by row.

```text
Refresh Row 0
Refresh Row 1
Refresh Row 2
...
Repeat
```

Common mistake:

```text
Refresh does not mean saving to SSD.
Refresh is internal memory charge restoration.
```

---

## 16. Packaging and Memory Modules

A single memory chip may not provide enough data width or capacity.

So chips are combined into modules.

Example:

```text
One chip gives 4 bits.
System bus needs 32 bits.

Number of chips needed:
32 ÷ 4 = 8 chips
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

## 17. 256 KB Module Organisation

```text
256 KB = 256 × 1024 bytes
       = 262,144 bytes
```

In bits:

```text
262,144 × 8 = 2,097,152 bits = 2 Mb
```

If each chip is:

```text
256K × 1
```

Then 8 chips make:

```text
256K × 8 = 256 KB
```

---

## 18. 1 MB Module Organisation

```text
1 MB = 1024 KB
```

One way to build it:

```text
4 × 256 KB = 1 MB
```

Use bank selection:

```text
Bank select bits:
00 -> Bank 0
01 -> Bank 1
10 -> Bank 2
11 -> Bank 3
```

For 4 banks:

```text
Need 2 bank-select bits.
```

---

## 19. Memory Errors

A memory error means a stored bit becomes wrong.

Example:

```text
Correct: 11000010
Wrong:   11001010
             ↑
          bit error
```

Two types:

### Hard Error

```text
Permanent physical fault
```

Example:

```text
A memory cell is damaged and always reads 0.
```

### Soft Error

```text
Temporary disturbance
```

Causes:

```text
Electrical noise
Radiation
Random charge disturbance
```

---

## 20. Error Detection vs Error Correction

```text
Error detection:
- Tells that data is wrong

Error correction:
- Finds the wrong bit and fixes it
```

ECC means:

```text
Error Correcting Code
```

ECC stores:

```text
Data bits + check bits
```

---

## 21. ECC Function

### During Write

```text
Original data
   │
   ▼
Generate check bits
   │
   ▼
Store data + check bits
```

### During Read

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

A **syndrome** tells the error position.

```text
Syndrome = 0       -> no error
Syndrome ≠ 0       -> error position
```

---

## 22. Hamming Code

Hamming code adds check bits at power-of-two positions:

```text
1, 2, 4, 8, 16, ...
```

Formula:

```text
2^r ≥ m + r + 1
```

where:

```text
m = number of data bits
r = number of check bits
```

For 8 data bits:

```text
m = 8
```

Try r = 4:

```text
2^4 ≥ 8 + 4 + 1
16 ≥ 13
```

So:

```text
r = 4
```

---

## 23. Hamming Code Example: `11000010`

Data:

```text
11000010
```

Label:

```text
D1 D2 D3 D4 D5 D6 D7 D8
1  1  0  0  0  0  1  0
```

Positions:

```text
Position:  1  2  3  4  5  6  7  8  9  10 11 12
Type:      C1 C2 D1 C4 D2 D3 D4 C8 D5 D6 D7 D8
Value:     ?  ?  1  ?  1  0  0  ?  0  0  1  0
```

Check groups:

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

Check bits:

```text
1011
```

Stored code:

```text
101110010010
```

---

## 24. SDRAM

SDRAM stands for:

```text
Synchronous Dynamic Random Access Memory
```

The **S** means synchronous.

```text
Synchronous = works with system clock
```

SDRAM has clock and control pins such as CLK, CKE, CS, RAS, CAS, WE, DQ, and bank address pins. 

Important pins:

| Pin        | Meaning               |
| ---------- | --------------------- |
| A0 to A13  | Address inputs        |
| BA0, BA1   | Bank address lines    |
| CLK        | Clock input           |
| CKE        | Clock enable          |
| CS         | Chip select           |
| RAS        | Row address strobe    |
| CAS        | Column address strobe |
| WE         | Write enable          |
| DQ0 to DQ7 | Data input/output     |
| DQM        | Data mask             |

---

## 25. Burst Mode

SDRAM uses burst mode.

```text
Burst mode = transfer several data units after one starting access
```

The slides say SDRAM burst mode eliminates address setup time and row/column precharge time after the first access, allowing a series of data bits to be clocked out rapidly after the first bit. 

Example:

```text
Starting address = 1000
Burst length = 4

Data transferred:
1000, 1001, 1002, 1003
```

---

## 26. Mode Register

The mode register stores SDRAM settings.

Examples:

```text
Burst length
Burst type
CAS latency
```

The slides say the mode register lets SDRAM be customized and specifies burst length and latency. 

---

## 27. CAS Latency

CAS latency is the delay before first data appears after a read command.

```text
CAS latency = waiting clock cycles before first data
```

Example:

```text
CAS latency = 2
Burst length = 4
```

Meaning:

```text
Wait 2 cycles
Then output 4 data units
```

For the SDRAM timing example, the slides say burst length is 4 and latency is 2. The first data appears after a delay equal to the CAS latency. 

---

## 28. DDR SDRAM

DDR stands for:

```text
Double Data Rate
```

DDR SDRAM transfers data on both clock edges:

```text
Rising edge
Falling edge
```

Normal SDRAM:

```text
Clock:    ↑    ↑    ↑
Data:     D0   D1   D2
```

DDR:

```text
Clock:    ↑ ↓  ↑ ↓  ↑ ↓
Data:     D0 D1 D2 D3 D4 D5
```

The slides state DDR increases data rate by using both rising and falling clock edges, higher bus clock rate, and buffering. 

---

## 29. DDR Prefetch Buffer

A prefetch buffer prepares multiple bits/words on the SDRAM chip.

DDR1 uses a 2-bit prefetch buffer. The slides explain that the prefetch buffer is located on the SDRAM chip and helps place bits on the data bus quickly. 

Simple idea:

```text
DRAM core fetches data internally
        │
        ▼
Prefetch buffer prepares it
        │
        ▼
DDR bus sends it on both clock edges
```

---

## 30. DDR Generations

| Feature                  |         DDR1 |          DDR2 |          DDR3 |           DDR4 |
| ------------------------ | -----------: | ------------: | ------------: | -------------: |
| Prefetch buffer          |       2 bits |        4 bits |        8 bits |         8 bits |
| Voltage                  |        2.5 V |         1.8 V |         1.5 V |          1.2 V |
| Front side bus data rate | 200–400 Mbps | 400–1066 Mbps | 800–2133 Mbps | 2133–4266 Mbps |

This table is from your Chapter 5 DDR characteristics slide. 

Key trend:

```text
Newer DDR:
- Higher data rate
- Lower voltage
- Better organization
```

DDR4 keeps 8-bit prefetch but uses bank groups to improve performance instead of increasing prefetch size to 16. 

---

# Final Exam Cheat Sheet

## Must-remember definitions

```text
Memory cell:
Smallest storage unit, usually stores 1 bit.

RAM:
Read/write volatile working memory.

DRAM:
Uses capacitor charge, needs refresh, used for main memory.

SRAM:
Uses flip-flop, no refresh, used for cache.

ROM:
Nonvolatile memory mainly read during normal operation.

Flash:
Nonvolatile electrically erasable memory, erased in blocks.

ECC:
Error correcting code, uses check bits.

SDRAM:
Synchronous DRAM, works with clock.

DDR:
Double data rate, transfers data on rising and falling clock edges.
```

---

## Must-remember comparisons

```text
SRAM vs DRAM:
SRAM = fast, expensive, cache
DRAM = cheap, dense, main memory
```

```text
EPROM vs EEPROM vs Flash:
EPROM = UV erase
EEPROM = electrical byte erase
Flash = electrical block erase
```

```text
Hard vs Soft error:
Hard = permanent physical fault
Soft = temporary disturbance
```

---

## Must-remember formulas

```text
Memory capacity:
Number of locations × bits per location
```

Example:

```text
4M × 4 = 16 Mb = 2 MB
```

Hamming check bits:

```text
2^r ≥ m + r + 1
```

For 8 data bits:

```text
r = 4
```

---

## Must-remember Hamming answer

For:

```text
Data word = 11000010
```

Answer:

```text
Check bits = 1011
Stored Hamming code = 101110010010
```

---

# Chapter 5 Final Mini Test

Try these before moving to Chapter 6:

1. Why does DRAM need refresh?
2. Why is SRAM faster than DRAM?
3. Why is DRAM used for main memory instead of SRAM?
4. What does `4M × 4` mean?
5. How many MB is `16 Mb`?
6. What is the difference between EPROM and EEPROM?
7. What is the difference between EEPROM and flash?
8. What are hard errors and soft errors?
9. For Hamming code, where are check bits placed?
10. What does DDR mean?

Expected short answers:

```text
1. DRAM capacitors leak charge.
2. SRAM uses stable flip-flop circuits and does not need refresh.
3. DRAM is cheaper and denser.
4. 4M locations, 4 bits per location.
5. 2 MB.
6. EPROM uses UV erase; EEPROM uses electrical erase.
7. EEPROM can erase bytes; flash erases blocks.
8. Hard = permanent; soft = temporary.
9. Positions 1, 2, 4, 8, ...
10. Double Data Rate.
```


# Tutorial 5 Quick Recap

## Q1. Key properties of semiconductor memory

Semiconductor memory is chip-based memory made using semiconductor material. It is commonly used as internal memory such as RAM, ROM, and cache. It supports random access, can be volatile or nonvolatile, and is faster than external storage. This matches your Tutorial 5 answer. 

Exam answer:

```text
Semiconductor memory:
- Made using semiconductor material
- Usually used as internal memory
- Examples: RAM, ROM, cache
- Supports random access
- May be volatile or nonvolatile
- Faster than external storage
```

---

## Q2. Why one RAM is analog and the other is digital

DRAM is considered more **analog-like** because it stores data as electrical charge in a capacitor. The charge gradually leaks away, so DRAM must be refreshed. SRAM is considered **digital** because it stores data using flip-flop circuits, and a flip-flop has two stable states representing 0 and 1. 

```text
DRAM:
- Uses capacitor charge
- Charge can be strong/weak
- Needs refresh
- Considered analog-like

SRAM:
- Uses flip-flop
- Two stable digital states
- Does not need refresh while power is supplied
```

---

## Q3. Applications of ROM

Your Tutorial 5 answer lists firmware, BIOS, microcontroller programs, lookup tables, and system startup instructions. 

```text
ROM applications:
- Firmware
- BIOS
- Microcontroller programs
- Lookup tables
- System startup instructions
```

---

## Q4. EPROM vs EEPROM vs Flash

```text
EPROM:
- Erased using ultraviolet light
- Usually removed from system to erase

EEPROM:
- Erased electrically
- Can erase/rewrite individual bytes

Flash memory:
- Erased electrically
- Erases blocks
- Faster and denser than EEPROM
```

Flash memory uses a floating gate. Electrons can be trapped on the floating gate and remain even when power is disconnected, making flash persistent/nonvolatile. 

---

## Q5. SRAM vs DRAM

```text
SRAM:
- Uses flip-flop
- No refresh needed
- Faster
- More expensive
- Lower density
- Smaller capacity
- Used for cache

DRAM:
- Uses capacitor
- Refresh needed
- Slower
- Cheaper
- Higher density
- Larger capacity
- Used for main memory
```

---

## Q6. Why DRAM has larger capacity than SRAM

DRAM cells are smaller because a basic DRAM cell uses a capacitor and transistor idea, while SRAM uses several transistors for a flip-flop structure.

```text
Smaller DRAM cell
→ more cells fit on one chip
→ higher density
→ larger capacity
→ cheaper per bit
```

---

## Q7. Task of “S” in SDRAM

The **S** means **Synchronous**. SDRAM synchronizes memory operations with the system clock. It also supports burst mode, where several data bits can be transferred rapidly after the first access. 

```text
S in SDRAM = Synchronous
Task = coordinate DRAM operation with clock timing
```

---

## Q8. Two error categories in semiconductor memory

Your Tutorial 5 answer gives:

```text
Hard error:
- Permanent physical fault in memory hardware

Soft error:
- Temporary error caused by electrical noise, radiation, etc.
```

---

## Q9. Hamming code for `11000010`

Data word:

```text
11000010
```

Number of data bits:

```text
m = 8
```

Use formula:

```text
2^r ≥ m + r + 1
```

Try `r = 4`:

```text
2^4 ≥ 8 + 4 + 1
16 ≥ 13
```

So 4 check bits are needed.

Check bit positions:

```text
1, 2, 4, 8
```

Layout:

```text
Position:  1  2  3  4  5  6  7  8  9  10 11 12
Type:      C1 C2 D1 C4 D2 D3 D4 C8 D5 D6 D7 D8
Value:     ?  ?  1  ?  1  0  0  ?  0  0  1  0
```

Using even parity:

```text
C1 = 1
C2 = 0
C4 = 1
C8 = 1
```

Check bits:

```text
1011
```

Stored Hamming code:

```text
101110010010
```

This matches your Tutorial 5 Hamming working, which gives check bits `1011` and stored Hamming code `101110010010`. 

---
Chapter 5 is complete.
