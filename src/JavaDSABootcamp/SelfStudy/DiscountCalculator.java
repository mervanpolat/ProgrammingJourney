package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
        Ask user for quantity
        Suppose, one unit will cost 100.
        Judge and print total cost for user.
        */

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        int total = quantity * 100;

        if (total > 1000) {
            System.out.println("Usual Price is: " + total + " with 10% discount: " + total*0.90);
        } else {
            System.out.println("No discount!");
        }

        input.close();

    }
}
