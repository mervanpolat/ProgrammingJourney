package JavaDSABootcamp.SelfStudy.CodeWars;

public class Q1_SkipAChar {

    //In this code, we use a while loop to find the index of the first occurrence of the character 'a' in the string text
    //using the indexOf() method. If the character 'a' is not found in the string, the indexOf() method returns -1 and the loop terminates.
    //Inside the loop, we remove all occurrences of 'a' from the string text using the replaceAll() method.
    //We also increment the counter by the index of the first occurrence of 'a' plus 1 (because indexing in Java starts from 0).
    //This is done to account for the characters that were removed before the current occurrence of 'a'.
    //Finally, we print the modified string text and the counter value.

    public static void main(String[] args) {
        String text = "baccaaaaa"; // Initialize the input string
        int counter = 0; // Initialize the counter variable
        int index = 0; // Initialize the index variable

        // Loop until there are no more occurrences of 'a' in the string
        while ((index = text.indexOf('a')) != -1) {
            text = text.replaceAll("a", ""); // Remove all occurrences of 'a' from the string
            counter += index + 1; // Increment the counter by the index of the first occurrence of 'a' plus 1

            // The above line is equivalent to:
            // counter = counter + index + 1;
            // This is done to account for the characters that were removed before the current occurrence of 'a'.
        }

        // Print the modified string and the counter value
        System.out.println(text);
        System.out.println(counter);
    }

}
