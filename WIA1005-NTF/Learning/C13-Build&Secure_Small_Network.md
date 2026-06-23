# Chapter 13 :Build and secure a small network

# 1. Chapter 13 Big Picture

Chapter 13 is about how to **build and secure a small network**.

A small network may look simple, but it still needs:

```text
Planning
Documentation
Troubleshooting
Security
Backup
Growth planning
```

A small network usually includes:

```text
Router
Switch
Wireless access point
Wired users
Wireless users
IP phone
Printer
Server
Internet connection
```

Basic diagram:

```text
                 Internet
                    |
                 Router
                    |
                 Switch
        ____________|____________
       |            |            |
      PC         Printer       Server

              Wireless AP
                  |
          Laptop / Phone / Tablet
```

The uploaded note says a small network normally has fewer devices than a large network and usually has a single WAN connection such as DSL, cable, or Ethernet. 

---

# 2. Small Network Design

## 2.1 What is a Small Network?

A **small network** is a network with a small number of devices.

Example:

```text
Small office:
- 10 PCs
- 1 router
- 1 switch
- 1 wireless AP
- 1 printer
- 1 server
```

Even though the network is small, it still supports important business work such as:

```text
Internet access
Email
File sharing
Printing
Voice calls
Video meetings
Cloud applications
```

---

## 2.2 Why Small Network Design Matters

The goal of good small network design is to:

```text
Improve employee productivity
Reduce network downtime
Make troubleshooting easier
Improve security
Allow future growth
```

The note says good network design should enhance productivity and minimize downtime. 

Simple idea:

```text
Good network design = users can work smoothly
Bad network design = users waste time because network fails
```

---

# 3. Factors to Consider When Building a Small Network

The uploaded note lists important factors such as **cost, speed and port types, expandability, operating system features, IP addressing, reliability, redundancy, and traffic types**. 

---

## 3.1 Cost

### What it means

Cost means the money needed to buy and maintain the network.

Cost includes:

```text
Router
Switch
Wireless AP
Cables
Security features
Management features
Redundancy
Licenses
Maintenance
```

### Why we need to consider cost

A cheap device may not support important features.

Example:

```text
Cheap switch:
- Few ports
- No VLAN support
- No management features

Better switch:
- More ports
- VLAN support
- Port security
- Management features
```

### Common mistake

Buying the cheapest device without thinking about future needs.

---

## 3.2 Speed and Types of Ports

### What it means

Network devices have different port speeds and port types.

Examples:

```text
Fast Ethernet = 100 Mbps
Gigabit Ethernet = 1000 Mbps
10 Gigabit Ethernet = 10 Gbps
Copper port = RJ-45 Ethernet
Fiber port = fiber connection
```

### Why it matters

If a server is connected using a slow port, many users may experience delay.

Bad design:

```text
Many PCs ---- Switch ----100 Mbps---- Server
                         bottleneck
```

Better design:

```text
Many PCs ---- Switch ----1 Gbps---- Server
                       faster link
```

### Common mistake

Using slow ports for high-traffic devices such as servers, uplinks, or access points.

---

## 3.3 Expandability

### What it means

Expandability means the network can grow in the future.

Example:

```text
Today: 10 users
Future: 30 users + IP phones + CCTV + guest Wi-Fi
```

### Fixed device

A fixed device has fixed ports.

Example:

```text
24-port fixed switch
```

You cannot add extra modules.

### Modular device

A modular device allows extra modules.

Example:

```text
Add fiber module
Add extra ports
Add faster interfaces
```

### Common mistake

Designing only for today and not preparing for future growth.

---

## 3.4 Operating System Features and Services

Network devices have software features.

Examples:

```text
VLAN
SSH
Port security
DHCP
Routing
Firewall
QoS
Access control
```

If your network needs VLANs, the switch must support VLANs.

Example:

```text
VLAN 10 = Staff
VLAN 20 = Guest
VLAN 30 = Voice
```

Without VLAN support, you cannot separate traffic properly.

---

# 4. IP Addressing Scheme

The uploaded note recommends planning, documenting, and maintaining an IP addressing scheme based on device type. This makes troubleshooting easier. 

## 4.1 What it means

An **IP addressing scheme** is a plan for assigning IP addresses.

Example:

```text
192.168.1.1       Router gateway
192.168.1.2-10    Network devices
192.168.1.20-30   Servers
192.168.1.40-50   Printers
192.168.1.100-200 User PCs
```

## 4.2 Why we need it

Without a plan:

```text
Printer IP is unknown
Server IP is unknown
Router IP is forgotten
Troubleshooting becomes slow
```

With a plan:

```text
Devices are easier to identify
Problems are easier to troubleshoot
Documentation is cleaner
```

## 4.3 Example table

| Device Type       | IP Address Example |
| ----------------- | ------------------ |
| Router gateway    | 192.168.1.1        |
| Switch management | 192.168.1.2        |
| Wireless AP       | 192.168.1.3        |
| Server            | 192.168.1.10       |
| Printer           | 192.168.1.20       |
| PCs               | 192.168.1.100-200  |

## Common mistake

Assigning IP addresses randomly.

Bad:

```text
Printer: 192.168.1.188
Server: 192.168.1.77
Switch: 192.168.1.210
```

