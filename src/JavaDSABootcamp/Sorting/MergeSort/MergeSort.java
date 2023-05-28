package JavaDSABootcamp.Sorting.MergeSort;
import java.util.Arrays;// Importing the Arrays class from the Java utility package.

// Defining a class named "MergeSort"
public class MergeSort {

    //Warning: This code creates by every recursive call new array objects, so it's not a memory friendly approach!

    // The main method of the program
    public static void main(String[] args) {

        // Creating an integer array called "arr"
        int[] arr = {5, 4, 3, 2, 1};

        // Calling the mergeSort method to sort the array "arr"
        arr = mergeSort(arr);

        // Printing the sorted array to the console
        System.out.println(Arrays.toString(arr));
        //Prints [1, 2, 3, 4, 5]

    }

    // A recursive method that performs the merge sort algorithm
    static int[] mergeSort(int[] arr) {

        // The base case of the recursion: if the array has only one element, it is already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Calculating the midpoint of the array
        int mid = arr.length / 2;

        // Splitting the array into two halves and calling the mergeSort method recursively on each half
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merging the two sorted halves using the merge method
        return merge(left, right);
    }

    // A method that merges two sorted arrays into a single sorted array
    static int[] merge(int[] first, int[] second) {

        // Creating a new array to hold the merged elements
        int[] mix = new int[first.length + second.length];

        // Initializing variables to keep track of the current index of each array and the new merged array
        int j = 0;
        int i = 0;
        int k = 0;

        // Comparing the elements of the two arrays and adding the smaller one to the new array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Adding any remaining elements from the left array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Adding any remaining elements from the right array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        // Returning the merged array
        return mix;
    }
}
