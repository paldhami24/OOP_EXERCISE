# SET_5_INTERFACE_&_ABSTRACT_CLASS

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 16: Interface (Classify)
**Problem Statement:**
Implement a method `getDivision(double average)` in a class `Result` implementing an interface `Classify`. Return "First Division" if average >= 60.

**Sample Output:**
```text
Enter percentage: 58
Division: Second Division
```

---

## Practical 17: Multiple Interfaces
**Problem Statement:**
Create interfaces `Exam` (isPassed) and `Classify` (getDivision). Class `Result` should implement both.

**Sample Output:**
```text
Enter Marks: 32
Status: Failed
Division: Fail
```

---

## Practical 18: Abstract Class (Vehicle)
**Problem Statement:**
Create an abstract class `Vehicle` with abstract methods `fuelType()` and `noOfWheels()`. Subclasses `Car` and `Bike` should implement these.

**Sample Output:**
```text
--- Car Details ---
Fuel: CNG/Petrol
Wheels: 4

--- Bike Details ---
Fuel: Electric
Wheels: 2
```

---

## Practical 19: Packages (Student & Exam)
**Problem Statement:**
Use packages `student` (Student class) and `exam` (Result class inheriting Student). calculate and display mark sheet.

**Sample Output:**
```text
Enter Roll No: 205
Enter Name: John 
Enter Marks 1: 72
Enter Marks 2: 68
Enter Marks 3: 75

--- Mark Sheet ---
Roll No: 205
Name: John
Marks 1: 72
Marks 2: 68
Marks 3: 75
Total: 215
Average: 71.67
```
