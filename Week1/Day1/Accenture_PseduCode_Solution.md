# Logical and Bitwise Reasoning Questions with Python Solution

## Q1

### Code:

python
a, b, c = 2, 6, 8
a = (10 + 9) + c
if (c + b > a - c):
    print(a - b - c)
else:
    print(a + b + c)


### Solution:

* a = 27
* (c + b > a - c) → 14 > 19 → False
* Executes else: 27 + 6 + 8 = *41*
  *Answer*: 41

---

## Q2

### Code:

python
a, b, c = 0, 2, 10
b = 7 + a
a = (a + c) + a
b = (b + b) + c
c = 1 + b
print(a + b + c)


### Solution:

* b = 7, a = 10
* b = 14 + 10 = 24
* c = 25
* Total: 10 + 24 + 25 = *59*
  *Answer*: 59

---

## Q3

### Code:

python
pp, rr = 7, 4
qq = (pp & rr) ^ pp
if (6 & qq & pp) < (pp & 6):
    print(True)
if (6 ^ qq) < (pp + 6):
    print(True)
rr = rr ^ qq
print(pp + qq + rr)


### Solution:

* qq = 4 ^ 7 = 3
* Conditions: 2 < 6 ✔ and 5 < 13 ✔
* rr = 4 ^ 3 = 7
* Output: 7 + 3 + 7 = *17*
  *Answer*: 17

---

## Q4

### Code:

python
if (6 ^ 9 ^ 10) > (10 ^ 6):
    print("Yes")
if (6 ^ 6 ^ 8) > (9 ^ 4):
    print("Yes")
print(9 + 6 + 10)


### Solution:

* (6 ^ 9 ^ 10) = 5
* (10 ^ 6) = 12 → 5 > 12 ❌
* (6 ^ 6 ^ 8) = 8, (9 ^ 4) = 13 → 8 > 13 ❌
* Output: *25*
  *Answer*: 25

---

## Q5

### Code:

python
if 13 < (7 + 2):
    pp = 13 - 2
else:
    if (1 + 2 - 8) < (8 + 1):
        pp = 1 + 8
    else:
        pp = 2 + 17
qq, rr = 2, 17
print(pp + qq + rr)


### Solution:

* First condition false → else block runs
* Second condition: -5 < 9 ✔ → pp = 9
* Final result: 9 + 2 + 17 = *28*
  *Answer*: 28

---

## Q6

### Code:

python
if (5 + 4) < (4 - 5) or (8 > 4):
    q = (4 & 8) & 5
else:
    q = 2
p, r = 8, 5
print(p + q + r)


### Solution:

* 9 < -1 ❌ or 8 > 4 ✔ → condition is true
* q = (4 & 8) & 5 = 0
* Result: 8 + 0 + 5 = *13*
  *Answer*: 13

---

## Q7

### Code:

python
a, b = 1, 2
for c in range(5, 10):
    if (a + b + c) % 2 == 0:
        a ^= c
        b = 5 ^ c
print(a + b)


### Solution:

* Loop runs for c = 5 to 9
* Updates a and b using XOR operations
* Final values: a = 28, b = 12
* Output: *40*
  *Answer*: 40

---

## Q8

### Code:

python
a, b, c = 13, 5, 5
if (a & 7 & b) > (6 & a):
    b = 12
if (2 + 3) < (5 + 6):
    b = 14
    a = 13
print(a + b + c)


### Solution:

* First condition false
* Second condition true → b = 14, a = 13
* Output: 13 + 14 + 5 = *32*
  *Answer*: 32

---

## Q9

### Code:

python
p, q, r = 0, 8, 10
if p < r and (p & q) < r:
    q = 0
p = 9
r = 9
q = 18
print(p + q + r)


### Solution:

* Initial condition true → q = 0
* Then p = 9, r = 9, q = 18
* Output: 9 + 18 + 9 = *36*
  *Answer*: 36

---

## Q10

### Code:

python
p, q, r = 13, 4, 12
q = p & q
r = q + q
print(p + q + r)


### Solution:

* q = 13 & 4 = 4
* r = 4 + 4 = 8
* Output: 13 + 4 + 8 = *25*
  *Answer*: 25

---

## Q11

### Code:

python
p, q, r = 6, 3, 9
if (p & r) < (q - p):
    q = 0
r = (r + p) & q
print(p + q + r)


### Solution:

* (p & r) = 0, (q - p) = -3 → 0 < -3 ❌
* r = (9 + 6) & 3 = 15 & 3 = 3
* Output: 6 + 3 + 3 = *12*
  *Answer*: 12

---

## Q12

### Code:

python
pp, qq, rr = 5, 4, 4
while rr <= 5:
    pp += rr * rr
    rr += 1
print(pp + qq)


### Solution:

* Iteration 1: rr = 4 → pp = 5 + 16 = 21
* Iteration 2: rr = 5 → pp = 21 + 25 = 46
* Final: rr = 6 → loop ends
* Output: 46 + 4 = *50*
  *Answer*: 50

---

## Q13

### Code:

python
p, q = 4, 2
for r in range(5, 7):
    p *= r
    q += p
print(p + q)


### Solution:

* r = 5 → p = 4 \* 5 = 20 → q = 2 + 20 = 22
* r = 6 → p = 20 \* 6 = 120 → q = 22 + 120 = 142
* Output: 120 + 142 = *262*
  *Answer*: 262

---

## Q14

### Code:

python
a, b, c = 1, 2, 9
if (b + c) > (c - b):
    c = 2
if (a + b) < c:
    b = 1
print(a + b + c)


### Solution:

* (2 + 9) > (9 - 2) → 11 > 7 ✔ → c = 2
* (1 + 2) < 2 → 3 < 2 ❌
* Output: 1 + 2 + 2 = *5*
  *Answer*: 5

---

## Q15

### Code:

python
a, b, c = 6, 8, 4
if (a & b) > (b & c):
    a = 0
    c = a ^ c
print(a + b + c)


### Solution:

* (a & b) = 0, (b & c) = 0 → 0 > 0 ❌
* So nothing changes
* Output: 6 + 8 + 4 = *18*
  *Answer*: 18

---

## Q16

### Code:

python
a, b, c = 3, 0, 4
b = c ^ c
c += 20
if a > 10:
    b = c + 2
else:
    a = a ^ c
print(a + b + c)


### Solution:

* b = 0, c = 24
* a = 3 ^ 24 = 27
* Output: 27 + 0 + 24 = *51*
  *Answer*: 51

---

## Q17

### Code:

python
a, b = 1, 5
for c in range(4, 6):
    b += c
    if b % 2 == 0:
        b ^= c
print(a + b)


### Solution:

* c = 4 → b = 5 + 4 = 9 → 9 % 2 != 0
* c = 5 → b = 9 + 5 = 14 → 14 % 2 == 0 → b = 14 ^ 5 = 11
* Final: a + b = 1 + 11 = *12*
  *Answer*: 12

---