# WIA1005 Network Technology Foundations — Revision Notes

---

## Chapter 1: Introduction to Networks

### Computer Network

#### Service & Size

| Size | Description |
| --- | --- |
| Small Home Network | Few devices at home |
| SOHO | Small Office / Home Office |
| Medium | Mid-size organization |
| Enterprise | Large-scale corporate |
| World Wide | Internet-scale |

#### Architecture

- **Client/Server** — dedicated server provides resources
- **Peer-to-Peer** — devices share resources equally

#### Devices

- **End Devices** — PC, phone, printer
- **Intermediary Devices** — switch, router, firewall
- **Network Media**
  - Wired
  - Wireless

#### Documentation

- **Physical Topology** — actual layout of devices and cables
- **Logical Topology** — how data flows through the network

#### Network Types

| Type | Description |
| --- | --- |
| LAN | Local Area Network |
| WAN | Wide Area Network |
| WLAN | Wireless LAN |

#### Coverage

- **Intranet** — private, internal network
- **Extranet** — controlled access for external partners
- **Internet** — global public network

#### Internet Connection

| Home | Business |
| --- | --- |
| Cable | Leased Line |
| DSL | Metro Ethernet |
| Cellular | Business DSL |
| Satellite | |
| Dial-Up Telephone | |

#### Network Architecture Characteristics

- **Fault Tolerance** — continues working despite failures
- **Scalability** — can grow without performance loss
- **Quality of Service (QoS)** — manages traffic priority
- **Security**
  - Confidentiality
  - Integrity
  - Availability

#### Network Trends

- BYOD
- Collaboration
- Conferencing
- Cloud
- Smart Home
- Powerline Networking

#### Network Threats

- Virus
- Spyware
- Zero-day attack
- DoS
- Data Interception & Theft

#### Network Security Components

- Antivirus
- Firewall
- Intrusion Prevention System (IPS)
- VPN

---

## Chapter 2: Network Protocols & Communications

### Communication Entity

- **Source** → **Medium** → **Destination**

### Protocols

- Message encoding
- Message formatting and encapsulation
- Message size
- Message timing
- Message delivery

### Network Models

| OSI Layer | TCP/IP Layer |
| --- | --- |
| Application | Application |
| Presentation | Application |
| Session | Application |
| Transport | Transport |
| Network | Internet |
| Data Link | Network Access |
| Physical | Network Access |

### Communication Process

- **Segmentation** — break data into smaller pieces
- **Multiplexing** — interleave segments from multiple sources
- **Encapsulation** — add headers at each layer
- **De-encapsulation** — remove headers at each layer

### Protocol Data Unit (PDU)

| Layer | PDU |
| --- | --- |
| Application | Data |
| Transport | Segment |
| Internet | Packet |
| Network Access | Frame |
| Physical | Bits |

### Addressing

| Layer | Address Type |
| --- | --- |
| Data Link | Ethernet MAC address |
| Network | IP address (IPv4, IPv6) |

### Internetwork Operating System (IOS)

- Stored in **Flash Memory**
- Loaded into **RAM**

### Command-Line Interface (CLI)

#### Access Methods

- **Out of Band** — Console, AUX
- **In Band** — Telnet, SSH

#### Terminal Emulation Programs

- PuTTY
- TeraTerm

#### Access Modes

| Mode | Symbol | Description |
| --- | --- | --- |
| User | `>` | Limited monitoring |
| Privileged | `#` | Full monitoring |
| Global Configuration | `(config)#` | Device-wide settings |
| Specific Configuration | `(config-if)#` | Interface/line settings |

---

## Chapter 3: Network Access

### Physical Layer

#### Cable Types

- **Wired**
  - **Copper Cable**
    - Unshielded Twisted-Pair (UTP)
      - Ethernet Straight-through
      - Ethernet Crossover
      - Rollover
    - Shielded Twisted-Pair (STP)
    - Coaxial
  - **Fiber-Optic Cable**
    - Single-mode (laser)
    - Multimode (LED)
- **Wireless**

