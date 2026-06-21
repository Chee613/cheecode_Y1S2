# Chapter 3: Network Access and Ethernet

## 1. Chapter Overview

Chapter 3 explains how data actually moves inside a local network.

In Chapter 2, you learned:

```text
Data → Segment → Packet → Frame → Bits
```

In Chapter 3, the focus is mainly on:

```text
Layer 2: Data Link Layer → Frame
Layer 1: Physical Layer  → Bits and signals
```

Main topics:

```text
1. Physical Layer
2. Network Media
3. Data Link Layer
4. Media Access Control
5. Ethernet
6. Switching
7. Address Resolution Protocol, ARP
```

---

# Part 1: Physical Layer

## 1.1 What is the Physical Layer?

The **physical layer** transports the bits that make up a data link layer frame across the network media. It accepts a complete frame from the data link layer and encodes it as signals for the local media. 

Simple meaning:

```text
Physical Layer = sends bits as signals
```

Different media use different signals:

```text
Copper cable      → electrical pulses
Fiber-optic cable → light signals
Wireless          → microwave / radio signals
```

---

## 1.2 Why do we need the Physical Layer?

Computers cannot send words or files directly.

They must convert data into signals that can travel through a medium.

Example:

```text
Computer data
    ↓
Bits
    ↓
Electrical / light / wireless signals
    ↓
Network media
    ↓
Receiver
```

Without the physical layer:

```text
No signals = no data transmission
```

---

## 1.3 Physical Layer Standards

Physical layer standards cover three main areas:

```text
1. Physical components
2. Encoding
3. Signaling
```

---

## 1.4 Physical Components

Physical components are the actual hardware used to send and receive signals.

Examples:

```text
NIC
Network cable
RJ-45 connector
Fiber connector
Router interface
Switch port
Wireless antenna
```

These components include network adapters, interfaces, connectors, cable materials, and cable designs. 

---

## 1.5 Encoding

**Encoding** means converting a stream of data bits into a predefined code pattern.

Simple meaning:

```text
Encoding = rules for representing 0 and 1
```

Example:

```text
0 = one type of pattern
1 = another type of pattern
```

The sender and receiver must understand the same encoding method.

---

## 1.6 Manchester Encoding

In Manchester encoding:

```text
0 = high-to-low voltage transition
1 = low-to-high voltage transition
```

Simple diagram:

```text
Bit 0:
High ───┐
        └── Low

Bit 1:
Low  ───┐
        └── High
```

Easy memory:

```text
Manchester = look at signal change
```

---

## 1.7 NRZ Encoding

**NRZ** means **Non-Return to Zero**.

In NRZ:

```text
0 = one voltage level
1 = another voltage level
```

Example:

```text
0 = Low voltage
1 = High voltage
```

Easy memory:

```text
NRZ = look at voltage level
```

---

## 1.8 Signaling

**Signaling** is the actual method used to represent bits on the physical media.

Example:

```text
Long pulse  = 1
Short pulse = 0
```

Difference:

```text
Encoding  = code rule
Signaling = actual physical signal
```

---

## 1.9 Bandwidth

**Bandwidth** is the capacity of a medium to carry data.

It is measured in:

```text
kbps
Mbps
Gbps
```

Simple meaning:

```text
Bandwidth = maximum possible speed
```

Example:

```text
100 Mbps Ethernet port
```

This means the link can theoretically carry up to 100 megabits per second.

---

## 1.10 Throughput

**Throughput** is the actual amount of bits transferred over the media in a given time.

Simple meaning:

```text
Throughput = real speed you actually get
```

Example:

```text
Bandwidth = 100 Mbps
Actual transfer = 70 Mbps

Throughput = 70 Mbps
```

Throughput can be affected by:

```text
Amount of traffic
Type of traffic
Latency
Number of network devices between source and destination
```

---

## 1.11 Latency

**Latency** means delay.

Simple meaning:

```text
Latency = time taken for data to travel from source to destination
```

High latency causes:

```text
Lag
Slow response
Choppy video calls
Delay in online games
```

---

## 1.12 Goodput

**Goodput** is the amount of usable data transferred over time.

Formula:

```text
Goodput = Throughput - Overhead
```

Relationship:

```text
Bandwidth ≥ Throughput ≥ Goodput
```

Example:

```text
Throughput = 80 Mbps
Overhead = 15 Mbps

Goodput = 80 Mbps - 15 Mbps
Goodput = 65 Mbps
```

---

# Part 2: Network Media

## 2.1 What is Network Media?

**Network media** is the path used to carry data signals.

There are three main types:

```text
1. Copper cable
2. Fiber-optic cable
3. Wireless
```

---

## 2.2 Copper Media

Copper media uses electrical signals.

Advantages:

```text
Inexpensive
Easy to install
Low resistance to electrical current
Common in LANs
```

Weaknesses:

```text
Limited by distance
Affected by signal interference
```

---

## 2.3 Types of Copper Media

