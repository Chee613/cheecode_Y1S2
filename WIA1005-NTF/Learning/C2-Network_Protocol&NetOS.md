# Chapter 2: Network Protocols and Network Operating Systems

# 2. Rules of Communication

## 2.1 What is Communication?

Communication means sending a message from one side to another side.

In networking:

```text
Source device  ----------------->  Destination device
```

Example:

```text
Laptop  ----------------->  Web Server
        request webpage
```

Then the server replies:

```text
Laptop  <-----------------  Web Server
        webpage data
```

A communication needs:

```text
Sender
Receiver
Message
Channel
Rules
```

---

## 2.2 What is a Protocol?

A protocol is a set of rules for communication.

Simple meaning:

```text
Protocol = communication rule
```

Human example:

```text
Speak the same language.
Talk at suitable speed.
Wait for reply.
```

Network example:

```text
Use correct address.
Use correct format.
Use correct timing.
Use correct delivery method.
```

Without protocols, devices cannot understand each other.

---

## 2.3 Protocol Requirements

Protocols require:

1. Identified sender and receiver
2. Common language and grammar
3. Speed and timing of delivery
4. Confirmation or acknowledgment requirements

---

## 2.4 Identified Sender and Receiver

Every communication needs to know:

```text
Who is sending?
Who is receiving?
```

In networking:

```text
Sender = source device
Receiver = destination device
```

Example:

```text
PC  ----------------->  Printer
Sender                Receiver
```

Common mistake:

```text
Wrong idea:
Data can just go to the Internet.

Correct idea:
Data must have a source and destination.
```

---

## 2.5 Common Language and Grammar

Devices must use the same communication rules.

Example:

```text
Browser and web server both understand HTTP/HTTPS.
```

If devices do not use the same protocol, communication fails.

Analogy:

```text
Cable = road
Protocol = traffic rules
```

A road alone is not enough.
Traffic rules are needed.

---

## 2.6 Message Timing

Message timing controls how communication happens over time.

It includes:

1. Flow control
2. Response timeout
3. Access method

---

## 2.7 Flow Control

Flow control defines:

```text
How much data can be sent
How fast data can be sent
```

Example:

```text
Fast server  ----------------->  Slow PC
```

If the server sends too fast, the PC may not process the data properly.

Why we need it:

```text
Prevent data loss
Prevent receiver overload
Reduce congestion
Improve communication reliability
```

---

## 2.8 Response Timeout

Response timeout means a device waits only for a certain time for a reply.

Example:

```text
PC sends request.
PC waits.
No reply.
Timeout happens.
```

Possible result:

```text
Request timed out.
```

Reasons for timeout:

```text
Server down
Wrong IP address
Firewall blocking
Network cable problem
Destination too slow to reply
```

---

## 2.9 Access Method

Access method determines when a device can send data.

Classroom example:

```text
If everyone talks at the same time, nobody understands.
```

Network example:

```text
If all devices send at the same time, data may collide.
```

Access method helps organize network communication.

---

## 2.10 Message Encoding and Decoding

Encoding means converting information into a suitable form for transmission.

Decoding means converting it back into understandable form.

```text
Encoding = change message into sendable form
Decoding = change it back into understandable form
```

Example:

```text
Text/image/video
      ↓
Binary data
      ↓
Electrical/light/wireless signal
```

Different media use different signal types:

```text
Copper cable      = electrical signal
Fiber optic cable = light signal
Wireless          = radio signal
```

---

## 2.11 Message Formatting

Message formatting means the message must follow a proper structure.

Real-life letter format:

```text
Receiver address
Sender address
Message body
Stamp
```

Network message format may include:

```text
Source address
Destination address
Data
Error checking information
```

Simple format:

```text
[Source][Destination][Data]
```

---

## 2.12 Message Size

Large messages are usually broken into smaller parts.

Example:

```text
Large video file
      ↓
Part 1
Part 2
Part 3
Part 4
```

Why?

```text
Large data can delay other users.
Small pieces are easier to manage.
If one piece is lost, only that piece needs to be resent.
```

---

## 2.13 Message Delivery Options

There are three common delivery types:

```text
Unicast
Multicast
Broadcast
```

### Unicast

One sender sends to one receiver.

```text
PC1  ----------------->  PC2
```

Example:

```text
You send a private message to one friend.
```

### Multicast

One sender sends to a selected group.

