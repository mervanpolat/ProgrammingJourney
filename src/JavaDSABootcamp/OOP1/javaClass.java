package JavaDSABootcamp.OOP1;

// Define a class named javaClass
public class javaClass {
    /**
     * <b>What is a class?</b>
     * <p></p>
     * In Java, a class is a blueprint for creating objects, which are instances of the class.
     * It is a fundamental building block of object-oriented programming (OOP) and encapsulates data (attributes) and behavior (methods) for objects. Classes provide a structure to organize and manage code, making it more modular, reusable, and maintainable.
     * <p></p>
     * For example, consider an application for managing a library. You might have classes representing books,
     * authors, and library patrons. Each class would have attributes (e.g., title, author, due date) and methods
     * (e.g., check out a book, return a book) that define their behavior. By using classes, you can create a clean,
     * organized structure for your code, making it easier to develop and maintain the application.
     */

    // Define the main method to be executed when the program runs
    public static void main(String[] args) {
        // This Java program demonstrates the basic concept of a class and object. A Student class is defined as a
        // static nested class inside the javaClass class. The Student class has three attributes: rollNo, name, and marks.
        //
        // In the main method, a Student array of length 5 is created. A new Student object named mervan is then created,
        // and its attributes are set with values 19, "Mervan Polat", and 19.19. The values of mervan's attributes are
        // printed to the console.

        // Create an array of Student objects with a length of 5
        Student[] students = new Student[5];

        // Create a new Student object named "mervan"
        Student mervan = new Student();
        // Set the rollNo attribute of the "mervan" object to 19
        mervan.rollNo = 19;
        // Set the name attribute of the "mervan" object to "Mervan Polat"
        mervan.name = "Mervan Polat";
        // Set the marks attribute of the "mervan" object to 19.19
        mervan.marks = 19.19;

        // Print the rollNo attribute of the "mervan" object (should be 19)
        System.out.println(mervan.rollNo);
        // Print the name attribute of the "mervan" object (should be "Mervan Polat")
        System.out.println(mervan.name);
        // Print the marks attribute of the "mervan" object (should be 19.19)
        System.out.println(mervan.marks);
    }

    // Define a static nested class named Student
    static class Student {
        // Declare instance variables (attributes) of the Student class
        int rollNo;
        String name;
        double marks;
        // If you assign a specific number (e.g., double marks = 90), then the assigned number will have the same value for all reference variables
    }
}
