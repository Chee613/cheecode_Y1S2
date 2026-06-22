# Chapter 8: Switching Concept

## 1. Introduction to Switching

A **switch** is a Layer 2 network device that connects devices inside a LAN.

Example:

```text
PC1 ─┐
PC2 ─┼── Switch ─── Router ─── Internet
PC3 ─┘
```

A switch mainly uses **MAC addresses** to forward Ethernet frames.

Simple memory:

```text
Switch = Layer 2 = MAC address
Router = Layer 3 = IP address
```

---

# 2. Network Design Layers

The chapter introduces three main network layers:

```text
Core Layer
   ↑
Distribution Layer
   ↑
Access Layer
```

---

## 2.1 Access Layer

### What it means

The **Access Layer** is the network edge where end devices connect.

Examples:

```text
PC
Laptop
Printer
IP phone
Wireless access point
```

Diagram:

```text
PC1 ─┐
PC2 ─┼── Access Switch
PC3 ─┘
```

### Why we need it

It gives users access to the network.

### Common mistake

Do not think access layer means Wi-Fi only.
It can be wired or wireless.

### Viva question

**Q: What is the main function of the access layer?**
A: To provide network access to end devices.

---

## 2.2 Distribution Layer

### What it means

The **Distribution Layer** connects access switches to the core layer.

Diagram:

```text
Access Switch 1 ─┐
Access Switch 2 ─┼── Distribution Switch ─── Core Layer
Access Switch 3 ─┘
```

### Why we need it

It collects traffic from many access switches and provides high availability through redundancy.

### Viva question

**Q: What does the distribution layer connect?**
A: It connects the access layer to the core layer.

---

## 2.3 Core Layer

### What it means

The **Core Layer** is the network backbone.

Diagram:

```text
Building A ─┐
Building B ─┼── Core Layer ─── Internet / Data Center
Building C ─┘
```

### Why we need it

It connects major parts of the campus or organization network quickly and reliably.

### Viva question

**Q: What is the core layer?**
A: The network backbone.

---

# 3. Ingress and Egress

## 3.1 Ingress

**Ingress** means the port where a frame enters the switch.

Example:

```text
PC1 ─── Port Fa0/1 [Switch]
```

If the frame enters through Fa0/1:

```text
Ingress port = Fa0/1
```

---

## 3.2 Egress

**Egress** means the port where a frame leaves the switch.

Example:

```text
PC1 ─ Fa0/1 [Switch] Fa0/2 ─ PC2
```

If PC1 sends to PC2:

```text
Ingress = Fa0/1
Egress  = Fa0/2
```

Simple memory:

```text
Ingress = entering
Egress = exiting
```

---

# 4. MAC Address Table / CAM Table

A switch has a **MAC address table**.

It stores:

```text
MAC address → switch port
```

Example:

```text
MAC Address        Port
AAAA.BBBB.CCCC     Fa0/1
DDDD.EEEE.FFFF     Fa0/2
1111.2222.3333     Fa0/3
```

Meaning:

```text
AAAA.BBBB.CCCC is reachable through Fa0/1
DDDD.EEEE.FFFF is reachable through Fa0/2
1111.2222.3333 is reachable through Fa0/3
```

The MAC address table is stored in **CAM**, which is special memory used for fast searching.

---

# 5. How a Switch Learns and Forwards Frames

A switch does two main things:

```text
1. Learn
2. Forward
```

---

## 5.1 Learn: Source MAC Address

The switch learns from the **source MAC address**.

Example frame:

```text
Source MAC: AA
Destination MAC: BB
Ingress port: Fa0/1
```

The switch learns:

```text
AA is on Fa0/1
```

MAC table becomes:

```text
MAC Address        Port
AA                 Fa0/1
```

---

## 5.2 Forward: Destination MAC Address

The switch forwards based on the **destination MAC address**.

Important rule:

```text
Switch learns from source MAC.
Switch forwards using destination MAC.
```

---

## 5.3 Known Unicast

If the destination MAC is in the table, the switch forwards only to the correct port.

Example:

```text
MAC Address        Port
AA                 Fa0/1
BB                 Fa0/2
```

Frame:

```text
Source: AA
Destination: BB
```

Action:

```text
Send only to Fa0/2
```

---

## 5.4 Unknown Unicast

If the destination MAC is not in the table, the switch floods the frame.

