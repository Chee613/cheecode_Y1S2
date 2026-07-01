# Chapter 6 Input and Output: 50 Extreme-Hard Questions

## Question 1

**Question:** Why is an I/O module needed between a CPU and a slow device?

**Choices:**
- **A.** It makes every device run at CPU speed
- **B.** It replaces main memory
- **C.** It removes status signals
- **D.** It adapts timing, formats, control, and buffering

**Correct Answer:** It adapts timing, formats, control, and buffering

**Explanation:** CPU and device characteristics differ too much for a raw direct connection.

---

## Question 2

**Question:** Which device-interface signal reports READY, BUSY, or ERROR?

**Choices:**
- **A.** Status
- **B.** Address only
- **C.** Data
- **D.** Clock rate

**Correct Answer:** Status

**Explanation:** Status lines describe device condition rather than commands or payload.

---

## Question 3

**Question:** What is the role of a transducer in an external device?

**Choices:**
- **A.** Store the next instruction address
- **B.** Convert physical information to or from electrical signals
- **C.** Refresh DRAM
- **D.** Arbitrate the memory bus

**Correct Answer:** Convert physical information to or from electrical signals

**Explanation:** A transducer bridges the devices physical medium and digital electronics.

---

## Question 4

**Question:** Why does an external-device buffer improve transfer reliability?

**Choices:**
- **A.** It changes isolated I/O to memory-mapped I/O
- **B.** It eliminates all interrupts
- **C.** It absorbs rate mismatch between the device and I/O module
- **D.** It makes storage infinite

**Correct Answer:** It absorbs rate mismatch between the device and I/O module

**Explanation:** Temporary storage decouples producers and consumers operating at different speeds.

---

## Question 5

**Question:** What is the defining weakness of programmed I/O?

**Choices:**
- **A.** It requires a DMA controller
- **B.** It cannot issue commands
- **C.** It uses no CPU instructions
- **D.** The CPU repeatedly polls and moves data itself

**Correct Answer:** The CPU repeatedly polls and moves data itself

**Explanation:** Busy waiting wastes processor cycles while the device is not ready.

---

## Question 6

**Question:** Which technique frees the CPU from polling but still normally moves each data unit through CPU instructions?

**Choices:**
- **A.** Interrupt-driven I/O
- **B.** DMA
- **C.** DCA
- **D.** Programmed I/O

**Correct Answer:** Interrupt-driven I/O

**Explanation:** Interrupts remove waiting, but the handler still performs transfers.

---

## Question 7

**Question:** Which technique best transfers a large contiguous block with minimal CPU involvement?

**Choices:**
- **A.** One interrupt per bit
- **B.** DMA
- **C.** Software polling
- **D.** Programmed I/O

**Correct Answer:** DMA

**Explanation:** A DMA controller becomes bus master and moves the block directly.

---

## Question 8

**Question:** Memory-mapped I/O has what main programming advantage?

**Choices:**
- **A.** It preserves every address for RAM
- **B.** It needs special IN/OUT instructions
- **C.** Normal load/store instructions can access device registers
- **D.** It cannot use protection mechanisms

**Correct Answer:** Normal load/store instructions can access device registers

**Explanation:** Device registers occupy ordinary addresses and use the regular instruction set.

---

## Question 9

**Question:** What cost accompanies memory-mapped I/O?

**Choices:**
- **A.** It prevents caching of RAM
- **B.** It requires two unrelated data buses
- **C.** It doubles device speed
- **D.** Device registers consume part of the memory address space

**Correct Answer:** Device registers consume part of the memory address space

**Explanation:** Some address encodings select devices instead of memory.

---

## Question 10

**Question:** What distinguishes isolated I/O?

**Choices:**
- **A.** A separate port space and special I/O instructions
- **B.** Device registers are ordinary RAM
- **C.** It requires no addresses
- **D.** It cannot use interrupts

**Correct Answer:** A separate port space and special I/O instructions

**Explanation:** Ports are selected independently from memory locations.

---

## Question 11