#### Connectors

| Cable | Connector |
| --- | --- |
| UTP | RJ-45 |
| Fiber | ST, SC, LC |

#### Physical Layer Functions

- **Encoding** — convert data to signals
- **Signaling**
  - Asynchronous
  - Synchronous
- **Modulation**
  - Frequency Modulation (FM)
  - Amplitude Modulation (AM)
  - Pulse-Coded Modulation (PCM)

#### Performance Measurement

| Metric | Description |
| --- | --- |
| Bandwidth | Maximum capacity (Mbps) |
| Throughput | Actual data transfer rate |
| Goodput | Usable data (excludes overhead) |

### Data Link Layer

#### Sub-layers

- **Logical Link Control (LLC)** — communicates with network layer
- **Media Access Control (MAC)** — controls media access

#### Access Methods

- **Contention-based** — CSMA/CD (wired)
- **Controlled** — CSMA/CA (wireless)

#### Frame Structure

| Header | Data | Trailer |
| --- | --- | --- |

#### Ethernet (802.3)

- **MAC / Physical Address** — 48 bits
- **Address Resolution Protocol (ARP)**
  - Resolves IPv4 → MAC address
  - Threat: ARP spoofing

#### Duplex Modes

- **Half Duplex** — one direction at a time
- **Full Duplex** — both directions simultaneously

#### Auto-MDIX

- Automatically detects cable type

---

## Chapter 4: Network & Transport Layer

### Network Layer

#### IP Addressing

| Version | Key Points |
| --- | --- |
| **IPv4** | IP depletion, routing table expansion, no end-to-end connectivity |
| **IPv6** | Larger address space, improved handling, no NAT, integrated security |

#### IP Characteristics

- **Connectionless** — no pre-established session
- **Best Effort** — no guaranteed delivery
- **Media Independent** — works over any medium

#### Routing

- Directly-connected routes
- Remote routes
- Default route

#### Default Gateway

- Routes traffic from local network → remote networks

#### ICMPv4 Tools

| Tool | Purpose |
| --- | --- |
| `ping` | Test connectivity (echo request / echo reply) |
| `traceroute` | Trace the path to a destination |

- Ping the **loopback** → Ping the **default gateway** → Ping the **remote host**

### Transport Layer

#### Port Numbers

- **Source Port** + **Destination Port** → end-to-end connection

#### Segmentation & Reassembly

- Break data into segments, reassemble at destination

#### TCP vs UDP

| Feature | TCP | UDP |
| --- | --- | --- |
| Connection | Connection-oriented (3-way handshake) | Connectionless |
| Reliability | Reliable (retransmission, timeout) | Unreliable |
| Ordering | Sequence numbers | No ordering |
| Flow Control | Window size | None |
| Speed | Slower | Faster |
| Applications | HTTP, FTP, SMTP, Telnet | DNS, SNMP, VoIP |

---

## Chapter 5: IPv4 Addressing & Subnetting

### IPv4 Address Structure

- **32 bits** → `a.b.c.d` (dotted decimal)
- **Network portion** + **Host portion**

### Address Types

| Type | Description |
| --- | --- |
| Network | Identifies the network |
| Host | Identifies a device |
| Broadcast | Sent to all devices |

### Key Formula

$$
\text{Network Address} = \text{IP} \;\text{AND}\; \text{Subnet Mask}
$$

### Address Categories

| Category | Range |
| --- | --- |
| Private (Class A) | `10.0.0.0/8` |
| Private (Class B) | `172.16.0.0/12` |
| Private (Class C) | `192.168.0.0/16` |
| Public | Assigned by ISP |

### Special Addresses

- **Loopback** — `127.0.0.1`
- **Link-local** — `169.254.0.0/16`

### Classful vs Classless

- **Classful** — A, B, C (D = Multicast)
- **Classless** — IP + Subnet Mask (CIDR)

### Testing Connectivity

- `ping` — ICMP Echo Request / Echo Reply
- `tracert` — Traceroute

### Subnetting

