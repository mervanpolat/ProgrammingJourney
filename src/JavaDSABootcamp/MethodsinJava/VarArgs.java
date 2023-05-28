package JavaDSABootcamp.MethodsinJava;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        //Assigning values to int[] regardless of the length of the arguments
        fun(23,434,65,65,8,5,3,2); //Prints [23, 434, 65, 65, 8, 5, 3, 2]

        //This will also work, int[] v is now an empty array.
        fun();                         //Prints []

        //Assigning values as parameters has to be done in order of declaration
        multiple(2,3,"Mervan");
    }

    //What if you want a mix of arguments?
    static void multiple(int a, int b, String ...v) {

    }

    //If you don't know how many int you want to pass, you write the following statement
    //The following statement takes the values internally as array of int
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v)); //Printing the values of int[] v

    }

}
