# Chapter 11: Routing

# 1. Chapter Overview

Chapter 11 focuses on how routers move packets between networks.

Main topics:

* Router function
* Best path and longest match
* Routing table
* Packet forwarding
* Static routes
* Default static routes
* Floating static routes
* Host routes
* Dynamic routing
* Routing troubleshooting commands

---

# 2. What is Routing?

## Meaning

**Routing** is the process of choosing a path for packets to travel from one network to another network.

A router connects multiple networks. Each router interface usually belongs to a different IP network. When a packet arrives, the router checks its routing table to decide where to forward the packet. 

Example:

```text
Network A                         Network B
192.168.1.0/24                    192.168.2.0/24

PC-A -------- Router -------- PC-B
192.168.1.10   R1             192.168.2.10
               G0/0: 192.168.1.1
               G0/1: 192.168.2.1
```

PC-A and PC-B are in different networks, so they need a router to communicate.

---

## Router Main Functions

A router has two main functions:

```text
1. Determine the best path.
2. Forward packets toward the destination.
```

Your slide says routers determine the best path based on the routing table and forward packets toward their destination. 

---

# 3. Routing Table Basics

A **routing table** is like a map inside the router.

It tells the router:

```text
To reach this destination network,
send the packet using this next-hop or outgoing interface.
```

The routing table can contain:

* Directly connected routes
* Remote routes
* Default route 

---

## 3.1 Directly Connected Route

A **directly connected route** is a network connected to one of the router’s active interfaces.

Example:

```text
R1 G0/0 = 192.168.1.1/24
```

R1 automatically knows:

```text
192.168.1.0/24 is directly connected.
```

Routing table example:

```text
C 192.168.1.0/24 is directly connected, GigabitEthernet0/0
```

`C` means **connected**.

---

## 3.2 Remote Route

A **remote route** is a route to a network that is not directly connected to the router.

Example:

```text
R1 -------- R2 -------- 192.168.2.0/24
```

For R1, `192.168.2.0/24` is remote.

R1 needs a route like:

```text
To reach 192.168.2.0/24, send packets to R2.
```

Remote routes can be learned by:

```text
Static route  = manually configured
Dynamic route = automatically learned
```

---

## 3.3 Default Route

A **default route** is used when the router does not have a more specific route.

Simple meaning:

```text
If you do not know where to send it,
send it here.
```

IPv4 default route:

```text
0.0.0.0/0
```

IPv6 default route:

```text
::/0
```

Example:

```text
LAN Router -------- ISP Router -------- Internet
```

The LAN router sends unknown Internet traffic to the ISP using a default route.

---

# 4. Best Path

## Meaning

The **best path** is the route selected by the router to forward a packet.

If multiple paths exist, the router chooses the best one based on the routing protocol’s metric. Your slide says the best path is the path with the lowest metric. 

Example:

```text
Path A metric = 10
Path B metric = 30
Path C metric = 5
```

Router chooses:

```text
Path C
```

Because `5` is the lowest metric.

---

# 5. Longest Match

## Meaning

The **longest match** means the router chooses the most specific matching route.

Your slide says the longest match is the route with the greatest number of far-left matching bits with the destination IP address. 

Example destination:

```text
192.168.1.70
```

Routing table:

```text
192.168.0.0/16     -> Route A
192.168.1.0/24     -> Route B
192.168.1.64/26    -> Route C
0.0.0.0/0          -> Default route
```

Chosen route:

```text
192.168.1.64/26
```

Because `/26` is more specific than `/24`, `/16`, and `/0`.

Memory rule:

```text
Longer prefix = more specific = preferred
```

---

# 6. Metric

## Meaning

A **metric** is a number used by a routing protocol to compare paths.

Lower metric is usually better.

Your slide gives examples of different routing protocol metrics: RIP uses hop count, OSPF uses cost, and EIGRP uses bandwidth, delay, load, and reliability. 

