# Chapter 5: IPv4

## Complete Markdown Revision Notes

Based on your uploaded **Chapter 5 IPv4** slide file. Main topics: **IPv4** and **Subnetting**, including IPv4 address structure, subnet mask, ANDing, address types, private/public ranges, classful addressing, subnetting formulas, VLSM, and address planning. 

---


# 1. IPv4 Basics

## 1.1 What is IPv4?

IPv4 is an addressing system used to identify devices in a network.

Example:

```text
192.168.1.10
```

Your slide says IPv4 consists of **32 bits** and is written in this format:

```text
A.B.C.D
```

Each part is from:

```text
0 to 255
```



---

## 1.2 IPv4 Has 4 Octets

An IPv4 address has 4 parts.

Example:

```text
192.168.1.10
```

Breakdown:

```text
192     168     1       10
 A       B      C       D
```

Each part is called an **octet**.

```text
1 octet = 8 bits
```

So:

```text
8 bits + 8 bits + 8 bits + 8 bits = 32 bits
```

---

## 1.3 Why Each Octet is 0 to 255

Each octet has 8 bits.

The smallest 8-bit value is:

```text
00000000 = 0
```

The largest 8-bit value is:

```text
11111111 = 255
```

Calculation:

```text
128 + 64 + 32 + 16 + 8 + 4 + 2 + 1 = 255
```

Therefore, each IPv4 octet must be between:

```text
0 and 255
```

---

## 1.4 Valid and Invalid IPv4 Examples

Valid:

```text
192.168.1.10
10.0.0.1
172.16.5.20
8.8.8.8
```

Invalid:

```text
192.168.1.300
```

Reason:

```text
300 > 255
```

Invalid:

```text
192.168.1
```

Reason:

```text
IPv4 needs 4 octets.
```

Invalid:

```text
192.168.1.10.5
```

Reason:

```text
IPv4 should only have 4 octets.
```

---

# 2. Network Portion and Host Portion

## 2.1 What it Means

An IPv4 address has two parts:

```text
Network portion + Host portion
```

The **network portion** identifies the network.

The **host portion** identifies the device inside that network.

Your slide says within the 32-bit IPv4 address, part of the bits make up the network and part make up the host. 

---

## 2.2 Example

Given:

```text
IP address:  192.168.1.10
Subnet mask: 255.255.255.0
```

Beginner view:

```text
192.168.1 . 10
---------   --
Network     Host
```

So:

```text
Network portion = 192.168.1
Host portion    = 10
```

The full network address is:

```text
192.168.1.0
```

---

## 2.3 Why We Need Network and Host Portions

Routers and devices need to know:

```text
Is the destination in my local network?
Or is it in another network?
```

Example:

```text
PC1: 192.168.1.10
PC2: 192.168.1.20
```

If both are in the same subnet, they can communicate locally.

But:

```text
PC1:    192.168.1.10
Server: 10.0.0.20
```

These are likely different networks, so a router is needed.

---

# 3. Subnet Mask

## 3.1 What is a Subnet Mask?

A subnet mask tells which part of the IPv4 address is the network portion and which part is the host portion.

Your slide says the IPv4 subnet mask is used to differentiate the network portion from the host portion. 

Example:

```text
IP address:  192.168.1.10
Subnet mask: 255.255.255.0
```

In binary:

```text
255.255.255.0
=
11111111.11111111.11111111.00000000
```

Meaning:

```text
1 bits = network portion
0 bits = host portion
```

---

## 3.2 CIDR Prefix

Instead of writing:

```text
255.255.255.0
```

We can write:

```text
/24
```

Because there are 24 network bits.

Example:

```text
192.168.1.10/24
```

means:

```text
IP address:  192.168.1.10
Subnet mask: 255.255.255.0
```

---

## 3.3 Common Subnet Masks

| Prefix | Subnet Mask     | Network Bits | Host Bits |
| ------ | --------------- | -----------: | --------: |
| `/8`   | `255.0.0.0`     |            8 |        24 |
| `/16`  | `255.255.0.0`   |           16 |        16 |
| `/24`  | `255.255.255.0` |           24 |         8 |

---

# 4. ANDing

## 4.1 What is ANDing?

ANDing is the binary process used to find the network address from:

```text
IP address
AND
Subnet mask
```

Your slide says the actual process used to identify the network portion and host portion is called **ANDing**. 