Better:

```text
Router: 192.168.1.1
Switch: 192.168.1.2
Server: 192.168.1.10
Printer: 192.168.1.20
PCs: 192.168.1.100-200
```

---

# 5. Reliability and Redundancy

## 5.1 Reliability

Reliability means the network can continue working properly.

The note says even small businesses rely heavily on their network, and failure can be costly. 

Example:

```text
If the router fails:
- Internet stops
- Email stops
- Cloud apps stop
- Online payment may stop
```

## 5.2 Redundancy

Redundancy means having backup devices or backup links.

Without redundancy:

```text
PCs ---- Switch ---- Router ---- Internet
                    |
              If router fails,
              internet is down
```

With redundancy:

```text
PCs ---- Switch ---- Router 1 ---- ISP 1
          |
          +-------- Router 2 ---- ISP 2
```

Examples of redundancy:

```text
Backup router
Backup switch
Backup internet line
Backup power supply
Extra cable path
```

## Common mistake

Thinking redundancy is only for large networks.

Small businesses may also need redundancy if downtime causes money loss.

---

# 6. Traffic Types in a Small Network

A network administrator must consider different traffic types.

Examples:

```text
Web browsing
Email
File sharing
Voice calls
Video meetings
Printing
Cloud backup
Database access
```

Not all traffic has the same priority.

| Traffic Type   | Delay Sensitive? | Example                   |
| -------------- | ---------------- | ------------------------- |
| Email          | No               | Small delay is okay       |
| File download  | No               | Can wait                  |
| Voice call     | Yes              | Delay causes broken audio |
| Video meeting  | Yes              | Delay causes lag          |
| Payment system | Yes              | Must be reliable          |

This connects to **QoS**, which means giving important traffic better treatment.

---

# 7. Small Network Applications and Protocols

The uploaded note says administrators commonly need remote access to network devices and servers. The two common remote access solutions are **Telnet** and **SSH**. 

---

## 7.1 Remote Access

Remote access means managing a device from another location through the network.

Example:

```text
Admin PC ----network---- Router / Switch / Server
```

Why useful?

```text
No need to physically connect console cable
Admin can configure device remotely
Saves time
```

---

## 7.2 Telnet

Telnet is used for remote command-line access.

Example:

```bash
telnet 192.168.1.1
```

Problem:

```text
Telnet is not secure.
It sends data in plain text.
Username and password can be captured.
```

Common mistake:

```text
Using Telnet because it works.
```

Better:

```text
Use SSH instead.
```

---

## 7.3 SSH

SSH means **Secure Shell**.

SSH provides secure remote access because it encrypts the connection.

Example:

```bash
ssh admin@192.168.1.1
```

Comparison:

| Feature       | Telnet | SSH |
| ------------- | ------ | --- |
| Remote access | Yes    | Yes |
| Encrypted     | No     | Yes |
| Secure        | No     | Yes |
| Recommended   | No     | Yes |

Basic Cisco SSH configuration:

```text
Router(config)# hostname R1
R1(config)# ip domain-name example.com
R1(config)# username admin secret cisco123
R1(config)# crypto key generate rsa
R1(config)# line vty 0 4
R1(config-line)# login local
R1(config-line)# transport input ssh
```

Important line:

```text
transport input ssh
```

This allows SSH only and blocks Telnet.

---

# 8. IP Telephony, Streaming Media, and Remote Work

The note says businesses increasingly use **IP telephony**, **streaming media**, and **remote work**, so administrators must ensure proper equipment and priority delivery. 

---

## 8.1 IP Telephony

IP telephony means phone calls use the IP network.

Also called:

```text
VoIP = Voice over IP
```

Example:

```text
IP Phone ---- Switch ---- Router ---- Voice provider
```

Voice traffic is sensitive to:

```text
Delay
Jitter
Packet loss
```

### Delay

Voice arrives late.

### Jitter

Voice packets arrive unevenly.

### Packet loss

Some voice packets are lost, causing broken audio.

---

## 8.2 Streaming Media

Streaming media means continuous audio or video traffic.

Examples:

```text
Video meeting
Online training
Live stream
CCTV stream
```

Streaming uses more bandwidth than email or simple browsing.

If many users stream at the same time:

```text
Network may slow down
Video may freeze
Voice may break
```

---

## 8.3 Priority Delivery

Priority delivery means important traffic is treated better.

Example:

```text
Voice call = high priority
Email = normal priority
File download = lower priority
```

Without priority:

```text
Voice + video + download + email
All treated the same
Voice may lag
```

With priority:

```text
Voice traffic gets priority
Call quality improves
```

---

## 8.4 Remote Work

Remote work means employees access company resources from outside the office.

Examples:

```text
Work from home
Work from hotel
Work from another branch
```

Remote users may need:

```text
File server
Internal system
Email
Database
Company apps
```

Remote access should be secure, usually using VPN, SSH, HTTPS, and proper authentication.

---

# 9. Planning for Network Growth

The note says to scale a network, administrators need:

```text
Network documentation
Device inventory
Budget
Traffic analysis
```



---

## 9.1 Network Documentation

Network documentation records network information.

Two important types:

```text
Physical topology
Logical topology
```

