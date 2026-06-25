# Chapter 6: Input/Output

# 1. Big Picture of Input/Output

## What I/O means

**Input/Output**, or **I/O**, means data exchange between the computer and the outside world.

```text
Input:  outside world -> computer
Output: computer -> outside world
```

Examples:

| Device       | Type             |
| ------------ | ---------------- |
| Keyboard     | Input            |
| Monitor      | Output           |
| Disk         | Input and output |
| Network card | Input and output |
| Printer      | Output           |
| Sensor       | Input            |
| Actuator     | Output           |

The lecture says external devices exchange data between the external environment and the computer, and they connect through an I/O module. 

---

# 2. Why We Need an I/O Module

The CPU usually does **not** directly control every external device.

Instead:

```text
CPU / Memory  <---->  I/O Module  <---->  External Device
```

An I/O module has two major interfaces:

```text
1. Interface to processor/memory through system bus or central switch
2. Interface to one or more peripheral devices through tailored data links
```

This is exactly the purpose of the generic I/O module model in the lecture. 

## Why the I/O module is needed

External devices are very different from the CPU.

| Problem         | Example                              | I/O module role       |
| --------------- | ------------------------------------ | --------------------- |
| Speed mismatch  | CPU fast, printer slow               | Buffer data           |
| Format mismatch | Keyboard signals, disk magnetic data | Convert/organize data |
| Control         | Disk needs seek/read/write           | Send control commands |
| Status          | Device may be busy/error             | Report status         |
| Errors          | Paper jam, bad disk track            | Detect/report error   |

---

# 3. External Devices

External devices are also called **peripheral devices**.

The lecture classifies external devices into three categories: **human-readable**, **machine-readable**, and **communication** devices. 

## 3.1 Human-readable devices

Devices used to communicate with humans.

Examples:

```text
Keyboard
Monitor
Printer
Speaker
```

## 3.2 Machine-readable devices

Devices used to communicate with equipment or machines.

Examples:

```text
Magnetic disk
Tape system
Sensor
Actuator
Robot controller
```

## 3.3 Communication devices

Devices used to communicate with remote devices.

Examples:

```text
Modem
Network card
Wi-Fi adapter
Bluetooth adapter
```

A modem becomes an I/O device when it sends data from the computer to a remote system or receives data from a remote system. This directly answers Tutorial 7 Question 1. 

---

# 4. External Device Block Diagram

A general external device has:

```text
+----------------------+
| External environment |
+----------------------+
          |
          v
+----------------------+
| Transducer           |
+----------------------+
          |
          v
+----------------------+
| Buffer               |
+----------------------+
          |
          v
+----------------------+
| Control logic        |
+----------------------+
          |
          v
Control / Data / Status signals
          |
          v
+----------------------+
| I/O module           |
+----------------------+
```

The lecture says the interface between an external device and an I/O module uses **control**, **data**, and **status** signals. Control signals tell the device what to do, data signals carry bits, and status signals show device state such as READY or NOT-READY. 

---

# 5. Transducer and Buffer

## Transducer

A **transducer** converts data between electrical form and another form.

Examples:

```text
Keyboard: key press -> electrical signal
Monitor: electrical signal -> light
Speaker: electrical signal -> sound
Disk: magnetic pattern -> electrical bits
```

The lecture says a transducer converts data from electrical form to other energy forms during output and from other forms to electrical during input. 

## Buffer

A **buffer** is temporary storage.

It is needed because device speed and CPU/memory speed are different.

```text
Fast CPU/memory  <---- buffer ---->  Slow device
```

Example:

```text
CPU sends data quickly.
Printer prints slowly.
Buffer holds data temporarily.
```

---

# 6. Keyboard and Monitor Example

The lecture uses the keyboard/monitor arrangement as a common computer-user interaction example. The basic unit of exchange is a **character**, usually represented using a 7-bit or 8-bit code. The lecture mentions **IRA**, where each character has a unique 7-bit binary code, so 128 characters can be represented. 

