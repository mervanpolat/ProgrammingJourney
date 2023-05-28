package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class Q11_SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        // Calculate the maximum element (max) and the sum of all elements (sum) in the input array nums.
        int max = 0, sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }

        // Initialize left and right pointers to max and sum, respectively.
        int left = max, right = sum;

        // Perform binary search between left and right.
        while (left < right) {
            // Calculate the mid-point (mid).
            int mid = left + (right - left) / 2;

            // Initialize currSum and count variables to 0 and 1, respectively.
            int currSum = 0, count = 1;

            // Iterate through the input array nums.
            for (int num : nums) {
                // If currSum + num is greater than mid, reset currSum to 0 and increment count.
                if (currSum + num > mid) {
                    currSum = 0;
                    count++;
                }
                // Add num to currSum.
                currSum += num;
            }

            // If count is greater than k, update left to mid + 1.
            if (count > k) {
                left = mid + 1;
            }
            // Otherwise, update right to mid.
            else {
                right = mid;
            }
        }

        // After the binary search, return left as the minimized largest sum of the split.
        return left;
    }
    // This code snippet contains extremely detailed comments for each line of code to help beginners understand
    // the logic of splitting an integer array nums into k non-empty subarrays such that the largest sum of any
    // subarray is minimized. The comments explain the purpose of each line and the reasoning behind the conditions
    // and operations in the code. The code uses a binary search algorithm to find the minimized largest sum of the split.
}