### Physical topology

Shows physical connections.

Example:

```text
Router G0/0 ---- Switch F0/1
Switch F0/2 ---- PC1
Switch F0/3 ---- Printer
```

### Logical topology

Shows logical structure.

Example:

```text
VLAN 10 = Staff
VLAN 20 = Guest
VLAN 30 = Voice
192.168.10.0/24 = Staff network
192.168.20.0/24 = Guest network
```

Why documentation matters:

```text
Troubleshooting becomes faster
New technicians understand the network
Upgrades become easier
Security management is better
```

---

## 9.2 Device Inventory

Device inventory is a list of devices in the network.

Example:

| Device   | Type        | IP Address   | Location       |
| -------- | ----------- | ------------ | -------------- |
| R1       | Router      | 192.168.1.1  | Server room    |
| SW1      | Switch      | 192.168.1.2  | Server room    |
| AP1      | Wireless AP | 192.168.1.3  | Office ceiling |
| Server1  | Server      | 192.168.1.10 | Server room    |
| Printer1 | Printer     | 192.168.1.20 | Admin office   |

Why useful:

```text
Know what devices exist
Know where devices are
Know which IP belongs to which device
Plan replacement and upgrades
```

---

## 9.3 Budget

Budget means planning money for IT needs.

Examples:

```text
New switch
Router upgrade
Firewall license
Antivirus license
Ethernet cables
Backup storage
UPS battery
Spare parts
```

Without budget:

```text
Device fails
No money to replace
Downtime becomes longer
```

---

## 9.4 Traffic Analysis

Traffic analysis means studying network traffic.

The note says administrators should understand the type of traffic and current traffic flow as the network grows. 

Traffic analysis checks:

```text
What traffic exists
How much traffic exists
When traffic is heavy
Which devices generate traffic
Which applications use bandwidth
```

Example:

```text
Problem:
Network is slow every day at 10 AM.

Traffic analysis:
Cloud backup starts at 10 AM.

Possible solution:
Move backup to night.
```

---

# 10. Traffic Flow Patterns

Traffic flow pattern means where traffic comes from and where it goes.

Example:

```text
PCs ----> Server
PCs ----> Internet
CCTV ----> Storage server
IP phones ----> Voice gateway
Wireless users ----> Internet
```

The uploaded note says traffic should be captured during **peak utilization times** and on different network segments because some traffic is local to a particular segment. 

## Peak time

Peak time means busiest time.

Example:

```text
9 AM = users start work
10 AM = video meetings
5 PM = backup traffic
```

If you only check during quiet time, you may miss the problem.

---

# 11. Troubleshooting

The note says troubleshooting is used to analyze the problem, determine the cause, implement a plan, and resolve the issue. 

## 11.1 Basic troubleshooting flow

```text
Problem reported
      |
      v
Check user device
      |
      v
Check IP configuration
      |
      v
Check local network
      |
      v
Check gateway/router
      |
      v
Check remote network/internet
      |
      v
Find cause
      |
      v
Fix problem
      |
      v
Verify again
```

Important:

```text
After fixing, always verify.
```

---

# 12. Ping

The note says `ping` uses ICMP and verifies Layer 3 connectivity. 

## 12.1 What ping does

Ping checks whether one device can reach another device.

Example:

```bash
ping 192.168.1.1
```

Meaning:

```text
Can my PC reach 192.168.1.1?
```

## 12.2 Successful ping

```text
Reply from 192.168.1.1: bytes=32 time<1ms TTL=255
```

## 12.3 Failed ping

```text
Request timed out.
```

Possible causes:

```text
Wrong IP
Destination is off
Cable problem
Switch problem
Router problem
Firewall blocking ICMP
Wrong gateway
```

## 12.4 Step-by-step ping test

If PC cannot access internet:

```bash
ping 127.0.0.1
ping own IP address
ping default gateway
ping 8.8.8.8
ping google.com
```

Interpretation:

```text
ping 8.8.8.8 works but ping google.com fails = possible DNS problem
```

---

# 13. Traceroute / Tracert

The note says traceroute is useful for troubleshooting routing loops and determining the exact next-hop router. 

## 13.1 Command

Windows:

```bash
tracert google.com
```

Cisco/Linux:

```bash
traceroute google.com
```

## 13.2 What it shows

Traceroute shows the path to a destination.

Example:

```text
PC -> Router -> ISP -> Internet router -> Server
```

## 13.3 ICMP messages

The note mentions:

```text
ICMP time exceeded
ICMP destination unreachable
```

Meaning:

| Message                      | Meaning                                       |
| ---------------------------- | --------------------------------------------- |
| ICMP time exceeded           | Router discarded packet because TTL reached 0 |
| ICMP destination unreachable | Packet could not be delivered                 |

## 13.4 TTL concept

TTL means **Time To Live**.

```text
Packet TTL = 1
Router decreases TTL to 0
Router discards packet
Router sends ICMP time exceeded
```

This helps traceroute discover each hop.

---

# 14. Network Baseline

The note says one effective troubleshooting tool is to establish a **network baseline**, created over time by measuring performance at different times and loads. 

## 14.1 What it means

A baseline records normal network performance.

Example:

| Item            | Normal |
| --------------- | -----: |
| Ping to gateway |   1 ms |
| Router CPU      |    20% |
| Bandwidth usage |    50% |
| Packet loss     |     0% |

If later:

```text
Ping = 200 ms
Router CPU = 95%
Packet loss = 10%
```

Then something is abnormal.

---

# 15. Show Commands

The note lists several useful `show` commands. 

---

## 15.1 `show running-config`

```text
R1# show running-config
```

Shows active configuration.

Use it to check:

```text
Interface IP addresses
Routing
SSH/Telnet
DHCP
Passwords
ACLs
```

---

## 15.2 `show interfaces`

```text
R1# show interfaces
```

Shows detailed interface status.

Useful output:

```text
GigabitEthernet0/0 is up, line protocol is up
```

Bad output:

```text
GigabitEthernet0/0 is administratively down
```

Fix:

```text
R1(config)# interface g0/0
R1(config-if)# no shutdown
```

---

## 15.3 `show ip interface`

```text
R1# show ip interface
```

Shows IP-related interface information.

---

## 15.4 `show arp`

```text
R1# show arp
```

Shows IPv4-to-MAC mappings.

Example:

```text
192.168.1.10 -> aabb.cc00.0100
```

---

## 15.5 `show ip route`

```text
R1# show ip route
```

Shows routing table.

Example:

```text
C 192.168.1.0/24 is directly connected
S 0.0.0.0/0 via 192.168.1.254
```

Meaning:

```text
C = connected route
S = static route
0.0.0.0/0 = default route
```

---

## 15.6 `show protocols`

```text
R1# show protocols
```

Shows Layer 3 protocol status on interfaces.

---

## 15.7 `show version`

```text
R1# show version
```

Shows:

```text
IOS version
Device model
Uptime
Memory
System image
Configuration register
```

---

# 16. PC Troubleshooting Commands

The note mentions `ipconfig`, `ipconfig /all`, `ifconfig`, and `arp -a`. 

## 16.1 Windows `ipconfig`

```bash
ipconfig
```

Shows:

```text
IP address
Subnet mask
Default gateway
```

## 16.2 Windows `ipconfig /all`

```bash
ipconfig /all
```

Shows more details:

```text
MAC address
DHCP server
DNS server
Lease time
IPv4 address
IPv6 address
Default gateway
```

## 16.3 Linux

```bash
ifconfig
```

or:

```bash
ip addr
```

## 16.4 Mac

```bash
ifconfig en0
```

## 16.5 ARP cache

```bash
arp -a
```

Shows IP-to-MAC mappings learned by the PC.

---

# 17. CDP

The note says CDP is a Cisco proprietary Layer 2 protocol used to gather information about Cisco devices sharing the same network. 

## 17.1 What CDP does

CDP helps Cisco devices discover directly connected Cisco neighbors.

Example:

```text
[R1 G0/0] -------- [SW1 F0/1]
```

R1 can discover SW1.

## 17.2 Command

```text
R1# show cdp neighbors
```

The note says this command provides:

```text
Device ID
Port ID
Device type
Platform
```

Example:

```text
Device ID    Local Intrfce    Platform    Port ID
SW1          Gig 0/0          2960        Fas 0/1
```

Meaning:

```text
R1 G0/0 connects to SW1 F0/1.
```

---

# 18. Debug and Terminal Monitor

## 18.1 Debug

The note says IOS `debug` provides valuable troubleshooting information, but commands like `debug all` or `debug ip packet` can generate a large amount of output. 

Example:

```text
R1# debug ip icmp
```

Dangerous command:

```text
R1# debug all
```

Turn off debug:

```text
R1# undebug all
```

or:

```text
R1# no debug all
```

Common mistake:

```text
Forgetting to disable debug after troubleshooting.
```

---

## 18.2 Terminal Monitor

The note says log messages are not displayed by default on VTY remote lines. To show log messages during SSH/Telnet remote access, use `terminal monitor`. 

Command:

```text
R1# terminal monitor
```

Stop it:

```text
R1# terminal no monitor
```

Use case:

```text
You SSH into router.
You run debug.
You see no messages.
Use terminal monitor.
```

---

# 19. Security Threats

The note lists several security threats: **information theft, data loss and manipulation, identity theft, and disruption of service**. 

---

## 19.1 Information Theft

Information theft means breaking into a computer to obtain confidential information.

Examples:

```text
Customer data stolen
Company files stolen
Passwords stolen
Payment details stolen
```

Impact:

```text
Privacy loss
Financial loss
Legal problems
Reputation damage
```

---

## 19.2 Data Loss and Manipulation

Data loss means data is destroyed or deleted.

Data manipulation means data is changed without permission.

Example:

Original:

```text
Amount paid: RM100
```

Changed:

```text
Amount paid: RM0
```

Manipulation is dangerous because people may trust wrong data.

---

## 19.3 Identity Theft

Identity theft means stealing personal information to pretend to be another person.

Example:

```text
Attacker steals admin password.
Attacker logs in as admin.
System thinks attacker is real admin.
```

Danger:

```text
Attacker can change router settings
Delete data
Steal files
Create backdoors
Disable security
```

---

## 19.4 Disruption of Service

