package JavaDSABootcamp.OOP5.Abstract;

// Declare a public abstract class named Parent
public abstract class Parent {
    // Abstract classes are those classes which cannot be instantiated.
    // They are created to be extended by other classes.

    // declare a static integer variable named age
    static int age;
    // Static variables are class variables that are shared among all objects of a class.

    // declare a final integer variable named VALUE
    final int VALUE;
    // Final variables are constants. Once assigned, their value cannot be changed.

    // This is the constructor for the Parent class
    public Parent(int age) {
        // The constructor is a special method used to initialize objects.
        // It is called when an object of a class is created.

        // this keyword refers to the current object in a method or constructor
        // Here, we are setting the age of the Parent object to the age passed in the constructor
        this.age = age;

        // We are initializing the final variable VALUE
        // As it's final, once it's assigned, it cannot be changed
        VALUE = 3243433;
    }

    // static method named hello
    static void hello(){
        // Static methods belong to the class instead of the instance of a class.
        // They can be called without creating an instance of the class.

        // print "Hello!" to the console
        System.out.println("Hello!");
    }

    // normal instance method named normal
    void normal(){
        // Instance methods belong to the instance of a class.
        // They can access instance data and methods, as well as static data and methods.

        // print "This is a normal method!" to the console
        System.out.println("This is a normal method!");
    }

    // declare an abstract method named career
    abstract void career(String name);
    // Abstract methods are those methods which are declared but not implemented.
    // The implementation of these methods is done in the subclass.

    // declare another abstract method named partner
    abstract void partner(String name, int age);
    // The subclasses of this abstract class must provide implementations for these abstract methods.
}
