# Chapter 10: DHCP 

## 1. Chapter Overview

DHCP means **Dynamic Host Configuration Protocol**.

DHCP is used to automatically give network configuration information to devices.

A client device usually needs:

```text
IP address
Subnet mask / prefix length
Default gateway
DNS server
Lease time
```

Without DHCP, the network administrator must configure every device manually.

With DHCP, the device can receive its settings automatically.

---

# 2. DHCPv4

## 2.1 What is DHCPv4?

**DHCPv4** is used to dynamically assign IPv4 addresses and other IPv4 network information to clients.

Example:

```text
PC joins network
↓
PC asks for IPv4 settings
↓
DHCPv4 server gives:
- IPv4 address
- Subnet mask
- Default gateway
- DNS server
```

---

## 2.2 Why DHCPv4 is Needed

Without DHCP:

```text
PC1 → manually configure IP
PC2 → manually configure IP
PC3 → manually configure IP
```

This is slow and easy to make mistakes.

With DHCP:

```text
PC connects
↓
DHCP server gives IP automatically
↓
PC can communicate on the network
```

DHCP saves time and reduces configuration errors.

---

# 3. DHCPv4 Allocation Types

There are two main DHCPv4 allocation methods:

```text
1. Automatic allocation
2. Dynamic allocation
```

---

## 3.1 Automatic Allocation

## What it means

The DHCP server permanently assigns an IPv4 address to a device.

Example:

```text
Printer always gets 192.168.1.20
```

There is no lease time because the address is permanently assigned.

## Why we need it

Some devices should always use the same IP address.

Examples:

```text
Printer
Server
Network storage device
```

---

## 3.2 Dynamic Allocation

## What it means

The DHCP server leases an IPv4 address to a device for a limited time.

Example:

```text
Laptop gets 192.168.1.50 for 1 day
```

After the lease expires, the client must renew the address.

## Why we need it

This is useful for normal user devices.

Examples:

```text
Laptop
Phone
Tablet
Guest Wi-Fi device
```

These devices come and go, so their IP addresses do not need to be permanent.

---

## 3.3 Automatic vs Dynamic Allocation

| Type                 | Meaning                 | Lease? | Example                     |
| -------------------- | ----------------------- | ------ | --------------------------- |
| Automatic allocation | Permanent IP assignment | No     | Printer always gets same IP |
| Dynamic allocation   | Temporary IP lease      | Yes    | Laptop gets IP for 1 day    |

---

# 4. DHCPv4 DORA Process

DHCPv4 uses a four-step process called **DORA**.

```text
D = Discover
O = Offer
R = Request
A = Acknowledgment
```

Diagram:

```text
Client                          DHCP Server
  |                                  |
  | ---- DHCP Discover ------------> |
  |                                  |
  | <---- DHCP Offer --------------- |
  |                                  |
  | ---- DHCP Request -------------> |
  |                                  |
  | <---- DHCP ACK ----------------- |
  |                                  |
```

---

## 4.1 DHCP Discover

## What it means

The client sends a **DHCPDISCOVER** message to find a DHCP server.

At this time, the client does not know:

```text
Its own IP address
DHCP server IP address
Default gateway
DNS server
```

So it sends a broadcast message.

Example:

```text
Source IP: 0.0.0.0
Destination IP: 255.255.255.255
```

Simple meaning:

```text
Client: "Is there any DHCP server here?"
```

---

## 4.2 DHCP Offer

## What it means

The DHCP server replies with a **DHCPOFFER** message.

Simple meaning:

```text
Server: "I can give you this IP address."
```

Example offer:

```text
IP address:      192.168.1.25
Subnet mask:     255.255.255.0
Default gateway: 192.168.1.1
DNS server:      8.8.8.8
Lease time:      1 day
```

Important:

```text
Offer does not mean final confirmation yet.
```

The client has not fully accepted the IP address yet.

---

## 4.3 DHCP Request

## What it means

The client sends a **DHCPREQUEST** message.

Simple meaning:

```text
Client: "I accept this DHCP server's offer."
```

If multiple DHCP servers reply, the client chooses one offer.

Example:

```text
Server A offers 192.168.1.25
Server B offers 192.168.1.80

Client chooses Server A
```

The DHCPREQUEST is broadcast so all DHCP servers know which offer was accepted.

---

## 4.4 DHCP Acknowledgment

## What it means

The DHCP server sends **DHCPACK**.

ACK means acknowledgment.

Simple meaning:

```text
Server: "Confirmed. You can use this IP address."
```