| Routing Protocol | Metric Used                         |
| ---------------- | ----------------------------------- |
| RIP              | Hop count                           |
| OSPF             | Cost                                |
| EIGRP            | Bandwidth, delay, load, reliability |

---

## RIP Example

```text
Path A: R1 -> R2 -> Destination
Hop count = 2

Path B: R1 -> R3 -> R4 -> Destination
Hop count = 3
```

RIP chooses Path A because 2 hops is lower than 3 hops.

---

## OSPF Example

```text
Path A cost = 20
Path B cost = 50
```

OSPF chooses Path A because 20 is lower than 50.

---

# 7. Equal Cost Load Balancing

If a router has two or more paths to the same destination with equal cost metrics, it can forward traffic using both paths. This is called **equal cost load balancing**. 

Example:

```text
Path A metric = 10
Path B metric = 10
```

Both are equal, so the router can use both.

```text
Some traffic -> Path A
Some traffic -> Path B
```

---

# 8. Administrative Distance, AD

## Meaning

**Administrative Distance**, or **AD**, measures how trustworthy a route source is.

Lower AD is more trusted. Cisco IOS uses AD to decide which route source should be installed in the routing table. 

Example:

```text
Static route AD = 1
RIP route AD = 120
```

Router chooses the static route because AD 1 is lower than AD 120.

---

## AD vs Metric

| Item   | Meaning                         | Used to Compare                       |
| ------ | ------------------------------- | ------------------------------------- |
| AD     | Trustworthiness of route source | Different route sources               |
| Metric | Path cost/distance              | Routes from the same routing protocol |

Memory trick:

```text
AD = Which source should I trust?
Metric = Which path is better?
```

Example:

```text
O 192.168.4.0/24 [110/20]
```

Meaning:

```text
110 = AD
20  = metric
```

---

# 9. Packet Forwarding

## Meaning

**Packet forwarding** is the process of moving a packet from an incoming interface to the correct outgoing interface.

Simple flow:

```text
Packet enters router
        ↓
Router checks destination IP
        ↓
Router checks routing table
        ↓
Router chooses best route
        ↓
Router forwards packet
```

Your slides explain three packet-forwarding mechanisms: process switching, fast switching, and Cisco Express Forwarding. 

---

# 10. Packet Forwarding Mechanisms

## 10.1 Process Switching

**Process switching** is the slowest method.

Every packet is sent to the CPU. The CPU checks the routing table and decides where to forward the packet. 

```text
Packet 1 -> CPU checks route
Packet 2 -> CPU checks route
Packet 3 -> CPU checks route
```

Problem:

```text
Every packet needs CPU processing.
```

---

## 10.2 Fast Switching

**Fast switching** uses a cache.

The first packet is checked by the CPU. The result is stored in a fast-switching cache. Later packets to the same destination can reuse the cached next-hop information. 

```text
Packet 1 -> CPU checks route -> cache result
Packet 2 -> use cache
Packet 3 -> use cache
```

---

## 10.3 Cisco Express Forwarding, CEF

**Cisco Express Forwarding**, or **CEF**, is the preferred Cisco IOS packet-forwarding mechanism.

CEF uses:

```text
1. FIB
2. Adjacency table
```

The FIB contains precomputed forwarding information, and the adjacency table contains Layer 2 next-hop information. 

---

## CEF Summary

| Method            | How it Works                                  | Speed               |
| ----------------- | --------------------------------------------- | ------------------- |
| Process switching | CPU checks every packet                       | Slowest             |
| Fast switching    | First packet checked, later packets use cache | Faster              |
| CEF               | Uses FIB and adjacency table                  | Preferred / fastest |

Memory trick:

```text
Process switching = ask every time
Fast switching = ask once, remember
CEF = answer is prepared early
```

---

# 11. Packet Forwarding Decisions

A router can make four forwarding decisions:

```text
1. Forward to a directly connected network.
2. Forward to a next-hop router.
3. Forward to a default route.
4. Drop the packet.
```

