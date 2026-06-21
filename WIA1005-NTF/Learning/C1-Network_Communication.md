# Chapter 1: Network Communication

---

# 1. Introduction to Network Communication

## 1.1 What is network communication?

Network communication means devices are connected together so they can send and receive data.

Example:

```text
Phone  →  Wi-Fi Router  →  Internet  →  YouTube Server
```

When you open YouTube, your phone sends a request through the network, and the YouTube server sends video data back.

The slide explains that networks allow people to stay connected, share information quickly, and access services such as cloud storage from anywhere. 

---

## 1.2 Internet of Everything, IoE

**IoE** stands for **Internet of Everything**.

It connects:

```text
People + Process + Data + Things
```

| Part    | Meaning       | Example                  |
| ------- | ------------- | ------------------------ |
| People  | Users         | Students, workers        |
| Process | Steps/actions | Online payment           |
| Data    | Information   | Messages, files, videos  |
| Things  | Devices       | Sensors, phones, cameras |

Example:

```text
Smart home system:
Phone → Smart light → Internet → App control
```

---

## 1.3 Hosts and end devices

A **host** or **end device** is a device that directly participates in network communication.

Examples:

```text
Laptop
Phone
Tablet
Printer
Server
Security camera
```

The slide says hosts can send and receive messages on the network. 

---

## 1.4 Client and server

A **client** requests a service.

A **server** provides a service.

Example:

```text
Client laptop  →  requests webpage  →  Web server
Client laptop  ←  receives webpage  ←  Web server
```

Examples of servers:

```text
Web server
Email server
File server
Database server
```

---

## 1.5 Peer-to-peer network

In a **peer-to-peer network**, a device can be both client and server at the same time.

Example:

```text
Laptop A  ↔  Laptop B
```

Laptop A can request files from Laptop B.
Laptop B can also request files from Laptop A.

The slide states that in peer-to-peer networking, a host can become a client and server at the same time. 

---

## Common mistakes

```text
Mistake 1: Thinking all networks are the Internet.
Correct: A network can be small, such as two connected computers.

Mistake 2: Thinking a server is only hardware.
Correct: A server needs server software to provide services.

Mistake 3: Thinking one device can only be client or server.
Correct: A device can act as both, especially in peer-to-peer networks.
```

---

## Viva / Exam Questions

**Q1. What is a host?**
A host is an end device connected to a network that can send and receive messages.

**Q2. What is a client?**
A client is a device that requests a service.

**Q3. What is a server?**
A server is a device with software that provides services or information to clients.

**Q4. What is peer-to-peer networking?**
It is a network where a host can act as both client and server.

---

# 2. Network Components

The slide divides network infrastructure into three categories: **devices, media, and services**. 

```text
Network Components
├── Devices
├── Media
└── Services
```

---

## 2.1 Devices

Devices are hardware used in a network.

There are two main types:

```text
1. End devices
2. Intermediary devices
```

---

## 2.2 End devices

End devices are devices used by users or devices where communication starts or ends.

Examples from the slide include computers, servers, printers, VoIP phones, security cameras, smartphones, tablets, and barcode scanners. 

Example:

```text
Laptop  →  Network  →  Printer
```

Laptop is an end device.
Printer is also an end device.

---

## 2.3 Intermediary devices

Intermediary devices connect end devices and help data move across the network.

Examples:

```text
Switch
Router
Wireless access point
Firewall
```

The slide explains that intermediary devices interconnect end devices and can connect multiple individual networks to form an internetwork. 

---

## 2.4 Switch

A **switch** connects devices inside the same local network.

Example:

```text
PC1 ──┐
PC2 ──┼── Switch
PC3 ──┘
```

Main idea:

```text
Switch = connects devices in the same LAN
```

---

## 2.5 Router

A **router** connects different networks.

Example:

```text
Home LAN  →  Router  →  Internet
```

Main idea:

```text
Router = connects different networks
```

---

## 2.6 Firewall

A **firewall** filters traffic and protects the network.

