# Chapter 7: Application Layer
---

# 1. Chapter Overview

Chapter 7 focuses on the **Application Layer**.

The Application Layer is important because it is the layer closest to the user. It provides the interface between the applications we use and the network that carries our messages. 

Examples of applications:

```text
Web browser
Email app
File transfer app
Chat app
Online game
```

Examples of application layer protocols:

```text
HTTP
HTTPS
FTP
TFTP
SMTP
POP
IMAP
DNS
DHCP
SMB
```

---

# 2. Application Layer

## 2.1 What it means

The **Application Layer** provides network services to user applications.

Simple meaning:

```text
Application Layer = allows user programs to use the network
```

Example:

```text
Chrome uses HTTP/HTTPS to open websites.
Gmail uses SMTP/POP/IMAP for email.
A file transfer app uses FTP to upload/download files.
```

Important:

```text
Application ≠ Application Layer protocol
```

Example:

```text
Chrome = application
HTTP/HTTPS = protocols
```

---

## 2.2 Why we need it

Without the Application Layer, user programs would not know how to communicate across the network.

Example:

When you type:

```text
www.cisco.com
```

Your browser needs rules to request the webpage.

Those rules are provided by protocols such as:

```text
HTTP
HTTPS
DNS
```

---

# 3. Presentation Layer

Your slide says the Presentation Layer has three main functions: **formatting**, **compression**, and **encryption/decryption**. 

## 3.1 Formatting

Formatting changes data into a form the receiver can understand.

Example:

```text
Video format: MKV, MPG, MOV
Image format: JPEG, PNG
Document format: PDF, DOCX
```

If the receiver cannot understand the format, the file may not open correctly.

---

## 3.2 Compression

Compression makes data smaller.

Example:

```text
Original video: 500 MB
Compressed video: 100 MB
```

Why compression is useful:

```text
Less storage needed
Faster transfer
Less bandwidth used
```

---

## 3.3 Encryption and Decryption

Encryption changes readable data into unreadable data.

Example before encryption:

```text
Password: abc123
```

After encryption:

```text
X9@kP2!zQ
```

Why we need encryption:

```text
Protect passwords
Protect online banking
Protect private messages
Protect payment information
```

Decryption changes the unreadable data back into readable form at the destination.

---

# 4. Session Layer

Your slide says the Session Layer creates and maintains dialogs between source and destination applications. It also helps keep sessions active and restart disrupted sessions. 

Simple meaning:

```text
Session Layer = manages communication sessions
```

Example:

```text
Login session
Video call session
Online game session
File transfer session
```

Diagram:

```text
Client Application                  Server Application
        |                                   |
        |--------- Start session ---------->|
        |<-------- Session accepted --------|
        |--------- Exchange data ---------->|
        |<-------- Exchange data -----------|
        |--------- End session ------------>|
```

---

# 5. Application vs Presentation vs Session

| Layer        | Main Job                           | Simple Example        |
| ------------ | ---------------------------------- | --------------------- |
| Application  | Provides network services to apps  | Browser uses HTTPS    |
| Presentation | Formats, compresses, encrypts data | MP4, JPEG, encryption |
| Session      | Creates and manages dialogs        | Login session         |

Memory trick:

```text
Application = What service?
Presentation = What format/security?
Session = What conversation?
```

---

# 6. HTTP and HTTPS

Your slide says HTTP is designed for common uses such as web browsing. It is a **request/response protocol**. Common message types include **GET, POST, and PUT**. HTTPS uses authentication and encryption for secure communication. 

---

## 6.1 HTTP

HTTP stands for:

```text
Hypertext Transfer Protocol
```

Simple meaning:

```text
HTTP = protocol used for web browsing
```

Example:

```text
Browser requests webpage.
Web server sends webpage.
```

Diagram:

```text
Web Browser                    Web Server
     |                              |
     |-------- HTTP Request ------->|
     |<------- HTTP Response -------|
```

