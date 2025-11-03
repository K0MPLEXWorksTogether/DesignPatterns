# Factory Pattern

The factory pattern is a *creational design pattern* that provides an interface for creating objects, but lets the subclasses or factory classes decide which class to instantiate. It helps decoupe object creation from business logic.

## Problem It Solves:
1. When code directly instantiates specific classes, it is called *tight coupling*. Changing the code later requires modifying many parts of the code.
2. Adding new types of object requires modification of existing logic instead of extending it.
3. Code must always be open for extension, but closed for modification. Direct instantiation works temporariliy, but as the codebase scales, it violates this principle.
4. Unit tests often require substituting dependencies, which are harder when *new* is called everywhere.

## Common Use Cases:
1. Creating related objects without exposing the creation logic.
2. When object creation involves some logic, like configuration, parameters, or conditions.
3. When the system must work with multiple types implementing the same interface.
4. Dependency injection, or plugin architectural pattern.

## Why This Is A Good Solution
- Encapsulation of object creation.
- Loosely coupled code.
- Easy to extend.
- Testable code.
