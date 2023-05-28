package JavaDSABootcamp.Recursion.RecursionBacktracking;

// Define the class Q4_MazeWithObstacles
public class Q4_MazeWithObstacles {
    // Define the main method to run the program
    public static void main(String[] args) {

        // Initialize a 3x3 2D boolean array to represent the maze, where 'true' cells are open and 'false' cells have obstacles
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        // Call the 'pathListObstacles' method to print all paths from the top left cell (0, 0) to the bottom right cell (maze.length-1, maze[0].length-1), avoiding obstacles
        pathListObstacles("", board, 0, 0);
        // Prints
        // DDRR
        // RRDD
    }

    // Define the 'pathListObstacles' method to print all the paths from the given cell (row, col) to the target cell (maze.length-1, maze[0].length-1), avoiding obstacles
    static void pathListObstacles(String processed, boolean[][] maze, int row, int col) {
        // Base case: If we reached the target cell (maze.length-1, maze[0].length-1), print the path and return
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }

        // If the current cell (row, col) has an obstacle (maze[row][col] == false), return without processing further
        // This part of the code checks if the current cell (row, col) in the maze has an obstacle or not.
        // In the given maze 2D array, 'true' represents an open cell (no obstacle) and 'false' represents a cell with an obstacle.
        // if (!maze[row][col]) checks if the value of maze[row][col] is 'false', which means there is an obstacle in the current cell.
        // The ! operator negates the boolean value, so if the cell is 'true' (open), the condition becomes 'false',
        // and if the cell is 'false' (obstacle), the condition becomes 'true'.
        // If the condition is 'true' (meaning there is an obstacle in the current cell), the following block of code is executed:
        // {
        //    return;
        // }
        // This block simply returns from the current method call without executing any further code.
        // In this case, the function returns immediately, without making any further recursive calls or processing the path,
        // as the current cell is blocked by an obstacle.

        if (!maze[row][col]) {
            return;
        }

        // Recursive case: If we can move down (row < maze.length-1), call 'pathListObstacles' with updated row and path
        if (row < maze.length - 1) {
            pathListObstacles(processed + 'D', maze, row + 1, col);
        }

        // Recursive case: If we can move right (col < maze[0].length-1), call 'pathListObstacles' with updated col and path
        if (col < maze[0].length - 1) {
            pathListObstacles(processed + 'R', maze, row, col + 1);
        }
    }
}
