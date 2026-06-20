# CCNA 2 - Modules 10 - 13 L2 Security and WLANs Exam Answers

## Question 1

**Question:**
Which Layer 2 attack will result in legitimate users not getting valid IP addresses?

**Choices:**
- **A.** ARP spoofing
- **B.** DHCP starvation
- **C.** IP address spoofing
- **D.** MAC address flooding

**Correct Answer:**
DHCP starvation

**Explanation:**
Topic 10.5.5 The DHCP starvation attack causes the exhaustion of the IP address pool of a DHCP server before legitimate users can obtain valid IP addresses.

---

## Question 2

**Question:**
What mitigation plan is best for thwarting a DoS attack that is creating a MAC address table overflow?

**Choices:**
- **A.** Disable DTP.
- **B.** Disable STP.
- **C.** Enable port security.
- **D.** Place unused ports in an unused VLAN.

**Correct Answer:**
Enable port security.

**Explanation:**
Topic 11.1.2 A MAC address (CAM) table overflow attack, buffer overflow, and MAC address spoofing can all be mitigated by configuring port security. A network administrator would typically not want to disable STP because it prevents Layer 2 loops. DTP is disabled to prevent VLAN hopping. Placing unused ports in an unused VLAN prevents unauthorized wired connectivity.

---

## Question 3

**Question:**
Which three Cisco products focus on endpoint security solutions? (Choose three.)

**Choices:**
- **A.** IPS Sensor Appliance
- **B.** Web Security Appliance
- **C.** Email Security Appliance
- **D.** SSL/IPsec VPN Appliance
- **E.** Adaptive Security Appliance
- **F.** NAC Appliance

**Correct Answer:**
Web Security Appliance; Email Security Appliance; NAC Appliance

**Explanation:**
Topic 10.1.3 The primary components of endpoint security solutions are Cisco Email and Web Security appliances, and Cisco NAC appliance. ASA, SSL/IPsec VPN, and IPS sensor appliances all provide security solutions that focus on the enterprise network, not on endpoint devices.

---

## Question 4

**Question:**
True or False? In the 802.1X standard, the client attempting to access the network is referred to as the supplicant.

**Choices:**
- **A.** true
- **B.** false

**Correct Answer:**
true

**Explanation:**
Topic 10.2.6

---

## Question 5

**Question:**
Which authentication method stores usernames and passwords in the router and is ideal for small networks?

**Choices:**
- **A.** server-based AAA over TACACS+
- **B.** local AAA over RADIUS
- **C.** server-based AAA
- **D.** local AAA over TACACS+
- **E.** local AAA
- **F.** server-based AAA over RADIUS

**Correct Answer:**
local AAA

**Explanation:**
Topic 10.2.3 In a small network with a few network devices, AAA authentication can be implemented with the local database and with usernames and passwords stored on the network devices. Authentication using the TACACS+ or RADIUS protocol will require dedicated ACS servers although this authentication solution scales well in a large network.

---

## Question 6

**Question:**
What represents a best practice concerning discovery protocols such as CDP and LLDP on network devices?

**Choices:**
- **A.** Enable CDP on edge devices, and enable LLDP on interior devices.
- **B.** Use the open standard LLDP rather than CDP.
- **C.** Use the default router settings for CDP and LLDP.
- **D.** Disable both protocols on all interfaces where they are not required.

**Correct Answer:**
Disable both protocols on all interfaces where they are not required.

**Explanation:**
Topic 10.5.10 Both discovery protocols can provide hackers with sensitive network information. They should not be enabled on edge devices, and should be disabled globally or on a per-interface basis if not required. CDP is enabled by default.​

---

## Question 7

**Question:**
Which protocol should be used to mitigate the vulnerability of using Telnet to remotely manage network devices?

**Choices:**
- **A.** SNMP
- **B.** TFTP
- **C.** SSH
- **D.** SCP

**Correct Answer:**
SSH

**Explanation:**
Topic 10.3.3 Telnet uses plain text to communicate in a network. The username and password can be captured if the data transmission is intercepted. SSH encrypts data communications between two network devices. TFTP and SCP are used for file transfer over the network. SNMP is used in network management solutions.

---

## Question 8

**Question:**
Which statement describes the behavior of a switch when the MAC address table is full?

**Choices:**
- **A.** It treats frames as unknown unicast and floods all incoming frames to all ports on the switch.
- **B.** It treats frames as unknown unicast and floods all incoming frames to all ports across multiple switches.
- **C.** It treats frames as unknown unicast and floods all incoming frames to all ports within the local VLAN.
- **D.** It treats frames as unknown unicast and floods all incoming frames to all ports within the collision domain.

**Correct Answer:**
It treats frames as unknown unicast and floods all incoming frames to all ports within the local VLAN.

**Explanation:**
Topic 10.4.2 When the MAC address table is full, the switch treats the frame as an unknown unicast and begins to flood all incoming traffic to all ports only within the local VLAN.

---

## Question 9

**Question:**
What device is considered a supplicant during the 802.1X authentication process?

**Choices:**
- **A.** the router that is serving as the default gateway
- **B.** the authentication server that is performing client authentication
- **C.** the client that is requesting authentication
- **D.** the switch that is controlling network access

**Correct Answer:**
the client that is requesting authentication

**Explanation:**
Topic 10.2.6 The devices involved in the 802.1X authentication process are as follows: The supplicant, which is the client that is requesting network access The authenticator, which is the switch that the client is connecting to and that is actually controlling physical network access The authentication server, which performs the actual authentication

---