After receiving DHCPACK, the client can start using the IPv4 address.

---

## 4.5 DORA Summary

```text
Discover:
Client finds DHCP server.

Offer:
Server offers IP settings.

Request:
Client accepts the offer.

Acknowledgment:
Server confirms the lease.
```

---

# 5. DHCPv4 Lease Renewal

## What it means

In dynamic allocation, the IP address is leased for a limited time.

When the lease is close to expiring, the client tries to renew it.

Example:

```text
Client has IP: 192.168.1.25
Lease time: 1 day
```

Before the lease expires, the client asks:

```text
"Can I continue using 192.168.1.25?"
```

If the server agrees, it sends DHCPACK.

---

# 6. DHCPv4 UDP Ports

DHCPv4 uses UDP.

Important port numbers:

| Device        | UDP Port |
| ------------- | -------- |
| DHCPv4 Server | 67       |
| DHCPv4 Client | 68       |

Easy memory:

```text
Server = 67
Client = 68
```

Example:

```text
Client sends DHCP Discover:
Source port: 68
Destination port: 67
```

---

# 7. DHCPv4 Configuration on Cisco Router

A Cisco router can be configured as a DHCPv4 server.

Main steps:

```text
Step 1: Exclude IPv4 addresses
Step 2: Create DHCP pool
Step 3: Configure network, gateway, DNS, domain name, and lease
```

---

## 7.1 Excluding IPv4 Addresses

## What it means

Some IP addresses should not be given to normal clients.

Examples:

```text
Router IP
Server IP
Printer IP
```

These devices usually need static IP addresses.

---

## Why we need it

Example:

```text
Router IP: 192.168.1.1
```

If DHCP gives `192.168.1.1` to a PC, there will be an IP conflict.

Wrong:

```text
Router: 192.168.1.1
PC:     192.168.1.1
```

Correct:

```text
Exclude 192.168.1.1 from DHCP pool
```

---

## Command

Exclude one address:

```text
Router(config)# ip dhcp excluded-address 192.168.1.1
```

Exclude a range:

```text
Router(config)# ip dhcp excluded-address 192.168.1.1 192.168.1.10
```

Meaning:

```text
Do not assign 192.168.1.1 to 192.168.1.10 to DHCP clients.
```

---

## 7.2 Create DHCP Pool

## What it means

A DHCP pool is a group of IP addresses and settings that the router can assign to clients.

Command:

```text
Router(config)# ip dhcp pool LAN_POOL
```

Meaning:

```text
Create a DHCP pool named LAN_POOL.
```

The pool name can be anything, but meaningful names are better.

Examples:

```text
LAN_POOL
STUDENT_POOL
VLAN10_POOL
```

---

## 7.3 Configure Network

Command:

```text
Router(dhcp-config)# network 192.168.1.0 255.255.255.0
```

Meaning:

```text
This DHCP pool is for network 192.168.1.0/24.
```

---

## 7.4 Configure Default Gateway

Command:

```text
Router(dhcp-config)# default-router 192.168.1.1
```

Meaning:

```text
Tell DHCP clients to use 192.168.1.1 as their default gateway.
```

The default gateway should usually be the router interface IP address in the client’s subnet.

---

## 7.5 Configure DNS Server

Command:

```text
Router(dhcp-config)# dns-server 8.8.8.8
```

Meaning:

```text
Tell DHCP clients to use 8.8.8.8 as DNS server.
```

Multiple DNS servers:

```text
Router(dhcp-config)# dns-server 8.8.8.8 1.1.1.1
```

---

## 7.6 Configure Domain Name

Command:

```text
Router(dhcp-config)# domain-name example.com
```

Meaning:

```text
Give clients the domain name example.com.
```

---

## 7.7 Configure Lease Time

The default lease time is one day.

Command:

```text
Router(dhcp-config)# lease 7
```

Meaning:

```text
Lease time is 7 days.
```

Command with days, hours, minutes:

```text
Router(dhcp-config)# lease 0 12 0
```

Meaning:

```text
0 days, 12 hours, 0 minutes
```

So the lease is 12 hours.

---

# 8. Full DHCPv4 Configuration Example

## Scenario

```text
Router LAN IP:       192.168.1.1/24
Network:             192.168.1.0/24
Excluded addresses:  192.168.1.1 - 192.168.1.10
DHCP pool name:      LAN_POOL
DNS server:          8.8.8.8
Domain name:         example.com
Lease:               7 days
```

## Configuration

