# Chapter 7: External Memory — Complete Revision Notes

## 1. What is External Memory?

External memory is storage outside main memory.

Examples:

```text
Magnetic disk
SSD
Optical disk
Magnetic tape
```

External memory is needed because main memory is usually:

```text
smaller
more expensive
volatile
```

External memory is usually:

```text
larger
cheaper per bit
non-volatile
```

Non-volatile means data remains even when power is off.

---

## 2. Magnetic Disk

A magnetic disk is a circular platter coated with magnetizable material.

Basic structure:

```text
+--------------------------------+
| Magnetizable coating           |
+--------------------------------+
| Nonmagnetic substrate          |
+--------------------------------+
```

Traditionally, the substrate is aluminium or aluminium alloy. Newer disks may use glass substrate.

Benefits of glass substrate:

```text
Smoother magnetic surface
Fewer surface defects
Lower fly height
Better stiffness
Better shock resistance
```

---

## 3. Magnetic Read and Write Mechanisms

### 3.1 Writing Data

Writing uses the idea:

```text
electric current through coil
        ↓
magnetic field produced
        ↓
disk surface is magnetized
```

If the current direction changes, the magnetization direction also changes.

Simple diagram:

```text
Current direction A → magnetization A
Current direction B → magnetization B
```

These different magnetic patterns represent binary data.

---

### 3.2 Reading Data

Older read heads used electromagnetic induction.

Modern hard disks commonly use a magnetoresistive read head.

The magnetoresistive read head works like this:

```text
Magnetic pattern on disk
        ↓
changes resistance in read sensor
        ↓
voltage change detected
        ↓
binary data recovered
```

---

## 4. Disk Data Layout

A disk surface is divided into:

```text
tracks
sectors
gaps
```

### 4.1 Track

A track is a circular ring on the disk surface.

```text
Disk surface:

   Track 0  outer ring
   Track 1
   Track 2
   Track 3  inner ring
```

### 4.2 Sector

A sector is a smaller part of a track.

```text
One track:

[Sector 1] gap [Sector 2] gap [Sector 3] gap [Sector 4]
```

### 4.3 Intertrack Gap

Intertrack gaps separate adjacent tracks.

Purpose:

```text
reduce errors caused by head misalignment
reduce magnetic interference
```

### 4.4 Intersector Gap

Intersector gaps separate adjacent sectors.

Purpose:

```text
help identify sector boundaries
avoid requiring impossible precision
```

---

## 5. CAV and MZR

## 5.1 CAV: Constant Angular Velocity

CAV means the disk rotates at a constant speed.

```text
CAV = same RPM
```

In CAV, inner and outer tracks usually have the same number of sectors.

Problem:

```text
Outer tracks are longer
but store same amount as inner tracks
therefore outer space is wasted
```

Advantage:

```text
simple direct addressing by track and sector
```

---

## 5.2 MZR: Multiple Zone Recording

MZR divides the disk surface into zones.

```text
Inner zone  → fewer sectors per track
Middle zone → more sectors per track
Outer zone  → most sectors per track
```

Why?

Outer tracks are longer, so they can store more sectors.

Main advantage:

```text
better use of disk surface
higher capacity
```

Main disadvantage:

```text
more complex timing and control
```

---

## 6. Sector Format

A sector contains user data and control information.

Typical fields:

```text
Gap
Sync
Address Mark
Data
ECC
```

### Gap

Separates sectors.

### Sync

Helps the drive recognize the start of a sector and align timing.

### Address Mark

Identifies sector location and status.

### Data

Actual user data.

### ECC

Error Correcting Code. It detects and corrects errors.

---

## 7. Legacy Sector Format

Legacy sector:

```text
User data = 512 bytes
Overhead = 65 bytes
```

Efficiency formula:

```text
Efficiency = user data / (user data + overhead)
```

Calculation:

```text
Efficiency = 512 / (512 + 65)
           = 512 / 577
           ≈ 0.887
           ≈ 88.7%
```

