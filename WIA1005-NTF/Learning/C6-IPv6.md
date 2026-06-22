# Chapter 6: IPv6 — Complete Markdown Revision Notes

# 1. Why IPv6 is Needed

IPv6 was created because IPv4 addresses are limited. The slide says IANA allocated the last two `/8` IPv4 address blocks to Regional Internet Registries on **January 31, 2011**. It also says the Internet is growing into the **Internet of Things**, where many devices such as sensors, cars, appliances, and biomedical devices need Internet access. 

## Simple idea

```text
IPv4 = limited address space
IPv6 = much larger address space
```

IPv4 has:

```text
32 bits
```

IPv6 has:

```text
128 bits
```

So IPv6 can provide far more addresses than IPv4.

## Why IPv4 became a problem

IPv4 has problems such as:

```text
Limited address space
Too many Internet devices
NAT complexity
IoT growth
```

IPv6 helps solve this by using a much larger address space.

---

# 2. IPv6 Address Format

IPv6 addresses are **128 bits** long and are written using **hexadecimal** values. The slide says every **4 bits** is represented by one hexadecimal digit, giving a total of **32 hexadecimal values** in an IPv6 address. 

## Preferred IPv6 format

```text
X:X:X:X:X:X:X:X
```

Example:

```text
2001:0DB8:0000:0000:0000:0000:0000:0001
```

IPv6 has:

```text
8 hextets
```

Each hextet has:

```text
4 hexadecimal digits
```

Each hexadecimal digit represents:

```text
4 bits
```

So:

```text
1 hextet = 4 hex digits × 4 bits
1 hextet = 16 bits
```

Full IPv6 address:

```text
8 hextets × 16 bits = 128 bits
```

---

# 3. Hexadecimal Review

Hexadecimal uses 16 symbols:

```text
0 1 2 3 4 5 6 7 8 9 A B C D E F
```

Meaning:

```text
A = 10
B = 11
C = 12
D = 13
E = 14
F = 15
```

## Important formula

```text
4 bits = 1 hexadecimal digit
```

Example:

```text
0000 = 0
0001 = 1
1010 = A
1111 = F
```

---

# 4. IPv6 Address Shortening Rules

The slide gives two IPv6 shortening rules: remove leading zeros, and use double colon `::` to replace one continuous group of zero hextets. 

---

## Rule 1: Remove leading zeros

Example:

```text
Original:
2001:0DB8:0000:0000:0000:0000:0000:0001
```

Remove leading zeros:

```text
2001:DB8:0:0:0:0:0:1
```

Examples:

```text
0DB8 → DB8
0001 → 1
0000 → 0
```

Important:

```text
0000 becomes 0
It does not disappear completely using Rule 1 only
```

---

## Rule 2: Use double colon `::`

A double colon `::` can replace one continuous group of zero hextets.

Example:

```text
2001:DB8:0:0:0:0:0:1
```

becomes:

```text
2001:DB8::1
```

Important rule:

```text
:: can only be used once in one IPv6 address
```

Wrong:

```text
2001::DB8::1
```

Why wrong?

```text
There are two ::
The device cannot know how many zero hextets each :: represents
```

---

# 5. IPv6 Address Types

The slide says there are three IPv6 address types: **unicast, multicast, and anycast**. 

| Type      | Meaning                          |
| --------- | -------------------------------- |
| Unicast   | One interface                    |
| Multicast | Multiple selected destinations   |
| Anycast   | Nearest device with that address |

---

## 5.1 Unicast

A unicast address identifies one interface on an IPv6-enabled device.

Example:

```text
2001:DB8:ACAD:1::10
```

Simple meaning:

```text
One sender → one receiver
```

---

## 5.2 Multicast

A multicast address sends one packet to multiple selected destinations.

Example:

```text
FF02::1
```

Simple meaning:

```text
One sender → selected group
```

IPv6 does **not** use broadcast. IPv6 uses multicast instead.

---

## 5.3 Anycast

An anycast address is a unicast address assigned to multiple devices. A packet sent to an anycast address goes to the nearest device with that address. 

Simple meaning:

```text
One sender → nearest device from a group
```

Example use:

```text
Nearest DNS server
Nearest content server
Nearest service node
```

---

# 6. IPv6 Prefix Length

IPv6 uses prefix length to show the network portion of the address. The slide says IPv6 uses the format:

```text
IPv6 address/prefix length
```



Example:

```text
2001:DB8:ACAD:1::10/64
```

Meaning:

```text
First 64 bits = network prefix
Remaining 64 bits = interface ID
```

For `/64`:

```text
64 ÷ 16 = 4 hextets
```

So the first 4 hextets are the network portion:

```text
2001:DB8:ACAD:1
```

---

# 7. Global Unicast Address

A global unicast address is similar to a **public IPv4 address**. The slide says it is globally unique and Internet-routable. It can be configured statically or assigned dynamically. 

Example:

```text
2001:DB8:ACAD:1::10/64
```

The slide says currently assigned global unicast addresses are from:

```text
2000::/3
```

Beginner memory:

```text
Global unicast addresses commonly start with 2 or 3
```

---

# 8. Global Unicast Address Structure

The slide explains three parts:

```text
Global routing prefix
Subnet ID
Interface ID
```



Example:

```text
2001:DB8:ACAD:1::10/64
```

Expanded:

```text
2001:0DB8:ACAD:0001:0000:0000:0000:0010
```

Breakdown:

```text
2001:0DB8:ACAD : 0001 : 0000:0000:0000:0010
Global prefix     Subnet   Interface ID
```

---

## 8.1 Global Routing Prefix

The global routing prefix is assigned by the provider, such as an ISP.

Example:

```text
2001:DB8:ACAD::/48
```

Here:

```text
2001:DB8:ACAD
```

is the global routing prefix.

---

## 8.2 Subnet ID

The Subnet ID identifies subnets inside the organization.

Example:

```text
2001:DB8:ACAD:1::/64
2001:DB8:ACAD:2::/64
2001:DB8:ACAD:3::/64
```

Subnet IDs:

```text
1
2
3
```

---

## 8.3 Interface ID

The Interface ID is like the host portion in IPv4.

Example:

```text
2001:DB8:ACAD:1::10/64
```

Interface ID:

```text
::10
```

---

# 9. Link-local Address

A link-local address is used to communicate with devices on the same local link. The slide says link-local addresses are not routable beyond the link, and routers will not forward packets with link-local addresses. 

Range:

```text
FE80::/10
```

Example:

```text
FE80::1
```

Simple meaning:

```text
Link-local = same local subnet only
```

## Important points

```text
Routers do not forward link-local packets
Link-local addresses only need to be unique on the same link
They can be created dynamically or manually
```

Cisco manual configuration:

```text
conf t
interface g0/0/0
ipv6 address fe80::1 link-local
no shutdown
end
```

---

# 10. Loopback Address

The IPv6 loopback address is:

```text
::1
```

The slide says `::1` is used by a host to send a packet to itself and cannot be assigned to a physical interface. 

IPv4 comparison:

```text
IPv4 loopback = 127.0.0.1
IPv6 loopback = ::1
```

Test command:

```text
ping ::1
```

Meaning:

```text
Test whether IPv6 is working on the local device
```

---

# 11. Unspecified Address

The IPv6 unspecified address is:

```text
::
```

The slide says `::` cannot be assigned to an interface and is only used as a source address. 

Simple meaning:

```text
:: = no IPv6 address yet
```

Do not confuse:

```text
::  = unspecified address
::1 = loopback address
```

---

# 12. Unique Local Address

Unique local addresses are used for local addressing inside a site or between limited sites. The slide says they should not be routable in the global IPv6 Internet. 

Range:

```text
FC00::/7 to FDFF::/7
```

Beginner memory:

```text
Unique local usually starts with FC or FD
```

Example:

```text
FD00:1234:ABCD:1::10
```

IPv4 comparison:

```text
Private IPv4 address ≈ Unique local IPv6 address
```

---

# 13. SLAAC

SLAAC stands for:

```text
Stateless Address Auto Configuration
```

The slide says SLAAC allows a device to obtain its prefix, prefix length, and default gateway information from an IPv6 router without using a DHCPv6 server. It uses ICMPv6 Router Advertisement messages. 

Simple idea:

```text
Router gives prefix
Host creates its own IPv6 address
```

Example:

```text
Router advertises:
2001:DB8:ACAD:1::/64

Host creates:
2001:DB8:ACAD:1:xxxx:xxxx:xxxx:xxxx/64
```

---

## 13.1 Router Solicitation, RS

RS is sent by a host.

Meaning:

