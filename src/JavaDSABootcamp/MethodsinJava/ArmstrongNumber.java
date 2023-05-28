package JavaDSABootcamp.MethodsinJava;

import java.util.Scanner;

/**What is an Armstrong number?
    153 ->  1 5 3
            1*1*1  +  5*5*5  +  3*3*3
            1      +   125   +   27    = 153
 * **/

public class ArmstrongNumber {
    public static void main(String[] args) {
        //This program checks whether a number is armstrong or not,
        //This exercise shares similarity with reversing int numbers

        //User input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int ans = isArmstrong(n);

    }

    static int isArmstrong(int n) {

        //We don't want to lose the original value
        int temp = n;

        //Summing up the values is necessary to calculate whether a number is an armstrong number or not
        int sum = 0;

        while(n>0) {

            //Isolate the number
            int r = n % 10;

            //Eliminate the digit
            n /= 10;

            //Calculating cube
            sum += r * r * r;
        }

        //Checks if temp (which stores the original value) is equal to my sum of each cubic digits.
        //If it's then it's an armstrong number, if not then not!
        if (sum == temp) {
            System.out.println("It's an armstrong number!");
        } else {
            System.out.println("Not an armstrong number");
        }

        return sum;
    }
}
