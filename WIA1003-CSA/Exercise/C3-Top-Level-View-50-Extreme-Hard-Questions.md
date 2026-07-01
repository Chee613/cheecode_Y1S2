# Chapter 3 Top-Level View and Interconnection: 50 Extreme-Hard Questions

## Question 1

**Question:** A machine stores instructions and data in the same read-write memory. Which bottleneck follows directly from this von Neumann organization?

**Choices:**
- **A.** Instruction and data transfers compete for a shared path
- **B.** Every instruction requires a separate physical memory
- **C.** Data can never be modified
- **D.** The CPU cannot execute branches

**Correct Answer:** Instruction and data transfers compete for a shared path

**Explanation:** The shared route limits simultaneous instruction and data movement, producing the von Neumann bottleneck.

---

## Question 2

**Question:** During fetch, PC = 0x400 and Memory[0x400] contains 0x1940. After a one-word fetch, what state is correct?

**Choices:**
- **A.** IR = 0x401 and PC = 0x400
- **B.** IR = 0x1940 and PC = 0x401
- **C.** MAR = 0x1940 and MBR = 0x401
- **D.** IR = 0x400 and PC = 0x1940

**Correct Answer:** IR = 0x1940 and PC = 0x401

**Explanation:** The PC supplies the instruction address, the instruction enters IR, and the PC advances to the next word.

---

## Question 3

**Question:** A memory read requests address 940 and returns 0003. Which register pair must momentarily contain those two values?

**Choices:**
- **A.** I/OAR = 940 and IR = 0003
- **B.** PC = 940 and AC = 0003
- **C.** MAR = 940 and MBR = 0003
- **D.** MBR = 940 and MAR = 0003

**Correct Answer:** MAR = 940 and MBR = 0003

**Explanation:** MAR carries the memory address, while MBR carries the transferred memory value.

---

## Question 4

**Question:** The CPU reads byte 0x7E from device port 12. Which register assignment is conceptually correct?

**Choices:**
- **A.** MAR = 12 and PC = 0x7E
- **B.** IR = 12 and MBR = 0x7E
- **C.** I/OBR = 12 and I/OAR = 0x7E
- **D.** I/OAR = 12 and I/OBR = 0x7E

**Correct Answer:** I/OAR = 12 and I/OBR = 0x7E

**Explanation:** I/OAR selects the device or port, and I/OBR carries the I/O data.

---

## Question 5

**Question:** Which detailed instruction-cycle state may be skipped when an instruction uses only register operands already named in the IR?

**Choices:**
- **A.** Operand address calculation
- **B.** Instruction fetch
- **C.** Instruction operation decoding
- **D.** Data operation

**Correct Answer:** Operand address calculation

**Explanation:** No effective memory address is needed when all operands are directly available in registers.

---

## Question 6

**Question:** A 16-bit instruction uses a 5-bit opcode. If all remaining bits form a direct word address, what are the maximum opcode count and addressable words?

**Choices:**
- **A.** 64 operations and 1024 words
- **B.** 32 operations and 2048 words
- **C.** 32 operations and 4096 words
- **D.** 16 operations and 4096 words

**Correct Answer:** 32 operations and 2048 words

**Explanation:** Five opcode bits encode 2^5 = 32 operations, leaving 11 address bits for 2^11 = 2048 words.

---

## Question 7

**Question:** In the notes machine, opcode 1 means LOAD. What does instruction 1940 do?

**Choices:**
- **A.** PC jumps to address 940
- **B.** Memory[940] receives AC
- **C.** AC receives Memory[940]
- **D.** AC receives the literal value 940

**Correct Answer:** AC receives Memory[940]

**Explanation:** The first hexadecimal digit is LOAD and the remaining digits identify memory address 940.

---

## Question 8

**Question:** Which state ordering is valid for an instruction that fetches a memory operand and stores a result?

**Choices:**
- **A.** if → iac → of → iod → os → do → oac
- **B.** of → os → do → iod → if → iac → oac
- **C.** iac → iod → if → do → oac → os → of
- **D.** iac → if → iod → oac → of → do → os

**Correct Answer:** iac → if → iod → oac → of → do → os

**Explanation:** The processor obtains and decodes the instruction before calculating, fetching, operating on, and storing its operand.

---

## Question 9

**Question:** A divide-by-zero trap occurs while a disk completion signal is pending. How are the interrupt classes best identified?

