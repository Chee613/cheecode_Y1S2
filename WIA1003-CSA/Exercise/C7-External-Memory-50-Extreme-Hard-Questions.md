# Chapter 7 External Memory: 50 Extreme-Hard Questions

## Question 1

**Question:** What physically records a bit on magnetic disk?

**Choices:**
- **A.** Magnetization direction of a tiny surface region
- **B.** A DRAM capacitor charge
- **C.** An optical pit only
- **D.** A transistor latch

**Correct Answer:** Magnetization direction of a tiny surface region

**Explanation:** The write head aligns magnetic domains; the read head senses transitions.

---

## Question 2

**Question:** Why are intersector and intertrack gaps present?

**Choices:**
- **A.** They replace ECC
- **B.** They tolerate positioning and timing uncertainty
- **C.** They increase areal density
- **D.** They store user payload

**Correct Answer:** They tolerate positioning and timing uncertainty

**Explanation:** Guard space prevents neighboring records from overlapping under mechanical variation.

---

## Question 3

**Question:** A legacy sector has 512 data bytes and 65 overhead bytes. What is efficiency?

**Choices:**
- **A.** 512%
- **B.** 12.70%
- **C.** 88.73%
- **D.** 97.27%

**Correct Answer:** 88.73%

**Explanation:** 512/(512+65) = 0.8873.

---

## Question 4

**Question:** An advanced sector has 4096 data bytes and 115 overhead bytes. What is efficiency?

**Choices:**
- **A.** 96.00%
- **B.** 88.73%
- **C.** 102.81%
- **D.** 97.27%

**Correct Answer:** 97.27%

**Explanation:** 4096/4211 = 0.9727.

---

## Question 5

**Question:** Why does multiple-zone recording beat simple CAV capacity?

**Choices:**
- **A.** Outer tracks hold more sectors while RPM stays constant
- **B.** RPM increases on outer tracks
- **C.** Every track has equal length
- **D.** It removes sector gaps

**Correct Answer:** Outer tracks hold more sectors while RPM stays constant

**Explanation:** Longer outer circumferences can store more bits without changing angular speed.

---

## Question 6

**Question:** What is a cylinder?

**Choices:**
- **A.** One sector plus ECC
- **B.** Same-radius tracks across all platter surfaces
- **C.** All tracks on one surface
- **D.** A vertical stack of disks only

**Correct Answer:** Same-radius tracks across all platter surfaces

**Explanation:** A head switch can access another surface at the same actuator position.

---

## Question 7

**Question:** What is average rotational latency at 7200 rpm?

**Choices:**
- **A.** 2 ms
- **B.** 8.333 ms
- **C.** 4.167 ms
- **D.** 7.2 ms

**Correct Answer:** 4.167 ms

**Explanation:** 7200 rpm = 120 rps, so average half-rotation time is 1/(2×120).

---

## Question 8

**Question:** What is average rotational latency at 15,000 rpm?

**Choices:**
- **A.** 0.25 ms
- **B.** 4 ms
- **C.** 15 ms
- **D.** 2 ms

**Correct Answer:** 2 ms

**Explanation:** 15,000 rpm = 250 rps, giving 1/(500) s = 2 ms.

---

## Question 9

**Question:** A 7200-rpm track stores 1,048,576 bytes. How long transfers 4096 contiguous bytes?

**Choices:**
- **A.** 0.03255 ms
- **B.** 0.3255 ms
- **C.** 8 ms
- **D.** 4.167 ms

**Correct Answer:** 0.03255 ms

**Explanation:** tT = 4096/(120×1,048,576) seconds.

---

## Question 10

**Question:** Seek = 8 ms, average rotation = 4.167 ms, transfer = 0.03255 ms. What is access time?

**Choices:**
- **A.** 8.19955 ms
- **B.** 12.19955 ms
- **C.** 4.19955 ms
- **D.** 12.03255 ms

**Correct Answer:** 12.19955 ms

**Explanation:** Block access time is the sum of seek, rotational latency, and transfer.

---

## Question 11

**Question:** For small random HDD reads, which terms usually dominate?

**Choices:**
- **A.** ECC generation only
- **B.** Transfer time only
- **C.** Seek time and rotational latency
- **D.** Sector data size only

**Correct Answer:** Seek time and rotational latency

**Explanation:** Mechanical positioning costs far exceed transferring a few kilobytes.

---

## Question 12

**Question:** What usable capacity does RAID 0 provide with five 300 GB disks?

**Choices:**
- **A.** 1200 GB
- **B.** 900 GB
- **C.** 300 GB
- **D.** 1500 GB

**Correct Answer:** 1500 GB