```text
Router> enable
Router# configure terminal

Router(config)# ip dhcp excluded-address 192.168.1.1 192.168.1.10

Router(config)# ip dhcp pool LAN_POOL
Router(dhcp-config)# network 192.168.1.0 255.255.255.0
Router(dhcp-config)# default-router 192.168.1.1
Router(dhcp-config)# dns-server 8.8.8.8
Router(dhcp-config)# domain-name example.com
Router(dhcp-config)# lease 7
Router(dhcp-config)# exit

Router(config)# interface gigabitEthernet 0/0
Router(config-if)# ip address 192.168.1.1 255.255.255.0
Router(config-if)# no shutdown
Router(config-if)# exit

Router(config)# exit
Router# write memory
```

---

# 9. DHCPv4 Verification Commands

Show DHCP-related configuration:

```text
Router# show running-config | section dhcp
```

Example output:

```text
ip dhcp excluded-address 192.168.1.1 192.168.1.10
ip dhcp pool LAN_POOL
 network 192.168.1.0 255.255.255.0
 default-router 192.168.1.1
 dns-server 8.8.8.8
 domain-name example.com
 lease 7
```

Disable DHCP service:

```text
Router(config)# no service dhcp
```

Enable DHCP service again:

```text
Router(config)# service dhcp
```

---

# 10. DHCP Relay

## 10.1 The Problem

DHCP Discover uses broadcast.

Routers do not normally forward broadcasts.

Example:

```text
PC ---- Switch ---- Router ---- DHCP Server
```

If the PC and DHCP server are on different networks, the DHCP Discover broadcast cannot normally reach the DHCP server.

---

## 10.2 What is DHCP Relay?

DHCP relay allows a router to forward DHCP broadcast messages to a DHCP server on another network.

Simple flow:

```text
Client sends DHCP Discover broadcast
↓
Router receives it
↓
Router forwards it to DHCP server
↓
DHCP server replies
↓
Client gets IP address
```

---

## 10.3 `ip helper-address`

Cisco command:

```text
Router(config-if)# ip helper-address <DHCP-server-IP>
```

Example:

```text
Router(config-if)# ip helper-address 192.168.20.10
```

Meaning:

```text
Forward DHCP messages to DHCP server 192.168.20.10.
```

---

## 10.4 Where to Configure `ip helper-address`

Configure it on the interface that receives the DHCP broadcast from the client.

This is usually the **client-facing interface**.

Example:

```text
PC ---- Switch ---- G0/0 Router G0/1 ---- DHCP Server
```

If PC is on G0/0 side:

```text
Router(config)# interface g0/0
Router(config-if)# ip helper-address 192.168.20.10
```

Do not configure it only on the server-facing interface.

---

## 10.5 DHCP Relay Example

Scenario:

```text
Client network: 192.168.10.0/24
Router G0/0:    192.168.10.1
DHCP server:    192.168.20.10
Server network: 192.168.20.0/24
```

Configuration:

```text
Router> enable
Router# configure terminal

Router(config)# interface gigabitEthernet 0/0
Router(config-if)# ip address 192.168.10.1 255.255.255.0
Router(config-if)# ip helper-address 192.168.20.10
Router(config-if)# no shutdown
Router(config-if)# exit

Router(config)# interface gigabitEthernet 0/1
Router(config-if)# ip address 192.168.20.1 255.255.255.0
Router(config-if)# no shutdown
Router(config-if)# exit
```

---

## 10.6 UDP Services Forwarded by `ip helper-address`

By default, `ip helper-address` forwards eight UDP services:

| UDP Port | Service                  |
| -------- | ------------------------ |
| 37       | Time                     |
| 49       | TACACS                   |
| 53       | DNS                      |
| 67       | DHCP/BOOTP client        |
| 68       | DHCP/BOOTP server        |
| 69       | TFTP                     |
| 137      | NetBIOS name service     |
| 138      | NetBIOS datagram service |

For beginner level, focus mainly on:

```text
UDP 67
UDP 68
```

---

# 11. DHCPv6

## 11.1 IPv6 Address Assignment Methods

IPv6 global unicast addresses can be assigned dynamically using:

```text
1. SLAAC
2. Stateless DHCPv6
3. Stateful DHCPv6
```

---

# 12. SLAAC

## What it means

SLAAC means:

```text
Stateless Address Autoconfiguration
```

In SLAAC, the client creates its own IPv6 address.

Simple flow:

```text
Router sends RA message
↓
Client learns IPv6 prefix
↓
Client creates its own IPv6 address
```

Example:

```text
Router prefix: 2001:DB8:ACAD:1::/64
Client address: 2001:DB8:ACAD:1::A21B
```

---

## Why we need SLAAC

SLAAC allows IPv6 devices to automatically configure themselves without needing a DHCPv6 server for the address.

---

# 13. Stateless DHCPv6

## What it means

In stateless DHCPv6:

```text
Client creates IPv6 address using SLAAC
DHCPv6 server gives other information
```

Other information may include:

```text
DNS server
Domain name
```

Easy memory:

```text
Stateless DHCPv6:
Address = client creates
Other info = DHCPv6 gives
```

---

# 14. Stateful DHCPv6

## What it means

In stateful DHCPv6:

```text
DHCPv6 server gives IPv6 address
DHCPv6 server gives other information
```

This is more similar to DHCPv4.

Easy memory:

```text
Stateful DHCPv6:
Address = DHCPv6 server gives
Other info = DHCPv6 server gives
```

---

# 15. SLAAC vs Stateless DHCPv6 vs Stateful DHCPv6

| Method           | Who gives IPv6 address? | Who gives DNS / other info? |
| ---------------- | ----------------------- | --------------------------- |
| SLAAC            | Client creates address  | RA or other method          |
| Stateless DHCPv6 | Client creates address  | DHCPv6 server               |
| Stateful DHCPv6  | DHCPv6 server           | DHCPv6 server               |

---

# 16. RA Flags: M Flag and O Flag

Router Advertisement, or RA, messages contain flags that tell IPv6 clients how to get addressing information.

Important flags:

```text
M flag = Managed Address Configuration flag
O flag = Other Configuration flag
```

---

## 16.1 M Flag

## What it means

M flag means **Managed Address Configuration**.

If the M flag is set:

```text
Client should use DHCPv6 to get IPv6 address.
```

Usually this means **stateful DHCPv6**.

Command:

```text
Router(config-if)# ipv6 nd managed-config-flag
```

Easy memory:

```text
M = Managed
Managed = DHCPv6 manages the address
```

---

## 16.2 O Flag

## What it means

O flag means **Other Configuration**.

If the O flag is set:

```text
Client should use DHCPv6 to get other information.
```

Example:

```text
DNS server
Domain name
```

Usually this means **stateless DHCPv6**.

Command:

```text
Router(config-if)# ipv6 nd other-config-flag
```

Easy memory:

```text
O = Other
Other = DNS and domain information
```

---

# 17. DHCPv6 UDP Ports

DHCPv6 uses UDP.

Important ports:

| Device        | UDP Port |
| ------------- | -------- |
| DHCPv6 Client | 546      |
| DHCPv6 Server | 547      |

Simple:

```text
Client sends to server: destination port 547
Server sends to client: destination port 546
```

Comparison:

| DHCP Version | Server Port | Client Port |
| ------------ | ----------- | ----------- |
| DHCPv4       | 67          | 68          |
| DHCPv6       | 547         | 546         |

---

# 18. DHCPv6 Messages

Important DHCPv6 messages:

```text
SOLICIT
ADVERTISE
INFORMATION-REQUEST
REQUEST
REPLY
```

---

## 18.1 SOLICIT

The client sends a SOLICIT message to find DHCPv6 servers.

It sends to multicast address:

```text
FF02::1:2
```

This is the all-DHCPv6-servers multicast address.

IPv6 does not use broadcast.

---

## 18.2 ADVERTISE

The DHCPv6 server replies with ADVERTISE.

Simple meaning:

```text
Server: "I am available for DHCPv6 service."
```

---

## 18.3 INFORMATION-REQUEST

Used in stateless DHCPv6.

The client already has an IPv6 address, but asks for extra information.

Example:

```text
Client: "Please give me DNS server information."
```

---

## 18.4 REQUEST

Used in stateful DHCPv6.

The client asks the DHCPv6 server for an IPv6 address and other configuration information.

---

## 18.5 REPLY

The DHCPv6 server sends REPLY with the requested information.

---

# 19. DHCPv4 vs DHCPv6 Message Comparison

| DHCPv4   | DHCPv6    |
| -------- | --------- |
| Discover | Solicit   |
| Offer    | Advertise |
| Request  | Request   |
| ACK      | Reply     |

Memory:

```text
DHCPv4 = DORA
DHCPv6 = Solicit, Advertise, Request, Reply
```

---

# 20. DHCPv6 Configuration

## 20.1 Enable IPv6 Routing

Command:

```text
Router(config)# ipv6 unicast-routing
```

Meaning:

```text
Enable IPv6 routing on the router.
```

---

# 21. Stateless DHCPv6 Configuration

## Scenario

```text
Network prefix: 2001:DB8:ACAD:1::/64
Router G0/0:   2001:DB8:ACAD:1::1/64
DNS server:    2001:4860:4860::8888
Domain name:   example.com
```

## Configuration

```text
Router> enable
Router# configure terminal

Router(config)# ipv6 unicast-routing

Router(config)# ipv6 dhcp pool STATELESS_POOL
Router(config-dhcpv6)# dns-server 2001:4860:4860::8888
Router(config-dhcpv6)# domain-name example.com
Router(config-dhcpv6)# exit

Router(config)# interface gigabitEthernet 0/0
Router(config-if)# ipv6 address 2001:DB8:ACAD:1::1/64
Router(config-if)# ipv6 dhcp server STATELESS_POOL
Router(config-if)# ipv6 nd other-config-flag
Router(config-if)# no shutdown
```

## Important idea

```text
Stateless DHCPv6 does not give the IPv6 address.
```

The client creates the IPv6 address using SLAAC.

DHCPv6 gives other information such as DNS.

---

# 22. Stateful DHCPv6 Configuration

## Scenario

```text
Network prefix: 2001:DB8:ACAD:1::/64
Router G0/0:   2001:DB8:ACAD:1::1/64
DNS server:    2001:4860:4860::8888
Domain name:   example.com
```

## Configuration

```text
Router> enable
Router# configure terminal

Router(config)# ipv6 unicast-routing

Router(config)# ipv6 dhcp pool STATEFUL_POOL
Router(config-dhcpv6)# address prefix 2001:DB8:ACAD:1::/64
Router(config-dhcpv6)# dns-server 2001:4860:4860::8888
Router(config-dhcpv6)# domain-name example.com
Router(config-dhcpv6)# exit

Router(config)# interface gigabitEthernet 0/0
Router(config-if)# ipv6 address 2001:DB8:ACAD:1::1/64
Router(config-if)# ipv6 dhcp server STATEFUL_POOL
Router(config-if)# ipv6 nd managed-config-flag
Router(config-if)# no shutdown
```

## Important idea

```text
Stateful DHCPv6 gives the IPv6 address.
```

The DHCPv6 server provides both address and other information.

---

# 23. DHCPv6 Verification Commands

Show DHCPv6 pool:

```text
Router# show ipv6 dhcp pool
```

Show DHCPv6 bindings:

```text
Router# show ipv6 dhcp binding
```

Show IPv6 interface information:

```text
Router# show ipv6 interface gigabitEthernet 0/0
```

Show running configuration:

```text
Router# show running-config
```

---

# 24. DHCPv6 Relay

## 24.1 What it means

DHCPv6 relay is used when the DHCPv6 client and DHCPv6 server are on different networks.

Simple flow:

```text
DHCPv6 client
↓
Router relay agent
↓
DHCPv6 server
```

---

## 24.2 DHCPv6 Relay Command

Command:

```text
Router(config-if)# ipv6 dhcp relay destination <DHCPv6-server-address>
```

Example:

```text
Router(config-if)# ipv6 dhcp relay destination 2001:DB8:ACAD:20::10
```

Meaning:

```text
Forward DHCPv6 messages to DHCPv6 server 2001:DB8:ACAD:20::10.
```

---

## 24.3 Where to Configure DHCPv6 Relay

Configure it on the interface facing the DHCPv6 client.

Example:

```text
PC ---- Switch ---- G0/0 Router G0/1 ---- DHCPv6 Server
```

If the PC is on G0/0 side:

```text
Router(config)# interface g0/0
Router(config-if)# ipv6 dhcp relay destination 2001:DB8:ACAD:20::10
```

---

## 24.4 DHCPv4 Relay vs DHCPv6 Relay

| Feature          | DHCPv4 Relay            | DHCPv6 Relay                  |
| ---------------- | ----------------------- | ----------------------------- |
| Command          | `ip helper-address`     | `ipv6 dhcp relay destination` |
| Client discovery | Broadcast               | Multicast                     |
| Configure on     | Client-facing interface | Client-facing interface       |
| Ports            | UDP 67, 68              | UDP 546, 547                  |

---

# 25. DHCP Attacks

There are two main DHCP attacks in this chapter:

```text
1. DHCP starvation attack
2. DHCP spoofing attack
```

---

# 26. DHCP Starvation Attack

## What it means

A DHCP starvation attack happens when an attacker uses up all available IP addresses in the DHCP pool.