The three main copper media types are:

```text
1. UTP
2. STP
3. Coaxial
```

---

## 2.4 UTP Cable

**UTP** stands for **Unshielded Twisted-Pair**.

It is the most common networking cable and uses RJ-45 connectors. 

Common use:

```text
PC to switch
Switch to router
Printer to switch
Access point to switch
```

Easy memory:

```text
UTP = normal Ethernet LAN cable
```

---

## 2.5 STP Cable

**STP** stands for **Shielded Twisted-Pair**.

It has extra shielding to protect from noise.

Compared with UTP:

```text
STP = better noise protection
STP = more expensive
STP = harder to install
```

STP also uses RJ-45 connectors. 

---

## 2.6 UTP vs STP

| Feature      | UTP                     | STP                   |
| ------------ | ----------------------- | --------------------- |
| Full name    | Unshielded Twisted-Pair | Shielded Twisted-Pair |
| Protection   | Lower                   | Higher                |
| Cost         | Cheaper                 | More expensive        |
| Installation | Easier                  | Harder                |
| Connector    | RJ-45                   | RJ-45                 |
| Common use   | Normal LAN              | Noisy environments    |

---

## 2.7 Coaxial Cable

Coaxial cable carries radio frequency, RF, energy.

Common use:

```text
Cable Internet
Cable TV
Wireless antenna connection
```

Example:

```text
Antenna ─── Coaxial cable ─── Radio equipment
```

---

## 2.8 Ethernet Cable Types

There are three important Ethernet cable wiring types:

```text
1. Straight-through
2. Crossover
3. Rollover
```

---

## 2.9 Straight-Through Cable

Straight-through cable is the most common Ethernet cable.

Used for different device types:

```text
PC to switch
Switch to router
Laptop to switch
```

Easy memory:

```text
Different devices = straight-through
```

---

## 2.10 Crossover Cable

Crossover cable is used for similar device types.

Examples:

```text
Switch to switch
PC to PC
Router to router
```

Easy memory:

```text
Same devices = crossover
```

Modern devices may support **Auto-MDIX**, which can automatically detect cable type. 

---

## 2.11 Rollover Cable

Rollover cable is a Cisco proprietary cable used for console access.

Used for:

```text
PC to router console port
PC to switch console port
```

Purpose:

```text
Configuration, not normal network communication
```

Important lab memory:

```text
UTP cable      = normal data communication
Rollover cable = Cisco console configuration
```

---

## 2.12 Cable Type Summary

| Cable type       | Used for              | Example              |
| ---------------- | --------------------- | -------------------- |
| Straight-through | Different devices     | PC to switch         |
| Crossover        | Similar devices       | Switch to switch     |
| Rollover         | Console configuration | PC to router console |

---

## 2.13 Fiber-Optic Cable

Fiber-optic cable sends data using light.

Advantages:

```text
Longer distance
Higher bandwidth
Less electrical interference
```

Used in:

```text
Enterprise networks
FTTH
Long-haul networks
Submarine networks
```

---

## 2.14 Single-Mode Fiber, SMF

**SMF** means **Single-Mode Fiber**.

Characteristics:

```text
Very small core
Uses laser
Sends one ray of light
Good for long distance
More expensive
```

Easy memory:

```text
Single-mode = single path = long distance
```

---

## 2.15 Multimode Fiber, MMF

**MMF** means **Multimode Fiber**.

Characteristics:

```text
Larger core
Uses LED
Light travels at different angles
Popular in LANs
Shorter distance than SMF
```

The note says MMF can support up to 10 Gb/s over link lengths up to 550 meters. 

Easy memory:

```text
Multimode = multiple paths = LAN distance
```

---

## 2.16 SMF vs MMF

| Feature      | SMF                   | MMF               |
| ------------ | --------------------- | ----------------- |
| Full name    | Single-mode fiber     | Multimode fiber   |
| Core         | Very small            | Larger            |
| Light source | Laser                 | LED               |
| Distance     | Very long             | Shorter           |
| Cost         | More expensive        | Usually cheaper   |
| Common use   | Long-distance network | LAN / data center |

---

## 2.17 Fiber Connectors

Common fiber connectors:

```text
ST
SC
LC
```

### ST

```text
ST = Straight-Tip
Older bayonet-style connector
Common with multimode fiber
```

### SC

```text
SC = Subscriber Connector / Square Connector
Uses push-pull mechanism
Used with multimode and single-mode fiber
```

### LC

```text
LC = Lucent Connector / Little Connector
Smaller size
Popular connector
Supports single-mode and multimode fiber
```

---

## 2.18 Wireless Media

Wireless media carries electromagnetic signals using radio or microwave frequencies. 

Examples:

```text
Wi-Fi
Bluetooth
Wireless access point
Mobile network
```

Wireless issues:

```text
Coverage area
Interference
Security
```

---

## 2.19 Wireless Coverage

Wireless coverage can be affected by:

```text
Walls
Building materials
Distance
Terrain
Floors
Obstacles
```

---

## 2.20 Wireless Interference

Wireless can be disrupted by:

```text
Microwave ovens
Cordless phones
Fluorescent lights
Other wireless networks
Other wireless devices
```

---

## 2.21 Wireless Security

Wireless signals travel through the air.

So they need security:

```text
Strong password
Encryption
Secure authentication
Avoid open Wi-Fi
```

---

# Part 3: Data Link Layer

## 3.1 What is the Data Link Layer?

The **data link layer** is responsible for exchanging frames between nodes over physical network media. It controls media access and performs error detection. It also packages Layer 3 packets into frames. 

Simple meaning:

```text
Data Link Layer = creates and handles frames
```

---

## 3.2 PDU of Data Link Layer

The PDU of Layer 2 is:

```text
Frame
```

Remember:

```text
Layer 4 = Segment
Layer 3 = Packet
Layer 2 = Frame
Layer 1 = Bits
```

---

## 3.3 Why do we need the Data Link Layer?

Before data becomes physical signals, it must be prepared as a frame.

The frame helps answer:

```text
Who is sending?
Who should receive?
Where does the frame start?
Where does the frame end?
Is there an error?
Who can use the media?
```

---

## 3.4 Frame Structure

A data link layer frame has three main parts:

```text
Header
Data
Trailer
```

Diagram:

```text
+----------------+--------------------------+----------------+
| Header         | Data                     | Trailer        |
+----------------+--------------------------+----------------+
| Control info   | Layer 3 packet           | Error checking |
+----------------+--------------------------+----------------+
```

---

## 3.5 Header

The header is at the beginning of the frame.

It contains control information such as addressing. 

For Ethernet, this includes:

```text
Source MAC address
Destination MAC address
Other control information
```

---

## 3.6 Data

The data part carries the Layer 3 packet.

It contains:

```text
IP header
Transport layer header
Application data
```

---

## 3.7 Trailer

The trailer is at the end of the frame.

It contains control information for error detection. 

Simple meaning:

```text
Trailer = checks whether frame is damaged
```

---

## 3.8 LLC and MAC Sublayers

The data link layer has two sublayers:

```text
1. LLC
2. MAC
```

---

## 3.9 LLC Sublayer

**LLC** stands for **Logical Link Control**.

It is the upper sublayer.

Simple meaning:

```text
LLC = connects Layer 2 with Layer 3 services
```

---

## 3.10 MAC Sublayer

**MAC** stands for **Media Access Control**.

It is the lower sublayer.

Simple meaning:

```text
MAC = controls access to media and provides Layer 2 addressing
```

---

## 3.11 LLC vs MAC

| Sublayer | Full name            | Simple job                           |
| -------- | -------------------- | ------------------------------------ |
| LLC      | Logical Link Control | Supports network layer protocols     |
| MAC      | Media Access Control | Controls media access and addressing |

Easy memory:

```text
LLC looks upward.
MAC looks downward.
```

---

## 3.12 Important Frame Concept

When data travels across multiple networks:

```text
IP packet travels end-to-end.
Layer 2 frame changes link-by-link.
```

Example:

```text
PC → Switch → Router → Internet → Server
```

The IP packet still has the final source and destination IP.

But each local link may use a different frame.

---

# Part 4: Media Access Control

## 4.1 What is Media Access Control?

Media Access Control controls how devices access and use the network media.

Simple meaning:

```text
MAC = rules for who can send and when
```

---

## 4.2 Why do we need Media Access Control?

If many devices send at the same time, signals can collide or interfere.

Example:

```text
PC 1 sends
PC 2 sends
PC 3 sends
All at same time
= possible collision
```

So devices need access rules.

---

## 4.3 Media Access Control Depends On

The note says media access control methods depend on:

```text
1. Topology
2. Media sharing
```



---

## 4.4 Topology

Topology means how the connection between nodes appears to the data link layer.

Simple meaning:

```text
Topology = network layout
```

Example:

```text
PC 1 ─┐
PC 2 ─┼── Switch
PC 3 ─┘
```

---

## 4.5 Media Sharing

Media sharing means how devices share the transmission medium.

Example wireless:

```text
Laptop 1 )))
Laptop 2 )))  shared air
Phone    )))
```

More devices sharing the same media means higher chance of collision or waiting.

---

## 4.6 Two Basic Media Access Methods

There are two basic methods for shared media:

```text
1. Contention-based access
2. Controlled access
```

---

## 4.7 Contention-Based Access

Contention-based access means all nodes compete to use the medium.

Simple meaning:

```text
Contention-based = devices compete
```

If collision happens, they follow a plan to recover.

Weakness:

```text
More nodes = more chance of collision
```

The note says contention-based systems do not scale well under heavy media use. 

---

## 4.8 Controlled Access

Controlled access means each node has its own time to use the medium.

Simple meaning:

```text
Controlled access = devices take turns
```

---

