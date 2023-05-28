package JavaDSABootcamp.Recursion.RecursionArrayQuestions;
// import ArrayList class to use dynamic arrays
import java.util.ArrayList;

// Define the class
public class Q3_LinearSearchOnMultiOccurences {

    // Define the main method
    public static void main(String[] args) {

        // Define an array of integers
        int[] arr = {1, 2, 3, 5, 6, 343, 54, 75, 34};

        // Define an array of integers
        int[] arr2 = {1, 2, 3, 5, 6, 343, 54, 54, 75, 34};

        // Call the findAllIndex method to find all occurrences of a target value in the array
        // In this case, the target value is 343 and the starting index is 1 (the second element of the array)
        findAllIndex(arr, 343, 1);

        // Call the findAllIndex method to find all occurrences of a target value in the array
        // In this case, the target value is 54 and the starting index is 1 (the second element of the array)
        findAllIndex(arr2,54,1);

        // Print the list of all occurrences of the target value
        //System.out.println(list);   //Prints [5]
        System.out.println(list);   //Prints [6, 7]
    }

    // Define a static ArrayList to store the indices of all occurrences of the target value
    static ArrayList<Integer> list = new ArrayList<>();

    // Define a recursive method to find all occurrences of the target value in the array
    static void findAllIndex(int[] arr, int target, int index) {

        // If the index is equal to the length of the array, return from the method
        if (index == arr.length) return;

        // If the value at the current index is equal to the target value, add the index to the ArrayList
        if (arr[index] == target) {
            list.add(index);
        }

        // Recursively call the method with the next index
        findAllIndex(arr, target, index + 1);
    }
}