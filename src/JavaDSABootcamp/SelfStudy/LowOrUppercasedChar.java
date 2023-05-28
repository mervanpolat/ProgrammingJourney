package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class LowOrUppercasedChar {
    public static void main(String[] args) {
        //Write a program to check whether entered char is lower-cased or upper-cased.

        //User input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");

        /*
           How to store a value of type char:

        1. You have to add charAt(0) functionality to store as char,
           otherwise it will be stored as String, which results to error.
         */

        //letter variable stores the inputted letter.
        char letter = input.next().charAt(0);

        //Check whether the letter I've inputted is between upper-cased letters.
        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Character is upper-cased!");
            //If the above condition results to false, then my letter is lower-cased.
        } else {
            System.out.println("Character is lower-cased!");
        }

        //closing Scanner function
        input.close();

        //prints
        //Enter a character: M
        //Character is upper-cased!
    }
}
