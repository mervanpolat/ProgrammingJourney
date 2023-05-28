package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class PracticingSwitches {
    public static void main(String[] args) {

        /** SWITCH STATEMENTS

         In switch statements, you can jump to various cases based on your expression.

         Syntax:

         switch(expression) {

            //cases
            case one:
                //do something
                break;

            case two:
                //do something
                break;

            default:
                //do something

         }

         Note:
         * Cases have to be the same type of expressions, it must be either a constant or a literal.
         * Duplicate case values are not allowed.
         * Break is used to terminate the sequence.
         * If break is not used, it will jump to the next case.
         * Default will only then execute, when none of the above conditions met the expression.
         * If default is not written at the end, add break statement after it.
         **/

        //Taking input from user
        //The values of the cases are case-sensitive.
        //Find a way to print the result regardless how you entered the value.
        System.out.print("Enter a fruit: ");
        Scanner input = new Scanner(System.in);

        //Storing user input in fruit of String datatype
        String fruit = input.next();

        //Syntax of switch statement
        switch (fruit) {
            //cases have to be followed by the same datatype, this is because switch is like if-else
            //Thus, both of them have to be of the same datatype.

            case "Mango":
                System.out.println("King of the fruits!");
                break;
            case "Apple":
                System.out.println("A sweet red fruit!");
                break;
            case "Orange":
                System.out.println("Round fruit!");
                break;
            case "Grapes":
                System.out.println("Small fruit!");
                break;
                //The below statement is the last statement, so you don't need to add a break; statement!
            default:
                System.out.println("Please enter a valid fruit!");
        }

        //prints Enter a fruit: Apple
        //       A sweet red fruit!

        //without break; statement
        switch (fruit) {
            case "Mango":
                System.out.println("King of the fruits!");
            case "Apple":
                System.out.println("A sweet red fruit!");
            case "Orange":
                System.out.println("Round fruit!");
            case "Grapes":
                System.out.println("Small fruit!");
            default:
                System.out.println("Please enter a valid fruit!");
        }

        //prints Enter a fruit: Mango
        //       King of the fruits!
        //       A sweet red fruit!
        //       Round fruit!
        //       Small fruit!
        //       Please enter a valid fruit!

        //As you see, if break is not provided then all conditions will get executed!


        //Another scenario this time adding break above default: condition
        switch (fruit) {
            case "Mango":
                System.out.println("King of the fruits!");
            case "Apple":
                System.out.println("A sweet red fruit!");
            case "Orange":
                System.out.println("Round fruit!");
            case "Grapes":
                System.out.println("Small fruit!");
                break;
            default:
                System.out.println("Please enter a valid fruit!");
        }

        //prints
        //Enter a fruit: Mango
        //King of the fruits!
        //A sweet red fruit!
        //Round fruit!
        //Small fruit!

    }
}
