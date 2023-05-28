package JavaDSABootcamp.ArraysAndArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {
    public static void main(String[] args) {
        //What is an ArrayList?
        //The idea is that we know that we have to give a fixed size to arrays. What if you can't estimate
        //how long your array should be? What will you do then? Can Java handle the size for you?
        //Yes, that's what ArraysList is. ArraysList is actually a part of the collection framework which we'll
        //cover in OOP.

        //DataType: Can only store PassByValue Classes

        //User Input
        Scanner input = new Scanner(System.in);

        //Syntax                                    10 -> InitialCapacity
        ArrayList<Integer> list = new ArrayList<>(10);

//        //Adds int elements to list array
//        list.add(4);
//        list.add(14);
//        list.add(2);

//        System.out.println(list.contains(4));
//        //Prints: true
//
//        System.out.println(list.contains(44));
//        //Prints: false
//
//        System.out.println(list);
//        //Prints: [4, 14, 2]
//
//        //changes the 0th index to 19
//        list.set(0,19);
//
//        System.out.println(list);
//        //Prints: [19, 14, 2]
//
//        //Index #1 will be removed -> 14
//        list.remove(1);
//        System.out.println(list);
        //Prints: [19, 2]

        //Input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        //Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");    //Pass index here, list[index] syntax will not work here
            //1 4 5 3 23
            //Prints: 1 4 5 3 23
        }
    }
}
