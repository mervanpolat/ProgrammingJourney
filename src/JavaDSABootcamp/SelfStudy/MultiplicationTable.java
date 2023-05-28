package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Product: " + number*i);
        }
    }
}
