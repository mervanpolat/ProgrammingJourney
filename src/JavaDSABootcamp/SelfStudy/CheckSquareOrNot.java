package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class CheckSquareOrNot {
    public static void main(String[] args) {
        //Take values of length and breadth of a rectangle from user and check if it is square or not.

        Scanner input = new Scanner(System.in);
        System.out.print("Länge: ");
        Integer length = input.nextInt();
        System.out.print("Breite: ");
        Integer width = input.nextInt();

        if (length.equals(width)) {
            System.out.println("It is a square not a rectangle!");
        } else {
            System.out.println("Area: " + length*width);
            System.out.println("Circumference: " + (length+width+length+width));
        }

        //Take two int values from user and print greatest among them.

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n1 > n2) {
            System.out.println("Die Zahl " + n1 + " ist größer.");
        } else if (n2 > n1) {
            System.out.println("Die Zahl " + n2 + " ist größer.");
        } else {
            System.out.println("Die beiden Zahlen sind gleich!");
        }
    }
}