## 4.9 Contention-Based vs Controlled Access

| Feature    | Contention-based          | Controlled access        |
| ---------- | ------------------------- | ------------------------ |
| Basic idea | Compete                   | Take turns               |
| Collision  | Possible                  | Reduced                  |
| Example    | Students speak when quiet | Teacher gives turns      |
| Weakness   | Poor under heavy load     | Needs control/scheduling |

---

## 4.10 CSMA

**CSMA** stands for:

```text
Carrier Sense Multiple Access
```

Breakdown:

```text
Carrier Sense = listen/check media first
Multiple Access = many devices share media
```

Simple meaning:

```text
CSMA = listen before sending
```

---

## 4.11 CSMA/CD

**CSMA/CD** stands for:

```text
Carrier Sense Multiple Access with Collision Detection
```

Simple meaning:

```text
CSMA/CD = listen, send, detect collision, stop, retry
```

Process:

```text
1. Device wants to send.
2. Device listens to the media.
3. If media is busy, wait.
4. If media is free, send.
5. If collision is detected, stop.
6. Wait and retry later.
```

Easy memory:

```text
CD = Collision Detection
```

---

## 4.12 CSMA/CA

**CSMA/CA** stands for:

```text
Carrier Sense Multiple Access with Collision Avoidance
```

Simple meaning:

```text
CSMA/CA = try to avoid collision before sending
```

Process:

```text
1. Device checks media.
2. If media is busy, wait.
3. If media is free, send intent/notification.
4. Wait for clearance.
5. Send data.
```

Easy memory:

```text
CA = Collision Avoidance
```

---

## 4.13 CSMA/CD vs CSMA/CA

| Feature     | CSMA/CD                           | CSMA/CA                        |
| ----------- | --------------------------------- | ------------------------------ |
| Full name   | Collision Detection               | Collision Avoidance            |
| Main idea   | Detect collision after it happens | Avoid collision before sending |
| Common use  | Older shared Ethernet             | Wireless / Wi-Fi               |
| Easy memory | Detect crash                      | Avoid crash                    |

---

# Part 5: Ethernet

## 5.1 What is Ethernet?

Ethernet is the most widely used LAN technology today. It operates in the data link layer and the physical layer. It is defined in IEEE 802.2 and 802.3 standards. 

Simple meaning:

```text
Ethernet = common wired LAN technology
```

---

## 5.2 Ethernet Works at Two Layers

```text
Layer 2 Data Link Layer → Ethernet frame, MAC address
Layer 1 Physical Layer  → cable, signal, speed
```

---

## 5.3 Ethernet Speeds

Ethernet supports:

```text
10 Mbps
100 Mbps
1 Gbps
10 Gbps
40 Gbps
100 Gbps
```

---

## 5.4 Bits and Bytes Reminder

```text
1 byte = 8 bits
```

Network speed usually uses bits.

```text
Mbps = megabits per second
MBps = megabytes per second
```

Example:

```text
100 Mbps ÷ 8 = 12.5 MBps
```

---

## 5.5 Ethernet Frame Size

The note says:

```text
Minimum Ethernet frame size = 64 bytes
Maximum Ethernet frame size = 1518 bytes
```



Convert to bits:

```text
64 bytes × 8 = 512 bits
1518 bytes × 8 = 12,144 bits
```

---

## 5.6 What is a MAC Address?

A MAC address is a unique Layer 2 address used to identify source and destination nodes in an Ethernet network.

The note says an Ethernet MAC address is:

```text
48-bit binary value
12 hexadecimal digits
```



Example:

```text
00-1A-2B-3C-4D-5E
```

---

## 5.7 MAC Address Calculation

Each hexadecimal digit represents 4 bits.

```text
1 hex digit = 4 bits
```

Therefore:

```text
48 bits ÷ 4 bits per hex digit = 12 hex digits
```

Also:

```text
48 bits ÷ 8 bits per byte = 6 bytes
```

So:

```text
MAC address = 48 bits = 6 bytes = 12 hex digits
```

---

## 5.8 How to Check MAC Address on Windows

Use:

```bash
ipconfig /all
```

Look for:

```text
Physical Address
```

---

## 5.9 Ethernet Communication Types

Ethernet uses MAC addresses for:

```text
1. Unicast
2. Broadcast
3. Multicast
```

---

## 5.10 Unicast

Unicast means one-to-one communication.

```text
PC A ─────> PC B
```

Example:

```text
One PC sends data to one server.
```

---

## 5.11 Broadcast

Broadcast means one-to-all communication in the local network.

```text
PC A ─────> all devices in LAN
```

Broadcast MAC address:

```text
FF-FF-FF-FF-FF-FF
```

Example:

```text
ARP Request
```

---

## 5.12 Multicast

Multicast means one-to-selected-group communication.

```text
Sender ─────> selected group of receivers
```

Example:

```text
Video stream to a group
Routing protocol updates
IPTV
```

---

