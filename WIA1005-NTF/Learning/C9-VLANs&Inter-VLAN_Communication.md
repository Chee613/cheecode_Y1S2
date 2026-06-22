# Chapter 9: VLANs and Inter-VLAN Communication

# 1. VLAN Introduction

## 1.1 What is VLAN?

**VLAN** stands for:

```text
Virtual Local Area Network
```

A VLAN is used to divide one physical switched network into multiple logical networks.

Important idea:

```text
One physical switch
↓
Many logical networks
```

Example:

```text
VLAN 10 = HR
VLAN 20 = Finance
VLAN 30 = IT
```

Even if all devices are connected to the same switch, VLANs can separate them logically.

---

## 1.2 Why VLAN is needed

Without VLANs, all devices may be in one big broadcast domain.

Problem:

```text
Too much broadcast traffic
Lower performance
Weak separation
Harder management
```

With VLANs:

```text
Broadcast traffic is separated
Users can be grouped by department or function
Security and management become easier
```

The uploaded notes state that VLANs provide segmentation and organizational flexibility, and can segment networks based on function, project team, or application rather than physical location. 

---

## 1.3 VLAN Benefits

Main benefits:

| Benefit                               | Meaning                                           |
| ------------------------------------- | ------------------------------------------------- |
| Security                              | Sensitive groups can be separated                 |
| Cost reduction                        | Uses existing switches and links more efficiently |
| Better performance                    | Reduces unnecessary broadcast traffic             |
| Smaller broadcast domains             | Each VLAN is its own broadcast domain             |
| Easier management                     | Users with similar needs can be grouped           |
| Easier project/application management | Special groups can be separated logically         |

Important exam sentence:

```text
A VLAN improves performance by dividing a large broadcast domain into smaller broadcast domains.
```

---

# 2. Types of VLAN

The notes list several VLAN types: **Data VLAN, Default VLAN, Native VLAN, Management VLAN, and Voice VLAN**. 

---

## 2.1 Data VLAN

A **Data VLAN** carries normal user-generated traffic.

Examples:

```text
Web browsing
Email
File sharing
Printer access
Application traffic
```

Example:

```text
VLAN 10 = Students
VLAN 20 = Staff
VLAN 30 = Admin
```

These are data VLANs because they carry normal user data.

---

## 2.2 Default VLAN

On Cisco switches:

```text
Default VLAN = VLAN 1
```

When a Cisco switch first boots with default configuration, all switch ports belong to VLAN 1.

Important facts:

```text
VLAN 1 is the default VLAN.
VLAN 1 cannot be deleted.
VLAN 1 cannot be renamed.
```

Common mistake:

```text
Thinking VLAN 1 is always safe to use.
```

In real networks, we usually avoid using VLAN 1 for important user or management traffic.

---

## 2.3 Native VLAN

The **Native VLAN** handles untagged traffic on an 802.1Q trunk link.

Default native VLAN:

```text
VLAN 1
```

Example:

```text
Native VLAN = VLAN 99
```

If untagged traffic enters the trunk, the switch treats it as VLAN 99 traffic.

Important:

```text
Native VLAN must match on both ends of a trunk.
```

Bad example:

```text
Switch 1 native VLAN = 99
Switch 2 native VLAN = 1
```

This is a native VLAN mismatch.

---

## 2.4 Management VLAN

A **Management VLAN** is used for managing network devices.

Management traffic includes:

```text
SSH
Telnet
HTTPS
HTTP
SNMP
```

Example:

```text
VLAN 99 = Management VLAN
Switch management IP = 192.168.99.2
```

Command example:

```text
Switch(config)# vlan 99
Switch(config-vlan)# name MANAGEMENT

Switch(config)# interface vlan 99
Switch(config-if)# ip address 192.168.99.2 255.255.255.0
Switch(config-if)# no shutdown
```

---

## 2.5 Voice VLAN

A **Voice VLAN** carries VoIP traffic.

VoIP means:

```text
Voice over IP
```

Voice traffic needs:

```text
Low delay
Low jitter
Enough bandwidth
High priority
```

The notes mention that voice VLANs support VoIP traffic and should provide priority and delay less than 150 ms across the network. 

Example:

```text
Data VLAN 10 = PC traffic
Voice VLAN 20 = IP phone traffic
```

