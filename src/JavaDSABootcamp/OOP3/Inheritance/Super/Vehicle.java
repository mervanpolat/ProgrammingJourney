// Package declaration to organize the classes
package JavaDSABootcamp.OOP3.Inheritance.Super;

// Define a class named Vehicle
public class Vehicle {

    // Default constructor for the Vehicle class, which prints "Vehicle constructed!" when called
    Vehicle(){
        System.out.println("Vehicle constructed!");
    }

    // Declare an integer variable named maxSpeed with a value of 120
    int maxSpeed = 120;

    // Define a public method named vRoom that prints "Vroom Vroom" when called
    public void vRoom() {
        System.out.println("Vroom Vroom");
    }
}

// Define a class named Car that inherits from the Vehicle class
class Car extends Vehicle {

    // Declare an integer variable named maxSpeed with a value of 100, which shadows the maxSpeed variable of the parent class
    int maxSpeed = 100;

    // Override the vRoom method from the Vehicle class
    public void vRoom() {
        // Call the vRoom method of the parent class (Vehicle) using the super keyword, which will print "Vroom Vroom"
        super.vRoom();

        // The following line is commented out, but if uncommented, it would print "SKUURRT"
        // System.out.println("SKUURRT");
    }

    // Define a public method named display that prints the maxSpeed of the parent class (Vehicle) when called
    public void display() {
        // Use the super keyword to access the maxSpeed variable of the parent class (Vehicle) and print its value
        System.out.println(super.maxSpeed);
    }

    // Default constructor for the Car class, which prints "We are in a constructor!" when called
    Car(){
        System.out.println("We are in a constructor!");
    }
}
