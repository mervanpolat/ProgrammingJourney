package JavaDSABootcamp.Recursion.RecursionQuestions;// Import ArrayList class from java.util package
import java.util.ArrayList;

// Create a public class named Q2_NumberOfDiceRollsWithTargetSum
public class Q2_NumberOfDiceRollsWithTargetSum {
    // This Java code demonstrates a recursive solution to find all possible combinations of dice rolls that
    // add up to a target sum. The code is divided into two main methods: dice() and diceList().
    // The dice() method prints each combination as it is found, while the diceList() method returns an ArrayList of
    // all combinations.

    // Define the main method that will be executed when the program runs
    public static void main(String[] args) {
        // Call the dice method with an empty string and a target value of 3
        dice("", 3);
        // Prints
        // 111
        // 12
        // 21
        // 3

        // Print the result of the diceList method with an empty string and a target value of 3
        System.out.println(diceList("", 3));
        // Prints [111, 12, 21, 3]
    }

    // Define a static method named dice that takes a processed string and a target value as arguments
    static void dice(String processed, int target) {
        // If the target value is 0, print the processed string and return
        if (target == 0){
            System.out.println(processed);
            return;
        }

        // Iterate through numbers 1 to 6 (inclusive) and check if the current number is less than or equal to the target value
        for (int i = 1; i <= 6 && i <= target; i++) {
            // Call the dice method recursively with the processed string concatenated with the current number, and the target value minus the current number
            dice(processed+i, target-i);
        }
    }

    // Define a static method named diceList that takes a processed string and a target value as arguments, and returns an ArrayList of strings
    static ArrayList<String> diceList(String processed, int target) {
        // If the target value is 0, create a new ArrayList, add the processed string to it, and return the list
        if (target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        // Create a new ArrayList named list
        ArrayList<String> list = new ArrayList<>();

        // Iterate through numbers 1 to 6 (inclusive) and check if the current number is less than or equal to the target value
        for (int i = 1; i <= 6 && i <= target; i++) {
            // Call the diceList method recursively with the processed string concatenated with the current number, and the target value minus the current number
            // Add the returned ArrayList to the current list using the addAll method
            list.addAll(diceList(processed+i, target-i));
        }
        // Return the populated list
        return list;
    }
}
