package JavaDSABootcamp.ArraysAndArraysList;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //Declaration
        int[]arr = {1,2,3,4,5,6,7,8,9,14};
        //Method Call
        reverse(arr);
        //Output
        System.out.println(Arrays.toString(arr));
        //Prints [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

        findTargetValue(arr, 14);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        //We'll basically apply the swap logic, then increment start and decrement end
        int start = 0;
        //Since we're taking the index value, arr.length will give me index out of bounds.
        //The last index will be arr.length - 1;
        //Because if the length of the above arr array is 10, the last index will be 9.
        int end = arr.length-1;

        //Repeat the below process while start is less than end to reverse array
        while (start<end) {
            //swap
            swap(arr,start,end);
            //Increment start
            start++;
            //Decrement end
            end--;
        }
    }

    //swap method
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void findTargetValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        target = 13;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
    }
}
