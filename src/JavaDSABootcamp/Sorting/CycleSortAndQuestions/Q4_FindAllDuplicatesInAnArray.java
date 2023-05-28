package JavaDSABootcamp.Sorting.CycleSortAndQuestions;

import java.util.ArrayList;
import java.util.List;

public class Q4_FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] arr) {

        //Cycle Sort
        int index = 0;
        while (index < arr.length) {
            //Getting the correct index for the current element
            int correctIndex = arr[index] - 1;
            //Checking if the current element is already in the correct index
            if (arr[index] != arr[correctIndex]) {
                //If not, swap the current element with the element at its correct index
                swap(arr, index, correctIndex);
            } else {
                //If it's already in the correct index, move to the next element
                index++;
            }
        }
        //Creating a list to store the duplicate elements
        List<Integer> ans = new ArrayList<>();
        //Iterating through the array
        for (int i = 0; i < arr.length; i++) {
            //If the element doesn't equal to the position i+1, it means that the element is duplicate
            if (arr[i] != i + 1) {
                //Add the duplicate element to the ans list
                ans.add(arr[i]);
            }
        }
        //Return the list of duplicate elements
        return ans;
    }

    //Swapping component of cycle sort
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
