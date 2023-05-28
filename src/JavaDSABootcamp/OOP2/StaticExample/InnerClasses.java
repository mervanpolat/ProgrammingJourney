package JavaDSABootcamp.OOP2.StaticExample;

import java.util.Arrays;

// Outside classes can't be declared as 'static', only inner classes.
public class InnerClasses {
    /**
     * <b>Why can't we use 'static' as outer class?</b>
     * <p></p>
     * In Java, you cannot declare a top-level (outer) class as static. The static keyword is not allowed for top-level classes
     * because every top-level class is already associated with the class itself rather than instances of the class.
     * In other words, a top-level class already behaves like a static entity in the sense that you don't need an instance of the class to access its static members.
     * <p></p>
     * However, you can declare a static nested class (also known as a static inner class) within another class.
     * A static nested class is a class that is defined within another class and has the static modifier.
     * This means that the nested class does not have access to the instance variables and methods of the enclosing class and
     * can be used independently of an instance of the outer class.
     * A static nested class can access the static members of the outer class, and you don't need an instance of the
     * outer class to create an object of the static nested class.
     */

    //Before declaring 'Test' class as 'static' it wasn't possible create objects from psvm.
    //We get an error message like -> Error: Prints 'JavaDSABootcamp.OOP2.StaticExample.InnerClasses.this' cannot be referenced from a static context
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test personOne = new Test("Mervan");      // Error: Prints 'JavaDSABootcamp.OOP2.StaticExample.InnerClasses.this' cannot be referenced from a static context
        Test personTwo = new Test("Bedirhan");    // Error: Prints 'JavaDSABootcamp.OOP2.StaticExample.InnerClasses.this' cannot be referenced from a static context

        //Class.method.parameter.value;
        Arrays.toString(new int[]{3,4,5});
        // In the above statement, `Arrays.toString(new int[]{3,4,5});`, we are using a utility method from the `Arrays` class
        // in Java to convert an array of integers to a string representation.
        // Let's break down this statement into its components and provide an explanation for each part:

        //1. `new int[]{3,4,5}`: This is an array literal that creates a new array of integers with three elements: 3, 4, and 5.
        //2. `Arrays`: This is a reference to the `java.util.Arrays` class, which is a utility class in Java that provides various methods to manipulate arrays,
        //    such as sorting, searching, and converting them to strings. The `Arrays` class is part of the Java standard library and is part of the `java.util` package.
        //3. `Arrays.toString(...)`: The `toString()` method is a static method of the `Arrays` class that takes an array as an argument and returns a string representation of the array.
        //    This method is particularly useful for printing or logging the contents of an array in a human-readable format. In this case, it takes the integer array `new int[]{3,4,5}`
        //    as an argument and returns the string "[3, 4, 5]".

        // When discussing object-oriented programming (OOP), this statement is not a perfect example, as it involves a static utility method
        // rather than an instance method. However, it does demonstrate the use of a utility class (`Arrays`) that is part of the Java standard library,
        // and it shows how to use a static method (`toString()`) from that class to perform a specific operation on an array.

        System.out.println(personOne.name); // Prints Mervan
        System.out.println(personTwo.name); // Prints Bedirhan
    }

}