---

## 4.2 ANDing Rules

| IP Bit | Mask Bit | Result |
| -----: | -------: | -----: |
|      0 |        0 |      0 |
|      0 |        1 |      0 |
|      1 |        0 |      0 |
|      1 |        1 |      1 |

Important:

```text
Only 1 AND 1 = 1
Everything else = 0
```

---

## 4.3 ANDing Example

Given:

```text
IP address:  192.168.1.10
Subnet mask: 255.255.255.0
```

Binary:

```text
IP:
11000000.10101000.00000001.00001010

Mask:
11111111.11111111.11111111.00000000

AND result:
11000000.10101000.00000001.00000000
```

Convert back to decimal:

```text
11000000 = 192
10101000 = 168
00000001 = 1
00000000 = 0
```

So:

```text
Network address = 192.168.1.0
```

---

# 5. Network Address, Host Address, and Broadcast Address

Your slide says each network has three types of IPv4 addresses:

```text
Network address
Host addresses
Broadcast address
```



---

## 5.1 Network Address

The network address represents the whole network.

Example:

```text
192.168.1.0/24
```

Network address:

```text
192.168.1.0
```

It cannot normally be assigned to a PC.

Wrong:

```text
PC IP = 192.168.1.0
```

Correct:

```text
PC IP = 192.168.1.10
```

---

## 5.2 Host Address

Host addresses are assigned to real devices.

Examples of hosts:

```text
PC
Laptop
Phone
Printer
Server
Router interface
```

For:

```text
192.168.1.0/24
```

Usable host range:

```text
192.168.1.1 to 192.168.1.254
```

---

## 5.3 Broadcast Address

The broadcast address is used to send traffic to all hosts in the same network.

Your slide says the broadcast address uses the highest address in the network range, where host bits are all `1`s. 

For:

```text
192.168.1.0/24
```

Broadcast address:

```text
192.168.1.255
```

---

## 5.4 Full Example

Network:

```text
192.168.1.0/24
```

| Type              | Address         |
| ----------------- | --------------- |
| Network address   | `192.168.1.0`   |
| First host        | `192.168.1.1`   |
| Last host         | `192.168.1.254` |
| Broadcast address | `192.168.1.255` |

Important rule:

```text
First host = network address + 1
Last host  = broadcast address - 1
```

---

# 6. IPv4 Address Types

## 6.1 Unicast Address

Unicast means:

```text
One sender → One receiver
```

Example:

```text
PC1: 192.168.1.10
PC2: 192.168.1.20
```

PC1 sends data to PC2:

```text
192.168.1.10 → 192.168.1.20
```

Your slide says IPv4 host addresses are unicast addresses in the range:

```text
0.0.0.0 to 223.255.255.255
```



---

## 6.2 Multicast Address

Multicast means:

```text
One sender → Selected group of receivers
```

IPv4 multicast range:

```text
224.0.0.0 to 239.255.255.255
```

Your slide also says `224.0.0.0` to `224.0.0.255` are reserved link-local multicast addresses. 

Examples:

```text
224.0.0.1
224.0.0.5
230.1.1.1
```

Do not assign multicast addresses as normal PC IP addresses.

Wrong:

```text
PC IP = 224.0.0.5
```

Correct:

```text
PC IP = 192.168.1.10
```

---

## 6.3 Private IPv4 Address

Private IP addresses are used inside private networks, such as homes, schools, and offices.

Your slide lists the RFC 1918 private address blocks: 

| Private Range                   | CIDR             |
| ------------------------------- | ---------------- |
| `10.0.0.0 - 10.255.255.255`     | `10.0.0.0/8`     |
| `172.16.0.0 - 172.31.255.255`   | `172.16.0.0/12`  |
| `192.168.0.0 - 192.168.255.255` | `192.168.0.0/16` |

Examples:

```text
10.1.2.3 = private
172.20.5.5 = private
192.168.1.10 = private
```

Important trap:

```text
172.20.1.1 = private
172.32.1.1 = not private
```

Not all `172.x.x.x` addresses are private.

---

## 6.4 Public IPv4 Address

Public IPv4 addresses are used on the Internet.

Examples:

```text
8.8.8.8
1.1.1.1
142.250.190.78
```

Private IP addresses are not directly routed on the public Internet, but devices using private IP can access the Internet through NAT.

