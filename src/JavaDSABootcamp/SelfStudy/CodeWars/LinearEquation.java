package JavaDSABootcamp.SelfStudy.CodeWars;// Importing the Scanner class from java.util package
import java.util.Scanner;

// Defining a public class named "Equation"
public class LinearEquation {

    // Defining the main method
    public static void main(String[] args) {

        // Creating a new Scanner object named "input" for reading user input
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the value of x1 and storing it in an integer variable named "x1"
        System.out.print("x1: ");
        int x1 = input.nextInt();

        // Prompting the user to enter the value of y1 and storing it in an integer variable named "y1"
        System.out.print("y1: ");
        int y1 = input.nextInt();

        // Prompting the user to enter the value of x2 and storing it in an integer variable named "x2"
        System.out.print("x2: ");
        int x2 = input.nextInt();

        // Prompting the user to enter the value of y2 and storing it in an integer variable named "y2"
        System.out.print("y2: ");
        int y2 = input.nextInt();

        // Calculating the slope of the line passing through the two points (x1,y1) and (x2,y2) and storing it in an integer variable named "k"
        int k = (y2-y1)/(x2-x1);

        // Calculating the y-intercept of the line passing through the two points (x1,y1) and (x2,y2) and storing it in an integer variable named "d"
        int d = y1 - k*x1;

        // Printing out the equation of the line in the form "y = k*x + d"
        System.out.println("y = " + k + "*x" + " + " + d);
    }
}