```text
Unknown destination MAC
→ flood out all ports except incoming port
```

Example:

```text
Frame enters Fa0/1
Destination MAC unknown
```

Action:

```text
Send out Fa0/2, Fa0/3, Fa0/4...
Do not send back out Fa0/1
```

---

## 5.5 Broadcast and Multicast

Broadcast MAC address:

```text
FF:FF:FF:FF:FF:FF
```

Broadcast frames are flooded out all ports except the incoming port.

Example:

```text
ARP Request = broadcast
DHCP Discover = broadcast
```

---

# 6. Switch Types

The chapter explains three switch configuration types:

```text
1. Fixed configuration switch
2. Modular configuration switch
3. Stackable configuration switch
```

---

## 6.1 Fixed Configuration Switch

A **fixed configuration switch** has a fixed number of ports and features.

Example:

```text
24-port switch
48-port switch
```

You usually cannot add extra modules later.

### Good for

```text
Small office
Computer lab
Access layer
```

### Viva question

**Q: What is a fixed configuration switch?**
A: A switch with fixed ports and features that cannot be expanded with extra modules.

---

## 6.2 Modular Configuration Switch

A **modular switch** has a chassis where modules or line cards can be added.

Diagram:

```text
[ Modular Switch Chassis ]

Slot 1: 48-port copper module
Slot 2: fiber module
Slot 3: empty
```

### Good for

```text
Large campus networks
Enterprise networks
Distribution layer
Core layer
```

### Viva question

**Q: Why use a modular switch?**
A: For flexibility and expansion.

---

## 6.3 Stackable Configuration Switch

A **stackable switch** can connect with other stackable switches using special stacking cables.

Diagram:

```text
Switch 1
   ||
Switch 2
   ||
Switch 3
```

Logically, they work like:

```text
One large switch
```

### Benefits

```text
More ports
Single management IP
Better bandwidth
Fault tolerance
Easier management
```

---

## 6.4 Stack Master

In a switch stack, one switch becomes the **stack master**.

The stack master controls the stack.

If the master fails, another switch can become the new master.

---

## 6.5 Stack Member Number

Each switch in the stack has a member number.

Example:

```text
GigabitEthernet1/0/1
GigabitEthernet2/0/1
GigabitEthernet3/0/1
```

Meaning:

```text
1 = stack member 1
2 = stack member 2
3 = stack member 3
```

---

# 7. Switching Domains

## 7.1 Half-Duplex

Half-duplex means:

```text
Send OR receive
```

Example:

```text
Walkie-talkie
```

Only one side sends at a time.

Collisions can happen in half-duplex.

---

## 7.2 Full-Duplex

Full-duplex means:

```text
Send AND receive at the same time
```

Example:

```text
Phone call
```

Modern switch ports usually use full-duplex.

In full-duplex switch ports, collisions are not expected.

---

## 7.3 Collision Domain

A **collision domain** is an area where collisions can happen.

With a hub:

```text
PC1 ─┐
PC2 ─┼── Hub
PC3 ─┘
```

All devices share one collision domain.

With a switch:

```text
PC1 ─ Fa0/1 [Switch]
PC2 ─ Fa0/2 [Switch]
PC3 ─ Fa0/3 [Switch]
```

Each port is separated.
With full-duplex, collision problems are removed.

---

## 7.4 Broadcast Domain

A **broadcast domain** is an area where broadcast frames can reach.

Example:

```text
PC1 ─┐
PC2 ─┼── Switch 1 ─── Switch 2 ─┬── PC3
PC4 ─┘                          └── PC5
```

If all devices are in the same VLAN, they are in one broadcast domain.

Broadcast example:

```text
ARP Request
DHCP Discover
```

A router normally separates broadcast domains.

```text
LAN 1 ── Router ── LAN 2
```

---

## 7.5 Collision Domain vs Broadcast Domain

| Topic      | Collision Domain                 | Broadcast Domain                |
| ---------- | -------------------------------- | ------------------------------- |
| Meaning    | Area where collisions can happen | Area where broadcasts can reach |
| Related to | Half-duplex/shared media         | Broadcast frames                |
| Reduced by | Switch full-duplex               | Router or VLAN                  |
| Example    | Hub network                      | ARP broadcast area              |

Simple memory:

```text
Collision domain = who can collide?
Broadcast domain = who can hear broadcast?
```

---

# 8. Switch Characteristics

