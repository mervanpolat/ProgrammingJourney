package JavaDSABootcamp.Sorting.CycleSortAndQuestions;

public class Q3_FindTheDuplicateNumber {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-the-duplicate-number/
        /*
        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
        There is only one repeated number in nums, return this repeated number.
        You must solve the problem without modifying the array nums and uses only constant extra space.

        Example 1:
        Input: nums = [1,3,4,2,2]
        Output: 2
        */

        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicateNumbers(arr));
        //Prints 2
    }

    static int findDuplicateNumbers(int[] nums) {
        //Cycle Sort Algorithm
        int index = 0;
        //{1, 3, 4, 2, 2};
        while (index < nums.length) {
            //If the 1st element of 0th index != 0 + 1 = 1 then put the element to its correct position
            if (nums[index] != index + 1) {
                //Get the correct position of my element by subtracting it by 1, because arrays start with 0
                int correctIndex = nums[index] - 1;
                //If, let's assume the 1st element of my array != the correct index then swap it or "put it to its correct position"
                if (nums[index] != nums[correctIndex]) {
                    //swaps the elements positions till they are equal to their position indices
                    swap(nums, index, correctIndex);
                } else {
                    //Duplicate element found, print it out! Keep in mind that we're also sorting this array
                    return nums[index];
                }
                //else keep incrementing
            } else {
                index++;
            }
        }
        return -1;
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