Example:

```text
Internet  →  Firewall  →  Company Network
```

Main idea:

```text
Firewall = blocks unauthorized traffic
```

---

## 2.7 Network media

Network media is the channel used to carry messages from source to destination.

The slide lists three common media types: metallic wires, fiber optic cable, and wireless transmission. 

```text
Network Media
├── Copper cable
├── Fiber optic cable
└── Wireless transmission
```

---

## 2.8 Copper cable

Copper cable uses electrical signals.

Example:

```text
PC ===== Ethernet cable ===== Switch
```

---

## 2.9 Fiber optic cable

Fiber optic cable uses light signals.

Example:

```text
Building A ===== Fiber optic ===== Building B
```

Main advantages:

```text
Fast
Long distance
High capacity
```

---

## 2.10 Wireless transmission

Wireless uses radio signals.

Example:

```text
Phone  ))) Wi-Fi signal )))  Access Point
```

---

## 2.11 Services

Services are useful functions provided through the network.

Examples:

```text
Email
Web hosting
File sharing
Cloud storage
Printing
Video streaming
```

The slide says services are usually provided by servers and accessed by clients. 

---

## Common mistakes

```text
Mistake 1: Thinking router and switch are the same.
Correct:
Switch = same network
Router = different networks

Mistake 2: Thinking wireless is always better than cable.
Correct:
Wireless is convenient, but cable is usually more stable.

Mistake 3: Thinking service and device are the same.
Correct:
Server = device/role
Web service = service provided by server
```

---

## Viva / Exam Questions

**Q1. What are the three network component categories?**
Devices, media, and services.

**Q2. What is an end device?**
A device where network communication starts or ends.

**Q3. What is an intermediary device?**
A device that connects end devices and helps data move across the network.

**Q4. Give three examples of network media.**
Copper cable, fiber optic cable, and wireless transmission.

---

# 3. Network Representations

A **network representation** shows a network using diagrams, symbols, ports, and addresses.

The slide says network diagrams help us understand how devices connect in a large network. 

---

## 3.1 Topology diagram

A topology diagram is a visual map of how a network is connected.

There are two types:

```text
1. Physical topology diagram
2. Logical topology diagram
```

---

## 3.2 Physical topology

A **physical topology diagram** shows the real physical layout.

It identifies:

```text
Physical location of devices
Configured ports
Cable installation
```

Example:

```text
PC1 Fa0  ─── Switch Fa0/1
PC2 Fa0  ─── Switch Fa0/2
Router G0/0 ─ Switch Fa0/24
```

---

## 3.3 Logical topology

A **logical topology diagram** shows how data moves logically.

It identifies:

```text
Devices
Ports
IP addressing scheme
```

Example:

```text
Network: 192.168.1.0/24

PC1:    192.168.1.10
Router: 192.168.1.1
Server: 192.168.1.100
```

---

## 3.4 Physical vs logical topology

| Feature    | Physical Topology     | Logical Topology                 |
| ---------- | --------------------- | -------------------------------- |
| Focus      | Real device location  | Data path and addressing         |
| Shows      | Cables, ports, rooms  | IP addresses, networks, gateways |
| Useful for | Cable troubleshooting | Communication troubleshooting    |
| Example    | PC1 connects to Fa0/1 | PC1 IP is 192.168.1.10           |

---

## Common mistakes

```text
Mistake 1: Confusing physical and logical topology.
Correct:
Physical = real connection
Logical = IP/data path

Mistake 2: Ignoring port labels.
Correct:
Port labels are important in lab configuration.

Mistake 3: Thinking every diagram shows real distance.
Correct:
Logical diagrams may not show real physical distance.
```

---

## Viva / Exam Questions

**Q1. What is a topology diagram?**
A visual map of how a network is connected.

**Q2. What does physical topology show?**
Physical location, ports, and cable installation.

**Q3. What does logical topology show?**
Devices, ports, and IP addressing scheme.

---

# 4. Types of Networks

