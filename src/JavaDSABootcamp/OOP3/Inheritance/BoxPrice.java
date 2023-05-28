// This line defines a new package (a group of related classes) named JavaDSABootcamp.OOP3.Inheritance.
package JavaDSABootcamp.OOP3.Inheritance;

// This line defines a public class named BoxPrice, which extends (inherits from) the BoxWeight class.
public class BoxPrice extends BoxWeight {

    // This line declares an instance variable named 'cost' of type double.
    double cost;

    // This line defines a no-argument constructor for the BoxPrice class.
    BoxPrice() {

        // This line calls the no-argument constructor of the parent (BoxWeight) class using 'super()'.
        super();

        // This line assigns the value -1 to the 'cost' instance variable of the current object.
        this.cost = -1;
    }

    // This line defines a constructor for the BoxPrice class that takes a BoxPrice object as an argument.
    BoxPrice(BoxPrice other) {

        // This line calls the copy constructor of the parent (BoxWeight) class using 'super(other)'.
        super(other);

        // This line assigns the 'cost' value of the 'other' object to the 'cost' instance variable of the current object.
        this.cost = other.cost;
    }

    // This line defines a constructor for the BoxPrice class that takes five double arguments.
    public BoxPrice(double length, double height, double weight, double weight1, double cost) {

        // This line calls the constructor of the parent (BoxWeight) class with four double arguments using 'super(length, height, weight, weight1)'.
        super(length, height, weight, weight1);

        // This line assigns the value of the 'cost' argument to the 'cost' instance variable of the current object.
        this.cost = cost;
    }
}
