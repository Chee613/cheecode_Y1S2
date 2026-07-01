# Chapter 8 Instruction Set Architecture: 50 Extreme-Hard Questions

## Question 1

**Question:** Which instruction element specifies the action?

**Choices:**
- **A.** Next-instruction address
- **B.** Opcode
- **C.** Result location
- **D.** Source operand

**Correct Answer:** Opcode

**Explanation:** The opcode selects the operation the CPU performs.

---

## Question 2

**Question:** For ADD R1,R2,R3 meaning R1←R2+R3, which is the destination?

**Choices:**
- **A.** R3
- **B.** R2
- **C.** R1
- **D.** Memory[R1]

**Correct Answer:** R1

**Explanation:** The first named register receives the result in this three-address convention.

---

## Question 3

**Question:** Why can a zero-address ISA evaluate expressions?

**Choices:**
- **A.** The opcode contains all data
- **B.** Every operand is in ROM
- **C.** It has no CPU state
- **D.** Operands are implicit on a stack

**Correct Answer:** Operands are implicit on a stack

**Explanation:** Stack operations consume and produce top-of-stack values without explicit addresses.

---

## Question 4

**Question:** Which organization makes an accumulator implicit?

**Choices:**
- **A.** One-address instructions
- **B.** Three-address instructions
- **C.** Four-address instructions
- **D.** Zero-opcode instructions

**Correct Answer:** One-address instructions

**Explanation:** The explicit address names one operand while AC supplies the other and destination.

---

## Question 5

**Question:** What is the key tradeoff of three-address instructions?

**Choices:**
- **A.** No opcode field
- **B.** Fewer instructions but more bits per instruction
- **C.** More instructions and no registers
- **D.** No temporary values

**Correct Answer:** Fewer instructions but more bits per instruction

**Explanation:** Naming two sources and a destination reduces moves but enlarges encoding.

---

## Question 6

**Question:** Why does packed decimal use 4 bits per digit?

**Choices:**
- **A.** It stores two ASCII bytes per digit
- **B.** Four bits encode only 0–7
- **C.** Four bits encode decimal values 0–9
- **D.** It is binary floating point

**Correct Answer:** Four bits encode decimal values 0–9

**Explanation:** A nibble can represent all ten decimal digits, leaving six invalid patterns.

---

## Question 7

**Question:** What is x86 little-endian storage of 0x12345678 at increasing byte addresses?

**Choices:**
- **A.** 56 78 12 34
- **B.** 34 12 78 56
- **C.** 12 34 56 78
- **D.** 78 56 34 12

**Correct Answer:** 78 56 34 12

**Explanation:** The least significant byte occupies the lowest address.

---

## Question 8

**Question:** Which statement about “word” is correct?

**Choices:**
- **A.** x86 word is 16 bits; ARM word is 32 bits
- **B.** x86 word is 32 bits; ARM word is 16 bits
- **C.** Both are always 64 bits
- **D.** Word size is always one byte

**Correct Answer:** x86 word is 16 bits; ARM word is 32 bits

**Explanation:** The architecture-specific terminology differs.

---

## Question 9

**Question:** What does arithmetic right shift preserve?

**Choices:**
- **A.** All shifted-out bits
- **B.** The sign bit
- **C.** The least significant bit always
- **D.** The carry flag only

**Correct Answer:** The sign bit

**Explanation:** Sign extension maintains the signed twos-complement interpretation.

---

## Question 10

**Question:** What distinguishes rotate from shift?

**Choices:**
- **A.** Rotate always inserts zeros
- **B.** Shift preserves every bit
- **C.** Rotated-out bits wrap around
- **D.** Rotate changes operand width

**Correct Answer:** Rotated-out bits wrap around

**Explanation:** A shift discards exiting bits; a rotate reinserts them at the opposite end.

---

## Question 11

**Question:** What is 10100110 logical right shifted by 3?

**Choices:**
- **A.** 11110100
- **B.** 00110000
- **C.** 11010100
- **D.** 00010100

