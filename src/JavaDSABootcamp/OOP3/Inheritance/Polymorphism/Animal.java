// This line defines a new package named JavaDSABootcamp.OOP3.Inheritance.Polymorphism.
package JavaDSABootcamp.OOP3.Inheritance.Polymorphism;

// This line defines a public class named Animal.
public class Animal {
    // This line declares a private String field named 'name' in the Animal class.
    private String name;
    // This line declares a private String field named 'color' in the Animal class.
    private String color;

    // This line defines a public method named 'eat' in the Animal class.
    public void eat() {
        // This line prints "munch" to the console.
        System.out.println("munch");
    }

    // This line defines a public method named 'getName' in the Animal class.
    public String getName() {
        // This line returns the value of the 'name' field.
        return name;
    }

    // This line defines a public method named 'setName' in the Animal class.
    public void setName(String name) {
        // This line sets the value of the 'name' field to the value of the 'name' parameter.
        this.name = name;
    }
}