So legacy sector efficiency is about:

```text
88.7%
```

---

## 8. Advanced Format

Advanced Format:

```text
User data = 4096 bytes
Leading overhead = 15 bytes
ECC = 100 bytes
Total overhead = 115 bytes
```

Efficiency:

```text
Efficiency = 4096 / (4096 + 115)
           = 4096 / 4211
           ≈ 0.973
           ≈ 97.3%
```

Advanced Format is more efficient because larger data blocks reduce overhead percentage.

---

## 9. Disk Physical Characteristics

Magnetic disks can be classified by:

```text
Head motion
Disk portability
Sides
Platters
Head mechanism
```

---

## 10. Fixed-Head vs Movable-Head Disk

### Fixed-Head Disk

A fixed-head disk has one read/write head per track.

```text
Track 0 → Head 0
Track 1 → Head 1
Track 2 → Head 2
Track 3 → Head 3
```

Advantage:

```text
no need to move head between tracks
faster access
```

Disadvantage:

```text
expensive
rare today
```

---

### Movable-Head Disk

A movable-head disk has a head that moves to the required track.

```text
Head moves inward/outward
        ↓
positions above required track
```

Advantage:

```text
cheaper
common design
```

Disadvantage:

```text
seek time exists
```

---

## 11. Non-Removable vs Removable Disk

### Non-Removable Disk

The disk is permanently mounted in the drive.

Example:

```text
internal hard disk
```

### Removable Disk

The disk can be removed and replaced.

Examples:

```text
floppy disk
ZIP disk
```

---

## 12. Single-Sided vs Double-Sided Disk

### Single-Sided Disk

Only one side stores data.

```text
Top side stores data
Bottom side unused
```

### Double-Sided Disk

Both sides store data.

```text
Top side stores data
Bottom side stores data
```

Double-sided disks can store more data because they use more surfaces.

---

## 13. Single Platter vs Multiple Platters

### Single Platter

One circular disk.

```text
=========
```

### Multiple Platters

Several platters stacked vertically.

```text
=========
=========
=========
```

More platters usually mean more storage capacity.

---

## 14. Cylinder

A cylinder is the set of tracks at the same radius across all platter surfaces.

Example:

```text
Surface 0: Track 50
Surface 1: Track 50
Surface 2: Track 50
Surface 3: Track 50

All together = Cylinder 50
```

Important difference:

```text
Track    = one circular ring on one surface
Cylinder = same-position tracks across many surfaces
```

---

## 15. Head Mechanism Types

### Contact Head

The head touches the medium.

Used in:

```text
floppy disk
```

### Fixed-Gap Head

The head stays a fixed distance above the surface.

```text
Head
 |
 | fixed gap
 |
Disk surface
```

### Aerodynamic Gap / Winchester Head

The head floats very close to the disk surface when the disk spins.

```text
Disk stopped:
head rests lightly

Disk spinning:
air pressure lifts head slightly
```

Benefit:

```text
smaller gap
narrower tracks
higher density
more storage
```

Risk:

```text
dust or defects can damage disk
```

---

# 16. Disk Performance Parameters

To access data on a disk, three main times are involved:

```text
seek time
rotational latency
transfer time
```

Total block access time:

```text
tB = tS + tL + tT
```

Where:

```text
tB = block access time
tS = seek time
tL = rotational latency
tT = transfer time
```

---

## 17. Seek Time

Seek time is the time needed to move the head to the correct track.

```text
Current track → required track
movement time = seek time
```

---

## 18. Rotational Latency

Rotational latency is the time waiting for the correct sector to rotate under the head.

Average rotational latency formula:

```text
tL = 1 / (2r)
```

Where:

```text
r = revolutions per second
```

Important conversion:

```text
r = rpm / 60
```

Example:

```text
7200 rpm = 7200 / 60
         = 120 rps
```

Average latency:

```text
tL = 1 / (2 × 120)
   = 1 / 240
   = 0.004167 s
   = 4.167 ms
```