Disruption of service means legitimate users cannot access services.

Examples:

```text
Users cannot access internet
Users cannot print
Users cannot access server
IP phones stop working
Website unavailable
```

---

# 20. Vulnerabilities

The note says vulnerability is the degree of weakness in a network or device. It lists three primary vulnerabilities: **technological, configuration, and security policy**. 

## 20.1 Threat vs Vulnerability vs Attack

| Term          | Meaning               | Example          |
| ------------- | --------------------- | ---------------- |
| Threat        | Something dangerous   | Attacker         |
| Vulnerability | Weakness              | Weak password    |
| Attack        | Action using weakness | Attacker logs in |

Analogy:

```text
Threat = thief
Vulnerability = unlocked door
Attack = thief enters
```

---

## 20.2 Technological Vulnerability

Weakness in hardware/software/technology.

Examples:

```text
Old firmware
Old OS
Software bug
Weak encryption
Unpatched server
```

---

## 20.3 Configuration Vulnerability

Weakness caused by bad configuration.

Examples:

```text
Default password
Telnet enabled
Unused ports active
No port security
Weak Wi-Fi password
Wrong firewall rule
```

---

## 20.4 Security Policy Vulnerability

Weakness caused by missing or weak rules.

Examples:

```text
No password policy
No backup policy
No guest Wi-Fi policy
No software installation rule
No incident reporting rule
```

---

# 21. Physical Threats

The note says physical security is also important and lists four classes of physical threats: **hardware, environmental, electrical, and maintenance threats**. 

---

## 21.1 Hardware Threats

Physical damage to:

```text
Servers
Routers
Switches
Cables
Workstations
```

Examples:

```text
Switch dropped
Router stolen
Cable cut
Server damaged
```

---

## 21.2 Environmental Threats

Caused by environmental conditions.

Examples:

```text
Too hot
Too cold
Too humid
Too dry
Dust
Water leakage
```

---

## 21.3 Electrical Threats

Power-related problems.

Examples:

```text
Voltage spike
Brownout
Power noise
Total power loss
```

Protection:

```text
UPS
Surge protector
Proper grounding
Backup power
```

---

## 21.4 Maintenance Threats

Caused by poor handling or poor maintenance.

Examples:

```text
Electrostatic discharge
No spare parts
Poor cabling
Poor labeling
Wrong cable unplugged
```

Bad labeling:

```text
Port 1: unknown
Port 2: unknown
Port 3: unknown
```

Better labeling:

```text
Port 1: Router
Port 2: Admin PC
Port 3: Printer
```

---

# 22. Network Attacks

The note covers malware, reconnaissance attacks, access attacks, and DoS/DDoS attacks. 

---

## 22.1 Malware

Malware means malicious software.

It is designed to:

```text
Damage
Disrupt
Steal
Perform unauthorized actions
```

Types:

```text
Virus
Worm
Trojan horse
```

---

## 22.2 Virus

A virus attaches itself to another program or file.

Example:

```text
Normal file + virus code = infected file
```

A virus usually spreads when the infected file is run.

---

## 22.3 Worm

A worm is standalone malware that replicates automatically.

Difference:

```text
Virus = usually needs host file
Worm = spreads by itself
```

Diagram:

```text
PC1 infected
   |
   +--> PC2 infected
   +--> PC3 infected
   +--> Server infected
```

---

## 22.4 Trojan Horse

A Trojan horse is harmful software that looks legitimate.

Examples:

```text
Fake game installer
Fake PDF
Fake antivirus
Fake update
```

It often needs user interaction.

Example:

```text
User downloads fake software
User runs it
Trojan installs
Attacker gets backdoor access
```

---

# 23. Reconnaissance Attacks

The note says reconnaissance attacks discover and map systems, services, or vulnerabilities. It mentions tools such as `nslookup`, `whois`, and ping sweep tools. 

## What it means

Reconnaissance means information gathering.

Attacker wants to know:

```text
What IP addresses exist?
What services are running?
What domain names are used?
What systems may be weak?
```

Important:

```text
Reconnaissance may not damage the network immediately,
but it helps the attacker prepare.
```

Safe learning command:

```bash
nslookup example.com
```

Only test systems you own or have permission to test.

---

# 24. Access Attacks

The note says access attacks exploit vulnerabilities in authentication services, FTP services, and web services to gain unauthorized access. 

Types listed:

```text
Password attacks
Trust exploitation
Port redirection
Man-in-the-middle
```

---

## 24.1 Password Attacks

Password attacks try to discover or steal passwords.

Examples from the note:

```text
Brute-force attacks
Trojan horse attacks
Packet sniffers
```

### Brute force

Tries many passwords.

```text
123456
password
admin
cisco123
company123
```

### Packet sniffer

Captures network traffic.

Risky if using insecure protocols:

```text
Telnet
HTTP login
Old FTP
```

---

## 24.2 Trust Exploitation

Trust exploitation means an attacker abuses trust between systems.

Example:

```text
Server trusts PC1.
Attacker compromises PC1.
Server still trusts PC1.
Attacker uses PC1 to access server.
```

---

## 24.3 Port Redirection

Port redirection means using a compromised system as a base to attack other targets.

Diagram:

```text
Attacker ----X---- Internal Server

Attacker ---> Compromised PC ---> Internal Server
```

---

## 24.4 Man-in-the-Middle

A man-in-the-middle attack happens when an attacker sits between two legitimate devices.

Normal:

```text
PC ---------------- Server
```

Attack:

```text
PC ---- Attacker ---- Server
```

Attacker may:

```text
Read data
Modify data
Steal login information
Redirect traffic
```

Encryption helps reduce this risk.

---

# 25. DoS and DDoS

The note says DoS attacks prevent authorized people from using a service by consuming system resources. DDoS is similar but comes from multiple coordinated sources. 

---

## 25.1 DoS

DoS means **Denial of Service**.

Example:

```text
Attacker sends too much traffic
Server becomes overloaded
Real users cannot access service
```

Resources consumed:

```text
Bandwidth
CPU
Memory
Connection table
Server capacity
```

---

## 25.2 DDoS

DDoS means **Distributed Denial of Service**.

Difference:

```text
DoS = one source
DDoS = many sources
```

Diagram:

```text
Source 1 ----\
Source 2 -----\
Source 3 ------> Target Server
Source 4 -----/
Source 5 ----/
```

---

## 25.3 Zombie

A zombie is an infected host controlled by an attacker.

The owner may not know.

---

## 25.4 Botnet

A botnet is a network of infected zombie devices.

```text
Zombie 1
Zombie 2
Zombie 3
Zombie 4
   |
   v
Controlled together
```

---

## 25.5 CnC

CnC means **Command and Control**.

The attacker uses CnC to control zombies.

Diagram:

```text
          Attacker
              |
              v
          CnC Server
        /     |      \
       v      v       v
   Zombie 1 Zombie 2 Zombie 3
        \     |      /
         v    v     v
        Target Server
```

---

# 26. Network Attack Mitigations

The note says to mitigate attacks, secure devices such as routers, switches, servers, and hosts first. It also covers backups, updates, AAA, VPN, ASA firewall, IPS, ESA, WSA, firewall filtering, and endpoint security. 

---

## 26.1 What Mitigation Means

Mitigation means reducing attack risk or damage.

Example:

```text
Threat: Malware
Mitigation: Antivirus, updates, backups, user training
```

---

## 26.2 Secure Devices First

Secure:

```text
Routers
Switches
Servers
Hosts
Wireless APs
Firewalls
```

Basic protections:

```text
Strong passwords
SSH only
Disable unused ports
Back up configurations
Update firmware
Use firewall rules
Use endpoint security
```

---

# 27. Backups

The note says backing up configurations and data is one of the most effective ways to protect against data loss. 

## Why backups matter

Backups help recover from:

```text
Accidental deletion
Device failure
Malware
Ransomware
Wrong configuration
Data corruption
```

Cisco commands:

```text
R1# copy running-config startup-config
```

Backup to TFTP:

```text
R1# copy running-config tftp:
```

Common mistake:

```text
Backing up files but not router/switch configurations.
```

---

# 28. Updates

Keeping systems updated helps defend against known attacks.

Update:

```text
Router firmware
Switch firmware
Server OS
PC OS
Antivirus
Applications
Firewall software
Wireless AP firmware
```

Common mistake:

```text
Thinking working device = secure device.
```

A device can work but still be vulnerable.

---

# 29. AAA

AAA stands for:

```text
Authentication
Authorization
Accounting
```

The note says AAA provides the primary framework for access control on network devices. 

## 29.1 Authentication

Question:

```text
Who are you?
```

Example:

```text
Username and password
```

## 29.2 Authorization

Question:

```text
What are you allowed to do?
```

Example:

```text
User A can view only
User B can configure
```

## 29.3 Accounting

Question:

```text
What did you do?
```

Example:

```text
Admin logged in
Admin changed interface
Admin logged out
```

Memory trick:

```text
Authentication = identity
Authorization = permission
Accounting = activity record
```

---

# 30. VPN

The note says a router can provide secure VPN services using encrypted tunnels. 

## What VPN means

VPN means **Virtual Private Network**.

It creates a secure encrypted tunnel over the internet.

Diagram:

```text
Remote user ==== encrypted VPN tunnel ==== Company network
```

Useful for:

```text
Remote workers
Branch offices
Secure access over public internet
```

---

# 31. ASA Firewall

The note says ASA firewall provides stateful firewall services. It allows internal traffic to go out and return, but blocks external traffic from initiating connections to inside hosts. 

Allowed:

```text
Inside PC ---- request ----> Internet
Inside PC <--- reply ------- Internet
```

Blocked:

```text
Attacker ---- unsolicited traffic ----X---- Inside PC
```

---

# 32. IPS

IPS means **Intrusion Prevention System**.

The note says IPS monitors incoming and outgoing traffic for malware, attack signatures, and other threats. If it recognizes a threat, it can stop it immediately. 

Firewall vs IPS:

| Tool     | Main Job                           |
| -------- | ---------------------------------- |
| Firewall | Allow/block traffic based on rules |
| IPS      | Detect and stop malicious traffic  |

---

# 33. ESA and WSA

The note mentions:

```text
ESA = Email Security Appliance
WSA = Web Security Appliance
```

## 33.1 ESA

