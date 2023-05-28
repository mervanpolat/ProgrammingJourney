// Package declaration. In this case, the package is named JavaDSABootcamp.OOP4.Abstract.
package JavaDSABootcamp.OOP5.Abstract;

// Daughter class declaration. This class extends the abstract class Parent,
// meaning it inherits all non-private properties and methods from Parent.
public class Daughter extends Parent{

    // This is the constructor for the Daughter class.
    // It takes an integer parameter 'age'.
    public Daughter(int age) {
        // super keyword is used to call the constructor of the parent class.
        // Here, it's calling the Parent class's constructor with age.
        super(age);
    }

    // This is the implementation of the abstract method career() from the Parent class.
    // It takes a String parameter 'name'.
    @Override
    void career(String name) {
        // Prints "My name is " followed by the value of 'name'.
        System.out.println("My name is " + name);
    }

    // This is the implementation of the abstract method partner() from the Parent class.
    // It takes a String parameter 'name' and an integer parameter 'age'.
    @Override
    void partner(String name, int age) {
        // Prints "I love " followed by the value of 'name', " he is ", and the value of 'age'.
        System.out.println("I love " + name + " he is " + age);
    }
}

