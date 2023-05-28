package JavaDSABootcamp.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9,12,14,16,19,77,78};
        System.out.println(binarySearch(arr,10,0,arr.length-1));
        //Prints -1
        System.out.println(binarySearch(arr,77,0,arr.length-1));
        //Prints 13
    }

    static int binarySearch(int[]arr, int target, int start, int end) {
        if (start>end) return -1;
        int mid = start + (end-start)/2;
        if (arr[mid] > target) {
            //Make sure to return the result of a function call of the return type
            //If you don't return it, what will happen is that in the end your answer will not be returned.
            return binarySearch(arr,target,start,mid-1);
        } else if (arr[mid] < target) {
            return binarySearch(arr,target, mid+1, end);
        } else {
            return mid;
        }
    }
}
