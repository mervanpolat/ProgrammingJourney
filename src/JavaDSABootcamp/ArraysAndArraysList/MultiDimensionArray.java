package JavaDSABootcamp.ArraysAndArraysList;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        //User input
        Scanner input = new Scanner(System.in);

        //Multidimensional Array

        /*
        1 2 3
        4 5 6
        7 8 9
        */

        //Syntax
        int[][] arr = new int[3][3];

        //Direct declaration of multidimensional arrays
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Individual size of a multidimensional array -> That's why it's not mandatory to specify the columns
        //int[][not mandatory to specify see below!]
        int[][] arr2D = {
                {1,2,3},          //0th index
                {4,5},            //1st index
                {6,7,8,9}         //2nd index -> arr2D[2] = {6, 7, 8, 9}
        };

        //Input -> for-loop

        //The row and col value of my arr array is specified that's why we have to use the below logic
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row or every array at that row the length of that array
            for (int col = 0; col < arr[row].length; col++) {
                //Assigning values through user input
                arr[row][col] = input.nextInt();
            }
        }

        //Print the values that we have assigned through user input to the above for-loop

        //The row and col value of my arr array is specified that's why we have to use the below logic
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row or every array at that row the length of that array
            for (int col = 0; col < arr[row].length; col++) {
                //Printing values of user input
                System.out.print(arr[row][col] + "  ");
            }
            //Prints a new line every time when one column has been filled and this results to printing a matrix
            System.out.println();
        }

        //The compiler printed the below values before I added println() statement in line 59

        //Prints -> int[] arr = new int[3][2] -> 3 rows and in each row 2 columns
        //19 38     -> User Input
        //57 76     -> User Input
        //95 114    -> User Input
        //19  38  57  76  95  114

        //Prints -> int[] arr = new int[3][3] -> 3 rows and in each row 3 columns
        //19 38 57      -> User Input
        //76 95 114     -> User Input
        //133 152 171   -> User Input
        //19  38  57  76  95  114  133  152  171

        //After adding println() statement in line 59

        //1 2 3 -> User Input
        //4 5 6 -> User Input
        //7 8 9 -> User Input

        //1  2  3
        //4  5  6
        //7  8  9

        //Another Experiment

        //12 19 42 325 54 65 545 7 3 -> User Input

        //12  19  42
        //325  54  65
        //545  7  3

        //And another experiment -> I assigned more inputs that the array can hold, thus it printed only the first nine values

        //323 43 43 65 34 54 23 54 34 534 4 -> User Input

        //323  43  43
        //65  34  54
        //23  54  34

        //The below for-loop prints the above for-loop in Arrays.ToSring() format.
        for (int row = 0; row < arr.length; row++) {
            //Prints a new line every time when one column has been filled and this results to printing a matrix
            System.out.println(Arrays.toString(arr[row]));
            //Prints
            //23 3 3 3 4 5 6 7 8 9
            //23  3  3
            //3  4  5
            //6  7  8
            //The below print belongs to this for loop, as you can realize from the print(Arrays.toString(arr[row]));
            //[23, 3, 3]
            //[3, 4, 5]
            //[6, 7, 8]
        }

        System.out.println();

        //You can't print arr that way because row is out of bounds,
        //you have to use for-loop if you want to print your multidimensional array
        //System.out.println(Arrays.toString(arr[row])); //"Cannot resolve symbol 'row'"

        //Doing the same thing in enhanced for-loop
        //Because every single element of arr itself is an array, the first argument which is, int[] a also has to be an array element.
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
            //Prints
        }

        //Prints
        //1 2 3 4 5 6 7 8 9 -> User Input
        //1  2  3
        //4  5  6
        //7  8  9
        //[1, 2, 3]
        //[4, 5, 6]
        //[7, 8, 9]
        //
        //[1, 2, 3]
        //[4, 5, 6]
        //[7, 8, 9]

    }
}
