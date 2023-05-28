// The package declaration, which helps organize related classes and interfaces.
package JavaDSABootcamp.Recursion.RecursionPermutations;

// Class definition, named "Permutation".
public class Permutation {
    //The program starts by calling the permutations method with an empty processed string and the input string
    //as the unprocessed string. It then processes each character one by one and recursively generates all
    //possible permutations by inserting the character at all possible positions in the processed string.
    //When the unprocessed string is empty, it means all characters have been processed, so the program prints
    //the processed string as one of the permutations.

    // The main method, where the program execution starts.
    public static void main(String[] args) {
        // Calling the "permutations" method with an empty string as the processed part
        // and the input string "abc" as the unprocessed part.
        permutations("", "abc");
        //Prints
        //cba
        //bca
        //bac
        //cab
        //acb
        //abc
    }

    // A static method named "permutations" that takes two String arguments:
    // "processed" keeps track of the characters that have been processed,
    // and "unprocessed" contains the characters that still need to be processed.
    static void permutations(String processed, String unprocessed) {
        // Base case: If the unprocessed string is empty, it means all characters
        // have been processed, so we print the processed string as one of the permutations.
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        // Retrieve the first character of the unprocessed string.
        char ch = unprocessed.charAt(0);

        // Loop through all possible positions where the character "ch" can be inserted
        // into the processed string.
        for (int i = 0; i <= processed.length(); i++) {
            // Split the processed string into two parts at the ith position.
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());

            // Recursively call the "permutations" method with the updated processed
            // string (by inserting "ch" between "first" and "second") and the remaining
            // unprocessed string (excluding the first character).
            permutations(first + ch + second, unprocessed.substring(1));
        }
    }
}