```text
Any IPv6 router here?
```

Sent to:

```text
FF02::2
```

---

## 13.2 Router Advertisement, RA

RA is sent by a router.

Meaning:

```text
Here is the IPv6 prefix and network information
```

The slide says IPv6 routers periodically send RA messages every **200 seconds**. 

```text
200 seconds = 3 minutes 20 seconds
```

Cisco command needed:

```text
ipv6 unicast-routing
```

---

# 14. DHCPv6

DHCPv6 provides IPv6 configuration information.

The slide says a device can automatically receive information such as global unicast address, prefix length, default gateway address, and DNS server addresses using DHCPv6 services. 

There are two important types:

```text
Stateless DHCPv6
Stateful DHCPv6
```

---

## 14.1 Stateless DHCPv6

In stateless DHCPv6:

```text
Host creates IPv6 address using SLAAC
DHCPv6 gives extra information
```

Extra information can include:

```text
DNS server address
Domain name
```

The slide says stateless DHCPv6 provides information such as DNS server address and domain name. 

Cisco command:

```text
ipv6 nd other-config-flag
```

Meaning:

```text
Use SLAAC for address
Use DHCPv6 for other information
```

---

## 14.2 Stateful DHCPv6

In stateful DHCPv6:

```text
DHCPv6 server gives IPv6 address information
```

The slide says stateful DHCPv6 is similar to DHCP for IPv4. 

Cisco command:

```text
ipv6 nd managed-config-flag
```

Meaning:

```text
Use DHCPv6 for managed address configuration
```

---

## Stateless vs Stateful DHCPv6

| Feature                | Stateless DHCPv6 | Stateful DHCPv6 |
| ---------------------- | ---------------- | --------------- |
| IPv6 address from      | SLAAC            | DHCPv6 server   |
| DNS from               | DHCPv6           | DHCPv6          |
| Server tracks address? | No               | Yes             |
| Similar to IPv4 DHCP?  | Not fully        | Yes             |
| RA still important?    | Yes              | Yes             |

---

# 15. EUI-64 Process

The slide says EUI-64 uses a client’s **48-bit Ethernet MAC address** and inserts another **16 bits** in the middle to create a **64-bit Interface ID**. 

## Purpose

```text
MAC address → EUI-64 → IPv6 Interface ID
```

A MAC address is:

```text
48 bits
```

IPv6 Interface ID is commonly:

```text
64 bits
```

Missing bits:

```text
64 - 48 = 16 bits
```

The inserted value is:

```text
FFFE
```

---

## EUI-64 steps

Given MAC:

```text
00:1A:2B:3C:4D:5E
```

Step 1: Split into two halves:

```text
00:1A:2B    3C:4D:5E
```

Step 2: Insert `FFFE`:

```text
00:1A:2B:FF:FE:3C:4D:5E
```

Step 3: Flip the 7th bit of the first byte:

```text
00 → 02
```

Result:

```text
02:1A:2B:FF:FE:3C:4D:5E
```

Step 4: Write as IPv6 Interface ID:

```text
021A:2BFF:FE3C:4D5E
```

If prefix is:

```text
2001:DB8:ACAD:1::/64
```

Full IPv6 address:

```text
2001:DB8:ACAD:1:21A:2BFF:FE3C:4D5E/64
```

---

# 16. IPv6 Multicast

IPv6 multicast sends one packet to multiple selected destinations.

IPv6 multicast addresses usually start with:

```text
FF
```

Examples:

```text
FF02::1
FF02::2
FF02::1:FF00:1234
```

IPv6 does not use broadcast. It uses multicast instead.

---

## 16.1 Assigned Multicast

The slide says assigned multicast addresses are reserved for predefined groups of devices. 

Important examples:

| Address   | Meaning                     |
| --------- | --------------------------- |
| `FF02::1` | All-nodes multicast group   |
| `FF02::2` | All-routers multicast group |

---

## 16.2 `FF02::1`

Meaning:

```text
All IPv6-enabled devices on the local link
```

All IPv6 devices join this group.

---

## 16.3 `FF02::2`

Meaning:

```text
All IPv6 routers on the local link
```

Routers join this group when IPv6 routing is enabled.

Cisco command:

```text
ipv6 unicast-routing
```

---

# 17. Solicited-node Multicast Address