Your slides describe these forwarding decisions in the Packet Forwarding section. 

---

## 11.1 Forward to Directly Connected Network

If the destination IP belongs to a directly connected network, the router forwards the packet directly to the destination device.

Example:

```text
R1 G0/0 = 192.168.1.1/24
Destination = 192.168.1.50
```

R1 sees that `192.168.1.50` belongs to `192.168.1.0/24`.

So R1 forwards it out G0/0.

---

## 11.2 Forward to Next-Hop Router

If the destination is on a remote network, the router forwards the packet to another router.

Example:

```text
R1 -------- R2 -------- 192.168.3.0/24
```

R1 route:

```text
192.168.3.0/24 via 10.1.1.2
```

Meaning:

```text
To reach 192.168.3.0/24,
send the packet to next-hop router 10.1.1.2.
```

Important:

```text
Destination IP = final device
Destination MAC = next-hop router
```

---

## 11.3 Forward to Default Route

If no specific route matches, the router uses the default route.

Example:

```text
0.0.0.0/0 via ISP
```

Meaning:

```text
If no better route exists, send traffic to ISP.
```

---

## 11.4 Drop the Packet

If there is no matching route and no default route, the router drops the packet. 

Example:

```text
Destination: 8.8.8.8

Routing table:
192.168.1.0/24
192.168.2.0/24

No default route.
```

Result:

```text
Packet dropped.
```

---

# 12. Routing Table Entries

Your slides say each route entry identifies these items: route source, destination network, administrative distance, metric, next-hop, route timestamp, and outgoing interface. 

Example:

```text
R 192.168.3.0/24 [120/1] via 10.1.1.2, 00:00:12, GigabitEthernet0/1
```

Breakdown:

| Part                 | Meaning                 |
| -------------------- | ----------------------- |
| `R`                  | Route source: RIP       |
| `192.168.3.0/24`     | Destination network     |
| `120`                | Administrative Distance |
| `1`                  | Metric                  |
| `via 10.1.1.2`       | Next-hop router         |
| `00:00:12`           | Route timestamp         |
| `GigabitEthernet0/1` | Outgoing interface      |

---

## Common Route Codes

| Code | Meaning         |
| ---- | --------------- |
| `C`  | Connected route |
| `L`  | Local route     |
| `S`  | Static route    |
| `R`  | RIP route       |
| `O`  | OSPF route      |

---

## Command to View Routing Table

```bash
show ip route
```

Example:

```text
C 192.168.1.0/24 is directly connected, GigabitEthernet0/0
L 192.168.1.1/32 is directly connected, GigabitEthernet0/0
S 192.168.2.0/24 [1/0] via 10.1.1.2
R 192.168.3.0/24 [120/1] via 10.1.1.2
O 192.168.4.0/24 [110/20] via 10.1.1.6
```

---

# 13. Static Routes

## Meaning

A **static route** is manually configured by the administrator.

Your slide says static routes are manually configured, are not automatically updated, and must be manually reconfigured if the topology changes. Static routes are identified with the code `S` in the routing table. 

---

## IPv4 Static Route Command

```bash
ip route network mask {next-hop-ip | exit-intf}
```

Example:

```bash
ip route 192.168.2.0 255.255.255.0 10.1.1.2
```

Meaning:

```text
To reach 192.168.2.0/24,
send packets to next-hop 10.1.1.2.
```

---

## Static Route Example

Topology:

```text
LAN 1                         LAN 2
192.168.1.0/24                192.168.2.0/24

PC-A ---- R1 ---- R2 ---- PC-B
```

On R1:

```bash
ip route 192.168.2.0 255.255.255.0 10.1.1.2
```

On R2:

```bash
ip route 192.168.1.0 255.255.255.0 10.1.1.1
```

Important:

```text
Routes must exist in both directions.
```

---

## Benefits of Static Routes

Your slides list these benefits:

* Improved security
* Less bandwidth usage
* Less CPU usage 

Simple explanation:

```text
Static routes do not send routing updates.
Static routes do not need routing protocol calculations.
```

---

## Disadvantage of Static Routes

The main disadvantage is that static routes do not automatically change when the network topology changes. 

Example:

```text
Old path fails.
Static route still points to old next-hop.
Admin must manually fix it.
```

---

## Uses of Static Routes

Your slide says static routes are useful for:

* Small networks
* Stub networks
* Default routes 

A **stub network** is a network with only one way in or out.

Example:

```text
LAN ---- R1 ---- R2 ---- Rest of network
```

R1 has only one neighbor, so a static/default route is suitable.

---

# 14. Default Static Route

## Meaning

A **default static route** is used when the routing table has no more specific route.

Your slide says a default static route specifies the exit point when the routing table does not contain a path for the destination network. 

---

## IPv4 Default Static Route

```bash
ip route 0.0.0.0 0.0.0.0 {exit-intf | next-hop-ip}
```

Example:

```bash
ip route 0.0.0.0 0.0.0.0 10.1.1.2
```

Meaning:

```text
For any unknown IPv4 destination,
send packets to 10.1.1.2.
```

Routing table example:

```text
S* 0.0.0.0/0 [1/0] via 10.1.1.2
```

`S*` means static candidate default route.

---

## IPv6 Default Static Route

```bash
ipv6 route ::/0 {ipv6-address | interface-type interface-number}
```

Example:

```bash
ipv6 route ::/0 2001:DB8:ACAD:12::2
```

Meaning:

```text
For any unknown IPv6 destination,
send packets to 2001:DB8:ACAD:12::2.
```

---

# 15. Fully Specified Static Route

## Meaning

A **fully specified static route** includes both:

```text
1. Exit interface
2. Next-hop IP address
```

Your slide gives this command format: 

```bash
ip route network mask exit-intf next-hop-ip
```

Example:

```bash
ip route 192.168.2.0 255.255.255.0 GigabitEthernet0/1 10.1.1.2
```

Meaning:

```text
To reach 192.168.2.0/24,
send packets out G0/1 to next-hop 10.1.1.2.
```

---

## IPv6 Link-Local Next-Hop Rule

If an IPv6 static route uses a link-local address as the next-hop, the exit interface must be included. Your slide explains this is because link-local addresses are only unique on a given link. 

Wrong:

```bash
ipv6 route 2001:DB8:ACAD:2::/64 FE80::2
```

Correct:

```bash
ipv6 route 2001:DB8:ACAD:2::/64 GigabitEthernet0/0 FE80::2
```

Reason:

```text
FE80::2 may exist on more than one link.
The router needs the exit interface to know which link to use.
```

---

# 16. Floating Static Route

## Meaning

A **floating static route** is a backup static route.

Your slide says a floating static route is configured with a higher Administrative Distance than the primary route. 

Simple meaning:

```text
Floating static route = backup route
```

---

## Command Format

```bash
ip route network mask next-hop-ip administrative-distance
```

Example:

```bash
ip route 192.168.2.0 255.255.255.0 10.1.2.2 5
```

Meaning:

```text
This is a backup route to 192.168.2.0/24.
Use next-hop 10.1.2.2.
Administrative Distance = 5.
```

---

## Main Route vs Backup Route

```text
Main static route AD = 1
Floating static route AD = 5
```

Router chooses main route first because AD 1 is lower.

If the main route fails, the floating static route can become active.

---

## Important Reminder

```text
Lower AD = more preferred
Higher AD = less preferred
```

So the backup route must have **higher AD** than the main route.

---

# 17. Host Route and Local Route

## Host Route

A **host route** is a route to one exact IP address.

Your slide says a host route is an IPv4 address with a 32-bit mask or an IPv6 address with a 128-bit mask. 

IPv4 host route:

```text
192.168.1.10/32
```

IPv6 host route:

```text
2001:DB8:ACAD:1::10/128
```

---

## Static IPv4 Host Route Example

```bash
ip route 192.168.2.10 255.255.255.255 10.1.1.2
```

Meaning:

```text
To reach only host 192.168.2.10,
send packets to 10.1.1.2.
```

---

## Local Route Marked with `L`

When an active router interface is configured with an IP address, a local host route is automatically added to the routing table. Local routes are marked with `L`. 

Example interface:

```text
R1 G0/0 = 192.168.1.1/24
```

Routing table:

```text
C 192.168.1.0/24 is directly connected, GigabitEthernet0/0
L 192.168.1.1/32 is directly connected, GigabitEthernet0/0
```

Difference:

| Code | Meaning                   |
| ---- | ------------------------- |
| `C`  | Whole connected network   |
| `L`  | Router’s own interface IP |

---

# 18. Troubleshooting Commands

Your slide lists these common IOS troubleshooting commands: `ping`, `traceroute`, `show ip route`, `show ip interface brief`, and `show cdp neighbors detail`. 

---

## 18.1 `ping`

Used to test basic connectivity.

```bash
ping 192.168.2.10
```

Cisco result:

```text
!!!!! = success
..... = failure
```

---

## 18.2 `traceroute`

Used to show the path to the destination.

```bash
traceroute 192.168.2.10
```

Windows version:

```bash
tracert 192.168.2.10
```

---

## 18.3 `show ip route`

Used to view IPv4 routing table.

```bash
show ip route
```

Use it to check:

```text
Does the router know the destination network?
Is there a default route?
Is the route static, connected, RIP, or OSPF?
```

---

## 18.4 `show ip interface brief`

Used to check interface IP addresses and status.

```bash
show ip interface brief
```

Example:

```text
Interface              IP-Address      Status      Protocol
GigabitEthernet0/0     192.168.1.1     up          up
GigabitEthernet0/1     10.1.1.1        up          up
GigabitEthernet0/2     unassigned      administratively down down
```

Best status:

```text
up/up
```

If interface is administratively down:

```bash
interface g0/0
no shutdown
```

---

## 18.5 `show cdp neighbors detail`

Used to view directly connected Cisco neighbor devices.

```bash
show cdp neighbors detail
```

It can show:

```text
Neighbor device name
Neighbor IP address
Local interface
Neighbor port
Device platform
```

---

# 19. Dynamic Routing

## Meaning

**Dynamic routing** means routers automatically learn and share routes using routing protocols.

Your slide says dynamic routing protocols automatically share reachability and status information about remote networks. 

Simple meaning:

```text
Dynamic routing = routers teach each other routes automatically
```

Examples:

```text
RIP
OSPF
EIGRP
```

---

## Dynamic Routing Activities

Your slides say dynamic routing protocols perform activities such as:

```text
1. Network discovery
2. Maintaining routing tables
```



---

## Network Discovery

Routers learn about remote networks from other routers.

Example:

```text
R1 ---- R2 ---- 192.168.2.0/24
```

R2 tells R1:

```text
I know 192.168.2.0/24.
```

R1 can then add the route.

---

## Maintaining Routing Tables

Dynamic routing protocols update route information when the network changes.

Examples of changes:

```text
Link failure
Router failure
New network added
Better path appears
```

---

## Convergence

**Convergence** means routers have finished exchanging updates and their routing tables are updated.

Your slide says routers have converged after they have finished exchanging and updating their routing tables. 

Simple meaning:

```text
Convergence = routers are updated and agree on the current routes.
```

---

# 20. Dynamic Routing Protocol Components

Your slide lists three main components of dynamic routing protocols: data structures, routing protocol messages, and algorithms. 

---

## 20.1 Data Structures

Data structures are tables or databases used by routing protocols.

Your slide says this information is kept in RAM. 

Simple meaning:

```text
Data structures = routing protocol memory
```

They store information such as:

```text
Known networks
Neighbor routers
Possible paths
Best paths
```