**Choices:**
- **A.** Program interrupt and I/O interrupt
- **B.** Timer interrupt and hardware-failure interrupt
- **C.** Two program interrupts
- **D.** Two timer interrupts

**Correct Answer:** Program interrupt and I/O interrupt

**Explanation:** Divide by zero is caused by program execution, while disk completion is reported by an I/O device.

---

## Question 10

**Question:** Priorities are printer < communication < disk. The printer handler is running when communication arrives, then disk arrives. What nesting order is possible?

**Choices:**
- **A.** Disk waits for communication, and communication waits for printer
- **B.** Printer is preempted by communication, which is preempted by disk
- **C.** Printer preempts both higher-priority devices
- **D.** All three handlers execute simultaneously on one core

**Correct Answer:** Printer is preempted by communication, which is preempted by disk

**Explanation:** Defined priorities allow each higher-priority request to interrupt a lower-priority handler.

---

## Question 11

**Question:** When interrupts are disabled inside a handler, what normally happens to a new maskable interrupt request?

**Choices:**
- **A.** It becomes a DMA transfer
- **B.** It is permanently deleted
- **C.** It remains pending until interrupts are enabled
- **D.** It immediately overwrites the current PC

**Correct Answer:** It remains pending until interrupts are enabled

**Explanation:** Disabling maskable interrupts delays service; it does not imply that the request vanishes.

---

## Question 12

**Question:** Why can DMA outperform interrupt-driven transfer for a 1 MiB block?

**Choices:**
- **A.** DMA makes memory latency zero
- **B.** DMA stores every byte in the IR
- **C.** DMA eliminates the I/O module
- **D.** DMA moves the block between device and memory with little per-word CPU work

**Correct Answer:** DMA moves the block between device and memory with little per-word CPU work

**Explanation:** The CPU initializes the operation, while the DMA controller performs most transfers and later interrupts on completion.

---

## Question 13

**Question:** Which bus-line group answers “what action and when?” rather than “where?” or “what value?”

**Choices:**
- **A.** Control bus
- **B.** Address bus
- **C.** Data bus
- **D.** Expansion address register

**Correct Answer:** Control bus

**Explanation:** Read, write, interrupt, timing, and arbitration signals belong to the control bus.

---

## Question 14

**Question:** A byte-addressable machine has 24 address lines. What maximum directly addressable capacity follows?

**Choices:**
- **A.** 16 Mib
- **B.** 16 MiB
- **C.** 24 MiB
- **D.** 256 MiB

**Correct Answer:** 16 MiB

**Explanation:** There are 2^24 byte locations, equal to 16 MiB.

---

## Question 15

**Question:** A 128-bit data bus completes one transfer per bus cycle. How many bytes move per cycle?

**Choices:**
- **A.** 32 bytes
- **B.** 8 bytes
- **C.** 16 bytes
- **D.** 128 bytes

**Correct Answer:** 16 bytes

**Explanation:** Dividing 128 bits by 8 gives 16 bytes per transfer.

---

## Question 16

**Question:** A 50 MHz bus needs 5 clock cycles per transfer and moves 64 bits each transfer. What is its ideal bandwidth?

**Choices:**
- **A.** 400 MB/s
- **B.** 40 MB/s
- **C.** 100 MB/s
- **D.** 80 MB/s

**Correct Answer:** 80 MB/s

**Explanation:** The bus performs 10 million transfers/s and moves 8 bytes each, yielding 80 MB/s.

---

## Question 17

**Question:** A peripheral has unpredictable response time. Which bus timing method avoids forcing every transfer into a fixed clock interval?

**Choices:**
- **A.** Asynchronous request/acknowledge handshaking
- **B.** Synchronous timing with no wait states
- **C.** A wider address bus
- **D.** A smaller instruction register

**Correct Answer:** Asynchronous request/acknowledge handshaking

**Explanation:** An asynchronous bus completes a transfer when participants exchange readiness signals.

---

## Question 18

**Question:** Why does a point-to-point interconnect scale better than one shared bus?

**Choices:**
- **A.** It requires all devices to transmit on one wire
- **B.** Independent links reduce shared electrical loading and arbitration contention
- **C.** It removes packet routing
- **D.** It guarantees zero protocol overhead

**Correct Answer:** Independent links reduce shared electrical loading and arbitration contention

**Explanation:** Dedicated links permit concurrent transfers and avoid a single shared-medium bottleneck.

---

## Question 19

**Question:** Which QPI layer is responsible for reliable link-level transfer using flow-control units?

