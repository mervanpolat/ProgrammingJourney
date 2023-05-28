package JavaDSABootcamp.Recursion.RecursionSubsetSubsequenceStringQuestions;

public class Q2_SkipAString {
    public static void main(String[] args) {
        // Call the skipApple() method with the input string "bcdappledg" and print the result
        System.out.println(skipApple("bcdappledg"));
        //Prints bcddg
    }

    static String skipApple(String unprocessed) {
        // If the input string is empty, return an empty string
        if (unprocessed.isEmpty()) {
            return "";
        }

        // If the input string starts with "apple", skip it and make a recursive call with the rest of the string
        if (unprocessed.startsWith("apple")) {
            return skipApple(unprocessed.substring(5));
        } else {
            // If the input string does not start with "apple", append the first character to the result of a recursive call with the rest of the string
            return unprocessed.charAt(0) + skipApple(unprocessed.substring(1));
        }
    }
}