Networks can be small or large. The slide says networks can range from two computers to networks connecting millions of devices. 

---

## 4.1 Simple network

A simple network may connect only two computers.

```text
Computer A ─── Computer B
```

It can be used to share:

```text
Files
Printers
Documents
Pictures
Music
```

---

## 4.2 Home network

A home network connects devices inside a house.

Example:

```text
Phone  )))
Laptop )))  Home Router  →  Internet
TV     )))
Printer )))
```

---

## 4.3 SOHO network

**SOHO** means:

```text
Small Office / Home Office
```

The slide explains that SOHO networks allow people to work from home or remote offices and communicate with customers. 

Example:

```text
Laptop
Printer
IP Phone
Router
Internet
```

---

## 4.4 Medium to large networks

Used by:

```text
Schools
Universities
Companies
Corporations
```

They may contain hundreds or thousands of hosts.

---

## 4.5 LAN

**LAN** stands for:

```text
Local Area Network
```

A LAN covers a small geographical area.

Examples:

```text
Home
School
Office
Campus
Computer lab
```

The slide says LANs are usually administered by one organization or individual and provide high-speed bandwidth internally. 

---

## 4.6 WAN

**WAN** stands for:

```text
Wide Area Network
```

A WAN connects networks over a wide geographical area.

Examples:

```text
KL office ↔ Penang office
Malaysia branch ↔ Singapore branch
Country ↔ Country
```

The slide says WANs interconnect LANs across cities, states, countries, or continents. 

---

## 4.7 LAN vs WAN

| Feature    | LAN                       | WAN                                |
| ---------- | ------------------------- | ---------------------------------- |
| Full name  | Local Area Network        | Wide Area Network                  |
| Area       | Small                     | Large                              |
| Example    | Computer lab              | Branch offices in different cities |
| Speed      | Usually faster internally | Usually slower between LANs        |
| Managed by | One organization/person   | Multiple service providers         |

Memory:

```text
LAN = Local
WAN = Wide
```

---

## 4.8 Internet

The **Internet** is a worldwide collection of interconnected networks.

Simple meaning:

```text
Internet = network of networks
```

The slide says the Internet uses common standards to exchange information. 

---

## 4.9 Intranet

An **intranet** is a private network for an organization.

Example:

```text
Company HR portal
University student portal
Internal file server
```

Only authorized members can access it.

---

## 4.10 Extranet

An **extranet** allows secure and controlled access to selected external users.

Examples from the slide:

```text
Company gives access to suppliers and contractors
Hospital provides booking system to doctors
```



---

## 4.11 Internet vs Intranet vs Extranet

| Type     | Access                    | Users              | Example           |
| -------- | ------------------------- | ------------------ | ----------------- |
| Internet | Public                    | Everyone           | Google, YouTube   |
| Intranet | Private                   | Internal users     | Company HR portal |
| Extranet | Controlled private access | Selected outsiders | Supplier portal   |

Memory:

```text
Internet = everyone
Intranet = internal users
Extranet = external selected users
```

---

## Common mistakes

```text
Mistake 1: Thinking LAN means no Internet.
Correct: LAN can connect to Internet through router.

Mistake 2: Thinking WAN is faster than LAN.
Correct: WAN links are usually slower than LAN internal links.

Mistake 3: Confusing intranet and extranet.
Correct:
Intranet = internal users
Extranet = selected external users
```

---

## Viva / Exam Questions

**Q1. What does LAN stand for?**
Local Area Network.

**Q2. What does WAN stand for?**
Wide Area Network.

**Q3. What is the Internet?**
A worldwide collection of interconnected networks.

**Q4. What is an intranet?**
A private network for authorized users inside an organization.

**Q5. What is an extranet?**
A private network that gives controlled access to selected outside users.

---

# 5. Internet Connections

Home users, remote workers, and small offices usually need an ISP to access the Internet. 

---

## 5.1 ISP

**ISP** stands for:

```text
Internet Service Provider
```