---

## 6.5 Loopback Address

Loopback means the device communicates with itself.

IPv4 loopback address:

```text
127.0.0.1
```

Also called:

```text
localhost
```

Command:

```cmd
ping 127.0.0.1
```

This tests the local TCP/IP stack.

Important:

```text
Successful ping to 127.0.0.1 does not prove the Internet works.
```

Your slide says loopback creates a shortcut for TCP/IP applications and services running on the same device to communicate with each other. 

---

## 6.6 Link-Local Address

IPv4 link-local range:

```text
169.254.0.0 to 169.254.255.255
```

or:

```text
169.254.0.0/16
```

Your slide says link-local addresses can be automatically assigned when no IP configuration is available. 

If a PC gets:

```text
169.254.x.x
```

it usually means:

```text
The PC failed to get an IP address from DHCP.
```

Possible causes:

```text
DHCP server problem
Router off
Cable unplugged
Wrong VLAN
Wi-Fi problem
Switch port problem
```

---

# 7. Classful Addressing

Your slide says classful addressing grouped IPv4 addresses into Class A, Class B, Class C, Class D, and Class E. 

| Class   | First Octet Range | Default Mask            |  CIDR | Use             |
| ------- | ----------------: | ----------------------- | ----: | --------------- |
| Class A |         `1 - 126` | `255.0.0.0`             |  `/8` | Large networks  |
| Class B |       `128 - 191` | `255.255.0.0`           | `/16` | Medium networks |
| Class C |       `192 - 223` | `255.255.255.0`         | `/24` | Small networks  |
| Class D |       `224 - 239` | Not for normal host use |     — | Multicast       |
| Class E |       `240 - 255` | Reserved                |     — | Experimental    |

Special note:

```text
127.x.x.x = loopback
```

---

## 7.1 Class Examples

```text
10.1.1.1       = Class A
172.16.1.1     = Class B
192.168.1.1    = Class C
224.0.0.1      = Class D, multicast
250.1.1.1      = Class E, experimental/reserved
```

---

## 7.2 Common Classful Addressing Mistakes

Mistake:

```text
Class A means private.
```

Wrong.

Example:

```text
10.1.1.1 = Class A and private
11.1.1.1 = Class A but public
```

Mistake:

```text
All 172 addresses are private.
```

Wrong.

```text
172.16.0.0 to 172.31.255.255 = private
172.32.1.1 = not private
```

Mistake:

```text
Class C means only 192.168.
```

Wrong.

```text
192.168.1.1 = Class C and private
200.1.1.1 = Class C but public
```

---

# 8. Subnetting

## 8.1 What is Subnetting?

Subnetting means dividing one large network into smaller networks.

These smaller networks are called:

```text
Subnets
```

Your slide says subnetting reduces the size of a large broadcast domain and creates smaller broadcast domains. It can reduce network traffic and improve network performance. 

Example:

```text
Before:
192.168.1.0/24

After subnetting:
192.168.1.0/26
192.168.1.64/26
192.168.1.128/26
192.168.1.192/26
```

---

## 8.2 Why Subnetting is Needed

Large broadcast domains can cause:

```text
Too many broadcasts
More unnecessary traffic
Slower network performance
More processing work for devices
Harder troubleshooting
```

Subnetting reduces the number of devices in each broadcast domain.

---

## 8.3 Router Requirement

Your slide says devices on different subnets need a router to communicate, and devices use the router interface attached to their LAN as the default gateway. 

Example:

```text
Subnet 1: 192.168.1.0/26
Subnet 2: 192.168.1.64/26
```

Devices in different subnets need:

```text
Router
or
Layer 3 switch
```

---

# 9. Subnetting Formulas

Your slide gives two important formulas: 

```text
Number of subnets = 2^borrowed bits
```

```text
Number of usable hosts = 2^host bits - 2
```

Why minus 2?

```text
1 address = network address
1 address = broadcast address
```

---

## 9.1 Borrowed Bits

Borrowed bits are host bits taken and used as extra network bits.

Before subnetting:

```text
Network bits + Host bits
```

After subnetting:

```text
Network bits + Borrowed bits + Remaining host bits
```

Example:

```text
Original: /24
New:      /27
```

Borrowed bits:

```text
27 - 24 = 3
```

---

## 9.2 Host Bits

