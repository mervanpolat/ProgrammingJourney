package JavaDSABootcamp.ArraysAndArraysList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {

        //User input
        Scanner input = new Scanner(System.in);

        //Array of objects
        String[] str = new String[4];

        //Helps to print more aesthetic as you can see far below
        int count = 1;

        //For each value that the user has inputted, the for-loop stores it in each index.
        for (int i = 0; i < str.length; i++) {

            //Message that prompts the user to enter value for every index of the str of type String
            System.out.println("Enter " + count + ". name: ");

            //stores user value in each index of str array
            str[i] = input.next();

            //numerical value represents each and every user input
            count++;
        }

        //Output
        System.out.println(Arrays.toString(str));

        //Prints
        //Enter 1. name:
        //Mervan
        //Enter 2. name:
        //Bedirhan
        //Enter 3. name:
        //Mehmet
        //Enter 4. name:
        //Ahmet
        //[Mervan, Bedirhan, Mehmet, Ahmet]

        str[3] = "Leonardo";    //Third index value of str array has been replaced with "Leonardo"

        System.out.println(Arrays.toString(str));
        //Prints
        //Enter 1. name:
        //Mervan
        //Enter 2. name:
        //Bedirhan
        //Enter 3. name:
        //Mehmet
        //Enter 4. name:
        //Ahmet
        //[Mervan, Bedirhan, Mehmet, Leonardo]
    }
}