Command example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10
Switch(config-if)# switchport voice vlan 20
```

---

# 3. Access Port and Trunk Port

## 3.1 Access Port

An access port carries traffic for **one VLAN only**.

Usually connects to:

```text
PC
Printer
Laptop
Normal end device
```

Example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10
```

Meaning:

```text
Fa0/1 belongs to VLAN 10.
```

---

## 3.2 Trunk Port

A trunk port carries traffic for **multiple VLANs**.

Usually connects:

```text
Switch to switch
Switch to router
Switch to multilayer switch
```

Example:

```text
Switch(config)# interface fa0/24
Switch(config-if)# switchport mode trunk
```

Meaning:

```text
Fa0/24 can carry many VLANs.
```

---

## 3.3 Why trunking is needed

Suppose two switches both have VLAN 10, VLAN 20, and VLAN 30.

Without trunking, we may need one cable for each VLAN.

With trunking:

```text
One trunk link carries many VLANs.
```

The uploaded notes define a VLAN trunk as a point-to-point link between network devices that carries more than one VLAN. 

---

# 4. 802.1Q VLAN Tagging

## 4.1 What is 802.1Q?

**802.1Q** is the VLAN tagging standard.

Simple meaning:

```text
802.1Q adds VLAN information into an Ethernet frame.
```

When a frame travels across a trunk, it needs a VLAN tag so the switch knows which VLAN it belongs to.

Example:

```text
Frame tagged VLAN 10
Frame tagged VLAN 20
Frame tagged VLAN 30
```

---

## 4.2 802.1Q tag size

The 802.1Q tag is:

```text
4 bytes
```

Since:

```text
1 byte = 8 bits
```

Therefore:

```text
4 bytes = 4 × 8 = 32 bits
```

---

## 4.3 VLAN tag fields

The notes list the VLAN tag fields as **Type/TPID, User Priority, CFI, and VLAN ID**. 

| Field         |              Size | Meaning                               |
| ------------- | ----------------: | ------------------------------------- |
| TPID          | 2 bytes / 16 bits | Identifies the frame as 802.1Q tagged |
| User Priority |            3 bits | Supports traffic priority             |
| CFI           |             1 bit | Compatibility field                   |
| VLAN ID       |           12 bits | Identifies the VLAN number            |

Most important field:

```text
VLAN ID
```

Because it tells the switch which VLAN the frame belongs to.

---

## 4.4 VLAN ID calculation

VLAN ID field size:

```text
12 bits
```

Number of possible values:

```text
2^12 = 4096
```

So the VLAN ID field can support 4096 possible values.

In practice:

```text
Normal range VLANs = 1 to 1005
Extended range VLANs = 1006 to 4094
```

---

# 5. VLAN Configuration

## 5.1 Normal Range VLANs

Normal range VLANs:

```text
1 to 1005
```

Important:

```text
VLAN 1 and VLAN 1002 to 1005 are automatically created.
VLAN 1002 to 1005 are reserved for Token Ring and FDDI.
```

Normal range VLAN configurations are stored in:

```text
vlan.dat
```

The notes state that `vlan.dat` is located in the flash memory of the switch. 

---

## 5.2 Extended Range VLANs

Extended range VLANs:

```text
1006 to 4094
```

They are used when more VLAN IDs are needed.

The notes state that extended range VLAN configurations are saved in the running configuration file and require VTP transparent mode. 

---

## 5.3 Create VLAN

Example:

```text
Switch> enable
Switch# configure terminal
Switch(config)# vlan 10
Switch(config-vlan)# name HR
Switch(config-vlan)# exit
```

Meaning:

```text
Create VLAN 10 and name it HR.
```

---

## 5.4 Assign port to VLAN