```text
Server
  ├──> PC1
  ├──> PC2
  └──> PC3
```

Example:

```text
Teacher sends message only to Group A.
```

### Broadcast

One sender sends to everyone in the local network.

```text
Router
  ├──> PC1
  ├──> PC2
  ├──> PC3
  └──> PC4
```

Example:

```text
Teacher announces something to the whole class.
```

---

# 3. Network Protocols

## 3.1 What is a Network Protocol?

A network protocol is a common format and set of rules for exchanging messages between devices.

Simple meaning:

```text
Network protocol = rules used by network devices to communicate
```

Examples:

```text
HTTP
HTTPS
TCP
IP
DNS
Ethernet
Wi-Fi
```

---

## 3.2 One Communication Uses Many Protocols

When you open a website, many protocols may work together.

Example:

```text
DNS   -> finds the website IP address
HTTP  -> requests the webpage
TCP   -> manages reliable delivery
IP    -> handles addressing and routing
Wi-Fi/Ethernet -> sends data through local network
```

Simple flow:

```text
User wants website
      ↓
DNS finds IP address
      ↓
HTTP requests webpage
      ↓
TCP manages delivery
      ↓
IP handles addressing
      ↓
Ethernet/Wi-Fi sends data
```

---

## 3.3 Protocol Suite

A protocol suite is a group of related protocols that work together.

Simple meaning:

```text
Protocol suite = team of protocols
```

Example:

```text
TCP/IP protocol suite
```

Analogy:

```text
Football team:
Goalkeeper
Defender
Midfielder
Striker

Protocol suite:
DNS
HTTP
TCP
IP
Ethernet
```

Each has a different job, but all work together.

---

## 3.4 TCP/IP Protocol Suite

TCP/IP is the main protocol suite used for Internet communication.

TCP/IP stands for:

```text
TCP = Transmission Control Protocol
IP  = Internet Protocol
```

Beginner meaning:

```text
TCP = helps reliable delivery
IP  = helps data find destination
```

Analogy:

```text
IP  = address on parcel
TCP = checks parcel arrives properly
```

Important:

```text
TCP/IP does not mean only TCP and IP.
It is a suite containing many protocols.
```

---

## 3.5 Layered Model

A layered model organizes network communication into layers.

Why we use layers:

```text
Easier to understand
Easier to troubleshoot
Easier to design
Easier to standardize
```

TCP/IP model:

```text
Application Layer
Transport Layer
Internet Layer
Network Access Layer
```

Sending data:

```text
Application
    ↓
Transport
    ↓
Internet
    ↓
Network Access
```

Receiving data:

```text
Network Access
    ↓
Internet
    ↓
Transport
    ↓
Application
```

---

## 3.6 TCP/IP Layers

### Application Layer

Closest to the user.

Examples:

```text
Web browser
Email app
Chat app
File transfer app
```

Protocols:

```text
HTTP
HTTPS
DNS
FTP
SMTP
```

Job:

```text
Provides network services to applications.
```

---

### Transport Layer

Manages delivery between applications.

Protocols:

```text
TCP
UDP
```

Job:

```text
Makes sure data goes to the correct application.
```

Example:

```text
Browser data goes to browser.
Game data goes to game.
Email data goes to email app.
```

---

### Internet Layer

Handles IP addressing and routing.

Protocol:

```text
IP
```

Job:

```text
Moves packets from original source to final destination.
```

Example:

```text
Your PC -> Router -> ISP -> Internet -> Web Server
```

---

### Network Access Layer

Handles local network delivery and physical transmission.

Related to:

```text
Ethernet
Wi-Fi
MAC address
Network cable
Wireless signal
```

Job:

```text
Sends data to the next local device.
```

---

## 3.7 Standards Organizations

Standards organizations create common open standards.

Why we need them:

```text
So devices from different vendors can work together.
```

Example:

```text
Dell laptop
Cisco switch
TP-Link router
Apple phone
Samsung phone
```

They can communicate because they follow common standards.

Examples of standards organizations:

```text
IEEE
IETF
ISO
ICANN
IANA
TIA
EIA
ITU
```

Beginner examples:

```text
IEEE 802.3  = Ethernet
IEEE 802.11 = Wi-Fi
```

---

# 4. Data Encapsulation

## 4.1 Why Data Encapsulation is Needed

When data is sent, the network needs extra information.

