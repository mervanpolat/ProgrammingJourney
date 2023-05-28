package JavaDSABootcamp.Recursion.RecursionArrayQuestions;
import java.util.Arrays;

public class Q2_LinearSearch {
    public static void main(String[] args) {
        int[]arr = {1,2,4,5,6,7,4,5,343,434,65,3,97,45,87,32,356,90,56,9,8};
        System.out.println(linearSearchRecursive(arr,9));   //true
        System.out.println(linearSearchRecursive(arr,19));  //false
        System.out.println(linearSearchRecursive(arr,0));   //false
    }
    public static boolean linearSearchRecursive(int[] arr, int target) {
        // Base case: If the array is empty, return false because we can't find the target in an empty array
        if (arr.length == 0) {
            return false;
        }

        // Check if the first element of the array is the target
        if (arr[0] == target) {
            return true;
        }

        // Recursive case: Call the linearSearchRecursive function with the rest of the array (excluding the first element)
        return linearSearchRecursive(Arrays.copyOfRange(arr,1,arr.length), target);
    }
}