**Explanation:** RAID 0 uses all D×C capacity with no redundancy.

---

## Question 13

**Question:** What usable capacity does mirrored-pair RAID 1 provide with six 2 TB disks?

**Choices:**
- **A.** 6 TB
- **B.** 12 TB
- **C.** 10 TB
- **D.** 2 TB

**Correct Answer:** 6 TB

**Explanation:** Half of raw capacity stores mirror copies.

---

## Question 14

**Question:** What usable capacity does RAID 5 provide with eight 4 TB disks?

**Choices:**
- **A.** 16 TB
- **B.** 28 TB
- **C.** 24 TB
- **D.** 32 TB

**Correct Answer:** 28 TB

**Explanation:** Distributed single parity costs one disk: (8−1)×4.

---

## Question 15

**Question:** What usable capacity does RAID 6 provide with eight 4 TB disks?

**Choices:**
- **A.** 32 TB
- **B.** 28 TB
- **C.** 24 TB
- **D.** 20 TB

**Correct Answer:** 24 TB

**Explanation:** Dual parity costs two disks: (8−2)×4.

---

## Question 16

**Question:** Which RAID level has striping but no fault tolerance?

**Choices:**
- **A.** RAID 6
- **B.** RAID 1
- **C.** RAID 5
- **D.** RAID 0

**Correct Answer:** RAID 0

**Explanation:** Any disk failure can destroy a striped RAID 0 array.

---

## Question 17

**Question:** Which RAID level uses byte-level striping and a dedicated parity disk?

**Choices:**
- **A.** RAID 3
- **B.** RAID 0
- **C.** RAID 6
- **D.** RAID 1

**Correct Answer:** RAID 3

**Explanation:** RAID 3 coordinates all disks for each parallel-access request.

---

## Question 18

**Question:** What bottleneck distinguishes RAID 4 from RAID 5?

**Choices:**
- **A.** RAID 5 mirrors all disks
- **B.** RAID 4 concentrates parity writes on one disk
- **C.** RAID 4 has no parity
- **D.** RAID 5 tolerates no failures

**Correct Answer:** RAID 4 concentrates parity writes on one disk

**Explanation:** RAID 5 distributes parity blocks to balance write load.

---

## Question 19

**Question:** How many arbitrary disk failures can RAID 6 tolerate?

**Choices:**
- **A.** 0
- **B.** 1
- **C.** 2
- **D.** Any number

**Correct Answer:** 2

**Explanation:** Two independent parity syndromes preserve data after any two failures.

---

## Question 20

**Question:** Data bits are 1,0,1,1. What even XOR parity bit results?

**Choices:**
- **A.** 0
- **B.** 2
- **C.** Undefined
- **D.** 1

**Correct Answer:** 1

**Explanation:** 1 XOR 0 XOR 1 XOR 1 = 1.

---

## Question 21

**Question:** In the previous stripe, the second data bit is lost. Given parity 1 and remaining 1,1,1, what was missing?

**Choices:**
- **A.** 0
- **B.** Parity cannot reconstruct it
- **C.** 1
- **D.** 2

**Correct Answer:** 0

**Explanation:** Missing = parity XOR remaining values = 1 XOR 1 XOR 1 XOR 1 = 0.

---

## Question 22

**Question:** Why is RAID 2 rarely used?

**Choices:**
- **A.** It has infinite parity disks
- **B.** Modern drives already provide internal error correction
- **C.** It provides no striping
- **D.** It works only with SSDs

**Correct Answer:** Modern drives already provide internal error correction

**Explanation:** Dedicated Hamming-code disks add complexity with little modern benefit.

---

## Question 23

**Question:** A four-disk RAID 5 loses one disk. What operational state remains?

**Choices:**
- **A.** All data is immediately unrecoverable
- **B.** Faster than normal with no risk
- **C.** Degraded but reconstructable
- **D.** Equivalent to RAID 0 permanently

**Correct Answer:** Degraded but reconstructable

**Explanation:** Single parity reconstructs missing blocks, but another failure is dangerous.

---

## Question 24

**Question:** Why is rebuilding a large degraded RAID risky?

**Choices:**
- **A.** Capacity doubles
- **B.** Parity becomes unnecessary
- **C.** Seek time becomes zero
- **D.** Every surviving disk is heavily read while redundancy is reduced

**Correct Answer:** Every surviving disk is heavily read while redundancy is reduced

**Explanation:** A second error during the long rebuild can exceed fault tolerance.

---

## Question 25

**Question:** What is the smallest writable unit in NAND flash?

**Choices:**
- **A.** Page
- **B.** Block
- **C.** Bit
- **D.** Entire SSD

**Correct Answer:** Page