- Divide a network into smaller sub-networks
- **Network bits** = 32 − host bits
- **Usable hosts** = $2^{\text{host bits}} - 2$
- **VLSM** — Variable Length Subnet Mask (different-sized subnets)

---

## Chapter 6: IPv6

### IPv6 Address Structure

- **128 bits** → `X:X:X:X:X:X:X:X` (hexadecimal)
- Each `X` = 16 bits (4 hex digits)
- **Prefix** (64 bits) + **Interface ID** (64 bits)
- `::` omits consecutive zero groups

### Delivery Types

- **Unicast** — one-to-one
- **Multicast** — one-to-many
- **Anycast** — one-to-nearest

### Address Types

| Type | Prefix | Notes |
| --- | --- | --- |
| Global Unicast | `/48` routing + `/16` subnet | Routable on Internet |
| Link-Local | `FE80::/10` | Not routable |
| Loopback | `::1` | Self-test |
| Unspecified | `::/128` | No address assigned |
| Unique Local | `FC00::/7` to `FDFF::/7` | Private (like RFC 1918) |

### Multicast Addresses

| Address | Purpose |
| --- | --- |
| `FF02::1` | All-nodes multicast |
| `FF02::2` | All-routers multicast |
| `FF02::1:FF` + 24-bit ID | Solicited-node multicast |

### SLAAC (Stateless Address Auto Configuration)

- Host sends **Router Solicitation (RS)**
- Router responds with **Router Advertisement (RA)**
- Provides: prefix, prefix length, default gateway
- Enable: `ipv6 unicast-routing`

### Interface ID Generation

| Method | Description |
| --- | --- |
| Manual | Statically configured |
| Random | Uses DAD (Duplicate Address Detection) |
| EUI-64 | 48-bit MAC → insert `FFFE` → flip bit 7 |

### DAD (Duplicate Address Detection)

- Host sends **Neighbor Solicitation (NS)** to multicast
- If reply (**Neighbor Advertisement, NA**) → address in use
- If no reply → address is unique

### Address Resolution (IPv6)

- Host sends **NS** → node replies **NA** (contains MAC address)

### IPv4 → IPv6 Migration

| Strategy | Description |
| --- | --- |
| Dual Stack | Run both IPv4 & IPv6 |
| Tunneling | Encapsulate IPv6 inside IPv4 |
| Translation | Convert between protocols |

---

## Chapter 7: Application Layer

### Application Layer Functions

- Interface between applications and user
- Data format, compression, encryption (Presentation)
- Dialog management (Session)

### HTTP / HTTPS

| Protocol | Port | Description |
| --- | --- | --- |
| HTTP | 80 | Request/response protocol |
| HTTPS | 443 | Secure HTTP |

### Email Protocols

| Protocol | Port | Function |
| --- | --- | --- |
| SMTP | 25 | Send email |
| POP3 | 110 | Receive email (download) |
| IMAP | 143 | Receive email (sync) |

- **MUA** — Mail User Agent (client)
- **MTA** — Mail Transfer Agent (server relay)
- **MDA** — Mail Delivery Agent (mailbox)

### DNS (Domain Name System)

- Resolves domain names → IP addresses
- Uses fully-qualified domain names (FQDN)
- Distributed set of servers
- Tool: `nslookup`

### DHCP (Dynamic Host Configuration Protocol)

- Automatically assigns IP addresses

### FTP (File Transfer Protocol)

- Port **20** (data) and Port **21** (control)
- Transfers files between client and server

### SMB (Server Message Block)

- File and printer sharing protocol

---

## Chapter 8: Switching

### Borderless Switched Network — Hierarchical Design

| Layer | Function |
| --- | --- |
| Access | Connects end devices |
| Distribution | Policy, filtering, inter-VLAN routing |
| Core | High-speed backbone |

### Traffic Flow

- **Ingress** — entering the switch
- **Egress** — leaving the switch

### Switch MAC Address Table

- Learns from **source MAC address**
- Binds source MAC ↔ physical port

### Switch Types

