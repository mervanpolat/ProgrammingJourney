package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        /*
    A school has the following rules for grading system:
    1. Below 25 - F
    2. 25 to 45 - E
    3. 45 to 50 - D
    4. 50 to 60 - C
    5. 60 to 80 - B
    6. Above 80 - A

    Ask user to enter marks and print the corresponding grade.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int grade = input.nextInt();

        if (grade < 25) {
            System.out.println("F");
        } else if (grade < 45) {
            System.out.println("E");
        } else if (grade < 50) {
            System.out.println("D");
        } else if (grade < 60) {
            System.out.println("C");
        } else if (grade < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        input.close();
    }
}
