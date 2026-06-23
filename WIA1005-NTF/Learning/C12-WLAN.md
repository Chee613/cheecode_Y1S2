# Chapter 12: Wireless LAN

# Part A: Must-Remember Cheat Sheet

## 1. Wireless network types

```text
WPAN -> WLAN -> WMAN -> WWAN
Smallest              Largest
```

| Type | Example                  | Standard       |
| ---- | ------------------------ | -------------- |
| WPAN | Bluetooth, ZigBee        | 802.15         |
| WLAN | Wi-Fi                    | 802.11         |
| WMAN | City wireless            | —              |
| WWAN | 4G, 5G, Satellite, WiMAX | WiMAX = 802.16 |

---

## 2. WLAN components

```text
Wireless Router = Router + Switch + Access Point
```

| Component       | Meaning                                  |
| --------------- | ---------------------------------------- |
| Wireless NIC    | Allows device to connect to Wi-Fi        |
| AP              | Gives wireless access                    |
| Wireless router | Home device combining router, switch, AP |
| WLC             | Centrally manages many APs               |
| LAP             | Lightweight AP controlled by WLC         |

---

## 3. SSID vs BSSID

| Term  | Meaning                 |
| ----- | ----------------------- |
| SSID  | Wi-Fi network name      |
| BSSID | MAC address of AP radio |

Example:

```text
SSID: Campus_WiFi
BSSID: 00:11:22:AA:BB:CC
```

---

## 4. BSS vs ESS

| Term    | Meaning                                   |
| ------- | ----------------------------------------- |
| BSS     | One AP + connected clients                |
| BSA     | Coverage area of one AP                   |
| ESS     | Multiple BSSs connected together          |
| Roaming | Moving from one AP to another in same ESS |

---

## 5. WLAN access method

Wi-Fi uses:

```text
CSMA/CA
Carrier Sense Multiple Access with Collision Avoidance
```

Not CSMA/CD.

Important flow:

```text
Listen -> RTS -> CTS -> DATA -> ACK
```

| Term | Meaning         |
| ---- | --------------- |
| RTS  | Ready To Send   |
| CTS  | Clear To Send   |
| ACK  | Acknowledgement |

---

## 6. Passive vs Active scanning

| Type             | Who starts? | Frame                          |
| ---------------- | ----------- | ------------------------------ |
| Passive scanning | AP          | Beacon                         |
| Active scanning  | Client      | Probe request / probe response |

---

## 7. Controller-based WLAN

```text
AP ---- CAPWAP ---- WLC
```

| Term            | Meaning                             |
| --------------- | ----------------------------------- |
| CAPWAP          | Protocol between AP and WLC         |
| DTLS            | Secures AP-WLC communication        |
| FlexConnect     | Branch AP controlled by central WLC |
| Connected mode  | WLC reachable                       |
| Standalone mode | WLC unreachable                     |

---

## 8. Wireless modulation

| Method | Simple meaning                  | Used by                |
| ------ | ------------------------------- | ---------------------- |
| DSSS   | Spread signal                   | 802.11b                |
| FHSS   | Hop between frequencies         | Spread spectrum method |
| OFDM   | Split channel into sub-channels | 802.11a/g/n/ac         |
| OFDMA  | Sub-channels for multiple users | 802.11ax               |

---

## 9. WLAN threats

| Threat            | Meaning                              |
| ----------------- | ------------------------------------ |
| Interception      | Attacker reads wireless traffic      |
| Wireless intruder | Unauthorized user joins WLAN         |
| DoS               | Makes WLAN unavailable               |
| Rogue AP          | Unauthorized AP connected to network |
| Evil twin AP      | Fake AP using same SSID as real AP   |

---

## 10. WLAN security

| Security method | Meaning                           |
| --------------- | --------------------------------- |
| SSID cloaking   | Hides SSID broadcast, weak alone  |
| MAC filtering   | Allows by MAC address, weak alone |
| WEP             | Old and weak                      |
| WPA             | Uses TKIP                         |
| WPA2            | Uses AES/CCMP                     |
| WPA3            | Uses SAE                          |
| Personal        | Shared password                   |
| Enterprise      | RADIUS + 802.1X/EAP               |

---

# Part B: Final Exam Questions

## Q1. Which IEEE standard is used by WLAN?

A. 802.3
B. 802.11
C. 802.15
D. 802.16

Answer: **B. 802.11**

---

## Q2. Bluetooth is usually categorized as:

A. WLAN
B. WPAN
C. WMAN
D. WWAN

Answer: **B. WPAN**

---

## Q3. A home wireless router usually combines:

A. Router, switch, access point
B. Router, DNS, firewall only
C. Switch, VLAN, DHCP only
D. AP, printer, server

Answer: **A. Router, switch, access point**

---

## Q4. SSID means:

A. Service Set Identifier
B. Secure System Interface Data
C. Switch Service ID
D. Static Security Internet Domain

Answer: **A. Service Set Identifier**

---

## Q5. BSSID is usually:

A. IP address of AP
B. MAC address of AP radio
C. DHCP server address
D. DNS record name

Answer: **B. MAC address of AP radio**

---

## Q6. One AP and its associated clients form a:

A. ESS
B. BSS
C. WAN
D. VLAN trunk

Answer: **B. BSS**

---

## Q7. Multiple BSSs connected together form an:

A. ESS
B. ARP table
C. DHCP pool
D. Local route

Answer: **A. ESS**

---

## Q8. Wi-Fi uses which access method?

A. CSMA/CD
B. CSMA/CA
C. OSPF
D. EIGRP

Answer: **B. CSMA/CA**

---

## Q9. Why does Wi-Fi use CSMA/CA?

A. Because wireless can easily detect collisions
B. Because wireless tries to avoid collisions before sending
C. Because Wi-Fi does not use frames
D. Because APs do not need acknowledgements

Answer: **B. Because wireless tries to avoid collisions before sending**

---

## Q10. RTS means:

A. Ready To Send
B. Route To Switch
C. Remote Transfer Signal
D. Router Table Summary

Answer: **A. Ready To Send**

---

## Q11. In passive scanning, the AP sends:

A. Beacon frames
B. Probe requests
C. DHCP Discover
D. TCP SYN

Answer: **A. Beacon frames**

---

## Q12. In active scanning, the client sends:

A. Probe request
B. Probe response
C. ARP reply
D. DNS response

Answer: **A. Probe request**

---

## Q13. CAPWAP is used between:

A. Client and AP
B. AP and WLC
C. Router and ISP
D. Switch and printer

Answer: **B. AP and WLC**

---

## Q14. DTLS is used to:

A. Assign IP addresses
B. Encrypt AP-WLC communication
C. Create VLANs
D. Translate IPv4 to IPv6

Answer: **B. Encrypt AP-WLC communication**

---

## Q15. A fake AP using the same SSID as a real AP is called:

A. Rogue route
B. Evil twin AP
C. Native VLAN
D. Floating static route

Answer: **B. Evil twin AP**

---

## Q16. Why is MAC filtering weak alone?

A. MAC addresses can be spoofed
B. MAC addresses are IP addresses
C. MAC filtering disables encryption
D. MAC filtering only works on routers

Answer: **A. MAC addresses can be spoofed**

---

## Q17. WPA uses:

A. TKIP
B. AES only
C. OSPF
D. DHCP

Answer: **A. TKIP**

---

## Q18. WPA2 uses:

A. WEP
B. AES/CCMP
C. RIP
D. Telnet

Answer: **B. AES/CCMP**

---

## Q19. WPA3-Personal uses:

A. SAE
B. ARP
C. ICMP
D. STP

Answer: **A. SAE**

---

## Q20. WPA Enterprise usually requires:

A. RADIUS server
B. One shared password only
C. No authentication
D. Console cable

Answer: **A. RADIUS server**

---

# Part C: Very Common Viva Questions

## 1. What is WLAN?

WLAN is a Wireless Local Area Network. It allows devices to connect to a local network using radio signals instead of cables.

---

## 2. What is the main benefit of WLAN?

The main benefit is **mobility**. Users can move around while staying connected.

---

## 3. What is the difference between SSID and BSSID?

SSID is the Wi-Fi network name.
BSSID is the MAC address of the AP radio.

---

## 4. What is the difference between BSS and ESS?

BSS is one AP and its clients.
ESS is two or more BSSs connected together.

---

## 5. Why is WLAN more vulnerable than wired LAN?

Because WLAN uses radio waves. Attackers may only need to be within signal range, not physically connected by cable.

---

## 6. What is a rogue AP?

A rogue AP is an unauthorized AP connected to a network without permission.

---

## 7. What is an evil twin AP?

An evil twin AP is a fake AP that uses the same SSID as a real AP to trick users into connecting.

---

## 8. Why are SSID cloaking and MAC filtering not enough?

SSID can still be discovered, and MAC addresses can be spoofed.

---

## 9. What is the difference between WPA Personal and WPA Enterprise?

WPA Personal uses one shared password.
WPA Enterprise uses individual accounts with RADIUS and 802.1X/EAP.

---

## 10. What should you check if Wi-Fi is connected but internet does not work?

Check:

```cmd
ipconfig /all
ping <default-gateway>
ping 8.8.8.8
nslookup google.com
```

Possible problems:

* No valid IP address
* Wrong gateway
* DNS problem
* Routing problem
* Internet problem

---

# Chapter 12 Status

You are now fully done with **Chapter 12: Wireless LAN**.

Next step: start **Chapter 13** in a new chat and upload the Chapter 13 file.
