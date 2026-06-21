# Chapter 4: Network and Transport Layer

---

# 1. Chapter 4 Big Picture

Chapter 4 focuses on two important layers:

```text
Network Layer
Transport Layer
```

Simple idea:

```text
Network Layer = device-to-device delivery across networks
Transport Layer = application-to-application delivery
```

Example:

```text
Your laptop opens a website.

Network Layer:
Your laptop IP → Web server IP

Transport Layer:
Your browser → Web server application
```

---

# 2. Network Layer

## 2.1 What is the Network Layer?

The **Network Layer** allows end devices to exchange data across networks. It provides addressing, encapsulation, routing, and de-encapsulation. 

Simple meaning:

```text
Network Layer helps packets travel from one device to another device across networks.
```

Example:

```text
PC A → Router → Internet → Server
```

The main address used at this layer is the **IP address**.

---

## 2.2 Why we need the Network Layer

Inside a local network, a switch can forward frames using MAC addresses.

But when data must go to another network, we need IP addressing and routing.

```text
Same LAN:
PC A → Switch → PC B

Different network:
PC A → Switch → Router → Internet → Server
```

So:

```text
MAC address = local network delivery
IP address = across-network delivery
```

---

# 3. Four Basic Processes of the Network Layer

The uploaded slide lists four basic Network Layer processes: **addressing end devices, encapsulation, routing, and de-encapsulation**. 

---

## 3.1 Addressing End Devices

Each end device must have a unique IP address for identification.

Example:

```text
PC A: 192.168.1.10
PC B: 192.168.1.20
Server: 8.8.8.8
```

The IP address tells the network:

```text
Who is sending?
Who should receive?
```

### Common mistake

Do not confuse IP address and MAC address.

```text
IP address  = logical address
MAC address = physical hardware address
```

---

## 3.2 Encapsulation

At the Network Layer, an **IP header** is added to the data received from the Transport Layer. 

Before Network Layer:

```text
[ Transport Layer Data ]
```

After Network Layer encapsulation:

```text
[ IP Header ][ Transport Layer Data ]
```

This becomes a:

```text
Packet
```

The IP header includes information such as:

```text
Source IP address
Destination IP address
```

---

## 3.3 Routing

**Routing** means directing packets to the destination host on another network. 

Simple meaning:

```text
Routing chooses the path for packets to reach another network.
```

Example:

```text
PC A → Router → Router → Server
```

Routers use the **destination IP address** to decide where to send packets.

---

## 3.4 De-encapsulation

When the packet arrives at the destination host, the IP header is removed and the data is passed up to the Transport Layer. 

Sending side:

```text
Add IP header
```

Receiving side:

```text
Remove IP header
```

---

# 4. IPv4 and IPv6

The two common Network Layer protocols are:

```text
IPv4
IPv6
```



Example IPv4:

```text
192.168.1.10
```

Example IPv6:

```text
2001:db8::1
```

---

# 5. Basic Characteristics of IP

The slide lists three basic characteristics of IP:

```text
1. Connectionless
2. Best effort / unreliable
3. Media independent
```



---

## 5.1 IP is Connectionless

**Connectionless** means IP does not establish a connection before sending packets.

Simple example:

```text
IP sends the packet without asking:
"Are you ready to receive?"
```

Do not confuse this with TCP.

```text
IP  = connectionless
TCP = connection-oriented
```

---

## 5.2 IP is Best Effort / Unreliable

**Best effort** means IP tries to deliver packets, but delivery is not guaranteed.

```text
Packet 1 arrives
Packet 2 lost
Packet 3 arrives
```

IP itself does not retransmit missing packets.

TCP can handle retransmission later at the Transport Layer.

---

## 5.3 IP is Media Independent

**Media independent** means IP can work over different types of media.

Examples:

```text
Copper cable
Fiber optic cable
Wireless
```

The same IP packet can travel through different media.

```text
Laptop → Wi-Fi → Router → Copper → ISP → Fiber → Server
```

---

# 6. IPv4 Problems

The slide lists three major IPv4 issues:

```text
1. IP address depletion
2. Lack of end-to-end connectivity
3. Increased network complexity
```



---

## 6.1 IP Address Depletion

IPv4 uses **32-bit** addresses.

Formula:

```text
Total IPv4 addresses = 2^32
```

Calculation:

```text
2^32 = 4,294,967,296
```

So IPv4 has about **4.3 billion** possible addresses.

This is not enough for all modern devices:

```text
Phones
Laptops
Servers
Smart TVs
IoT devices
CCTV cameras
Printers
Routers
```

---

## 6.2 Lack of End-to-End Connectivity

Because IPv4 addresses are limited, many devices share one public IP address using NAT.

Example:

```text
Home public IP: 203.0.113.10

Inside home:
Phone: 192.168.1.10
Laptop: 192.168.1.11
TV: 192.168.1.12
```

To the Internet, they may all appear as:

```text
203.0.113.10
```

This hides internal devices from direct outside access.

---

## 6.3 Increased Network Complexity

NAT helps solve IPv4 shortage, but it adds complexity.

Problems include:

```text
Extra translation
More latency
Harder troubleshooting
Port forwarding problems
```

---

# 7. IPv6 Improvements

The slide says IPv6 overcomes IPv4 limitations through:

```text
1. Increased address space
2. Improved packet handling
3. Eliminates the need for NAT
4. Integrated security
```



---

## 7.1 Increased Address Space

IPv6 uses **128-bit** addresses.

Compare:

```text
IPv4 = 32-bit
IPv6 = 128-bit
```

IPv6 has a much larger number of possible addresses.

---

## 7.2 Improved Packet Handling

IPv6 has a simplified header with fewer fields.

This helps routers process packets more efficiently.

---

## 7.3 Eliminates the Need for NAT

Because IPv6 has many addresses, devices can have unique IP addresses.

This reduces the need for NAT.

Important:

```text
No NAT does not mean no security.
IPv6 still needs firewalls and proper configuration.
```

---

## 7.4 Integrated Security

IPv6 natively supports authentication and privacy capabilities. 

Simple meaning:

```text
Authentication = checking identity
Privacy = protecting communication
```

---

# 8. Routing

## 8.1 What is Routing?

Routing is the process of forwarding packets between networks.

```text
Network A → Router → Network B
```

A router connects multiple networks and uses a routing table to decide where to send packets.

---

# 9. Three Possible Packet Destinations

The slide says a host can send packets to:

```text
1. Itself
2. Local host
3. Remote host
```



---

## 9.1 Itself / Loopback

A host can test itself using loopback.

IPv4 command:

```bash
ping 127.0.0.1
```

IPv6 loopback is commonly:

```bash
ping ::1
```

Purpose:

```text
Tests the TCP/IP protocol stack on the local host.
```

Important:

```text
ping 127.0.0.1 does not test the cable.
ping 127.0.0.1 does not test the router.
```

---

## 9.2 Local Host

A local host is a destination host on the same local network.

Example:

```text
PC A: 192.168.1.10
PC B: 192.168.1.20
Mask: 255.255.255.0
```

Both are in:

```text
192.168.1.0/24
```

So PC B is local to PC A.

---

## 9.3 Remote Host

A remote host is on another network.

Example:

```text
PC A: 192.168.1.10
Server: 8.8.8.8
```

The server is remote.

So PC A sends the packet to the **default gateway**.

---

# 10. Same Network or Different Network

A host determines whether the destination is local or remote by checking:

```text
Own IPv4 address
Own subnet mask
Destination IPv4 address
```



Example:

```text
PC A: 192.168.1.10
PC B: 192.168.1.20
Mask: 255.255.255.0
```

Network:

```text
192.168.1.0/24
```

Same network.

Another example:

```text
PC A: 192.168.1.10
PC B: 192.168.2.20
Mask: 255.255.255.0
```

Networks:

```text
PC A network: 192.168.1.0/24
PC B network: 192.168.2.0/24
```

Different networks.

---

# 11. Default Gateway

The **default gateway** is the device that routes traffic from the local network to remote networks. 

Usually, it is the router interface connected to the LAN.

Example:

```text
PC IP: 192.168.1.10
Subnet mask: 255.255.255.0
Default gateway: 192.168.1.1
```

Diagram:

```text
PC -------- Switch -------- Router -------- Internet
192.168.1.10              192.168.1.1
                          Default Gateway
```

If destination is remote:

```text
Send to default gateway.
```