| Type | Description |
| --- | --- |
| Fixed | Set number of ports |
| Modular | Expandable chassis |
| Stackable | Multiple switches act as one |

### Switch Environment

- Collision domain
- Full duplex / half duplex
- Port density & speed
- Auto-MDIX

### Switch Boot Sequence

1. POST (Power-On Self Test)
2. Load boot loader
3. Boot loader locates and loads default IOS
4. IOS loads the startup configuration

### Switch Remote Management

- Requires: IP address, subnet mask, default gateway

### SSH Configuration (Port 22)

1. Configure hostname
2. Configure IP domain name
3. Generate RSA key pairs (min 1024 bits)
4. Configure user authentication
5. Configure VTY lines
6. Enable SSH version 2

### Switch Threats

- **MAC Address Flooding** — overwhelm MAC table

### Port Security

#### MAC Address Types

| Type | Description |
| --- | --- |
| Static Secure | Manually configured |
| Dynamic Secure | Dynamically learned |
| Sticky Secure | Learned & saved to config |

#### Violation Modes

| Mode | Action |
| --- | --- |
| Protect | Drops unknown traffic silently |
| Restrict | Drops + sends log notification |
| Shutdown | Disables port (default) |

#### Aging

- **Absolute** — timer starts on learning
- **Inactivity** — timer resets on activity

---

## Chapter 9: VLANs & Inter-VLAN Routing

### VLANs (Virtual LANs)

- Segment networks by: department, function, project, application

#### Benefits

- Security
- Performance
- Cost reduction
- Simplified management

### VLAN Types

| Type | Description |
| --- | --- |
| Data VLAN | ID 2–1001 |
| Voice VLAN | Delay < 150 ms |
| Default VLAN | ID 1, 1002–1005 (cannot be deleted, used for SVI) |
| Management VLAN | For network management traffic |
| Native VLAN | Untagged frames on trunk |

### VLAN Trunking Protocol (VTP)

- Manages VLANs across multiple switches
- Modes: Server / Client / Transparent
- Requires: same domain + same password

### Switchport Modes

| Mode | Description |
| --- | --- |
| Access | Connects to end device (1 data VLAN + 1 voice VLAN) |
| Trunk | Carries multiple VLANs |

- **DTP (Dynamic Trunking Protocol)** — negotiates trunk links
  - auto↔desirable or desirable↔desirable

### VLAN Configuration Steps

1. Create VLAN
2. Configure port as access mode
3. Assign VLAN to port

### Inter-VLAN Routing Methods

| Method | Description |
| --- | --- |
| Multiple Physical Interfaces | One port per VLAN (not scalable) |
| Router-on-a-Stick | Single interface with sub-interfaces (802.1Q) |
| Multilayer Switch | SVI + `ip routing` + routed ports (`no switchport`) |

### VLAN Attacks

| Attack | Description |
| --- | --- |
| VLAN Hopping | Trunk link to end device → access all VLANs |
| Double Tagging | Attacker in native VLAN → frame crosses VLANs |

#### Prevention

- Disable trunk on all access ports
- Disable auto trunking

---

## Chapter 10: DHCP

### DHCPv4

#### Allocation Types

- **Automatic** — fixed assignment
- **Dynamic** — lease-based assignment

#### DORA Process

| Step | Message | Type |
| --- | --- | --- |
| 1 | DHCPDISCOVER | Broadcast |
| 2 | DHCPOFFER | Unicast |
| 3 | DHCPREQUEST | Broadcast |
| 4 | DHCPACK | Unicast |

#### Lease Renewal

- DHCPREQUEST (unicast) → DHCPACK (unicast)

#### Configuration

- Exclude reserved IPs
- Configure DHCP pool (network, subnet mask, default gateway, DNS, domain name)
- Verify: `show ip dhcp binding`
- Router as client: `ip address dhcp`

#### DHCP Relay

- Forwards broadcasts to DHCP server on a different network
- `ip helper-address <dhcp-server-ip>`

### DHCPv6

#### Address Assignment Methods

