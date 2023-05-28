package JavaDSABootcamp.OOP1;

// Define a class named PassByValue
public class PassByValue {
    // Define the main method to be executed when the program runs
    public static void main(String[] args) {
        // Declare an int variable 'a' and assign it the value of 10
        int a = 10;
        // Declare an int variable 'b' and assign it the value of 43
        int b = 43;

        // Declare an Integer object 'num' and assign it the value of 54
        // This is an example of autoboxing, where a primitive int value (54) is automatically
        // converted to an object of the corresponding wrapper class (Integer)
        Integer num = 54;

        // Call the swap method with 'a' and 'b' as arguments
        swap(a, b);

        System.out.println(a);  // Prints 10
        System.out.println(b);  // Prints 43
    }

    // Define a static method named 'swap' that takes two int parameters 'a' and 'b'
    static void swap(int a, int b) {
        // Declare a temporary int variable 'temp' and assign it the value of 'a'
        int temp = a;
        // Assign the value of 'b' to 'a'
        a = b;
        // Assign the value of 'temp' (which holds the original value of 'a') to 'b'
        b = temp;
        // Print the values of 'a' and 'b' after swapping
        System.out.println(a);
        System.out.println(b);

        // This Java program demonstrates a basic variable swapping technique in addition to the previous wrapper class example.
        // Two integer variables a and b are declared and initialized with values 10 and 43, respectively.
        // The swap() method is then called with a and b as arguments to swap their values.
        //
        // The swap() method takes two integer parameters, a and b, and performs a value swap between them using a
        // temporary variable temp. The method then prints the swapped values of a and b. Note that the swap occurs
        // only within the scope of the swap() method, so the original values of a and b in the main() method remain unchanged.
    }
}
