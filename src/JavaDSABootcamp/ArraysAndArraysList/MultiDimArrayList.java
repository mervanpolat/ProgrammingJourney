package JavaDSABootcamp.ArraysAndArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {

        //User Input
        Scanner input = new Scanner(System.in);
        //Syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //How to initialize -> Without initialization you'll get an error.
        //The reason is the logic at line 24. It says "get index from list" -> list.get()
        //how can the computer get the index of list, if it's not declared? That results to error.
        for (int i = 0; i < 3; i++) {
            //Three arrays will be added because the size of ArrayList is not fixed
            list.add(new ArrayList<>());
        }

        //add elements
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list.get(row).add(input.nextInt());
            }
        }

        //Output
        System.out.println(list);

        //Prints
        //1 2 3 4 5 6 7 8 9
        //[[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
