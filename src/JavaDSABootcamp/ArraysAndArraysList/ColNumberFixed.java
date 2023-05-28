package JavaDSABootcamp.ArraysAndArraysList;

import java.util.Arrays;

public class ColNumberFixed {
    public static void main(String[] args) {
        //Let's say column is not a fixed size
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        //We can easily solve this problem via using length function for arrays columns that are not fixed
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            //Adds a new line very time a complete array has been printed
            System.out.println();
        }

        //Prints
        //1 2 3 4
        //5 6
        //7 8 9
    }
}
