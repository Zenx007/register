# Registration System - Java Exception Handling Exercise

## 📝 Overview
This Java program is a console-based registration system designed specifically to practice `try-catch` exception handling in Java. It validates four types of user input with different validation rules.

## 🎯 Learning Objectives
- `try-catch-finally` block implementation
- Custom exception handling with `IllegalArgumentException`
- Built-in exception handling with `InputMismatchException`
- Scanner input validation techniques
- Control flow with validation loops

## 🔍 Validation Rules

### 👤 Name Validation
| Requirement          | Exception Type              | Error Message                  |
|----------------------|----------------------------|--------------------------------|
| Cannot be empty      | IllegalArgumentException  | "Name cannot be empty"         |
| No numbers allowed   | IllegalArgumentException  | "Name cannot contain numbers"  |

### 🔢 Age Validation
| Requirement          | Exception Type              | Error Message                  |
|----------------------|----------------------------|--------------------------------|
| Must be integer      | InputMismatchException    | "Error: [Java's default msg]"  |
| Must be ≥ 0          | continue (no exception)   | "Age cannot be less than 0"    |

### 📏 Height Validation
| Requirement          | Exception Type              | Error Message                  |
|----------------------|----------------------------|--------------------------------|
| Must be decimal      | InputMismatchException    | "Err: [Java's default msg]"    |
| Must be > 0          | continue (no exception)   | "Height must be greater than 0"|