**Correct Answer:** 00010100

**Explanation:** Zeros enter on the left and the three low bits are discarded.

---

## Question 12

**Question:** What is 10100110 arithmetic right shifted by 3?

**Choices:**
- **A.** 11110100
- **B.** 00010100
- **C.** 11010100
- **D.** 00110101

**Correct Answer:** 11110100

**Explanation:** The leading 1 is replicated to preserve a negative signed value.

---

## Question 13

**Question:** What is 10100110 rotated right by 3?

**Choices:**
- **A.** 00010100
- **B.** 11010100
- **C.** 11110100
- **D.** 00110101

**Correct Answer:** 11010100

**Explanation:** The three low bits wrap to the high end.

---

## Question 14

**Question:** An unsigned 8-bit SIMD lane computes 250+10 with wraparound. What result?

**Choices:**
- **A.** 260
- **B.** 255
- **C.** 4
- **D.** 0

**Correct Answer:** 4

**Explanation:** Modulo 256 arithmetic discards the carry.

---

## Question 15

**Question:** The same lane uses unsigned saturation. What result?

**Choices:**
- **A.** 250
- **B.** 260
- **C.** 4
- **D.** 255

**Correct Answer:** 255

**Explanation:** Saturation clamps overflow to the maximum representable value.

---

## Question 16

**Question:** Why must MMX code execute EMMS before x87 floating-point use?

**Choices:**
- **A.** MMX aliases x87 register state
- **B.** EMMS flushes main memory
- **C.** MMX has no registers
- **D.** x87 requires DMA

**Correct Answer:** MMX aliases x87 register state

**Explanation:** EMMS marks the shared floating-point/MMX register tags available again.

---

## Question 17

**Question:** What does SIMD provide?

**Choices:**
- **A.** One core becomes many machines
- **B.** One instruction operates on multiple packed data elements
- **C.** Many instructions operate on one bit
- **D.** Every lane executes a different opcode

**Correct Answer:** One instruction operates on multiple packed data elements

**Explanation:** Data-level parallelism applies the same operation across lanes.

---

## Question 18

**Question:** Why is ARM called a load/store architecture?

**Choices:**
- **A.** It has no registers
- **B.** Every instruction accesses memory
- **C.** Only loads and stores access memory; ALU operations use registers
- **D.** Stores execute arithmetic

**Correct Answer:** Only loads and stores access memory; ALU operations use registers

**Explanation:** Separating memory access simplifies regular execution.

---

## Question 19

**Question:** What does zero-extension do to an 8-bit unsigned value?

**Choices:**
- **A.** Saturates the value
- **B.** Rotates bits
- **C.** Replicates the sign bit
- **D.** Fills new high bits with zeros

**Correct Answer:** Fills new high bits with zeros

**Explanation:** Unsigned widening preserves magnitude by adding leading zeros.

---

## Question 20

**Question:** What does sign-extension do to a negative twos-complement value?

**Choices:**
- **A.** Replicates its high sign bit
- **B.** Discards the sign
- **C.** Adds only zeros
- **D.** Converts it to BCD

**Correct Answer:** Replicates its high sign bit

**Explanation:** Repeating the sign bit preserves the signed value at larger width.

---

## Question 21

**Question:** Which condition executes when x86 Z = 1?

**Choices:**
- **A.** Not equal
- **B.** Equal
- **C.** Negative
- **D.** Overflow

**Correct Answer:** Equal

**Explanation:** A compare producing zero sets Z and satisfies equality.

---

## Question 22

**Question:** Why does Thumb improve code density?

**Choices:**
- **A.** It doubles every instruction to 64 bits
- **B.** It stores source code directly
- **C.** It uses compact encodings and often fewer register bits
- **D.** It eliminates opcodes

**Correct Answer:** It uses compact encodings and often fewer register bits

**Explanation:** Restricting common encodings permits many 16-bit instructions.

---

## Question 23

**Question:** What is Thumb-2s main advantage over original Thumb?

