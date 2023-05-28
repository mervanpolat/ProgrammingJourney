// This line defines a new package named JavaDSABootcamp.OOP3.Inheritance.HierarchicalInheritance.
package JavaDSABootcamp.OOP3.Inheritance.HierarchicalInheritance;

// This line defines a public class named Polymorphism.
public class Main {

    // This line defines a static inner class named Animal.
    static class Animal {
        // This line defines a method named 'eat' in the Animal class.
        void eat() {
            // This line prints "Eating" to the console.
            System.out.println("Eating");
        }
    }

    // This line defines a static inner class named Dog, which extends (inherits from) the Animal class.
    static class Dog extends Animal {
        // This line defines a method named 'bark' in the Dog class.
        void bark() {
            // This line prints "Barking" to the console.
            System.out.println("Barking");
        }
    }

    // This line defines a static inner class named Cat, which extends (inherits from) the Animal class.
    static class Cat extends Animal {
        // This line defines a method named 'Meow' in the Cat class.
        void Meow() {
            // This line prints "Meowing" to the console.
            System.out.println("Meowing");
        }
    }

    // This line defines the main method, which is the entry point of the Java application.
    public static void main(String[] args) {

        // This line creates a new Cat object.
        Cat c = new Cat();
        // This line calls the 'Meow' method on the Cat object, printing "Meowing" to the console.
        c.Meow();
        // This line calls the 'eat' method (inherited from the Animal class) on the Cat object, printing "Eating" to the console.
        c.eat();

        // This line creates a new Dog object.
        Dog d = new Dog();
        // This line calls the 'bark' method on the Dog object, printing "Barking" to the console.
        d.bark();
        // This line calls the 'eat' method (inherited from the Animal class) on the Dog object, printing "Eating" to the console.
        d.eat();

        // This line creates a new Animal object.
        Animal a = new Animal();
        // This line calls the 'eat' method on the Animal object, printing "Eating" to the console.
        a.eat();
    }
}