---

## 20.2 Routing Protocol Messages

Routing protocol messages are used by routers to communicate.

They help routers:

```text
Discover neighbors
Exchange routing information
Maintain accurate route information
```

Your slide explains that routing protocols use messages for these tasks. 

---

## 20.3 Algorithm

An algorithm is a set of rules used to calculate the best path.

Your slide says routing protocols use algorithms for routing information and best path determination. 

Simple meaning:

```text
Algorithm = method used to choose the best route
```

---

# 21. Static Routing vs Dynamic Routing

| Feature                     | Static Routing          | Dynamic Routing                |
| --------------------------- | ----------------------- | ------------------------------ |
| Configuration               | Manual                  | Automatic after protocol setup |
| Route updates               | Manual                  | Automatic                      |
| Bandwidth usage             | Low                     | Uses bandwidth for updates     |
| CPU/RAM usage               | Low                     | Higher                         |
| Best for                    | Small/stub networks     | Large/changing networks        |
| Control                     | More admin control      | Protocol chooses best path     |
| Reaction to topology change | Admin must fix manually | Protocol recalculates path     |

---

# 22. Important Command Summary

## Routing table

```bash
show ip route
show ipv6 route
```

## Interface check

```bash
show ip interface brief
```

## Connectivity test

```bash
ping 192.168.2.10
```

## Path test

```bash
traceroute 192.168.2.10
```

Windows:

```bash
tracert 192.168.2.10
```

## Cisco neighbor check

```bash
show cdp neighbors detail
```

## Static route

```bash
ip route 192.168.2.0 255.255.255.0 10.1.1.2
```

## Default IPv4 route

```bash
ip route 0.0.0.0 0.0.0.0 10.1.1.2
```

## Default IPv6 route

```bash
ipv6 route ::/0 2001:DB8:ACAD:12::2
```

## Fully specified static route

```bash
ip route 192.168.2.0 255.255.255.0 GigabitEthernet0/1 10.1.1.2
```

## Floating static route

```bash
ip route 192.168.2.0 255.255.255.0 10.1.2.2 5
```

## IPv4 host route

```bash
ip route 192.168.2.10 255.255.255.255 10.1.1.2
```

---

# 23. Common Mistakes

## Mistake 1: Confusing AD and metric

Wrong:

```text
[120/1]
120 = metric
1 = AD
```

Correct:

```text
[120/1]
120 = AD
1 = metric
```

Remember:

```text
[AD/metric]
```

---

## Mistake 2: Thinking default route is used first

Wrong.

The router uses longest match first.

Correct order:

```text
1. Most specific route
2. Less specific route
3. Default route
4. Drop packet
```

---

## Mistake 3: Forgetting return route

For successful communication:

```text
PC-A -> PC-B
PC-B -> PC-A
```

Both directions need routes.

---

## Mistake 4: Using your own router IP as next-hop

Wrong on R1:

```bash
ip route 192.168.2.0 255.255.255.0 10.1.1.1
```

If `10.1.1.1` is R1’s own IP, this is wrong.

Correct:

```bash
ip route 192.168.2.0 255.255.255.0 10.1.1.2
```

The next-hop should be the neighbor router.

---

## Mistake 5: Forgetting `no shutdown`

Interface may stay down if you forget:

```bash
no shutdown
```

Check using:

```bash
show ip interface brief
```

---

## Mistake 6: Thinking `L` and `C` are the same

Correct:

```text
C = connected network
L = local router interface IP
```

Example:

```text
C 192.168.1.0/24
L 192.168.1.1/32
```

---

## Mistake 7: IPv6 link-local next-hop without exit interface

Wrong:

```bash
ipv6 route 2001:DB8:ACAD:2::/64 FE80::2
```

Correct:

```bash
ipv6 route 2001:DB8:ACAD:2::/64 GigabitEthernet0/0 FE80::2
```

---

# 24. Viva / Exam-Style Questions