**Question:** A CPU acknowledges an interrupt, saves context, runs a handler, restores context, and returns. Which step preserves transparent resumption?

**Choices:**
- **A.** Disabling the clock
- **B.** Saving and restoring architectural state
- **C.** Erasing the device buffer
- **D.** Polling before every instruction

**Correct Answer:** Saving and restoring architectural state

**Explanation:** The interrupted program must observe its previous PC, flags, and register values.

---

## Question 12

**Question:** Which device-identification method uses one interrupt line per device?

**Choices:**
- **A.** Bus arbitration
- **B.** Software polling
- **C.** Multiple interrupt lines
- **D.** Daisy chain

**Correct Answer:** Multiple interrupt lines

**Explanation:** Dedicated lines identify the source directly but consume hardware pins.

---

## Question 13

**Question:** Which identification method has the CPU query devices in sequence?

**Choices:**
- **A.** DMA cycle stealing
- **B.** Direct cache access
- **C.** Daisy chain hardware only
- **D.** Software polling

**Correct Answer:** Software polling

**Explanation:** The service routine reads status registers until it finds the requester.

---

## Question 14

**Question:** In a daisy chain, which device usually has highest priority?

**Choices:**
- **A.** The device nearest the interrupt acknowledge source
- **B.** The final device always
- **C.** The device with the largest buffer
- **D.** The physically slowest device

**Correct Answer:** The device nearest the interrupt acknowledge source

**Explanation:** Acknowledge propagates serially, so the first requesting device captures it.

---

## Question 15

**Question:** What does bus arbitration provide for interrupting bus masters?

**Choices:**
- **A.** A separate instruction set
- **B.** A distributed or centralized priority decision
- **C.** DRAM refresh
- **D.** A larger data word

**Correct Answer:** A distributed or centralized priority decision

**Explanation:** Arbitration selects one requester to control the bus.

---

## Question 16

**Question:** Why can globally disabling interrupts cause poor real-time behavior?

**Choices:**
- **A.** It removes context switches
- **B.** It increases DMA bandwidth
- **C.** A critical request may wait behind a long handler
- **D.** It makes all devices highest priority

**Correct Answer:** A critical request may wait behind a long handler

**Explanation:** Masking bounds simplicity at the cost of potentially large interrupt latency.

---

## Question 17

**Question:** What is the purpose of an 82C59A-like interrupt controller?

**Choices:**
- **A.** Decode arithmetic opcodes
- **B.** Generate DRAM row addresses
- **C.** Transfer disk blocks by DMA
- **D.** Prioritize, mask, and vector multiple interrupt requests

**Correct Answer:** Prioritize, mask, and vector multiple interrupt requests

**Explanation:** The controller consolidates device requests and directs the CPU to the proper handler.

---

## Question 18

**Question:** An 8255A provides three 8-bit ports. How many programmable I/O lines is that?

**Choices:**
- **A.** 24
- **B.** 8
- **C.** 16
- **D.** 32

**Correct Answer:** 24

**Explanation:** Ports A, B, and C contribute 3×8 = 24 lines.

---

## Question 19

**Question:** What does handshaking add to peripheral transfer?

**Choices:**
- **A.** More address bits only
- **B.** Coordination signals confirming readiness and acceptance
- **C.** A cache dirty bit
- **D.** A floating gate

**Correct Answer:** Coordination signals confirming readiness and acceptance

**Explanation:** Producer and consumer synchronize each transfer despite speed differences.

---

## Question 20

**Question:** Which values must the CPU supply to initialize a basic DMA block transfer?

**Choices:**
- **A.** Only cache size
- **B.** Only the current PC
- **C.** Device/direction, starting memory address, and transfer count
- **D.** Opcode width and CAS latency

**Correct Answer:** Device/direction, starting memory address, and transfer count

**Explanation:** The controller needs endpoints, direction, destination/source address, and remaining length.

---

## Question 21

**Question:** What is cycle stealing?

