// This line defines a new package named JavaDSABootcamp.OOP3.Inheritance.Polymorphism.
package JavaDSABootcamp.OOP3.Inheritance.Polymorphism;

// This line defines a public class named Cat that extends (inherits from) the Animal class.
public class Cat extends Animal {
    // This line declares a private String field named 'litterPreference' in the Cat class.
    private String litterPreference;

    // This line defines a public method named 'getLitterPreference' in the Cat class.
    public String getLitterPreference() {
        // This line returns the value of the 'litterPreference' field.
        return litterPreference;
    }

    // This line defines a public method named 'eat' in the Cat class.
    public void eat() {
        // This line prints "naaam!" to the console.
        System.out.println("naaam!");
    }

    // This line defines a public method named 'setLitterPreference' in the Cat class.
    public void setLitterPreference(String litterPreference) {
        // This line sets the value of the 'litterPreference' field to the value of the 'litterPreference' parameter.
        this.litterPreference = litterPreference;
    }
}
