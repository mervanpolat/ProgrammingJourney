package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class Q7_FindInMountainArray {
    public static void main(String[] args) {
        // This is the main method where you can test your code.
        // Currently it is empty as there is no testing code provided in this snippet.
        // You can create test cases to verify the correctness of the code.
    }

    /**
     * This method searches for the given target value in the mountain array using binary search.
     *
     * @param arr    The input mountain array.
     * @param target The value to be searched in the array.
     * @return Returns the index of the target value in the array if found, else returns -1.
     */
    int search(int[] arr, int target) {
        // Find the index of the peak element in the mountain array.
        int peak = peakIndexInMountainArray(arr);

        // Perform binary search on the left half of the mountain array.
        int firstTry = OrderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // Perform binary search on the right half of the mountain array.
        return OrderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    /**
     * This method finds the index of the peak element in the mountain array.
     *
     * @param arr The input mountain array.
     * @return Returns the index of the peak element in the array.
     */
    static int peakIndexInMountainArray(int[] arr) {

        // Initialize start and end pointers for binary search.
        int start = 0;
        int end = arr.length - 1;

        // Perform binary search until we find the peak element.
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    /**
     * This method performs order-agnostic binary search on the input array.
     *
     * @param arr    The input array.
     * @param target The value to be searched in the array.
     * @param start  The starting index of the search range.
     * @param end    The ending index of the search range.
     * @return Returns the index of the target value in the array if found, else returns -1.
     */
    static int OrderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        // Determine if the input array is sorted in ascending or descending order.
        boolean isAsc = arr[start] < arr[end];

        // Perform binary search until we find the target value.
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}