---

## 6.2 URL

URL stands for:

```text
Uniform Resource Locator
```

Example:

```text
https://www.example.com/index.html
```

Breakdown:

```text
https://          protocol
www.example.com   domain name
/index.html       webpage/resource
```

---

## 6.3 HTTP Request and Response

HTTP works using request and response.

```text
Client sends request.
Server sends response.
```

Example:

```text
Browser: Please send index.html
Server: Here is index.html
```

---

## 6.4 GET

GET is used to request data.

Simple meaning:

```text
GET = please give me something
```

Example:

```text
Open webpage
Load image
Read article
```

---

## 6.5 POST

POST is used to send data to the server.

Simple meaning:

```text
POST = here is my data
```

Example:

```text
Login form
Register account
Submit comment
Submit contact form
```

---

## 6.6 PUT

PUT is used to upload or update data.

Simple meaning:

```text
PUT = put this file/data on the server
```

Example:

```text
Upload file
Update profile
Replace old data
```

---

## 6.7 HTTPS

HTTPS stands for:

```text
Hypertext Transfer Protocol Secure
```

HTTPS is the secure version of HTTP.

It uses:

```text
Authentication
Encryption
```

Why HTTPS is important:

```text
Protects passwords
Protects payment details
Protects login sessions
Prevents attackers from easily reading data
```

---

## 6.8 HTTP vs HTTPS

| Feature         | HTTP                     | HTTPS                   |
| --------------- | ------------------------ | ----------------------- |
| Security        | Not secure               | Secure                  |
| Encryption      | No                       | Yes                     |
| Authentication  | No strong authentication | Uses certificate        |
| Common use      | Basic web browsing       | Login, banking, payment |
| URL starts with | `http://`                | `https://`              |

---

# 7. Email Protocols

Your slide says email uses a **store-and-forward** method. Email uses three protocols: **SMTP**, **POP**, and **IMAP**. 

---

## 7.1 Store-and-forward

Email usually does not go directly from one PC to another PC.

Instead:

```text
Sender email app
      ↓
Sender mail server
      ↓
Receiver mail server
      ↓
Receiver email app
```

Simple meaning:

```text
Email can be stored on a mail server first,
then forwarded or retrieved later.
```

---

## 7.2 Mail Client

A mail client is the application used to send and read email.

Examples:

```text
Gmail app
Outlook
Apple Mail
Thunderbird
Webmail
```

---

## 7.3 Mail Server

A mail server stores, sends, receives, and manages email messages.

Example:

```text
Gmail servers store Gmail messages.
Outlook servers store Outlook messages.
```

---

## 7.4 SMTP

SMTP stands for:

```text
Simple Mail Transfer Protocol
```

SMTP is used to **send email**.

Your slide says SMTP uses well-known **port 25**. 

Simple meaning:

```text
SMTP = sends mail
```

Example:

```text
You click Send.
SMTP sends the email to the mail server.
```

SMTP message has:

```text
Header
Body
```

Example:

```text
Header:
From: ali@example.com
To: mei@example.com
Subject: Homework

Body:
Hi Mei, please send me the notes.
```

---

## 7.5 POP

POP stands for:

```text
Post Office Protocol
```

POP is used to retrieve email from a mail server.

Your slide says with POP, mail is downloaded from the server to the client and then deleted on the server. POP listens on **TCP port 110**. 

Simple meaning:

```text
POP = download email to device
```

Example:

```text
Email downloads to laptop.
Server copy may be deleted.
```

Weakness:

```text
Not ideal for many devices.
```

---

## 7.6 IMAP

IMAP stands for:

```text
Internet Message Access Protocol
```

IMAP is also used to retrieve email.

But unlike POP, IMAP keeps the original message on the server until manually deleted. 

Simple meaning:

```text
IMAP = view/sync email while keeping it on server
```

Good for:

```text
Phone
Laptop
Tablet
Multiple devices
```

---

