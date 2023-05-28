package JavaDSABootcamp.ArraysAndArraysList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfPrimitives {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Array of primitives -> previously the name of the class was "Input"

        //Declaration of array of int data type
        int[] arr = new int[5];

        //Assigning values to an array
//        arr[0] = 19;
//        arr[1] = 38;
//        arr[2] = 57;
//        arr[3] = 76;
//        arr[4] = 95;

//        System.out.println(Arrays.toString(arr));   //Prints [19, 38, 57, 76, 95]

        //ArrayOfPrimitives using for-loop

        //Added this variable to make my output more aesthetic
        int a = 1;

        //For each value that the user has inputted, the for-loop stores it in each index.
        for (int i = 0; i < arr.length; i++) {
            //Message that prompts the user to enter value for every index of the arr of type int
            System.out.print("Enter " + a +". Number: ");
            //stores user value in each index of arr array
            arr[i] = input.nextInt();
            //numerical value represents each and every user input
            a++;
        }

        System.out.println();   //new line
        System.out.println(Arrays.toString(arr));

        //Prints
        //Enter 1. Number: 43
        //Enter 2. Number: 54
        //Enter 3. Number: 6
        //Enter 4. Number: 3
        //Enter 5. Number: 4

        //[43, 54, 6, 3, 4]

        //The below for-loop prints the values you have inputted
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //Prints 43 54 6 3 4
        }

        System.out.println();   //new line

        //If you look to the below code closely, it assigns a new value to your arr, this is not the case
        //with the above code, because it just prints the values you have inputted.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
            //Prints 0 1 2 3 4
        }
        System.out.println();   //new line

        //Enhanced for-loop

        for (int num : arr) {              //for every element in the array print the element
            System.out.print(num + " "); //Here num represents element of the array
            //Prints 0 1 2 3 4
        }
    }
}