**Choices:**
- **A.** It supports only 8-bit instructions
- **B.** It removes branches
- **C.** It requires x86 registers
- **D.** It mixes 16- and 32-bit encodings for density and capability

**Correct Answer:** It mixes 16- and 32-bit encodings for density and capability

**Explanation:** Variable width retains compact common operations while encoding richer ones.

---

## Question 24

**Question:** Why is CALL paired with RETURN?

**Choices:**
- **A.** CALL saves a return point and RETURN restores control
- **B.** CALL stores no state
- **C.** RETURN performs DMA
- **D.** CALL erases the stack

**Correct Answer:** CALL saves a return point and RETURN restores control

**Explanation:** Subroutine invocation must remember where execution should resume.

---

## Question 25

**Question:** Which I/O design lets ordinary load/store instructions address devices?

**Choices:**
- **A.** Isolated I/O only
- **B.** Memory-mapped I/O
- **C.** DMA without addresses
- **D.** An instruction stack

**Correct Answer:** Memory-mapped I/O

**Explanation:** Device registers share the normal address space.

---

## Question 26

**Question:** A 32-bit three-address format uses 5 opcode bits and three 3-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 5 address bits and 32 locations
- **B.** 19 address bits and 524288 locations
- **C.** 18 address bits and 262144 locations
- **D.** 3 address bits and 8 locations

**Correct Answer:** 18 address bits and 262144 locations

**Explanation:** Subtract the opcode and three register fields: 32 − 5 − 3(3) = 18 bits.

---

## Question 27

**Question:** A 32-bit three-address format uses 6 opcode bits and three 3-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 6 address bits and 64 locations
- **B.** 18 address bits and 262144 locations
- **C.** 3 address bits and 8 locations
- **D.** 17 address bits and 131072 locations

**Correct Answer:** 17 address bits and 131072 locations

**Explanation:** Subtract the opcode and three register fields: 32 − 6 − 3(3) = 17 bits.

---

## Question 28

**Question:** A 32-bit three-address format uses 4 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 16 address bits and 65536 locations
- **B.** 17 address bits and 131072 locations
- **C.** 4 address bits and 16 locations
- **D.** 4 address bits and 16 locations

**Correct Answer:** 16 address bits and 65536 locations

**Explanation:** Subtract the opcode and three register fields: 32 − 4 − 3(4) = 16 bits.

---

## Question 29

**Question:** A 40-bit three-address format uses 6 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 4 address bits and 16 locations
- **B.** 22 address bits and 4194304 locations
- **C.** 6 address bits and 64 locations
- **D.** 23 address bits and 8388608 locations

**Correct Answer:** 22 address bits and 4194304 locations

**Explanation:** Subtract the opcode and three register fields: 40 − 6 − 3(4) = 22 bits.

---

## Question 30

**Question:** A 40-bit three-address format uses 7 opcode bits and three 3-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 3 address bits and 8 locations
- **B.** 25 address bits and 33554432 locations
- **C.** 24 address bits and 16777216 locations
- **D.** 7 address bits and 128 locations

**Correct Answer:** 24 address bits and 16777216 locations

**Explanation:** Subtract the opcode and three register fields: 40 − 7 − 3(3) = 24 bits.

---

## Question 31

**Question:** A 48-bit three-address format uses 8 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 29 address bits and 536870912 locations
- **B.** 4 address bits and 16 locations
- **C.** 8 address bits and 256 locations
- **D.** 28 address bits and 268435456 locations

**Correct Answer:** 28 address bits and 268435456 locations

**Explanation:** Subtract the opcode and three register fields: 48 − 8 − 3(4) = 28 bits.

---

## Question 32

**Question:** A 48-bit three-address format uses 6 opcode bits and three 5-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 27 address bits and 134217728 locations
- **B.** 6 address bits and 64 locations
- **C.** 28 address bits and 268435456 locations
- **D.** 5 address bits and 32 locations

**Correct Answer:** 27 address bits and 134217728 locations

**Explanation:** Subtract the opcode and three register fields: 48 − 6 − 3(5) = 27 bits.