## Keyboard input flow

```text
User presses key
      |
      v
Keyboard transducer detects key
      |
      v
Character converted to binary code
      |
      v
I/O module receives code
      |
      v
Computer stores/processes code
```

## Monitor output flow

```text
Computer sends character code
      |
      v
I/O module sends code to monitor
      |
      v
Monitor transducer interprets code
      |
      v
Character appears on screen
```

---

# 7. I/O Module Functions

The lecture lists five major I/O module functions: **control and timing**, **processor communication**, **device communication**, **data buffering**, and **error detection**. 

| Function                | Meaning                                                                        |
| ----------------------- | ------------------------------------------------------------------------------ |
| Control and timing      | Coordinates data movement between computer and devices                         |
| Processor communication | Handles command decoding, data transfer, status reporting, address recognition |
| Device communication    | Sends commands/status/data to and from the device                              |
| Data buffering          | Balances speed difference between device and CPU/memory                        |
| Error detection         | Detects errors such as bad disk track, paper jam, transmission error           |

Example processor-to-device sequence:

```text
1. CPU checks device status.
2. I/O module returns status.
3. If ready, CPU sends command.
4. I/O module gets data from device.
5. I/O module transfers data to CPU.
```

---

# 8. Three Main I/O Techniques

The lecture gives three main I/O techniques: **programmed I/O**, **interrupt-driven I/O**, and **direct memory access**. 

| Technique            | Data path                     | CPU involvement |
| -------------------- | ----------------------------- | --------------- |
| Programmed I/O       | I/O module -> CPU -> memory   | Very high       |
| Interrupt-driven I/O | I/O module -> CPU -> memory   | Medium          |
| DMA                  | I/O module -> memory directly | Low             |

---

# 9. Programmed I/O

## Meaning

In **programmed I/O**, the CPU directly controls the I/O operation.

The CPU:

```text
1. Checks device status
2. Sends command
3. Transfers data
4. Repeats until complete
```

The lecture says the processor executes a program that gives it direct control of I/O, and when it issues a command, it must wait until the I/O operation is complete. 

## Flowchart

```text
Start
  |
  v
CPU sends I/O command
  |
  v
Check device status
  |
  +-- Not ready --> check again
  |
 Ready
  |
  v
Transfer one word
  |
  v
More data?
  |
  +-- Yes --> check status again
  |
  No
  |
  v
End
```

## Main weakness

Programmed I/O wastes CPU time because the CPU repeatedly checks the device.

```text
CPU: ready?
Device: no

CPU: ready?
Device: no

CPU: ready?
Device: yes
```

The lecture says this status-checking cycle keeps the processor busy needlessly. 

---

# 10. I/O Commands

The lecture says an I/O module may receive four types of commands: **control**, **test**, **read**, and **write**. 

| Command | Meaning                              | Example                      |
| ------- | ------------------------------------ | ---------------------------- |
| Control | Tell device what to do               | Rewind tape, seek disk track |
| Test    | Check device status                  | Ready? Busy? Error?          |
| Read    | Get data from device into I/O buffer | Read keyboard character      |
| Write   | Send data from bus to device         | Print character              |

---

# 11. I/O Instructions and Addressing

With programmed I/O, the CPU executes I/O-related instructions. Each I/O device has a unique address or identifier, and the I/O module checks whether the command is meant for it. 

There are two main addressing styles:

```text
1. Memory-mapped I/O
2. Isolated I/O
```

---

# 12. Memory-Mapped I/O

## Meaning

Memory and I/O devices share one address space.

```text
Address 0-511    -> memory
Address 512-1023 -> I/O devices
```

Example:

```assembly
LOAD R1, [516]     ; read keyboard data register
STORE [600], R1    ; write to printer data register
```

The lecture says in memory-mapped I/O, the processor treats I/O status and data registers as memory locations and uses the same machine instructions for memory and I/O. 

## Advantage

Normal memory instructions can be used.

## Disadvantage

Some memory address space is used by I/O devices.

