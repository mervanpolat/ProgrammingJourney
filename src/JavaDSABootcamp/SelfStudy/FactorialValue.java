package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        /*
        Write a program to find the factorial value of any number entered through the keyboard.
        */

        Scanner input = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = input.nextInt();

        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }

        System.out.println("Factorial: "+ fact);
    }
}