**Choices:**
- **A.** An interrupt deletes a cycle
- **B.** A device bypasses its buffer
- **C.** The CPU changes the clock frequency every instruction
- **D.** DMA temporarily takes memory-bus cycles from the CPU

**Correct Answer:** DMA temporarily takes memory-bus cycles from the CPU

**Explanation:** Short DMA ownership intervals can stall CPU memory access without stopping internal work.

---

## Question 22

**Question:** Why may DMA still interrupt the CPU?

**Choices:**
- **A.** To report completion or an error
- **B.** To transfer every byte through the handler
- **C.** To refresh SRAM
- **D.** To select an opcode

**Correct Answer:** To report completion or an error

**Explanation:** DMA removes per-unit CPU work, not the need for completion notification.

---

## Question 23

**Question:** How does direct cache access improve network input?

**Choices:**
- **A.** It writes every packet to disk first
- **B.** It places incoming data directly into cache near the consuming core
- **C.** It disables DMA
- **D.** It forces cache misses

**Correct Answer:** It places incoming data directly into cache near the consuming core

**Explanation:** DCA can reduce later memory reads and cache pollution paths.

---

## Question 24

**Question:** What distinguishes an I/O processor from a simple DMA controller?

**Choices:**
- **A.** It handles only one byte
- **B.** It has no control logic
- **C.** It can execute a richer I/O program independently
- **D.** It cannot access memory

**Correct Answer:** It can execute a richer I/O program independently

**Explanation:** An I/O processor offloads sequencing and decisions, not merely block movement.

---

## Question 25

**Question:** Which channel serves one high-speed device at a time?

**Choices:**
- **A.** Daisy chain
- **B.** Byte multiplexor channel
- **C.** Software poll
- **D.** Selector channel

**Correct Answer:** Selector channel

**Explanation:** A selector dedicates channel capacity to one selected high-rate transfer.

---

## Question 26

**Question:** Which channel interleaves traffic from several low-speed devices?

**Choices:**
- **A.** Byte multiplexor channel
- **B.** Selector channel
- **C.** DMA count register
- **D.** Root complex

**Correct Answer:** Byte multiplexor channel

**Explanation:** Small units from multiple devices share channel time.

---

## Question 27

**Question:** A 2 GHz CPU polls a device 1 million times/s, spending 200 cycles per poll. What CPU time fraction is consumed?

**Choices:**
- **A.** 20%
- **B.** 10%
- **C.** 100%
- **D.** 1%

**Correct Answer:** 10%

**Explanation:** Polling uses 200 million cycles/s out of 2 billion.

---

## Question 28

**Question:** Interrupt handling costs 2,000 cycles for each of 50,000 events/s on a 2 GHz CPU. What fraction is overhead?

**Choices:**
- **A.** 10%
- **B.** 50%
- **C.** 5%
- **D.** 0.5%

**Correct Answer:** 5%

**Explanation:** The handlers consume 100 million of 2 billion cycles each second.

---

## Question 29

**Question:** Combining 100 device events into one interrupt reduces a 50,000-interrupt/s stream to what rate?

**Choices:**
- **A.** 50,000 interrupts/s
- **B.** 5,000 interrupts/s
- **C.** 50 interrupts/s
- **D.** 500 interrupts/s

**Correct Answer:** 500 interrupts/s

**Explanation:** 50,000/100 = 500 batched notifications per second.

---

## Question 30

**Question:** A DMA setup costs 5,000 cycles, while programmed transfer costs 20 cycles/byte. Above what smallest block size is DMA cheaper if DMA data movement costs no CPU cycles?

**Choices:**
- **A.** 251 bytes
- **B.** 250 bytes
- **C.** 100 bytes
- **D.** 5,000 bytes

**Correct Answer:** 251 bytes

**Explanation:** At 250 bytes costs tie; DMA wins starting at 251 bytes.

---

## Question 31

**Question:** DMA starts at byte address 5000 with count 4 and increments addresses. What final transferred address is used?

**Choices:**
- **A.** 5004
- **B.** 5003
- **C.** 4999
- **D.** 5008

**Correct Answer:** 5003

