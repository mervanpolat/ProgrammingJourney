package JavaDSABootcamp.MethodsinJava;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        //returning the int value of sum2() Method
        int ans = sum2();
        System.out.println(ans);

        //Prints

        //Enter first number:
        //4
        //Enter second number:
        //7
        //11
    }

    //The return value has to match the datatype of my function in order to return the value of the function
    /*Important: return basically means that my function has ended. Whenever a return statement is executed,
                 it means your work here is done and let's come up over to the main where the function is called.
    */





    static int sum2() {

        //Q: Take an input of two numbers and RETURN the sum

        //User input
        Scanner input = new Scanner(System.in);

        //Variable declaration
        int n1, n2, sum;

        //Storing user input for two numbers
        System.out.println("Enter first number: ");
        n1 = input.nextInt();
        System.out.println("Enter second number: ");
        n2 = input.nextInt();

        //Calculating the Sum of two numbers
        sum = n1+n2;

        //returning the sum
        return sum;
    }

    //Method Creation
    static void sum() {
        //Q: Take an input of two numbers and print the Sum

        //User input
        Scanner input = new Scanner(System.in);

        //Variable declaration
        int n1, n2, sum;

        //Storing user input for two numbers
        System.out.println("Enter first number: ");
        n1 = input.nextInt();
        System.out.println("Enter second number: ");
        n2 = input.nextInt();

        //Calculating the Sum of two numbers
        sum = n1+n2;

        //Printing the Sum
        System.out.println("The Sum = " + sum);
    }
}
