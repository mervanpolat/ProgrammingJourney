// Package declaration to organize the classes
package JavaDSABootcamp.OOP3.Inheritance.Super;

// Define a class named Polymorphism
class Main {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // Create a new Car object named 'c'
        // This will call the Car constructor, which in turn calls the Vehicle constructor
        // Output: Vehicle constructed!
        // Output: We are in a constructor!
        Car c = new Car();

        // Call the display() method of the Car object 'c', which prints the maxSpeed of the Vehicle class
        // Output: 120
        c.display();

        // Call the vRoom() method of the Car object 'c', which calls the vRoom() method of the Vehicle class
        // Output: Vroom Vroom
        c.vRoom();

        // The following two lines are commented out and describe the behavior of the vRoom() method before and after adding super.vRoom();

        // Call the vRoom() method of the Car object 'c' before adding super.vRoom() in the Car class
        // This would print "SKUURRT" if the Car class's vRoom() method didn't call super.vRoom()
        // c.vRoom(); // Prints SKUURRT -> Before adding super.vRoom();

        // Call the vRoom() method of the Car object 'c' after adding super.vRoom() in the Car class
        // This would print "Vroom Vroom" because the Car class's vRoom() method now calls super.vRoom()
        // c.vRoom(); // Prints Vroom Vroom -> After adding super.vRoom();
    }
}
