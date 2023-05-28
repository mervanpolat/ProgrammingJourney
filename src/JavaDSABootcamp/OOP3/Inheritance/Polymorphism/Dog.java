// This line defines a new package named JavaDSABootcamp.OOP3.Inheritance.Polymorphism.
package JavaDSABootcamp.OOP3.Inheritance.Polymorphism;

// This line defines a public class named Dog that extends (inherits from) the Animal class.
public class Dog extends Animal {
    // This line declares a private int field named 'breed' in the Dog class.
    private int breed;

    // This line defines a public method named 'getBreed' in the Dog class.
    public int getBreed() {
        // This line returns the value of the 'breed' field.
        return breed;
    }

    // This line defines a public method named 'eat' in the Dog class.
    // This method overrides the 'eat' method from the parent 'Animal' class.
    public void eat() {
        // This line prints "chomp chomp" to the console.
        System.out.println("chomp chomp");
    }

    // This line defines a public method named 'eat' in the Dog class with an int parameter 'numberOfTimes'.
    // This is an example of method overloading, as it has the same method name but a different signature than the previous 'eat' method.
    public void eat(int numberOfTimes) {
        // This for loop iterates from 0 to 'numberOfTimes' (exclusive).
        for (int i = 0; i < numberOfTimes; i++) {
            // This line prints "chomp chomp" to the console for each iteration of the loop.
            System.out.println("chomp chomp");
        }
    }

    // This line defines a public method named 'setBreed' in the Dog class.
    public void setBreed(int breed) {
        // This line sets the value of the 'breed' field to the value of the 'breed' parameter.
        this.breed = breed;
    }
}
