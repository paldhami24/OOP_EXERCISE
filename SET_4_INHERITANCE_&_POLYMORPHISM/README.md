# SET_4_INHERITANCE_&_POLYMORPHISM

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 13: Shape Inheritance (Triangle & Rectangle)
**Problem Statement:**
Design a base class `Shape` with two double data members `d1` and `d2`. Include a method `getData()` to initialize these. Create two derived classes, `Triangle` and `Rectangle`. Each should calculate its specific area.

**Sample Output:**
```text
Result for Triangle:
Enter base: 8
Enter height: 9

Area of Triangle: 36.0

Result for Rectangle:
Enter width: 7
Enter length: 5

Area of Rectangle: 35.0
```

---

## Practical 14: Bank Accounts (Inheritance)
**Problem Statement:**
Define a base class `BankAccount` with attributes like `accountNumber`, `accountHolderName`, and `balance` and methods `openAccount()`, `deposit()`, `withdraw()`, `checkBalance()`. Define subclasses `SavingAccount` (simple interest) and `FixedDepositAccount` (maturity amount).

**Sample Output:**
```text
=== Savings Account ===
Enter Account Number: 201
Enter Name: Rohan
Enter Balance: 8000

Account Opened Successfully.

Enter Interest Rate (%): 3.5
Enter Time (years): 3
Interest: 840.0
Current Balance: 8000.0

=== Fixed Deposit Account ===
Enter Account Number: 202
Enter Name: Meera
Enter Principal Amount: 15000
Enter Term (years): 4
Enter FD Interest Rate (%): 7.0

Account Opened Successfully.

Maturity Amount: 19658.72
Current Balance: 15000.0
```

---

## Practical 15: Method Overriding (Employee & Manager)
**Problem Statement:**
Create a base class `Employee` with `displayDetails()`. Create a subclass `Manager` that inherits from `Employee` and overrides `displayDetails()` to include `teamSize`. Demonstrate runtime polymorphism.

**Sample Output:**
```text
Enter Employee Details:
Name: David
Department: Finance

Enter Manager Details:
Name: Priya
Department: IT
Team Size: 8

--- Employee Display ---
Name: David
Department: Finance

--- Manager Display (Overridden) ---
Name: Priya
Department: IT
Team Size: 8
```
