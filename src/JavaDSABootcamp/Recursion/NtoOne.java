package JavaDSABootcamp.Recursion;
public class NtoOne {

    public static void main(String[] args) {
        // Call the fun function with an input value of 5, which prints the numbers from 5 to 1
        fun(5);
        // Output: 5 4 3 2 1

        System.out.println();

        // Call the funReverse function with an input value of 5, which prints the numbers from 1 to 5
        funReverse(5);
        // Output: 1 2 3 4 5

        System.out.println();

        // Call the funBoth function with an input value of 5, which prints the numbers from 5 to 1 and then from 1 to 5
        funBoth(5);
        // Output: 5 4 3 2 1 1 2 3 4 5
    }

    // Define a recursive function to print the numbers from n to 1
    static void fun(int n) {
        // Base case: if the input value is 0, exit the function
        if (n==0) {
            return;
        }

        // Print the current value of n
        System.out.print(n + " ");

        // Recursively call the function with n-1, effectively printing the remaining numbers
        fun(n - 1);
    }

    // Define a recursive function to print the numbers from 1 to n
    static void funReverse(int n) {
        // Base case: if the input value is 0, exit the function
        if (n==0) {
            return;
        }

        // Recursively call the function with n-1, effectively printing the first n-1 numbers
        funReverse(n - 1);

        // Print the current value of n
        System.out.print(n + " ");
    }

    // Define a recursive function to print the numbers from n to 1 and then from 1 to n
    static void funBoth(int n) {
        // Base case: if the input value is 0, exit the function
        if (n==0) {
            return;
        }

        // Print the current value of n
        System.out.print(n + " ");

        // Recursively call the function with n-1, effectively printing the remaining numbers from n to 1
        funBoth(n - 1);

        // Print the current value of n again, effectively printing the numbers from 1 to n
        System.out.print(n + " ");
    }
}