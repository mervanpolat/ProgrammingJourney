// Declare a package named JavaDSABootcamp.OOP2.StaticExample
package JavaDSABootcamp.OOP2.StaticExample;

// Define a public class named Human
public class Human {
    // Declare instance variables for age, salary, name, and married status
    int age;
    int salary;
    String name;
    boolean married;

    // Declare a static variable named population to store the total number of Human objects created
    static long population;

    // Define a constructor for the Human class that takes parameters for age, salary, name, and married status
    public Human(int age, int salary, String name, boolean married) {
        // Assign the passed age parameter to the age instance variable
        this.age = age;
        // Assign the passed salary parameter to the salary instance variable
        this.salary = salary;
        // Assign the passed name parameter to the name instance variable
        this.name = name;
        // Assign the passed married parameter to the married instance variable
        this.married = married;

        // Increment the static population variable by 1 each time a new Human object is created
        Human.population += 1;
        // The following line is commented out because it would incorrectly increment an instance variable named population
        // this.population += 1;
    }
}