---

## Question 33

**Question:** A 56-bit three-address format uses 8 opcode bits and three 5-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 8 address bits and 256 locations
- **B.** 33 address bits and 8589934592 locations
- **C.** 34 address bits and 17179869184 locations
- **D.** 5 address bits and 32 locations

**Correct Answer:** 33 address bits and 8589934592 locations

**Explanation:** Subtract the opcode and three register fields: 56 − 8 − 3(5) = 33 bits.

---

## Question 34

**Question:** A 56-bit three-address format uses 10 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 4 address bits and 16 locations
- **B.** 10 address bits and 1024 locations
- **C.** 34 address bits and 17179869184 locations
- **D.** 35 address bits and 34359738368 locations

**Correct Answer:** 34 address bits and 17179869184 locations

**Explanation:** Subtract the opcode and three register fields: 56 − 10 − 3(4) = 34 bits.

---

## Question 35

**Question:** A 64-bit three-address format uses 8 opcode bits and three 6-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 39 address bits and 549755813888 locations
- **B.** 8 address bits and 256 locations
- **C.** 6 address bits and 64 locations
- **D.** 38 address bits and 274877906944 locations

**Correct Answer:** 38 address bits and 274877906944 locations

**Explanation:** Subtract the opcode and three register fields: 64 − 8 − 3(6) = 38 bits.

---

## Question 36

**Question:** A 64-bit three-address format uses 12 opcode bits and three 5-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 37 address bits and 137438953472 locations
- **B.** 12 address bits and 4096 locations
- **C.** 38 address bits and 274877906944 locations
- **D.** 5 address bits and 32 locations

**Correct Answer:** 37 address bits and 137438953472 locations

**Explanation:** Subtract the opcode and three register fields: 64 − 12 − 3(5) = 37 bits.

---

## Question 37

**Question:** A 24-bit three-address format uses 4 opcode bits and three 2-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 4 address bits and 16 locations
- **B.** 14 address bits and 16384 locations
- **C.** 15 address bits and 32768 locations
- **D.** 2 address bits and 4 locations

**Correct Answer:** 14 address bits and 16384 locations

**Explanation:** Subtract the opcode and three register fields: 24 − 4 − 3(2) = 14 bits.

---

## Question 38

**Question:** A 24-bit three-address format uses 5 opcode bits and three 2-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 5 address bits and 32 locations
- **B.** 14 address bits and 16384 locations
- **C.** 13 address bits and 8192 locations
- **D.** 2 address bits and 4 locations

**Correct Answer:** 13 address bits and 8192 locations

**Explanation:** Subtract the opcode and three register fields: 24 − 5 − 3(2) = 13 bits.

---

## Question 39

**Question:** A 24-bit three-address format uses 6 opcode bits and three 2-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 2 address bits and 4 locations
- **B.** 13 address bits and 8192 locations
- **C.** 6 address bits and 64 locations
- **D.** 12 address bits and 4096 locations

**Correct Answer:** 12 address bits and 4096 locations

**Explanation:** Subtract the opcode and three register fields: 24 − 6 − 3(2) = 12 bits.

---

## Question 40

**Question:** A 28-bit three-address format uses 5 opcode bits and three 3-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 14 address bits and 16384 locations
- **B.** 15 address bits and 32768 locations
- **C.** 3 address bits and 8 locations
- **D.** 5 address bits and 32 locations

**Correct Answer:** 14 address bits and 16384 locations

**Explanation:** Subtract the opcode and three register fields: 28 − 5 − 3(3) = 14 bits.

---

## Question 41

**Question:** A 28-bit three-address format uses 4 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 4 address bits and 16 locations
- **B.** 12 address bits and 4096 locations
- **C.** 4 address bits and 16 locations
- **D.** 13 address bits and 8192 locations

**Correct Answer:** 12 address bits and 4096 locations

**Explanation:** Subtract the opcode and three register fields: 28 − 4 − 3(4) = 12 bits.

---

## Question 42

