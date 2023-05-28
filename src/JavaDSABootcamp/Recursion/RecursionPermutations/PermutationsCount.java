package JavaDSABootcamp.Recursion.RecursionPermutations;// Import ArrayList from java.util package

// Declare a public class named PermutationsCount
public class PermutationsCount {
    // Polymorphism method that acts as an entry point to the program
    public static void main(String[] args) {
        // This program calculates all the possible permutations of a given string "abc".
        // It uses a recursive approach by maintaining two strings - 'processed' and 'unprocessed'.
        // 'processed' keeps track of the characters that are already processed, and 'unprocessed'
        // contains characters that are yet to be processed. The base case for the recursion is when the
        // 'unprocessed' string is empty, which means that a valid permutation is found.
        // The program prints each permutation as it's found and counts the total number of permutations.

        // Call the 'permutations' method with an empty 'processed' string and "abc" as 'unprocessed'
        // and print the result returned by the method
        System.out.println(permutations("", "abc"));
        // Prints
        // cba
        // bca
        // bac
        // cab
        // acb
        // abc
        // 6
    }

    // Declare a static method named 'permutations' that takes two strings as arguments
    // 'processed' keeps track of the characters that are already processed, and 'unprocessed' contains
    // characters that are yet to be processed
    static int permutations(String processed, String unprocessed) {
        // Base case: If 'unprocessed' string is empty, print the 'processed' string (a valid permutation)
        // and return 1, signifying that one permutation has been found
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return 1;
        }

        // Declare a variable 'counter' to keep track of the total number of permutations found
        int counter = 0;
        // Get the first character of the 'unprocessed' string
        char ch = unprocessed.charAt(0);

        // Iterate from 0 to the length of the 'processed' string (inclusive)
        for (int i = 0; i <= processed.length(); i++) {
            // Split 'processed' string into two parts: 'first' and 'second'
            // 'first' contains characters from index 0 to i-1, and 'second' contains characters from index i to the end
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());

            // Recursively call the 'permutations' method with an updated 'processed' string (first + ch + second)
            // and the rest of the 'unprocessed' string (excluding the first character)
            // Add the number of permutations returned by this call to the 'counter'
            counter = counter + permutations(first + ch + second, unprocessed.substring(1));
        }
        // Return the total number of permutations found
        return counter;
    }
}
