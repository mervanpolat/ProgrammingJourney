package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {

        //User input
        Scanner input = new Scanner(System.in);

        //Enter the number of the employerID
        System.out.print("Enter employer number: ");
        int empID = input.nextInt();

        //Enter name of the department
        System.out.print("Enter department: ");
        String department = input.next();

        //Nested Switch basically means switch inside a switch.
        switch (empID) {
            //Enhanced switch
            case 1 -> System.out.println("Mervan Polat");
            case 2 -> System.out.println("Kunal Kushwaha");
                /*In order to add a switch inside a switch you have to declare the second
                  switch inside a case statement, otherwise it will print an error.
                  If one of the first two cases are executed the remaining ones will be ignored due to the break;*/

            /*Be careful with switch inside a switch statements using the enhanced syntax.
              case must be followed with an arrow and brackets in order to function. */
            case 3 -> {
                switch (department) {
                    //enhanced switch syntax followed with a default statement at the end
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered.");
                }
            }

            //Conventional switch statement with a default statement at the end
            default -> System.out.println("Please enter correct EmpID.");
        }

    }

}
