// This is the package declaration, it ensures that the class is organized properly within the folder structure.
package JavaDSABootcamp.Recursion.RecursionPermutations;

// Importing the ArrayList class from the java.util package to be used later in the program.
import java.util.ArrayList;

// This is the main class definition named "PermutationArrayList".
public class PermutationArrayList {
    // This is the main method, which is the entry point of the program.
    public static void main(String[] args) {
        // Calling the permutations method with an empty 'processed' string and the input "abc" as the 'unprocessed' string.
        // The result is stored in an ArrayList called 'ans'.
        ArrayList<String> ans = permutations("", "abc");
        // Printing the resulting ArrayList 'ans' to the console.
        System.out.println(ans);    //Prints [cba, bca, bac, cab, acb, abc]
    }

    // This is the 'permutations' method that accepts two strings as input: 'processed' and 'unprocessed'.
    // The method returns an ArrayList of String containing all the possible permutations of the given input.
    static ArrayList<String> permutations(String processed, String unprocessed) {
        // Base case: If the 'unprocessed' string is empty, create a new ArrayList and add the 'processed' string to it.
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        // Taking the first character of the 'unprocessed' string and assigning it to the variable 'ch'.
        char ch = unprocessed.charAt(0);

        // Creating an empty ArrayList called 'ans' to store the resulting permutations.
        ArrayList<String> ans = new ArrayList<>();

        // Iterating through the 'processed' string, inserting the character 'ch' at each possible position.
        for (int i = 0; i <= processed.length(); i++) {
            // Taking the substring from the beginning of the 'processed' string up to index i (excluding i).
            String first = processed.substring(0, i);
            // Taking the substring from index i (inclusive) to the end of the 'processed' string.
            String second = processed.substring(i, processed.length());

            // Recursively calling the 'permutations' method with the new 'processed' and 'unprocessed' strings.
            // The new 'processed' string has 'ch' inserted between the 'first' and 'second' substrings.
            // The new 'unprocessed' string is created by removing the first character from the original 'unprocessed' string.
            // The result of this recursive call is added to the 'ans' ArrayList.
            ans.addAll(permutations(first + ch + second, unprocessed.substring(1)));
        }
        // Returning the 'ans' ArrayList containing all the permutations.
        return ans;
    }
}