## 5.13 Unicast vs Broadcast vs Multicast

| Type      | Meaning      | Receiver          |
| --------- | ------------ | ----------------- |
| Unicast   | One-to-one   | One device        |
| Broadcast | One-to-all   | All local devices |
| Multicast | One-to-group | Selected group    |

Easy memory:

```text
Uni = one
Broad = all
Multi = group
```

---

## 5.14 Switch MAC Address Table

An Ethernet switch uses a MAC address table to make forwarding decisions.

The note says a switch dynamically builds its MAC address table by examining the **source MAC address** of frames received on a port. 

Important memory:

```text
Switch learns from source MAC.
Switch forwards using destination MAC.
```

Example MAC table:

```text
MAC Address           Port
AA-AA-AA-AA-AA-AA     Fa0/1
BB-BB-BB-BB-BB-BB     Fa0/2
CC-CC-CC-CC-CC-CC     Fa0/3
```

---

## 5.15 Useful Switch Command

```cisco
show mac address-table
```

This shows learned MAC addresses and their ports.

---

# Part 6: Switching

## 6.1 What is Switching?

Switching is the process where a switch receives a frame and forwards it to the correct port.

Simple meaning:

```text
Switching = moving frames between switch ports
```

---

## 6.2 Switch Forwarding Methods

The note lists these switching methods:

```text
1. Store-and-forward switching
2. Cut-through switching
   - Fast-forward switching
   - Fragment-free switching
```



---

## 6.3 Store-and-Forward Switching

Store-and-forward switching means the switch receives the whole frame first.

Process:

```text
1. Receive complete frame.
2. Store it in buffer.
3. Check for errors using CRC.
4. If frame is good, forward it.
5. If frame is bad, drop it.
```

Simple memory:

```text
Store-and-forward = safer but slower
```

---

## 6.4 CRC

**CRC** stands for:

```text
Cyclic Redundancy Check
```

Simple meaning:

```text
CRC = error-checking method
```

Important:

```text
CRC detects errors.
CRC does not repair errors.
```

---

## 6.5 Cut-Through Switching

Cut-through switching means the switch starts forwarding before the full frame is received.

Simple memory:

```text
Cut-through = faster but less checking
```

Process:

```text
1. Frame begins entering switch.
2. Switch reads destination MAC address.
3. Switch starts forwarding quickly.
```

---

## 6.6 Fast-Forward Switching

Fast-forward switching is a type of cut-through switching.

It immediately forwards after reading the destination address.

Simple memory:

```text
Fast-forward = fastest forwarding
```

Weakness:

```text
May forward corrupted frames
```

---

## 6.7 Fragment-Free Switching

Fragment-free switching stores the first 64 bytes before forwarding.

The note says it stores the first 64 bytes of the frame before forwarding. 

Important connection:

```text
Minimum Ethernet frame size = 64 bytes
Fragment-free checks first 64 bytes
```

Convert:

```text
64 bytes × 8 = 512 bits
```

---

## 6.8 Switching Method Comparison

| Method            | How it works                        | Advantage                | Disadvantage                     |
| ----------------- | ----------------------------------- | ------------------------ | -------------------------------- |
| Store-and-forward | Receives whole frame and checks CRC | More reliable            | Slower                           |
| Cut-through       | Forwards before full frame arrives  | Faster                   | Less error checking              |
| Fast-forward      | Forwards after destination address  | Very fast                | May forward bad frames           |
| Fragment-free     | Stores first 64 bytes first         | Better than fast-forward | Not as safe as store-and-forward |

---

## 6.9 Buffering

Buffering means temporary storage of frames.

The note says switches may use buffering to store frames before forwarding, especially when the destination port is busy due to congestion. 

Simple meaning:

```text
Buffering = temporary waiting area for frames
```

Example:

```text
Many PCs send to one server.
The destination switch port becomes busy.
Switch stores some frames in buffer.
```

---

## 6.10 Congestion

Congestion means too much traffic is trying to use the same path or port.

Simple meaning:

```text
Congestion = network traffic jam
```

If buffer becomes full:

```text
Frames may be dropped.
```

---

# Part 7: Address Resolution Protocol, ARP

## 7.1 What is ARP?

**ARP** stands for:

```text
Address Resolution Protocol
```

ARP is used to resolve IPv4 addresses to MAC addresses. 

Simple meaning:

```text
ARP = IPv4 address → MAC address
```

---

## 7.2 Why do we need ARP?

Ethernet frames need MAC addresses.

But users and applications usually use IP addresses.

So the device must find:

```text
IPv4 address → matching MAC address
```

Example:

```text
Known:
PC B IP = 192.168.1.20

Needed:
PC B MAC = ?
```

ARP finds the MAC address.

---

## 7.3 ARP Table

An ARP table stores IPv4-to-MAC mappings.

Example:

```text
IPv4 Address       MAC Address
192.168.1.1        AA-AA-AA-AA-AA-AA
192.168.1.20       BB-BB-BB-BB-BB-BB
```

