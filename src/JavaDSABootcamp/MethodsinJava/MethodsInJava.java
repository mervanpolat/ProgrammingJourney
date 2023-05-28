package JavaDSABootcamp.MethodsinJava;

import java.util.Scanner;

public class MethodsInJava {
    public static void main(String[] args) {

        /**Why should we use functions?
         * Functions are methods in Java.
         * If a function is in a class, it's called method in Java.
         * In Java everything is declared in a class.
        **/

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

        //Prints
        //Enter first number:
        //10
        //Enter second number:
        //19
        //The Sum = 29


        //Q: Take an input of two numbers and print the Sum -> 10 times

        //We can do this in a Method, for readability I created the method outside my main method,
        //so it's in a separate Java class

        /**Syntax of a Method

        return_type name () {
            //body
            return statement;
        }
         **/
    }



}