**Explanation:** Four bytes occupy addresses 5000 through 5003.

---

## Question 32

**Question:** A DMA controller steals one of every 20 memory cycles. If the CPU is entirely memory-bound, what ideal throughput remains?

**Choices:**
- **A.** 100%
- **B.** 80%
- **C.** 95%
- **D.** 5%

**Correct Answer:** 95%

**Explanation:** The CPU retains 19/20 = 95% of memory cycles.

---

## Question 33

**Question:** A device produces 8 MiB/s, but its consumer pauses for 4 ms. What minimum buffer prevents loss during the pause?

**Choices:**
- **A.** 8 KiB
- **B.** 64 KiB
- **C.** 4 KiB
- **D.** 32 KiB

**Correct Answer:** 32 KiB

**Explanation:** 8 MiB/s × 0.004 s = 0.032 MiB = 32 KiB.

---

## Question 34

**Question:** A 480 Mb/s link achieves 80% payload efficiency. What payload rate results?

**Choices:**
- **A.** 384 Mb/s
- **B.** 60 MB/s
- **C.** 480 MB/s
- **D.** 96 Mb/s

**Correct Answer:** 384 Mb/s

**Explanation:** 0.8×480 = 384 Mb/s.

---

## Question 35

**Question:** Convert the payload rate in Question 34 to decimal MB/s.

**Choices:**
- **A.** 38.4 MB/s
- **B.** 48 MB/s
- **C.** 60 MB/s
- **D.** 384 MB/s

**Correct Answer:** 48 MB/s

**Explanation:** 384 megabits/s divided by 8 = 48 megabytes/s.

---

## Question 36

**Question:** A 32-bit memory-mapped I/O address space reserves 64 KiB for devices. How many byte addresses remain for memory?

**Choices:**
- **A.** 2^31
- **B.** 2^16
- **C.** 2^32 − 2^16
- **D.** 2^32

**Correct Answer:** 2^32 − 2^16

**Explanation:** The device window consumes 65,536 of the 4,294,967,296 addresses.

---

## Question 37

**Question:** A status register changes asynchronously. Why is repeatedly reading it without a timeout dangerous?

**Choices:**
- **A.** It converts RAM into ROM
- **B.** It changes port width
- **C.** It forces a DMA writeback
- **D.** A failed device can cause an infinite polling loop

**Correct Answer:** A failed device can cause an infinite polling loop

**Explanation:** Robust polling needs a failure bound when READY may never arrive.

---

## Question 38

**Question:** A level-triggered interrupt remains asserted after the handler returns. What likely omission causes immediate re-entry?

**Choices:**
- **A.** The handler failed to clear or service the device condition
- **B.** The CPU saved too much context
- **C.** DMA used a count of zero
- **D.** The port was memory mapped

**Correct Answer:** The handler failed to clear or service the device condition

**Explanation:** The source condition must be removed before unmasking or returning.

---

## Question 39

**Question:** Two devices share one interrupt line. What must software usually do?

**Choices:**
- **A.** Erase both buffers
- **B.** Inspect device status to identify every active source
- **C.** Assume the fastest device always
- **D.** Start DMA without checking

**Correct Answer:** Inspect device status to identify every active source

**Explanation:** A shared line signals that some source is active but does not uniquely identify it.

---

## Question 40

**Question:** A high-priority device continually interrupts and a low-priority device is never serviced. What problem occurred?

**Choices:**
- **A.** Burst mode
- **B.** Dead code elimination
- **C.** Starvation
- **D.** Cache inclusion

**Correct Answer:** Starvation

**Explanation:** Strict priority without fairness can indefinitely delay lower priorities.

---

## Question 41

**Question:** Which improvement reduces programmed-I/O waiting without requiring DMA hardware?

**Choices:**
- **A.** More polling
- **B.** A slower device
- **C.** A smaller buffer
- **D.** Interrupt-driven I/O

**Correct Answer:** Interrupt-driven I/O

**Explanation:** The CPU performs other work until readiness generates an interrupt.