Simple meaning:

```text
ARP table = contact list for IP and MAC
```

---

## 7.4 Same Network ARP Process

If the destination is on the same network, ARP finds the MAC address of the destination device.

Example:

```text
PC A IP  = 192.168.1.10
PC B IP  = 192.168.1.20
Same network = 192.168.1.0/24
```

Process:

```text
1. PC A checks ARP table.
2. If no entry, PC A sends ARP request.
3. ARP request is broadcast.
4. PC B replies with its MAC address.
5. PC A saves mapping in ARP table.
6. PC A sends Ethernet frame to PC B MAC.
```

---

## 7.5 ARP Request

ARP request is broadcast.

Broadcast MAC address:

```text
FF-FF-FF-FF-FF-FF
```

Message example:

```text
Who has 192.168.1.20?
Tell 192.168.1.10.
```

All devices in the local network receive it.

---

## 7.6 ARP Reply

Only the device with the matching IP replies.

Example:

```text
I am 192.168.1.20.
My MAC address is BB-BB-BB-BB-BB-BB.
```

ARP reply is usually unicast back to the requester.

---

## 7.7 Different Network ARP Process

If the destination is on a different network, the device does not look for the final destination MAC.

Instead, it looks for the MAC address of the default gateway.

The note says if the destination IPv4 address is on a different network, the device searches the ARP table for the IPv4 address of the default gateway. 

Important memory:

```text
Same network      → ARP for destination device MAC
Different network → ARP for default gateway MAC
```

---

## 7.8 Different Network Example

PC A wants to send to Google DNS:

```text
PC A IP = 192.168.1.10
Default gateway = 192.168.1.1
Destination IP = 8.8.8.8
```

Since 8.8.8.8 is not in PC A’s local network:

```text
Destination IP in packet = 8.8.8.8
Destination MAC in frame = default gateway MAC
```

Important:

```text
IP packet goes to final destination.
Ethernet frame goes to next local hop.
```

---

## 7.9 If No ARP Reply

If no device replies to the ARP request, the packet is dropped because a frame cannot be created. 

Simple meaning:

```text
No MAC address = no frame
No frame = cannot send packet
```

---

## 7.10 ARP Cache Timer

ARP entries are temporary.

The note says Windows ARP entries may be removed after a specified time, between 15 and 45 seconds. 

Reason:

```text
Devices may disconnect
MAC addresses may change
IP-to-MAC mappings may become outdated
```

---

## 7.11 Check ARP Table on Windows

Use:

```bash
arp -a
```

Example:

```text
Internet Address      Physical Address
192.168.1.1           aa-aa-aa-aa-aa-aa
192.168.1.20          bb-bb-bb-bb-bb-bb
```

---

## 7.12 ARP Issues

The note lists ARP issues:

```text
1. Overhead on the media
2. Security
```

---

## 7.13 ARP Overhead

ARP request is broadcast.

So every device in the local network receives and processes it.

If many devices send ARP requests at the same time, network performance may reduce for a short time. 

Simple meaning:

```text
ARP broadcast = extra traffic
```

---

## 7.14 ARP Spoofing and ARP Poisoning

ARP has security issues.

A threat actor can use ARP spoofing to perform ARP poisoning. The attacker sends a fake ARP reply using the attacker’s own MAC address for another device’s IP address, such as the default gateway. 

Simple meaning:

```text
ARP spoofing = attacker lies about MAC address
ARP poisoning = victim stores wrong MAC address
```

Normal:

```text
Victim PC ───> Router ───> Internet
```

After ARP poisoning:

```text
Victim PC ───> Attacker ───> Router ───> Internet
```

Possible attacker actions:

```text
Read traffic
Modify traffic
Drop traffic
Redirect traffic
```

---

# Chapter 3 Command Summary

## Windows Commands

### Check IP, MAC, default gateway, DNS

```bash
ipconfig /all
```

Look for:

```text
IPv4 Address
Subnet Mask
Default Gateway
DNS Server
Physical Address
```

### Test connectivity

```bash
ping 192.168.1.1
```

### Check ARP table

```bash
arp -a
```

---

## Cisco Commands

### Check MAC address table

```cisco
show mac address-table
```

### Check interface summary

```cisco
show ip interface brief
```

### Check interface details and errors

```cisco
show interfaces
```

### Check running configuration

```cisco
show running-config
```

---

# Chapter 3 Important Formulas and Calculations

## 1. Byte to Bit

```text
1 byte = 8 bits
```

---

## 2. Ethernet Minimum Frame Size

```text
64 bytes × 8 = 512 bits
```

---

## 3. Ethernet Maximum Frame Size

```text
1518 bytes × 8 = 12,144 bits
```

---

## 4. MAC Address Hex Calculation

```text
1 hexadecimal digit = 4 bits
```

MAC address:

```text
48 bits ÷ 4 bits per hex digit = 12 hex digits
```

Also:

