package JavaDSABootcamp.Searching.LineareSearchAlgo.BinarySearchAlgo;

public class Q1_CeilingOfANumber {
    public static void main(String[] args) {

        int[]arr = {2,3,5,9,14,16,18};

        /*Q1: Ceiling of a number:
          Find the smallest element in an array, that is greater than or equal to the target element.
          arr[] = {2,3,5,9,14,16,18}, int target;

          Ceiling(arr, target) -> Ceiling(arr, 14) = 14
          Ceiling(arr, target) -> Ceiling(arr, 15) = 16
         */

        System.out.println(ceiling(arr,15));
        //Prints 16 -> Element of arr
        System.out.println(ceiling2(arr,15));
        //Prints 5  -> Index of arr
    }

    static int ceiling(int[]arr, int target) {

        //But what if the target is greater than the greatest number in the array?
        if (target > arr.length) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            //Calculating the mid-value of an array
            int mid = (start + end) / 2;

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
        }
        //while-loop at line 25 will break if start is greater than end, which will only happen, if the target value
        //in the given array is not found. The problem-statement wants us to print the smallest value which is greater or
        //equal to the target value. So if the target value is not found, our start value will be one more than the end value,
        //this means start holds the element which is the smallest element that is greater or equal to my target element.
        //As you can presume, the opposite applies to end variable.
        return arr[start];
    }

    static int ceiling2(int[]arr, int target) {

        //But what if the target is greater than the greatest number in the array?
        if (target > arr.length) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while (start<=end) {

            //Calculating the mid-value of an array
            int mid = (start + end) / 2;

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
        }
        //while-loop at line 25 will break if start is greater than end, which will only happen, if the target value
        //in the given array is not found. The problem-statement wants us to print the smallest value which is greater or
        //equal to the target value. So if the target value is not found, our start value will be one more than the end value,
        //this means start holds the element which is the smallest element that is greater or equal to my target element.
        //As you can presume, the opposite applies to end variable.
        return start;
    }
}
