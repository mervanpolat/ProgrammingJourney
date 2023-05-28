package JavaDSABootcamp.Recursion.RecursionSubsetSubsequenceStringQuestions;

public class Q1_SkipACharUsingRecursion {
    public static void main(String[] args) {
        skip("", "baccad"); // Call the skip() method with an empty string as the processed parameter and "baccad" as the unprocessed parameter
        System.out.println(skip("Giorgio Armani")); // Call the skip() method with "Giorgio Armani" as the unprocessed parameter
    }

    static void skip(String processed, String unprocessed) {
        // Check if the unprocessed string is empty
        if (unprocessed.isEmpty()) {
            // If the unprocessed string is empty, print the processed string and return from the method
            System.out.println(processed);
            return;
        }

        // Get the first character of the unprocessed string
        char ch = unprocessed.charAt(0);

        // If the first character is 'a', skip it and call the skip() method with the processed string and the remaining unprocessed string
        if (ch=='a') {
            skip(processed, unprocessed.substring(1));
        } else {
            // If the first character is not 'a', append it to the processed string and call the skip() method with the updated processed and unprocessed strings
            skip(processed + ch, unprocessed.substring(1));
        }
    }

    static String skip(String unprocessed) {
        // If the input string is empty, return an empty string
        if (unprocessed.isEmpty()) {
            return "";
        }

        // Get the first character of the input string
        char ch = unprocessed.charAt(0);

        // If the first character is 'i', skip it and make a recursive call with the rest of the string
        if (ch == 'i') {
            return skip(unprocessed.substring(1));
        } else {
            // If the first character is not 'i', append it to the result of a recursive call with the rest of the string
            return ch + skip(unprocessed.substring(1));
        }
    }

}