Simple flow:

```text
Attacker sends many DHCP requests
↓
DHCP server gives out many IP addresses
↓
DHCP pool becomes empty
↓
Normal users cannot get IP addresses
```

---

## Example

DHCP pool has:

```text
192.168.1.10
192.168.1.11
192.168.1.12
```

Attacker consumes all addresses.

Then a real user connects:

```text
User: "Can I have an IP address?"
DHCP server: "No available IP address."
```

The user cannot access the network.

---

## Effect

DHCP starvation causes a **Denial-of-Service**, or **DoS**, attack.

Meaning:

```text
Normal users are denied network access.
```

---

# 27. DHCP Spoofing Attack

## What it means

A DHCP spoofing attack happens when an attacker creates a fake DHCP server.

Simple diagram:

```text
PC ---- Switch ---- Real DHCP Server
       |
       └------ Fake DHCP Server
```

The fake DHCP server gives wrong network settings to clients.

---

## Dangerous settings from fake DHCP server

A fake DHCP server can give:

```text
Wrong IP address
Wrong default gateway
Wrong DNS server
```

The most dangerous is often the default gateway.

Example:

```text
Normal:
PC → Real Router → Internet

Attack:
PC → Attacker → Internet
```

This can allow the attacker to intercept traffic.

---

# 28. DHCP Starvation vs DHCP Spoofing

| Attack          | What attacker does          | Main effect                    |
| --------------- | --------------------------- | ------------------------------ |
| DHCP starvation | Uses up DHCP pool addresses | Normal users cannot get IP     |
| DHCP spoofing   | Creates fake DHCP server    | Clients receive wrong settings |

Memory:

```text
Starvation = no IP left
Spoofing = fake DHCP server
```

---

# 29. DHCP Snooping

## 29.1 What it means

DHCP snooping is a switch security feature.

It checks whether DHCP messages come from trusted or untrusted ports.

Simple meaning:

```text
DHCP snooping = switch watches DHCP traffic
```

---

## 29.2 Why we need DHCP Snooping

DHCP snooping helps prevent rogue DHCP servers.

Without DHCP snooping:

```text
Attacker sends fake DHCP Offer
↓
Client may accept wrong gateway/DNS
```

With DHCP snooping:

```text
Switch checks the port
↓
If DHCP server message comes from untrusted port, block it
```

---

# 30. Trusted and Untrusted Ports

## 30.1 Trusted Port

A trusted port is allowed to send DHCP server messages.

Usually connected to:

```text
Real DHCP server
Router
Trusted trunk link
Network device controlled by admin
```

Command:

```text
Switch(config-if)# ip dhcp snooping trust
```

---

## 30.2 Untrusted Port

An untrusted port is usually connected to normal client devices.

Examples:

```text
PC
Laptop
Student device
Guest device
```

Access ports are usually untrusted.

Untrusted ports can send DHCP client requests, but not DHCP server replies.

---

# 31. DHCP Snooping Binding Table

DHCP snooping creates a binding table.

It records:

```text
Client MAC address
Client IP address
VLAN
Interface
Lease information
```

Example:

```text
MAC Address        IP Address       VLAN   Interface
AAAA.BBBB.CCCC     192.168.1.20     10     Fa0/1
DDDD.EEEE.FFFF     192.168.1.21     10     Fa0/2
```

Meaning:

```text
The switch knows which MAC address owns which IP address.
```

---

# 32. DHCP Snooping Configuration

Main steps:

```text
Step 1: Enable DHCP snooping globally
Step 2: Enable DHCP snooping for VLAN
Step 3: Trust legitimate DHCP server port
Step 4: Rate-limit DHCP packets on untrusted ports
```

---

## 32.1 Enable DHCP Snooping Globally

```text
Switch(config)# ip dhcp snooping
```

---

## 32.2 Enable DHCP Snooping for VLAN

```text
Switch(config)# ip dhcp snooping vlan 10
```

For multiple VLANs:

```text
Switch(config)# ip dhcp snooping vlan 10,20,30
```

---

## 32.3 Configure Trusted Port

Example:

```text
Switch(config)# interface fa0/24
Switch(config-if)# ip dhcp snooping trust
```

Meaning:

```text
DHCP server messages from Fa0/24 are allowed.
```

---

## 32.4 Limit DHCP Rate on Untrusted Port

Command:

```text
Switch(config-if)# ip dhcp snooping limit rate 5
```

Meaning:

```text
Allow only 5 DHCP packets per second on this port.
```

This helps reduce DHCP starvation attacks.