---

# 13. Isolated I/O

## Meaning

Memory and I/O devices have separate address spaces.

```text
Memory address 100  !=  I/O port 100
```

Example:

```assembly
IN  R1, 60h
OUT 61h, R1
```

The lecture says isolated I/O uses a separate I/O address space and special I/O commands. 

## Advantage

Memory address space is preserved.

## Disadvantage

Special I/O instructions are needed, so the instruction set is more limited.

---

# 14. Memory-Mapped vs Isolated I/O

| Feature       | Memory-mapped I/O          | Isolated I/O                         |
| ------------- | -------------------------- | ------------------------------------ |
| Address space | Shared memory + I/O        | Separate memory and I/O              |
| Instructions  | Normal memory instructions | Special I/O instructions             |
| Example       | `LOAD R1, [516]`           | `IN R1, 60h`                         |
| Advantage     | Easier programming         | Does not reduce memory address space |
| Disadvantage  | Uses memory address space  | Limited I/O instructions             |

Tutorial 7 directly asks for this comparison. 

---

# 15. Interrupt-Driven I/O

## Meaning

In **interrupt-driven I/O**, the CPU starts the I/O operation, then continues doing other work. When the I/O module is ready, it interrupts the CPU.

The lecture says the CPU issues an I/O command and continues other instructions until the I/O module interrupts it. 

## Flow

```text
CPU sends READ command
      |
      v
CPU continues other work
      |
      v
I/O module receives data from device
      |
      v
I/O module sends interrupt
      |
      v
CPU saves current state
      |
      v
CPU transfers data
      |
      v
CPU restores state
      |
      v
CPU resumes previous work
```

## Advantage

The CPU does not waste time continuously polling.

## Weakness

Data still passes through the CPU.

```text
I/O module -> CPU -> memory
```

The lecture says interrupt I/O removes needless waiting, but still consumes processor time because every word transferred between memory and I/O must pass through the processor. 

---

# 16. Interrupt Processing

When an interrupt happens, the CPU must preserve the old program state.

The lecture says the CPU saves important information such as the **program counter**, **program status word**, and processor registers, then later restores them after interrupt processing. 

## Interrupt processing steps

```text
1. I/O device sends interrupt signal.
2. CPU finishes current instruction.
3. CPU acknowledges interrupt.
4. CPU saves PC and PSW.
5. CPU loads PC with interrupt-handler address.
6. Interrupt handler saves registers.
7. Interrupt handler services device.
8. Registers are restored.
9. PSW and PC are restored.
10. Old program resumes.
```

## Important terms

| Term    | Meaning                                   |
| ------- | ----------------------------------------- |
| PC      | Address of next instruction               |
| PSW     | Processor status information              |
| ISR     | Interrupt Service Routine                 |
| Context | CPU state that must be saved and restored |

---

# 17. Device Identification

When multiple devices can interrupt, the CPU must know which device caused the interrupt.

Tutorial 7 asks: “When a device interrupt occurs, how does the processor determine which device issued the interrupt?” 

The lecture gives four methods: **multiple interrupt lines**, **software poll**, **daisy chain**, and **bus arbitration**. 

## 17.1 Multiple interrupt lines

Each device or device group has its own interrupt line.

```text
Keyboard ---- interrupt line 1
Disk -------- interrupt line 2
Printer ----- interrupt line 3
```

Fast, but needs many CPU pins/bus lines.

## 17.2 Software poll

CPU checks each device one by one.

```text
Check keyboard
Check disk
Check printer
```

Simple hardware, but slow.

## 17.3 Daisy chain

Interrupt acknowledge signal passes through devices in order.

```text
CPU acknowledge -> Device 1 -> Device 2 -> Device 3
```

The requesting device sends a **vector**.

A vector identifies the device or points to the correct ISR.

## 17.4 Bus arbitration

The interrupting device first gains bus control, then sends its vector to the CPU.

---

# 18. Multiple Interrupts and Priority