Example:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10
```

Meaning:

```text
Fa0/1 is an access port in VLAN 10.
```

---

## 5.5 Verify VLAN

Command:

```text
Switch# show vlan brief
```

This command displays VLAN assignment and switch port membership. The uploaded notes specifically mention `show vlan brief` for checking VLAN assignment and membership type. 

---

## 5.6 Remove VLAN from port

Command:

```text
Switch(config)# interface fa0/1
Switch(config-if)# no switchport access vlan
```

Meaning:

```text
Remove the manually assigned VLAN from the port.
```

---

## 5.7 Delete VLAN

Command:

```text
Switch(config)# no vlan 10
```

Meaning:

```text
Delete VLAN 10.
```

Important warning:

```text
If ports were assigned to VLAN 10, they may not work correctly after VLAN 10 is deleted.
```

---

# 6. Trunk Configuration and DTP

## 6.1 Configure trunk

Command:

```text
Switch(config)# interface fa0/24
Switch(config-if)# switchport mode trunk
```

---

## 6.2 Set native VLAN

Command:

```text
Switch(config-if)# switchport trunk native vlan 99
```

Meaning:

```text
Untagged traffic on this trunk belongs to VLAN 99.
```

---

## 6.3 Allow selected VLANs

Command:

```text
Switch(config-if)# switchport trunk allowed vlan 10,20,30,99
```

Meaning:

```text
Only VLAN 10, 20, 30, and 99 can travel through the trunk.
```

---

## 6.4 What is DTP?

DTP stands for:

```text
Dynamic Trunking Protocol
```

DTP is a Cisco proprietary protocol used to negotiate trunking between switch ports.

The uploaded notes state that trunk negotiation is managed by DTP and that Cisco switches use `dynamic auto` by default. 

---

## 6.5 Disable DTP

Command:

```text
Switch(config-if)# switchport nonegotiate
```

Meaning:

```text
Disable trunk negotiation.
```

Common secure trunk configuration:

```text
Switch(config)# interface fa0/24
Switch(config-if)# switchport mode trunk
Switch(config-if)# switchport nonegotiate
```

---

# 7. Inter-VLAN Communication

## 7.1 Why different VLANs cannot communicate directly

A VLAN is a separate broadcast domain.

Therefore:

```text
Same VLAN = can communicate directly
Different VLAN = need routing
```

Example:

```text
PC1 in VLAN 10
PC2 in VLAN 20
```

They cannot communicate directly using only a Layer 2 switch.

The notes state that computers on separate VLANs are unable to communicate without a routing device. 

---

## 7.2 What is Inter-VLAN Routing?

Inter-VLAN routing means:

```text
Routing traffic from one VLAN to another VLAN.
```

Example:

```text
VLAN 10 → VLAN 20
```

Needs:

```text
Router
or
Multilayer switch
```

---

## 7.3 Each VLAN usually has its own subnet

Example:

```text
VLAN 10 = 192.168.10.0/24
VLAN 20 = 192.168.20.0/24
VLAN 30 = 192.168.30.0/24
```

Each VLAN also needs a default gateway:

```text
VLAN 10 gateway = 192.168.10.1
VLAN 20 gateway = 192.168.20.1
VLAN 30 gateway = 192.168.30.1
```

---

# 8. Legacy Inter-VLAN Routing

## 8.1 Meaning

Legacy inter-VLAN routing uses:

```text
One physical router interface per VLAN.
```

Example:

```text
Router G0/0 → VLAN 10
Router G0/1 → VLAN 20
Router G0/2 → VLAN 30
```

The notes describe this as the historical solution where routers used multiple physical interfaces, each connected to a separate network and configured with a distinct subnet. 

---

## 8.2 Why it is not scalable

Problem:

```text
1 VLAN needs 1 router physical interface.
```

If there are 20 VLANs:

```text
Need 20 router interfaces.
```

This wastes:

```text
Router ports
Switch ports
Cables
Money
Space
```

---

# 9. Router-on-a-Stick

## 9.1 Meaning

Router-on-a-stick uses:

```text
One physical router interface
One trunk link
Multiple subinterfaces
```

The uploaded notes define router-on-a-stick as a router configuration where a single physical interface routes traffic between multiple VLANs. 

---

## 9.2 Subinterface

A subinterface is a software-based virtual interface on one physical router interface.

Example:

```text
G0/0.10 → VLAN 10
G0/0.20 → VLAN 20
G0/0.30 → VLAN 30
```

Each subinterface has:

```text
VLAN assignment
IP address
Subnet mask
```

---

## 9.3 Router-on-a-stick switch configuration

Example:

```text
Switch(config)# vlan 10
Switch(config-vlan)# name STUDENTS

Switch(config)# vlan 20
Switch(config-vlan)# name STAFF

Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10

