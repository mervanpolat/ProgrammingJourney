package JavaDSABootcamp.Recursion.RecursionSubsetSubsequenceStringQuestions;// Import the required classes
import java.util.ArrayList;
import java.util.List;

// Define a public class named Q7_IterativeProgramToPrintSubsequences
public class Q7_IterativeProgramToPrintSubsequences {
    // Polymorphism method
    public static void main(String[] args) {
        // Declare an array of integers
        int[]arr = {1,2,3};

        // Call the subset method with the array as an argument, and store the result in a variable named 'ans'
        List<List<Integer>> ans = subset(arr);

        // Iterate through each subsequence in the 'ans' list and print it
        for (List<Integer> list : ans) {
            System.out.println(list);
            //[]
            //[1]
            //[2]
            //[1, 2]
            //[3]
            //[1, 3]
            //[2, 3]
            //[1, 2, 3]
        }
    }
    // Define a static method named 'subset' that takes an array of integers as input and returns a list of lists of integers
    static List<List<Integer>> subset(int[]arr) {
        // Declare a new outer list (of lists) that will store the subsequences
        List<List<Integer>> outer = new ArrayList<>();

        // Add an empty list to the outer list, as an empty subsequence is always a valid subsequence
        outer.add(new ArrayList<>());

        // Iterate through each number in the input array
        for (int num : arr) {
            // Get the current size of the outer list
            int n = outer.size();

            // Iterate through each subsequence in the outer list
            for (int j = 0; j < n; j++) {
                // Create a new list (internal) as a copy of the current subsequence in the outer list
                List<Integer> internal = new ArrayList<>(outer.get(j));

                // Add the current number from the input array to the new internal list
                internal.add(num);

                // Add the new internal list (with the additional number) to the outer list
                outer.add(internal);
            }
        }
        // Return the outer list containing all subsequences
        return outer;
    }
}
