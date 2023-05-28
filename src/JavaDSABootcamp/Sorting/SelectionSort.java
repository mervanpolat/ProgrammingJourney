package JavaDSABootcamp.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //Array Declaration
        int[]arr = {-43,645,802,23,546,-53,-45,13};

        //Method Call
        selection(arr);

        //Output
        System.out.println(Arrays.toString(arr));
        //Prints [-53, -45, -43, 13, 23, 546, 645, 802]

    }

    //The Selection Sort Algorithm
    static void selection(int[]arr) {

        for (int i = 0; i < arr.length; i++) {
            //Find the max item in the remaining array and swap with the correct index
            int lastIndex = arr.length-i-1;
            //maxIndex contains the largest element via getMaxIndex method
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            //Method that swaps the maxIndex with the lastIndex of the array
            swap(arr,maxIndex,lastIndex);
        }
    }

    //Swapping values of array
    static void swap(int[]arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    //Getting max element of array
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