Switch(config)# interface fa0/2
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 20

Switch(config)# interface fa0/24
Switch(config-if)# switchport mode trunk
Switch(config-if)# switchport trunk allowed vlan 10,20
```

---

## 9.4 Router subinterface configuration

Example:

```text
Router(config)# interface g0/0
Router(config-if)# no shutdown

Router(config)# interface g0/0.10
Router(config-subif)# encapsulation dot1Q 10
Router(config-subif)# ip address 192.168.10.1 255.255.255.0

Router(config)# interface g0/0.20
Router(config-subif)# encapsulation dot1Q 20
Router(config-subif)# ip address 192.168.20.1 255.255.255.0
```

Important command:

```text
encapsulation dot1Q vlan-id
```

Example:

```text
encapsulation dot1Q 10
```

Meaning:

```text
This subinterface handles VLAN 10 tagged traffic.
```

---

# 10. Multilayer Switch Inter-VLAN Routing

## 10.1 Meaning

A multilayer switch can perform:

```text
Layer 2 switching
+
Layer 3 routing
```

The notes state that multilayer switches can replace dedicated routers for basic routing and support inter-VLAN routing. 

---

## 10.2 What is SVI?

SVI stands for:

```text
Switch Virtual Interface
```

An SVI is a virtual interface for a VLAN.

Example:

```text
interface vlan 10
```

The notes explain that an SVI is virtual because no physical port is dedicated to it, and it can provide the gateway for a VLAN. 

---

## 10.3 SVI as VLAN gateway

Example:

```text
VLAN 10 gateway = interface vlan 10 = 192.168.10.1
VLAN 20 gateway = interface vlan 20 = 192.168.20.1
```

PC in VLAN 10:

```text
IP address: 192.168.10.10
Default gateway: 192.168.10.1
```

PC in VLAN 20:

```text
IP address: 192.168.20.10
Default gateway: 192.168.20.1
```

---

## 10.4 Multilayer switch configuration

Example:

```text
Switch(config)# vlan 10
Switch(config-vlan)# name STUDENTS

Switch(config)# vlan 20
Switch(config-vlan)# name STAFF

Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10

Switch(config)# interface fa0/2
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 20

Switch(config)# interface vlan 10
Switch(config-if)# ip address 192.168.10.1 255.255.255.0
Switch(config-if)# no shutdown

Switch(config)# interface vlan 20
Switch(config-if)# ip address 192.168.20.1 255.255.255.0
Switch(config-if)# no shutdown

Switch(config)# ip routing
```

Important command:

```text
ip routing
```

Meaning:

```text
Enable Layer 3 routing on the multilayer switch.
```

---

## 10.5 Routed Port

A routed port is a physical switch port that acts like a router interface.

Command:

```text
Switch(config)# interface g0/1
Switch(config-if)# no switchport
Switch(config-if)# ip address 10.1.1.1 255.255.255.252
Switch(config-if)# no shutdown
```

Important command:

```text
no switchport
```

Meaning:

```text
Turn a Layer 2 switch port into a Layer 3 routed port.
```

The notes state that a routed port is not associated with a VLAN and acts similarly to a router interface. 

---

## 10.6 SVI vs Routed Port

| Feature              | SVI                 | Routed Port                        |
| -------------------- | ------------------- | ---------------------------------- |
| Type                 | Virtual interface   | Physical interface                 |
| Command              | `interface vlan 10` | `interface g0/1` + `no switchport` |
| Used for             | VLAN gateway        | Layer 3 physical link              |
| Associated with VLAN | Yes                 | No                                 |

---

## 10.7 Cisco 2960 and SDM Template

The notes mention that a Cisco 2960 can support limited Layer 3 functions and static routing by using the correct SDM template. 

Important command:

```text
Switch# show sdm prefer
```

Change SDM template:

```text
Switch(config)# sdm prefer lanbase-routing
```

Then reload:

```text
Switch# reload
```

Simple meaning:

```text
SDM template controls how switch hardware resources are used.
```

---

# 11. VLAN Attacks

The uploaded notes discuss **VLAN hopping attack** and **double-tagging attack**. 

---

## 11.1 VLAN Hopping Attack

VLAN hopping means an attacker tries to access traffic from another VLAN.

Example:

```text
Attacker in VLAN 10
tries to access VLAN 20
```

The notes explain that in a basic VLAN hopping attack, the attacker spoofs 802.1Q and DTP signaling to form a trunk with the switch. 

If successful:

```text
Attacker PC becomes trunk-connected
↓
Can access multiple VLANs
```

---

## 11.2 How to prevent VLAN hopping

Use secure access port configuration:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport nonegotiate
```

