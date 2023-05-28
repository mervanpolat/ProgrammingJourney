package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        /**Enhanced Switch**/

        //Taking user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a fruit: ");

        //Storing user input
        String fruit = input.next();

        //Same thing but with a much cleaner syntax!
        switch (fruit) {
            //Internally all the following cases contain a break; statement.
            case "Mango" -> System.out.println("King of the fruits!");
            case "Apple" -> System.out.println("A sweet red fruit!");
            case "Orange" -> System.out.println("Round fruit!");
            case "Grapes" -> System.out.println("Small fruit!");
            default -> System.out.println("Please enter a valid fruit!");

            //prints
            //Enter a fruit: Mango
            //King of the fruits!

            //prints
            //Enter a fruit: mango
            //Please enter a valid fruit!

            //prints
            //Enter a fruit: Ananas
            //Please enter a valid fruit!
        }

        //Display name of the day

        System.out.print("Enter number for day: ");
        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //prints
        //Enter number for day: 5
        //Friday

        //Weekdays and Weekends

        switch (day) {
            //If we input 1,2,3,4 and 5 it will only execute the following statement.
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");

            //If we input 6 or 7, it will only execute the following statement.
            case 6,7 -> System.out.println("Weekend");

            //prints
            //Enter a fruit: Mango
            //King of the fruits!
            //Enter number for day: 5
            //Friday
            //Weekday
        }

    }
}
