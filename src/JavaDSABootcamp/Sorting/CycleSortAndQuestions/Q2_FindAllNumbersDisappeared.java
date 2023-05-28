package JavaDSABootcamp.Sorting.CycleSortAndQuestions;
import java.util.ArrayList;
import java.util.List;

class Q2_FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,3,2,7,8};
        System.out.println(findDisappearedNumbers(arr));
        //Prints [5, 6]

    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        /*
        Given an array nums of n integers where nums[i] is in the range [1, n],
        return an array of all the integers in the range [1, n] that do not appear in nums.
        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Constraints:
        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n
        */

        //Cycle Sort Algorithm
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;  // calculate the correct index for current element
            if (nums[i] != nums[correctIndex]) {  // if current element is not at its correct position
                swap(nums, i, correctIndex);  // swap current element with the one at its correct position
            } else {  // if current element is at its correct position
                i++;  // move to the next element
            }
        }
        List<Integer> ans = new ArrayList<>();  // initialize a new list to store missing numbers
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {  // if current element is not equal to its correct value (index+1)
                ans.add(index+1);  // add the missing number to the list
            }
        }

        return ans;  // return the list of missing numbers
    }
    static void swap(int[] nums, int first, int second) {  // method to swap two elements in the array
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
