// Import the necessary Java package
package JavaDSABootcamp.Recursion.RecursionBacktracking;

public class Q5_IncludingAllPaths {
    public static void main(String[] args) {
        // In this Java program, we're trying to find all possible paths through a maze represented by a 2D boolean array,
        // board. The goal is to start from the top-left corner (0,0) and reach the bottom-right corner,
        // only moving right (R), down (D), up (U), or left (L).

        // Define a 2D boolean array to represent the maze
        // True means the cell is accessible, False means it's blocked
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        // Call the allPaths() method to find all possible paths
        allPaths("", board, 0,0);
        // Prints
        // DDRR
        // DDRURD
        // DDRUURDD
        // DRDR
        // DRRD
        // DRURDD
        // RDDR
        // RDRD
        // RDLDRR
        // RRDD
        // RRDLDR
        // RRDLLDRR
    }

    static void allPaths(String processed, boolean[][] maze, int row, int col) {
        // Base case: If we've reached the bottom-right corner,
        // print the path and return
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }

        // If the current cell is not accessible, return
        if (!maze[row][col]) {
            return;
        }

        // Mark the current cell as visited (false) to avoid revisiting it
        maze[row][col] = false;

        // Recursively explore neighboring cells

        // If the next row is within the maze boundaries, move down
        if (row < maze.length - 1) {
            allPaths(processed + 'D', maze, row + 1, col);
        }

        // If the next column is within the maze boundaries, move right
        if (col < maze[0].length - 1) {
            allPaths(processed + 'R', maze, row, col + 1);
        }

        // If the previous row is within the maze boundaries, move up
        if (row > 0) {
            allPaths(processed + 'U', maze, row - 1, col);
        }

        // If the previous column is within the maze boundaries, move left
        if (col > 0) {
            allPaths(processed + 'L', maze, row, col - 1);
        }

        // Backtrack: unvisit the current cell (mark as true) before returning
        // to the previous call, so it's available for other paths
        maze[row][col] = true;

        // This program uses a recursive backtracking approach to explore all possible paths through the maze.
        // The allPaths() method takes the current path as a string, the maze as a 2D boolean array, and the current
        // position (row, col). It recursively calls itself to explore all neighboring cells, marking visited cells
        // as false and unmarking them (backtracking) when returning from the call. When the bottom-right corner is reached,
        // it prints the path and returns.
    }
}