For many user ports:

```text
Switch(config)# interface range fa0/1 - 20
Switch(config-if-range)# switchport mode access
Switch(config-if-range)# switchport nonegotiate
```

Also shut down unused ports:

```text
Switch(config)# interface range fa0/21 - 24
Switch(config-if-range)# shutdown
```

---

## 11.3 Double-Tagging Attack

Double-tagging means the attacker sends a frame with two VLAN tags.

Example:

```text
[Outer tag: Native VLAN][Inner tag: Target VLAN][Data]
```

The notes state that double-tagging is unidirectional and works only when the attacker is connected to a port in the same VLAN as the native VLAN of the trunk port. 

---

## 11.4 How double-tagging works

Assume:

```text
Native VLAN = VLAN 1
Attacker is in VLAN 1
Target is in VLAN 20
```

Attacker sends:

```text
[VLAN 1 tag][VLAN 20 tag][Data]
```

Process:

```text
First switch removes outer native VLAN tag.
Second switch reads inner VLAN 20 tag.
Traffic reaches VLAN 20.
```

Important:

```text
Double-tagging is one-way / unidirectional.
```

---

## 11.5 How to prevent double-tagging

Best practices:

```text
Do not use VLAN 1 as native VLAN.
Use an unused VLAN as native VLAN.
Do not put users in the native VLAN.
Manually configure trunks.
Disable DTP.
Allow only required VLANs on trunk links.
```

Example secure native VLAN:

```text
Switch(config)# vlan 999
Switch(config-vlan)# name NATIVE_UNUSED

Switch(config)# interface fa0/24
Switch(config-if)# switchport mode trunk
Switch(config-if)# switchport trunk native vlan 999
Switch(config-if)# switchport trunk allowed vlan 10,20,99
Switch(config-if)# switchport nonegotiate
```

The uploaded notes list prevention guidelines: disable trunking on access ports, disable auto trunking, and ensure the native VLAN is only used for trunk links. 

---

# 12. Important Commands Summary

## VLAN creation

```text
Switch(config)# vlan 10
Switch(config-vlan)# name HR
```

## Assign access port

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10
```

## Check VLAN

```text
Switch# show vlan brief
```

## Delete VLAN

```text
Switch(config)# no vlan 10
```

## Configure trunk

```text
Switch(config)# interface fa0/24
Switch(config-if)# switchport mode trunk
```

## Set native VLAN

```text
Switch(config-if)# switchport trunk native vlan 99
```

## Allow VLANs on trunk

```text
Switch(config-if)# switchport trunk allowed vlan 10,20,30,99
```

## Disable DTP

```text
Switch(config-if)# switchport nonegotiate
```

## Router-on-a-stick subinterface

```text
Router(config)# interface g0/0.10
Router(config-subif)# encapsulation dot1Q 10
Router(config-subif)# ip address 192.168.10.1 255.255.255.0
```

## Multilayer switch SVI

```text
Switch(config)# interface vlan 10
Switch(config-if)# ip address 192.168.10.1 255.255.255.0
Switch(config-if)# no shutdown
```

## Enable routing on multilayer switch

```text
Switch(config)# ip routing
```

## Routed port

```text
Switch(config)# interface g0/1
Switch(config-if)# no switchport
Switch(config-if)# ip address 10.1.1.1 255.255.255.252
```

---

# 13. Common Mistakes

## Mistake 1: Creating VLAN but not assigning ports

Creating VLAN only:

```text
Switch(config)# vlan 10
```

is not enough.

You must also assign ports:

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport access vlan 10
```

---

## Mistake 2: Thinking different VLANs can communicate automatically

Wrong:

```text
VLAN 10 can automatically talk to VLAN 20.
```

Correct:

```text
Different VLANs need routing.
```

---

## Mistake 3: Wrong PC gateway

Wrong:

```text
PC in VLAN 10
Gateway = 192.168.20.1
```

