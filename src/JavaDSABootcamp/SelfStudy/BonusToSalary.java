package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class BonusToSalary {
    public static void main(String[] args) {
        /*
        A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        Ask user for their salary and year of service and print the net bonus amount.
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year of service: ");
        int year = input.nextInt();
        System.out.print("Enter salary: ");
        int salary = input.nextInt();

        if (year > 5) {
            System.out.println("Salary with bonus: " + salary*1.05);
        }

        input.close();
    }
}
