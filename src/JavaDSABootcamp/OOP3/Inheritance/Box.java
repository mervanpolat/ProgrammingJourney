// Package declaration to organize the classes
package JavaDSABootcamp.OOP3.Inheritance;

// Define a class named Box
public class Box {
    // Declare three double variables: length, height, and weight to store the dimensions of the box
    double length;
    double height;
    double weight;

    // Default constructor for the Box class, initializes all dimensions to -1
    Box(){
        this.height = -1;
        this.weight = -1;
        this.length = -1;
    }

    // Constructor for the Box class with one parameter 'side', initializes all dimensions to the value of 'side'
    Box(double side){
        this.height = side;
        this.weight = side;
        this.length = side;
    }

    // Constructor for the Box class with three parameters: length, height, and weight
    Box(double length, double height, double weight) {
        // Print a message to indicate that the Box class constructor is being executed
        System.out.println("Box class constructor");

        // Use the 'this' keyword to assign the passed parameters to the corresponding instance variables of the object
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    // Copy constructor for the Box class, takes another Box object 'old' as a parameter
    Box(Box old) {
        // Use the 'this' keyword to assign the dimensions from the 'old' Box object to the corresponding instance variables of the new object
        this.height = old.height;
        this.weight = old.weight;
        this.length = old.length;
    }

    // Define a public method named information that prints "Running the box!" when called
    public void information(){
        System.out.println("Running the box!");
    }
}
