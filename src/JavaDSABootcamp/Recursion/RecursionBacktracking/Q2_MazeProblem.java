package JavaDSABootcamp.Recursion.RecursionBacktracking;// Import the ArrayList class from java.util package
import java.util.ArrayList;

// Define the class Q2_MazeProblem
public class Q2_MazeProblem {
    // Define the main method to run the program
    public static void main(String[] args) {
        // This code demonstrates a solution to the Maze Problem using recursion and backtracking.
        // It finds all the possible paths from the bottom right cell (3, 3) to the top left cell (1, 1)
        // in a 3x3 grid, using only right (R) and down (D) moves. The path method prints all the paths,
        // and the pathList method returns an ArrayList containing all the paths.

        // Call the 'path' method to print all paths from (3, 3) to (1, 1)
        path("", 3,3);
        //Prints
        //DDRR
        //DRDR
        //DRRD
        //RDDR
        //RDRD
        //RRDD

        // Call the 'pathList' method to return a list of all paths from (3, 3) to (1, 1) and print the list
        System.out.println(pathList("", 3,3));  //Prints [DDRR, DRDR, DRRD, RDDR, RDRD, RRDD]
    }

    // Define the 'path' method to print all the paths from the given cell (row, col) to the cell (1, 1)
    static void path(String processed, int row, int col) {
        // Base case: If we reached the destination cell (1, 1), print the path and return
        if (row==1 && col==1) {
            System.out.println(processed);
            return;
        }

        // Recursive case: If we can move down (row > 1), call 'path' with updated row and path
        if (row>1) {
            path(processed+'D', row-1,col);
        }

        // Recursive case: If we can move right (col > 1), call 'path' with updated col and path
        if (col>1) {
            path(processed+'R', row,col-1);
        }
    }

    // Define the 'pathList' method to return an ArrayList of all the paths from the given cell (row, col) to the cell (1, 1)
    static ArrayList<String> pathList(String processed, int row, int col) {
        // Base case: If we reached the destination cell (1, 1), create a list, add the path, and return the list
        if (row==1 && col==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        // Initialize an empty ArrayList to store the paths
        ArrayList<String> list = new ArrayList<>();

        // Recursive case: If we can move down (row > 1), call 'pathList' with updated row and path, and add the returned paths to the list
        if (row>1) {
            list.addAll(pathList(processed+'D', row-1,col));
        }

        // Recursive case: If we can move right (col > 1), call 'pathList' with updated col and path, and add the returned paths to the list
        if (col>1) {
            list.addAll(pathList(processed+'R', row,col-1));
        }
        // Return the list of paths
        return list;
    }
}
