package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class Zapfenrechnung {
    public static void main(String[] args) {

        //User input
        Scanner input = new Scanner(System.in);
        //Message
        System.out.println("Zapfenrechnung");
        //New line
        System.out.println();
        //Asking the user to enter a number
        System.out.print("Geben Sie eine zahl ein: ");
        //Storing user input
        int number = input.nextInt();
        //New line
        System.out.println();

        //Asking the user to define the range
        System.out.print("Wie oft soll sich die Schleife wiederholen (inclusive)?: ");
        //Storing user input
        int range = input.nextInt();
        //New line
        System.out.println();

        //Declaring the operand for calculating the total
        int operand = 2;
        //temp stores the former value of number
        int temp = 0;
        //total stores the total of the multiplication
        int total = 0;

        //for-loop gets executed until it's no longer less than range
        for (int i = 1; i < range; i++) {
            //temp stores temporarily the former value of number
            temp = number;
            //number gets multiplied by the operand which is initially 2
            number *= operand;
            //total holds the value of the above product at line 40
            total = number;
            //Output
            System.out.println(temp + " x " + operand + " = " + total);
            //Increment operand by one
            operand++;
        }

        //Setting operand back to 2 so that the same calculation can be done reverse -> Division
        operand = 2;

        //for-loop
        for (int j = 1; j < range; j++) {
            //temp stores temporarily the former value of number
            temp = number;
            //number gets divided by the operand which is set to 2 at line 50
            number /= operand;
            //total holds the value of the above quotient at line 57
            total = number;
            //Output
            System.out.println(temp + " / " + operand + " = " + total);
            //Increment operand by one
            operand++;
        }

        //Close scanner
        input.close();
        //New line
        System.out.println();
        //Exit
        System.out.println("Programm beendet!");
    }
}