The network needs to know:

```text
Who sent the data?
Who should receive it?
Which application should get it?
How should it travel?
How can it be reassembled?
```

The process of preparing data by adding protocol information is called encapsulation.

---

## 4.2 Segmentation

Segmentation means dividing large data into smaller pieces.

```text
Segmentation = split big data into smaller parts
```

Example:

```text
Large file
   ↓
Segment 1
Segment 2
Segment 3
Segment 4
```

Why segmentation is needed:

```text
Large data can block the network.
Small pieces are easier to manage.
Other users can share the network.
Lost pieces can be resent individually.
```

---

## 4.3 Multiplexing

Multiplexing means interleaving pieces from different communications on the same network.

```text
Multiplexing = many conversations share one network
```

Example:

```text
User A: YouTube
User B: WhatsApp
User C: Google

Network sends:
A1 -> B1 -> C1 -> A2 -> B2 -> C2
```

Difference:

```text
Segmentation = split one message into small pieces
Multiplexing = mix pieces from many messages
```

---

## 4.4 Encapsulation

Encapsulation means adding protocol information as data moves down the layers.

```text
Encapsulation = wrapping data with extra information
```

Example:

```text
Application data
      ↓
Transport adds header
      ↓
Internet adds IP header
      ↓
Network Access adds frame header/trailer
      ↓
Bits are sent
```

Simple diagram:

```text
Application Layer:
[Data]

Transport Layer:
[Transport Header][Data]

Internet Layer:
[IP Header][Transport Header][Data]

Network Access Layer:
[Frame Header][IP Header][Transport Header][Data][Frame Trailer]

Physical:
010101010101
```

---

## 4.5 Header

A header is extra information added in front of data.

```text
[Header][Data]
```

Header may contain:

```text
Source address
Destination address
Sequence number
Protocol information
Control information
```

Analogy:

```text
Parcel content = data
Address label  = header
```

---

## 4.6 Trailer

A trailer is extra information added at the end of data.

```text
[Header][Data][Trailer]
```

The trailer may help with error checking.

---

## 4.7 Protocol Data Unit, PDU

PDU means Protocol Data Unit.

It is the name of data at each layer.

| Layer                | PDU Name |
| -------------------- | -------- |
| Application Layer    | Data     |
| Transport Layer      | Segment  |
| Internet Layer       | Packet   |
| Network Access Layer | Frame    |
| Physical Layer       | Bits     |

Important memory:

```text
Data -> Segment -> Packet -> Frame -> Bits
```

---

## 4.8 Full Encapsulation Example

Example: PC sends webpage request.

```text
Application Layer:
[GET webpage]

Transport Layer:
[TCP Header][GET webpage]

Internet Layer:
[IP Header][TCP Header][GET webpage]

Network Access Layer:
[Ethernet Header][IP Header][TCP Header][GET webpage][Ethernet Trailer]

Physical Layer:
0101010101010101
```

Sending flow:

```text
Data
 ↓
Segment
 ↓
Packet
 ↓
Frame
 ↓
Bits
```

---

## 4.9 De-encapsulation

De-encapsulation is the reverse of encapsulation.

It happens at the receiver.

```text
De-encapsulation = unpacking received data
```

Receiving flow:

```text
Bits
 ↓
Frame
 ↓
Packet
 ↓
Segment
 ↓
Data
```

Comparison:

| Process          | Happens at | Direction   | Meaning                     |
| ---------------- | ---------- | ----------- | --------------------------- |
| Encapsulation    | Sender     | Down layers | Add protocol information    |
| De-encapsulation | Receiver   | Up layers   | Remove protocol information |

---

# 5. Data Access

## 5.1 What is Data Access?

Data access means how data reaches the correct device.

To send data, a device must know:

```text
Where is the final destination?
What is the next device?
Is the destination local or remote?
```

Two important addresses:

```text
IP address
MAC address
```

---

## 5.2 IP Address

An IP address is a logical address used at the network layer.

Example:

```text
192.168.1.10
8.8.8.8
```

Job:

```text
Deliver packet from original source to final destination.
```

Example:

```text
PC -----------------> Google Server
192.168.1.10          142.250.x.x
```

Simple meaning:

```text
IP address = final destination address
```

---

## 5.3 MAC Address

A MAC address is a physical hardware address used at the data link layer.

Example:

```text
00-1A-2B-3C-4D-5E
```

