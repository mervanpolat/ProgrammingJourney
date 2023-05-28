package JavaDSABootcamp.MathDSA;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        //Q: Find the square of a number!
        int n = 40;
        //How many number of decimals do I want?
        int p = 3;

        System.out.println(sqrt(n,p));
        //Prints 6.3239999999999945
        System.out.println(sqrt(50, 3));
        //Print 7.07099999999999
        System.out.println(sqrt(25, 3));
        //Prints 5
    }

    static double sqrt(int n, int p) {
        //Binary Search
        int start = 0;
        int end = n;

        double root = 0.0;

        while (start<=end) {
            int mid = start + ((end-start) / 2);

            if (mid*mid == n) {
                root = mid;
                return root;
            }
            if (mid*mid < n) {
                start = mid + 1;
            }
            if (mid*mid > n) {
                end = mid - 1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            //While loop will only break when root*root > n
            while (root*root <= n) {
                root+= increment;
            }
            //Ref. line 35 -> That's why we have to subtract from root - increment in order to go one step back
            root -= increment;
            //We want to have it in 3 decimal points that's why we divide increment every time by 10 while i<p
            //If i is no longer less than p, then the for loop will break and root will be returned!
            increment /= 10;
        }
        //returns root
        return root;
    }
}
