// Declare the package name, following Java naming conventions
package JavaDSABootcamp.Recursion.RecursionSubsetSubsequenceStringQuestions;

// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the main class named Q5_ReturnAnArrayListOfString
public class Q5_ReturnAnArrayListOfString {

    //In this code, we start with an empty processed string and the given unprocessed string.
    //We then recursively call the subsequence method, dividing the problem into two smaller subproblems.
    //In one subproblem, we include the first character of the unprocessed string in the processed string,
    // and in the other, we exclude it. Finally, we combine the results of both subproblems to generate
    //all possible subsequences.

    // Define the main method
    public static void main(String[] args) {
        // Print the result of the subsequence method with initial arguments
        System.out.println(subsequence("", "abc")); //Prints [abc, ab, ac, a, bc, b, c, ]
        System.out.println(subsequence("","mvn"));  //Prints [mvn, mv, mn, m, vn, v, n, ]
    }

    // Define a static method called subsequence that takes two strings as input arguments
    // and returns an ArrayList of strings
    static ArrayList<String> subsequence(String processed, String unprocessed) {

        // Base case: If the unprocessed string is empty, create a new ArrayList
        // and add the processed string to it, then return the ArrayList
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        // Get the first character of the unprocessed string
        char ch = unprocessed.charAt(0);

        // Recursively call the subsequence method including the first character of
        // the unprocessed string in the processed string and remove it from the unprocessed string
        ArrayList<String> left = subsequence(processed + ch, unprocessed.substring(1));

        // Recursively call the subsequence method without including the first character of
        // the unprocessed string and remove it from the unprocessed string
        ArrayList<String> right = subsequence(processed, unprocessed.substring(1));

        // Combine the ArrayLists from both the recursive calls (left and right)
        left.addAll(right);

        // Return the combined ArrayList containing all possible subsequences
        return left;
    }
}
