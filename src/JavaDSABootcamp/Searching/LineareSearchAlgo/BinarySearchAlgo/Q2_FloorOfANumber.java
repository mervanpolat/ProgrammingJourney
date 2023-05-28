package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class Q2_FloorOfANumber {
    public static void main(String[] args) {
        // Initialize the integer array 'arr' with sorted values {2, 3, 5, 9, 14, 16, 18}.
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        // Call the 'findingFloorOfANumber' function to find the floor of the target number 15 and print the result.
        // In this example, the floor of 15 is 14 (largest element smaller or equal to the target).
        System.out.println(findingFloorOfANumber(arr, 15));
        // Output: 14

        // Call the 'findingFloorOfANumber2' function to find the index of the floor of the target number 15 and print the result.
        // In this example, the index of the floor of 15 is 4 (index of the element 14).
        System.out.println(findingFloorOfANumber2(arr, 15));
        // Output: 4
    }

    // This function 'findingFloorOfANumber' takes a sorted integer array 'arr' and a target integer as input.
    // It returns the floor of the target number (the greatest element that is smaller or equal to the target).
    static int findingFloorOfANumber(int[] arr, int target) {
        // Initialize the 'start' and 'end' pointers to the first and last indices of the array.
        int start = 0;
        int end = arr.length - 1;

        // The while loop continues as long as the 'start' pointer is less than or equal to the 'end' pointer.
        while (start <= end) {
            // Calculate the middle index 'mid' between 'start' and 'end'.
            int mid = (start + end) / 2;

            // If the target is less than the element at the middle index, move the 'end' pointer to the left (mid - 1).
            if (target < arr[mid]) {
                end = mid - 1;
            }
            // If the target is greater than the element at the middle index, move the 'start' pointer to the right (mid + 1).
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            // If the target is equal to the element at the middle index, return the middle index value as the floor.
            else {
                return arr[mid];
            }
        }

        // If the target is not found in the array, return the element at the 'end' index as the floor.
        return arr[end];
    }

    // This function 'findingFloorOfANumber2' takes a sorted integer array 'arr' and a target integer as input.
    // It returns the index of the floor of the target number.
    static int findingFloorOfANumber2(int[] arr, int target) {
        // Initialize the 'start' and 'end' pointers to the first and last indices of the array.
        int start = 0;
        int end = arr.length - 1;

        // The while loop continues as long as the 'start' pointer is less than or equal to the 'end' pointer.
        while (start <= end) {
            // Calculate the middle index 'mid' between 'start' and 'end'.
            int mid = (start + end) / 2;

            // If the target is less than the element at the middle index, move the 'end' pointer to the left (mid - 1).
            if (target < arr[mid]) {
                end = mid - 1;
            }
            // If the target is greater than the element at the middle index, move the 'start' pointer to the right (mid + 1).
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            // If the target is equal to the element at the middle index, return the middle index as the index of the floor.
            else {
                return mid;
            }
        }

        // If the target is not found in the array, return the 'end' index as the index of the floor.
        return end;

        // This code snippet contains extremely detailed comments for each line of code to help beginners understand
        // the logic of finding the floor of a number (the greatest element that is smaller or equal to the target)
        // using the binary search algorithm. The comments explain the purpose of each line and the reasoning behind
        // the conditions and operations in the code.
    }
}
