package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class NThValueOfFibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //User ArrayOfPrimitives
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        //Output
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {

        //If my n is less or equal to 1 then return it!
        if (n <= 1) {
            return n;
        }

        /*
        Otherwise calculate the fibonacci value of the n index

        Example:

        f(n) = (n - 1) + (n - 2), n = 6;

        f(6) = (6 - 1) + (5 - 2)
             = 8

        Ans: My value of my sixth fibonacci index is 8;

        Important: Calculations are made from left to right
                   When the first calc is made, my updated n value will be n = n - 2;
                   Then that result will be subtracted again by 1 -> n = n - 1
                   Lastly they are going to be summed up, and you receive the fibonacci value of your nth index.

         */

        return (fibonacci(n - 1) + (fibonacci(n - 2)));
    }
}