**Choices:**
- **A.** Protocol layer
- **B.** Routing layer
- **C.** Link layer
- **D.** Application layer

**Correct Answer:** Link layer

**Explanation:** The link layer manages reliable movement over one QPI link, while routing chooses paths between nodes.

---

## Question 20

**Question:** A QPI flit is 80 bits and a phit is 20 bits. How many phits carry one flit?

**Choices:**
- **A.** 8
- **B.** 2
- **C.** 16
- **D.** 4

**Correct Answer:** 4

**Explanation:** An 80-bit flow-control unit requires 80/20 = 4 physical transfers.

---

## Question 21

**Question:** A full-duplex link transfers 20 bits at 8 GT/s in each direction. What is its aggregate bidirectional raw bandwidth?

**Choices:**
- **A.** 40 GB/s
- **B.** 80 GB/s
- **C.** 20 GB/s
- **D.** 320 GB/s

**Correct Answer:** 40 GB/s

**Explanation:** One direction carries 8×20/8 = 20 GB/s, and full duplex doubles the aggregate to 40 GB/s.

---

## Question 22

**Question:** In PCIe, which component connects the processor-memory subsystem to the PCIe fabric?

**Choices:**
- **A.** Endpoint
- **B.** Root complex
- **C.** Data-link ACK
- **D.** Legacy shared-bus terminator

**Correct Answer:** Root complex

**Explanation:** The root complex is the host-side origin of the PCIe hierarchy.

---

## Question 23

**Question:** A PCIe receiver detects a corrupted transaction-layer packet. What response requests retransmission?

**Choices:**
- **A.** ACK
- **B.** DMA grant
- **C.** NAK
- **D.** CAS

**Correct Answer:** NAK

**Explanation:** A negative acknowledgement indicates failure and causes the sender to replay the packet.

---

## Question 24

**Question:** Two bus masters request a shared bus simultaneously. Which mechanism is essential for correctness?

**Choices:**
- **A.** Disabling all control signals
- **B.** Both masters driving the lines together
- **C.** Increasing only the opcode field
- **D.** Arbitration that grants one master control

**Correct Answer:** Arbitration that grants one master control

**Explanation:** Only one transmitter may control a shared bus at a time, so requests must be resolved.

---

## Question 25

**Question:** What is the strongest performance reason for a multiple-bus architecture?

**Choices:**
- **A.** It permits more transfers to proceed concurrently on separate buses
- **B.** It eliminates addresses
- **C.** It doubles every device clock automatically
- **D.** It converts interrupts into instructions

**Correct Answer:** It permits more transfers to proceed concurrently on separate buses

**Explanation:** Separate traffic paths reduce contention that would serialize all transfers on one bus.

---

## Question 26

**Question:** What distinguishes a software-stored program from a hardwired program?

**Choices:**
- **A.** It stores no data
- **B.** Its instruction sequence can be changed by altering memory contents
- **C.** It requires no processor
- **D.** Its logic can never branch

**Correct Answer:** Its instruction sequence can be changed by altering memory contents

**Explanation:** Stored instructions make behavior reprogrammable without rewiring the hardware.

---

## Question 27

**Question:** Why must an interrupt handler save context before using registers?

**Choices:**
- **A.** The handler must erase the program permanently
- **B.** The PC cannot hold an address
- **C.** The interrupted program must later resume with its prior architectural state
- **D.** DMA requires the IR to be zero

**Correct Answer:** The interrupted program must later resume with its prior architectural state

**Explanation:** Saved PC, flags, and registers allow transparent restoration after service.

---

## Question 28

**Question:** During DMA cycle stealing, what is the CPU most directly denied for a short interval?

**Choices:**
- **A.** Ability to decode all future opcodes
- **B.** Access to its internal registers
- **C.** The system clock
- **D.** Use of the memory bus

**Correct Answer:** Use of the memory bus

**Explanation:** The DMA controller temporarily becomes bus master to perform a memory transfer.

---

## Question 29

**Question:** Which transfer is described by a device placing data directly into main memory?

**Choices:**
- **A.** I/O to memory
- **B.** Processor to I/O
- **C.** Memory to processor
- **D.** Processor to processor register

**Correct Answer:** I/O to memory

**Explanation:** Direct device-to-memory movement is the transfer performed by DMA.

---

## Question 30

**Question:** A byte-addressed machine fetches a 4-byte fixed-length instruction at PC 0x1000. What is the sequential next PC?

