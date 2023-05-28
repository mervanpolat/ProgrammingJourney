package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class WhoIsTheYoungestAndOldest {
    public static void main(String[] args) {
        /* Take input of age of 3 people by user and determine oldest and youngest among them.*/

        Scanner input = new Scanner(System.in);
        System.out.print("1. Enter age: ");
        int age1 = input.nextInt();
        System.out.print("2. Enter age: ");
        int age2 = input.nextInt();
        System.out.print("3. Enter age: ");
        int age3 = input.nextInt();


        if (age1 < age2 && age1 < age3) {
            System.out.println(age1 + " is the youngest.");
        }

        if (age2 < age1 && age2 < age3) {
            System.out.println(age2 + " is the youngest.");
        }

        if (age3 < age1 && age3 < age2) {
            System.out.println(age3 + " is the youngest.");
        }

        //oldest

        if (age1 > age2 && age1 > age3) {
            System.out.println(age1 + " is the oldest.");
        }

        if (age2 > age1 && age2 > age3) {
            System.out.println(age2 + " is the oldest.");
        }

        if (age3 > age1 && age3 > age2) {
            System.out.println(age3 + " is the oldest.");
        }

        input.close();
    }
}
