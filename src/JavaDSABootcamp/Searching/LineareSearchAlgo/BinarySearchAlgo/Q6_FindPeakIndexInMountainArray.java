package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;
//Check for better solutions and improvise your theory scribble via YouTube
public class Q6_FindPeakIndexInMountainArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/peak-index-in-a-mountain-array/

        int[]arr = {-1,-2,1,2,3,5,7,15,4,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[]arr) {

        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int mid = (start + end) / 2;
            if (arr[mid]>arr[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}
