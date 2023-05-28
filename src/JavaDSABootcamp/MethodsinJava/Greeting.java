package JavaDSABootcamp.MethodsinJava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        /**What is a return_type?

            A method returns to the code that invoked it when it

                * completes all the statements in the method,
                * reaches a return statement, or
                * throws an exception (covered later),

            whichever occurs first

         Any method declared void doesn't return a value. It does not need to contain a return statement,
         but it may do so. In such a case, a return statement can be used to branch out of a control flow block
         and exit the method and is simply used like this:

                return;

         If you try to return a value from a method that is declared void, you will get a compiler error.

         Any method that is not declared void must contain a return statement with a corresponding return value,
         like this:

                return returnValue;

         The data type of the return value must match the method's declared return type; you can't return an integer
         value from a method declared to return a boolean.

         The getArea() method in the Rectangle Rectangle class that was discussed in the sections on objects returns
         an integer:

                // a method for computing the area of the rectangle
                public int getArea() {
                    return width * height;
                }
         **/

        Scanner input = new Scanner(System.in);

        System.out.println(greeting("Selam Mervan Polat"));
        //Prints Selam Mervan Polat

        String message = greeting("Apple Computer");
        System.out.println(message);
        //Prints Apple Computer


        //The below parameter replaces name with Mervan Polat and the return value concatenates
        //name with greeting. This will be equal to: Hello, Mervan Polat
        System.out.println(myGreet("Mervan Polat"));
        //Prints Hello, Mervan Polat

        //Same thing but this time with user input
        System.out.print("Enter name: ");
        String name = input.nextLine();
        String personalised = myGreet(name);

        //Output
        System.out.println(personalised);
        //Prints Hello, Bedirhan
    }

    static String greeting(String greet) {
        return greet;
    }

    //Personalised
    static String myGreet(String name) {

        String greeting = "Hello, ";
        return greeting+name;

    }
}
