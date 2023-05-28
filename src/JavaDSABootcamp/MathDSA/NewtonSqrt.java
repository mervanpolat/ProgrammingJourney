package JavaDSABootcamp.MathDSA;

public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.println(sqrtNewton(40));
        //Prints 6.325023209103984
    }

    static double sqrtNewton(double n){
        // Initialize x as n
        double x = n;
        double root;

        // Iterate until the condition is met
        while (true) {
            // Calculate root using the formula
            root = 0.5 * (x + (n / x));

            // If the difference between the previous x and the new root is less than 0.5, break the loop
            if (Math.abs(root - x) < 0.5) {
                break;
            }

            // Update the value of x to the new root
            x = root;
        }

        // Return the root value
        return root;
    }
}