---

## 19. Transfer Time

Transfer time is the time to actually transfer data once the head is positioned.

Formula:

```text
tT = b / (rN)
```

Where:

```text
b = number of bytes to transfer
r = revolutions per second
N = number of bytes on one track
```

Why?

```text
r × N = bytes transferred per second
```

So:

```text
transfer time = bytes needed / bytes per second
```

---

## 20. Full Disk Access Time Example

Given:

```text
Seek time = 8 ms
Speed = 7200 rpm
N = 1,048,576 bytes/track
b = 4096 bytes
```

Step 1: Convert rpm to rps.

```text
r = 7200 / 60
  = 120 rps
```

Step 2: Rotational latency.

```text
tL = 1 / (2 × 120)
   = 0.004167 s
   = 4.167 ms
```

Step 3: Transfer time.

```text
tT = 4096 / (120 × 1,048,576)
   = 4096 / 125,829,120
   ≈ 0.00003255 s
   = 0.03255 ms
```

Step 4: Block access time.

```text
tB = tS + tL + tT
   = 8 + 4.167 + 0.03255
   = 12.19955 ms
   ≈ 12.20 ms
```

Important lesson:

```text
seek time and rotational latency usually dominate HDD access time
```

---

# 21. RAID

RAID stands for:

```text
Redundant Array of Independent Disks
```

RAID uses multiple disks together.

To the operating system, the disks may appear as one logical drive.

```text
Operating system sees:
one logical drive

Actual hardware:
many physical disks
```

Main RAID goals:

```text
increase performance
increase reliability
increase capacity management
```

---

## 22. Striping

Striping means splitting data into pieces and spreading them across disks.

Example:

```text
Data: A B C D E F G H

Disk 0: A E
Disk 1: B F
Disk 2: C G
Disk 3: D H
```

Benefit:

```text
many disks can work in parallel
```

---

## 23. Strip vs Stripe

### Strip

One piece of data on one disk.

```text
Disk 0: [A0]
```

### Stripe

A row of strips across all disks.

```text
Stripe 0:

Disk 0   Disk 1   Disk 2   Disk 3
 A0       A1       A2       A3
```

Memory trick:

```text
strip  = one piece
stripe = one full row
```

---

# 24. RAID 0

RAID 0 uses striping only.

```text
RAID 0 = striping + no redundancy
```

Example:

```text
Disk 0   Disk 1   Disk 2   Disk 3
 A0       A1       A2       A3
 A4       A5       A6       A7
```

Advantage:

```text
high performance
full capacity used
```

Disadvantage:

```text
no fault tolerance
if one disk fails, data may be lost
```

Capacity:

```text
RAID 0 capacity = D × C
```

Where:

```text
D = number of disks
C = capacity per disk
```

Example:

```text
5 disks × 300 GB = 1500 GB
```

---

# 25. RAID 1

RAID 1 uses mirroring.

```text
RAID 1 = same data copied to another disk
```

Example:

```text
Disk 0: A B C D
Disk 1: A B C D
```

Advantage:

```text
high reliability
data still available if one disk fails
```

Disadvantage:

```text
uses extra disk capacity
write speed not doubled
```

Capacity:

```text
Usually usable capacity = half of raw capacity
```

For two disks:

```text
2 disks of 300 GB
usable capacity = 300 GB
```

Exam warning:

```text
If all drives mirror the same data, usable capacity = one drive.
If drives are mirrored pairs, usable capacity = half of total raw capacity.
```

---

# 26. RAID 2

RAID 2 uses:

```text
small striping + Hamming code redundancy
```

Disk requirement:

```text
N + m
```

Where:

```text
N = data disks
m = Hamming/ECC disks
```

Purpose:

```text
detect and correct errors using Hamming code
```

RAID 2 is rare because modern disks already have internal error correction.

---

# 27. RAID 3

RAID 3 uses:

```text
bit-interleaved parity
```

