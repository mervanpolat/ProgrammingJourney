package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class FindMaxOfTwoNum {
    public static void main(String[] args) {

        //Take two int values from user and print greatest among them.

        Scanner input = new Scanner(System.in);

        System.out.println("Zahl1: ");
        int n1 = input.nextInt();
        System.out.println("Zahl2: ");
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println("Die Zahl " + n1 + " ist größer.");
        } else if (n2 > n1) {
            System.out.println("Die Zahl " + n2 + " ist größer.");
        } else {
            System.out.println("Die beiden Zahlen sind gleich!");
        }

        input.close();

    }
}