---

# 33. Full DHCP Snooping Example

## Scenario

```text
VLAN 10 = user VLAN
Fa0/1 = PC1
Fa0/2 = PC2
Fa0/24 = uplink to router / DHCP server
```

## Configuration

```text
Switch> enable
Switch# configure terminal

Switch(config)# ip dhcp snooping
Switch(config)# ip dhcp snooping vlan 10

Switch(config)# interface fa0/24
Switch(config-if)# ip dhcp snooping trust
Switch(config-if)# exit

Switch(config)# interface range fa0/1 - 23
Switch(config-if-range)# ip dhcp snooping limit rate 5
Switch(config-if-range)# exit
```

---

# 34. DHCP Snooping Verification Commands

Show DHCP snooping status:

```text
Switch# show ip dhcp snooping
```

Show DHCP snooping binding table:

```text
Switch# show ip dhcp snooping binding
```

---

# 35. DHCP Relay vs DHCP Snooping

| Feature           | DHCP Relay                                          | DHCP Snooping                           |
| ----------------- | --------------------------------------------------- | --------------------------------------- |
| Purpose           | Forward DHCP messages to server on another network  | Protect network from fake DHCP messages |
| Main command      | `ip helper-address` / `ipv6 dhcp relay destination` | `ip dhcp snooping`                      |
| Main device       | Router or Layer 3 device                            | Switch                                  |
| Security feature? | Not mainly                                          | Yes                                     |

Simple memory:

```text
DHCP relay = helps DHCP messages reach server
DHCP snooping = protects against fake DHCP messages
```

---

# 36. Common Mistakes

## Mistake 1: Confusing DHCP Offer and DHCP ACK

```text
Offer = server suggests IP settings
ACK = server confirms IP settings
```

---

## Mistake 2: Forgetting to exclude router IP

Wrong:

```text
Router IP is inside DHCP pool
```

Correct:

```text
ip dhcp excluded-address 192.168.1.1
```

---

## Mistake 3: Wrong default gateway in DHCP pool

The default gateway should be in the same subnet as the client.

Correct:

```text
Client IP:       192.168.10.50
Default gateway: 192.168.10.1
```

Wrong:

```text
Client IP:       192.168.10.50
Default gateway: 192.168.20.10
```

---

## Mistake 4: Configuring `ip helper-address` on the wrong interface

Correct:

```text
Configure it on the client-facing interface.
```

---

## Mistake 5: Thinking IPv6 uses broadcast

IPv6 does not use broadcast.

IPv6 uses multicast.

DHCPv6 uses:

```text
FF02::1:2
```

---

## Mistake 6: Confusing stateless and stateful DHCPv6

```text
Stateless = client creates IPv6 address, DHCPv6 gives other info
Stateful = DHCPv6 gives IPv6 address and other info
```

---

## Mistake 7: Forgetting to trust the real DHCP server port

If DHCP snooping is enabled but the real DHCP server port is not trusted, real DHCP replies may be blocked.

---

## Mistake 8: Trusting user access ports

Do not trust normal PC ports.

Trusted ports should connect to legitimate DHCP servers, routers, or trusted uplinks.

---

# 37. Viva / Exam-Style Questions

## Question 1

What does DHCP do?

## Answer

DHCP automatically assigns IP addresses and other network configuration information to clients.

---

## Question 2

What does DORA stand for?

## Answer

```text
Discover
Offer
Request
Acknowledgment
```

---

## Question 3

Which UDP ports are used by DHCPv4?

## Answer

```text
Server: UDP 67
Client: UDP 68
```

---

## Question 4

Which UDP ports are used by DHCPv6?

## Answer

```text
Client: UDP 546
Server: UDP 547
```

---

## Question 5

What is the purpose of `ip dhcp excluded-address`?

## Answer

It prevents specific IP addresses from being assigned to DHCP clients.

---

## Question 6

What does `default-router` configure in a DHCP pool?

## Answer

It gives clients their default gateway address.

---

## Question 7

What command is used for DHCPv4 relay?

## Answer

```text
ip helper-address
```

---

## Question 8

Where should `ip helper-address` be configured?

## Answer

On the interface that receives DHCP broadcasts from the client.

---

## Question 9

What are the three IPv6 dynamic address methods?

## Answer

```text
SLAAC
Stateless DHCPv6
Stateful DHCPv6
```

---

## Question 10

What does the O flag mean?

## Answer

The O flag means Other Configuration. It tells the client to use DHCPv6 for other information such as DNS.

---