---

# 12. Router Routing Table

A router contains a **routing table**.

The routing table is like the router’s map.

Example:

```text
Destination Network     Send Out
192.168.1.0/24          G0/0
192.168.2.0/24          G0/1
0.0.0.0/0               ISP Router
```

Cisco command:

```bash
show ip route
```

---

# 13. Three Types of Route Entries

The slide says the routing table stores three types of route entries:

```text
1. Directly connected networks
2. Remote networks
3. Default route
```



---

## 13.1 Directly Connected Networks

A directly connected network is connected to an active router interface.

Example:

```text
G0/0: 192.168.1.1/24
G0/1: 192.168.2.1/24
```

Directly connected networks:

```text
192.168.1.0/24
192.168.2.0/24
```

Cisco command example:

```bash
Router(config)# interface gigabitEthernet 0/0
Router(config-if)# ip address 192.168.1.1 255.255.255.0
Router(config-if)# no shutdown
```

---

## 13.2 Remote Networks

A remote network is not directly connected to the router.

Routers can learn remote networks by:

```text
Static route
Dynamic routing protocol
```

---

## 13.3 Default Route

A default route is used when there is no better match in the routing table.

IPv4 default route:

```text
0.0.0.0/0
```

Cisco command example:

```bash
Router(config)# ip route 0.0.0.0 0.0.0.0 203.0.113.1
```

Meaning:

```text
For unknown destinations, send to 203.0.113.1.
```

---

# 14. Static Route

A static route is manually configured. If the network topology changes, the static route is not automatically updated. 

Example:

```bash
Router(config)# ip route 192.168.2.0 255.255.255.0 10.0.0.2
```

Meaning:

```text
To reach 192.168.2.0/24, send packets to 10.0.0.2.
```

Advantage:

```text
Simple
Admin has control
Low resource usage
```

Disadvantage:

```text
Must be manually updated
Not good for large changing networks
```

---

# 15. Dynamic Routing Protocol

A dynamic routing protocol allows routers to automatically learn remote networks from other routers. 

Examples:

```text
RIP
OSPF
EIGRP
BGP
```

Simple meaning:

```text
Routers exchange route information automatically.
```

Advantage:

```text
Can adjust when topology changes
Better for larger networks
```

Disadvantage:

```text
Uses more CPU, memory, and bandwidth
Needs protocol configuration
```

---

# 16. ICMPv4

## 16.1 What is ICMPv4?

ICMPv4 is used for control messages, error messages, and connectivity testing.

The slide explains:

```text
ICMP Echo Request
ICMP Echo Reply
Destination Unreachable
Time Exceeded
```



---

## 16.2 ICMP Echo Request and Echo Reply

Ping uses ICMP Echo messages.

Flow:

```text
PC A → ICMP Echo Request → PC B
PC A ← ICMP Echo Reply ← PC B
```

Simple meaning:

```text
Echo Request = Are you there?
Echo Reply = Yes, I am here.
```

Command:

```bash
ping 192.168.1.20
```

---

## 16.3 Ping Tests

The slide lists three ping connectivity tests:

```text
Pinging local loopback
Pinging default gateway
Pinging remote host
```



Recommended troubleshooting order:

```text
1. ping 127.0.0.1
2. ping own IP
3. ping default gateway
4. ping remote IP
5. ping domain name
```

---

## 16.4 Destination Unreachable

Destination Unreachable is used when a host or gateway receives a packet it cannot deliver. 

Possible reasons:

```text
No route
Host unreachable
Network unreachable
Service unreachable
Firewall issue
```

---

## 16.5 Time Exceeded and TTL

Time Exceeded is used when the packet cannot be forwarded because TTL becomes 0. 

TTL means:

```text
Time To Live
```

Beginner meaning:

```text
Maximum number of router hops a packet can pass.
```

Each router decreases TTL by 1.

Example:

```text
Start TTL = 3

Router 1: TTL becomes 2
Router 2: TTL becomes 1
Router 3: TTL becomes 0
Packet is dropped
ICMP Time Exceeded may be sent
```

Purpose of TTL:

```text
Prevents packets from looping forever.
```

---

# 17. Traceroute / Tracert

Traceroute shows the list of hops successfully reached along the path. 

Windows command:

```bash
tracert 8.8.8.8
```

Linux/macOS command:

```bash
traceroute 8.8.8.8
```

Example output:

```text
1     1 ms     1 ms     1 ms     192.168.1.1
2    10 ms    11 ms    10 ms     10.10.10.1
3    25 ms    24 ms    26 ms     203.0.113.1
4    35 ms    34 ms    36 ms     8.8.8.8
```

---

## 17.1 How Traceroute Works

Traceroute uses increasing TTL values.

```text
TTL = 1 finds hop 1
TTL = 2 finds hop 2
TTL = 3 finds hop 3
```

Each router that reduces TTL to 0 may send back ICMP Time Exceeded.

---

## 17.2 RTT

RTT means:

```text
Round-Trip Time
```

The slide says RTT is the time a packet takes to reach the remote host and for the response to return. 

Formula idea:

```text
RTT = time to go + time to return
```

Example:

```text
20 ms to go
20 ms to return

RTT = 40 ms
```

---

## 17.3 Asterisk `*`

The slide says `*` means a lost or unreplied packet. 

Example:

```text
3     *     *     *     Request timed out.
```

Meaning:

```text
No reply was received from that hop.
```

Important:

```text
* does not always mean the router is broken.
It may simply not reply to traceroute.
```

---

# 18. Transport Layer

## 18.1 What is the Transport Layer?

The Transport Layer establishes a temporary communication session between two applications and delivers data between them. 

Simple meaning:

```text
Transport Layer = application-to-application communication
```

Compare:

```text
Network Layer = device-to-device using IP address
Transport Layer = application-to-application using port number
```

---

## 18.2 Transport Layer Main Jobs

The slide says the Transport Layer provides:

```text
Segmentation
Reassembly
Communication stream control
Application identification
```



---

## 18.3 Segmentation

Segmentation means breaking large data into smaller pieces.

```text
Original data:

[ Large message ]

After segmentation:

[ Segment 1 ][ Segment 2 ][ Segment 3 ]
```

---

## 18.4 Reassembly

Reassembly means putting received pieces back together.

```text
[ Segment 1 ][ Segment 2 ][ Segment 3 ]
        ↓
[ Original data ]
```

---

## 18.5 Communication Streams

A communication stream is one flow of data between applications.

Example:

```text
Browser ↔ Web server
Email app ↔ Mail server
Game ↔ Game server
```

The Transport Layer keeps these conversations separate.

---

# 19. Port Numbers

A port number identifies a specific application, service, or conversation. 

Important comparison:

```text
IP address = which device?
Port number = which application/service?
```

---

## 19.1 Destination Port

The destination port tells the server what service is requested.

The slide gives this example:

```text
Port 80 = HTTP / web service
```



Example:

```text
Client → Server port 80
```

Meaning:

```text
Client wants HTTP web service.
```

---

## 19.2 Source Port

The source port is randomly generated by the sending device to identify a conversation. 

Example:

```text
Browser tab 1:
Source port 50100 → Destination port 443

Browser tab 2:
Source port 50101 → Destination port 443
```

This allows multiple conversations at the same time.

---

## 19.3 Segment and Packet Structure

Port numbers are inside the TCP or UDP header.

IP addresses are inside the IP header.

```text
[ IP Header ][ TCP/UDP Header ][ Data ]
     ↓              ↓
IP address       Port number
```

---

# 20. TCP

## 20.1 What is TCP?

TCP stands for:

```text
Transmission Control Protocol
```

TCP is a reliable Transport Layer protocol.

The slide says TCP provides reliability by:

```text
Tracking transmitted data segments
Acknowledging received data
Retransmitting unacknowledged data
```



---

## 20.2 TCP is Connection-Oriented

TCP establishes a session before sending data. 

Simple meaning:

```text
TCP checks that both sides are ready first.
```

---

## 20.3 TCP Three-Way Handshake

TCP uses a three-way handshake to establish a connection. 

Steps:

```text
1. SYN
2. SYN + ACK
3. ACK
```

Diagram:

```text
Client                                      Server

SYN --------------------------------------->
"I want to connect."

<----------------------------------- SYN + ACK
"I received your request, and I agree."

ACK --------------------------------------->
"I received your agreement."

Connection established.
```

Memory trick:

```text
SYN = start
ACK = acknowledge
```

---

## 20.4 Reliable Delivery

TCP can retransmit lost or corrupted data. 

Example:

```text
Segment 1 arrives
Segment 2 lost
Segment 3 arrives

TCP retransmits Segment 2
```

---

## 20.5 Same-Order Delivery

TCP numbers and sequences segments so they can be reassembled in the correct order. 

Example:

```text
Sent order:
S1, S2, S3

Arrived order:
S2, S1, S3

TCP reorders:
S1, S2, S3
```

---

## 20.6 Flow Control

TCP flow control prevents the sender from sending too much data too quickly.

The slide says when resources are overtaxed, TCP can request that the sender reduce the rate of data flow. 

Simple meaning:

```text
Receiver: Slow down. I cannot handle data that fast.
```

---

## 20.7 TCP Overhead

The slide says TCP has 20 bytes of header overhead, while UDP has 8 bytes. 

```text
TCP header = 20 bytes
UDP header = 8 bytes
```

Difference:

```text
20 - 8 = 12 bytes
```

TCP has more overhead because it provides:

```text
Reliability
Acknowledgement
Retransmission
Sequencing
Flow control
Connection setup
```

---

# 21. TCP Connection Closing

To close a TCP connection, the **FIN** flag is used. 

```text
FIN = Finish
ACK = Acknowledgement
```

One-way TCP closing:

```text
Device A → FIN → Device B
Device A ← ACK ← Device B
```

Full common closing idea:

```text
FIN
ACK
FIN
ACK
```

Memory:

```text
SYN = start TCP
FIN = finish TCP
```

---

# 22. TCP Receiving Buffer

TCP segments may arrive out of order.

The receiving TCP process places data into a receiving buffer, arranges segments in sequence order, and passes them to the application layer after reassembly. 

Example:

```text
Arrived:
S2, S1, S3

Buffer arranges:
S1, S2, S3

Then data goes to application.
```

---

# 23. TCP ACK and Retransmission

## 23.1 ACK

ACK means:

```text
Acknowledgement
```

It tells the sender that data has been received.

---

## 23.2 Retransmission

If TCP does not receive an acknowledgement after a certain time, it retransmits data from the last ACK point. 

Simple meaning:

```text
No ACK received → send the missing data again
```

---

# 24. TCP Window Size

Window size is the amount of data a source can transmit before an acknowledgement must be received. 

Example:

```text
Window size = 5 segments
Each segment = 1000 bytes

5 × 1000 = 5000 bytes
```

So the sender can send:

```text
5000 bytes before needing ACK.
```

Window size helps with:

```text
Flow control
Lost data management
Efficient transmission
```

---

# 25. TCP Application Examples

The slide lists these TCP examples:

```text
HTTP
FTP
SMTP
Telnet
```



## HTTP

```text
Hypertext Transfer Protocol
Used for web communication
```

## FTP

```text
File Transfer Protocol
Used for file transfer
```

## SMTP

```text
Simple Mail Transfer Protocol
Used for sending email
```

## Telnet

```text
Used for remote command-line access
Not secure because it sends data in plain text
```

---

# 26. UDP

## 26.1 What is UDP?

UDP stands for:

```text
User Datagram Protocol
```

UDP provides basic delivery with very little overhead and data checking. 

Simple meaning:

```text
UDP sends data quickly with less checking.
```

---

## 26.2 UDP is Connectionless

UDP does not establish a connection before sending data. 

TCP:

```text
SYN → SYN-ACK → ACK → Data
```

UDP:

```text
Data
```

No handshake first.

---

## 26.3 UDP Has Unreliable Delivery

UDP does not guarantee delivery. 

UDP does not provide built-in:

```text
Acknowledgement
Retransmission
Delivery guarantee
```

---

## 26.4 UDP Has No Ordered Data Reconstruction

UDP does not guarantee original order reconstruction. 

Example:

```text
Sent:
D1, D2, D3

Arrived:
D2, D1, D3

UDP does not automatically reorder them.
```

---

## 26.5 UDP Has No Flow Control

UDP has no mechanism to control how much data is transmitted by the source. 

Simple meaning:

```text
UDP does not tell sender to slow down.
```

---

## 26.6 UDP Low Overhead