---

## Question 42

**Question:** Why is one interrupt per received network byte inefficient?

**Choices:**
- **A.** Context-switch overhead can exceed useful transfer work
- **B.** The data bus carries addresses only
- **C.** DMA cannot access memory
- **D.** Bytes cannot trigger interrupts

**Correct Answer:** Context-switch overhead can exceed useful transfer work

**Explanation:** Batching or DMA amortizes fixed interrupt cost across many bytes.

---

## Question 43

**Question:** A selector channel serves a 100 MB/s disk and a 1 MB/s terminal simultaneously. What design mismatch is exposed?

**Choices:**
- **A.** The disk cannot use DMA
- **B.** The terminal can occupy a channel intended for one high-speed stream
- **C.** The terminal needs a wider opcode
- **D.** Selector channels always interleave bytes

**Correct Answer:** The terminal can occupy a channel intended for one high-speed stream

**Explanation:** A multiplexor is better suited to sharing service among low-rate devices.

---

## Question 44

**Question:** Which CPU action is expected while DMA owns the external bus?

**Choices:**
- **A.** Drive conflicting addresses
- **B.** Stop the clock permanently
- **C.** Continue internal work until a memory access is needed
- **D.** Erase the DMA count

**Correct Answer:** Continue internal work until a memory access is needed

**Explanation:** Only bus-dependent CPU activity must wait during cycle stealing.

---

## Question 45

**Question:** A DMA transfer count register reaches zero. What should the controller do next?

**Choices:**
- **A.** Poll the CPU forever
- **B.** Wrap silently and overwrite memory
- **C.** Increase the count
- **D.** Release the bus and signal completion

**Correct Answer:** Release the bus and signal completion

**Explanation:** Zero marks completion of the programmed block.

---

## Question 46

**Question:** What is the key correctness risk of allowing a device to DMA into memory containing cached CPU data?

**Choices:**
- **A.** The CPU cache and memory can become incoherent
- **B.** Interrupt priorities reverse
- **C.** The disk gains extra sectors
- **D.** The I/O port becomes RAM

**Correct Answer:** The CPU cache and memory can become incoherent

**Explanation:** Stale cached copies or dirty CPU data require coherence or explicit cache maintenance.

---

## Question 47

**Question:** Why can DCA outperform DMA-to-memory followed by a CPU read?

**Choices:**
- **A.** It guarantees infinite cache capacity
- **B.** It can avoid an extra memory-to-cache transfer
- **C.** It removes device status
- **D.** It converts bytes into instructions

**Correct Answer:** It can avoid an extra memory-to-cache transfer

**Explanation:** Placing data near the consumer shortens the path to first use.

---

## Question 48

**Question:** A program writes a command before device data due to reordered memory operations. What mechanism is needed?

**Choices:**
- **A.** A larger DMA count
- **B.** A Hamming check bit
- **C.** An I/O memory barrier or ordered access
- **D.** A daisy chain

**Correct Answer:** An I/O memory barrier or ordered access

**Explanation:** Device-register operations often require ordering guarantees beyond normal cached memory behavior.

---

## Question 49

**Question:** A system must minimize CPU overhead for 1 GiB transfers while preserving responsiveness to completion. Which combination is best?

**Choices:**
- **A.** Programmed I/O plus continuous polling
- **B.** One interrupt per byte
- **C.** Software polling with interrupts disabled
- **D.** DMA plus one completion interrupt

**Correct Answer:** DMA plus one completion interrupt

**Explanation:** DMA handles bulk movement and a single interrupt provides timely completion notification.

---

## Question 50

**Question:** A DMA engine and CPU both update the same buffer without synchronization. What failure is most likely?

**Choices:**
- **A.** A race exposes partially updated or stale data
- **B.** The I/O address becomes wider
- **C.** The interrupt controller gains ports
- **D.** The bus becomes optical

**Correct Answer:** A race exposes partially updated or stale data

**Explanation:** Ownership, completion ordering, and cache visibility must be coordinated before either side consumes the buffer.