## 7.7 SMTP vs POP vs IMAP

| Protocol | Main Job       | Simple Meaning                 |
| -------- | -------------- | ------------------------------ |
| SMTP     | Send email     | Sends mail out                 |
| POP      | Retrieve email | Downloads mail to device       |
| IMAP     | Retrieve email | Keeps mail on server and syncs |

Memory trick:

```text
SMTP = Send Mail
POP = Pull mail to one device
IMAP = Mail stays on Internet server
```

---

# 8. DNS

Your slide says DNS converts domain names into numeric IP addresses. It also says DNS uses a distributed set of servers and resource records. 

---

## 8.1 What DNS means

DNS stands for:

```text
Domain Name System
```

Simple meaning:

```text
DNS = converts domain name to IP address
```

Example from slide:

```text
www.cisco.com → 198.133.219.25
```

Humans prefer:

```text
www.cisco.com
```

Computers need:

```text
198.133.219.25
```

---

## 8.2 Why DNS is needed

Without DNS, users must remember IP addresses.

Example:

```text
Hard: 198.133.219.25
Easy: www.cisco.com
```

DNS works like an internet phonebook:

```text
Name → Address
Domain name → IP address
```

---

## 8.3 DNS does not send webpages

Important mistake:

```text
DNS does not send the website.
```

Correct flow:

```text
DNS finds IP address.
HTTP/HTTPS requests webpage.
```

---

## 8.4 FQDN

FQDN stands for:

```text
Fully Qualified Domain Name
```

Example:

```text
www.cisco.com
```

Breakdown:

```text
www      = host name
cisco    = domain
com      = top-level domain
```

---

## 8.5 DNS hierarchy

DNS uses a hierarchical system.

Example:

```text
.
└── com
    └── cisco
        └── www
```

For:

```text
www.cisco.com
```

The structure is:

```text
Root
 ↓
.com
 ↓
cisco.com
 ↓
www.cisco.com
```

---

# 9. DNS Resource Records

Your slide lists these DNS records: **A, AAAA, NS, CNAME, and MX**. 

| Record | Meaning             | Used For                       |
| ------ | ------------------- | ------------------------------ |
| A      | IPv4 address record | Maps name to IPv4              |
| AAAA   | IPv6 address record | Maps name to IPv6              |
| NS     | Name server record  | Shows authoritative DNS server |
| CNAME  | Canonical name      | Alias/nickname                 |
| MX     | Mail exchange       | Mail server for domain         |

---

## 9.1 A Record

```text
A record = domain name to IPv4 address
```

Example:

```text
www.example.com → 93.184.216.34
```

---

## 9.2 AAAA Record

```text
AAAA record = domain name to IPv6 address
```

Example:

```text
www.example.com → 2606:2800:220:1:248:1893:25c8:1946
```

Memory:

```text
A = IPv4
AAAA = IPv6
```

---

## 9.3 NS Record

```text
NS = Name Server
```

It tells which DNS server is responsible for a domain.

Example:

```text
example.com → ns1.example.com
```

---

## 9.4 CNAME Record

```text
CNAME = alias name
```

Example:

```text
shop.example.com → example-store.myshopify.com
```

Meaning:

```text
shop.example.com is another name for example-store.myshopify.com
```

---

## 9.5 MX Record

```text
MX = Mail Exchange
```

It tells where email for a domain should go.

Example:

```text
example.com → mail.example.com
```

---

# 10. DNS Cache and Commands

Your slide says Windows PCs store previously resolved names in memory, and the command `ipconfig /displaydns` displays cached DNS entries. 

## 10.1 Display DNS cache

```bash
ipconfig /displaydns
```

Meaning:

```text
Show cached DNS entries stored by the PC.
```

---

## 10.2 nslookup

Your slide says `nslookup` allows users to manually query name servers and troubleshoot name resolution issues. 

Command:

```bash
nslookup www.cisco.com
```

Meaning:

```text
Ask DNS server for the IP address of www.cisco.com.
```

---

# 11. DHCP

Your slide says DHCP allows devices to automatically obtain IP addresses and other network information such as subnet mask, default gateway, and other IP networking parameters. 

---

## 11.1 What DHCP means

DHCP stands for:

```text
Dynamic Host Configuration Protocol
```

Simple meaning:

```text
DHCP automatically gives IP settings to devices.
```

Example:

When your laptop connects to Wi-Fi, DHCP can give:

```text
IP address
Subnet mask
Default gateway
DNS server
```

---

## 11.2 Why DHCP is needed

Without DHCP, admin must manually configure every device.

Example:

```text
PC1: 192.168.1.10
PC2: 192.168.1.11
PC3: 192.168.1.12
```

With DHCP:

```text
Device connects.
DHCP server gives IP settings automatically.
```

---

## 11.3 DHCP Client and Server

| Role        | Meaning              | Example           |
| ----------- | -------------------- | ----------------- |
| DHCP client | Requests IP settings | PC, laptop, phone |
| DHCP server | Gives IP settings    | Router, server    |

Diagram:

```text
DHCP Client                     DHCP Server
     |                                |
     |------ Request IP settings ---->|
     |<----- Give IP settings --------|
```

---

## 11.4 DHCP information

DHCP can provide:

```text
IP address
Subnet mask
Default gateway
DNS server
Lease time
```

Example:

```text
IP address:       192.168.1.25
Subnet mask:      255.255.255.0
Default gateway:  192.168.1.1
DNS server:       8.8.8.8
```

---

## 11.5 Static IP vs DHCP

| Feature                    | Static IP               | DHCP              |
| -------------------------- | ----------------------- | ----------------- |
| Configuration              | Manual                  | Automatic         |
| Good for many devices?     | No                      | Yes               |
| Good for servers/printers? | Yes                     | Sometimes         |
| Risk of duplicate IP       | Higher if careless      | Lower             |
| Example use                | Router, printer, server | Laptop, phone, PC |

---

## 11.6 DHCP DORA

Common DHCP process:

```text
D = Discover
O = Offer
R = Request
A = Acknowledge
```

Diagram:

```text
DHCP Client                         DHCP Server
     |                                    |
     |--------- Discover ---------------->|
     |<-------- Offer --------------------|
     |--------- Request ----------------->|
     |<-------- Acknowledge --------------|
```

---

## 11.7 DHCP Windows Commands

Check IP:

```bash
ipconfig
```

Check full details:

```bash
ipconfig /all
```

Release current IP:

```bash
ipconfig /release
```

Renew IP:

```bash
ipconfig /renew
```

---

# 12. FTP

Your slide says FTP is used for data transfer between a client and server. It also says FTP uses TCP port 21 for control traffic and TCP port 20 for data transfer. 

---

## 12.1 What FTP means

FTP stands for:

```text
File Transfer Protocol
```

Simple meaning:

```text
FTP = transfers files between client and server
```

---

## 12.2 FTP Client and Server

| Role       | Meaning                                    |
| ---------- | ------------------------------------------ |
| FTP client | Device/app that uploads or downloads files |
| FTP server | Server that stores files                   |

Diagram:

```text
FTP Client                         FTP Server
   |                                    |
   |---------- Upload file ----------->|
   |<--------- Download file ----------|
```

---

## 12.3 Upload and Download

Upload:

```text
Client → Server
```

Download:

```text
Server → Client
```

Example:

```text
Upload assignment.docx to server.
Download lab.pdf from server.
```

---

## 12.4 FTP uses two connections

| Connection         | Port   | Purpose              |
| ------------------ | ------ | -------------------- |
| Control connection | TCP 21 | Commands and replies |
| Data connection    | TCP 20 | Actual file transfer |

Memory:

```text
21 = control commands
20 = file data
```

---

## 12.5 FTP Commands

Connect:

```bash
ftp 192.168.1.10
```

