package JavaDSABootcamp.SelfStudy;

import java.util.Scanner;

public class ClassAttendanceCalc {
    public static void main(String[] args) {
        /*
            A student will not be allowed to sit in exam if his/her attendance is less than 75%.
            Take following input from use:

         1. Number of classes held
         2. Number of classes attended.
         3. And print percentage of class attended
         4. Whether a student is allowed to sit in exam or not.
        */

        //Modify the above question to allow student to sit if s/he has a medical cause.
        //Ask the user if s/he has a medical cause or not (true/false) and print accordingly.

        //User ArrayOfPrimitives
        Scanner input = new Scanner(System.in);

        //Enter the max number of attendance possible
        System.out.print("Enter held classes: ");
        int classesHeld = input.nextInt();

        //Enter how many times you've attended
        System.out.print("Enter number of classes attended: ");
        int noClasses = input.nextInt();

        //Enter whether you have a medical cause
        System.out.println("Do you have medical cause? (true/false)");
        boolean medicalCause = input.nextBoolean();

        //Calculating the percentage of attendance
        int attendance = (noClasses * 100) / classesHeld;

        //Printing as percentage
        System.out.println(attendance+"%");

        //If my total attendance is below 75% and I don't have a medical cause, then I'm not able to sit in the exam.
        if (attendance < 75 && !medicalCause) {
            System.out.println("You are not allowed to sit in the exam!");

            //If my total attendance is below 75% and I do have a medical cause, then I'm able to sit in the exam.
        } else if (attendance < 75 && medicalCause){
            System.out.println("You are allowed to sit in the exam because you have a medical cause!");

            //If my attendance is greater than 75% and I don't have a medical cause, then I'm able to sit in the exam.
        } else {
            System.out.println("You are allowed to sit in the exam!");
        }

        //Close Scanner
        input.close();
    }
}

//prints

//Enter held classes: 15
//Enter number of classes attended: 14
//Do you have medical cause? (true/false)
//false
//93%
//You are allowed to sit in the exam!