// This line defines a new package named JavaDSABootcamp.OOP3.Inheritance.Polymorphism.
package JavaDSABootcamp.OOP3.Inheritance.Polymorphism;

// This line defines a public class named Polymorphism.
public class Polymorphism {
    // This line defines the main method, which is the entry point for Java applications.
    public static void main(String[] args) {
        // This line creates a new Animal object and assigns it to the 'myAnimal' reference.
        Animal myAnimal = new Animal();
        // This line calls the 'eat' method on the 'myAnimal' object, which prints "munch" to the console.
        myAnimal.eat(); // Prints munch

        // This line creates a new Dog object and assigns it to the 'myDog' reference.
        Dog myDog = new Dog();
        // This line calls the 'eat' method on the 'myDog' object. Since the Dog class overrides the 'eat' method,
        // it prints "chomp chomp" to the console instead of "munch".
        myDog.eat();    // Prints munch -> Override -> chomp chomp

        // This line creates a new Cat object and assigns it to the 'myCat' reference.
        Cat myCat = new Cat();
        // This line calls the 'eat' method on the 'myCat' object. Since the Cat class overrides the 'eat' method,
        // it prints "naaam!" to the console instead of "munch".
        myCat.eat();    // Prints munch -> Override -> naaam!

        // This line creates a new Dog object and assigns it to the 'myDog2' reference.
        Dog myDog2 = new Dog();
        // This line calls the overloaded 'eat' method on the 'myDog2' object with the parameter 3.
        // This method prints "chomp chomp" to the console 3 times.
        myDog2.eat(3);
        // Prints
        // chomp chomp
        // chomp chomp
        // chomp chomp
    }
}