UDP has low overhead because it provides fewer features than TCP.

```text
UDP header = 8 bytes
TCP header = 20 bytes
```

---

## 26.7 UDP Datagrams

The slide says pieces of UDP communication are called **datagrams**. 

```text
TCP data unit = segment
UDP data unit = datagram
```

UDP datagrams are sent as best effort.

---

# 27. UDP Application Examples

The slide lists these UDP examples:

```text
DNS
Video streaming
VoIP
TFTP
SNMP
```



---

## 27.1 DNS

DNS stands for:

```text
Domain Name System
```

Purpose:

```text
Converts domain names into IP addresses.
```

Example:

```text
google.com → IP address
```

DNS commonly uses UDP because queries are small and fast.

---

## 27.2 Video Streaming

Video streaming may use UDP because low delay is important.

If one small part is lost, the stream can continue.

---

## 27.3 VoIP

VoIP stands for:

```text
Voice over IP
```

VoIP uses UDP because voice communication needs low delay.

Important idea:

```text
Late voice data is often useless.
```

---

## 27.4 TFTP

TFTP stands for:

```text
Trivial File Transfer Protocol
```

Memory:

```text
FTP uses TCP
TFTP uses UDP
```

---

## 27.5 SNMP

SNMP stands for:

```text
Simple Network Management Protocol
```

It is used to monitor and manage network devices such as routers and switches.

---

# 28. Final TCP vs UDP Comparison

| Feature          | TCP                           | UDP                                    |
| ---------------- | ----------------------------- | -------------------------------------- |
| Full name        | Transmission Control Protocol | User Datagram Protocol                 |
| Layer            | Transport Layer               | Transport Layer                        |
| Data unit        | Segment                       | Datagram                               |
| Connection setup | Yes                           | No                                     |
| Connection type  | Connection-oriented           | Connectionless                         |
| Reliability      | Reliable                      | Unreliable / best effort               |
| Acknowledgement  | Yes                           | No built-in ACK                        |
| Retransmission   | Yes                           | No built-in retransmission             |
| Ordered delivery | Yes                           | No                                     |
| Flow control     | Yes                           | No                                     |
| Header overhead  | 20 bytes                      | 8 bytes                                |
| Speed            | More overhead                 | Lower overhead                         |
| Best for         | Complete and correct data     | Low-delay real-time data               |
| Examples         | HTTP, FTP, SMTP, Telnet       | DNS, video streaming, VoIP, TFTP, SNMP |

---

# 29. When to Use TCP or UDP

Use **TCP** when:

```text
Data must be complete
Data must be correct
Data must be in order
Reliability is more important than delay
```

Examples:

```text
Web browsing
Email
File transfer
Online form submission
Remote login
```

Use **UDP** when:

```text
Low delay is important
Small data loss is acceptable
Real-time communication is needed
```

Examples:

```text
Voice call
Video call
Live streaming
DNS
Online games
SNMP
```

---

# 30. Chapter 4 Important Exam Memory

```text
Network Layer = sends packets across networks using IP addresses.
```

```text
Transport Layer = delivers data between applications using port numbers.
```

```text
Network Layer PDU = packet.
```

```text
Transport Layer TCP PDU = segment.
```

```text
Transport Layer UDP PDU = datagram.
```

```text
IP has 3 characteristics:
1. Connectionless
2. Best effort / unreliable
3. Media independent
```

```text
IPv4 problems:
1. Address depletion
2. Lack of end-to-end connectivity
3. Increased network complexity
```

```text
IPv6 improvements:
1. Increased address space
2. Improved packet handling
3. Eliminates need for NAT
4. Integrated security
```

```text
If destination is local:
Send directly inside LAN.
```

```text
If destination is remote:
Send to default gateway.
```

```text
Routing table has:
1. Directly connected networks
2. Remote networks
3. Default route
```

```text
Ping uses:
ICMP Echo Request
ICMP Echo Reply
```

```text
Traceroute shows hops along the path.
```

```text
TTL decreases by 1 at each router.
```

```text
RTT = time for packet to go and reply to return.
```

```text
* in traceroute = lost or unreplied packet.
```

```text
TCP = reliable, connection-oriented.
```

```text
TCP handshake:
SYN
SYN-ACK
ACK
```

