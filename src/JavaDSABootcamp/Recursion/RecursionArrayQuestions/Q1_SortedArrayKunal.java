package JavaDSABootcamp.Recursion.RecursionArrayQuestions;

public class Q1_SortedArrayKunal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {12, 23, 56, 2};

        System.out.println(sortedOrNot(arr, 0));     // Prints true
        System.out.println(sortedOrNot(arr2, 0));    // Prints false
    }

    // This method checks whether an array is sorted or not using recursion
    // It takes two parameters:
    // - arr: the array to check
    // - index: the current index being checked
    static boolean sortedOrNot(int[] arr, int index) {
        // Base case: if we have checked all elements in the array, then it is sorted
        if (index == arr.length - 1) {
            return true;
        }

        // Recursive case: if the current element is less than the next element AND
        // the rest of the array is sorted, then the array is sorted
        return arr[index] < arr[index + 1] && sortedOrNot(arr, ++index);
    }
}
