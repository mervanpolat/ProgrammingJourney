package JavaDSABootcamp.Recursion.RecursionSubsetSubsequenceStringQuestions;

public class Q4_Subsequences {

    // Polymorphism method that executes the program
    public static void main(String[] args) {
        // Calls the subsequence method with empty string and "abc" as arguments
        subsequence("", "abc"); //Prints abc ab ac a bc b c
    }

    // Method to generate all possible subsequences of a string
    static void subsequence(String processed , String unprocessed){

        // Base case: If the unprocessed string is empty, print the processed string and return
        if (unprocessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        // Get the first character of the unprocessed string
        char ch = unprocessed.charAt(0);

        // Recursive calls with updated arguments to generate all possible subsequences
        // First call includes the current character, so append it to the processed string
        // and pass the remaining unprocessed string as argument
        subsequence(processed+ch, unprocessed.substring(1));

        // Second call excludes the current character, so pass the current processed string
        // and the remaining unprocessed string (without the current character) as arguments
        subsequence(processed, unprocessed.substring(1));
    }
}
