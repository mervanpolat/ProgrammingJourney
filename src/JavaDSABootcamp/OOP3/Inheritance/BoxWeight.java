// Package declaration to organize the classes
package JavaDSABootcamp.OOP3.Inheritance;

// Define a class named BoxWeight that inherits from the Box class
public class BoxWeight extends Box {
    // Declare a double variable named weight to store the weight of the box
    double weight;

    // Define a default constructor for the BoxWeight class
    public BoxWeight() {
        // Set the 'weight' property of the BoxWeight object to -1 as a default value
        this.weight = -1;
    }

    // Define a copy constructor for the BoxWeight class, taking another BoxWeight object as a parameter
    BoxWeight(BoxWeight other) {
        // Call the constructor of the parent class (Box) and pass the 'other' BoxWeight object as a parameter
        // This effectively calls the copy constructor of the Box class, which initializes the new BoxWeight object's
        // length, height, and weight properties with the values from the 'other' BoxWeight object
        super(other);

        // Copy the weight property from the 'other' BoxWeight object to the new BoxWeight object
        weight = other.weight;

        // When you create a new BoxWeight object using this constructor, it will initialize the new object with the
        // same properties as the given BoxWeight object. It does this by calling the copy constructor of the parent
        // class (Box) using the super(other) statement and then copying the weight property from the given BoxWeight object.
    }

    // Constructor for the BoxWeight class with four parameters
    // length, height, and weight are for the Box class (parent class)
    // weight1 is for the BoxWeight class (current class)
    public BoxWeight(double length, double height, double weight, double weight1) {
        // Call the constructor of the parent class (Box) and pass the length, height, and weight parameters
        super(length, height, weight);

        // Set the weight1 parameter as the weight for the BoxWeight class (current class)
        this.weight = weight1;
        // Uncommenting the following line would cause a compilation error because the call to the parent class constructor (super) must be the first statement in the constructor body
        // super(length, height, weight);

        // Now, let's discuss the super keyword used in this code:

        // In Java, the super keyword is used to refer to the immediate parent class. In this code, it is used to
        // call the constructor of the parent class (Box) from the constructor of the child class (BoxWeight).
        // The super() call must always be the first statement in the constructor body.
        // Here's how it is used in the code:
        // super(length, height, weight);
        // This line calls the constructor of the Box class and passes the length, height, and weight parameters to it.
        // The Box class will then use these parameters to initialize its own properties.

        // Q: Why does it have to be the first statement?
        // A: The super() call must be the first statement in the constructor body because the Java language specification enforces this rule to ensure proper object construction and initialization.
    }
}
