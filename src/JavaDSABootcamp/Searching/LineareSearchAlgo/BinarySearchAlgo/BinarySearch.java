package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class BinarySearch {
    public static void main(String[] args) {
        //Binary Search is used in sorted arrays, sorted either in asc or desc order

        //asc order
        int[] arr = {2,4,9,10,12,14,18,19};
        //desc order
        int[] arr2 = {19,12,6,5,3,2,-8, -16};
        //We could apply linearSearch to the above sorted arrays, but the no. of comp. could be the length of arr

        //What is BinarySearch?
        //Find target = 36; -> by applying BinarySearch
        int[]arr3 = {2,4,6,9,11,12,14,20,36,48};

        //1. Find middle element
        //   arr3 has 9 indices -> 9/2 = 4.5 (int) = 4 is the mid-index that also means 11 is the mid-element

        /*2. If target = 36 and if array is sorted (ASC) and if the middle element is 11, then in any case
             is there going to be a possibility that 36 will lie on the left side of the arr3? -> No!
             11 is smaller than 36, that's why my target value can only be on the right side of the arr3.
             We can come to this conclusion because arr3 is sorted in ASC order. Opposite is also true.
        */

        //3. If middle element == target element -> That's my answer!

        /*Theorie

       1. Example

          s = start
          m = middle
          e = end

          target = 36;
                       s       m              e
          int[]arr3 = {2,4,6,9,11,12,14,20,36,48};

          (middle < target) -> search on the right side of the array
          start = mid + 1;
                       s     m     e
          int[]arr3 = {12,14,20,36,48};

          (middle < target) -> search on the right side of the array again
          start = mid + 1;
                       sm  e
          int[]arr3 = {36,48};

          ans = 8;

       2. Example

          target = 12;
                       s       m              e
          int[]arr3 = {2,4,6,9,11,12,14,20,36,48};

          (middle < target) -> search on the right side of the array
          start = mid + 1;
                        s     m     e
          int[]arr3 = {12,14,20,36,48};

          (middle < target) -> search on the left side of the array
          (This time end has changed) -> end = mid -1;

                       sm  e
          int[]arr3 = {12,14};

          ans = 5;
          */

        //Worst case: If (start > end) -> target element is not found!
        //Best case: if(mid == target) -> return mid;


        //Code for Binary search

        int[] test = {2,4,9,10,12,14,18,19};
        System.out.println(binarySearch(test,19));
        //Prints 7
        System.out.println(binarySearch(test,2));
        //Prints 0

    }

    //return the index
    //return -1 if target does not exist
    static int binarySearch(int[]arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            //The below statement is finding the mid-element, it might exceed the range of int values in Java though.
            //int mid = (end + start)/2;

            //The below statement is a much better/safer way of doing the same thing
            int mid = (start + end) / 2;

            /*Previously we were doing something like mid = (s+e) / 2 -> but if these are very large values, they might exceed
              the fixed range of int values in Java, which will result to error.

              But mid = start + (end - start) / 2 -> prevents this problem
            */

            //target lies on the left
            if (target<arr[mid]) {
                end = mid - 1;
                //target lies on the right
            } else if (target>arr[mid]) {
                start = mid + 1;
            } else {
                //answer found if the two above conditions haven't been met
                //If return mid; is executed then the function is over, we've discussed this before
                return mid;
            }
        }
        //If the three above conditions haven't been met, then return -1 because target doesn't exist in the array.
        return -1;
    }
}
