// Import the required package for this code
package JavaDSABootcamp.Recursion.RecursionBacktracking;

// Define the class Q1_MazeProblem
public class Q1_MazeProblem {
    // This code calculates the number of ways to reach the bottom-right corner of a grid,
    // starting from the top-left corner, by only moving right or down.
    // The count method is a recursive function that takes the current row and column position
    // in the grid as input parameters. The base case is when either row or column is 1,
    // and there is only one way to reach the destination. The function then calls itself twice,
    // once for moving up (decreasing row index) and once for moving left (decreasing column index),
    // and combines the results from these calls to return the total number of ways to reach the
    // destination from the current position. The main method calls the count method with arguments (3,3)
    // and prints the result, which is the number of ways to reach the bottom-right corner of a 3x3 grid.

    // Define the main method, which is the starting point of the program
    public static void main(String[] args) {
        // Call the count method with arguments (3,3) and print the result
        // It calculates the number of ways to reach the bottom-right corner of a 3x3 grid
        System.out.println(count(3,3));
        // Prints 6
    }

    // Define the count method, which is a recursive function that calculates the number of ways
    // to reach the bottom-right corner of a grid, given its current row and column
    static int count(int row, int col) {
        // Base case: If either row or col is 1, return 1 because there is only one way to reach
        // the destination (either by moving right or down)
        if (row==1 || col==1){
            return 1;
        }

        // Recursive step 1: Calculate the number of ways to reach the destination if we move one step up
        // (decrease the row index by 1)
        int left = count(row-1,col);

        // Recursive step 2: Calculate the number of ways to reach the destination if we move one step left
        // (decrease the column index by 1)
        int right = count(row,col-1);

        // Combine the results from both recursive steps (left and right) and return the sum as the total
        // number of ways to reach the destination from the current position
        return left+right;
    }
}
