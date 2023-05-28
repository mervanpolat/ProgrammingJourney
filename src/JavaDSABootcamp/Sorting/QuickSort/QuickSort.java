package JavaDSABootcamp.Sorting.QuickSort;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        //Prints [1, 2, 3, 4, 5]
        /**
         * Sorts the specified array into ascending numerical order.
         *
         * @implNote The sorting algorithm is a Dual-Pivot Quicksort
         * by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch. This algorithm
         * offers O(n log(n)) performance on all data sets, and is typically
         * faster than traditional (one-pivot) Quicksort implementations.
         *
         * @param a the array to be sorted
         */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Prints [1, 2, 3, 4, 5]
    }

    // The sort() method implements the QuickSort algorithm using a recursive approach
    static void sort(int[] nums, int low, int high) {
        // Base case: If the subarray has only one element, return
        if (low >= high)
            return;

        // Choose the middle element as the pivot
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        // Partition the subarray into two subarrays using the pivot element
        while (start <= end) {
            // Find the first element from the left that is greater than or equal to the pivot
            while (nums[start] < pivot) {
                start++;
            }
            // Find the first element from the right that is less than or equal to the pivot
            while (nums[end] > pivot) {
                end--;
            }
            // Swap the two elements found in the previous steps, if start and end have not crossed each other
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        // Recursively sort the left and right subarrays using QuickSort
        // The left subarray consists of elements from low to end, and the right subarray consists of elements from start to high
        sort(nums, low, end);       // sort the left subarray
        sort(nums, start, high);    // sort the right subarray
    }
}