| Method | Flag | Description |
| --- | --- | --- |
| SLAAC | — | Prefix from RA only |
| Stateless DHCPv6 | `ipv6 nd other-config-flag` | RA + DHCPv6 for DNS/domain |
| Stateful DHCPv6 | `ipv6 nd managed-config-flag` | Full address from DHCPv6 |

#### DHCPv6 Messages

| Message | Purpose |
| --- | --- |
| SOLICIT (`FF02::1:2`) | Client discovers server |
| ADVERTISE | Server responds |
| INFORMATION-REQUEST | Stateless: request DNS/domain |
| REQUEST | Stateful: request full address |
| REPLY | Server sends configuration |

#### Stateless Configuration

- Pool: DNS, domain name
- Interface: `ipv6 dhcp server <pool>` + `ipv6 nd other-config-flag`
- Client: `ipv6 address autoconfig`

#### Stateful Configuration

- Pool: address prefix, DNS, domain name
- Interface: `ipv6 dhcp server <pool>` + `ipv6 nd managed-config-flag`
- Client: `ipv6 address dhcp`

#### DHCPv6 Relay

- `ipv6 dhcp relay destination <server-ip>`

### DHCP Security

| Threat | Description |
| --- | --- |
| Starvation Attack | Floods server with DHCP requests |
| Spoofing Attack | Fake DHCP server on the network |

#### DHCP Snooping

- `ip dhcp snooping`
- Trusted port: `ip dhcp snooping trust`
- Rate limit: `ip dhcp snooping limit rate <n>`

---

## Chapter 11: Routing

### Router Functions

- Connects multiple networks
- Determines best path → forwards packets via routing table

#### Best Path Selection

| Criteria | Description |
| --- | --- |
| Longest Match | Most specific route wins |
| Lowest Metric | Hop count, cost, bandwidth, delay, load, reliability |
| Administrative Distance (AD) | Lower = more trustworthy |

#### Forwarding Methods

- Process switching
- Fast switching
- CEF (Cisco Express Forwarding)

#### Forwarding Decisions

1. Forward to device on directly connected network
2. Forward to next-hop router
3. Forward to default route
4. Drop packet (no match)

### Routing Table

#### Route Sources

- **Directly Connected** — local route interfaces
- **Remote** — learned via static or dynamic routing
- **Default** — fallback route

#### Route Entry Fields

| Field | Description |
| --- | --- |
| Route Source | How the route was learned |
| Destination Network | Target network |
| Administrative Distance | Trustworthiness |
| Metric | Cost to reach destination |
| Next-Hop | Next router IP |
| Outgoing Interface | Exit port |
| Timestamp | Last update time |

### Static Routing

#### Commands

| Type | IPv4 | IPv6 |
| --- | --- | --- |
| Next-hop | `ip route <net> <mask> <next-hop>` | `ipv6 route <net>/<prefix> <next-hop>` |
| Exit interface | `ip route <net> <mask> <exit-if>` | `ipv6 route <net>/<prefix> <exit-if>` |
| Default | `ip route 0.0.0.0 0.0.0.0 <next-hop/exit-if>` | `ipv6 route ::/0 <next-hop/exit-if>` |

#### Use Cases

- Stub networks
- Summarized routes
- Backup routes (higher AD than primary)

### Dynamic Routing

- Automatically discovers and updates routes

#### Components

- Data structures
- Routing protocol messages
- Algorithms

#### Classification

| Category | Protocols |
| --- | --- |
| IGP (Interior) | RIP, OSPF, EIGRP |
| EGP (Exterior) | BGP |
| Distance Vector | RIPv1, RIPv2, EIGRP |
| Link-State | OSPF |
| Classful | RIPv1 |
| Classless | RIPv2, OSPF, EIGRP |

---

## Chapter 12: Wireless Networks

### Wireless Technology Categories

| Category | Examples |
| --- | --- |
| WPAN | Bluetooth (BLE, Basic Rate) |
| WLAN | Wi-Fi |
| WMAN | WiMAX |
| WWAN | Cellular, Satellite |

### WLAN Components