The chapter lists four major switch characteristics:

```text
1. Fast port speeds
2. Fast internal switching
3. Large frame buffers
4. High port density
```

---

## 8.1 Fast Port Speeds

Port speed means how fast data can enter or leave a switch port.

Examples:

```text
100 Mbps
1 Gbps
10 Gbps
40 Gbps
100 Gbps
```

Layer speed idea:

```text
Access layer: 100 Mbps / 1 Gbps
Distribution layer: 1 Gbps / 10 Gbps
Core layer: 10 Gbps / 40 Gbps / 100 Gbps
```

### Formula

```text
1 Gbps = 1000 Mbps
1 Byte = 8 bits
MB/s = Mbps ÷ 8
```

Example:

```text
100 Mbps ÷ 8 = 12.5 MB/s
```

---

## 8.2 Fast Internal Switching

Fast internal switching means the switch can move frames quickly inside itself.

Diagram:

```text
Ingress port → internal switching → egress port
```

If internal switching is slow, the switch becomes a bottleneck.

---

## 8.3 Large Frame Buffers

A **frame buffer** is temporary memory inside the switch.

It stores frames before forwarding.

Example:

```text
1 Gbps input → [Buffer] → 100 Mbps output
```

Why needed?

Because traffic may enter faster than it can leave.

If buffer is full:

```text
Frames may be dropped
```

---

## 8.4 High Port Density

Port density means how many ports a switch has.

Examples:

```text
8-port switch
24-port switch
48-port switch
96-port switch
```

High port density reduces the number of switches needed.

Example:

```text
Need 96 ports
```

Using 24-port switches:

```text
96 ÷ 24 = 4 switches
```

Using 48-port switches:

```text
96 ÷ 48 = 2 switches
```

So two 48-port switches may be cheaper and easier to manage than four 24-port switches.

---

# 9. Switch Boot Process

When a switch powers on, it follows this boot process:

```text
1. POST
2. Boot loader
3. Load IOS from flash
4. Load startup-config from NVRAM
```

---

## 9.1 POST

POST means:

```text
Power-On Self-Test
```

POST checks hardware such as:

```text
CPU
DRAM
Flash file system area
```

Purpose:

```text
Make sure hardware is working before booting
```

---

## 9.2 Boot Loader

The **boot loader** is a small program stored in ROM.

It runs after POST.

Purpose:

```text
Prepare system
Initialize flash file system
Find IOS
Load IOS into memory
```

---

## 9.3 IOS

Cisco IOS means:

```text
Internetwork Operating System
```

It is the operating system of the switch.

Stored in:

```text
Flash
```

---

## 9.4 Startup Configuration

After IOS loads, it reads the startup configuration.

Startup-config is stored in:

```text
NVRAM
```

Important comparison:

| Configuration  | Stored in | Meaning                                |
| -------------- | --------- | -------------------------------------- |
| running-config | RAM       | Current active configuration           |
| startup-config | NVRAM     | Saved configuration loaded during boot |

Save command:

```text
copy running-config startup-config
```

Short form:

```text
copy run start
```

---

# 10. Switch LED Indicators

Switches have several LEDs.

| LED             | Meaning                    |
| --------------- | -------------------------- |
| System LED      | Overall switch health      |
| RPS LED         | Redundant Power System     |
| Port Status LED | Link/activity status       |
| Port Duplex LED | Half/full duplex           |
| Port Speed LED  | Port speed                 |
| PoE LED         | Power over Ethernet status |

---

## 10.1 System LED

| System LED | Meaning                         |
| ---------- | ------------------------------- |
| Off        | System is off                   |
| Green      | System operating normally       |
| Amber      | System not functioning properly |

---

## 10.2 PoE

PoE means:

```text
Power over Ethernet
```

It allows Ethernet cable to carry:

```text
Data + Power
```

Devices that may use PoE:

```text
IP phone
Wireless access point
IP camera
```

---

# 11. Accessing Boot Loader

Boot loader prompt:

```text
switch:
```

General steps:

```text
1. Connect PC using console cable
2. Open terminal software
3. Unplug switch power
4. Reconnect power
5. Hold Mode button while System LED flashes
6. Release when LED changes
7. switch: prompt appears
```

Used for:

```text
Password recovery
IOS recovery
Low-level troubleshooting
```

---

# 12. Switch Remote Management