Job:

```text
Deliver frame from one NIC to another NIC on the same network.
```

NIC means:

```text
Network Interface Card
```

Examples of NIC:

```text
Wi-Fi adapter
Ethernet port
```

Simple meaning:

```text
MAC address = local delivery address
```

---

## 5.4 IP vs MAC Address

| Address     | Layer           | Used For                              |
| ----------- | --------------- | ------------------------------------- |
| IP address  | Network layer   | Source to final destination           |
| MAC address | Data link layer | One local hop / same network delivery |

Memory trick:

```text
IP  = where the packet finally goes
MAC = who receives the frame next
```

---

## 5.5 Same Network Communication

If two devices are in the same network, the sender sends directly to the receiver MAC address.

Example:

```text
PC1: 192.168.1.10
PC2: 192.168.1.20
```

Both are in the same network.

Diagram:

```text
PC1 -------- Switch -------- PC2
IP: 192.168.1.10            IP: 192.168.1.20
MAC A                       MAC B
```

Frame:

```text
Source MAC      = PC1 MAC
Destination MAC = PC2 MAC
```

IP packet:

```text
Source IP      = PC1 IP
Destination IP = PC2 IP
```

---

## 5.6 Different Network Communication

If the destination is in another network, the sender sends the frame to the default gateway.

Example:

```text
PC1: 192.168.1.10
Server: 8.8.8.8
```

Diagram:

```text
PC1 ---- Switch ---- Router ---- Internet ---- Server
```

IP packet:

```text
Source IP      = PC1 IP
Destination IP = Server IP
```

Ethernet frame on local LAN:

```text
Source MAC      = PC1 MAC
Destination MAC = Router MAC
```

Important:

```text
Destination IP  = final receiver
Destination MAC = next local device
```

---

## 5.7 Default Gateway

A default gateway is the device used to reach other networks.

Usually, it is a router.

Example:

```text
PC IP:            192.168.1.10
Default gateway:  192.168.1.1
```

Simple analogy:

```text
Default gateway = exit door from local network
```

Without default gateway:

```text
PC may reach local devices.
PC may fail to reach Internet or remote networks.
```

---

## 5.8 Useful Windows Commands

Check IP configuration:

```bash
ipconfig
```

Check detailed IP and MAC information:

```bash
ipconfig /all
```

View IP-to-MAC mapping:

```bash
arp -a
```

Test connectivity:

```bash
ping 192.168.1.1
```

Trace route:

```bash
tracert google.com
```

---

# 6. Network Operating Systems

## 6.1 What is a Network Operating System?

A network operating system is the OS used by network devices.

Examples of network devices:

```text
Router
Switch
Firewall
Wireless access point
```

Comparison:

| Device       | Operating System        |
| ------------ | ----------------------- |
| Laptop       | Windows / macOS / Linux |
| Phone        | Android / iOS           |
| Cisco router | Cisco IOS               |
| Cisco switch | Cisco IOS               |

---

## 6.2 Cisco IOS

Cisco IOS stands for:

```text
Cisco Internetwork Operating System
```

It is used to manage Cisco network devices.

With Cisco IOS, administrators can:

```text
Set hostname
Set passwords
Configure IP address
Enable interfaces
Configure routing
Save configuration
Troubleshoot network problems
```

Important:

```text
Cisco IOS is not Apple iOS.
```

---

## 6.3 Flash and RAM

Cisco IOS is stored in flash memory.

When the device powers on, IOS is copied into RAM and runs from RAM.

Boot process:

```text
Device powers on
      ↓
IOS is found in flash
      ↓
IOS is copied into RAM
      ↓
IOS runs from RAM
      ↓
Device becomes usable
```

Comparison:

| Memory | Keeps data after power off? | Main Use                      |
| ------ | --------------------------- | ----------------------------- |
| Flash  | Yes                         | Stores IOS file               |
| RAM    | No                          | Runs IOS and active processes |

---

## 6.4 Kernel and Shell

Kernel:

```text
Core part of OS that interacts directly with hardware.
```

Shell:

```text
Interface that allows user to interact with OS.
```

Comparison:

| Term   | Meaning                    |
| ------ | -------------------------- |
| Kernel | Talks directly to hardware |
| Shell  | Lets user enter commands   |

Simple flow:

```text
User types command
      ↓
Shell receives command
      ↓
OS processes command
      ↓
Kernel interacts with hardware
```