List files:

```bash
ls
```

Download:

```bash
get notes.pdf
```

Upload:

```bash
put assignment.docx
```

Exit:

```bash
bye
```

---

# 13. SMB

Your slide says SMB is a client/server file sharing protocol used for shared resources such as directories, files, printers, and serial ports. It is also a request-response protocol. 

---

## 13.1 What SMB means

SMB stands for:

```text
Server Message Block
```

Simple meaning:

```text
SMB = shares files, folders, printers, and other resources
```

Examples:

```text
Shared folder
Shared printer
Network drive
```

---

## 13.2 SMB Client and Server

| Role       | Meaning                            |
| ---------- | ---------------------------------- |
| SMB client | Requests access to shared resource |
| SMB server | Provides shared resource           |

Diagram:

```text
SMB Client                         SMB Server
   |                                    |
   |------ Request shared file -------->|
   |<----- Send response ---------------|
```

---

## 13.3 SMB Shared Folder Example

Windows SMB path:

```text
\\ServerName\ShareName
```

Example using IP:

```text
\\192.168.1.10\SharedFolder
```

Meaning:

```text
Access SharedFolder on device 192.168.1.10.
```

---

## 13.4 SMB Message Format

Your slide says SMB messages have:

```text
Fixed-sized header
Variable-sized parameter
Data component
```

Simple diagram:

```text
+-------------------+-------------------+----------------+
| Header            | Parameters        | Data           |
+-------------------+-------------------+----------------+
```

Meaning:

```text
Header = control information
Parameters = action details
Data = actual content
```

---

## 13.5 SMB Functions

Your slide says SMB messages can:

```text
Start, authenticate, and terminate sessions
Control file and printer access
Allow applications to send or receive messages
```



Example:

```text
User opens shared folder.
Server asks for username/password.
Server checks permission.
User opens file.
```

---

## 13.6 SMB vs FTP

| Feature         | FTP                             | SMB                             |
| --------------- | ------------------------------- | ------------------------------- |
| Main purpose    | File transfer                   | File/printer sharing            |
| Common use      | Upload/download files           | Access shared folders/printers  |
| User experience | Move file between client/server | Use network resource like local |
| Example         | `ftp 192.168.1.10`              | `\\192.168.1.10\SharedFolder`   |

Simple memory:

```text
FTP = move files
SMB = share resources
```

---

## 13.7 SAMBA

Your slide says Linux and UNIX can share resources with Microsoft networks using a version of SMB called **SAMBA**. Apple Macintosh systems also support SMB. 

Simple meaning:

```text
SAMBA allows Linux/UNIX systems to share files with Windows networks.
```

---

# 14. Small Network

Your slide lists **Small Network** as one of the main chapter contents. 

A small network may be:

```text
Home network
Small office network
Computer lab network
Small shop network
```

---

## 14.1 Common Small Network Devices

| Device      | Function                                |
| ----------- | --------------------------------------- |
| PC/Laptop   | User device                             |
| Switch      | Connects LAN devices                    |
| Router      | Connects LAN to other networks/Internet |
| Wireless AP | Provides Wi-Fi                          |
| Printer     | Shared printing                         |
| Server      | Provides services                       |

Diagram:

```text
                Internet
                   |
                Router
                   |
                Switch
        ___________|____________
       |           |            |
      PC        Printer       Server
       |
   Wireless AP
       |
   Laptop / Phone
```

---

## 14.2 Small Network Services

A small network may use:

```text
DHCP = automatic IP settings
DNS = name to IP address
HTTP/HTTPS = web browsing
SMB = shared folders/printers
FTP = file transfer
Email = SMTP/POP/IMAP
```

---

## 14.3 Static IP and DHCP Planning

Use static IP for:

```text
Router
Server
Printer
Access point
```

Use DHCP for:

```text
PC
Laptop
Phone
Tablet
Guest device
```

Example plan:

