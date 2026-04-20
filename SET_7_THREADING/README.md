# SET_07_Exception Handling

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 23: Multi-threading with Intervals
**Problem Statement:**
Write a Java program that creates two threads:
First thread prints numbers from 1 to 10 at the interval of 1 second.
Second thread prints numbers from 11 to 20 at the interval of 500 ms.
Run both threads and display the output.

**Sample Output:**
```text

Thread 2: 11
Thread 1: 1
Thread 2: 12
Thread 2: 13
Thread 1: 2
Thread 2: 14
Thread 2: 15
Thread 1: 3
...
Thread 2: 20
Thread 1: 10

```

---

## Practical 24: Sequential Thread Execution (Join)
**Problem Statement:**
Write a Java program where Thread T1 prints 1 to 100, T2 prints 101 to 200 and T3 prints 201 to 300. Initiate execution of all three threads but ensure that numbers should be printed sequentially using the join() method.

**Sample Output:**
```text

1
2
...
100
101
102
...
200
201
...
300


```

---

## Practical 25: Synchronized Multiplication Tables
**Problem Statement:**
Write a Java program where two threads print multiplication tables (e.g., Table of 5 and Table of 7). Use a synchronized method so that table outputs do not mix and remain consistent.

**Sample Output:**
```text

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70

```