**Explanation:** Pages are programmed, while larger blocks are erased.

---

## Question 26

**Question:** What is the smallest erase unit in NAND flash?

**Choices:**
- **A.** Page
- **B.** Block
- **C.** Byte
- **D.** Sector header

**Correct Answer:** Block

**Explanation:** Flash cannot overwrite arbitrary pages without erasing their containing block.

---

## Question 27

**Question:** Why can an SSD slow after sustained random writes?

**Choices:**
- **A.** The platters need longer seeks
- **B.** The tape must rewind
- **C.** Garbage collection must copy valid pages before block erase
- **D.** Pits become lands

**Correct Answer:** Garbage collection must copy valid pages before block erase

**Explanation:** Out-of-place updates eventually require consolidation and erasure.

---

## Question 28

**Question:** What does TRIM communicate?

**Choices:**
- **A.** The optical laser wavelength
- **B.** The next HDD cylinder
- **C.** A RAID parity bit
- **D.** Which logical blocks no longer contain needed data

**Correct Answer:** Which logical blocks no longer contain needed data

**Explanation:** The SSD may reclaim trimmed pages without preserving stale contents.

---

## Question 29

**Question:** What is over-provisioning?

**Choices:**
- **A.** Flash capacity reserved from user addressing for controller management
- **B.** Storing two copies of every file
- **C.** Increasing RPM
- **D.** Removing ECC

**Correct Answer:** Flash capacity reserved from user addressing for controller management

**Explanation:** Spare area supports garbage collection, replacement, and write endurance.

---

## Question 30

**Question:** What problem does wear leveling address?

**Choices:**
- **A.** HDD rotational latency
- **B.** Uneven flash erase-cycle consumption
- **C.** Tape seek order
- **D.** Optical diffraction

**Correct Answer:** Uneven flash erase-cycle consumption

**Explanation:** The controller spreads writes so a hot logical region does not exhaust a few blocks.

---

## Question 31

**Question:** What is bad-block management?

**Choices:**
- **A.** Mirroring all SSDs
- **B.** Disabling ECC
- **C.** Remapping unusable flash blocks to spare blocks
- **D.** Increasing page size dynamically

**Correct Answer:** Remapping unusable flash blocks to spare blocks

**Explanation:** Controllers hide manufacturing and worn-out defects from logical addressing.

---

## Question 32

**Question:** Why are SSD random reads faster than HDD random reads?

**Choices:**
- **A.** They spin at higher RPM
- **B.** They read only sequentially
- **C.** They use larger intertrack gaps
- **D.** They avoid mechanical seek and rotation

**Correct Answer:** They avoid mechanical seek and rotation

**Explanation:** Electronic access removes millisecond positioning delays.

---

## Question 33

**Question:** What causes SSD write amplification?

**Choices:**
- **A.** Internal bytes written exceed host bytes due to relocation and erase
- **B.** Every read writes two copies
- **C.** TRIM duplicates pages
- **D.** RAID parity is always used

**Correct Answer:** Internal bytes written exceed host bytes due to relocation and erase

**Explanation:** Garbage collection copies valid data while servicing small logical writes.

---

## Question 34

**Question:** A host writes 100 GB while NAND receives 250 GB. What is write amplification?

**Choices:**
- **A.** 0.4
- **B.** 2.5
- **C.** 250
- **D.** 1.5

**Correct Answer:** 2.5

**Explanation:** Write amplification = physical NAND writes / host writes = 250/100.

---

## Question 35

**Question:** What optical feature represents recorded transitions on a CD-ROM?

**Choices:**
- **A.** Flash pages
- **B.** Magnetic domains
- **C.** Pits and lands
- **D.** DRAM rows

**Correct Answer:** Pits and lands

**Explanation:** Laser reflection changes at pit-land transitions encode information.

---

## Question 36

**Question:** Why does a CD commonly use constant linear velocity?

**Choices:**
- **A.** Every radius has equal circumference
- **B.** It eliminates the spiral
- **C.** The disc keeps constant RPM
- **D.** The track passes the laser at roughly constant linear speed

**Correct Answer:** The track passes the laser at roughly constant linear speed

**Explanation:** RPM changes with radius to maintain a stable bit rate and density.

---

## Question 37

**Question:** How does CAV differ from CLV?

**Choices:**
- **A.** CAV keeps RPM constant; CLV keeps linear track speed constant
- **B.** CAV is optical only; CLV is magnetic only
- **C.** Both keep RPM constant
- **D.** CLV has no rotation

**Correct Answer:** CAV keeps RPM constant; CLV keeps linear track speed constant

**Explanation:** Their control targets differ as radius changes.

---

## Question 38

**Question:** Which medium is write-once?

