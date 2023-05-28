// Import the required Java package
package JavaDSABootcamp.Recursion.RecursionNQueens_NKnights_SudokuSolver;

// Define the class for solving the N-Queens problem
public class Q1_NQueensProblem {
    // Polymorphism method to execute the program
    public static void main(String[] args) {
        // This Java code solves the N-Queens problem using recursion and backtracking.
        // The N-Queens problem is a classic problem in computer science where the goal is to place N chess queens
        // on an N x N chessboard in such a way that no two queens threaten each other. In other words, no two queens
        // can share the same row, column, or diagonal.
        //
        // Here's a brief overview of the code:
        //
        // 1. The main method initializes a 4x4 chessboard as a 2D boolean array and calls the queens method.
        // 2. The queens method is a recursive method that places queens in a valid position in each row of the chessboard.
        // 3. The isSafe method checks if it is safe to place a queen in a given cell by checking the same column, top-left diagonal, and top-right diagonal.
        // 4. The display method prints the current solution on the console, representing queens as "Q" and empty cells as "X".
        //
        // The code first initializes the chessboard and then calls the queens method to find all solutions.
        // The queens method uses a recursive backtracking approach to place queens on the board.
        // The isSafe method checks if it is safe to place a queen in a given cell.
        // The display method prints the solutions on the console.


        // Set the size of the chessboard (N x N)
        int n = 4;
        // Create an N x N boolean array representing the chessboard
        boolean[][] board = new boolean[n][n];
        // Call the queens method to find the solutions and print the total count of solutions
        System.out.println(queens(board, 0));
        // Prints
        // X Q X X
        // X X X Q
        // Q X X X
        // X X Q X
        //
        // X X Q X
        // Q X X X
        // X X X Q
        // X Q X X
        //
        // 2


    }

    // Recursive method to find all the solutions for the N-Queens problem
    static int queens(boolean[][] board, int row) {
        // Base case: If all rows have been filled, display the current solution and return 1
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        // Initialize the count of solutions for this row
        int count = 0;

        // Loop through each column in the current row
        for (int col = 0; col < board.length; col++) {
            // Check if placing a queen in this cell is safe
            if (isSafe(board, row, col)) {
                // Place a queen in the current cell
                board[row][col] = true;
                // Recursively call the queens method for the next row and update the solution count
                count += queens(board, row + 1);
                // Remove the queen from the current cell (backtrack)
                board[row][col] = false;
            }
        }

        // Return the total count of solutions for this row
        return count;
    }

    // Method to check if placing a queen in the current cell is safe
    static boolean isSafe(boolean[][] board, int row, int col) {
        // Check if there's a queen in the same column in previous rows
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check if there's a queen in the top-left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Check if there's a queen in the top-right diagonal
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        // If all checks pass, it's safe to place a queen in the current cell
        return true;
    }

    // Method to display the current solution on the console
    static void display(boolean[][] board) {
        // Loop through each row in the board
        for (boolean[] row : board) {
            // Loop through each cell in the row
            for (boolean element : row) {
                // If the cell contains a queen, print "Q", otherwise print "X"
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            // Move to the next line for the next row
            System.out.println();
        }
    }
}