```text
Network:        192.168.10.0/24
Router:         192.168.10.1
Server:         192.168.10.10
Printer:        192.168.10.20
DHCP range:     192.168.10.100 - 192.168.10.200
```

Important:

```text
Do not include static device IP addresses inside the DHCP pool.
```

---

# 15. Troubleshooting

Your slide lists **Troubleshooting** as a chapter content, and it specifically mentions that `nslookup` can troubleshoot name resolution issues. 

---

## 15.1 What troubleshooting means

Troubleshooting means:

```text
Finding and fixing network problems step by step.
```

Bad method:

```text
Randomly guessing the problem.
```

Good method:

```text
Check one layer/area at a time.
```

---

## 15.2 Troubleshooting Flow

When a PC cannot access the Internet:

```text
1. Check cable/Wi-Fi
2. Check IP configuration
3. Ping loopback address
4. Ping own IP address
5. Ping default gateway
6. Ping Internet IP
7. Test DNS
8. Test application/service
```

Flowchart:

```text
Start
 |
 |-- Cable/Wi-Fi connected?
 |       No → Fix physical connection
 |       Yes
 |
 |-- Run ipconfig
 |       169.254.x.x → DHCP problem
 |       Normal IP
 |
 |-- Ping 127.0.0.1
 |       Fail → Local TCP/IP problem
 |       Success
 |
 |-- Ping default gateway
 |       Fail → Local network/gateway problem
 |       Success
 |
 |-- Ping 8.8.8.8
 |       Fail → Internet/routing problem
 |       Success
 |
 |-- nslookup www.google.com
 |       Fail → DNS problem
 |       Success
 |
 |-- Test website/application
```

---

## 15.3 Useful Commands

| Command                | Purpose                        |
| ---------------------- | ------------------------------ |
| `ipconfig`             | Shows IP, subnet mask, gateway |
| `ipconfig /all`        | Shows full network details     |
| `ipconfig /release`    | Releases DHCP address          |
| `ipconfig /renew`      | Requests DHCP address again    |
| `ipconfig /displaydns` | Shows DNS cache                |
| `ping 127.0.0.1`       | Tests local TCP/IP stack       |
| `ping gateway`         | Tests router connection        |
| `ping 8.8.8.8`         | Tests Internet by IP           |
| `nslookup domain`      | Tests DNS                      |
| `tracert domain`       | Shows route path               |

---

## 15.4 DHCP Problem

Symptom:

```text
PC gets 169.254.x.x
```

Likely problem:

```text
DHCP failed
```

Check:

```bash
ipconfig /all
ipconfig /release
ipconfig /renew
```

Possible causes:

```text
DHCP server down
Cable problem
Wi-Fi problem
Wrong VLAN
Router problem
DHCP pool full
```

---

## 15.5 DNS Problem

Symptom:

```text
ping 8.8.8.8 works
ping www.google.com fails
```

Likely problem:

```text
DNS issue
```

Check:

```bash
ipconfig /all
nslookup www.google.com
ipconfig /displaydns
```

---

## 15.6 Default Gateway Problem

Example wrong configuration:

```text
PC IP:   192.168.1.50/24
Gateway: 192.168.2.1
```

Problem:

```text
Gateway is in a different network.
```

Correct example:

```text
PC IP:   192.168.1.50/24
Gateway: 192.168.1.1
```

---

## 15.7 SMB Problem

Symptom:

```text
Cannot access \\192.168.1.10\SharedFolder
```

Check:

```text
Can ping server?
Correct shared folder name?
Correct username/password?
Permission allowed?
Firewall blocking SMB?
Server online?
```

---

## 15.8 FTP Problem

Symptom:

```text
Cannot upload/download using FTP
```

Check:

```text
Can ping FTP server?
FTP service running?
Username/password correct?
TCP port 21 allowed?
TCP port 20 allowed?
Firewall blocking FTP?
```

---

## 15.9 Email Problem

Problem:

```text
Can receive email but cannot send email
```

