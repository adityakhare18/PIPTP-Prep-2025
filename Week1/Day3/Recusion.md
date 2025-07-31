
#  Recursion: Statements After Recursive Calls (Unwinding Phase)

##  MCQ 1: Simple Print After Recursive Call

###  Code:
```python
function printUp(n):
    if n == 0:
        return
    printUp(n - 1)
    print(n)

printUp(3)
```

###  Recursion Tree:
```
printUp(3)
├── printUp(2)
│   ├── printUp(1)
│   │   ├── printUp(0)
│   │   └── print(1)
│   └── print(2)
└── print(3)
```

###  Output:
```
1 2 3
```

###  Explanation:
Print happens **after** recursive call, so numbers are printed in **ascending order** during the unwind.

---

##  MCQ 2: Double Recursive Call with Print After Both

###  Code:
```python
function mystery(n):
    if n == 0:
        return
    mystery(n - 1)
    mystery(n - 1)
    print(n)

mystery(2)
```

###  Recursion Tree:
```
mystery(2)
├── mystery(1)
│   ├── mystery(0)
│   └── mystery(0)
│   └── print(1)
├── mystery(1)
│   ├── mystery(0)
│   └── mystery(0)
│   └── print(1)
└── print(2)
```

###  Output:
```
1 1 2
```

###  Explanation:
Each `mystery(1)` results in two base calls, then prints `1`. Then `2` is printed at the root.

---

##  MCQ 3: Print After Recursion in a Loop

###  Code:
```python
function loopRec(n):
    if n == 0:
        return
    for i = 1 to 2:
        loopRec(n - 1)
    print(n)

loopRec(2)
```

###  Recursion Tree:
```
loopRec(2)
├── loopRec(1)
│   ├── loopRec(0)
│   └── loopRec(0)
│   └── print(1)
├── loopRec(1)
│   ├── loopRec(0)
│   └── loopRec(0)
│   └── print(1)
└── print(2)
```

###  Output:
```
1 1 2
```

###  Explanation:
Each loop makes two recursive calls to `loopRec(1)`, and each of those prints `1`. Finally, root `2` is printed.

---

##  MCQ 4: Recursive Function with Accumulator

###  Code:
```python
function sumDown(n, total):
    if n == 0:
        print(total)
        return
    sumDown(n - 1, total + n)
    print(n)

sumDown(3, 0)
```

###  Values per level:
```
sumDown(3, 0) ➜ sumDown(2, 3)
              ➜ sumDown(1, 5)
                ➜ sumDown(0, 6) prints 6
              prints 1
            prints 2
          prints 3
```

###  Output:
```
6 3 2 1
```

###  Explanation:
- Total is accumulated as: `0 + 3 + 2 + 1 = 6`
- Print happens **after** return (unwinding).

---

##  MCQ 5: Reverse Array Print

###  Code:
```python
array = [10, 20, 30, 40]

function reversePrint(i):
    if i == length(array):
        return
    reversePrint(i + 1)
    print(array[i])

reversePrint(0)
```

###  Recursion Tree:
```
reversePrint(0)
├── reversePrint(1)
│   ├── reversePrint(2)
│   │   ├── reversePrint(3)
│   │   │   ├── reversePrint(4) → return
│   │   │   └── print(40)
│   │   └── print(30)
│   └── print(20)
└── print(10)
```

###  Output:
```
40 30 20 10
```

###  Explanation:
It prints **in reverse** as printing occurs in the **unwind** phase.

---
