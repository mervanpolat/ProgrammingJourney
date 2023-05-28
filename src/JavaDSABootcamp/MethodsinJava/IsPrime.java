package JavaDSABootcamp.MethodsinJava;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        //Program that checks whether the entered values is a prime or not

        //User input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        boolean ans = isPrime(n);

        //Output
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;

        //The below statement executes till c*c is less or equal to n
        while (c*c <= n) {
            //Check whether the given value is divisible initially by two, if yes then it's not a prime number
            //otherwise increment c while c*c <= n
            if (n % c == 0) {
                //Meaning if the above conditions are met, then it's not a prime number
                return false;
            }
            c++;
        }

        //If c*c > n -> Then the given value is a prime number
        if (c*c > n) {
            return true;
        }
        return false;
    }


}

//Prints
//Enter a number: 19
//true
