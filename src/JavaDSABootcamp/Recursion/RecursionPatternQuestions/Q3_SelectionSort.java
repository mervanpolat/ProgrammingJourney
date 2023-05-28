package JavaDSABootcamp.Recursion.RecursionPatternQuestions;

import java.util.Arrays;

public class Q3_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,-12,-43,34,5,7,8};
        selectionSort(arr, arr.length, 0, 0); // call the selectionSort method with initial values
        System.out.println(Arrays.toString(arr)); // print the sorted array
        //Prints [-43, -12, 1, 3, 4, 5, 7, 7, 8, 34]
    }

    // Recursive selectionSort method
    static void selectionSort(int[] arr, int row, int col, int max) {
        // Base case: if the row has been fully sorted, return
        if (row == 0) return;

        if (col < row) {
            // Recursive case 1: if the current element is greater than the current max,
            // update the max to the current element
            if (arr[col] > arr[max]) {
                selectionSort(arr, row, col+1, col); // recurse with new max value
            } else {
                selectionSort(arr, row, col+1, max); // recurse with old max value
            }
        } else {
            // Recursive case 2: swap the last element in the row with the max value
            swap(arr, row-1, max);
            // Recurse on the next row with the initial values
            selectionSort(arr, row-1, 0, 0);
        }
    }

    // Swap method to swap two elements in an array
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
