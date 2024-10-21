## SOLID Principles

The SOLID principles help in designing systems that are easy to maintain, scalable, and avoid code duplication. Below is a breakdown of each principle along with an explanation and corresponding examples.

### 1. **Single Responsibility Principle (SRP)**

**Definition:**  
A class should have one and only one reason to change, meaning that a class should have only one job or responsibility.

**Example:**
```java
// Incorrect
public class Invoice {
    public void calculateTotal() {
        // logic to calculate total
    }
    
    public void printInvoice() {
        // logic to print invoice
    }
}

// Correct
public class Invoice {
    public void calculateTotal() {
        // logic to calculate total
    }
}

public class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        // logic to print invoice
    }
}
```
**Explanation:**  
Here, the responsibility of calculating the invoice and printing the invoice is separated into two classes. Each class has a single responsibility, adhering to SRP.

---

### 2. **Open/Closed Principle (OCP)**

**Definition:**  
Software entities (classes, modules, functions) should be open for extension but closed for modification.

**Example:**
```java
// Incorrect
public class GraphicEditor {
    public void drawShape(Shape shape) {
        if (shape instanceof Circle) {
            drawCircle((Circle) shape);
        } else if (shape instanceof Rectangle) {
            drawRectangle((Rectangle) shape);
        }
    }
    
    public void drawCircle(Circle circle) { /* ... */ }
    public void drawRectangle(Rectangle rectangle) { /* ... */ }
}

class Circle extends Shape { }
class Rectangle extends Shape { }

// Correct
public class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        // draw circle
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        // draw rectangle
    }
}
```
**Explanation:**  
In the correct example, the `Shape` class is extended to include `Circle` and `Rectangle` without modifying the `GraphicEditor` class, adhering to OCP.

---

### 3. **Liskov Substitution Principle (LSP)**

**Definition:**  
Objects of a superclass should be replaceable with objects of a subclass without affecting the functionality of the program.

**Example:**
```java
// Incorrect
class Rectangle {
    private int width;
    private int height;

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    
    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

// Correct
abstract class Shape {
    public abstract int calculateArea();
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}
```
**Explanation:**  
The incorrect example violates LSP because `Square` cannot replace `Rectangle` without affecting the program’s behavior. The correct version uses separate classes for `Rectangle` and `Square` without affecting substitution.

---

### 4. **Interface Segregation Principle (ISP)**

**Definition:**  
Clients should not be forced to implement interfaces they do not use. Instead of one large interface, create smaller, more specific ones.

**Example:**
```java
// Incorrect
public interface Worker {
    void work();
    void eat();
}

public class HumanWorker implements Worker {
    @Override
    public void work() {
        // working
    }

    @Override
    public void eat() {
        // eating
    }
}

public class RobotWorker implements Worker {
    @Override
    public void work() {
        // working
    }

    @Override
    public void eat() {
        // Not applicable for robots
    }
}

// Correct
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

public class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        // working
    }

    @Override
    public void eat() {
        // eating
    }
}

public class RobotWorker implements Workable {
    @Override
    public void work() {
        // working
    }
}
```
**Explanation:**  
By splitting the large `Worker` interface into smaller interfaces (`Workable` and `Eatable`), we adhere to ISP, ensuring that classes only implement methods they actually need.

---

### 5. **Dependency Inversion Principle (DIP)**

**Definition:**  
High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.

**Example:**
```java
// Incorrect
public class LightBulb {
    public void turnOn() {
        // logic to turn on the bulb
    }

    public void turnOff() {
        // logic to turn off the bulb
    }
}

public class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();
    }
}

// Correct
public interface Switchable {
    void turnOn();
    void turnOff();
}

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        // logic to turn on the bulb
    }

    @Override
    public void turnOff() {
        // logic to turn off the bulb
    }
}

public class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
```
**Explanation:**  
In the correct example, both high-level and low-level modules depend on the abstraction (`Switchable`), adhering to DIP.

---

### **Advantages of Following SOLID Principles**
- **Avoids Duplicate Code:** Promotes code reusability by adhering to principles of separation of concerns.
- **Easy to Maintain:** Code is easier to understand and modify due to clear division of responsibilities.
- **Easy to Understand:** SOLID principles help code that is easier to understand.
- **Flexible Software:** By depending on abstractions, code becomes flexible to change, extension, or modification.
- **Reduces Complexity:** SOLID principles help reduce dependencies between modules, simplifying complex systems.


