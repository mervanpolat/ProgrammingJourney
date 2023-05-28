package JavaDSABootcamp.ArraysAndArraysList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        //Declaration
        int[] arr = {1,23,4,7,9,4};

        //Method Calling
        swap(arr,1,3);
        //Output
        System.out.println(Arrays.toString(arr));
        //Prints [1, 7, 4, 23, 9, 4]

        //Method Calling
        swap(arr,4,0);
        //Output
        System.out.println(Arrays.toString(arr));
        //Prints [9, 7, 4, 23, 1, 4]
    }

    //Swap indices
    static void swap(int[] arr, int index1, int index2) {
        //temp stores index2
        int temp = arr[index2];
        //index2 stores index1
        arr[index2] = arr[index1];
        //index1 stores the initial value of index2
        arr[index1] = temp;
    }
}
