package Solution;

public class SudokuValidator
{
    public static boolean isValidSudoku(int[][] board)
    {
        for (int i = 0; i < 9; i++)
        {
            boolean[] rowCheck = new boolean[9];
            boolean[] colCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];

            for (int j = 0; j < 9; j++)
            {
                // Check row
                if (board[i][j] != 0)
                {
                    if (rowCheck[board[i][j] - 1])
                        return false; // Duplicate in row
                    rowCheck[board[i][j] - 1] = true;
                }

                // Check column
                if (board[j][i] != 0)
                {
                    if (colCheck[board[j][i] - 1])
                        return false; // Duplicate in column
                    colCheck[board[j][i] - 1] = true;
                }

                // Check 3x3 box
                int boxRow = 3 * (i / 3);
                int boxCol = 3 * (i % 3);
                int currentBoxValue = board[boxRow + j / 3][boxCol + j % 3];

                if (currentBoxValue != 0)
                {
                    if (boxCheck[currentBoxValue - 1])
                        return false; // Duplicate in box
                    boxCheck[currentBoxValue - 1] = true;
                }
            }
        }
        return true; // All checks passed
    }
}
