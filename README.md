# Library Management System

This Java project is a **Library Management System** that demonstrates various Object-Oriented Programming (OOP) concepts, including **Design Patterns** (Singleton, Factory, Strategy), **Inheritance**, and **Polymorphism**. The system allows managing a collection of books, searching through them, and defining user roles.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Design Patterns Implemented](#design-patterns-implemented)
- [Class Descriptions](#class-descriptions)
- [Setup and Running the Program](#setup-and-running-the-program)
- [Example Usage](#example-usage)

## Project Overview
The Library Management System provides a simple structure to:
1. Add books to a library (using Factory Pattern).
2. Search for books by title or author (using Strategy Pattern).
3. Manage user roles, such as `Member` and `Librarian`, with unique behavior for each role.
4. Ensure a single instance of the library (using Singleton Pattern).

This project is suitable for demonstrating practical knowledge of Java OOP principles.

## Technologies Used
- **Java**: Core language for developing the system
- **Object-Oriented Programming (OOP)**: Concepts like inheritance, polymorphism, and encapsulation
- **Design Patterns**: Singleton, Factory, and Strategy patterns

## Features
- **Singleton Library Instance**: Ensures only one library instance exists.
- **Factory Pattern for Books**: Creates books of different types.
- **Strategy Pattern for Searching**: Implements multiple search strategies to find books.
- **Inheritance and Polymorphism**: User roles (Member and Librarian) with specific behaviors.

## Design Patterns Implemented

1. **Singleton Pattern**:
    - Applied to the `Library` class to ensure only one instance of the library.
2. **Factory Pattern**:
    - Implemented in `BookFactory` to create `Book` instances (e.g., `Novel`, `ReferenceBook`).
3. **Strategy Pattern**:
    - `SearchStrategy` interface with `TitleSearchStrategy` and `AuthorSearchStrategy` implementations allows flexible search options.

## Class Descriptions

- **Library**: Singleton class representing the library, holding a list of books.
- **Book Interface**: Base interface for `Book` types.
    - **Novel**: Represents a fiction book.
    - **ReferenceBook**: Represents a non-fiction reference book.
- **BookFactory**: Creates books of different types based on input.
- **SearchStrategy**: Interface for searching books.
    - **TitleSearchStrategy**: Searches books by title.
    - **AuthorSearchStrategy**: Searches books by author.
- **User (abstract class)**: Base class for different types of library users.
    - **Member**: A library member who borrows books.
    - **Librarian**: A librarian who manages the library.

## Setup and Running the Program

### Prerequisites
- **Java Development Kit (JDK)**: Version 8 or above
- **IDE (Optional)**: IntelliJ IDEA, Eclipse, or any preferred Java IDE

### Steps
1. Clone or download the project files.
2. Open the project in your IDE or compile using the command line.
3. Run the `Main` class to start the program.

### Running in the Command Line
```bash
javac *.java
java Main