A switch can be managed by:

```text
1. Console access
2. Remote access
```

For remote management, the switch needs:

```text
IP address
Subnet mask
Default gateway
```

Important:

```text
A switch does not need IP address for basic switching.
A switch needs IP address for remote management.
```

---

# 13. SVI: Switch Virtual Interface

SVI means:

```text
Switch Virtual Interface
```

It is a logical VLAN interface used for management.

Example:

```text
interface vlan 1
```

or:

```text
interface vlan 99
```

---

## 13.1 VLAN 1

By default, switch management is usually through:

```text
VLAN 1
```

But for security, it is better to use another VLAN such as:

```text
VLAN 99
```

---

## 13.2 IPv4 Management Configuration

Example:

```text
Management VLAN: 99
Switch IP: 192.168.99.2
Subnet mask: 255.255.255.0
Default gateway: 192.168.99.1
```

Commands:

```text
Switch> enable
Switch# configure terminal

Switch(config)# vlan 99
Switch(config-vlan)# name MANAGEMENT
Switch(config-vlan)# exit

Switch(config)# interface vlan 99
Switch(config-if)# ip address 192.168.99.2 255.255.255.0
Switch(config-if)# no shutdown
Switch(config-if)# exit

Switch(config)# ip default-gateway 192.168.99.1
Switch(config)# exit

Switch# copy running-config startup-config
```

Verify:

```text
show ip interface brief
show running-config
ping 192.168.99.1
```

---

## 13.3 IPv6 on Cisco 2960

To support IPv6 on some Cisco 2960 switches:

```text
sdm prefer dual-ipv4-and-ipv6 default
reload
```

Meaning:

```text
Change SDM template
Reload switch
IPv6 support becomes active
```

---

# 14. Duplex, Speed, and Auto-MDIX

## 14.1 Duplex

Duplex means whether a device can send and receive at the same time.

```text
Half-duplex = send OR receive
Full-duplex = send AND receive
```

Cisco duplex options:

```text
duplex auto
duplex full
duplex half
```

Example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# duplex full
```

---

## 14.2 Speed

Speed means port data rate.

Examples:

```text
10 Mbps
100 Mbps
1000 Mbps
```

Cisco speed command:

```text
speed 100
speed auto
```

Example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# speed 100
```

---

## 14.3 Auto-Negotiation

Auto-negotiation lets connected devices automatically choose:

```text
Best common speed
Best common duplex
```

Example:

```text
speed auto
duplex auto
```

---

## 14.4 Duplex Mismatch

A duplex mismatch happens when connected devices use different duplex settings.

Example:

```text
PC: half-duplex
Switch: full-duplex
```

Problems:

```text
Slow network
Errors
Collisions
Poor performance
```

---

## 14.5 Auto-MDIX

Auto-MDIX automatically detects the required cable connection type.

Command:

```text
mdix auto
```

It helps with straight-through and crossover cable issues.

Simple memory:

```text
Auto-negotiation = speed and duplex
Auto-MDIX = cable type detection
```

---

# 15. SSH and Telnet

## 15.1 Telnet

Telnet is an old remote management protocol.

Port:

```text
TCP 23
```

Problem:

```text
Telnet sends username, password, and data in plaintext.
```

So Telnet is insecure.

---

## 15.2 SSH

SSH means:

```text
Secure Shell
```

Port:

```text
TCP 22
```

SSH encrypts:

```text
Username
Password
Commands
Data
```

Simple memory:

```text
Telnet = TCP 23 = plaintext = insecure
SSH = TCP 22 = encrypted = secure
```

---

## 15.3 SSH Configuration Steps

Main steps:

```text
1. Configure hostname
2. Configure domain name
3. Create username/password
4. Generate RSA keys
5. Enable SSH version 2
6. Configure VTY lines
7. Allow SSH only
```

Example:

```text
Switch> enable
Switch# configure terminal

Switch(config)# hostname S1
S1(config)# ip domain-name ccna-lab.com
S1(config)# username admin secret cisco123

S1(config)# crypto key generate rsa
How many bits in the modulus [512]: 1024

S1(config)# ip ssh version 2

S1(config)# line vty 0 15
S1(config-line)# login local
S1(config-line)# transport input ssh
S1(config-line)# exit

S1(config)# exit
S1# copy running-config startup-config
```

Verify:

```text
show ip ssh
show running-config
```

