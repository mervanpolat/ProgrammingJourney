package JavaDSABootcamp.Recursion;

public class Factorial {
    public static void main(String[] args) {
        // print the factorial of 4 by calling the factorial method with argument 4
        System.out.println(factorial(4));
    }

    // recursive method to calculate the factorial of a number
    static int factorial(int n) {
        // base case: the factorial of 1 and 0 is 1, so we return 1
        if (n <= 1) {
            return 1;
        }
        // recursive case: calculate the factorial of (n-1) and multiply it with n
        return n * factorial(n - 1);
    }
}