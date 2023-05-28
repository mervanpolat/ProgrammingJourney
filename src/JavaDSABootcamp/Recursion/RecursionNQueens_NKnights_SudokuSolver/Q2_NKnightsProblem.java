// Import the required package
package JavaDSABootcamp.Recursion.RecursionNQueens_NKnights_SudokuSolver;

// Class definition for Q2_NKnightsProblem
public class Q2_NKnightsProblem {
    // Polymorphism function to run the program
    public static void main(String[] args) {
        // Set the size of the chessboard (n x n)
        int n = 4;

        // Create a boolean 2D array of size n x n to represent the board
        boolean[][] board = new boolean[n][n];

        // Call the knight() function to solve the problem and place knights on the board
        knight(board, 0, 0, n);

        // Prints
        // K K K K
        // X X X X
        // X X X X
        // X X X X
        //
        // K K K X
        // X K X X
        // X X X X
        // X X X X
        //
        // K K K X
        // X X X X
        // X X X X
        // K X X X
        //
        // K K K X
        // X X X X
        // X X X X
        // X K X X
        // ... And hundreds of more possible solutions were actually printed, but we have omitted due to minimalism
    }

    // Recursive function to place knights on the board
    static void knight(boolean[][] board, int row, int col, int knights) {
        // If no more knights are left to place, display the board and return
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        // If we reached the last row and column, return
        if (row == board.length - 1 && col == board.length) return;

        // If we reached the end of a row, move to the next row and reset column
        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        // Check if the current position is safe for placing a knight
        if (isSafe(board, row, col)) {
            // Place the knight and continue with the next column
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);

            // Backtrack by removing the knight, if it leads to an invalid solution
            board[row][col] = false;
        }

        // Continue with the next column without placing a knight
        knight(board, row, col + 1, knights);
    }

    // Function to check if the current position is safe to place a knight
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check if there's another knight attacking from top-left
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        // Check if there's another knight attacking from top-right
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        // Check if there's another knight attacking from bottom-left
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        // Check if there's another knight attacking from bottom-right
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        // If no other knights are attacking, return true
        return true;
    }

    // Function to check if the current row and column are valid indices on the board
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row <= board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    // Function to display the board with knights (K) and empty cells (X)
    private static void display(boolean[][] board) {
        // Iterate through each row of the board
        for (boolean[] row : board) {
            // Iterate through each element (cell) in the row
            for (boolean element : row) {
                // If the element is true, a knight is present, so print "K"
                if (element) {
                    System.out.print("K ");
                } else {
                    // If the element is false, no knight is present, so print "X"
                    System.out.print("X ");
                }
            }
            // Print a newline character to move to the next row
            System.out.println();
        }
    }
}