- End devices with wireless NICs
- **Wireless AP / Router**
  - Autonomous APs
  - Controller-based APs (LWAPP)
- **Antenna Types**
  - Omnidirectional — all directions
  - Directional — focused beam
  - MIMO — multiple signals

### WLAN Infrastructure

| Mode | Description |
| --- | --- |
| Ad Hoc | Direct device-to-device |
| Infrastructure (BSS) | Single AP coverage |
| Infrastructure (ESS) | Multiple APs, shared SSID |
| Tethering | Personal hotspot |

### WLAN Operation

- **CSMA/CA** — collision avoidance
  - RTS (Request to Send) → CTS (Clear to Send)
- **AP Discovery** — passive (listen for beacons) or active (probe requests)
- **Authentication** → **Association**

### CAPWAP

- Manages multiple APs and WLANs centrally
- Uses: AP MAC, WLC MAC, DTLS encryption
- **FlexConnect** — Connected Mode / Standalone Mode

### Modulation Techniques

| Technique | Abbreviation |
| --- | --- |
| Direct-Sequence Spread Spectrum | DSSS |
| Frequency-Hopping Spread Spectrum | FHSS |
| Orthogonal Frequency-Division Multiplexing | OFDM |

### WLAN Threats

- Data interception
- Wireless intruders
- DoS attacks
- Rogue APs

### WLAN Security

| Solution | Description |
| --- | --- |
| SSID Cloaking | Hide network name |
| MAC Filtering | Allow only known devices |
| Open Authentication | No security |
| Shared Key Authentication | Pre-shared key |
| WPA/WPA2 Personal | PSK for small networks |
| WPA/WPA2 Enterprise | RADIUS server authentication |

#### Encryption

- **TKIP** — Temporal Key Integrity Protocol
- **AES** — Advanced Encryption Standard

---

## Chapter 13: Network Management & Security

### Small Network Characteristics

- Single WAN connection
- Managed by local IT technician

### Design Factors

| Factor | Consideration |
| --- | --- |
| Cost | Devices, management, security |
| Speed | Required bandwidth |
| Expandability | Future growth |
| OS | Device compatibility |
| Redundancy | Backup paths |
| QoS | Traffic prioritization |

### Network Design & Documentation

- Physical & logical diagrams
- Device inventory
- Traffic analysis
- Resource utilization
- **Network baseline** — normal performance reference

### Troubleshooting Tools

| Command | Purpose |
| --- | --- |
| `ping` | Test connectivity |
| `traceroute` | Trace path |
| `debug` | Real-time diagnostics |
| `show` | Display configurations |

### Device Discovery

- **CDP (Cisco Discovery Protocol)** — discover device type, model, port, platform

### Security Threats

- Information theft
- Data loss and manipulation
- Identity theft
- Disruption of service

### Vulnerability Categories

| Category | Examples |
| --- | --- |
| Technological | Software bugs, protocol weaknesses |
| Configuration | Default settings, weak passwords |
| Security Policy | Lack of enforcement |

### Physical Threats

- Hardware damage
- Environmental hazards
- Electrical issues
- Maintenance failures

### Network Attacks

| Attack | Description |
| --- | --- |
| Virus | Self-replicating malicious code |
| Worm | Spreads without user action |
| Trojan Horse | Disguised malware |
| Reconnaissance | Discover vulnerabilities (`nslookup`, `fping`, `gping`) |
| Access Attack | Gain unauthorized access |
| Password Attack | Brute force or dictionary |
| Trust Exploitation | Abuse trusted relationships |
| Man-in-the-Middle | Intercept communications |
| DoS | Overwhelm target with traffic |

### Security Solutions

| Solution | Description |
| --- | --- |
| AAA | Authentication, Authorization, Accounting |
| VPN | Encrypted remote access |
| ASA Firewall | Packet/application/URL filtering, SPI |
| IPS | Intrusion Prevention System |
| ESA/WSA | Email/Web Security Appliance |
| AAA Server | Centralized authentication |
| Endpoint Security | Protects individual devices |