Test from PC:

```text
ssh admin@192.168.99.2
```

or:

```text
ssh -l admin 192.168.99.2
```

---

# 16. MAC Flooding Attack

A **MAC flooding attack** happens when an attacker sends many fake source MAC addresses to a switch.

Goal:

```text
Fill the MAC address table
```

Normal MAC table:

```text
MAC Address        Port
PC1                Fa0/1
PC2                Fa0/2
PC3                Fa0/3
```

Attack:

```text
Fake001 → Fa0/4
Fake002 → Fa0/4
Fake003 → Fa0/4
Fake004 → Fa0/4
...
```

When the MAC table becomes full:

```text
Switch treats many frames as unknown unicast
Switch floods more traffic
Attacker may capture frames
```

Simple memory:

```text
MAC flooding attack:
fake MACs → MAC table full → unknown unicast flooding → attacker may capture traffic
```

Defense:

```text
Port security
```

---

# 17. Port Security

Port security limits the number of valid MAC addresses allowed on a switch port.

Example:

```text
Fa0/1 maximum MAC addresses = 1
```

If another MAC appears:

```text
Security violation
```

---

## 17.1 Basic Port Security Configuration

```text
Switch> enable
Switch# configure terminal

Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport port-security
Switch(config-if)# switchport port-security maximum 1
Switch(config-if)# no shutdown

Switch(config-if)# end
Switch# copy running-config startup-config
```

---

# 18. Secure MAC Address Types

There are three types:

```text
1. Static secure MAC
2. Dynamic secure MAC
3. Sticky secure MAC
```

---

## 18.1 Static Secure MAC

Manually configured by administrator.

Example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport port-security
Switch(config-if)# switchport port-security maximum 1
Switch(config-if)# switchport port-security mac-address aaaa.bbbb.cccc
```

Memory:

```text
Static = admin types the MAC
```

---

## 18.2 Dynamic Secure MAC

Automatically learned by switch.

No manual MAC address is typed.

Example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport port-security
Switch(config-if)# switchport port-security maximum 1
```

Important:

```text
Dynamic secure MAC is removed after switch restart.
```

Memory:

```text
Dynamic = switch learns it but forgets after restart
```

---

## 18.3 Sticky Secure MAC

The switch learns the MAC address automatically and adds it to the running configuration.