```text
48 bits ÷ 8 bits per byte = 6 bytes
```

Therefore:

```text
MAC address = 48 bits = 6 bytes = 12 hex digits
```

---

## 5. Goodput Formula

```text
Goodput = Throughput - Overhead
```

Relationship:

```text
Bandwidth ≥ Throughput ≥ Goodput
```

---

# Chapter 3 Common Mistakes

## Mistake 1: Confusing Ethernet and Internet

```text
Ethernet = LAN technology
Internet = worldwide network
```

---

## Mistake 2: Confusing IP address and MAC address

```text
IP address  = Layer 3
MAC address = Layer 2
```

---

## Mistake 3: Thinking switches forward using IP address

Wrong:

```text
Switch forwards using IP address.
```

Correct:

```text
Switch forwards using destination MAC address.
```

---

## Mistake 4: Forgetting how switches learn

Important:

```text
Switch learns from source MAC.
Switch forwards using destination MAC.
```

---

## Mistake 5: Confusing ARP direction

Wrong:

```text
ARP resolves MAC to IP.
```

Correct:

```text
ARP resolves IPv4 to MAC.
```

---

## Mistake 6: Thinking ARP request is unicast

Wrong:

```text
ARP request goes to one device.
```

Correct:

```text
ARP request is broadcast.
```

---

## Mistake 7: Using final destination MAC for another network

Wrong:

```text
PC sends frame directly to remote server MAC.
```

Correct:

```text
PC sends frame to default gateway MAC.
```

---

## Mistake 8: Confusing CSMA/CD and CSMA/CA

```text
CSMA/CD = Collision Detection
CSMA/CA = Collision Avoidance
```

---

## Mistake 9: Thinking CRC repairs errors

Wrong:

```text
CRC fixes damaged frames.
```

Correct:

```text
CRC detects damaged frames.
```

---

## Mistake 10: Thinking console cable is for normal network traffic

Wrong:

```text
Console cable is used for ping/data communication.
```

Correct:

```text
Console/rollover cable is used for device configuration.
```

---

# Chapter 3 Viva / Exam-Style Questions

## Q1. What is the function of the physical layer?

The physical layer transports bits across network media by converting frames into signals.

---

## Q2. What signal is used by copper cable?

Copper cable uses electrical pulses.

---

## Q3. What signal is used by fiber-optic cable?

Fiber-optic cable uses light signals.

---

## Q4. What signal is used by wireless media?

Wireless media uses radio or microwave signals.

---

## Q5. What is bandwidth?

Bandwidth is the capacity of a medium to carry data.

---

## Q6. What is throughput?

Throughput is the actual amount of data transferred over time.

---

## Q7. What is goodput?

Goodput is usable data transferred after subtracting overhead.

---

## Q8. What are the three main types of copper media?

```text
UTP
STP
Coaxial
```

---

## Q9. What is UTP?

UTP is Unshielded Twisted-Pair cable, the most common Ethernet LAN cable.

---

## Q10. What is STP?

STP is Shielded Twisted-Pair cable, which gives better noise protection than UTP.

---

## Q11. What is a straight-through cable used for?

It is used to connect different device types, such as PC to switch.

---

## Q12. What is a crossover cable used for?

It is used to connect similar device types, such as switch to switch.

---

## Q13. What is a rollover cable used for?

It is used to connect to a Cisco router or switch console port for configuration.

---

## Q14. What is the PDU of the data link layer?

The PDU is a frame.

---

## Q15. What are the three parts of a frame?

```text
Header
Data
Trailer
```

---

## Q16. What is the purpose of the trailer?

The trailer is used for error detection.

---

## Q17. What are the two data link layer sublayers?

```text
LLC
MAC
```

---

## Q18. What is contention-based access?

It is a method where all devices compete to use the media.

---

## Q19. What is controlled access?

It is a method where each device has its own time to use the medium.

---

## Q20. What does CSMA/CD mean?

Carrier Sense Multiple Access with Collision Detection.

---

## Q21. What does CSMA/CA mean?

Carrier Sense Multiple Access with Collision Avoidance.

---

## Q22. What is Ethernet?

Ethernet is the most widely used LAN technology.

---

## Q23. Which layers does Ethernet operate at?

Ethernet operates at the data link layer and physical layer.

---

## Q24. What is the minimum Ethernet frame size?

64 bytes.

---

## Q25. What is the maximum Ethernet frame size?

1518 bytes.

---

## Q26. What is a MAC address?

A MAC address is a 48-bit Layer 2 address used to identify devices in Ethernet.

---

## Q27. Why does a MAC address have 12 hexadecimal digits?

Because:

```text
48 bits ÷ 4 bits per hexadecimal digit = 12 hexadecimal digits
```

---

## Q28. What is unicast?

One-to-one communication.

---

## Q29. What is broadcast?

One-to-all communication in the local network.

---

## Q30. What is multicast?

One-to-selected-group communication.

---

