package JavaDSABootcamp.Recursion.RecursionArrayQuestions;
import java.util.ArrayList;

public class Q5_ReturnArrayListWithoutArgument {
    public static void main(String[] args) {
        int[]arr ={18,21,34,49,62,73,85,96,45,456,45,98,7,523,12,65};

        System.out.println(findAllIndices2(arr,21,0));  //Prints [1]
        System.out.println(findAllIndices2(arr,45,0));  //Prints [8, 10]
        System.out.println(findAllIndices2(arr,7,0));   //Prints [12]
        System.out.println(findAllIndices2(arr,1,0));   //Prints []
    }

    // This method takes an integer array, a target value and an index as input and returns an ArrayList of
    //integer indices where the target value is present in the array, starting from the given index.

    static ArrayList<Integer> findAllIndices2(int[] arr, int target, int index) {

        // create an ArrayList to store the indices where the target value is found
        ArrayList<Integer> list2 = new ArrayList<>();

        // if the given index is equal to the length of the array, return the empty ArrayList
        if (index == arr.length) {
            return list2;
        }

        // if the element at the given index of the array is equal to the target value, add the index to the list
        if (arr[index] == target) {
            list2.add(index);
        }

        // recursively call the method with the next index in the array
        ArrayList<Integer> ansFromBelowCalls = findAllIndices2(arr, target, index + 1);

        // add all the indices returned from the recursive call to the current list
        list2.addAll(ansFromBelowCalls);

        // return the final list of indices where the target value is found in the array
        return list2;
    }
}