An ISP provides Internet access.

Example:

```text
Device → Router → ISP → Internet
```

---

## 5.2 Cable Internet

Cable Internet uses the same cable system that delivers cable television.

The slide says it provides:

```text
High bandwidth
High availability
Always-on connection
```



---

## 5.3 DSL

**DSL** stands for:

```text
Digital Subscriber Line
```

DSL uses a telephone line and provides high bandwidth, high availability, and always-on connection. 

---

## 5.4 ADSL

**ADSL** stands for:

```text
Asymmetrical Digital Subscriber Line
```

Formula-style idea:

```text
Download speed > Upload speed
```

Example:

```text
Download: 100 Mbps
Upload:    20 Mbps
```

The slide says ADSL is common for small office and home office users, with download speed faster than upload speed. 

---

## 5.5 Cellular Internet

Cellular Internet uses mobile phone networks.

Examples:

```text
3G
4G
5G
```

---

## 5.6 Satellite Internet

Satellite Internet is useful in areas with no other Internet connectivity.

Important requirement:

```text
Satellite dish needs clear line of sight to satellite
```

---

## 5.7 Dial-up

Dial-up uses:

```text
Phone line + modem
```

The slide says dial-up is inexpensive but has low bandwidth and is not suitable for large data transfer. 

---

## 5.8 Business Internet Connections

Businesses may need:

```text
Higher bandwidth
Dedicated bandwidth
Managed services
```

---

## 5.9 Dedicated leased line

A dedicated leased line is a reserved circuit rented from a service provider.

Example:

```text
KL Office ─── Leased Line ─── Penang Office
```

It connects separated offices for private voice or data networking. 

---

## 5.10 Metro Ethernet

Metro Ethernet extends LAN access technology into the WAN.

Simple idea:

```text
Ethernet technology + wider metropolitan/WAN area
```

---

## 5.11 Business DSL and SDSL

**SDSL** stands for:

```text
Symmetric Digital Subscriber Line
```

Formula-style idea:

```text
Download speed = Upload speed
```

Example:

```text
Download: 100 Mbps
Upload:   100 Mbps
```

---

## 5.12 Converged network

A converged network carries multiple services on one network.

Examples:

```text
Voice
Video
Data
Email
Web browsing
File transfer
```

The slide states that converged data networks carry multiple services on one network. 

---

## Important formulas / comparisons

```text
ADSL:
Download speed > Upload speed

SDSL:
Download speed = Upload speed
```

---

## Common mistakes

```text
Mistake 1: Thinking Wi-Fi is the same as Internet.
Correct:
Wi-Fi = local wireless connection
Internet = global network access through ISP

Mistake 2: Confusing DSL and dial-up.
Correct:
DSL = faster, always-on
Dial-up = old, slow, low bandwidth

Mistake 3: Thinking VPN or router is an ISP.
Correct:
ISP = company that provides Internet access
```

---

## Viva / Exam Questions

**Q1. What does ISP stand for?**
Internet Service Provider.

**Q2. What does DSL stand for?**
Digital Subscriber Line.

**Q3. In ADSL, which speed is faster?**
Download speed.

**Q4. What does SDSL mean?**
Symmetric Digital Subscriber Line.

**Q5. What is a converged network?**
A network that carries multiple services such as voice, video, and data.

---

# 6. Reliable Network

A reliable network is a network users can depend on.

The slide says network architecture includes technologies, services, rules, and protocols that move data across the network. 

---

## 6.1 Four characteristics of reliable networks

The slide lists four characteristics:

```text
1. Fault tolerance
2. Scalability
3. Quality of Service, QoS
4. Security
```



---

## 6.2 Fault tolerance

Fault tolerance means a network can continue working even when failure happens.

Example:

```text
Without backup:
PC → Switch → Router X → Internet
Failure stops connection.

With backup:
PC → Switch → Router A → Internet
           → Router B → Internet
If Router A fails, Router B can be used.
```

The slide says fault tolerant networks limit the impact of failure and recover quickly. 

