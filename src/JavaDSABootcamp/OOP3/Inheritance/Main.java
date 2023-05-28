package JavaDSABootcamp.OOP3.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a default Box object using the no-argument constructor
        Box box = new Box();
        // Print the default values of length, height, and weight
        System.out.println(box.length + " " + box.height + " " + box.weight);       // Prints -1.0 -1.0 -1.0

        // Create a Box object with all sides equal to 4
        Box box2 = new Box(4);
        // Print the values of height, weight, and length (all equal to 4.0)
        System.out.println(box2.height + " " + box2.weight + " " + box2.length);    // Prints 4.0 4.0 4.0

        // Create a default BoxWeight object using the no-argument constructor
        BoxWeight box3 = new BoxWeight();
        // Print the default value of the weight (inherited from Box)
        System.out.println(box3.weight);    // Prints -1.0

        // Create a BoxWeight object with custom dimensions and weight
        BoxWeight box4 = new BoxWeight(1,2,3,4);

        // Create a BoxWeight object and assign it to a Box reference
        Box box5 = new BoxWeight(2,3,4,8);
        // Print the height (inherited from Box)
        System.out.println(box5.height);    // Prints 3.0
        // Print the weight (inherited from Box)
        System.out.println(box5.weight);    // Prints 4.0

        // The code below is incorrect because it attempts to create
        // a Box object and assign it to a BoxWeight reference.
        // This is not allowed because the Box class is the parent class
        // and does not have access to the child class (BoxWeight) properties.
        // BoxWeight box6 = new Box(2,3,8);    // Uncommenting this statement will give a compilation error
        // System.out.println(box6.weight);    // Uncommenting this statement will give a compilation error

        //Q: Can you tell me why the line 34 will result to error?
        //A: Certainly! The line BoxWeight box6 = new Box(2,3,8); will result in a compilation error
        //   because it attempts to create a Box object and assign it to a BoxWeight reference.
        //   Box is the parent class, and BoxWeight is the child class.
        //   In Java, you can assign an object of a child class to a reference of a parent class (upcasting),
        //   but you cannot assign an object of a parent class to a reference of a child class (downcasting) without an explicit type cast.
        //   In this case, you're trying to assign a Box object (parent class) to a BoxWeight reference (child class),
        //   which is not allowed without an explicit type cast. However, even with an explicit type cast, it will lead to a runtime error (ClassCastException)
        //   because the actual object is still a Box and does not have the additional properties that BoxWeight has.
        //   To fix the error, you can either change the reference type to Box:
        //
        //   Box box6 = new Box(2,3,8);
        //   Or, create a BoxWeight object instead:
        //   BoxWeight box6 = new BoxWeight(2,3,8,5); // Assuming the last argument is the weight

        BoxPrice boxNew = new BoxPrice();

    }
}
