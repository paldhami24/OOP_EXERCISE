# SET_3_BASIC_OOP_CONCEPTS_2

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 10: Static Data Members (BankAccount)
**Problem Statement:**
Design a class `BankAccount` with `account_holder_name` and `balance`. Use a static variable `interest_rate` (same for all accounts). Include methods to calculate and display the interest earned. Update interest rate using a static method.

**Sample Output:**
```text
Enter Account Holder Name: Rahul
Enter Initial Balance: 15000
Initial Interest Rate: 3.5%

Account Holder: Rahul
Balance: 15000.0
Interest Earned: 525.0

Enter new Interest Rate: 5.0
New Interest Rate: 5.0%

Account Holder: Rahul
Balance: 15000.0
Interest Earned: 750.0
```

---

## Practical 11: Inner Classes (College Admission)
**Problem Statement:**
Write a Java program to model a college admission system using the concept of inner classes. Create an outer class `College` and an inner class `Admission`. The inner class should access the `collegeName` from the outer class and display complete details.

**Sample Output:**
```text
Enter College Name: Stanford University
Enter Student Name: Emily
Enter Course: Computer Science

--- Admission Details ---
College: Stanford University
Student: Emily
Course: Computer Science
```

---

## Practical 12: Method Overloading (Volume Calculator)
**Problem Statement:**
Demonstrate method overloading to calculate the volume of different 3D shapes. Implement `calculateVolume()` for a Cube (side), a RectangularCube (length, width, height), and a Sphere (radius).

**Sample Output:**
```text
EEnter side of Cube: 7
Volume of Cube: 343.0

Enter dimensions for Rectangular Cube:
Length: 3
Width: 6
Height: 2
Volume of Rectangular Cube: 36.0

Enter radius of Sphere: 4
Volume of Sphere: 268.082573106329
```