Example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport port-security
Switch(config-if)# switchport port-security maximum 1
Switch(config-if)# switchport port-security mac-address sticky
```

Important:

```text
copy running-config startup-config
```

is needed to save it after reboot.

Memory:

```text
Sticky = switch learns it and sticks it into config
```

---

## 18.4 Comparison Table

| Type    | How MAC is added                     | After restart?        | Memory             |
| ------- | ------------------------------------ | --------------------- | ------------------ |
| Static  | Admin manually types it              | Stays if config saved | I type it          |
| Dynamic | Switch learns it                     | Removed after restart | Learns and forgets |
| Sticky  | Switch learns/adds to running-config | Stays if saved        | Learns and sticks  |

---

# 19. Port Security Verification Commands

Show summary:

```text
show port-security
```

Show one interface:

```text
show port-security interface fa0/1
```

Show secure MAC addresses:

```text
show port-security address
```

Example output concept:

```text
Port Security              : Enabled
Port Status                : Secure-up
Violation Mode             : Shutdown
Maximum MAC Addresses      : 1
Total MAC Addresses        : 1
Sticky MAC Addresses       : 1
Security Violation Count   : 0
```

---

# 20. Port Security Violation Modes

There are three violation modes:

```text
1. Protect
2. Restrict
3. Shutdown
```

---

## 20.1 Protect Mode

Protect mode:

```text
Drops unknown MAC traffic
No notification
Port stays up
```

Command:

```text
switchport port-security violation protect
```

Memory:

```text
Protect = drop silently
```

---

## 20.2 Restrict Mode

Restrict mode:

```text
Drops unknown MAC traffic
Gives notification
Port stays up
```

Command:

```text
switchport port-security violation restrict
```

Memory:

```text
Restrict = drop + notify
```

---

## 20.3 Shutdown Mode

Shutdown mode:

```text
Drops unknown MAC traffic
Gives notification
Port becomes error-disabled
```

It is the default mode.

Command:

```text
switchport port-security violation shutdown
```

Memory:

```text
Shutdown = drop + notify + disable port
```

---

## 20.4 Violation Mode Comparison

| Violation mode | Drops traffic? | Notification? | Shuts port? |
| -------------- | -------------: | ------------: | ----------: |
| Protect        |            Yes |            No |          No |
| Restrict       |            Yes |           Yes |          No |
| Shutdown       |            Yes |           Yes |         Yes |

Important memory:

```text
Protect  = drop only
Restrict = drop + notify
Shutdown = drop + notify + disable port
```

---

## 20.5 Recover Error-Disabled Port

If shutdown mode disables a port:

```text
Switch(config)# interface fa0/1
Switch(config-if)# shutdown
Switch(config-if)# no shutdown
```

But first:

```text
Remove the unauthorized device
```

---

# 21. Port Security Aging

Port security aging automatically removes secure MAC addresses after a timer condition.

Why useful?

```text
Old PC removed
New PC connected
Old MAC still remembered
Aging can remove old secure MAC automatically
```

---

## 21.1 Absolute Aging

Absolute aging removes secure MAC addresses after the specified time, no matter whether the device is active or inactive.

Memory:

```text
Absolute = remove after time
```

Example:

```text
Aging time = 10 minutes
Aging type = absolute
```

After 10 minutes:

```text
Secure MAC removed
```

Command:

```text
switchport port-security aging time 10
switchport port-security aging type absolute
```

---

## 21.2 Inactivity Aging

Inactivity aging removes secure MAC addresses only if there is no traffic for the specified time.

Memory:

```text
Inactivity = remove after silence
```

Example:

```text
Aging time = 10 minutes
Aging type = inactivity
```

If device is silent for 10 minutes:

```text
Secure MAC removed
```

Command:

```text
switchport port-security aging time 10
switchport port-security aging type inactivity
```

---

## 21.3 Absolute vs Inactivity

| Aging type | When MAC is removed                 | Simple memory          |
| ---------- | ----------------------------------- | ---------------------- |
| Absolute   | After specified time                | Timer ends, remove     |
| Inactivity | After no traffic for specified time | Quiet too long, remove |

---

# 22. Full Port Security Example

Scenario:

```text
Port: Fa0/1
Mode: access
Maximum MAC: 1
MAC type: sticky
Violation mode: restrict
Aging time: 10 minutes
Aging type: inactivity
```

Commands:

```text
Switch> enable
Switch# configure terminal

Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport port-security
Switch(config-if)# switchport port-security maximum 1
Switch(config-if)# switchport port-security mac-address sticky
Switch(config-if)# switchport port-security violation restrict
Switch(config-if)# switchport port-security aging time 10
Switch(config-if)# switchport port-security aging type inactivity
Switch(config-if)# no shutdown