```text
TCP closing:
FIN
ACK
```

```text
UDP = connectionless, unreliable, low overhead.
```

```text
TCP header = 20 bytes.
UDP header = 8 bytes.
```

---

# 31. Viva / Exam-Style Questions

## Question 1

What is the main function of the Network Layer?

**Answer:**
The Network Layer allows devices to exchange data across networks using IP addresses and routing.

---

## Question 2

What are the four basic processes of the Network Layer?

**Answer:**

```text
Addressing
Encapsulation
Routing
De-encapsulation
```

---

## Question 3

What is the PDU of the Network Layer?

**Answer:**

```text
Packet
```

---

## Question 4

What are the three characteristics of IP?

**Answer:**

```text
Connectionless
Best effort / unreliable
Media independent
```

---

## Question 5

What are the three major IPv4 problems?

**Answer:**

```text
IP address depletion
Lack of end-to-end connectivity
Increased network complexity
```

---

## Question 6

How many bits are in IPv4 and IPv6?

**Answer:**

```text
IPv4 = 32 bits
IPv6 = 128 bits
```

---

## Question 7

What is the purpose of the default gateway?

**Answer:**
The default gateway routes traffic from the local network to remote networks.

---

## Question 8

What is a static route?

**Answer:**
A static route is a manually configured route.

---

## Question 9

What is a dynamic routing protocol?

**Answer:**
A dynamic routing protocol allows routers to automatically learn routes from other routers.

---

## Question 10

What does ping use?

**Answer:**

```text
ICMP Echo Request
ICMP Echo Reply
```

---

## Question 11

What does TTL do?

**Answer:**
TTL limits the number of router hops a packet can pass. It decreases by 1 at each router and prevents packets from looping forever.

---

## Question 12

What does traceroute show?

**Answer:**
Traceroute shows the routers or hops along the path to a destination.

---

## Question 13

What is RTT?

**Answer:**
RTT is Round-Trip Time, the time for a packet to reach the destination and for the response to return.

---

## Question 14

What does `*` mean in traceroute?

**Answer:**
It means a lost or unreplied packet.

---

## Question 15

What is the main job of the Transport Layer?

**Answer:**
The Transport Layer delivers data between applications and manages communication streams.

---

## Question 16

What is a port number?

**Answer:**
A port number identifies a specific application, service, or conversation.

---

## Question 17

What is the difference between IP address and port number?

**Answer:**

```text
IP address = identifies device
Port number = identifies application/service
```

---

## Question 18

What is TCP?

**Answer:**
TCP is a reliable, connection-oriented Transport Layer protocol.

---

## Question 19

What are the three TCP handshake steps?

**Answer:**

```text
SYN
SYN-ACK
ACK
```

---

## Question 20

What does FIN mean?

**Answer:**
FIN means Finish. It is used to close a TCP connection.

---

## Question 21

What is TCP window size?

**Answer:**
Window size is the amount of data a sender can send before receiving an acknowledgement.

---

## Question 22

What is UDP?

**Answer:**
UDP is a connectionless Transport Layer protocol that provides low-overhead, best-effort delivery.

---

## Question 23

Does UDP guarantee delivery?

**Answer:**
No. UDP does not guarantee delivery.

---

## Question 24

What are UDP data pieces called?

**Answer:**

```text
Datagrams
```

---

## Question 25

Give examples of TCP applications.

**Answer:**

```text
HTTP
FTP
SMTP
Telnet
```

---

## Question 26

Give examples of UDP applications.

**Answer:**

```text
DNS
Video streaming
VoIP
TFTP
SNMP
```

---

# 32. Final Mini Checkpoint

Try to answer without looking:

```text
1. Network Layer uses what address?
2. Transport Layer uses what number?
3. What device performs routing?
4. What is the default gateway used for?
5. What command tests connectivity?
6. What command shows hops?
7. TCP is reliable or unreliable?
8. UDP is reliable or unreliable?
9. TCP uses what three-step handshake?
10. UDP data unit is called what?
```

Answers:

```text
1. IP address
2. Port number
3. Router
4. To reach remote networks
5. ping
6. tracert / traceroute
7. Reliable
8. Unreliable / best effort
9. SYN, SYN-ACK, ACK
10. Datagram
```

---
