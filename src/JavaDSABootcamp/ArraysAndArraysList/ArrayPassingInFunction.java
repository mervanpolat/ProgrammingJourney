package JavaDSABootcamp.ArraysAndArraysList;

import java.util.Arrays;

public class ArrayPassingInFunction {
    public static void main(String[] args) {
        //Declaration of array of type int
        //Arrays are mutable in Java -> They are changeable unlike Strings which are immutable
        int[] nums = {3,4,5,6,7,8};

        //Output
        System.out.println(Arrays.toString(nums));
        //Prints [3, 4, 5, 6, 7, 8]

        //[0] index of my nums will be 99 instead of 3!
        change(nums);

        //Output
        System.out.println(Arrays.toString(nums));
        //Prints [99, 4, 5, 6, 7, 8]
    }

    static void change(int[] arr) {
        //Assigns the value 99 to the zeroth index into the array that has been passed as a parameter
        arr[0] = 99;
    }
}
