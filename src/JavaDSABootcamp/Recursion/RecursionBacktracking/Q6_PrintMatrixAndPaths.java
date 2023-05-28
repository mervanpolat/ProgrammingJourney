package JavaDSABootcamp.Recursion.RecursionBacktracking;
import java.util.Arrays;

public class Q6_PrintMatrixAndPaths {
    public static void main(String[] args) {
        // Initialize a 2D boolean array (maze) where true means the path can be traversed, and false means it's blocked.
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        // Initialize a 2D integer array (path) with the same dimensions as the board.
        int[][] path = new int[board.length][board[0].length];

        // Call the allPathsPrint method with initial parameters.
        allPathsPrint("", board,0,0,path, 1);
        // Prints
        // [1, 0, 0]
        // [2, 0, 0]
        // [3, 4, 5]
        // DDRR
        //
        // [1, 0, 0]
        // [2, 5, 6]
        // [3, 4, 7]
        // DDRURD
        //
        // [1, 6, 7]
        // [2, 5, 8]
        // [3, 4, 9]
        // DDRUURDD
        //
        // [1, 0, 0]
        // [2, 3, 0]
        // [0, 4, 5]
        // DRDR
        //
        // [1, 0, 0]
        // [2, 3, 4]
        // [0, 0, 5]
        // DRRD
        //
        // [1, 4, 5]
        // [2, 3, 6]
        // [0, 0, 7]
        // DRURDD
        //
        // [1, 2, 0]
        // [0, 3, 0]
        // [0, 4, 5]
        // RDDR
        //
        // [1, 2, 0]
        // [0, 3, 4]
        // [0, 0, 5]
        // RDRD
        //
        // [1, 2, 0]
        // [4, 3, 0]
        // [5, 6, 7]
        // RDLDRR
        //
        // [1, 2, 3]
        // [0, 0, 4]
        // [0, 0, 5]
        // RRDD
        //
        // [1, 2, 3]
        // [0, 5, 4]
        // [0, 6, 7]
        // RRDLDR
        //
        // [1, 2, 3]
        // [6, 5, 4]
        // [7, 8, 9]
        // RRDLLDRR
    }

    // Define the allPathsPrint method with five parameters:
    // processed: a String to store the sequence of moves,
    // maze: the 2D boolean array,
    // row and col: the current row and column indices,
    // path: the 2D integer array to store the steps taken,
    // step: the current step number.
    static void allPathsPrint(String processed, boolean[][] maze, int row, int col, int[][] path, int step) {
        // Base case: if we have reached the last cell in the maze, print the path and the sequence of moves.
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;

            // Print the path matrix.
            for (int[]arr : path) {
                System.out.println(Arrays.toString(arr));
            }

            // Print the sequence of moves.
            System.out.println(processed);
            System.out.println();
            return;
        }

        // If the current cell is blocked, return without exploring further.
        if (!maze[row][col]) {
            return;
        }

        // Mark the current cell as visited by setting its value to false in the maze.
        maze[row][col] = false;

        // Store the current step number in the path matrix.
        path[row][col] = step;

        // Recursively explore the cell below, if it exists.
        if (row < maze.length - 1) {
            allPathsPrint(processed + 'D', maze, row + 1, col, path, step + 1);
        }

        // Recursively explore the cell to the right, if it exists.
        if (col < maze[0].length - 1) {
            allPathsPrint(processed + 'R', maze, row, col + 1, path, step + 1);
        }

        // Recursively explore the cell above, if it exists.
        if (row > 0) {
            allPathsPrint(processed + 'U', maze, row - 1, col, path, step + 1);
        }

        // Recursively explore the cell to the left, if it exists.
        if (col > 0) {
            allPathsPrint(processed + 'L', maze, row, col - 1, path, step + 1);
        }

        // Backtrack: mark the current cell as unvisited by setting its value to true in the maze.
        maze[row][col] = true;

        // Reset the current cell's value in the path matrix.
        path[row][col] = 0;
    }
}
