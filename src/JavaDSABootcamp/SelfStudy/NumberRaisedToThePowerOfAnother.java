package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class NumberRaisedToThePowerOfAnother {
    public static void main(String[] args) {
        /*
        * Two numbers are entered through the keyboard.
        * Write a program to find the value of one number raised to the power of another.
        * (Do not use Java built-in method)*/

        Scanner input = new Scanner(System.in);

        //Asks the user to enter the base
        System.out.print("Enter the base: ");
        int base = input.nextInt();

        //Asks the user how many times the base should be multiplied by itself. Variable exponent sets the range.
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        //repeat this process while i is less than my exponent, which is declared as my range.
        for (int i = 1; i < exponent; i++) {
            //base is multiplied by itself depending on the number of my exponent.
            //Let's say if the number entered for exponent is 3, then my base will be multiplied by itself 3 times.
            base *= base;
        }
        System.out.println(base);
    }
}