Likely issue:

```text
SMTP problem
```

Problem:

```text
Can send email but cannot receive email
```

Likely issue:

```text
POP or IMAP problem
```

---

# 16. Common Mistakes

## Mistake 1: Confusing application and protocol

Wrong:

```text
Chrome is HTTP.
```

Correct:

```text
Chrome is an application.
HTTP/HTTPS are protocols.
```

---

## Mistake 2: Thinking DNS sends webpages

Wrong:

```text
DNS sends the website.
```

Correct:

```text
DNS only resolves names to IP addresses.
HTTP/HTTPS transfers webpages.
```

---

## Mistake 3: Confusing HTTP and HTTPS

Wrong:

```text
HTTP and HTTPS are equally secure.
```

Correct:

```text
HTTPS is more secure because it uses authentication and encryption.
```

---

## Mistake 4: Confusing SMTP, POP, and IMAP

Correct:

```text
SMTP = sends email
POP = downloads email
IMAP = keeps email on server and syncs
```

---

## Mistake 5: Mixing up FTP ports

Correct:

```text
FTP port 21 = control
FTP port 20 = data
```

---

## Mistake 6: Confusing FTP and SMB

Correct:

```text
FTP = file transfer
SMB = file/printer sharing
```

---

## Mistake 7: Forgetting default gateway

A PC may have a valid IP address but still cannot reach the Internet if the gateway is missing or wrong.

---

## Mistake 8: Forgetting DNS

A PC may reach the Internet by IP address but fail to open websites by name if DNS is wrong.

---

# 17. Important Exam Facts

| Topic                  | Key Fact                                 |
| ---------------------- | ---------------------------------------- |
| Application Layer      | Closest to end user                      |
| Presentation Layer     | Formatting, compression, encryption      |
| Session Layer          | Creates and maintains dialogs            |
| HTTP                   | Web browsing                             |
| HTTPS                  | Secure web browsing                      |
| GET                    | Request data                             |
| POST                   | Send form data                           |
| PUT                    | Upload/update data                       |
| SMTP                   | Sends email                              |
| SMTP port              | 25                                       |
| POP                    | Downloads email                          |
| POP port               | 110                                      |
| IMAP                   | Keeps email on server                    |
| DNS                    | Name to IP address                       |
| A record               | IPv4                                     |
| AAAA record            | IPv6                                     |
| MX record              | Mail server                              |
| DHCP                   | Automatic IP configuration               |
| FTP                    | File transfer                            |
| FTP control port       | TCP 21                                   |
| FTP data port          | TCP 20                                   |
| SMB                    | File/printer sharing                     |
| SAMBA                  | SMB for Linux/UNIX with Windows networks |
| `nslookup`             | DNS troubleshooting                      |
| `ipconfig /displaydns` | Shows DNS cache                          |

---

# 18. Viva / Exam-style Questions

## Q1. What is the Application Layer?

Answer:

```text
The Application Layer provides network services to user applications and is closest to the end user.
```

---

## Q2. Give three examples of Application Layer protocols.

Answer:

```text
HTTP
FTP
DNS
```

Other possible answers:

```text
HTTPS
SMTP
POP
IMAP
DHCP
SMB
```

---

## Q3. What are the three main functions of the Presentation Layer?

Answer:

```text
Formatting
Compression
Encryption/decryption
```

---

## Q4. What does the Session Layer do?

Answer:

```text
It creates, maintains, and manages dialogs or sessions between applications.
```

---

## Q5. What is HTTP used for?

Answer:

```text
HTTP is used for web browsing and exchanging data between web clients and web servers.
```

---

## Q6. What is the difference between HTTP and HTTPS?

Answer:

```text
HTTP is not secure. HTTPS uses authentication and encryption to secure communication.
```

---

## Q7. What is GET used for?

Answer:

```text
GET is used to request data from a server.
```

---

## Q8. What is POST used for?

Answer:

