package Solution;

import org.junit.Test;
import static org.junit.Assert.*;

public class SudokuValidatorTest
{
    @Test
    public void testValidSudoku()
    {
        int[][] validSudoku = {
            {9, 6, 3, 1, 7, 4, 2, 5, 8},
            {1, 7, 8, 3, 2, 5, 6, 4, 9},
            {2, 5, 4, 6, 8, 9, 7, 3, 1},
            {8, 2, 1, 4, 3, 7, 5, 9, 6},
            {4, 9, 6, 8, 5, 2, 3, 1, 7},
            {7, 3, 5, 9, 6, 1, 8, 2, 4},
            {5, 8, 9, 7, 1, 3, 4, 6, 2},
            {3, 1, 7, 4, 2, 6, 9, 8, 5},
            {6, 4, 2, 5, 9, 8, 1, 7, 3}
        };
        assertTrue(SudokuValidator.isValidSudoku(validSudoku));
    }

    @Test
    public void testInvalidSudokuDueToRow()
    {
        int[][] invalidSudoku = {
            {9, 6, 3, 1, 7, 4, 2, 5, 8},
            {1, 7, 8, 3, 2, 5, 6, 4, 9},
            {2, 5, 4, 6, 8, 9, 7, 3, 1},
            {8, 2, 1, 4, 3, 7, 5, 9, 6},
            {4, 9, 6, 8, 5, 2, 3, 1, 7},
            {7, 3, 5, 9, 6, 1, 8, 2, 4},
            {5, 8, 9, 7, 1, 3, 4, 6, 2},
            {3, 1, 7, 2, 4, 6, 9, 8, 5}, // Duplicate '2' in this row
            {6, 4, 2, 5, 9, 8, 1, 7, 3}
        };
        assertFalse(SudokuValidator.isValidSudoku(invalidSudoku));
    }

    @Test
    public void testInvalidSudokuDueToColumn()
    {
        int[][] invalidSudoku = {
            {9, 6, 3, 1, 7, 4, 2, 5, 8},
            {1, 7, 8, 3, 2, 5, 6, 4, 9},
            {2, 5, 4, 6, 8, 9, 7, 3, 1},
            {8, 2, 1, 4, 3, 7, 5, 9, 6},
            {4, 9, 6, 8, 5, 2, 3, 1, 7},
            {7, 3, 5, 9, 6, 1, 8, 2, 4},
            {5, 8, 9, 7, 1, 3, 4, 6, 2},
            {3, 1, 7, 4, 2, 6, 9, 8, 5},
            {6, 4, 2, 5, 9, 8, 1, 7, 3} // Duplicate '5' in the first column
        };
        invalidSudoku[1][0] = 5; // Changing a number to create a duplicate in the first column
        assertFalse(SudokuValidator.isValidSudoku(invalidSudoku));
    }

    @Test
    public void testInvalidSudokuDueToBox()
    {
        int[][] invalidSudokuBox = {
            {9, 6, 3, 1, 7, 4, 2, 5, 8},
            {1, 7, 8, 3, 2, 5, 6, 4, 9},
            {2, 5, 4, 6, 8, 9, 7, 3, 1},
            {8, 2, 1, 4, 3, 7, 5, 9, 6},
            {4, 9, 6, 8, 5, 2, 3, 1, 7},
            {7, 3, 5, 9, 6, 1, 8, 2, 4},
            {5, 8, 9, 7, 1, 3, 4, 6, 2},
            {3, 1, 7, 4, 2, 6, 9, 8, 5},
            {6, 4, 2, 5, 9, 8, 1, 7, 3}
        };
        invalidSudokuBox[4][4] = 7; // Changing a number to create a duplicate in the middle box
        assertFalse(SudokuValidator.isValidSudoku(invalidSudokuBox));
    }

    @Test
    public void testEmptySudoku()
    {
        int[][] emptySudoku = new int[9][9]; // All zeros
        assertTrue(SudokuValidator.isValidSudoku(emptySudoku)); // Assuming empty is valid
    }
}
