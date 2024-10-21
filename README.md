# Sudoku Validator

## Overview
The `Sudoku Validator` is a Java application designed to check the validity of Sudoku boards. It verifies that a given Sudoku board adheres to the standard rules: each number from 1 to 9 must appear only once in each row, column, and 3x3 subgrid.

## Features
- Validates a 9x9 Sudoku board.
- Checks for duplicates in rows, columns, and 3x3 boxes.
- Handles empty boards (considered valid).

## How It Works
1. **Input**: A 2D array representing the Sudoku board, where empty cells are represented by zeros.
2. **Validation**: The algorithm checks each row, column, and 3x3 subgrid for duplicates.
3. **Output**: Returns `true` if the board is valid; otherwise, returns `false`.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher.

### Running the Application
1. **Clone the Repository** (if applicable):
   ```bash
   git clone https://github.com/HChristopherNaoyuki/sudoku-validator-console-demo-java.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd sudoku-validator
   ```
3. **Compile the Java Files**:
   ```bash
   javac Solution/SudokuValidator.java Solution/SudokuValidatorTest.java
   ```
4. **Run the Test Cases**:
   ```bash
   java org.junit.runner.JUnitCore Solution.SudokuValidatorTest
   ```

### Example Usage
To validate a Sudoku board, call the `isValidSudoku` method with a 2D array:
```java
int[][] board = {
    {9, 6, 3, 1, 7, 4, 2, 5, 8},
    {1, 7, 8, 3, 2, 5, 6, 4, 9},
    // ... rest of the board
};
boolean isValid = SudokuValidator.isValidSudoku(board);
System.out.println("Is the Sudoku board valid? " + isValid);
```

## Test Cases
The application includes unit tests to verify its functionality using JUnit:

- **Valid Sudoku Test**: Checks a fully valid Sudoku board.
- **Invalid Sudoku Due to Row**: Checks for duplicates in a row.
- **Invalid Sudoku Due to Column**: Checks for duplicates in a column.
- **Invalid Sudoku Due to Box**: Checks for duplicates in a 3x3 subgrid.
- **Empty Sudoku**: Verifies that an empty board is considered valid.

## Running the Tests
To run the tests, ensure JUnit is included in your classpath. Compile and run the `SudokuValidatorTest` class as shown in the Running the Application section.