The slide says a solicited-node multicast address matches the last **24 bits** of an IPv6 unicast address. It is automatically created when a global unicast or link-local address is assigned. 

Prefix:

```text
FF02:0:0:0:0:1:FF00::/104
```

Shorter memory form:

```text
FF02::1:FF
```

## Important formula

```text
1 hex digit = 4 bits
24 bits ÷ 4 = 6 hex digits
```

So:

```text
Last 24 bits = last 6 hex digits
```

Example unicast:

```text
2001:DB8:ACAD:1::ABCD:5678
```

Last 6 hex digits:

```text
CD5678
```

Solicited-node multicast:

```text
FF02::1:FFCD:5678
```

---

# 18. IPv6 Migration Methods

The slide says IPv6 migration can be divided into three categories: **Dual Stack, Tunneling, and Translation**. 

| Method              | Meaning                                   |
| ------------------- | ----------------------------------------- |
| Dual Stack          | IPv4 and IPv6 run together                |
| Tunneling           | IPv6 packet is carried inside IPv4 packet |
| Translation / NAT64 | IPv6 and IPv4 are translated              |

---

## 18.1 Dual Stack

Dual Stack means a device runs IPv4 and IPv6 at the same time.

Example:

```text
IPv4: 192.168.1.10
IPv6: 2001:DB8:ACAD:1::10
```

Cisco example:

```text
conf t
ipv6 unicast-routing
interface g0/0/0
ip address 192.168.1.1 255.255.255.0
ipv6 address 2001:DB8:ACAD:1::1/64
no shutdown
end
```

---

## 18.2 Tunneling

Tunneling means an IPv6 packet is encapsulated inside an IPv4 packet.

Simple structure:

```text
[ IPv4 header [ IPv6 packet ] ]
```

Used when:

```text
IPv6 network must cross an IPv4-only network
```

---

## 18.3 Translation / NAT64

NAT64 allows IPv6-enabled devices to communicate with IPv4-enabled devices using translation. 

Simple meaning:

```text
IPv6 packet ↔ IPv4 packet
```

Used when:

```text
IPv6-only device needs to communicate with IPv4-only device
```

---

# 19. ICMPv6

ICMPv6 stands for:

```text
Internet Control Message Protocol version 6
```

It is a helper protocol for IPv6.

It is used for:

```text
Ping
Error messages
Router discovery
Neighbor discovery
Address resolution
Duplicate Address Detection
```

IPv6 depends heavily on ICMPv6.

---

# 20. Neighbor Discovery Protocol, NDP

The slide says ICMPv6 includes five messages as part of Neighbor Discovery Protocol: 

```text
Router Solicitation, RS
Router Advertisement, RA
Neighbor Solicitation, NS
Neighbor Advertisement, NA
Redirect Message
```

IPv6 does not use ARP.

Instead:

```text
IPv4 uses ARP
IPv6 uses NDP
```

---

## 20.1 RS — Router Solicitation

Sent by:

```text
Host
```

Purpose:

```text
Ask for router information
```

Example:

```text
Any IPv6 router here?
```

---

## 20.2 RA — Router Advertisement

Sent by:

```text
Router
```

Purpose:

```text
Provide prefix, prefix length, gateway information, and configuration method
```

Important for:

```text
SLAAC
DHCPv6 indication
Default gateway discovery
```

---

## 20.3 NS — Neighbor Solicitation

Used for:

```text
Address resolution
Duplicate Address Detection
```

Simple meaning:

```text
Who has this IPv6 address?
```

or:

```text
Is anyone already using this IPv6 address?
```

---

## 20.4 NA — Neighbor Advertisement

Reply to NS.

Simple meaning:

```text
I have that IPv6 address
Here is my MAC address
```

---

## 20.5 Redirect Message

The slide says Redirect is used for better next-hop selection. 

Simple meaning:

```text
Router tells host:
Use this better next hop
```

---

# 21. Duplicate Address Detection, DAD

DAD checks whether an IPv6 address is already being used.

The slide says when a device is assigned a global unicast or link-local unicast address, DAD is recommended to make sure the address is unique. The device sends an NS message. If another device has the address, it replies with NA. If no NA is returned, the address is unique and acceptable. 

## DAD process

```text
1. Device wants to use an IPv6 address
2. Device sends NS
3. If another device replies with NA, address is duplicate
4. If no NA reply, address is unique
```

Important:

```text
No NA reply = good
Address is unique
```

---

# 22. IPv6 Address Resolution

Address resolution means:

```text
Known IPv6 address → find MAC address
```

The slide says if a device knows the IPv6 unicast address of a destination but not the Ethernet MAC address, it sends an NS message to the solicited-node address. 

## IPv4 vs IPv6

| Function         | IPv4        | IPv6                   |
| ---------------- | ----------- | ---------------------- |
| Find MAC address | ARP         | NDP                    |
| Request          | ARP Request | Neighbor Solicitation  |
| Reply            | ARP Reply   | Neighbor Advertisement |
| Delivery         | Broadcast   | Multicast              |
| Uses ICMP?       | No          | Yes, ICMPv6            |

---

# 23. IPv6 Subnetting

The slide says IPv6 subnetting uses a different approach from IPv4. IPv6 is not subnetted mainly to conserve addresses, but to support hierarchical and logical network design. 

Simple comparison:

```text
IPv4 subnetting = save addresses
IPv6 subnetting = organize network design
```

---

## 23.1 `/48` to `/64`

A common site prefix:

```text
2001:DB8:ACAD::/48
```

A common LAN subnet:

```text
/64
```

Subnet bits:

```text
64 - 48 = 16 bits
```

Number of `/64` subnets:

```text
2^16 = 65,536
```

The slide says using the 16-bit subnet ID gives **65,536 /64 subnets**. 

Example subnets:

```text
2001:DB8:ACAD:1::/64
2001:DB8:ACAD:2::/64
2001:DB8:ACAD:3::/64
2001:DB8:ACAD:4::/64
```

---

## 23.2 Why 16-bit Subnet ID is one hextet

```text
1 hextet = 16 bits
```

So the 4th hextet is often the subnet ID.

Example:

```text
2001:DB8:ACAD:0001::/64
               ↑
            Subnet ID
```

---

## 23.3 Borrowing Bits from Interface ID

The slide says IPv6 can borrow bits from the Interface ID to create more subnets, usually for security reasons or to create fewer hosts per subnet. 

Example:

```text
/64 → /68
```

Borrowed bits:

```text
68 - 64 = 4 bits
```

Interface ID bits left:

```text
128 - 68 = 60 bits
```

---

## 23.4 Nibble Boundary

The slide says best practice is to subnet on a **nibble boundary**. A nibble is **4 bits**, or one hexadecimal digit. 

```text
1 nibble = 4 bits
1 nibble = 1 hexadecimal digit
```

Good nibble-boundary prefixes:

```text
/64
/68
/72
/76
/80
```

---

## 23.5 `/64` to `/68` Example

Given:

```text
2001:DB8:ACAD:1::/64
```

Borrow 4 bits:

```text
/68
```

Number of new subnets:

```text
2^4 = 16
```

The `/68` subnets:

```text
2001:DB8:ACAD:1:0000::/68
2001:DB8:ACAD:1:1000::/68
2001:DB8:ACAD:1:2000::/68
2001:DB8:ACAD:1:3000::/68
2001:DB8:ACAD:1:4000::/68
2001:DB8:ACAD:1:5000::/68
2001:DB8:ACAD:1:6000::/68
2001:DB8:ACAD:1:7000::/68
2001:DB8:ACAD:1:8000::/68
2001:DB8:ACAD:1:9000::/68
2001:DB8:ACAD:1:A000::/68
2001:DB8:ACAD:1:B000::/68
2001:DB8:ACAD:1:C000::/68
2001:DB8:ACAD:1:D000::/68
2001:DB8:ACAD:1:E000::/68
2001:DB8:ACAD:1:F000::/68
```

---

# 24. Useful Cisco IPv6 Commands

## Enable IPv6 routing

```text
conf t
ipv6 unicast-routing
end
```

## Configure global unicast address

```text
conf t
interface g0/0/0
ipv6 address 2001:DB8:ACAD:1::1/64
no shutdown
end
```

## Configure link-local address

```text
conf t
interface g0/0/0
ipv6 address fe80::1 link-local
no shutdown
end
```

## Configure EUI-64

```text
conf t
interface g0/0/0
ipv6 address 2001:DB8:ACAD:1::/64 eui-64
no shutdown
end
```

## Show IPv6 interface brief

```text
show ipv6 interface brief
```

## Show IPv6 interface details

```text
show ipv6 interface g0/0/0
```

