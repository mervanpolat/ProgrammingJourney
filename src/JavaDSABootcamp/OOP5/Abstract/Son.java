// Package declaration. In this case, the package is named JavaDSABootcamp.OOP4.Abstract.
package JavaDSABootcamp.OOP5.Abstract;

// Son class declaration. This class extends the abstract class Parent, meaning it inherits all
// non-private properties and methods from Parent.
public class Son extends Parent {

    // This is the constructor for the Son class. It takes an integer parameter 'age'.
    public Son(int age) {
        // super keyword is used to call the constructor of the parent class.
        // Here, it's calling the Parent class's constructor with age.
        super(age);
    }

    // This is the implementation of the normal method from the Parent class.
    @Override
    void normal() {
        // super keyword is used to call the method of the parent class.
        // Here, it's calling the Parent class's normal method.
        super.normal();
    }

    // This is the implementation of the abstract method career() from the Parent class.
    // It takes a String parameter 'name'.
    @Override
    void career(String name) {
        // Prints "I'm going to be a " followed by the value of 'name'.
        System.out.println("I'm going to be a " + name);
    }

    // This is the implementation of the abstract method partner() from the Parent class.
    // It takes a String parameter 'name' and an integer parameter 'age'.
    @Override
    void partner(String name, int age) {
        // Prints "I love " followed by the value of 'name', " she is ", and the value of 'age'.
        System.out.println("I love " + name + " she is " + age);
    }

    // Just like the Daughter class, the Son class is a concrete class that extends the Parent abstract class.
    // It also provides the implementation for the career() and partner() methods that were declared as abstract in the Parent class.
    // Additionally, it overrides the normal() method from the Parent class, but just calls the superclass' implementation with super.normal().
    // The @Override annotation is used to indicate that these methods are intended to override methods in the superclass.
}
