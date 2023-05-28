// Package name
package JavaDSABootcamp.Recursion.RecursionSubsetSubsequenceStringQuestions;

// Required imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q8_SubsequencesDuplicateElements {
    public static void main(String[] args) {
        // Input array with duplicate elements
        int[] arr = {1, 2, 2};

        // Get the list of subsequences without duplicates and store in `ans`
        List<List<Integer>> ans = subsetDuplicate(arr);

        // Print the subsequences
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        // Sort the input array to make duplicate elements adjacent
        Arrays.sort(arr);

        // Create an `outer` list to store lists of subsequences
        List<List<Integer>> outer = new ArrayList<>();

        // Add an empty subsequence to the `outer` list (base case)
        outer.add(new ArrayList<>());

        // Variables to store the start and end indices of the loop for adding new subsequences
        int start = 0;
        int end = 0;

        // Iterate through the input array
        for (int i = 0; i < arr.length; i++) {
            // Initialize the start index to 0 for each iteration
            start = 0;

            // Check if the current element is a duplicate of the previous element
            if (i > 0 && arr[i] == arr[i - 1]) {
                // If it's a duplicate, update the start index to the previous end index + 1
                // This helps in avoiding duplicate subsequences
                start = end + 1;
            }

            // Set the end index to the current size of the `outer` list - 1
            end = outer.size() - 1;

            // Get the number of lists (subsequences) in the `outer` list
            int n = outer.size();

            // Iterate from the start index to the current number of subsequences in the `outer` list
            for (int j = start; j < n; j++) {
                // Create a new list `internal` and initialize it with the existing subsequence from the `outer` list
                List<Integer> internal = new ArrayList<>(outer.get(j));

                // Add the current element of the input array to the `internal` list
                internal.add(arr[i]);

                // Add the updated `internal` list (new subsequence) to the `outer` list
                outer.add(internal);
            }
        }

        // Return the `outer` list containing all the subsequences without duplicates
        return outer;
    }
}
