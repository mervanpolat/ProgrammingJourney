package JavaDSABootcamp.Recursion.RecursionArrayQuestions;
public class Q6_RotatedBinarySearch {

    public static void main(String[] args) {
        // create an integer array
        int[] arr = {5,6,7,8,9,1,2,3};

        // call the search method with the array, target value, start index and end index as input
        // and print the result
        System.out.println(search(arr,9,0,arr.length)); //Prints 4

        // call the search method with the array, target value, start index and end index as input
        // and print the result
        System.out.println(search(arr,3,0,arr.length)); //Prints 7
    }

    static int search(int[]arr, int target, int start, int end){
        // if the start index is greater than the end index, return -1 indicating the target is not found
        if (start>end) return -1;

        // find the middle index of the array
        int mid = start + (end-start)/2;

        // if the middle element of the array is equal to the target value, return the index
        if (arr[mid]==target) {
            return mid;
        }

        // if the first half of the array is sorted in ascending order
        if (arr[start]<= arr[mid]) {
            // if the target value is within the first half of the array
            if (target>= arr[start] && target <= arr[mid]) {
                // recursively call the search method with the first half of the array
                return search(arr,target,start,mid-1);
            } else {
                // recursively call the search method with the second half of the array
                return search(arr,target,mid+1,end);
            }
        }
        // if the second half of the array is sorted in ascending order
        if (target >= arr[mid] && target<= arr[end]) {
            // recursively call the search method with the second half of the array
            search(arr,target,mid+1,end);
        } else {
            // recursively call the search method with the first half of the array
            return search(arr,target,start,mid-1);
        }
        // this line will never be reached, but it is included to avoid any compilation errors
        return mid;
    }
}