## Show IPv6 neighbors

```text
show ipv6 neighbors
```

## Test IPv6

```text
ping ::1
ping 2001:DB8:ACAD:1::1
```

---

# 25. Common Mistakes

## Mistake 1: Thinking IPv6 uses broadcast

Wrong.

```text
IPv6 does not use broadcast
IPv6 uses multicast
```

## Mistake 2: Using `::` more than once

Wrong:

```text
2001::DB8::1
```

Correct:

```text
Only one :: is allowed
```

## Mistake 3: Confusing `::` and `::1`

```text
::  = unspecified
::1 = loopback
```

## Mistake 4: Thinking link-local can go to Internet

Wrong.

```text
FE80::/10 only works on the same local link
```

## Mistake 5: Thinking `/64` means 64 hosts

Wrong.

```text
/64 means 64 network bits
```

## Mistake 6: Thinking IPv6 uses ARP

Wrong.

```text
IPv6 uses NDP, not ARP
```

## Mistake 7: In DAD, thinking no reply means failure

Wrong.

```text
No NA reply = address is unique
```

---

# 26. Viva / Exam-style Questions

## Q1. Why was IPv6 introduced?

Because IPv4 address space is limited, Internet devices are increasing, NAT has limitations, and IoT needs many addresses.

## Q2. How many bits are in IPv6?

```text
128 bits
```

## Q3. What number system does IPv6 use?

```text
Hexadecimal
```

## Q4. How many hextets are in an IPv6 address?

```text
8 hextets
```

## Q5. What does `/64` mean?

```text
The first 64 bits are the network prefix
```

## Q6. What is `FE80::/10`?

```text
IPv6 link-local address range
```

## Q7. What is `::1`?

```text
IPv6 loopback address
```

## Q8. What is `::`?

```text
IPv6 unspecified address
```

## Q9. What is the unique local address range?

```text
FC00::/7 to FDFF::/7
```

## Q10. What does SLAAC stand for?

```text
Stateless Address Auto Configuration
```

## Q11. Which message does a host send to ask for router information?

```text
Router Solicitation, RS
```

## Q12. Which message does a router send to advertise network information?

```text
Router Advertisement, RA
```

## Q13. What is EUI-64 used for?

To create a 64-bit Interface ID from a 48-bit MAC address.

## Q14. What is inserted into the MAC address during EUI-64?

```text
FFFE
```

## Q15. What is `FF02::1`?

```text
All-nodes multicast group
```

## Q16. What is `FF02::2`?

```text
All-routers multicast group
```

## Q17. What replaces ARP in IPv6?

```text
Neighbor Discovery Protocol, NDP
```

## Q18. Which messages are used for IPv6 address resolution?

```text
Neighbor Solicitation, NS
Neighbor Advertisement, NA
```

## Q19. What does DAD stand for?

```text
Duplicate Address Detection
```

## Q20. From `/48` to `/64`, how many subnet bits are available?

```text
64 - 48 = 16 bits
```

## Q21. How many `/64` subnets can be created from a `/48`?

```text
2^16 = 65,536
```

## Q22. What is a nibble?

```text
4 bits
```

---

# 27. Final Chapter 6 Summary

IPv6 is the newer IP addressing system designed to solve IPv4 address shortage. It uses **128-bit hexadecimal addresses** written in 8 hextets. IPv6 addresses can be shortened by removing leading zeros and using `::` once for continuous zero hextets. IPv6 has unicast, multicast, and anycast addresses. Important IPv6 unicast types include global unicast, link-local, loopback, unspecified, and unique local addresses.

IPv6 supports automatic addressing using **SLAAC** and **DHCPv6**. SLAAC uses Router Solicitation and Router Advertisement messages. DHCPv6 can be stateless or stateful. EUI-64 can create a 64-bit Interface ID from a 48-bit MAC address.

IPv6 does not use broadcast or ARP. Instead, it uses multicast and ICMPv6 Neighbor Discovery Protocol. NDP uses RS, RA, NS, NA, and Redirect messages. NS and NA are used for address resolution and Duplicate Address Detection.

IPv6 subnetting is mainly for logical network design, not address conservation. A `/48` prefix can create `2^16 = 65,536` `/64` subnets. IPv6 subnetting should usually follow nibble boundaries, where 1 nibble equals 4 bits.

Chapter 6 is complete.
