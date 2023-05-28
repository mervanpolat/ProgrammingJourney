package JavaDSABootcamp.Sorting.CycleSortAndQuestions;

public class Q6_FirstMissingPositive {
    public static int firstMissingPositive(int[] arr) {
        /*
        Given an unsorted integer array nums, return the smallest missing positive integer.
        You must implement an algorithm that runs in O(n) time and uses constant extra space.

        Example 1:
        Input: nums = [1,2,0]
        Output: 3
        Explanation: The numbers in the range [1,2] are all in the array.
        Example 2:

        Input: nums = [3,4,-1,1]
        Output: 2
        Explanation: 1 is in the array but 2 is missing.
        Example 3:

        Input: nums = [7,8,9,11,12]
        Output: 1
        Explanation: The smallest positive integer 1 is missing.
        */

        //Cycle Sort
        int i = 0;
        while (i<arr.length) {
            //Getting the correct index
            int correct = arr[i]-1; // subtract 1 to adjust the index starting from 0
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) { // checking if the number is in the range and not already in its correct index
                swap(arr,i,correct); // swap the number to its correct index
            } else {
                i++; // if the number is already in its correct index, move to the next element
            }
        }

        //Search for the first missing number
        for (int index = 0; index < arr.length; index++) { // iterate over the array
            if (arr[index]!=index+1) { // check if the number is not equal to its expected value
                return index+1; // if the number is not equal to its expected value, return the expected value
            }
        }
        return arr.length+1; // if all numbers are in their expected value, then return the next positive integer
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first]; // store the first element in a temporary variable
        arr[first] = arr[second]; // swap the first element with the second element
        arr[second] = temp; // swap the second element with the temporary variable
    }
}