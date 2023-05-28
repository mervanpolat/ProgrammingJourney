package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class Q10_RotationCount {
    public static void main(String[] args) {
        // Initialize the integer array 'arr' with a rotated sorted array.
        int[] arr = {15, 22, 23, 28, 31, 38, 5, 6, 8, 10, 12};

        // Call the 'countRotations' function to find the number of rotations in the array and store the result in the 'count' variable.
        int count = countRotations(arr, arr.length);

        // Print the result: The number of times the array is rotated.
        System.out.println("The array is rotated " + count + " times");

        // Test with another array 'arr2' that is not rotated.
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(countRotations(arr2, arr2.length));
    }

    // This function 'countRotations' takes a rotated sorted integer array 'arr' and its length 'n' as input.
    // It returns the number of times the array is rotated.
    static int countRotations(int[] arr, int n) {
        // Initialize the 'start' and 'end' pointers to the first and last indices of the array.
        int start = 0;
        int end = arr.length - 1;

        // The while loop continues as long as the 'start' pointer is less than or equal to the 'end' pointer.
        while (start <= end) {
            // If the element at the 'start' index is less than or equal to the element at the 'end' index, return 'start' as the rotation count.
            if (arr[start] <= arr[end]) {
                return start;
            }

            // Calculate the middle index 'mid' between 'start' and 'end'.
            int mid = start + (end - start) / 2;

            // Calculate the indices 'next' and 'prev' as the next and previous indices of 'mid' in a circular fashion (wrapping around the array).
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            // If the element at the 'mid' index is less than or equal to the elements at both the 'next' and 'prev' indices,
            // it means that 'mid' is the smallest element in the rotated array, and we can return 'mid' as the rotation count.
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }
            // If the element at the 'mid' index is less than or equal to the element at the 'end' index, it means that the smallest element
            // is in the left half of the array, so we move the 'end' pointer to the left (mid - 1).
            else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
            // If the element at the 'mid' index is greater than or equal to the element at the 'start' index, it means that the smallest element
            // is in the right half of the array, so we move the 'start' pointer to the right (mid + 1).
            else if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
        }

        // If the loop completes without finding the smallest element, it means that the input array is not rotated, so we return -1 as an invalid result.
        return -1;
    }
}
