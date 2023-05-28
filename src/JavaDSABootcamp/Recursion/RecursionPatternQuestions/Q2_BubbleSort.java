package JavaDSABootcamp.Recursion.RecursionPatternQuestions;
import java.util.Arrays;

public class Q2_BubbleSort {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[]arr = {1243,76,34,7,9,-1,54,6};

        // Call the bubble sort function with the array and its length
        bubble(arr, arr.length-1,0);

        // Print out the sorted array using the Arrays.toString() method
        System.out.println(Arrays.toString(arr));
        //Prints [-1, 6, 7, 9, 34, 54, 76, 1243]
    }

    static void bubble(int[]arr, int row, int col) {
        // Base case: If the current row is 0, then we're done.
        if (row==0) return;

        // If the current column is less than the current row, compare the adjacent elements
        if (col<row) {
            // If the current element is greater than the next element, swap them
            if (arr[col]>arr[col+1]) {
                swap(arr, col, col+1);
            }

            // Recursively call the function with the next column
            bubble(arr,row,++col);
        }
        // If the current column is equal to or greater than the current row, move on to the next row
        else {
            // Recursively call the function with the next row and column 0
            bubble(arr,--row,0);
        }
    }

    static void swap(int[]arr, int index1, int index2) {
        // Swap the elements at the two given indices in the array
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