---

## 6.3 Redundancy

Redundancy means having backup paths or backup devices.

```text
Redundancy = extra path/device for backup
```

Example:

```text
Path A fails → use Path B
```

---

## 6.4 Scalability

Scalability means the network can grow without reducing performance for existing users.

Example:

```text
Today: 20 users
Future: 200 users
Network still works well
```

The slide says scalable networks can support new users and applications without degrading current services. 

---

## 6.5 Quality of Service, QoS

**QoS** stands for:

```text
Quality of Service
```

QoS gives priority to important traffic during congestion.

Example:

```text
Voice call traffic → high priority
File download → lower priority
```

The slide says QoS helps manage congestion and can give priority to voice communications. 

---

## 6.6 Congestion formula

Important relationship:

```text
Bandwidth demand > Available bandwidth
```

Meaning:

```text
Users want to send/receive more data than the network can handle.
```

Example:

```text
Available bandwidth = 100 Mbps
User demand = 150 Mbps

150 Mbps > 100 Mbps
```

Result:

```text
Congestion
Lag
Delay
Packet loss
Slow connection
```

---

## 6.7 Security as reliability

A network is not reliable if it is not secure.

Security protects:

```text
Network infrastructure
Services
Data
```

---

## 6.8 CIA Triad

The slide lists three primary network security requirements: confidentiality, integrity, and availability. 

```text
C = Confidentiality
I = Integrity
A = Availability
```

| Requirement     | Meaning                             | Example                     |
| --------------- | ----------------------------------- | --------------------------- |
| Confidentiality | Only authorized users can read data | Password is private         |
| Integrity       | Data is not changed                 | RM10 does not become RM1000 |
| Availability    | Service is accessible when needed   | Website is online           |

---

## Common mistakes

```text
Mistake 1: Thinking fault tolerance means no failure.
Correct:
Failure can happen, but network can recover.

Mistake 2: Thinking QoS creates more bandwidth.
Correct:
QoS only prioritizes traffic.

Mistake 3: Confusing CIA.
Correct:
Confidentiality = read/privacy
Integrity = unchanged/correct
Availability = accessible/online
```

---

## Viva / Exam Questions

**Q1. What are the four characteristics of a reliable network?**
Fault tolerance, scalability, QoS, and security.

**Q2. What is redundancy?**
Backup paths or backup devices.

**Q3. What does QoS do?**
It prioritizes important traffic during congestion.

**Q4. What are the three parts of CIA?**
Confidentiality, integrity, and availability.

---

# 7. Network Trends

The slide lists modern network trends such as BYOD, online collaboration, video communications, cloud computing, smart home, and powerline networking. 

---

## 7.1 BYOD

**BYOD** stands for:

```text
Bring Your Own Device
```

It means users use their personal devices on a business or campus network.

Examples:

```text
Student uses own laptop on campus Wi-Fi
Staff uses own tablet for work email
```

---

## 7.2 Online collaboration

Online collaboration means working with others through network tools.

Examples:

```text
Google Docs
Microsoft Teams
Webex
Zoom
Shared files
Group chat
```

The slide defines online collaboration as working with others on a joint project. 

---

## 7.3 Video communications

Video communication means using video over a network to communicate.

Examples:

```text
Zoom meeting
Google Meet class
Online viva
Video conference
```

The slide says video conferencing is powerful for local and global communication. 

---

## 7.4 Cloud computing

Cloud computing means using Internet servers to store data or access applications.

Examples:

```text
Google Drive
OneDrive
iCloud
Dropbox
Google Docs
Canva
```

The slide says cloud computing allows us to store files and backup data on servers over the Internet. 

---

## 7.5 Four types of cloud

```text
1. Public cloud
2. Private cloud
3. Hybrid cloud
4. Community cloud
```