**Choices:**
- **A.** CD-RW
- **B.** CD-R
- **C.** RAM
- **D.** Magnetic disk

**Correct Answer:** CD-R

**Explanation:** Its recording layer is irreversibly altered during writing.

---

## Question 39

**Question:** Which medium can be erased and rewritten through phase-change material?

**Choices:**
- **A.** CD-ROM
- **B.** CD-R
- **C.** CD-RW
- **D.** Mask ROM

**Correct Answer:** CD-RW

**Explanation:** Heating switches the recording layer between optical states.

---

## Question 40

**Question:** Why can Blu-ray store more than DVD at similar disc size?

**Choices:**
- **A.** It uses magnetic heads
- **B.** It spins only once
- **C.** It has no error correction
- **D.** Shorter-wavelength light and tighter focusing create smaller marks

**Correct Answer:** Shorter-wavelength light and tighter focusing create smaller marks

**Explanation:** Smaller optical spots increase track and bit density.

---

## Question 41

**Question:** What access pattern makes magnetic tape economical?

**Choices:**
- **A.** Large sequential transfers and archival scans
- **B.** Per-byte random reads
- **C.** Tiny random updates
- **D.** CPU cache fills

**Correct Answer:** Large sequential transfers and archival scans

**Explanation:** Tape offers high capacity but costly positioning.

---

## Question 42

**Question:** Why are inter-record gaps costly on tape?

**Choices:**
- **A.** They erase records
- **B.** They consume length without user data
- **C.** They double tape speed
- **D.** They cause disk seeks

**Correct Answer:** They consume length without user data

**Explanation:** Larger logical blocking amortizes fixed gap overhead.

---

## Question 43

**Question:** What is serpentine recording?

**Choices:**
- **A.** The tape never reverses
- **B.** All tracks are written simultaneously
- **C.** The tape records one direction, switches tracks, then records back
- **D.** Data forms disk cylinders

**Correct Answer:** The tape records one direction, switches tracks, then records back

**Explanation:** Alternating directions reduce full rewinds between adjacent tracks.

---

## Question 44

**Question:** A tape streams at 300 MB/s but requires 60 s to position. How long reads a contiguous 60 GB file?

**Choices:**
- **A.** 20 s
- **B.** 200 s
- **C.** 60 s
- **D.** 260 s

**Correct Answer:** 260 s

**Explanation:** Transfer takes 60,000/300 = 200 s, plus 60 s positioning.

---

## Question 45

**Question:** A 10 TB RAID 1 mirror uses two identical disks. How much raw capacity is installed?

**Choices:**
- **A.** 20 TB
- **B.** 5 TB
- **C.** 10 TB
- **D.** 30 TB

**Correct Answer:** 20 TB

**Explanation:** Mirroring stores two copies, so raw capacity is twice usable capacity.

---

## Question 46

**Question:** Six 1 TB disks in RAID 6 lose two disks. What usable data remains accessible?

**Choices:**
- **A.** 6 TB
- **B.** 4 TB
- **C.** 0 TB
- **D.** 2 TB

**Correct Answer:** 4 TB

**Explanation:** The arrays usable capacity is (6−2)×1 = 4 TB and two failures are tolerated.

---

## Question 47

**Question:** Why does a RAID controller need parity for writes as well as recovery?

**Choices:**
- **A.** Parity stores file names only
- **B.** Reads cannot use data disks
- **C.** Parity must remain consistent with every updated stripe
- **D.** Mirrors require XOR

**Correct Answer:** Parity must remain consistent with every updated stripe

**Explanation:** Stale parity would reconstruct incorrect data after failure.

---

## Question 48

**Question:** A disk rotates at 6000 rpm. What time is one full revolution?

**Choices:**
- **A.** 5 ms
- **B.** 6 ms
- **C.** 100 ms
- **D.** 10 ms

**Correct Answer:** 10 ms

**Explanation:** 6000 rpm = 100 rps, so one revolution takes 0.01 s.

---

## Question 49

**Question:** On that 6000-rpm disk, what is average rotational latency?

**Choices:**
- **A.** 5 ms
- **B.** 6 ms
- **C.** 2.5 ms
- **D.** 10 ms

**Correct Answer:** 5 ms

**Explanation:** Average waiting is half a revolution.

---

## Question 50

**Question:** Which storage choice best fits monthly offline backups with huge sequential volume and lowest cost per byte?

**Choices:**
- **A.** CPU registers
- **B.** Magnetic tape
- **C.** NOR flash
- **D.** SRAM

**Correct Answer:** Magnetic tape

**Explanation:** Tapes capacity and cost dominate when long sequential access and positioning delay are acceptable.