---

## 6.5 CLI and GUI

CLI means:

```text
Command-Line Interface
```

GUI means:

```text
Graphical User Interface
```

Comparison:

| Interface | How User Interacts  | Example                |
| --------- | ------------------- | ---------------------- |
| CLI       | Type commands       | Cisco IOS command line |
| GUI       | Click buttons/icons | Router web dashboard   |

Networking labs commonly use CLI.

---

## 6.6 Ways to Access CLI

Main methods:

```text
Console
AUX
Telnet
SSH
```

---

### Console

Console access uses a direct physical console cable.

```text
PC ---- console cable ---- Router/Switch console port
```

Important:

```text
Console access does not require IP address.
```

Used for:

```text
Initial configuration
Troubleshooting when network is down
Direct device maintenance
```

Console is out-of-band access.

---

### AUX

AUX is an older method using modem and telephone dial-up connection.

```text
Admin PC ---- modem/telephone line ---- Router AUX port
```

It is also out-of-band.

Less common in beginner labs.

---

### Telnet

Telnet provides remote CLI access over a network.

Example:

```bash
telnet 192.168.1.1
```

Requirements:

```text
Device has IP address
Network connectivity works
VTY password configured
Telnet allowed
```

Problem:

```text
Telnet is not secure because it does not encrypt data.
```

---

### SSH

SSH stands for:

```text
Secure Shell
```

SSH provides secure remote CLI access.

Example:

```bash
ssh admin@192.168.1.1
```

SSH is better than Telnet because:

```text
SSH uses encryption.
Telnet does not.
```

Comparison:

| Feature       | Telnet | SSH      |
| ------------- | ------ | -------- |
| Remote access | Yes    | Yes      |
| Uses network  | Yes    | Yes      |
| Encryption    | No     | Yes      |
| Security      | Weak   | Stronger |

---

## 6.7 Terminal Emulation Programs

Terminal emulation programs let a PC connect to router/switch CLI.

Examples:

```text
PuTTY
Tera Term
SecureCRT
HyperTerminal
OS X Terminal
```

For console cable, common serial settings:

```text
Speed/Baud rate: 9600
Data bits: 8
Parity: None
Stop bits: 1
Flow control: None
```

If PuTTY or Tera Term shows blank screen:

```text
Press Enter.
Check cable.
Check COM port.
Check serial settings.
```

---

# 7. Cisco CLI Modes

Cisco CLI uses hierarchical modes.

Major modes:

```text
User EXEC mode
Privileged EXEC mode
Global configuration mode
Specific configuration modes
```

---

## 7.1 User EXEC Mode

Prompt:

```text
Switch>
Router>
```

Symbol:

```text
>
```

Purpose:

```text
Basic checking only.
Limited commands.
```

Example:

```bash
show version
ping 192.168.1.1
```

To enter privileged EXEC mode:

```bash
enable
```

---

## 7.2 Privileged EXEC Mode

Prompt:

```text
Switch#
Router#
```

Symbol:

```text
#
```

Purpose:

```text
More powerful checking and management commands.
```

Examples:

```bash
show running-config
show startup-config
copy running-config startup-config
```

To enter global configuration mode:

```bash
configure terminal
```

---

## 7.3 Global Configuration Mode

Prompt:

```text
Switch(config)#
Router(config)#
```

Purpose:

```text
Configure settings that affect the whole device.
```

Examples:

```bash
hostname SW1
enable secret class
banner motd # Authorized Access Only #
```

---

## 7.4 Interface Configuration Mode

Prompt:

```text
Switch(config-if)#
Router(config-if)#
```

Purpose:

```text
Configure a specific interface.
```

Example:

```bash
interface fastEthernet 0/1
description Link to PC1
no shutdown
```

---

## 7.5 Line Configuration Mode

Prompt:

```text
Switch(config-line)#
Router(config-line)#
```

Purpose:

```text
Configure console or VTY access lines.
```

Examples:

```bash
line console 0
line vty 0 15
```

---

## 7.6 CLI Mode Flow

```text
Switch>
  ↓ enable
Switch#
  ↓ configure terminal
Switch(config)#
  ↓ interface fa0/1
Switch(config-if)#
```

Exit one level:

```bash
exit
```

Return directly to privileged EXEC mode:

```bash
end
```

or:

```text
Ctrl + Z
```

