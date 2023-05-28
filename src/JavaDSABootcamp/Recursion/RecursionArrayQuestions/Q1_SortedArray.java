package JavaDSABootcamp.Recursion.RecursionArrayQuestions;
import java.util.Arrays;

public class Q1_SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 12};
        int[] arr2 = {1, 2, 4, 3, 8, 9};
        int[] arr3 = {3, 44, 55, 66, 67, 6};

        // Test the checkSortedArrayRecursion function with different arrays
        System.out.println(checkSortedArrayRecursion(arr));     //Prints true
        System.out.println(checkSortedArrayRecursion(arr2));    //Prints false
        System.out.println(checkSortedArrayRecursion(arr3));    //Prints false
    }

    // A function to check if an array is sorted in ascending order using recursion
    static boolean checkSortedArrayRecursion(int[] arr) {
        // base cases
        if (arr.length <= 1) return true; // If the array has only one element or is empty, return true because it is always sorted

        // check if the first element is greater than or equal to the second element
        if (arr[0] > arr[1]) return false; // If the array is not sorted in ascending order, return false

        // recursively call the function with the rest of the array
        int[] restOfArray = Arrays.copyOfRange(arr, 1, arr.length); // Create a new array with all elements except the first one
        return checkSortedArrayRecursion(restOfArray); // Recursively call the function with the new array
    }
}
