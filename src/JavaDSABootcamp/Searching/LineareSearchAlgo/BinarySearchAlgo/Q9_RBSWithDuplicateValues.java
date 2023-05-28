package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class Q9_RBSWithDuplicateValues {
    // Define a static method called "search" that takes an integer array "nums" and an integer "target" as input and returns a boolean value
    static boolean search(int[] nums, int target) {
        // If the array "nums" is empty, return false
        if(nums.length == 0) {
            return false;
        }

        // Initialize two integer variables "start" and "end" to the start and end indices of the array "nums"
        int start = 0;
        int end = nums.length -1;

        // Use a while loop to perform binary search on the array "nums"
        while(start <= end) {
            // Calculate the index of the middle element of the current range of indices in the array "nums"
            int mid = start + (end - start) / 2;

            // If the middle element is equal to the target, return true
            if(nums[mid] == target) {
                return true;
            }

            // If the middle element is greater than the first element in the range
            if(nums[mid] > nums[start]) {
                // If the target is less than the middle element but greater than or equal to the first element in the range, search the left half of the range
                if(target < nums[mid] && target >= nums[start]) {
                    end = mid;
                }
                // Otherwise, search the right half of the range
                else {
                    start = mid + 1;
                }
            }
            // If the middle element is less than the first element in the range
            else if (nums[mid] < nums[start]) {
                // If the target is greater than the middle element but less than the first element in the range, search the right half of the range
                if(target > nums[mid] && target < nums[start]) {
                    start = mid + 1;
                }
                // Otherwise, search the left half of the range
                else {
                    end = mid;
                }
            }
            // If the first element in the range is equal to the middle element, increment the start index by 1
            else {
                start++;
            }
        }
        // If the target is not found in the array, return false
        return false;
    }

    // Define the main method
    public static void main(String[] args) {
        // Create an integer array "nums"
        int[]nums = {2,5,6,0,0,1,2};
        // Call the "search" method with "nums" and "0" as arguments, and print the returned value
        System.out.println(search(nums,0)); //Prints true
        // Call the "search" method with "nums" and "3" as arguments, and print the returned value
        System.out.println(search(nums,3)); //Prints false
    }
}