| Cloud type      | Meaning                             | Example                                |
| --------------- | ----------------------------------- | -------------------------------------- |
| Public cloud    | Shared cloud service for many users | Google Drive                           |
| Private cloud   | Cloud for one organization          | Bank private cloud                     |
| Hybrid cloud    | Public + private cloud              | Sensitive data private, website public |
| Community cloud | Shared by specific group            | Hospitals sharing healthcare cloud     |

---

## 7.6 Smart home

Smart home means everyday appliances connect to the network and become smarter or automated.

Examples:

```text
Smart light
Smart TV
Smart lock
Smart camera
Smart speaker
Smart air-conditioner
```

---

## 7.7 Powerline networking

Powerline networking uses existing electrical wiring to connect devices.

Example:

```text
Router → Powerline adapter → Electrical wiring → Powerline adapter → PC
```

The slide says devices can connect to the LAN wherever there is an electrical outlet, without installing data cables. 

---

## Common mistakes

```text
Mistake 1: Thinking BYOD only means phones.
Correct:
BYOD includes laptop, tablet, phone, etc.

Mistake 2: Thinking cloud means data is floating in the sky.
Correct:
Cloud data is stored on real servers.

Mistake 3: Thinking powerline networking is Wi-Fi.
Correct:
Powerline uses electrical wiring.
```

---

## Viva / Exam Questions

**Q1. What does BYOD stand for?**
Bring Your Own Device.

**Q2. What is online collaboration?**
Working with others on a project using network tools.

**Q3. What is cloud computing?**
Using Internet servers to store data or access applications.

**Q4. What are the four cloud types?**
Public, private, hybrid, and community cloud.

**Q5. What does powerline networking use?**
Existing electrical wiring.

---

# 8. Network Security

Network security protects networks, devices, services, and data.

The slide says network security uses protocols, technologies, devices, tools, and techniques to protect data and reduce threats. 

---

## 8.1 Common external threats

The slide lists these common external threats:

```text
Viruses, worms, and Trojan horses
Spyware and adware
Zero-day attacks
Threat actor attacks
Denial-of-service attacks
Data interception and theft
Identity theft
```



---

## 8.2 Virus

A virus is malware that attaches to a file or program.

Usually needs user action.

Example:

```text
User opens infected file → virus runs
```

---

## 8.3 Worm

A worm spreads by itself across networks.

Example:

```text
Infected PC → PC2
            → PC3
            → PC4
```

---

## 8.4 Trojan horse

A Trojan pretends to be safe but hides harmful code.

Example:

```text
Fake free game → secretly installs malware
```

---

## 8.5 Virus vs worm vs Trojan

| Threat | Meaning                    | Key point             |
| ------ | -------------------------- | --------------------- |
| Virus  | Attaches to files/programs | Needs user action     |
| Worm   | Spreads automatically      | Moves through network |
| Trojan | Pretends to be safe        | Tricks user           |

---

## 8.6 Spyware and adware

**Spyware** secretly collects user information.

**Adware** shows unwanted advertisements and may track users.

Examples of stolen/tracked data:

```text
Browsing history
Passwords
Personal data
Login information
```

---

## 8.7 Zero-day attack

A zero-day attack happens when a vulnerability first becomes known.

Simple meaning:

```text
New weakness discovered → attacker uses it before fix is ready
```

---

## 8.8 Threat actor attack

A threat actor is a malicious person or group attacking network resources.

Examples:

```text
Hacker
Cybercriminal
Malicious insider
Scammer
```

---

## 8.9 Denial-of-Service attack, DoS

A DoS attack slows or crashes applications or processes.

Example:

```text
Website can handle 100 users
Attacker sends 10,000 fake requests
Website becomes slow or crashes
```

Main CIA effect:

```text
DoS affects availability
```

---

## 8.10 Data interception and theft

Data interception means an attacker captures private data while it travels.

Example:

```text
Laptop → password data → Server
              ↑
          Attacker captures it
```

Main CIA effect:

```text
Data interception affects confidentiality
```

---

## 8.11 Identity theft

Identity theft means stealing login credentials to access private data.

Examples of credentials:

```text
Username
Password
PIN
Authentication code
```

---

# 9. Security Components

---

## 9.1 Home or small office security

The slide lists:

```text
Antivirus and antispyware
Firewall filtering
```



---

## 9.2 Antivirus and antispyware

Antivirus protects against malware.

Antispyware protects against spyware.

Main purpose:

```text
Protect end devices from infection
```

---

## 9.3 Firewall filtering

A firewall blocks unauthorized access into and out of the network.

Example:

```text
Internet → Firewall → Home/Office Network
```

Main idea:

```text
Allowed traffic = pass
Unauthorized traffic = blocked
```

---

## 9.4 Corporate security tools

The slide lists extra security for larger networks:

```text
Dedicated firewall systems
Access Control Lists, ACL
Intrusion Prevention Systems, IPS
Virtual Private Networks, VPN
```



---

## 9.5 Dedicated firewall systems

A dedicated firewall filters large amounts of traffic with more detailed control.

Simple meaning:

```text
Dedicated firewall = stronger firewall for larger networks
```

---

## 9.6 ACL

**ACL** stands for:

```text
Access Control List
```

An ACL filters traffic based on rules such as IP addresses and applications.

Example:

```text
Permit IT department
Deny everyone else
```

Command preview:

```bash
access-list 10 permit 192.168.1.0 0.0.0.255
access-list 10 deny any
```

Beginner meaning:

```text
Allow network 192.168.1.0
Block everyone else
```

---

## 9.7 IPS

**IPS** stands for:

```text
Intrusion Prevention System
```

An IPS identifies and helps block fast-spreading threats such as zero-day or zero-hour attacks.

Main idea:

```text
IPS = detects and prevents attacks
```

---

## 9.8 VPN

**VPN** stands for:

```text
Virtual Private Network
```

A VPN gives secure access into an organization for remote workers.

Example:

```text
Remote worker laptop → Secure VPN tunnel → Company network
```

---

## Common mistakes

```text
Mistake 1: Thinking firewall and antivirus are the same.
Correct:
Firewall = filters traffic
Antivirus = detects malware

Mistake 2: Thinking VPN gives free Internet.
Correct:
VPN needs Internet first and provides secure access.

Mistake 3: Thinking DoS mainly steals data.
Correct:
DoS mainly affects availability.
```

---

## Viva / Exam Questions

**Q1. What is network security?**
Protection of network devices, services, data, and users from threats.

**Q2. Which malware spreads by itself?**
Worm.

**Q3. Which malware pretends to be safe?**
Trojan horse.

**Q4. What does DoS do?**
It slows or crashes services.

**Q5. What does ACL stand for?**
Access Control List.

**Q6. What does IPS stand for?**
Intrusion Prevention System.

**Q7. What does VPN stand for?**
Virtual Private Network.

---

# 10. Important Command Examples

These are not deeply taught yet, but useful for basic networking understanding.

---

## 10.1 Ping gateway

```bash
ping 192.168.1.1
```

Meaning:

```text
Check whether your device can reach the router/default gateway.
```

---

## 10.2 Ping Internet IP

```bash
ping 8.8.8.8
```

Meaning:

```text
Check whether your device can reach an Internet IP address.
```

---

## 10.3 Ping domain name

```bash
ping google.com
```

Meaning:

```text
Check whether your device can reach a website using a domain name.
```

---

## 10.4 Trace path

```bash
tracert google.com
```

Meaning:

```text
Shows the path your data takes to reach Google.
```

---

## 10.5 View active connections

```bash
netstat
```

Meaning:

```text
Shows active network connections on your device.
```

---

# 11. Formula and Equation Section

The Chapter 1 slides do not contain heavy mathematical equations.

But there are important formula-style relationships:

---

## 11.1 ADSL speed relationship

```text
Download speed > Upload speed
```

Meaning:

```text
ADSL gives faster download than upload.
```

Example:

```text
Download = 100 Mbps
Upload   = 20 Mbps

100 Mbps > 20 Mbps
```

