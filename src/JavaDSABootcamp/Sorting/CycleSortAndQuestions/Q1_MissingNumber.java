package JavaDSABootcamp.Sorting.CycleSortAndQuestions;

public class Q1_MissingNumber {
    public static void main(String[] args) {
        // Initialize the integer array 'arr' with test values {3, 0, 1}.
        int[] arr = {3, 0, 1};

        // Call the 'cycleSort' function to find the missing number in the array 'arr' and print the result.
        // In this example, the missing number is 2.
        System.out.println(cycleSort(arr));
        // Output: 2
    }

    // This function 'cycleSort' takes an integer array 'arr' as input and returns the first missing positive number.
    static int cycleSort(int[] arr) {
        // Initialize a variable 'i' to traverse the array elements starting from index 0.
        int i = 0;

        // The while loop iterates until 'i' reaches the last index of the array.
        // The purpose of this loop is to place each element at its correct index, i.e., arr[i] == i.
        while (i < arr.length) {
            // Calculate the correct index for the current element (arr[i]) and store it in 'correctIndex'.
            int correctIndex = arr[i];

            // Check if the current element is less than the array length and not already at its correct position (arr[i] != arr[correctIndex]).
            // The reason to check if 'arr[i] < arr.length' is to make sure we don't go out of bounds when accessing 'arr[correctIndex]'.
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                // If the conditions are met, swap the current element (arr[i]) with the element at its correct index (arr[correctIndex]).
                swap(arr, i, correctIndex);
            } else {
                // If the current element is already at its correct position or out of bounds, move to the next element by incrementing 'i'.
                i++;
            }
        }

        // After placing the elements at their correct indices, we need to search for the first missing number.
        // Start a for loop to iterate through the array from index 0.
        for (int index = 0; index < arr.length; index++) {
            // Check if the element at the current index is not at its correct position, i.e., arr[index] != index.
            if (arr[index] != index) {
                // If the element is not at its correct position, return the current index as the missing number.
                return index;
            }
        }

        // If all elements are at their correct positions, it means that the missing number is equal to the array length.
        // For example, if the array is {0, 1, 2}, the missing number is 3.
        return arr.length;
    }

    // This function 'swap' takes an integer array 'arr' and two indices ('first' and 'second') as input.
    // It swaps the elements at the given indices in the array.
    static void swap(int[] arr, int first, int second) {
        // Store the value of the first element (arr[first]) in a temporary variable 'temp'.
        int temp = arr[first];

        // Assign the value of the second element (arr[second]) to the first element (arr[first]).
        arr[first] = arr[second];

        // Assign the value of the temporary variable 'temp' (which is the initial value of the first element) to the second element (arr[second]).
        arr[second] = temp;
    }
}
