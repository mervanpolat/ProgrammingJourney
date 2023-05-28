package JavaDSABootcamp.Searching.LineareSearchAlgo;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        //Declaration
        int[][]arr = {
                {14,27,36},
                {43,15,36,47},
                {58,69,75,35},
                {4,76,19,38,57}
        };

        //Passing values to search method
        int[] ans = search(arr,19);
        //Output
        System.out.println(Arrays.toString(ans));
        //Prints [3, 2]
        System.out.println(Arrays.toString(search(arr,15)));
        //Prints [1, 1]
        System.out.println(Arrays.toString(search(arr,75)));
        //Prints [2, 2]
        System.out.println(Arrays.toString(search(arr,1)));
        //Prints [-1, -1]

        //Max Value in 2D Array
        searchMax(arr);
        System.out.println(searchMax(arr));
        //Prints 76
    }
    
    static int[] search(int[][]arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    //Becuase int[] is not declared within the scope of for-loop, you have to initialize it
                    //by using new keyword, otherwise it will give an error.
                    //Look at YouTube for this exercise for more information
                    return new int[]{row,col};
                }
            }
        }
        //If the above conditions are not met, then return -1
        return new int[]{-1,-1};
    }

    static int searchMax(int[][]arr) {
        //Assuming max value is at the zero index in arr
        int max = arr[0][0];
        //Iterating loop till arr.length to find the larget value
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //Store the max element of arr in max variable
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        //If and only if all iterations have been done, then return max;
        //Previously you've put return max; statement inside the above if-statement which is at line 55.
        //this caused to sudden break of the for-loop.
        return max;
    }
}