Disk requirement:

```text
N + 1
```

Where:

```text
N = data disks
1 = dedicated parity disk
```

RAID 3 is parallel access. All disks participate in each I/O request.

Capacity:

```text
RAID 3 usable capacity = (D - 1) × C
```

Example:

```text
5 disks, 300 GB each

RAID 3 = (5 - 1) × 300
       = 1200 GB
```

---

## 28. Parity and XOR

Parity is usually calculated using XOR.

XOR rules:

```text
0 XOR 0 = 0
0 XOR 1 = 1
1 XOR 0 = 1
1 XOR 1 = 0
```

Example:

```text
Disk 0 = 1
Disk 1 = 0
Disk 2 = 1
Disk 3 = 1

Parity = 1 XOR 0 XOR 1 XOR 1
       = 1
```

Recovery example:

```text
Disk 0   Disk 1   Disk 2   Disk 3   Parity
  1        0        ?        1        1

Missing = 1 XOR 0 XOR 1 XOR 1
        = 1
```

---

# 29. RAID 4

RAID 4 uses:

```text
block-level striping + dedicated parity disk
```

Example:

```text
Disk 0   Disk 1   Disk 2   Disk 3   Parity
 A0       A1       A2       A3       P0
 B0       B1       B2       B3       P1
```

Capacity:

```text
RAID 4 usable capacity = (D - 1) × C
```

Main problem:

```text
dedicated parity disk bottleneck
```

Why?

Every write must update parity.

Small write steps:

```text
read old data
read old parity
write new data
write new parity
```

So one small write can require:

```text
2 reads + 2 writes
```

---

# 30. RAID 5

RAID 5 uses:

```text
block-level striping + distributed parity
```

Parity is spread across all disks.

Example:

```text
Disk 0   Disk 1   Disk 2   Disk 3   Disk 4
 P0       A0       A1       A2       A3
 B0       P1       B1       B2       B3
 C0       C1       P2       C2       C3
```

Advantage over RAID 4:

```text
no single fixed parity disk bottleneck
```

Capacity:

```text
RAID 5 usable capacity = (D - 1) × C
```

Fault tolerance:

```text
can usually survive 1 disk failure
```

---

# 31. RAID 6

RAID 6 uses:

```text
block-level striping + dual distributed parity
```

Meaning:

```text
two parity blocks per stripe
```

Example:

```text
Disk 0   Disk 1   Disk 2   Disk 3   Disk 4   Disk 5
 P0       Q0       A0       A1       A2       A3
 B0       P1       Q1       B1       B2       B3
```

Advantage:

```text
can usually survive 2 disk failures
```

Disadvantage:

```text
higher write penalty than RAID 5
```

Capacity:

```text
RAID 6 usable capacity = (D - 2) × C
```

Example:

```text
5 disks, 300 GB each

RAID 6 = (5 - 2) × 300
       = 900 GB
```

---

# 32. RAID Capacity Summary

Let:

```text
D = total number of disks
C = capacity per disk
```

| RAID Level | Usable Capacity                                       |
| ---------- | ----------------------------------------------------- |
| RAID 0     | `D × C`                                               |
| RAID 1     | usually `(D × C) / 2`, or one disk if full mirror set |
| RAID 2     | `N × C`, extra `m` disks for Hamming code             |
| RAID 3     | `(D - 1) × C`                                         |
| RAID 4     | `(D - 1) × C`                                         |
| RAID 5     | `(D - 1) × C`                                         |
| RAID 6     | `(D - 2) × C`                                         |

Example with 5 disks, 300 GB each:

```text
Raw capacity = 5 × 300 = 1500 GB
```

| RAID Level |            Calculation |  Capacity |
| ---------- | ---------------------: | --------: |
| RAID 0     |              `5 × 300` | `1500 GB` |
| RAID 1     | full mirror assumption |  `300 GB` |
| RAID 3     |        `(5 - 1) × 300` | `1200 GB` |
| RAID 4     |        `(5 - 1) × 300` | `1200 GB` |
| RAID 5     |        `(5 - 1) × 300` | `1200 GB` |
| RAID 6     |        `(5 - 2) × 300` |  `900 GB` |