IPv4 has 32 bits.

```text
Host bits = 32 - prefix
```

Example:

```text
/27
```

Host bits:

```text
32 - 27 = 5
```

Usable hosts:

```text
2^5 - 2 = 32 - 2 = 30
```

---

# 10. Prefix Table from `/25` to `/30`

| Prefix | Subnet Mask       | Borrowed Bits from `/24` | Number of Subnets | Host Bits | Usable Hosts | Block Size |
| ------ | ----------------- | -----------------------: | ----------------: | --------: | -----------: | ---------: |
| `/25`  | `255.255.255.128` |                        1 |                 2 |         7 |          126 |        128 |
| `/26`  | `255.255.255.192` |                        2 |                 4 |         6 |           62 |         64 |
| `/27`  | `255.255.255.224` |                        3 |                 8 |         5 |           30 |         32 |
| `/28`  | `255.255.255.240` |                        4 |                16 |         4 |           14 |         16 |
| `/29`  | `255.255.255.248` |                        5 |                32 |         3 |            6 |          8 |
| `/30`  | `255.255.255.252` |                        6 |                64 |         2 |            2 |          4 |

Important pattern:

```text
Bigger prefix = more subnets
Bigger prefix = fewer host bits
Bigger prefix = fewer usable hosts
Bigger prefix = smaller block size
```

---

# 11. Block Size

## 11.1 Formula

```text
Block size = 256 - interesting subnet mask octet
```

Example:

```text
/27 = 255.255.255.224
```

Interesting octet:

```text
224
```

Block size:

```text
256 - 224 = 32
```

Subnet jumps:

```text
0, 32, 64, 96, 128, 160, 192, 224
```

---

# 12. Subnetting Examples

## 12.1 `/25`

Starting network:

```text
192.168.1.0/24
```

Subnet into:

```text
/25
```

Borrowed bits:

```text
25 - 24 = 1
```

Number of subnets:

```text
2^1 = 2
```

Host bits:

```text
32 - 25 = 7
```

Usable hosts:

```text
2^7 - 2 = 126
```

Subnet mask:

```text
255.255.255.128
```

Block size:

```text
256 - 128 = 128
```

| Subnet | Network            | First Host      | Last Host       | Broadcast       |
| ------ | ------------------ | --------------- | --------------- | --------------- |
| 1      | `192.168.1.0/25`   | `192.168.1.1`   | `192.168.1.126` | `192.168.1.127` |
| 2      | `192.168.1.128/25` | `192.168.1.129` | `192.168.1.254` | `192.168.1.255` |

---

## 12.2 `/26`

Borrowed bits:

```text
26 - 24 = 2
```

Subnets:

```text
2^2 = 4
```

Usable hosts:

```text
2^6 - 2 = 62
```

Subnet mask:

```text
255.255.255.192
```

Block size:

```text
256 - 192 = 64
```

| Subnet | Network            | First Host      | Last Host       | Broadcast       |
| ------ | ------------------ | --------------- | --------------- | --------------- |
| 1      | `192.168.1.0/26`   | `192.168.1.1`   | `192.168.1.62`  | `192.168.1.63`  |
| 2      | `192.168.1.64/26`  | `192.168.1.65`  | `192.168.1.126` | `192.168.1.127` |
| 3      | `192.168.1.128/26` | `192.168.1.129` | `192.168.1.190` | `192.168.1.191` |
| 4      | `192.168.1.192/26` | `192.168.1.193` | `192.168.1.254` | `192.168.1.255` |

---

## 12.3 `/27`

Borrowed bits:

```text
27 - 24 = 3
```

Subnets:

```text
2^3 = 8
```

Usable hosts:

```text
2^5 - 2 = 30
```

Subnet mask:

```text
255.255.255.224
```

Block size:

```text
256 - 224 = 32
```

Subnet network addresses:

```text
192.168.1.0/27
192.168.1.32/27
192.168.1.64/27
192.168.1.96/27
192.168.1.128/27
192.168.1.160/27
192.168.1.192/27
192.168.1.224/27
```

Example:

```text
192.168.1.96/27
```

Details:

```text
Network:   192.168.1.96
First:     192.168.1.97
Last:      192.168.1.126
Broadcast: 192.168.1.127
```

---

## 12.4 `/28`

Borrowed bits:

```text
28 - 24 = 4
```

