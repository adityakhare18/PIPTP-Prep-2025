
# Set 1: Recursion with Statements After Recursive Calls (Unwinding Phase)

---

##  MCQ 1: Basic Print After Recursion

###  Code:
```python
function show(n):
    if n == 0:
        return
    show(n - 1)
    print(n)

show(3)
```

###  Recursion Tree:
```
show(3)
├── show(2)
│   ├── show(1)
│   │   ├── show(0)
│   │   └── print(1)
│   └── print(2)
└── print(3)
```

###  Output:
```
1 2 3
```

###  Explanation:
Each call to `show(n)` prints *after* the recursive call, so the numbers are printed in **ascending order** during unwinding.

---

##  MCQ 2: Two Recursive Calls, Post Statement

###  Code:
```python
function recur(n):
    if n == 0:
        return
    recur(n - 1)
    recur(n - 1)
    print(n)

recur(2)
```

###  Recursion Tree:
```
recur(2)
├── recur(1)
│   ├── recur(0)
│   └── recur(0)
│   └── print(1)
├── recur(1)
│   ├── recur(0)
│   └── recur(0)
│   └── print(1)
└── print(2)
```

###  Output:
```
1 1 2
```

###  Explanation:
Each level 1 prints `1`, and the root prints `2`. All prints occur during **unwinding**.

---

##  MCQ 3: Reverse Print with Array

###  Code:
```python
arr = [4, 5, 6]

function reversePrint(i):
    if i == length(arr):
        return
    reversePrint(i + 1)
    print(arr[i])

reversePrint(0)
```

###  Recursion Tree:
```
reversePrint(0)
├── reversePrint(1)
│   ├── reversePrint(2)
│   │   ├── reversePrint(3) → return
│   │   └── print(6)
│   └── print(5)
└── print(4)
```

###  Output:
```
6 5 4
```

###  Explanation:
Recursive calls go forward till end of array, then print in **reverse** during unwind.

---

##  MCQ 4: Factorial with Print

###  Code:
```python
function fact(n):
    if n == 1:
        return 1
    result = n * fact(n - 1)
    print(result)
    return result

fact(4)
```

###  Calculations:
```
fact(4) = 4 * fact(3)
fact(3) = 3 * fact(2)
fact(2) = 2 * fact(1) = 2 * 1 = 2 → print(2)
fact(3) = 3 * 2 = 6 → print(6)
fact(4) = 4 * 6 = 24 → print(24)
```

###  Output:
```
2 6 24
```

###  Explanation:
Each factorial result is printed after the recursive call, in **increasing order of n**.

---

##  MCQ 5: Sum Accumulator

###  Code:
```python
function sum(n, total):
    if n == 0:
        print(total)
        return
    sum(n - 1, total + n)
    print(n)

sum(3, 0)
```

###  Flow:
```
sum(3, 0) → sum(2, 3)
          → sum(1, 5)
            → sum(0, 6) → print(6)
          → print(1)
        → print(2)
      → print(3)
```

###  Output:
```
6 1 2 3
```

###  Explanation:
The total `6` is printed first. Then values of `n` are printed during **unwinding**.

---

**Conclusion:** All prints happen **after** recursive calls, so outputs are controlled by the **order of unwinding** the recursion stack.