---

# 33. SSD: Solid State Drive

SSD stands for:

```text
Solid State Drive
```

SSD uses semiconductor memory, commonly NAND flash memory.

Main difference:

```text
HDD = spinning magnetic disk + moving head
SSD = NAND flash chips + controller
```

---

## 34. Why SSD is Faster Than HDD

HDD needs:

```text
seek time
rotational latency
transfer time
```

SSD has:

```text
no spinning disk
no moving head
no mechanical seek
no rotational latency
```

So SSD has lower latency and higher IOPS.

IOPS means:

```text
Input/Output Operations Per Second
```

---

## 35. SSD Architecture

Simple SSD architecture:

```text
Host computer
+----------------------+
| File system          |
| I/O driver           |
+----------+-----------+
           |
           | PCIe / USB / interface
           ↓
SSD
+----------------------+
| Controller           |
| Addressing logic     |
| Data buffer/cache    |
| Error correction     |
| NAND flash chips     |
+----------------------+
```

---

## 36. SSD Controller

The SSD controller manages:

```text
reading
writing
error correction
address mapping
wear leveling
bad-block management
```

The OS may request:

```text
Read logical block 5000
```

The controller finds where that data is physically stored inside NAND flash.

---

## 37. NAND Flash

NAND flash stores data using trapped electrical charge.

Beginner idea:

```text
charge state A = 0
charge state B = 1
```

NAND flash is non-volatile.

```text
power off → data remains
```

---

## 38. Flash Page and Block

Flash is usually read/written in pages, but erased in blocks.

Example:

```text
1 page = 4 KB
1 block = 512 KB
```

Calculation:

```text
512 KB / 4 KB = 128 pages per block
```

Important:

```text
You cannot erase only one small page.
Usually the whole block must be erased.
```

---

## 39. Why SSD Can Slow Down

To update one page, SSD may need to:

```text
read whole block
modify one page in buffer
erase whole block
write whole block back
```

This is why SSD management is important.

---

## 40. TRIM

TRIM is a command from the OS to the SSD.

It tells the SSD:

```text
These blocks are no longer used.
You may clean them internally.
```

Flow:

```text
User deletes file
        ↓
OS marks space free
        ↓
OS sends TRIM
        ↓
SSD prepares free blocks
        ↓
future writes are faster
```

---

## 41. Over-Provisioning

Over-provisioning means the SSD reserves hidden spare space.

Purpose:

```text
help write management
improve performance
extend lifetime
replace bad blocks
```

---

## 42. Wear Leveling

Flash cells wear out after many write/erase cycles.

Wear leveling spreads writes evenly.

```text
Without wear leveling:
same blocks wear out quickly

With wear leveling:
writes spread across many blocks
```

Purpose:

```text
increase SSD lifetime
```

---

## 43. Bad-Block Management

If a flash block becomes unreliable, SSD marks it as bad.

```text
Bad block detected
        ↓
stop using that block
        ↓
use spare block instead
```

---

# 44. Optical Memory

Optical memory reads data using light, usually a laser.

Examples:

```text
CD
CD-ROM
CD-R
CD-RW
DVD
Blu-ray
```

Comparison:

```text
Magnetic disk = magnetism
SSD = electronic charge
Optical disk = laser reflection
```

---

## 45. CD-ROM

CD-ROM means:

```text
Compact Disk Read-Only Memory
```

It can be read but not normally rewritten.

CD-ROM uses:

```text
pits
lands
laser
photo sensor
```

---

## 46. Pits and Lands

```text
Pits  = tiny lower/rough areas
Lands = flat/smooth areas
```

They reflect light differently.

Important:

```text
Do not simply say pit = 1 and land = 0.
The transition between pit and land represents 1.
No transition represents 0.
```