Subnets:

```text
2^4 = 16
```

Usable hosts:

```text
2^4 - 2 = 14
```

Subnet mask:

```text
255.255.255.240
```

Block size:

```text
256 - 240 = 16
```

Subnet jumps:

```text
0, 16, 32, 48, 64, 80, 96, 112,
128, 144, 160, 176, 192, 208, 224, 240
```

Example:

```text
192.168.1.80/28
```

Details:

```text
Network:   192.168.1.80
First:     192.168.1.81
Last:      192.168.1.94
Broadcast: 192.168.1.95
```

---

## 12.5 `/29`

Borrowed bits:

```text
29 - 24 = 5
```

Subnets:

```text
2^5 = 32
```

Usable hosts:

```text
2^3 - 2 = 6
```

Subnet mask:

```text
255.255.255.248
```

Block size:

```text
256 - 248 = 8
```

Example:

```text
192.168.1.72/29
```

Details:

```text
Network:   192.168.1.72
First:     192.168.1.73
Last:      192.168.1.78
Broadcast: 192.168.1.79
```

---

## 12.6 `/30`

Borrowed bits:

```text
30 - 24 = 6
```

Subnets:

```text
2^6 = 64
```

Usable hosts:

```text
2^2 - 2 = 2
```

Subnet mask:

```text
255.255.255.252
```

Block size:

```text
256 - 252 = 4
```

Example:

```text
192.168.1.20/30
```

Details:

```text
Network:   192.168.1.20
First:     192.168.1.21
Last:      192.168.1.22
Broadcast: 192.168.1.23
```

`/30` is commonly used for point-to-point router links because it gives exactly 2 usable addresses.

Example:

```text
Router A: 192.168.1.21/30
Router B: 192.168.1.22/30
```

---

# 13. Finding Subnet Information from Any Given IP

## 13.1 Steps

Given:

```text
192.168.1.118/27
```

Find:

```text
Network address
First host
Last host
Broadcast address
Valid host or not
```

Steps:

```text
1. Find subnet mask.
2. Find block size.
3. Find subnet range.
4. Identify network and broadcast.
5. Find first and last host.
6. Check if the given IP is valid.
```

---

## 13.2 Example

Given:

```text
192.168.1.118/27
```

Subnet mask:

```text
/27 = 255.255.255.224
```

Block size:

```text
256 - 224 = 32
```

Subnet jumps:

```text
0, 32, 64, 96, 128, 160, 192, 224
```

`118` is between:

```text
96 and 127
```

So:

```text
Network address:   192.168.1.96
First host:        192.168.1.97
Last host:         192.168.1.126
Broadcast address: 192.168.1.127
Valid host?        Yes
```

---

## 13.3 Valid Host Check

A valid host must be between the network address and broadcast address.

Example:

```text
Subnet: 192.168.1.64/28
Range:  192.168.1.64 to 192.168.1.79
```

So:

```text
192.168.1.64 = network address, not valid
192.168.1.65 = valid host
192.168.1.78 = valid host
192.168.1.79 = broadcast address, not valid
```

---

# 14. VLSM

## 14.1 What is VLSM?

VLSM stands for:

```text
Variable Length Subnet Mask
```

Your slide says VLSM is subnetting a subnet and was designed to avoid wasting addresses. 

Simple meaning:

```text
VLSM = using different subnet sizes based on host needs
```

Example:

```text
50 hosts → /26
20 hosts → /27
5 hosts  → /29
2 hosts  → /30
```

---

## 14.2 Why VLSM is Needed

Without VLSM, we may give every department the same subnet size.

Example:

| Department | Needed Hosts | Given `/26` | Wasted |
| ---------- | -----------: | ----------: | -----: |
| A          |           50 |          62 |     12 |
| B          |           20 |          62 |     42 |
| C          |            5 |          62 |     57 |
| WAN        |            2 |          62 |     60 |

This wastes many addresses.

With VLSM:

| Department | Needed Hosts | Suitable Prefix | Usable Hosts |
| ---------- | -----------: | --------------: | -----------: |
| A          |           50 |           `/26` |           62 |
| B          |           20 |           `/27` |           30 |
| C          |            5 |           `/29` |            6 |
| WAN        |            2 |           `/30` |            2 |

Much less waste.

---

## 14.3 VLSM Rules

Main rules:

