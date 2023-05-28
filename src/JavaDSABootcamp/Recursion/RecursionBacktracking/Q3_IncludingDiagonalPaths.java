package JavaDSABootcamp.Recursion.RecursionBacktracking;// Import the ArrayList class from java.util package
import java.util.ArrayList;

// Define the class Q3_IncludingDiagonalPaths
public class Q3_IncludingDiagonalPaths {

    // L = Low
    // D = Diagonal
    // R = Right

    // Define the main method to run the program
    public static void main(String[] args) {
        // Call the 'pathListDiagonal' method to return a list of all paths from (3, 3) to (1, 1) including diagonal moves and print the list
        System.out.println(pathListDiagonal("", 3,3));  //Prints [DD, DLR, DRL, LDR, LLRR, LRD, LRLR, LRRL, RDL, RLD, RLLR, RLRL, RRLL]
    }

    // Define the 'pathListDiagonal' method to return an ArrayList of all the paths from the given cell (row, col) to the cell (1, 1) including diagonal moves
    static ArrayList<String> pathListDiagonal(String processed, int row, int col) {
        // Base case: If we reached the destination cell (1, 1), create a list, add the path, and return the list
        if (row==1 && col==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        // Initialize an empty ArrayList to store the paths
        ArrayList<String> list = new ArrayList<>();

        // Recursive case: If we can move diagonally (row > 1 and col > 1), call 'pathListDiagonal' with updated row and col and path, and add the returned paths to the list
        if (row>1 && col>1) {
            list.addAll(pathListDiagonal(processed+'D', row-1,col-1));
        }

        // Recursive case: If we can move vertically (row > 1), call 'pathListDiagonal' with updated row and path, and add the returned paths to the list
        if (row>1) {
            list.addAll(pathListDiagonal(processed+'V', row-1,col));
        }

        // Recursive case: If we can move horizontally (col > 1), call 'pathListDiagonal' with updated col and path, and add the returned paths to the list
        if (col>1) {
            list.addAll(pathListDiagonal(processed+'H', row,col-1));
        }
        // Return the list of paths
        return list;
    }
}