## Question 11

What does the M flag mean?

## Answer

The M flag means Managed Address Configuration. It tells the client to use DHCPv6 to get an IPv6 address.

---

## Question 12

What is the DHCPv6 relay command?

## Answer

```text
ipv6 dhcp relay destination
```

---

## Question 13

What is DHCP starvation?

## Answer

DHCP starvation is an attack where the attacker uses up all available IP addresses in the DHCP pool.

---

## Question 14

What is DHCP spoofing?

## Answer

DHCP spoofing is an attack where the attacker creates a fake DHCP server to give clients wrong network settings.

---

## Question 15

What is DHCP snooping?

## Answer

DHCP snooping is a switch security feature that checks DHCP messages and blocks untrusted DHCP server messages.

---

## Question 16

Which ports should be trusted in DHCP snooping?

## Answer

Ports connected to legitimate DHCP servers, routers, or trusted uplinks should be trusted.

---

## Question 17

Are access ports usually trusted or untrusted?

## Answer

Access ports are usually untrusted.

---

## Question 18

What is stored in the DHCP snooping binding table?

## Answer

It stores MAC address, IP address, VLAN, interface, and lease information.

---

# 38. Mini Checkpoint

Answer these before moving to Chapter 11:

1. What does DHCP stand for?
2. What are the four steps of DORA?
3. Which DHCPv4 port is used by the server?
4. Which DHCPv4 port is used by the client?
5. Why do we exclude some DHCP addresses?
6. What command creates a DHCPv4 pool?
7. What command configures DHCPv4 relay?
8. Where should `ip helper-address` be configured?
9. Does IPv6 use broadcast?
10. What multicast address is used by DHCPv6 clients?
11. What is the difference between stateless and stateful DHCPv6?
12. What does the O flag mean?
13. What does the M flag mean?
14. What is DHCP starvation?
15. What is DHCP spoofing?
16. What is DHCP snooping?
17. What is a trusted port?
18. What is an untrusted port?
19. What command enables DHCP snooping?
20. What command shows DHCP snooping binding table?

---

# 39. Mini Checkpoint Answers

```text
1. Dynamic Host Configuration Protocol.

2. Discover, Offer, Request, Acknowledgment.

3. UDP 67.

4. UDP 68.

5. To prevent important/static IP addresses from being assigned to clients.

6. ip dhcp pool <pool-name>

7. ip helper-address <DHCP-server-IP>

8. On the client-facing interface.

9. No. IPv6 uses multicast.

10. FF02::1:2

11. Stateless DHCPv6: client creates IPv6 address using SLAAC, DHCPv6 gives other info.
    Stateful DHCPv6: DHCPv6 server gives IPv6 address and other info.

12. O flag means Other Configuration.

13. M flag means Managed Address Configuration.

14. DHCP starvation uses up all IP addresses in the DHCP pool.

15. DHCP spoofing uses a fake DHCP server to give wrong settings.

16. DHCP snooping is a switch security feature that filters DHCP messages.

17. Trusted port allows DHCP server messages.

18. Untrusted port usually connects to normal client devices and blocks DHCP server replies.

19. ip dhcp snooping

20. show ip dhcp snooping binding
```

---

# 40. Final Chapter 10 Summary

DHCP is used to automatically assign network configuration to clients.

For IPv4, DHCPv4 uses the DORA process:

```text
Discover → Offer → Request → Acknowledgment
```

DHCPv4 uses:

```text
Server port 67
Client port 68
```

A Cisco router can act as a DHCPv4 server using:

```text
ip dhcp excluded-address
ip dhcp pool
network
default-router
dns-server
domain-name
lease
```

When the DHCP server is on another network, DHCP relay is needed:

```text
ip helper-address
```

For IPv6, clients can use:

```text
SLAAC
Stateless DHCPv6
Stateful DHCPv6
```

Important DHCPv6 flags:

```text
O flag = other information
M flag = managed address
```

DHCPv6 uses:

```text
Client port 546
Server port 547
```

DHCPv6 relay uses:

```text
ipv6 dhcp relay destination
```

Main DHCP attacks:

```text
DHCP starvation = uses up all DHCP addresses
DHCP spoofing = fake DHCP server
```

Main protection:

```text
DHCP snooping
```

Important DHCP snooping commands:

```text
ip dhcp snooping
ip dhcp snooping vlan <vlan-id>
ip dhcp snooping trust
ip dhcp snooping limit rate <number>
show ip dhcp snooping
show ip dhcp snooping binding
```

Chapter 10 is complete.