```text
1. List all host requirements.
2. Sort from largest to smallest.
3. Choose the smallest subnet that can support each requirement.
4. Allocate from the beginning of the address block.
5. Make sure subnets do not overlap.
```

Important:

```text
Largest subnet first.
Smallest subnet last.
```

---

## 14.4 VLSM Example

Given:

```text
192.168.10.0/24
```

Requirements:

```text
Admin: 50 hosts
IT:    25 hosts
Sales: 12 hosts
WAN:   2 hosts
```

Choose prefixes:

```text
Admin: 50 hosts → /26
IT:    25 hosts → /27
Sales: 12 hosts → /28
WAN:   2 hosts  → /30
```

Allocation:

| Network | Needed Hosts | Prefix | Usable Hosts | Network          | First Host       | Last Host        | Broadcast        |
| ------- | -----------: | -----: | -----------: | ---------------- | ---------------- | ---------------- | ---------------- |
| Admin   |           50 |  `/26` |           62 | `192.168.10.0`   | `192.168.10.1`   | `192.168.10.62`  | `192.168.10.63`  |
| IT      |           25 |  `/27` |           30 | `192.168.10.64`  | `192.168.10.65`  | `192.168.10.94`  | `192.168.10.95`  |
| Sales   |           12 |  `/28` |           14 | `192.168.10.96`  | `192.168.10.97`  | `192.168.10.110` | `192.168.10.111` |
| WAN     |            2 |  `/30` |            2 | `192.168.10.112` | `192.168.10.113` | `192.168.10.114` | `192.168.10.115` |

Unused:

```text
192.168.10.116 to 192.168.10.255
```

---

# 15. Address Planning

## 15.1 What is Address Planning?

Address planning means deciding how IP addresses will be used in a network.

Your slide says address planning includes deciding:

```text
Subnet size
Number of hosts per subnet
How host addresses are assigned
Which hosts require static IP
Which hosts can use DHCP
```



---

## 15.2 Important Address Allocation Considerations

Your slide lists three main considerations: 

```text
Preventing duplication of addresses
Providing and controlling access
Monitoring security and performance
```

---

## 15.3 Static IP Address

A static IP address is manually configured.

Best for:

```text
Router/default gateway
Servers
Printers
Switch management IP
Firewalls
Wireless access points
CCTV/NVR
```

Example:

```text
Router:      192.168.1.1
File server: 192.168.1.10
Printer:     192.168.1.20
AP:          192.168.1.30
```

---

## 15.4 DHCP

DHCP stands for:

```text
Dynamic Host Configuration Protocol
```

DHCP automatically gives devices:

```text
IP address
Subnet mask
Default gateway
DNS server
```

Best for:

```text
PCs
Laptops
Phones
Tablets
Guest devices
Temporary devices
```

---

## 15.5 Static IP vs DHCP

| Feature     | Static IP                      | DHCP                 |
| ----------- | ------------------------------ | -------------------- |
| Assigned by | Manually                       | Automatically        |
| Changes?    | Usually no                     | Can change           |
| Best for    | Servers, printers, routers     | PCs, phones, laptops |
| Risk        | Manual mistake or duplicate IP | DHCP server failure  |

---

## 15.6 Good Address Plan Example

Given:

```text
192.168.1.0/24
```

Good plan:

| Range                           | Purpose         |
| ------------------------------- | --------------- |
| `192.168.1.1`                   | Gateway         |
| `192.168.1.2 - 192.168.1.9`     | Network devices |
| `192.168.1.10 - 192.168.1.19`   | Servers         |
| `192.168.1.20 - 192.168.1.29`   | Printers        |
| `192.168.1.30 - 192.168.1.39`   | Access points   |
| `192.168.1.100 - 192.168.1.200` | DHCP clients    |
| `192.168.1.201 - 192.168.1.254` | Reserved        |

Bad plan:

```text
DHCP pool: 192.168.1.1 - 192.168.1.254
Router:    192.168.1.1
Printer:   192.168.1.20
Server:    192.168.1.10
```

Problem:

```text
DHCP pool includes static devices.
This can cause duplicate IP conflict.
```

---

# 16. Useful Commands

## 16.1 Windows Commands

Check IP address:

```cmd
ipconfig
```

Check detailed configuration:

```cmd
ipconfig /all
```

Release DHCP address:

```cmd
ipconfig /release
```