Multiple interrupts happen when several devices request service at the same time or while another interrupt is already being serviced.

Two common approaches:

```text
1. Disable interrupts while handling one interrupt
2. Use priority levels
```

## Disabled interrupts

```text
CPU handles current interrupt fully.
Other interrupts wait.
```

Simple, but urgent devices may wait too long.

## Priority interrupts

Higher-priority interrupts can interrupt lower-priority interrupt handlers.

Example:

```text
Printer interrupt starts.
Network interrupt arrives.
Network has higher priority.
CPU pauses printer ISR and handles network ISR.
Then CPU resumes printer ISR.
```

---

# 19. 82C59A Interrupt Controller

The 82C59A is an interrupt controller.

Purpose:

```text
Many I/O modules -> 82C59A -> CPU
```

It accepts interrupt requests, decides priority, sends an interrupt request to the CPU, receives interrupt acknowledge, and sends vector information.

Important idea:

```text
82C59A manages interrupts.
It does not transfer actual device data.
```

---

# 20. Intel 8255A Programmable Peripheral Interface

The 8255A is an example of an I/O module.

It has:

```text
Port A = 8 bits
Port B = 8 bits
Port C = 8 bits
Total = 24 I/O lines
```

## 8255A modes

| Mode   | Meaning                 |
| ------ | ----------------------- |
| Mode 0 | Basic input/output      |
| Mode 1 | Strobed/handshaking I/O |
| Mode 2 | Bidirectional I/O       |

## Handshaking

Handshaking means sender and receiver coordinate using control signals.

```text
Device: DATA READY
CPU/I/O module: ACKNOWLEDGE
```

---

# 21. Direct Memory Access, DMA

## Meaning

**DMA** allows data to move directly between an I/O module and main memory without passing through the CPU.

```text
Device -> DMA module -> Memory
```

The lecture says DMA allows the I/O module and main memory to exchange data directly without processor involvement. 

## Why DMA is needed

Programmed I/O and interrupt-driven I/O still use the CPU too much.

DMA is better for large block transfers.

---

# 22. DMA Setup Information

Before DMA starts, the CPU gives the DMA module:

```text
1. Direction: read or write
2. I/O device address
3. Starting memory address
4. Number of words/bytes to transfer
```

Important DMA registers:

| Register         | Purpose                           |
| ---------------- | --------------------------------- |
| Address register | Stores current memory address     |
| Count register   | Stores number of words/bytes left |

Example:

```text
Starting address = 5000
Count = 4

Transfer 1 -> address 5000, count 3
Transfer 2 -> address 5001, count 2
Transfer 3 -> address 5002, count 1
Transfer 4 -> address 5003, count 0
```

When count becomes zero, DMA interrupts the CPU to say transfer is complete.

---

# 23. Cycle Stealing

## Meaning

Cycle stealing means DMA temporarily takes bus cycles from the CPU.

```text
CPU: execute | execute | pause | execute | pause
DMA:                   | word1 |         | word2
```

Important:

```text
Cycle stealing is not an interrupt.
```

During cycle stealing:

```text
CPU does not save PC/PSW/registers.
CPU simply pauses because DMA is using the bus.
```

Tutorial 7 asks what the processor does when DMA takes control of the bus. The answer: the processor temporarily stops using the bus, waits while DMA transfers data, then resumes when the bus is released. 

---

# 24. DMA vs Interrupt-Driven I/O

| Feature              | Interrupt-driven I/O       | DMA                            |
| -------------------- | -------------------------- | ------------------------------ |
| Who moves each word? | CPU                        | DMA module                     |
| Data path            | I/O -> CPU -> memory       | I/O -> memory                  |
| CPU involvement      | Every word                 | Setup and completion           |
| Best for             | Moderate data              | Large block transfer           |
| End notification     | Interrupt after data ready | Interrupt after block complete |

---

# 25. Direct Cache Access, DCA

DMA reduces CPU work, but incoming data often still goes to main memory first. Direct Cache Access tries to reduce memory/cache bottlenecks by making I/O data available closer to the CPU cache.

