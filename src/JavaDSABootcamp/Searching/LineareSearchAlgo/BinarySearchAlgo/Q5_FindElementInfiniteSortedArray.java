package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class Q5_FindElementInfiniteSortedArray {
    public static void main(String args[]) {
        //Declaration
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        //Method Call
        int ans = findIndex(arr, 130);
        //Output
        System.out.println("Target element found at index " + ans);
        //Prints: Target element found at index 7
    }

    //Specifically created for infinite sorted array
    static int findIndex(int[] arr, int target) {
        int start = 0;
        int end = 1;
        //Increase the range of the given infinite array, while the condition is true
        while (arr[end] < target) {
            //Assign previousEnd value to start
            start = end;
            //Double the range of my end until while condition is no longer true
            end = 2 * end;
        }
        //Apply binarySearch to find the target value, if the above condition is no longer true (line 36)!
        return binarySearch(arr, start, end, target);
    }

    //Binary Search
    static int binarySearch(int[] arr, int start, int end, int target) {
        //Execute the following code while start <= end!
        while (start <= end) {
            //Calculating mid-value
            int mid = (start + end) / 2;
            //If the target lies on the right increase start
            if (arr[mid] < target) {
                start = mid + 1;
                //If the target lies on the left decrease end
            } else if (arr[mid] > target) {
                end = mid - 1;
                //Target value is equal to the mid-value, thus return mit
            } else {
                return mid;
            }
        }
        //If none of the above conditions have been met, return -1;
        return -1;
    }
}