Request new DHCP address:

```cmd
ipconfig /renew
```

Test loopback:

```cmd
ping 127.0.0.1
```

Test gateway:

```cmd
ping 192.168.1.1
```

Test public IP connectivity:

```cmd
ping 8.8.8.8
```

---

## 16.2 Cisco Commands

Check interface IP addresses:

```text
show ip interface brief
```

Configure router interface:

```text
enable
configure terminal
interface gigabitEthernet 0/0
ip address 192.168.1.1 255.255.255.0
no shutdown
exit
```

Configure DHCP pool:

```text
enable
configure terminal

ip dhcp excluded-address 192.168.1.1 192.168.1.99

ip dhcp pool LAN_POOL
 network 192.168.1.0 255.255.255.0
 default-router 192.168.1.1
 dns-server 8.8.8.8
exit
```

---

# 17. Common Mistakes and Exam Traps

## Trap 1: Thinking `/24` means 24 hosts

Wrong.

```text
/24 means 24 network bits.
```

Host bits:

```text
32 - 24 = 8
```

Usable hosts:

```text
2^8 - 2 = 254
```

---

## Trap 2: Jumping by the Prefix Number

Wrong for `/27`:

```text
0, 27, 54, 81
```

Correct:

```text
/27 = 255.255.255.224
Block size = 256 - 224 = 32

Jumps:
0, 32, 64, 96, 128, 160, 192, 224
```

---

## Trap 3: Using Network Address as a Host

Wrong:

```text
PC IP = 192.168.1.64/26
```

Why?

```text
192.168.1.64 is the network address.
```

Correct host range for `192.168.1.64/26`:

```text
192.168.1.65 to 192.168.1.126
```

---

## Trap 4: Using Broadcast Address as a Host

Wrong:

```text
PC IP = 192.168.1.127/26
```

Why?

```text
192.168.1.127 is the broadcast address.
```

---

## Trap 5: Thinking All 172 Addresses Are Private

Wrong.

Only this is private:

```text
172.16.0.0 to 172.31.255.255
```

Examples:

```text
172.20.1.1 = private
172.32.1.1 = not private
```

---

## Trap 6: Loopback Does Not Test Internet

```cmd
ping 127.0.0.1
```

Only tests your own device.

It does not prove Wi-Fi, router, DNS, or Internet is working.

---

## Trap 7: `169.254.x.x` Usually Means DHCP Problem

If you see:

```text
169.254.20.10
```

Suspect:

```text
DHCP failure
Network cable issue
Wi-Fi issue
Router issue
Wrong VLAN
```

---

## Trap 8: Overlapping VLSM Subnets

Wrong:

```text
LAN A: 192.168.1.0/26
LAN B: 192.168.1.32/27
```

Why wrong?

```text
LAN A range: 192.168.1.0 - 192.168.1.63
LAN B range: 192.168.1.32 - 192.168.1.63
```

They overlap.

Correct:

```text
LAN A: 192.168.1.0/26
LAN B: 192.168.1.64/27
```

---

# 18. Viva and Exam Questions

## Q1. How many bits are in IPv4?

```text
32 bits
```

---

## Q2. What is the IPv4 format?

```text
A.B.C.D
```

Example:

```text
192.168.1.10
```

---

## Q3. What is the range of each IPv4 octet?

```text
0 to 255
```

---

## Q4. What does a subnet mask do?

It separates the network portion and host portion of an IPv4 address.

---

## Q5. What is ANDing used for?

ANDing is used to find the network address.

---

## Q6. What are the three address types inside a network?

```text
Network address
Host addresses
Broadcast address
```

---

## Q7. What is the formula for number of subnets?

```text
2^borrowed bits
```

---

## Q8. What is the formula for usable hosts?

```text
2^host bits - 2
```

---

## Q9. Why do we subtract 2 in the usable host formula?

Because one address is used for the network address and one address is used for the broadcast address.

---

## Q10. What is the multicast range?

```text
224.0.0.0 to 239.255.255.255
```

---

## Q11. What are the private IPv4 ranges?

```text
10.0.0.0 to 10.255.255.255
172.16.0.0 to 172.31.255.255
192.168.0.0 to 192.168.255.255
```

---

## Q12. What is the loopback address?

```text
127.0.0.1
```

---

## Q13. What does `169.254.x.x` usually mean?

