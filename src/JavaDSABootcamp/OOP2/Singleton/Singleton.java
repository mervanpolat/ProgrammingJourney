package JavaDSABootcamp.OOP2.Singleton;

// Define the 'Singleton' class
public class Singleton {

    // This code snippet demonstrates the implementation of the Singleton design pattern in Java.
    // The comments explain each part of the code and the purpose it serves in the Singleton pattern.
    //
    // The Singleton class is defined with a private constructor to prevent other classes from creating instances of it directly.
    // A private static variable instance is declared to store the singleton instance of the Singleton class.
    // A public static method getInstance() is defined to get the singleton instance. It checks if the instance is null,
    // meaning no instance has been created yet. If it is null, a new Singleton object is created and assigned to the instance variable.
    // Then, the singleton instance is returned. The Singleton pattern is useful when you want to ensure that only one instance of a class
    // exists throughout the lifetime of your application, providing a single point of access to the instance.

    // Private constructor to prevent direct instantiation of the class
    private Singleton() {
    }

    // Declare a private static variable 'instance' to store the singleton instance
    private static Singleton instance;

    // Define a public static method 'getInstance()' to get the singleton instance
    public static Singleton getInstance() {
        // Check if the 'instance' is null (i.e., no instance has been created yet)
        if (instance == null) {
            // Create a new 'Singleton' object and assign it to the 'instance' variable
            instance = new Singleton();
        }
        // Return the singleton instance
        return instance;
    }

}