ESA filters:

```text
Spam
Suspicious emails
Malware attachments
Phishing emails
```

## 33.2 WSA

WSA filters:

```text
Known malware sites
Suspicious websites
Dangerous URLs
```

Comparison:

| Appliance | Protects Against |
| --------- | ---------------- |
| ESA       | Email threats    |
| WSA       | Web threats      |

---

# 34. AAA Server

The note says an AAA server contains a secure database of who is authorized to access and manage network devices. 

Without AAA server:

```text
Router has local users
Switch has local users
Firewall has local users
```

With AAA server:

```text
Router  \
Switch   ---> AAA Server
Firewall/
```

Benefit:

```text
Centralized user management
Easier to remove user access
Better auditing
```

---

# 35. Firewall Filtering Types

The note lists four firewall forms:

```text
Packet filtering
Application filtering
URL filtering
Stateful packet inspection
```



---

## 35.1 Packet Filtering

Allows or blocks based on:

```text
IP address
MAC address
```

Example:

```text
Block 192.168.1.50
Allow 192.168.10.0/24
```

---

## 35.2 Application Filtering

Allows or blocks based on application type, often using port numbers.

Examples:

| Application |       Port |
| ----------- | ---------: |
| SSH         |     TCP 22 |
| Telnet      |     TCP 23 |
| HTTP        |     TCP 80 |
| HTTPS       |    TCP 443 |
| DNS         | TCP/UDP 53 |
| DHCP server |     UDP 67 |
| DHCP client |     UDP 68 |

Example:

```text
Block Telnet = block TCP port 23
Allow HTTPS = allow TCP port 443
```

---

## 35.3 URL Filtering

Allows or blocks websites based on:

```text
URL
Keyword
Category
```

Example:

```text
Block phishing website
Block malware website
Block gambling keyword
```

---

## 35.4 Stateful Packet Inspection, SPI

SPI checks whether incoming packets are legitimate responses to internal requests.

Allowed:

```text
Inside PC sends request
Firewall remembers connection
Reply comes back
Firewall allows reply
```

Blocked:

```text
Outside attacker sends unexpected packet
Firewall checks state
No internal request found
Packet blocked
```

---

# 36. Endpoint Security

The note says securing endpoint devices is challenging because it involves human nature. Policies often include antivirus software and host intrusion prevention. 

## What is an endpoint?

Examples:

```text
PC
Laptop
Phone
Tablet
Server
```

## Why endpoint security is difficult

Users may:

```text
Click phishing links
Open suspicious attachments
Use weak passwords
Install unsafe software
Use infected USB drives
Ignore updates
```

Endpoint protection examples:

```text
Antivirus
Host intrusion prevention
Personal firewall
Patch management
Disk encryption
Network access control
User training
```

---

# 37. Defense in Depth

Defense in depth means using multiple layers of protection.

```text
Layer 1: Physical security
Layer 2: Strong passwords and SSH
Layer 3: Firewall
Layer 4: IPS
Layer 5: Endpoint security
Layer 6: Backups
Layer 7: Security policy and user training
```

Why useful?

```text
If one layer fails, another layer may still protect the network.
```

---

# 38. Important Command Summary

## PC commands

| Command         | Purpose                               |
| --------------- | ------------------------------------- |
| `ipconfig`      | View basic IP configuration           |
| `ipconfig /all` | View detailed IP, DNS, DHCP, MAC info |
| `ping`          | Test connectivity                     |
| `tracert`       | Trace path on Windows                 |
| `arp -a`        | Show ARP cache                        |

## Cisco commands

| Command               | Purpose                                 |
| --------------------- | --------------------------------------- |
| `show running-config` | Show active configuration               |
| `show interfaces`     | Show interface details                  |
| `show ip interface`   | Show IP interface info                  |
| `show arp`            | Show ARP table                          |
| `show ip route`       | Show routing table                      |
| `show protocols`      | Show protocol/interface status          |
| `show version`        | Show IOS/device information             |
| `show cdp neighbors`  | Show directly connected Cisco neighbors |
| `debug`               | Show real-time troubleshooting info     |
| `undebug all`         | Turn off debugging                      |
| `terminal monitor`    | Show logs/debug during remote session   |
| `terminal no monitor` | Stop logs/debug during remote session   |

---

# 39. Common Mistakes in Chapter 13

1. Thinking small networks do not need planning.
2. Buying switches with too few ports.
3. Not planning IP addresses.
4. Not documenting topology.
5. Not keeping device inventory.
6. Using Telnet instead of SSH.
7. Not preparing for voice and video traffic.
8. Not capturing traffic during peak times.
9. Not verifying after troubleshooting.
10. Using `debug all` carelessly.
11. Forgetting to turn off debug.
12. Thinking firewall alone is enough.
13. Not backing up configurations.
14. Not updating devices.
15. Using weak passwords.
16. Ignoring endpoint security.
17. Ignoring physical threats.
18. Leaving unused switch ports active.
19. Not using UPS for important devices.
20. No written security policy.

---

# 40. Viva / Exam-style Questions and Answers

## Q1. What devices are commonly found in a small network?

Answer:

```text
Router, switch, wireless access point, PCs, printer, server, and IP phones.
```