---

# 8. Basic Cisco Commands

## 8.1 Set Hostname

Hostname identifies the device.

Command:

```bash
Switch# configure terminal
Switch(config)# hostname Sw-Floor-1
Sw-Floor-1(config)#
```

Purpose:

```text
Give the device a clear name.
```

Good examples:

```text
Sw-Floor-1
Router-HQ
Sw-Lab-A
```

Bad examples:

```text
abc
test
Switch1
```

---

## 8.2 Password Types

Password types:

```text
Enable password
Enable secret
Console password
VTY password
```

---

## 8.3 Enable Password

Protects privileged EXEC mode.

Command:

```bash
Switch(config)# enable password cisco
```

Weakness:

```text
Less secure than enable secret.
```

---

## 8.4 Enable Secret

Encrypted password for privileged EXEC mode.

Command:

```bash
Switch(config)# enable secret class
```

Important:

```text
enable secret is stronger than enable password.
```

If both are configured, Cisco usually uses enable secret.

---

## 8.5 Console Password

Protects direct console access.

Commands:

```bash
Switch(config)# line console 0
Switch(config-line)# password cisco
Switch(config-line)# login
Switch(config-line)# exit
```

Important:

```text
password + login
```

If you forget `login`, the device may not ask for the password.

---

## 8.6 VTY Password

Protects remote access such as Telnet.

Commands:

```bash
Switch(config)# line vty 0 15
Switch(config-line)# password cisco
Switch(config-line)# login
Switch(config-line)# exit
```

VTY means:

```text
Virtual Terminal
```

Console vs VTY:

```text
Console = direct physical access
VTY     = remote access
```

---

## 8.7 Encrypt Plain Text Passwords

Command:

```bash
Switch(config)# service password-encryption
```

Purpose:

```text
Encrypt plain text passwords in configuration.
```

Important:

```text
It does not change the password users type.
It only changes how password appears in the configuration.
```

---

## 8.8 Banner MOTD

MOTD means:

```text
Message Of The Day
```

Command:

```bash
Switch(config)# banner motd # This is a secure system. Authorized Access ONLY!!! #
```

The `#` symbol is a delimiter.

Format:

```text
banner motd delimiter message delimiter
```

Example:

```bash
banner motd # Authorized Access Only #
```

Important:

```text
Delimiter is not displayed as part of the message.
Do not use the delimiter character inside the message.
```

---

## 8.9 Show Running Configuration

Command:

```bash
Switch# show running-config
```

Purpose:

```text
Shows the current active configuration.
```

Important:

```text
running-config is stored in RAM.
RAM is temporary.
```

This command does not save the configuration.
It only displays it.

---

## 8.10 Save Configuration

Command:

```bash
Switch# copy running-config startup-config
```

Purpose:

```text
Save active configuration to NVRAM.
```

Comparison:

| Configuration  | Stored In | Meaning                                 |
| -------------- | --------- | --------------------------------------- |
| running-config | RAM       | Current active configuration            |
| startup-config | NVRAM     | Saved configuration loaded after reboot |

Memory trick:

```text
running-config = what is running now
startup-config = what loads at startup
```

Shorter versions sometimes used:

```bash
write memory
wr
```

Formal command:

```bash
copy running-config startup-config
```

---

## 8.11 Enable and Disable

Enter privileged EXEC mode:

```bash
enable
```

Return to user EXEC mode:

```bash
disable
```

Example:

```bash
Switch> enable
Switch#
Switch# disable
Switch>
```

Important:

```text
disable does not shut down an interface.
It only lowers CLI privilege mode.
```

---

## 8.12 Configure Switch Virtual Interface, SVI

SVI means:

```text
Switch Virtual Interface
```

A Layer 2 switch uses SVI for management IP.

Command example:

```bash
Switch(config)# interface vlan 1
Switch(config-if)# ip address 192.168.10.2 255.255.255.0
Switch(config-if)# no shutdown
```

Line-by-line:

```text
interface vlan 1
= enter VLAN 1 interface configuration

ip address 192.168.10.2 255.255.255.0
= assign management IP and subnet mask

no shutdown
= activate the interface
```

Important:

```text
A Layer 2 switch can forward frames without management IP.
Management IP is needed for remote management.
```

---

## 8.13 Configure End Device IP Settings

End devices such as PCs need:

```text
IP address
Subnet mask
Default gateway
DNS server
```