```text
POST is used to send form data or user data to a server.
```

---

## Q9. What is SMTP used for?

Answer:

```text
SMTP is used to send email.
```

---

## Q10. What is the difference between POP and IMAP?

Answer:

```text
POP downloads email to the client and may delete it from the server.
IMAP keeps original messages on the server and lets clients view/sync copies.
```

---

## Q11. What is DNS used for?

Answer:

```text
DNS resolves domain names into IP addresses.
```

---

## Q12. What is an A record?

Answer:

```text
An A record maps a domain name to an IPv4 address.
```

---

## Q13. What is an AAAA record?

Answer:

```text
An AAAA record maps a domain name to an IPv6 address.
```

---

## Q14. What is an MX record?

Answer:

```text
An MX record maps a domain to mail exchange servers for email delivery.
```

---

## Q15. What is DHCP used for?

Answer:

```text
DHCP automatically assigns IP addresses and other network configuration information to devices.
```

---

## Q16. What is FTP used for?

Answer:

```text
FTP is used to transfer files between a client and a server.
```

---

## Q17. What are FTP ports 20 and 21 used for?

Answer:

```text
TCP port 21 is used for control traffic.
TCP port 20 is used for data transfer.
```

---

## Q18. What is SMB used for?

Answer:

```text
SMB is used for sharing network resources such as files, folders, printers, and serial ports.
```

---

## Q19. What is SAMBA?

Answer:

```text
SAMBA is an implementation/version of SMB that allows Linux and UNIX systems to share resources with Microsoft networks.
```

---

## Q20. If a PC can ping 8.8.8.8 but cannot open [www.google.com](http://www.google.com), what is the likely problem?

Answer:

```text
DNS problem.
```

---

## Q21. If a PC gets 169.254.x.x, what is the likely problem?

Answer:

```text
The PC failed to get an IP address from DHCP.
```

---

# 19. Final Mini Checkpoint

Try answering these without looking:

1. Which layer is closest to the end user?
2. Which layer handles compression and encryption?
3. Which protocol is used for secure web browsing?
4. Which email protocol sends email?
5. Which email protocol keeps mail on the server?
6. Which protocol converts domain names to IP addresses?
7. Which DNS record is used for IPv6?
8. Which protocol automatically gives IP addresses?
9. Which protocol uses TCP ports 20 and 21?
10. Which protocol is used for shared folders and printers?
11. What command displays DNS cache?
12. What command manually queries DNS servers?

Answers:

```text
1. Application Layer
2. Presentation Layer
3. HTTPS
4. SMTP
5. IMAP
6. DNS
7. AAAA
8. DHCP
9. FTP
10. SMB
11. ipconfig /displaydns
12. nslookup
```

---

# 20. Chapter 7 One-page Summary

```text
Chapter 7 is about the Application Layer.

Application Layer:
Provides network services to user applications.

Presentation Layer:
Formats, compresses, encrypts, and decrypts data.

Session Layer:
Creates and maintains sessions between applications.

HTTP:
Used for web browsing.

HTTPS:
Secure HTTP using authentication and encryption.

Email:
SMTP sends email.
POP downloads email.
IMAP keeps email on server and syncs across devices.

DNS:
Converts domain names to IP addresses.
A = IPv4
AAAA = IPv6
MX = mail server

DHCP:
Automatically gives IP address, subnet mask, gateway, DNS server.

FTP:
Transfers files.
Port 21 = control.
Port 20 = data.

SMB:
Shares files, folders, printers, and other resources.

Small Network:
Uses router, switch, PCs, printer, server, DHCP, DNS, HTTP/HTTPS, SMB, FTP.

Troubleshooting:
Check physical connection, IP settings, gateway, Internet IP, DNS, then application service.
Useful commands:
ipconfig
ipconfig /all
ipconfig /release
ipconfig /renew
ipconfig /displaydns
ping
tracert
nslookup
```

Chapter 7 is now complete.
