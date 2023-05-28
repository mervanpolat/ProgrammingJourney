// This line defines a new package (a group of related classes) named JavaDSABootcamp.OOP3.Inheritance.SingleInheritance.
package JavaDSABootcamp.OOP3.Inheritance.SingleInheritance;

// This line defines a new class called Parent.
class Parent {

    // This line defines a method named 'bike' that takes no arguments and returns no value (void).
    void bike() {

        // This line prints the string "Hello!" to the console when the method is called.
        System.out.println("Hello!");
    }
}

// This line defines a new class called Child, which extends (inherits from) the Parent class.
class Child extends Parent {

    // This line defines a method named 'cycle' that takes no arguments and returns no value (void).
    void cycle() {

        // This line prints the string "Mervan!" to the console when the method is called.
        System.out.println("Mervan!");
    }
}

// This line defines a public class named Inheritance, which is where the main method resides.
public class Inheritance {

    // This line defines the main method, the entry point of the program. It takes an array of strings as an argument.
    public static void main(String[] args) {

        // This line creates a new instance of the Child class and assigns it to a variable named 'child'.
        Child child = new Child();

        // This line calls the 'bike' method from the Parent class on the 'child' object, which prints "Hello!".
        child.bike();

        // This line calls the 'cycle' method from the Child class on the 'child' object, which prints "Mervan!".
        child.cycle();

        //  Single Inheritance: Single inheritance is a concept in object-oriented programming where a class (Child)
        // inherits properties and methods from only one parent class (Parent). In your code, the Child class extends
        // the Parent class, meaning it inherits the bike() method from the Parent class. This allows the Child class
        // to access the bike() method, even though it's defined in the Parent class. In Java, single inheritance
        // is the only form of inheritance supported between classes (multiple inheritance is not allowed).
        // However, Java supports multiple inheritance through interfaces.
    }
}
