package JavaDSABootcamp.SelfStudy;
import java.util.Scanner;

public class FindRevOfANumber {
    public static void main(String[] args) {
        // Finding reverse of a number -> 3 Ways

        //Asking for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        //Storing user input in a variable of type int
        int num = input.nextInt();

        //storing the last digit of the num in variable called "rev"
        int rev = 0;

        //repeat this process while num is not 0!
        while (num!=0) {
            /*
            rev * 10 means that when I have the remainder of the num through n%10, I store it in my
            variable called rev. rev * 10 avoids being numbers summed up as ones but as tens!
            This prevents false calculations. This logic is repeated while num is not 0.

            Example:
            n = 785

            0 = 0*10 + 5 -> 5
            5 = 5*10 + 8 -> 58
            58 = 58*10 + 7 -> 587
            */

            rev = rev * 10 + num%10;

            //Here we divide num by 10 so that the last digit is eliminated. The reason why it's eliminated is that
            //datatype int can't store decimal numbers.
            num = num/10;

            // 785/10 -> 78/10 -> 7/10 -> 0
        }

        //Output
        System.out.println(rev);
    }
}