Switch(config-if)# end
Switch# copy running-config startup-config
```

Verify:

```text
show port-security interface fa0/1
show port-security address
show running-config
```

---

# 23. Common Mistakes

## Mistake 1: Thinking switch learns from destination MAC

Wrong.

```text
Switch learns from source MAC.
Switch forwards using destination MAC.
```

---

## Mistake 2: Confusing ingress and egress

```text
Ingress = enters switch
Egress = exits switch
```

---

## Mistake 3: Thinking switches stop broadcasts automatically

Basic switches flood broadcasts inside the same VLAN.

---

## Mistake 4: Forgetting to save configuration

Always save:

```text
copy running-config startup-config
```

---

## Mistake 5: Thinking Telnet is secure

Telnet uses plaintext.
SSH is secure.

---

## Mistake 6: Forgetting `login local` for SSH

VTY lines need:

```text
login local
transport input ssh
```

---

## Mistake 7: Forgetting access mode before port security

Use:

```text
switchport mode access
```

---

## Mistake 8: Forgetting sticky MAC must be saved

Use:

```text
copy running-config startup-config
```

---

## Mistake 9: Confusing violation modes

```text
Protect = drop only
Restrict = drop + notify
Shutdown = drop + notify + disable
```

---

## Mistake 10: Confusing aging and violation mode

```text
Aging = cleanup timer
Violation mode = action when rule is broken
```

---

# 24. Important Commands Summary

## Switch management IP

```text
interface vlan 99
ip address 192.168.99.2 255.255.255.0
no shutdown
exit
ip default-gateway 192.168.99.1
```

---

## Save configuration

```text
copy running-config startup-config
```

---

## Check interfaces

```text
show ip interface brief
show interfaces status
show running-config
```

---

## Speed and duplex

```text
interface fa0/1
speed 100
duplex full
```

Auto:

```text
speed auto
duplex auto
mdix auto
```

---

## SSH

```text
hostname S1
ip domain-name ccna-lab.com
username admin secret cisco123
crypto key generate rsa
ip ssh version 2
line vty 0 15
login local
transport input ssh
```

Verify:

```text
show ip ssh
```

---

## Port security

```text
interface fa0/1
switchport mode access
switchport port-security
switchport port-security maximum 1
switchport port-security mac-address sticky
switchport port-security violation shutdown
```

Verify:

```text
show port-security
show port-security interface fa0/1
show port-security address
```

---

## Port security aging

```text
switchport port-security aging time 10
switchport port-security aging type absolute
```

or:

```text
switchport port-security aging type inactivity
```

---

# 25. Viva / Exam Questions

## Q1. What does a switch use to forward frames?

A switch forwards Ethernet frames using the destination MAC address and MAC address table.

---

## Q2. Which MAC address does a switch learn from?

The source MAC address.

---

## Q3. What happens if the destination MAC address is unknown?

The switch floods the frame out all ports except the incoming port.

---

## Q4. What is CAM?

CAM is Content Addressable Memory, used for fast MAC address table searching.

---

## Q5. What is the difference between ingress and egress?

Ingress is where the frame enters the switch.
Egress is where the frame leaves the switch.

---

## Q6. What is a stackable switch?

A switch that can connect with other stackable switches and operate as one larger switch.

---

## Q7. What is a collision domain?

A network area where collisions can happen.

---

## Q8. What is a broadcast domain?

A group of devices that receive the same broadcast frames.

---

## Q9. What is the switch boot order?

```text
POST → Boot loader → IOS from flash → startup-config from NVRAM
```

---

## Q10. Why does a switch need a management IP?

For remote management, such as SSH access.

---

## Q11. What is an SVI?

A Switch Virtual Interface, used to assign a management IP to the switch.

---

## Q12. Why is SSH better than Telnet?

SSH encrypts data.
Telnet sends data in plaintext.

---

## Q13. What port does SSH use?

TCP port 22.

---

## Q14. What port does Telnet use?

TCP port 23.

---

## Q15. What is MAC flooding?

An attack where fake source MAC addresses fill the switch MAC address table.

---

## Q16. What feature helps defend against MAC flooding?

Port security.

---

## Q17. What are the three secure MAC address types?

```text
Static
Dynamic
Sticky
```

---

## Q18. What is sticky secure MAC?

A MAC address learned dynamically and added to the running configuration.

---

## Q19. What are the three violation modes?

```text
Protect
Restrict
Shutdown
```

---

## Q20. What is the default violation mode?

Shutdown.

---

## Q21. What is absolute aging?

Secure MAC addresses are removed after the specified time.

---

## Q22. What is inactivity aging?

Secure MAC addresses are removed only after no traffic for the specified time.

---

# 26. Final Chapter 8 Memory Sheet

```text
Switch = Layer 2 device
Switch uses MAC addresses
Switch learns from source MAC
Switch forwards using destination MAC
Unknown unicast = flood
Broadcast = flood
```

```text
Ingress = frame enters
Egress = frame exits
CAM = fast MAC table memory
```

```text
Access = users connect
Distribution = connects access to core
Core = backbone
```

```text
Fixed = fixed ports
Modular = can add modules
Stackable = many switches act as one
```

```text
Half-duplex = send OR receive
Full-duplex = send AND receive
Collision domain = where collisions happen
Broadcast domain = where broadcasts reach
```

```text
Switch boot:
POST → Boot loader → IOS → startup-config
```

```text
Telnet = TCP 23 = plaintext = insecure
SSH = TCP 22 = encrypted = secure
```

```text
MAC flooding:
fake MACs → MAC table full → flooding → attacker may capture traffic
```

```text
Port security:
limits MAC addresses on a port
```

```text
Static = admin types MAC
Dynamic = switch learns MAC but forgets after restart
Sticky = switch learns MAC and adds to running-config
```

```text
Protect = drop only
Restrict = drop + notify
Shutdown = drop + notify + disable port
```

```text
Absolute aging = remove after time
Inactivity aging = remove after no traffic
```

Chapter 8 is complete.
