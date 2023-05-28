package JavaDSABootcamp.Recursion.RecursionArrayQuestions;
import java.util.ArrayList;

public class Q4_ReturnAnArrayList {
    public static void main(String[] args) {

        // Define an array of integers
        int[]arr ={18,21,34,49,62,73,85,96,45,456,45,98,7,523,12,65};

        // Call the findAllIndices method with the array, target element, starting index, and an empty ArrayList
        System.out.println(findAllIndices(arr,45,0,new ArrayList<Integer>()));  // Prints [8, 10]
        System.out.println(findAllIndices(arr,98,0,new ArrayList<Integer>()));  // Prints [11]
        System.out.println(findAllIndices(arr,21,0,new ArrayList<Integer>()));  // Prints [1]
    }

    // Define an empty ArrayList to store the indices where the target element is found
    static ArrayList<Integer> list = new ArrayList<>();

    // Define the recursive method that finds all indices of a target element in an array
    static ArrayList<Integer> findAllIndices(int[]arr, int target, int index, ArrayList<Integer> list) {
        // Base case: If the index is equal to the length of the array, return the list of indices
        if (index==arr.length) {
            return list;
        }

        // If the current element of the array is the target element, add its index to the list
        if (arr[index] == target) {
            list.add(index);
        }

        // Recursive case: Call the method again with the next index in the array
        return findAllIndices(arr,target,index+1, list);
    }
}