**Choices:**
- **A.** 0x1001
- **B.** 0x1004
- **C.** 0x1008
- **D.** 0x1002

**Correct Answer:** 0x1004

**Explanation:** The PC advances by the instruction length in bytes.

---

## Question 31

**Question:** Which signal direction is most typical in a simple CPU-memory connection?

**Choices:**
- **A.** Control never leaves memory
- **B.** The data bus is always unidirectional
- **C.** Addresses flow from CPU to memory; read data flows from memory to CPU
- **D.** Addresses and read data both flow only toward memory

**Correct Answer:** Addresses flow from CPU to memory; read data flows from memory to CPU

**Explanation:** The processor selects a location, and a read returns that locations contents.

---

## Question 32

**Question:** A 32-bit instruction is stored in 16-bit memory words. Ignoring cache behavior, how many word reads are required to fetch it?

**Choices:**
- **A.** 16
- **B.** 1
- **C.** 4
- **D.** 2

**Correct Answer:** 2

**Explanation:** The instruction occupies 32/16 = 2 memory words.

---

## Question 33

**Question:** Memory[940] = 3 and Memory[941] = 2. The sequence LOAD 940; ADD 941; STORE 941 executes. What is Memory[941] afterward?

**Choices:**
- **A.** 5
- **B.** 941
- **C.** 3
- **D.** 2

**Correct Answer:** 5

**Explanation:** LOAD places 3 in AC, ADD produces 5, and STORE writes 5 to location 941.

---

## Question 34

**Question:** After executing STORE 941 in the notes machine, which value is retained in AC if STORE does not modify its source?

**Choices:**
- **A.** The old value 2
- **B.** 5
- **C.** 941
- **D.** 0

**Correct Answer:** 5

**Explanation:** STORE copies AC to memory; it does not consume or clear the accumulator.

---

## Question 35

**Question:** A 4-bit opcode field has three unused encodings. How many operations are currently defined?

**Choices:**
- **A.** 12
- **B.** 3
- **C.** 13
- **D.** 16

**Correct Answer:** 13

**Explanation:** Four bits provide 16 encodings, so 16 − 3 = 13 are defined.

---

## Question 36

**Question:** What is the highest unsigned address represented by a 12-bit address field?

**Choices:**
- **A.** 4096
- **B.** 8191
- **C.** 2048
- **D.** 4095

**Correct Answer:** 4095

**Explanation:** Twelve bits represent values 0 through 2^12 − 1 = 4095.

---

## Question 37

**Question:** A bus has raw bandwidth 100 MB/s, but arbitration and control consume 20% of cycles. What sustained payload bandwidth is possible?

**Choices:**
- **A.** 80 MB/s
- **B.** 20 MB/s
- **C.** 100 MB/s
- **D.** 120 MB/s

**Correct Answer:** 80 MB/s

**Explanation:** Payload uses 80% of the raw cycles, so 0.8×100 = 80 MB/s.

---

## Question 38

**Question:** What hidden cost can make an asynchronous bus slower than a synchronous bus for uniformly fast devices?

**Choices:**
- **A.** It cannot carry data bits
- **B.** Handshake transitions add per-transfer overhead
- **C.** It requires no control lines
- **D.** It always uses one-bit addresses

**Correct Answer:** Handshake transitions add per-transfer overhead

**Explanation:** Flexibility for variable device latency is purchased with request/acknowledge overhead.

---

## Question 39

**Question:** Which QPI layer decides the next link for a packet crossing several nodes?

**Choices:**
- **A.** Physical layer
- **B.** Register-transfer layer
- **C.** Routing layer
- **D.** Link layer

**Correct Answer:** Routing layer

**Explanation:** Routing chooses a path through the interconnect topology.

---

## Question 40

**Question:** Which PCIe layer creates read and write requests as transaction-layer packets?

**Choices:**
- **A.** Interrupt-cycle layer
- **B.** Physical layer
- **C.** Data link layer
- **D.** Transaction layer

**Correct Answer:** Transaction layer

**Explanation:** The transaction layer forms high-level memory and I/O requests; lower layers protect and transmit them.

---

## Question 41

**Question:** A low-priority handler masks all interrupts for 30 μs while a high-priority device has a 10 μs deadline. What design failure is possible?

**Choices:**
- **A.** The high-priority request can miss its service deadline
- **B.** The bus width triples
- **C.** The high-priority request gains zero latency
- **D.** The handler becomes a DMA controller