Normal DMA:

```text
Network card -> Main memory -> Cache -> CPU
```

DCA / DDIO idea:

```text
Network card -> Last-level cache -> CPU
```

## Why useful

It reduces unnecessary movement between memory and cache, especially for high-speed network I/O.

---

# 26. I/O Channels and I/O Processors

The lecture says an I/O channel is an extension of DMA. It can execute I/O instructions and control I/O operations more independently from the CPU. 

## I/O channel

```text
CPU tells I/O channel:
"Execute this I/O program."

I/O channel controls the transfer.
```

An I/O program can specify:

```text
Device
Memory area
Priority
Error handling actions
```

## I/O processor

An I/O processor is even more powerful. It may have local memory and act like a small computer dedicated to I/O work.

---

# 27. Selector Channel vs Multiplexor Channel

The lecture says a selector channel controls multiple high-speed devices but transfers with one selected device at a time. A multiplexor channel can handle multiple devices at the same time. 

| Channel           | Meaning                       | Best for                 |
| ----------------- | ----------------------------- | ------------------------ |
| Selector channel  | One selected device at a time | High-speed devices       |
| Byte multiplexor  | Interleaves bytes/characters  | Low-speed devices        |
| Block multiplexor | Interleaves blocks            | High-speed block devices |

Example byte multiplexing:

```text
Device A: A1 A2 A3
Device B: B1 B2 B3
Device C: C1 C2 C3

Multiplexed stream:
A1 B1 C1 A2 C2 A3 B2 C3
```

---

# 28. External Interconnection Standards

The lecture lists USB, FireWire, SCSI, Thunderbolt, PCI Express, SATA, InfiniBand, Ethernet, and Wi-Fi as external interconnection standards. 

| Standard    | Main use                                         |
| ----------- | ------------------------------------------------ |
| USB         | Common external peripherals                      |
| FireWire    | High-speed serial peripheral bus                 |
| SCSI        | Storage/peripheral interface, enterprise storage |
| Thunderbolt | High-speed external devices/docks                |
| PCIe        | High-speed internal I/O devices                  |
| SATA        | Disk storage interface                           |
| InfiniBand  | High-end server/storage fabric                   |
| Ethernet    | Wired networking                                 |
| Wi-Fi       | Wireless networking                              |

## USB data rates from lecture

| Version                       | Data rate |
| ----------------------------- | --------- |
| USB 1.0 Low Speed             | 1.5 Mbps  |
| USB 1.0 Full Speed            | 12 Mbps   |
| USB 2.0                       | 480 Mbps  |
| USB 3.0 SuperSpeed signaling  | 5 Gbps    |
| USB 3.1 SuperSpeed+ signaling | 10 Gbps   |

The lecture describes USB as widely used for peripheral connections and controlled by a root host controller in a hierarchical tree topology. 

---

# 29. IBM zEnterprise EC12 I/O Structure

The IBM zEnterprise EC12 is a mainframe system. Mainframes need powerful I/O because they handle many devices, many users, huge storage, and high transaction rates.

Main idea:

```text
CPU / Memory
     |
     v
Channel subsystem / host channel adapters
     |
     v
I/O drawers / I/O adapters
     |
     v
Storage, network, enterprise devices
```

Why mainframes use advanced I/O:

```text
1. High throughput
2. Less CPU involvement
3. Reliability
4. Expandability
5. Many simultaneous I/O operations
```

This connects to the chapter’s theme: as I/O systems evolve, more work is moved from the CPU to I/O hardware.

---

# 30. Tutorial 7 Final Answers

## Q1. When can a modem become an I/O device?

A modem becomes an I/O device when it sends or receives data between the computer and a remote system.

```text
Computer -> modem -> remote system
Remote system -> modem -> computer
```

## Q2. Factors affecting I/O performance

```text
Device speed
Processor speed
Memory speed
Bus bandwidth
I/O technique used
Buffer size
Amount of data transferred
Interrupt overhead
DMA support
Number of devices sharing bus
Error handling
OS/device driver overhead
```