## Q31. How does a switch learn MAC addresses?

A switch learns from the source MAC address of received frames.

---

## Q32. How does a switch forward frames?

A switch forwards frames based on the destination MAC address.

---

## Q33. What is store-and-forward switching?

It receives the whole frame, checks CRC, then forwards or drops it.

---

## Q34. What is cut-through switching?

It starts forwarding before receiving the full frame.

---

## Q35. What is fast-forward switching?

It forwards immediately after reading the destination address.

---

## Q36. What is fragment-free switching?

It stores the first 64 bytes before forwarding.

---

## Q37. What is buffering?

Buffering is temporary storage for frames before forwarding.

---

## Q38. What is ARP?

ARP resolves IPv4 addresses to MAC addresses.

---

## Q39. What MAC address is used for ARP request?

```text
FF-FF-FF-FF-FF-FF
```

---

## Q40. If the destination is on another network, whose MAC address does ARP need?

The MAC address of the default gateway.

---

# Chapter 3 Mini Quiz

## Question 1

Layer 2 PDU is:

A. Segment
B. Packet
C. Frame
D. Bits

Answer: **C. Frame**

---

## Question 2

Layer 1 PDU is:

A. Segment
B. Packet
C. Frame
D. Bits

Answer: **D. Bits**

---

## Question 3

UTP cable commonly uses which connector?

A. HDMI
B. USB
C. RJ-45
D. VGA

Answer: **C. RJ-45**

---

## Question 4

Straight-through cable is commonly used for:

A. Switch to switch
B. PC to switch
C. PC to PC
D. Router to router

Answer: **B. PC to switch**

---

## Question 5

Crossover cable is traditionally used for:

A. PC to switch
B. Switch to router
C. Switch to switch
D. PC to printer through USB

Answer: **C. Switch to switch**

---

## Question 6

Rollover cable is used for:

A. Console configuration
B. Internet browsing
C. Wireless connection
D. Fiber connection

Answer: **A. Console configuration**

---

## Question 7

Ethernet operates at:

A. Application and transport layer
B. Data link and physical layer
C. Network and transport layer
D. Session and presentation layer

Answer: **B. Data link and physical layer**

---

## Question 8

A MAC address has:

A. 32 bits
B. 48 bits
C. 64 bits
D. 128 bits

Answer: **B. 48 bits**

---

## Question 9

Broadcast MAC address is:

A. 00-00-00-00-00-00
B. 127.0.0.1
C. FF-FF-FF-FF-FF-FF
D. 192.168.1.1

Answer: **C. FF-FF-FF-FF-FF-FF**

---

## Question 10

ARP resolves:

A. MAC to IP
B. IPv4 to MAC
C. Domain to IP
D. Port to process

Answer: **B. IPv4 to MAC**

---

# Final Chapter 3 Memory Map

```text
Chapter 3: Network Access and Ethernet
│
├── Physical Layer
│   ├── Sends bits as signals
│   ├── Copper = electrical pulses
│   ├── Fiber = light
│   └── Wireless = radio/microwave
│
├── Network Media
│   ├── Copper
│   │   ├── UTP
│   │   ├── STP
│   │   └── Coaxial
│   ├── Fiber
│   │   ├── SMF
│   │   └── MMF
│   └── Wireless
│
├── Data Link Layer
│   ├── Creates frames
│   ├── Header
│   ├── Data
│   ├── Trailer
│   ├── LLC
│   └── MAC
│
├── Media Access Control
│   ├── Contention-based access
│   ├── Controlled access
│   ├── CSMA/CD
│   └── CSMA/CA
│
├── Ethernet
│   ├── Most common LAN technology
│   ├── Works at Layer 2 and Layer 1
│   ├── MAC address
│   ├── Unicast
│   ├── Broadcast
│   └── Multicast
│
├── Switching
│   ├── MAC address table
│   ├── Store-and-forward
│   ├── Cut-through
│   ├── Fast-forward
│   ├── Fragment-free
│   └── Buffering
│
└── ARP
    ├── IPv4 to MAC
    ├── ARP request = broadcast
    ├── ARP reply = usually unicast
    ├── Same network = destination MAC
    ├── Different network = gateway MAC
    └── ARP spoofing / poisoning
```

---

# Final Key Sentences to Memorise

```text
Physical layer sends bits as signals.
```

```text
Data link layer creates frames.
```

```text
Ethernet is the most widely used LAN technology.
```

```text
MAC address is a 48-bit Layer 2 address.
```

```text
A switch learns from source MAC and forwards using destination MAC.
```

```text
Store-and-forward checks the full frame using CRC before forwarding.
```

```text
Cut-through forwards before the full frame arrives.
```

```text
ARP resolves IPv4 addresses to MAC addresses.
```

```text
ARP request uses broadcast MAC FF-FF-FF-FF-FF-FF.
```

```text
If the destination is on another network, ARP finds the MAC address of the default gateway.
```

Chapter 3 is now fully completed.
