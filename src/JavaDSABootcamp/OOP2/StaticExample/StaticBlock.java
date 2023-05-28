// Declare a package named JavaDSABootcamp.OOP2.StaticExample
package JavaDSABootcamp.OOP2.StaticExample;

// Define a public class named StaticBlock
public class StaticBlock {
    // Declare and initialize a static variable 'a' with the value 4
    static int a = 4;
    // Declare a static variable 'b'
    static int b;

    // Define a static block, which runs once when the class is loaded for the first time
    static {
        System.out.println("I am inside a static block.");
        // Initialize the static variable 'b' by multiplying the value of 'a' by 5
        b = a * 5;
    }

    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // The static block is executed when the StaticBlock class is loaded for the first time,
        // initializing the static variables 'a' and 'b'

        // Create a new instance of the StaticBlock class
        StaticBlock object = new StaticBlock();

        // Print the values of static variables 'a' and 'b'
        System.out.println(StaticBlock.a + ", " + StaticBlock.b);

        // Increment the value of static variable 'b' by 3
        StaticBlock.b += 3;
        // Create another instance of the StaticBlock class
        // Note that the static block is not executed again, as it has already been executed when the class was loaded
        StaticBlock objectTwo = new StaticBlock();
        // Print the updated value of static variable 'b'
        System.out.println(StaticBlock.b);  // Prints 23

        // In this code snippet, a class called StaticBlock is defined with two static variables a and b.
        // A static block is also defined, which initializes the value of the b variable by multiplying the value of a by 5.
        // The static block is executed only once when the class is loaded for the first time.
        //
        // Inside the main method, an instance of the StaticBlock class is created, and the values of the static variables a and b are printed.
        // Then, the value of the b variable is incremented by 3, and a second instance of the StaticBlock class is created.
        // Note that the static block is not executed again when the second instance is created, as it has already been executed
        // when the class was loaded. Finally, the updated value of the b variable is printed, which results in the output 23.
    }
}