**Question:** A 36-bit three-address format uses 6 opcode bits and three 3-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 22 address bits and 4194304 locations
- **B.** 6 address bits and 64 locations
- **C.** 21 address bits and 2097152 locations
- **D.** 3 address bits and 8 locations

**Correct Answer:** 21 address bits and 2097152 locations

**Explanation:** Subtract the opcode and three register fields: 36 − 6 − 3(3) = 21 bits.

---

## Question 43

**Question:** A 36-bit three-address format uses 8 opcode bits and three 2-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 8 address bits and 256 locations
- **B.** 23 address bits and 8388608 locations
- **C.** 2 address bits and 4 locations
- **D.** 22 address bits and 4194304 locations

**Correct Answer:** 22 address bits and 4194304 locations

**Explanation:** Subtract the opcode and three register fields: 36 − 8 − 3(2) = 22 bits.

---

## Question 44

**Question:** A 44-bit three-address format uses 8 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 24 address bits and 16777216 locations
- **B.** 25 address bits and 33554432 locations
- **C.** 4 address bits and 16 locations
- **D.** 8 address bits and 256 locations

**Correct Answer:** 24 address bits and 16777216 locations

**Explanation:** Subtract the opcode and three register fields: 44 − 8 − 3(4) = 24 bits.

---

## Question 45

**Question:** A 44-bit three-address format uses 6 opcode bits and three 5-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 24 address bits and 16777216 locations
- **B.** 23 address bits and 8388608 locations
- **C.** 6 address bits and 64 locations
- **D.** 5 address bits and 32 locations

**Correct Answer:** 23 address bits and 8388608 locations

**Explanation:** Subtract the opcode and three register fields: 44 − 6 − 3(5) = 23 bits.

---

## Question 46

**Question:** A 52-bit three-address format uses 10 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 31 address bits and 2147483648 locations
- **B.** 4 address bits and 16 locations
- **C.** 30 address bits and 1073741824 locations
- **D.** 10 address bits and 1024 locations

**Correct Answer:** 30 address bits and 1073741824 locations

**Explanation:** Subtract the opcode and three register fields: 52 − 10 − 3(4) = 30 bits.

---

## Question 47

**Question:** A 52-bit three-address format uses 8 opcode bits and three 5-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 5 address bits and 32 locations
- **B.** 30 address bits and 1073741824 locations
- **C.** 8 address bits and 256 locations
- **D.** 29 address bits and 536870912 locations

**Correct Answer:** 29 address bits and 536870912 locations

**Explanation:** Subtract the opcode and three register fields: 52 − 8 − 3(5) = 29 bits.

---

## Question 48

**Question:** A 60-bit three-address format uses 10 opcode bits and three 5-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 35 address bits and 34359738368 locations
- **B.** 36 address bits and 68719476736 locations
- **C.** 10 address bits and 1024 locations
- **D.** 5 address bits and 32 locations

**Correct Answer:** 35 address bits and 34359738368 locations

**Explanation:** Subtract the opcode and three register fields: 60 − 10 − 3(5) = 35 bits.

---

## Question 49

**Question:** A 60-bit three-address format uses 12 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 4 address bits and 16 locations
- **B.** 36 address bits and 68719476736 locations
- **C.** 37 address bits and 137438953472 locations
- **D.** 12 address bits and 4096 locations

**Correct Answer:** 36 address bits and 68719476736 locations

**Explanation:** Subtract the opcode and three register fields: 60 − 12 − 3(4) = 36 bits.

---

## Question 50

**Question:** A 64-bit three-address format uses 16 opcode bits and three 4-bit register fields. What remains for a direct address?

**Choices:**
- **A.** 37 address bits and 137438953472 locations
- **B.** 16 address bits and 65536 locations
- **C.** 36 address bits and 68719476736 locations
- **D.** 4 address bits and 16 locations

**Correct Answer:** 36 address bits and 68719476736 locations

**Explanation:** Subtract the opcode and three register fields: 64 − 16 − 3(4) = 36 bits.