## Q2. Why is IP addressing planning important?

Answer:

```text
It helps identify devices easily and makes troubleshooting faster.
```

## Q3. What is redundancy?

Answer:

```text
Redundancy means having backup devices or links so the network can continue working if one part fails.
```

## Q4. What is the difference between Telnet and SSH?

Answer:

```text
Telnet is not encrypted, while SSH is encrypted and secure.
```

## Q5. Why is voice traffic sensitive?

Answer:

```text
Voice traffic is sensitive to delay, jitter, and packet loss.
```

## Q6. What is traffic analysis?

Answer:

```text
Traffic analysis means studying network traffic types, flow, amount, and usage patterns.
```

## Q7. What does ping test?

Answer:

```text
Ping tests Layer 3 connectivity using ICMP.
```

## Q8. What does traceroute show?

Answer:

```text
Traceroute shows the path packets take to reach a destination.
```

## Q9. What is a network baseline?

Answer:

```text
A network baseline is a record of normal network performance used for comparison.
```

## Q10. What does `show ip route` display?

Answer:

```text
It displays the routing table.
```

## Q11. What does `arp -a` show?

Answer:

```text
It shows the ARP cache, mapping IP addresses to MAC addresses.
```

## Q12. What is CDP?

Answer:

```text
CDP is a Cisco proprietary Layer 2 protocol used to discover directly connected Cisco devices.
```

## Q13. Why should `debug all` be avoided?

Answer:

```text
It can generate too much output and may slow down or overload the device.
```

## Q14. What is information theft?

Answer:

```text
Information theft is breaking into a computer or network to obtain confidential information.
```

## Q15. What is data manipulation?

Answer:

```text
Data manipulation means changing data records without permission.
```

## Q16. What is identity theft?

Answer:

```text
Identity theft means stealing personal information to take over or pretend to be another person.
```

## Q17. What is a vulnerability?

Answer:

```text
A vulnerability is a weakness in a network or device.
```

## Q18. Name the three primary vulnerabilities.

Answer:

```text
Technological vulnerability, configuration vulnerability, and security policy vulnerability.
```

## Q19. Name four physical threat classes.

Answer:

```text
Hardware, environmental, electrical, and maintenance threats.
```

## Q20. What is malware?

Answer:

```text
Malware is malicious software designed to damage, disrupt, steal, or perform unauthorized actions.
```

## Q21. Difference between virus and worm?

Answer:

```text
A virus usually attaches to another file, while a worm can replicate automatically by itself.
```

## Q22. What is a Trojan horse?

Answer:

```text
A Trojan horse is harmful software that looks legitimate and tricks users into running it.
```

## Q23. What is reconnaissance attack?

Answer:

```text
It is the discovery and mapping of systems, services, or vulnerabilities before further attack.
```

## Q24. Name four access attacks.

Answer:

```text
Password attacks, trust exploitation, port redirection, and man-in-the-middle attacks.
```

## Q25. What is DoS?

Answer:

```text
DoS is an attack that prevents authorized users from using a service by consuming system resources.
```

## Q26. Difference between DoS and DDoS?

Answer:

```text
DoS usually comes from one source, while DDoS comes from multiple coordinated sources.
```

## Q27. What is a botnet?

Answer:

```text
A botnet is a network of infected zombie devices controlled by an attacker.
```

## Q28. What does AAA stand for?

Answer:

```text
Authentication, Authorization, and Accounting.
```

## Q29. What is VPN?

Answer:

```text
VPN is a secure encrypted tunnel used to connect remote users or sites through the internet.
```

## Q30. What is IPS?

Answer:

```text
IPS is an Intrusion Prevention System that monitors traffic and stops detected threats.
```

## Q31. What is ESA?

Answer:

```text
ESA is Email Security Appliance. It filters spam and suspicious emails.
```

## Q32. What is WSA?

Answer:

```text
WSA is Web Security Appliance. It filters suspicious or known malware websites.
```

## Q33. What is packet filtering?

Answer:

```text
Packet filtering allows or blocks traffic based on IP or MAC addresses.
```

## Q34. What is application filtering?

Answer:

```text
Application filtering allows or blocks traffic based on application types or port numbers.
```

## Q35. What is SPI?

Answer:

```text
Stateful Packet Inspection checks whether incoming packets are legitimate responses to internal requests.
```

---

# 41. Final Chapter 13 Summary

Chapter 13 teaches that a small network must be:

```text
Well planned
Properly documented
Easy to troubleshoot
Secure against threats
Protected against attacks
Ready for future growth
```

The most important ideas are:

```text
1. Small networks still need good design.
2. IP addressing should be planned and documented.
3. SSH is preferred over Telnet.
4. Voice and video traffic may need priority.
5. Troubleshooting should be systematic.
6. Ping, traceroute, show commands, CDP, debug, and terminal monitor are useful tools.
7. Security threats include theft, data loss, identity theft, and service disruption.
8. Vulnerabilities can be technological, configuration-based, or policy-based.
9. Attacks include malware, reconnaissance, access attacks, MITM, DoS, and DDoS.
10. Mitigation includes backups, updates, AAA, VPN, firewall, IPS, ESA, WSA, and endpoint security.
```

Chapter 13 is complete.