Meaning:

| Setting         | Purpose                               |
| --------------- | ------------------------------------- |
| IP address      | Device's own address                  |
| Subnet mask     | Defines local network                 |
| Default gateway | Router used to reach other networks   |
| DNS server      | Converts domain names to IP addresses |

Example:

```text
IP address:       192.168.1.10
Subnet mask:      255.255.255.0
Default gateway:  192.168.1.1
DNS server:       8.8.8.8
```

Common DNS example:

```text
google.com -> IP address
```

---

# 9. Full Basic Switch Configuration Example

```bash
Switch> enable
Switch# configure terminal

Switch(config)# hostname Sw-Floor-1

Sw-Floor-1(config)# enable secret class

Sw-Floor-1(config)# line console 0
Sw-Floor-1(config-line)# password cisco
Sw-Floor-1(config-line)# login
Sw-Floor-1(config-line)# exit

Sw-Floor-1(config)# line vty 0 15
Sw-Floor-1(config-line)# password cisco
Sw-Floor-1(config-line)# login
Sw-Floor-1(config-line)# exit

Sw-Floor-1(config)# service password-encryption

Sw-Floor-1(config)# banner motd # This is a secure system. Authorized Access ONLY!!! #

Sw-Floor-1(config)# interface vlan 1
Sw-Floor-1(config-if)# ip address 192.168.10.2 255.255.255.0
Sw-Floor-1(config-if)# no shutdown
Sw-Floor-1(config-if)# exit

Sw-Floor-1(config)# end

Sw-Floor-1# show running-config
Sw-Floor-1# copy running-config startup-config
```

---

# 10. Command Table

| Purpose                         | Command                                 |
| ------------------------------- | --------------------------------------- |
| Enter privileged EXEC mode      | `enable`                                |
| Enter global configuration mode | `configure terminal`                    |
| Set hostname                    | `hostname Sw-Floor-1`                   |
| Set encrypted enable password   | `enable secret class`                   |
| Enter console line mode         | `line console 0`                        |
| Set line password               | `password cisco`                        |
| Require login password          | `login`                                 |
| Enter VTY line mode             | `line vty 0 15`                         |
| Encrypt plain text passwords    | `service password-encryption`           |
| Set login banner                | `banner motd # message #`               |
| Show active configuration       | `show running-config`                   |
| Save configuration              | `copy running-config startup-config`    |
| Enter SVI configuration         | `interface vlan 1`                      |
| Set SVI IP address              | `ip address 192.168.10.2 255.255.255.0` |
| Activate interface              | `no shutdown`                           |
| Return to privileged EXEC mode  | `end`                                   |
| Return to user EXEC mode        | `disable`                               |

---

# 11. Common Mistakes

## Mistake 1: Forgetting `login`

Wrong:

```bash
Switch(config-line)# password cisco
```

Correct:

```bash
Switch(config-line)# password cisco
Switch(config-line)# login
```

---

## Mistake 2: Forgetting to Save

Wrong:

```text
Configure device.
Restart device.
Configuration lost.
```

Correct:

```bash
copy running-config startup-config
```

---

## Mistake 3: Confusing IP and MAC

```text
IP address  = final destination
MAC address = next local delivery
```

---

## Mistake 4: Confusing Switch and Router

```text
Switch = connects devices in same LAN, uses MAC addresses
Router = connects different networks, uses IP addresses
```

---

## Mistake 5: Confusing Console and VTY

```text
Console = direct cable access
VTY     = remote Telnet/SSH access
```

---

## Mistake 6: Forgetting `no shutdown`

When configuring an interface:

```bash
no shutdown
```

This activates the interface.

---

## Mistake 7: Thinking `show running-config` Saves Configuration

Wrong:

```text
show running-config saves my work.
```

Correct:

```text
show running-config only displays active configuration.
copy running-config startup-config saves the configuration.
```

---

# 12. Viva / Exam-Style Questions

## Rules of Communication

1. What is a protocol?
2. Why must sender and receiver be identified?
3. What is encoding?
4. What is decoding?
5. What is flow control?
6. What is response timeout?
7. What is access method?
8. What is the difference between unicast, multicast, and broadcast?

---

## Network Protocols

