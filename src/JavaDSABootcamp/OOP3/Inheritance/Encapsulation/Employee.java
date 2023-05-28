package JavaDSABootcamp.OOP3.Inheritance.Encapsulation;

// Define the public class 'Employee'
public class Employee {

    // Declare a private string variable 'name'. This variable can only be accessed directly within this class.
    // This is a property of the Employee, and we are encapsulating it by making it private.
    private String name;

    // Define a public method 'getName' that returns the Employee's name.
    // This is a "getter" method, which provides read access to the private 'name' field.
    // Other classes can use this method to get the value of 'name'.
    public String getName() {
        return name;
    }

    // Define a public method 'setName' that takes a string parameter 'name' and sets the Employee's name to this value.
    // This is a "setter" method, which provides write access to the private 'name' field.
    // Other classes can use this method to set the value of 'name'.
    public void setName(String name) {
        // The 'this' keyword refers to the current instance of the class.
        // Here, 'this.name' refers to the 'name' field of the current Employee object.
        // 'name' (on the right side of the equals sign) refers to the parameter of the 'setName' method.
        // This line sets the 'name' field of the current Employee object to the value of the 'name' parameter.
        this.name = name;
    }
}