Correct:

```text
PC in VLAN 10
Gateway = 192.168.10.1
```

---

## Mistake 4: Forgetting trunk mode

In router-on-a-stick, the switch port connected to router must be trunk.

Correct:

```text
Switch(config-if)# switchport mode trunk
```

---

## Mistake 5: Forgetting `encapsulation dot1Q`

Router subinterface needs:

```text
encapsulation dot1Q vlan-id
```

---

## Mistake 6: Forgetting `ip routing`

For multilayer switch inter-VLAN routing, remember:

```text
Switch(config)# ip routing
```

---

## Mistake 7: Native VLAN mismatch

Bad:

```text
Switch 1 native VLAN = 99
Switch 2 native VLAN = 1
```

Correct:

```text
Switch 1 native VLAN = 99
Switch 2 native VLAN = 99
```

---

## Mistake 8: Leaving access ports in dynamic trunk mode

Bad:

```text
switchport mode dynamic auto
```

Better:

```text
switchport mode access
switchport nonegotiate
```

---

# 14. Exam / Viva Questions

## Q1. What does VLAN stand for?

**Answer:**
Virtual Local Area Network.

---

## Q2. What is the purpose of VLAN?

**Answer:**
To divide one physical switched network into multiple logical networks, improving security, performance, and management.

---

## Q3. Is VLAN a physical or logical separation?

**Answer:**
Logical separation.

---

## Q4. What is the default VLAN on Cisco switches?

**Answer:**
VLAN 1.

---

## Q5. What is the native VLAN used for?

**Answer:**
It handles untagged traffic on an 802.1Q trunk link.

---

## Q6. What is the difference between an access port and a trunk port?

**Answer:**
An access port carries one VLAN. A trunk port carries multiple VLANs.

---

## Q7. What is 802.1Q?

**Answer:**
802.1Q is the VLAN tagging standard used on trunk links.

---

## Q8. How large is the 802.1Q tag?

**Answer:**
4 bytes, or 32 bits.

---

## Q9. Why can 12 VLAN ID bits support 4096 values?

**Answer:**

```text
2^12 = 4096
```

---

## Q10. What command creates VLAN 10?

```text
Switch(config)# vlan 10
```

---

## Q11. What command assigns Fa0/1 to VLAN 10?

```text
Switch(config)# interface fa0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10
```

---

## Q12. What command shows VLAN membership?

```text
Switch# show vlan brief
```

---

## Q13. What is inter-VLAN routing?

**Answer:**
Routing traffic from one VLAN to another VLAN.

---

## Q14. What devices can perform inter-VLAN routing?

**Answer:**
A router or multilayer switch.

---

## Q15. What is router-on-a-stick?

**Answer:**
An inter-VLAN routing method where one router physical interface uses subinterfaces and a trunk link to route between multiple VLANs.

---

## Q16. What command is used on router subinterfaces for VLAN tagging?

```text
encapsulation dot1Q vlan-id
```

---

## Q17. What is SVI?

**Answer:**
SVI stands for Switch Virtual Interface. It is a virtual interface used as a VLAN gateway on a multilayer switch.

---

## Q18. What command enables routing on a multilayer switch?

```text
Switch(config)# ip routing
```

---

## Q19. What is VLAN hopping?

**Answer:**
A VLAN attack where an attacker tries to access traffic from another VLAN without proper routing.

---

## Q20. How can VLAN hopping be prevented?

**Answer:**
Force access ports to access mode, disable DTP, manually configure trunks, use an unused native VLAN, and shut down unused ports.

---

# 15. Final Simple Summary

```text
VLAN
= Logical LAN inside a switch

Access port
= One VLAN

Trunk port
= Multiple VLANs

802.1Q
= VLAN tagging standard

Native VLAN
= Handles untagged trunk traffic

Inter-VLAN routing
= Routing between VLANs

Router-on-a-stick
= Router uses one trunk link and subinterfaces

Multilayer switch routing
= Switch routes internally using SVIs

VLAN attack
= Attacker tries to bypass VLAN separation
```

Most important Chapter 9 idea:

```text
VLANs separate networks at Layer 2.
Different VLANs cannot communicate directly.
To communicate between VLANs, routing is required.
```

Chapter 9 is now complete.
