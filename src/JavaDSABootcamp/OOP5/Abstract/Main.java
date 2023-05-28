// Package declaration. In this case, the package is named JavaDSABootcamp.OOP4.Abstract.
package JavaDSABootcamp.OOP5.Abstract;

// Class declaration, named Main.
public class Main {

    // Main method, the entry point to any Java application.
    public static void main(String[] args) {

        // Creates an object of the Son class, which is a subclass of the Parent class.
        // The object is initialized with an age of 65.
        Son son = new Son(65);

        // Print the age of the son object. It will print 65.
        System.out.println(son.age);

        // Call the career method of the son object, passing in "Doctor".
        // This will print "I'm going to be a Doctor".
        son.career("Doctor");

        // Creates an object of the Daughter class, another subclass of the Parent class.
        // The object is initialized with an age of 28.
        Daughter daughter = new Daughter(28);

        // Print the age of the daughter object. It will print 28.
        System.out.println(daughter.age);

        // Call the career method of the daughter object, passing in "Eleonora".
        // This will print "My name is Eleonora".
        daughter.career("Eleonora");

        // Call the partner method of the daughter object, passing in "Mervan" and 24.
        // This will print "I love Mervan he is 24".
        daughter.partner("Mervan", 24);

        // Call the static method hello() from the Parent class.
        // This will print "Hello!".
        Parent.hello();

        // Call the normal method of the son object.
        // This will print "This is a normal method!".
        son.normal();

        // The following lines are commented out because they would cause errors if they were executed.
        // Abstract classes cannot be instantiated, meaning you can't create an object of type Parent.
        // The same goes for creating an anonymous subclass of Parent with the `new Parent() {}` syntax.
        // You also can't declare static methods as abstract, because abstract methods must be overridden by subclasses, and static methods can't be overridden in the same way instance methods can.
    }
}