---

## 47. CD Reading Operation

```text
Laser shines on disk
        ↓
pits and lands reflect differently
        ↓
photo sensor detects intensity changes
        ↓
digital signal is produced
```

Diagram:

```text
Laser
  ↓
CD surface with pits and lands
  ↑
reflected light
  ↑
photo sensor
```

---

## 48. Spiral Track and CLV

CD uses one spiral track.

```text
center → spiral outward → edge
```

CD uses CLV:

```text
Constant Linear Velocity
```

Meaning:

```text
laser reads along the spiral at constant linear speed
```

Near center:

```text
disk rotates faster
```

Near outer edge:

```text
disk rotates slower
```

---

## 49. CAV vs CLV

| Feature        | CAV                       | CLV                      |
| -------------- | ------------------------- | ------------------------ |
| Full name      | Constant Angular Velocity | Constant Linear Velocity |
| Rotation speed | constant RPM              | RPM changes              |
| Common use     | magnetic disk idea        | CD/CD-ROM                |
| Track layout   | concentric tracks         | spiral track             |
| Random access  | easier                    | harder                   |

---

## 50. CD-ROM Block Format

CD-ROM block contains:

```text
Sync
Header
Data
Auxiliary
```

### Sync

Marks the beginning of a block.

### Header

Contains block address and mode byte.

### Data

Stores user data.

### Auxiliary

Stores extra information or error correction.

---

## 51. CD-R and CD-RW

### CD-R

CD-R means:

```text
CD Recordable
```

It is:

```text
write once, read many
```

### CD-RW

CD-RW means:

```text
CD Rewritable
```

It can be erased and rewritten multiple times.

CD-RW uses phase-change material.

Two states:

```text
amorphous state    → poor reflection
crystalline state  → good reflection
```

---

# 52. DVD

DVD means:

```text
Digital Versatile Disk
```

DVD stores more data than CD.

Reasons:

```text
bits packed more closely
smaller pits
closer spiral loops
can use dual layers
can be two-sided
```

Typical capacities:

```text
single-layer, single-side DVD ≈ 4.7 GB
dual-layer, single-side DVD ≈ 8.5 GB
dual-layer, double-side DVD ≈ 17 GB
```

---

# 53. Blu-ray

Blu-ray uses blue-violet laser.

Key idea:

```text
shorter wavelength laser
        ↓
smaller laser spot
        ↓
smaller pits and tracks
        ↓
higher capacity
```

Typical single-layer Blu-ray capacity:

```text
25 GB
```

Blu-ray types:

```text
BD-ROM = read only
BD-R   = record once
BD-RE  = rewritable
```

---

# 54. Magnetic Tape

Magnetic tape is a long flexible polyester tape coated with magnetizable material.

It uses magnetic recording like disk, but its access method is different.

Main characteristic:

```text
sequential access
```

---

## 55. Tape vs Disk

| Feature                | Magnetic Disk    | Magnetic Tape       |
| ---------------------- | ---------------- | ------------------- |
| Shape                  | circular platter | long flexible strip |
| Access                 | direct access    | sequential access   |
| Good for               | fast file access | backup/archive      |
| Random access          | faster           | slow                |
| Cost per large storage | higher than tape | low                 |

---

## 56. Tape Tracks

Data is stored on parallel tracks running lengthwise.

```text
+---------------------------------------+
| Track 0 ----------------------------> |
| Track 1 ----------------------------> |
| Track 2 ----------------------------> |
| Track 3 ----------------------------> |
+---------------------------------------+
```

---

## 57. Physical Records and Inter-Record Gaps

Tape data is read/written in blocks called physical records.

```text
[Record 1] gap [Record 2] gap [Record 3]
```

Inter-record gaps separate records.

Purpose:

```text
help identify boundaries between records
```

---

## 58. Sequential Access

Sequential access means the tape must pass earlier records first.

Example:

```text
Want record 7
Head at record 1

Must pass:
1 → 2 → 3 → 4 → 5 → 6 → 7
```

This is why tape is slow for finding one specific file.

But tape is good for:

```text
backup
archive
large sequential storage
```

---

## 59. Serpentine Recording

Serpentine recording writes data back and forth.

```text
Track 0:  -------------------------------->
Track 1:  <--------------------------------
Track 2:  -------------------------------->
Track 3:  <--------------------------------
```

Why useful?

```text
uses tape efficiently
avoids unnecessary rewind before continuing
```

---

## 60. LTO Tape

LTO means:

```text
Linear Tape-Open
```

LTO is a common professional tape technology.

Used for:

```text
data center backup
university server backup
hospital archive
company long-term records
```

Newer LTO generations increase:

```text
capacity
transfer rate
number of tracks
features
```

Features include:

```text
WORM
encryption
partitioning
```

WORM means:

```text
Write Once, Read Many
```

---

# 61. Common Mistakes

## Disk Mistakes

```text
Mistake: sector is bigger than track
Correct: sector is part of a track
```

```text
Mistake: seek time = rotational latency
Correct:
seek time = move head
rotational latency = wait for sector
```

```text
Mistake: use rpm directly in formula
Correct: convert rpm to rps first
```

---

## RAID Mistakes

```text
Mistake: RAID 0 is safe
Correct: RAID 0 has no redundancy
```

```text
Mistake: RAID 5 has fixed parity disk
Correct: RAID 5 has distributed parity
```

```text
Mistake: RAID 6 capacity = (D - 1) × C
Correct: RAID 6 capacity = (D - 2) × C
```

---

## SSD Mistakes

```text
Mistake: SSD has rotational latency
Correct: SSD has no spinning disk
```

```text
Mistake: SSD cells last forever
Correct: flash cells wear out
```

```text
Mistake: SSD can erase one byte easily
Correct: flash erase is block-based
```

---

## Optical Disk Mistakes

```text
Mistake: pit = 1 and land = 0
Correct: transition represents 1
```

```text
Mistake: CD-R can be rewritten
Correct: CD-R is write once
```

```text
Mistake: Blu-ray stores more only because disk is bigger
Correct: shorter wavelength laser allows smaller pits
```

---

## Tape Mistakes

```text
Mistake: tape is direct access
Correct: tape is sequential access
```

```text
Mistake: inter-record gaps store user data
Correct: gaps separate records
```

```text
Mistake: tape is useless because it is slow
Correct: tape is useful for backup and archive
```

---

# 62. Viva / Exam-Style Questions

## Magnetic Disk

1. What is a magnetic disk?
2. Why are glass substrates used in modern disks?
3. Explain how data is written to a magnetic disk.
4. What is a magnetoresistive read head?
5. What are tracks and sectors?
6. What is the function of intersector gaps?
7. Compare CAV and MZR.
8. What is a cylinder?
9. What is the difference between fixed-head and movable-head disks?

---

## Disk Performance

1. Define seek time.
2. Define rotational latency.
3. Define transfer time.
4. Write the formula for average rotational latency.
5. Write the formula for transfer time.
6. Write the formula for block access time.
7. Why must rpm be converted to rps?
8. A disk rotates at 6000 rpm. Calculate average rotational latency.

Answer:

```text
r = 6000 / 60
  = 100 rps

tL = 1 / (2 × 100)
   = 1 / 200
   = 0.005 s
   = 5 ms
```

---

## RAID

1. What does RAID stand for?
2. What is striping?
3. What is the difference between strip and stripe?
4. Why is RAID 0 fast but unsafe?
5. How does RAID 1 improve reliability?
6. What is parity?
7. What is the main difference between RAID 4 and RAID 5?
8. Why does RAID 6 tolerate two disk failures?
9. Calculate RAID 5 capacity for 8 disks of 500 GB each.

Answer:

```text
RAID 5 = (8 - 1) × 500 GB
       = 3500 GB
       = 3.5 TB
```

