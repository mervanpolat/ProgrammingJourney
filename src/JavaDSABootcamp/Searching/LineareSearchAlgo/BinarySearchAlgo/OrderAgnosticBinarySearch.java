package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        //Declaration ASC
        int[]arr = {-1,-2,3,4,5,6,7,8,9,23,43};
        //Declaration DESC
        int[]arr2 = {43,23,22,13,4,3,2,1,0,-1,-2,-3,-4,-5};
        System.out.println(OrderAgnosticBinarySearch(arr,23));
        //Prints 9
        System.out.println(OrderAgnosticBinarySearch(arr2, 0));
        //Prints 8
    }

    static int OrderAgnosticBinarySearch(int[]arr, int target) {
        //What if you don't know whether an array is sorted by ASC or DESC order?

        //Declaration
        int start = 0;
        int end = arr.length-1;

        //find whether the array is sorted in ASC or DESC order
        boolean isAsc = arr[start] < arr[end];

        //Find the target valie while start is less or equal to end
        while (start<=end) {

            //Finding mid value
            int mid = (start + end) / 2;

            //1. Condition -> This is also the best case
            //If mid-element is equal to target element then return the mid-element
            if (arr[mid] == target) {
                return mid;
            }

            //If the array is sorted in ascending order do the same thing as we did before
            if (isAsc) {
                //if target lies on the left
                if (target<arr[mid]) {
                    end = mid - 1;
                    //if target lies on the right
                } else if (target>arr[mid]) {
                    start = mid + 1;
                } else {
                    //answer found if the two above conditions haven't been met
                    //If return mid; is executed then the function is over, we've discussed this before
                    return mid;
                }
                //If the array is not sorted in ASC order then apply the exact opposite conditions for DESC array
            } else {
                if (target>arr[mid]) {
                    end = mid - 1;
                } else if (target<arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        //If none of the conditions have been met, then return -1 because the target value doesn't exist in the array
        return -1;
    }
}
