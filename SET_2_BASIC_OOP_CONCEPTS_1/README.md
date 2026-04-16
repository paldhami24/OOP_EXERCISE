# SET_2_BASIC_OOP_CONCEPTS_1

## Compilation Guide
To create all class files, run:
```bash
javac *.java
```

## Practical 6: Rectangle Class
**Problem Statement:**
Define a Java class named Rectangle. It should have two double data fields: width and height, both with a default value of 1. Implement a no-argument constructor and a constructor that takes width and height as parameters. Include methods `getArea()` and `getPerimeter()`.

**Sample Output:**
```text
Rectangle 1 (Default):
Area: 1.0
Perimeter: 4.0

Enter dimensions for Rectangle 2:
Width: 6
Height: 3

Rectangle 2:
Area: 18.0
Perimeter: 18.0
```

---

## Practical 7: Employee Class
**Problem Statement:**
Create an Employee class with private instance variables for `employeeName` (String) and `employeeSalary` (double). Implement public methods `readEmployeeData()` and `displayEmployeeData()`. Demonstrate object creation and method invocation in a main method.

**Sample Output:**
```text
Enter Employee Name: John
Enter Employee Salary: 62000

Employee Details:
Name: John
Salary: 62000.0
```

---

## Practical 8: Point Class
**Problem Statement:**
Create a Point class representing a 2D point (x, y). Implement a default constructor (x=5, y=5), a parameterized constructor, and a copy constructor. Include a `display()` method.

**Sample Output:**
```text
Point 1 (Default): (5.0, 5.0)

Enter coordinates for Point 2:
x: 8.1
y: 2.4

Point 2 (Parameterized): (8.1, 2.4)

Point 3 (Copy of P2): (8.1, 2.4)
```

---

## Practical 9: Rectangle Comparison
**Problem Statement:**
Define a Java class named Rectangle. Create two Rectangle objects. Compare the two rectangles based on their areas and print which one has a larger area.

**Sample Output:**
```text
Enter dimensions for Rectangle 1:
Width: 7
Height: 6

Enter dimensions for Rectangle 2:
Width: 9
Height: 4

Rectangle 1:
Area: 42.0
Perimeter: 26.0

Rectangle 2:
Area: 36.0
Perimeter: 26.0

Comparison:
Rectangle 1 has a larger area.
```