10. Calculate RAID 6 capacity for 8 disks of 500 GB each.

Answer:

```text
RAID 6 = (8 - 2) × 500 GB
       = 3000 GB
       = 3 TB
```

---

## SSD

1. What does SSD stand for?
2. Why is SSD faster than HDD?
3. What is NAND flash?
4. What is the role of the SSD controller?
5. What is TRIM?
6. What is wear leveling?
7. Why can SSD performance slow down over time?

---

## Optical Memory

1. What is optical memory?
2. What are pits and lands?
3. How does a CD drive read data?
4. What is CLV?
5. Compare CD-R and CD-RW.
6. Why does DVD store more data than CD?
7. Why does Blu-ray store more data than DVD?

---

## Magnetic Tape

1. What is magnetic tape made of?
2. Why is magnetic tape sequential access?
3. What is a physical record?
4. What is an inter-record gap?
5. What is serpentine recording?
6. What does LTO stand for?
7. Why is magnetic tape still used?

---

# 63. Final Mini Checkpoint

Try answering without looking:

1. What are the three parts of disk access time?
2. A disk rotates at 7200 rpm. What is average rotational latency?
3. What is the difference between RAID 0 and RAID 1?
4. What is the difference between RAID 5 and RAID 6?
5. Why does SSD not have seek time?
6. What does TRIM do?
7. Why does Blu-ray have higher capacity than DVD?
8. Why is tape good for backup but bad for random access?

---

# 64. Chapter 7 One-Page Memory Map

```text
Chapter 7: External Memory

External Memory
│
├── Magnetic Disk
│   ├── magnetic platter
│   ├── read/write head
│   ├── tracks and sectors
│   ├── CAV and MZR
│   ├── sector format
│   ├── physical characteristics
│   └── performance:
│       ├── seek time
│       ├── rotational latency
│       ├── transfer time
│       └── block access time
│
├── RAID
│   ├── RAID 0: striping, no redundancy
│   ├── RAID 1: mirroring
│   ├── RAID 2: Hamming code
│   ├── RAID 3: bit parity, dedicated parity
│   ├── RAID 4: block parity, dedicated parity
│   ├── RAID 5: distributed parity
│   └── RAID 6: dual distributed parity
│
├── SSD
│   ├── NAND flash
│   ├── no seek time
│   ├── no rotational latency
│   ├── controller
│   ├── cache
│   ├── ECC
│   ├── TRIM
│   └── wear leveling
│
├── Optical Memory
│   ├── CD-ROM
│   ├── CD-R
│   ├── CD-RW
│   ├── DVD
│   └── Blu-ray
│
└── Magnetic Tape
    ├── sequential access
    ├── physical records
    ├── inter-record gaps
    ├── serpentine recording
    └── LTO
```

---

# 65. Final Exam Formula Sheet

## Sector Efficiency

```text
Efficiency = user data / (user data + overhead)
```

Legacy sector:

```text
512 / (512 + 65) ≈ 88.7%
```

Advanced Format:

```text
4096 / (4096 + 115) ≈ 97.3%
```

---

## Rotational Latency

```text
tL = 1 / (2r)
```

```text
r = rpm / 60
```

---

## Transfer Time

```text
tT = b / (rN)
```

Where:

```text
b = bytes to transfer
r = revolutions per second
N = bytes per track
```

---

## Block Access Time

```text
tB = tS + tL + tT
```

Where:

```text
tS = seek time
tL = rotational latency
tT = transfer time
```

---

## RAID Capacity

```text
RAID 0 = D × C
RAID 1 = usually (D × C) / 2
RAID 3 = (D - 1) × C
RAID 4 = (D - 1) × C
RAID 5 = (D - 1) × C
RAID 6 = (D - 2) × C
```

Where:

```text
D = number of disks
C = capacity per disk
```

---

# End of Chapter 7 Notes

You have completed Chapter 7: External Memory.