**Correct Answer:** The high-priority request can miss its service deadline

**Explanation:** Global masking can make interrupt latency exceed a devices deadline.

---

## Question 42

**Question:** A DMA transfer starts at address 5000 with count 4 bytes. After four incrementing byte transfers, which address is next and what count remains?

**Choices:**
- **A.** Address 5003 and count 1
- **B.** Address 5004 and count 0
- **C.** Address 5004 and count 4
- **D.** Address 5008 and count 0

**Correct Answer:** Address 5004 and count 0

**Explanation:** Each transfer increments the address and decrements the count once.

---

## Question 43

**Question:** Memory address 100 and isolated I/O port 100 exist simultaneously. Why is this unambiguous?

**Choices:**
- **A.** The PC stores both values together
- **B.** The numeric value 100 cannot appear twice
- **C.** Different control commands or address spaces distinguish memory and I/O cycles
- **D.** The data bus changes width for I/O

**Correct Answer:** Different control commands or address spaces distinguish memory and I/O cycles

**Explanation:** Isolated I/O uses a separate logical port space selected by I/O-specific operations.

---

## Question 44

**Question:** Which instruction-cycle event must occur before the processor knows whether an indirect or operand-fetch phase is required?

**Choices:**
- **A.** Operand store
- **B.** Interrupt return
- **C.** Data operation
- **D.** Instruction operation decoding

**Correct Answer:** Instruction operation decoding

**Explanation:** Decoding reveals the addressing mode and operation, which determine later states.

---

## Question 45

**Question:** Why are memory read and memory write control signals both necessary on a bidirectional data bus?

**Choices:**
- **A.** They define which component drives the bus and the transfer direction
- **B.** They increase the number of addresses
- **C.** They store the opcode
- **D.** They replace bus arbitration

**Correct Answer:** They define which component drives the bus and the transfer direction

**Explanation:** The same data wires can carry values either way, so control must prevent conflicting drivers.

---

## Question 46

**Question:** A CPU doubles its execution rate, but every instruction still requires one transfer over a saturated shared bus. What is the likely system speedup?

**Choices:**
- **A.** Exactly 2 under all workloads
- **B.** Near 1 because the bus remains the bottleneck
- **C.** Exactly 4 because buses are bidirectional
- **D.** Zero because a faster CPU cannot execute

**Correct Answer:** Near 1 because the bus remains the bottleneck

**Explanation:** The constrained shared transfer rate caps instruction throughput despite faster computation.

---

## Question 47

**Question:** A direct operand is already inside the instruction. Which sequence is the shortest valid detailed path?

**Choices:**
- **A.** iac → if → iod → oac → of → do → os
- **B.** if → os → iac → do
- **C.** iac → if → iod → do
- **D.** oac → of → if → iod

**Correct Answer:** iac → if → iod → do

**Explanation:** No operand address calculation, memory operand fetch, or result store is required for an immediate operation that only updates internal state.

---

## Question 48

**Question:** A 32-bit bus at 100 MHz transfers one word every two clocks. Error recovery causes 1% of transfers to be repeated once. What approximate useful bandwidth remains?

**Choices:**
- **A.** 396 MB/s
- **B.** 200 MB/s
- **C.** 99 MB/s
- **D.** 198 MB/s

**Correct Answer:** 198 MB/s

**Explanation:** Raw bandwidth is 50 million×4 = 200 MB/s, and 99% useful first-pass transfers give approximately 198 MB/s.

---

## Question 49

**Question:** A system needs simultaneous CPU-memory traffic and high-rate device traffic. Which organization most directly avoids forcing both through one arbitration point?

**Choices:**
- **A.** Separate memory and I/O buses connected by bridges
- **B.** One shared bus with fewer lines
- **C.** Disabling DMA
- **D.** A smaller MAR

**Correct Answer:** Separate memory and I/O buses connected by bridges

**Explanation:** Multiple buses isolate traffic classes and allow concurrent transfers.

---

## Question 50

**Question:** A handler saves PC but not condition flags. The interrupted program resumes at the right instruction but branches incorrectly. What was the root cause?

**Choices:**
- **A.** Use of a point-to-point link
- **B.** Incomplete context preservation
- **C.** A correct DMA count
- **D.** An address bus that was too wide

**Correct Answer:** Incomplete context preservation

**Explanation:** Branch decisions depend on flags, so restoring only the PC is insufficient.