---

## 11.2 SDSL speed relationship

```text
Download speed = Upload speed
```

Meaning:

```text
SDSL gives equal download and upload speed.
```

Example:

```text
Download = 100 Mbps
Upload   = 100 Mbps

100 Mbps = 100 Mbps
```

---

## 11.3 Congestion relationship

```text
Bandwidth demand > Available bandwidth
```

Meaning:

```text
Users want more data capacity than the network can provide.
```

Example:

```text
Available bandwidth = 100 Mbps
User demand         = 150 Mbps

150 Mbps > 100 Mbps
```

Result:

```text
Network congestion
Lag
Delay
Slow connection
Packet loss
```

QoS helps by prioritizing important traffic.

---

# 12. Final Chapter Summary

```text
Chapter 1 teaches how network communication works.

Main ideas:

1. Networks connect devices so they can communicate.
2. Hosts/end devices send and receive data.
3. Clients request services.
4. Servers provide services.
5. Peer-to-peer devices can act as both client and server.
6. Network components are devices, media, and services.
7. End devices start/end communication.
8. Intermediary devices help move data.
9. Network media carries data.
10. Network diagrams show how networks are connected.
11. Physical topology shows real cables, ports, and locations.
12. Logical topology shows IP addressing and data paths.
13. LAN covers a small area.
14. WAN connects LANs over wide areas.
15. Internet is a network of networks.
16. Intranet is private internal access.
17. Extranet is controlled access for selected outsiders.
18. Internet access usually needs an ISP.
19. Reliable networks need fault tolerance, scalability, QoS, and security.
20. Modern trends include BYOD, collaboration, video, cloud, smart home, and powerline networking.
21. Network security protects against malware, attacks, data theft, and unauthorized access.
```

---

# 13. Final Exam Memory List

```text
Client = requests service
Server = provides service

End device = communication starts/ends here
Intermediary device = helps data move

Switch = connects same network
Router = connects different networks
Firewall = filters traffic

Copper = electrical signal
Fiber = light signal
Wireless = radio signal

Physical topology = real cables/ports/location
Logical topology = IP/data path

LAN = Local Area Network
WAN = Wide Area Network

Internet = public network of networks
Intranet = private internal network
Extranet = selected external access

ISP = Internet Service Provider

ADSL = download faster than upload
SDSL = download equals upload

Fault tolerance = survives failure
Redundancy = backup path/device
Scalability = can grow
QoS = prioritizes important traffic

CIA:
Confidentiality = private
Integrity = unchanged
Availability = accessible

BYOD = bring your own device
Cloud = Internet servers
Powerline = electrical wiring network

Virus = attaches to files
Worm = spreads by itself
Trojan = pretends to be safe
Spyware = secretly collects data
DoS = crashes/slows service
Identity theft = stolen login credentials

ACL = allow/deny rules
IPS = detects and prevents attacks
VPN = secure remote access
```

---

# 14. Final Self-Test

Try to answer these without looking.

1. What is network communication?
2. What is IoE?
3. What is a host?
4. What is the difference between client and server?
5. What is peer-to-peer networking?
6. What are the three network component categories?
7. What is the difference between end device and intermediary device?
8. What is the difference between switch and router?
9. What are the three network media types?
10. What is physical topology?
11. What is logical topology?
12. What does LAN stand for?
13. What does WAN stand for?
14. What is the difference between Internet, intranet, and extranet?
15. What does ISP stand for?
16. What is the difference between ADSL and SDSL?
17. What is a dedicated leased line?
18. What is a converged network?
19. What are the four reliable network characteristics?
20. What is redundancy?
21. What does QoS do?
22. What are confidentiality, integrity, and availability?
23. What does BYOD stand for?
24. What are the four cloud types?
25. What is powerline networking?
26. What is the difference between virus, worm, and Trojan?
27. What is spyware?
28. What is a zero-day attack?
29. What does DoS affect?
30. What do firewall, ACL, IPS, and VPN do?