The device failed to get a normal IP configuration, usually from DHCP.

---

## Q14. What is VLSM?

```text
Variable Length Subnet Mask
```

It means using different subnet sizes based on different host requirements.

---

## Q15. What is the main rule of VLSM?

```text
Allocate the largest subnet first.
```

---

## Q16. What prefix supports 50 hosts?

```text
/26
```

Reason:

```text
/27 = 30 usable hosts, not enough
/26 = 62 usable hosts, enough
```

---

## Q17. What prefix supports 12 hosts?

```text
/28
```

Reason:

```text
/28 = 14 usable hosts
```

---

## Q18. What prefix supports 2 hosts?

```text
/30
```

Reason:

```text
/30 = 2 usable hosts
```

---

# 19. Final Practice

## Question 1

Find subnet information:

```text
192.168.1.90/28
```

Answer:

```text
Subnet mask:       255.255.255.240
Block size:        16
Network address:   192.168.1.80
First host:        192.168.1.81
Last host:         192.168.1.94
Broadcast address: 192.168.1.95
Valid host?        Yes
```

---

## Question 2

Find subnet information:

```text
192.168.1.128/26
```

Answer:

```text
Subnet mask:       255.255.255.192
Block size:        64
Network address:   192.168.1.128
First host:        192.168.1.129
Last host:         192.168.1.190
Broadcast address: 192.168.1.191
Valid host?        No, it is the network address.
```

---

## Question 3

Find subnet information:

```text
192.168.1.191/26
```

Answer:

```text
Subnet mask:       255.255.255.192
Block size:        64
Network address:   192.168.1.128
First host:        192.168.1.129
Last host:         192.168.1.190
Broadcast address: 192.168.1.191
Valid host?        No, it is the broadcast address.
```

---

## Question 4

Find subnet information:

```text
192.168.1.174/30
```

Answer:

```text
Subnet mask:       255.255.255.252
Block size:        4
Network address:   192.168.1.172
First host:        192.168.1.173
Last host:         192.168.1.174
Broadcast address: 192.168.1.175
Valid host?        Yes
```

---

## Question 5

VLSM requirement:

```text
Given: 192.168.20.0/24

Admin: 60 hosts
HR: 20 hosts
Server: 5 hosts
WAN: 2 hosts
```

Sort:

```text
Admin: 60
HR: 20
Server: 5
WAN: 2
```

Choose prefixes:

```text
Admin: 60 hosts → /26
HR: 20 hosts → /27
Server: 5 hosts → /29
WAN: 2 hosts → /30
```

Allocation:

```text
Admin:  192.168.20.0/26
HR:     192.168.20.64/27
Server: 192.168.20.96/29
WAN:    192.168.20.104/30
```

Full details:

```text
Admin /26
Network:   192.168.20.0
First:     192.168.20.1
Last:      192.168.20.62
Broadcast: 192.168.20.63

HR /27
Network:   192.168.20.64
First:     192.168.20.65
Last:      192.168.20.94
Broadcast: 192.168.20.95

Server /29
Network:   192.168.20.96
First:     192.168.20.97
Last:      192.168.20.102
Broadcast: 192.168.20.103

WAN /30
Network:   192.168.20.104
First:     192.168.20.105
Last:      192.168.20.106
Broadcast: 192.168.20.107
```

---

# 20. Chapter 5 Final Summary

Chapter 5 is mainly about:

```text
IPv4 addressing
Subnetting
VLSM
Address planning
```

Most important facts:

```text
IPv4 has 32 bits.
IPv4 has 4 octets.
Each octet is 0 to 255.
Subnet mask separates network and host portions.
ANDing finds the network address.
Each network has network, host, and broadcast addresses.
Subnetting divides large networks into smaller subnets.
VLSM avoids wasting IP addresses.
Good address planning prevents duplicate IPs and improves network management.
```

Most important formulas:

```text
Number of subnets = 2^borrowed bits
Number of usable hosts = 2^host bits - 2
Block size = 256 - subnet mask value
```

Most important private ranges:

```text
10.0.0.0/8
172.16.0.0/12
192.168.0.0/16
```

Most important special addresses:

```text
127.0.0.1 = loopback
169.254.0.0/16 = link-local
224.0.0.0 - 239.255.255.255 = multicast
```

Chapter 5 is now complete.
