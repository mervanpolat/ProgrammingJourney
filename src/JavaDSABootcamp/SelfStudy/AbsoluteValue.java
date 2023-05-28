package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        //Write a program to print absolute vlaue of a number entered by user. E.g.-

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println(number*-1);
        } else {
            System.out.println(number);
        }

        input.close();
    }
}