## Q3. Principles of I/O techniques

```text
Programmed I/O:
CPU controls and waits.

Interrupt-driven I/O:
CPU starts I/O, does other work, then device interrupts CPU.

DMA:
I/O module transfers data directly with memory.
```

## Q4. Memory-mapped vs isolated I/O

```text
Memory-mapped I/O:
Memory and I/O share address space.
Normal memory instructions can access I/O.

Isolated I/O:
Memory and I/O have separate address spaces.
Special I/O instructions are needed.
```

## Q5. How does CPU identify interrupting device?

```text
Multiple interrupt lines
Software polling
Daisy chain
Bus arbitration
```

## Q6. What does CPU do when DMA controls bus?

```text
The CPU temporarily pauses from using the bus.
DMA transfers data directly between I/O and memory.
When DMA releases the bus, CPU resumes.
This is cycle stealing, not an interrupt.
```

---

# 31. Common Exam Mistakes

1. **Thinking CPU directly controls every external device**
   Correct: CPU usually communicates through an I/O module.

2. **Confusing control, data, and status signals**
   Control = command.
   Data = actual bits.
   Status = ready/busy/error.

3. **Thinking programmed I/O is efficient**
   It is simple, but wastes CPU time.

4. **Thinking interrupt-driven I/O removes CPU involvement completely**
   It does not. Data still passes through CPU.

5. **Thinking DMA is an interrupt**
   DMA is data transfer. It may only interrupt CPU when done.

6. **Thinking cycle stealing means CPU saves context**
   No. CPU only pauses bus use.

7. **Confusing memory-mapped I/O and DMA**
   Memory-mapped I/O is about addressing.
   DMA is about data transfer.

8. **Confusing selector and multiplexor channels**
   Selector = one selected device at a time.
   Multiplexor = multiple devices interleaved.

---

# 32. Final Viva Questions

1. What is an I/O module?
2. Why is an I/O module needed?
3. List the three categories of external devices.
4. What are control, data, and status signals?
5. What is the function of a transducer?
6. Why is buffering needed?
7. List the five I/O module functions.
8. What are the three I/O techniques?
9. Why is programmed I/O inefficient?
10. What are the four I/O commands?
11. What is memory-mapped I/O?
12. What is isolated I/O?
13. What is interrupt-driven I/O?
14. Why must PC and PSW be saved during interrupts?
15. What is an ISR?
16. How can the CPU identify an interrupting device?
17. What is a vectored interrupt?
18. What is DMA?
19. What is cycle stealing?
20. Why is cycle stealing not an interrupt?
21. What is Direct Cache Access?
22. What is an I/O channel?
23. What is the difference between selector and multiplexor channel?
24. Name five external interconnection standards.
25. Why do mainframes need advanced I/O structures?

---

# Chapter 6 One-Page Memory Map

```text
Input/Output
│
├── External Devices
│   ├── Human-readable
│   ├── Machine-readable
│   └── Communication
│
├── I/O Module
│   ├── Control and timing
│   ├── Processor communication
│   ├── Device communication
│   ├── Data buffering
│   └── Error detection
│
├── I/O Techniques
│   ├── Programmed I/O
│   ├── Interrupt-driven I/O
│   └── DMA
│
├── Interrupts
│   ├── Save PC, PSW, registers
│   ├── ISR
│   ├── Device identification
│   └── Priority / multiple interrupts
│
├── DMA
│   ├── Direct memory transfer
│   ├── Address register
│   ├── Count register
│   └── Cycle stealing
│
├── Advanced I/O
│   ├── DCA / DDIO
│   ├── I/O channels
│   └── I/O processors
│
└── Standards
    ├── USB
    ├── FireWire
    ├── SCSI
    ├── Thunderbolt
    ├── PCIe
    ├── SATA
    ├── InfiniBand
    ├── Ethernet
    └── Wi-Fi
```

Chapter 6 is now complete.
