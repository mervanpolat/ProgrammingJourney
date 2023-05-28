package JavaDSABootcamp.Sorting;
import java.util.Arrays;

public class OptimizedBubbleSort {
    public static void main(String[] args) {
        //Here we'll use the optimized version of bubble sort, it makes this algorithm run a little bit faster
        //But its time complexity is still O(n^2)
        int[] arr = {1,2,34,6,-7,46,2,63,1,-12};
        System.out.println("Before: " + Arrays.toString(arr));
        //Prints Before: [1, 2, 34, 6, -7, 46, 2, 63, 1, -12]
        sort(arr);
        System.out.println("After: " + Arrays.toString(arr));
        //Prints After: [-12, -7, 1, 1, 2, 2, 6, 34, 46, 63]
    }

    static void sort(int[]arr) {
        //1. Optimization: isSorted? true : false -> if true then no need to iterate over the array, else iterate.
        //2. Optimization: We only need to compare elements that are not in the correct position;

        //1.1 Here we're assuming that we need n iterations to sort this array but what if our array is already sorted?
        //    or partially sorted? Then we're not going to need n iterations we need fewer iterations.
        //1.2 So here I'm going to declare a boolean variable called isSorted
        boolean isSorted;
        //1.3 Now in every iteration you want to set this to true and assume that the array is sorted, if our assumption
        //    is correct then we'll return immediately.
        for (int i = 0; i < arr.length; i++) {
            //1.4 We assume the array is sorted, now we start comparing items, if we end up swapping two items that means
            //    our assumption was wrong so right after swapping we need to set isSorted = false -> at line 25;
            isSorted = true;
            //2. Here we're going to the entire array comparing every two items but as you learned in every iteration
            //   in every pass the next largest item bubbles up and moves to its correct position. So you don't need
            //   to compare all the items in this array we only need to compare all the items that are not in the correct
            //   position.
            //
            //   In the first pass no items were in the correct position that means we should iterate over the array
            //   In the second pass one of the items is in the correct position, so we need to look at all the items
            //   except the last item. So at line 32 we can change the expression to (arr.length - i)
            //   Again, in the first iteration i = 0 so we'll iterate over the array, in the second as well but except
            //   the last item.
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1])
                    swap(arr,j,j-1);
                //1.5 If two items got swapped then our array is not sorted that means that our assumption at line 20 was wrong
                isSorted = false;
            }
            //1.6 If the array is sorted we can return immediately, there's no need to iterate over this array one more time
            if (isSorted) return;
        }
    }

    //Method to swap values
    static void swap(int[]arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