## Q1. What is routing?

Routing is the process of selecting a path for packets to travel from one network to another.

---

## Q2. What are the two main functions of a router?

```text
1. Determine the best path.
2. Forward packets toward the destination.
```

---

## Q3. What is a routing table?

A routing table is a table used by a router to decide where to forward packets.

---

## Q4. What is a directly connected route?

It is a route to a network directly connected to one of the router’s active interfaces.

---

## Q5. What is a remote route?

It is a route to a network that is not directly connected to the router.

---

## Q6. What is a default route?

A default route is used when no more specific route matches the destination.

---

## Q7. What is the longest match?

The longest match is the most specific matching route in the routing table.

---

## Q8. What is a metric?

A metric is a value used by routing protocols to compare paths.

---

## Q9. What is Administrative Distance?

Administrative Distance measures the trustworthiness of a route source.

---

## Q10. Which is preferred, lower or higher AD?

Lower AD is preferred.

---

## Q11. What is process switching?

Process switching forwards packets by using the CPU to check every packet.

---

## Q12. What is fast switching?

Fast switching uses a cache to reuse next-hop information for repeated destinations.

---

## Q13. What is CEF?

CEF, or Cisco Express Forwarding, is the preferred Cisco IOS forwarding mechanism that uses the FIB and adjacency table.

---

## Q14. What does `S` mean in the routing table?

`S` means static route.

---

## Q15. What does `C` mean?

`C` means directly connected route.

---

## Q16. What does `L` mean?

`L` means local route, which represents the router’s own interface IP.

---

## Q17. What is the IPv4 static route command format?

```bash
ip route network mask {next-hop-ip | exit-intf}
```

---

## Q18. What is the IPv4 default static route command?

```bash
ip route 0.0.0.0 0.0.0.0 next-hop-ip
```

---

## Q19. What is the IPv6 default route?

```text
::/0
```

---

## Q20. What is a floating static route?

A floating static route is a backup static route with a higher AD than the primary route.

---

## Q21. What is a host route?

A host route is a route to one exact IP address.

---

## Q22. What prefix length is used for IPv4 host route?

```text
/32
```

---

## Q23. What prefix length is used for IPv6 host route?

```text
/128
```

---

## Q24. What is dynamic routing?

Dynamic routing allows routers to automatically learn and share routes using routing protocols.

---

## Q25. What is convergence?

Convergence is when routers have finished exchanging updates and their routing tables are updated.

---

# 25. Mini Checkpoint

Try answering these:

1. What does a router use to decide where to forward packets?
2. What is the difference between a directly connected route and a remote route?
3. When is a default route used?
4. Which is more specific: `/24` or `/26`?
5. Which is preferred: AD 1 or AD 120?
6. In `[110/20]`, which number is AD?
7. In `[110/20]`, which number is metric?
8. What does `S` mean in `show ip route`?
9. What does `C` mean?
10. What does `L` mean?
11. What is the command for an IPv4 default route?
12. Why does a floating static route need higher AD?
13. What does `/32` mean in IPv4?
14. What does `/128` mean in IPv6?
15. What command checks interface status?
16. What command checks the routing table?
17. What command tests connectivity?
18. What command shows the path to the destination?
19. What is dynamic routing?
20. What are the three dynamic routing protocol components?

---

# 26. Final Chapter 11 Summary

Routing is about moving packets between different networks.

The router:

```text
Receives packet
        ↓
Checks destination IP
        ↓
Looks in routing table
        ↓
Chooses best route using longest match
        ↓
Forwards packet
```

Important ideas:

```text
Routing table = router's map
Longest match = most specific route
Metric = path cost
AD = route source trustworthiness
Static route = manually configured
Default route = used when no specific route matches
Floating static route = backup static route
Host route = route to one exact IP
Dynamic routing = routers learn routes automatically
Convergence = routers finish updating route information
```

You have now finished **Chapter 11: Routing**.
