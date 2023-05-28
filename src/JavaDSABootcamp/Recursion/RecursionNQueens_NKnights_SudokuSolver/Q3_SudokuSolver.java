// Import the required package
package JavaDSABootcamp.Recursion.RecursionNQueens_NKnights_SudokuSolver;

public class Q3_SudokuSolver {
    public static void main(String[] args) {
        // The main function starts here.

        // Declare and initialize a 9x9 2D array representing the Sudoku board.
        // The given board is partially filled with integers from 1 to 9, while
        // empty cells are represented by 0.
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0},
        };

        // Call the solve function with the given Sudoku board.
        // If the board can be solved, display the solved board.
        // Otherwise, print "Can't solve!".
        if (solve(board)) {
            display(board);
            // Prints
            // 3 1 6 5 7 8 4 9 2
            // 5 2 9 1 3 4 7 6 8
            // 4 8 7 6 2 9 5 3 1
            // 2 6 3 4 1 5 9 8 7
            // 9 7 4 8 6 3 1 2 5
            // 8 5 1 7 9 2 6 4 3
            // 1 3 8 9 4 7 2 5 6
            // 6 9 2 3 5 1 8 7 4
            // 7 4 5 2 8 6 3 1 9
        } else {
            System.out.println("Can't solve!");
        }
    }

    // The solve function takes a 2D integer array representing a Sudoku board
    // and returns true if the board can be solved, or false otherwise.
    static boolean solve(int[][] board) {
        int n = board.length; // Get the length of the board (i.e., 9 for a 9x9 Sudoku).
        int row = -1;
        int col = -1;

        // Search for an empty cell (0) in the board.
        // If an empty cell is found, store its row and column indices,
        // set emptyLeft to false, and break the search loop.
        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (emptyLeft == false) {
                break;
            }
        }
        // If there are no empty cells left, the board is solved, so return true.
        if (emptyLeft == true) {
            return true;
        }

        // Try placing numbers from 1 to 9 in the empty cell found.
        for (int number = 1; number <= 9; number++) {
            // Check if the number can be safely placed in the empty cell.
            if (isSafe(board, row, col, number)) {
                // If the number can be safely placed, update the board.
                board[row][col] = number;

                // Recursively call the solve function with the updated board.
                // If the updated board can be solved, return true.
                if (solve(board)) {
                    return true;
                } else {
                    // If the updated board can't be solved, backtrack by
                    // resetting the cell to 0 and trying the next number.
                    board[row][col] = 0;
                }
            }
        }
        // If none of the numbers can be placed in the current cell,
        // return false, as the board can't be solved.
        return false;
    }

    // The display function takes a 2D integer array representing a Sudoku board
    // and prints the board row by row.
    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // The isSafe function checks if the given number can be safely placed
    // in the specified row and column of the Sudoku board. It returns true
    // if the number is safe to place, or false otherwise.
    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the number is already present in the current column.
        for (int[] nums : board) {
            if (nums[col] == num) return false;
        }

        // Check if the number is already present in the current row.
        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == num) return false;
        }

        // Check if the number is already present in the 3x3 grid that
        // the current cell belongs to.
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) return false;
            }
        }
        // If the number is not present in the current row, column, or 3x3 grid,
        // it's safe to place, so return true.
        return true;
    }
}
