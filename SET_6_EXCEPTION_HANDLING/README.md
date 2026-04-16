# SET-06 (Exception Handling)

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 20: Run-time Errors (Try-Catch)
**Problem Statement:**
Take the value of denominator and numerator from user. Implement exception handling to manage all possible run-time errors (DivideByZero, NumberFormat).

**Sample Output:**
```text
> java p20 25 5
Result: 5

> java p20 8 0
Error: Division by zero is not allowed.

> java p20 xyz 4
Error: Invalid input. Please enter numeric values only.
```

---

## Practical 21: Voting App (Throw Exception)
**Problem Statement:**
Create a `VotingApp`. Check eligibility; if age < 18, throw `IllegalArgumentException`. Use try-catch-finally.

**Sample Output:**
```text
Enter your age: 21
You are eligible to vote
Validation process completed
```

---

## Practical 22: Custom Exception (Library)
**Problem Statement:**
Define custom exception `BookNotAvailableException`. Library has `availableBooks`. If requested > available, throw exception.

**Sample Output:**
```text
Available Books: 5
Enter number of books to issue (0 to exit): 3
Book issued successfully

Available Books: 2
Enter number of books to issue (0 to exit): 4
Error: Not enough books in stock
```
