# SOLID Principles

The SOLID principles are a set of five design principles that enable developers to write better, more maintainable, and flexible code. These principles help in avoiding tight coupling, ensuring scalability, and creating software that's easier to extend and maintain.

---

## S: Single Responsibility Principle (SRP)
> **A class should have only one reason to change.**

This means that a class should have only one responsibility or job. It ensures that each class is focused on a specific task or feature, which improves code modularity and makes the class easier to maintain.

### Example:
- **Good:** A class that handles only data storage operations.
- **Bad:** A class that handles both data storage and user interface logic.

---

## O: Open/Closed Principle (OCP)
> **Open for extension but closed for modification.**

Software entities (like classes, modules, or functions) should be extendable without changing their existing code. This principle encourages developers to write code that supports adding new functionality through extension, without altering existing code, thus reducing the risk of introducing bugs.

### Example:
- **Good:** Using interfaces or abstract classes that allow adding new behavior by extending them.
- **Bad:** Directly modifying a class whenever a new feature is needed.

---

## L: Liskov Substitution Principle (LSP)
> **If class B is a subtype of class A, then we should be able to replace objects of class A with objects of class B without breaking the behavior of the program.**
> **Subclass should extend the property of parent class, not narrow it down.**
This principle ensures that subclasses should be substitutable for their base class without affecting the correctness of the application. In other words, derived classes should extend the functionality of the base class without altering its original behavior.

### Example:
- **Good:** A derived class that enhances the behavior of the base class without changing the expected output.
- **Bad:** A derived class that overrides the base class in such a way that the program logic breaks.

---

## I: Interface Segregation Principle (ISP)
> **Interfaces should be such that clients shouldn't implement unnecessary functions they don't need.**

Clients should not be forced to depend on interfaces they do not use. Instead of one large interface, create smaller, more specific interfaces so that implementing classes only need to focus on the methods that are relevant to them.

### Example:
- **Good:** Creating multiple smaller, more focused interfaces.
- **Bad:** A large interface with multiple unrelated methods, forcing a client to implement unused methods.

---

## D: Dependency Inversion Principle (DIP)
> **Classes should depend on abstractions rather than concrete classes.**

High-level modules should not depend on low-level modules; both should depend on abstractions. This principle ensures that the more flexible and reusable code is written by relying on abstractions (interfaces or abstract classes) rather than concrete implementations.

### Example:
- **Good:** A class that relies on an interface, allowing it to work with any class implementing that interface.
- **Bad:** A class that is tightly coupled to a specific class and its implementation.

---

## Advantages of SOLID Principles
- **Helps avoid duplicate code.**
- **Makes the code easy to maintain.**
- **Improves code readability and understanding.**
- **Enhances flexibility and scalability.**
- **Reduces the complexity of the system.**

By following the SOLID principles, developers can create more robust and scalable software systems that are easier to extend, maintain, and refactor, ultimately leading to better-quality code.