1. What is a network protocol?
2. What is a protocol suite?
3. What is TCP/IP?
4. Why do we use a layered model?
5. Name the four TCP/IP layers.
6. Which layer is closest to the user?
7. Which layer uses TCP and UDP?
8. Which layer uses IP addressing?
9. Which layer is related to Ethernet and Wi-Fi?
10. Why are standards organizations important?

---

## Data Encapsulation

1. What is segmentation?
2. What is multiplexing?
3. What is encapsulation?
4. What is de-encapsulation?
5. What does PDU stand for?
6. What is the PDU at the application layer?
7. What is the PDU at the transport layer?
8. What is the PDU at the Internet layer?
9. What is the PDU at the network access layer?
10. What is the PDU at the physical layer?

---

## Data Access

1. What is an IP address?
2. What is a MAC address?
3. What is a NIC?
4. What is the difference between IP address and MAC address?
5. What happens when two devices are in the same network?
6. What happens when two devices are in different networks?
7. What is a default gateway?
8. Which device usually acts as the default gateway?
9. What command shows IP configuration in Windows?
10. What command shows IP-to-MAC mapping?

---

## Network Operating Systems

1. What is a network operating system?
2. What does Cisco IOS stand for?
3. Where is Cisco IOS stored?
4. Where does IOS run after power on?
5. What is the difference between flash and RAM?
6. What is the kernel?
7. What is the shell?
8. What does CLI stand for?
9. What does GUI stand for?
10. What is the difference between Telnet and SSH?

---

## Basic Commands

1. What is a hostname?
2. What command changes a hostname?
3. What does enable secret protect?
4. Why is enable secret better than enable password?
5. What does console password protect?
6. What does VTY password protect?
7. Why is the `login` command important?
8. What does `service password-encryption` do?
9. What does MOTD stand for?
10. What command shows active configuration?
11. What command saves configuration?
12. What is the difference between running-config and startup-config?
13. What does `interface vlan 1` do?
14. What does `no shutdown` do?
15. What IP settings does a PC need?

---

# 13. Mini Checkpoint Answers

## Key Answers

```text
Protocol = rules for communication
Encoding = convert data into sendable form
Decoding = convert data back into understandable form
Flow control = controls amount and speed of data
Response timeout = waiting time before giving up
Access method = decides when a device can send
```

```text
Protocol suite = group of related protocols
TCP/IP = main Internet protocol suite
Application layer = user/application services
Transport layer = TCP/UDP delivery management
Internet layer = IP addressing and routing
Network access layer = Ethernet/Wi-Fi local delivery
```

```text
Segmentation = split big data into smaller pieces
Multiplexing = interleave pieces from different conversations
Encapsulation = add headers/trailers
De-encapsulation = remove headers/trailers
PDU = Protocol Data Unit
```

```text
Application PDU = Data
Transport PDU = Segment
Internet PDU = Packet
Network Access PDU = Frame
Physical PDU = Bits
```

```text
IP address = final destination address
MAC address = local next-hop address
Default gateway = router used to reach other networks
```

```text
Cisco IOS = Cisco Internetwork Operating System
Flash = stores IOS
RAM = runs IOS
Kernel = talks to hardware
Shell = user command interface
```

```text
Switch> = User EXEC mode
Switch# = Privileged EXEC mode
Switch(config)# = Global configuration mode
Switch(config-if)# = Interface configuration mode
Switch(config-line)# = Line configuration mode
```

---

# 14. Final Chapter Summary

Chapter 2 teaches that network communication follows rules.

The main idea:

```text
Data does not simply move from one device to another randomly.
It is prepared, addressed, encapsulated, transmitted, received, and decoded.
```

Important flow:

```text
Sender
  ↓
Application data is created
  ↓
Data is segmented
  ↓
Headers are added
  ↓
Data becomes Data -> Segment -> Packet -> Frame -> Bits
  ↓
Bits travel through network media
  ↓
Receiver de-encapsulates data
  ↓
Original message is delivered
```

Important address rule:

```text
IP address = source to final destination
MAC address = one local hop at a time
```

Important command rule:

```text
Configure device
Check configuration
Save configuration
```

Configuration sequence:

```bash
enable
configure terminal
hostname Sw-Floor-1
enable secret class
line console 0
password cisco
login
exit
line vty 0 15
password cisco
login
exit
service password-encryption
banner motd # Authorized Access Only #
interface vlan 1
ip address 192.168.10.2 255.255.255.0
no shutdown
end
copy running-config startup-config
```