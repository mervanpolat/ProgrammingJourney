package JavaDSABootcamp.OOP1;

// Define a class named finalKeyword
public class finalKeyword {
    // Define the main method to be executed when the program runs
    public static void main(String[] args) {
        // Declare a final int variable named INCREASE and assign it the value of 3
        // Final variables cannot be changed once they are assigned a value
        final int INCREASE = 3;
        // INCREASE = 5; // Uncommenting this line would cause an error, as you cannot reassign a value to a final variable

        // Create a new A object named mervan, which is a final variable
        // Final object references cannot be reassigned to another object
        final A mervan = new A("Kunal");
        // Changing the name of the mervan object is allowed, as the object's fields are not final
        mervan.name = "Mero";
        // mervan = new A("Bedirhan"); // Uncommenting this line would cause an error, as you cannot reassign a final variable

        A object;
        for (int i = 0; i < 10000000; i++) {
            object = new A("Random name");
        }
    }

    // Define a static nested class named A
    static class A {
        // Uncommenting the following line would cause an error, as final variables must be initialized
        // final int num;  // Variable 'num' might not have been initialized
        // Declare a final int variable named num and assign it the value of 43
        // Final variables cannot be changed once they are assigned a value
        final int num = 43;
        // Declare a non-final String variable named name
        String name;

        // Define a constructor for the A class that takes a String parameter called name
        public A(String name) {
            // Set the value of the instance variable 'name' to the value of the parameter 'name'
            this.name = name;
        }

        @Override
        // The finalize() method is a special method in Java that is part of the Object class
        // (which every class implicitly extends). This method is called by the garbage collector
        // just before an object is removed from memory. It gives the object a chance to clean up
        // any resources it has allocated, such as closing file handles or network connections.
        protected void finalize() throws Throwable {
            // Call the finalize() method of the superclass (Object class)
            // This ensures that any cleanup code in the superclass is also executed
            super.finalize();
            System.out.println("Object is destroyed.");
        }
    }
}
