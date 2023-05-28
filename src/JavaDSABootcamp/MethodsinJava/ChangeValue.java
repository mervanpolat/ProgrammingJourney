package JavaDSABootcamp.MethodsinJava;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        //Declaring an array -> Collection of numbers
        int[] arr = {34,43,3,6,8,9,31};
        //Passing the values of arr to change(int[] nums) method, which will replace the zeroth value with 19.
        change(arr);
        //Output
        System.out.println(Arrays.toString(arr));
        //Prints [19, 43, 3, 6, 8, 9, 31]

    }

    //Method declaration without return statement
    //int[] nums is like another ref variable of int[] arr pointing to the same value which is the values of int[] arr
    static void change(int[] nums) {
        //If you make a change to the below object via this ref variable, same object will be changed.
        nums[0] = 19;
    }
}
