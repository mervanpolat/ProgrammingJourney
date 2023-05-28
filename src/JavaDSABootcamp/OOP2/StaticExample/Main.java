package JavaDSABootcamp.OOP2.StaticExample;

public class Main {
    // Define the main method, which is the entry point of the program
    public static void main(String[] args) {
        // In this code snippet, the main method is the entry point of the program. Two Human objects named mervan
        // and bedirhan are created with the specified parameters (age, salary, name, and married status).
        // The properties of these objects are then printed to the console.
        //
        // The commented-out lines with mervan.population and bedirhan.population would print incorrect results because
        // the population variable is static and should be accessed using the class name, not an instance of the class.
        // The correct way to access the static population variable is shown in the line System.out.println(Human.population);,
        // which prints the total number of Human objects created.
        //
        // The last commented-out line attempts to call a non-static method directly from a static context, which is not allowed.
        // This would result in a compile-time error.

        // Create a new Human object named mervan with the specified parameters
        Human mervan = new Human(24, 34000, "Mervan", false);
        // Create a new Human object named bedirhan with the specified parameters
        Human bedirhan = new Human(29, 40000, "Bedirhan", true);

        // Print the salary property of the mervan object
        System.out.println(mervan.salary);  // Prints 34000
        // Print the married property of the bedirhan object
        System.out.println(bedirhan.married);   // Prints true
        // Print the age property of the mervan object
        System.out.println(mervan.age); // Prints 24

        // The following lines are commented out because they would print incorrect results
        // System.out.println(mervan.population);      // Prints 1
        // System.out.println(bedirhan.population);    // Prints 1

        // Print the static population property of the Human class
        System.out.println(Human.population);         // Prints 2

        // This line is commented out because a non-static method cannot be called directly from a static context
        // greeting(); // Error: Non-static method 'greeting()' cannot be referenced from a static context

        // Create a new instance of the Polymorphism class and assign it to the variable 'fun'
        Main fun = new Main();

        // Call the non-static (instance) method 'greeting2()' on the 'fun' instance of the Polymorphism class
        // This will in turn call the 'greeting()' method inside 'greeting2()' and print "Hello World!"
        fun.greeting2();    // Prints "Hello World!"
    }

    // Define a static method named fun()
    static void fun() {
        // The following line is commented out because a non-static method cannot be called directly from a static context
        // greeting(); // Error: Non-static method 'greeting()' cannot be referenced from a static context

        // Create an instance of the Polymorphism class
        Main obj = new Main();
        // Call the non-static method greeting() on the instance of the Polymorphism class
        obj.greeting();
    }

    void greeting2(){
        greeting();
    }

    // Define a non-static (instance) method named greeting()
    void greeting() {
        // Print "Hello World!" to the console
        System.out.println("Hello World!");

        // When you create an instance of the Polymorphism class (using Polymorphism obj = new Polymorphism();), you can call the non-static
        // method greeting() on that instance (using obj.greeting();). This is allowed because non-static methods
        // can be called on instances of the class. Remember that non-static methods belong to instances (objects)
        // of a class and not to the class itself, so you need an instance to call them. Static methods, on the other hand,
        // belong to the class itself and can be called directly without the need for creating an instance.
    }
}
