package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;
// Define a class named Q4_FirstAndLastPositionInSortedArray
public class Q4_FirstAndLastPositionInSortedArray {

    // Define a main method
    public static void main(String[] args) {
    }

    // Define a method named searchRange that takes an array of integers called nums and an integer called target as input parameters and returns an array of integers
    public int[] searchRange(int[] nums, int target) {

        // Initialize an array of integers called ans with -1 as initial values for both elements
        int[]ans = {-1,-1};

        // Call the search method twice to find the starting and ending positions of the target element respectively
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        // Store the starting and ending positions of the target element in the ans array
        ans[0] = start;
        ans[1] = end;

        // Return the ans array
        return ans;
    }

    // Define a method named search that takes an array of integers called nums, an integer called target, and a boolean called findStartIndex as input parameters and returns an integer
    static int search(int[]nums, int target, boolean findStartIndex) {

        // Initialize a variable called ans with -1 as initial value
        int ans = -1;

        // Initialize two variables called start and end with 0 and the length of nums minus 1 respectively
        int start = 0;
        int end = nums.length - 1;

        // While the start index is less than or equal to the end index
        while (start <= end) {

            // Calculate the mid index
            int mid = (start + end) / 2;

            // If the target element is less than the element at the mid index
            if (target < nums[mid]) {
                // Update the end index to the index before the mid index
                end = mid - 1;
            } else if (target > nums[mid]) { // If the target element is greater than the element at the mid index
                // Update the start index to the index after the mid index
                start = mid + 1;
            } else { // If the target element is equal to the element at the mid index
                // Store the mid index in the ans variable
                ans = mid;
                // If the method is looking for the starting position of the target element
                if (findStartIndex) {
                    // Update the end index to the index before the mid index
                    end = mid - 1;
                } else { // If the method is looking for the ending position of the target element
                    // Update the start index to the index after the mid index
                    start = mid + 1;
                }
            }
        }

        // Return the ans variable, which contains the starting or ending position of the target element, or -1 if the element is not found
        return ans;
    }
}
