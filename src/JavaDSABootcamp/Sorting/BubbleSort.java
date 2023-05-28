package JavaDSABootcamp.Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //Declaration
        int[] arr = {1,2,34,6,-7,46,2,63,1,-12};
        //Output
        System.out.println("Before: " + Arrays.toString(arr));
        //Prints Before: [1, 2, 34, 6, -7, 46, 2, 63, 1, -12]

        //Method call
        sort(arr);
        //Output
        System.out.println("After: " + Arrays.toString(arr));
        //Prints After: [-12, -7, 1, 1, 2, 2, 6, 34, 46, 63]
    }
    static void sort(int[]arr) {
        //Loop that iterates over the array multiple times, in each iteration the next largest item will bubble
        //up and move to its correct position.
        for (int i = 0; i < arr.length; i++) {
            //We use this loop to compare every two items of this array
            //We increment it after each iteration
            for (int j = 1; j < arr.length; j++) {
                //Now in each iteration, we're going to compare the item at index j with the previous item
                //if (arr[j] < arr[j-1]) this means that two items are out of order so we need to swap them
                if (arr[j] < arr[j-1]) {
                    //int temp = arr[j];
                    //Set arr[j] = arr[j-1];
                    //arr[j] = arr[j-1];
                    //Finally what we've stored in a temp, we use that to set of arr[j-1]
                    //But actually it's better to apply the swap method in a separate function.
                    //This will make our code cleaner!
                    //arr[j-1] = temp;

                    //Does the same thing as we did before but in a much cleaner way
                    swap(arr,j,j-1);
                }
            }
        }
    }
    //Method to swap values
    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
