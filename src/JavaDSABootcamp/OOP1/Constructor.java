// Import required package(s)
package JavaDSABootcamp.OOP1;

// Define the main class Constructor
public class Constructor {

    /**
     * This is a simple Java program that demonstrates the concepts of object-oriented programming using constructors
     * and methods. The program defines a Student class with a few properties (roll number, name, and marks)
     * and methods to print greeting messages and change the student's name. The main class, Constructor,
     * creates two student objects, one using the default constructor and another using the parameterized constructor,
     * and demonstrates the use of the student class
     */

    // Define the main method to be executed when the program runs
    public static void main(String[] args) {
        // Create a new Student object named "mervan" using the default constructor
        Student mervan = new Student();
        // Print the marks of the "mervan" object (should be 89.54)
        System.out.println(mervan.marks);
        // Print the name of the "mervan" object (should be Mervan Polat)
        System.out.println(mervan.name);
        // Print the rollNo of the "mervan" object (should be 19)
        System.out.println(mervan.rollNo);

        // Call the greeting() method of the "mervan" object (prints "Hello! My name is Mervan Polat")
        mervan.greeting();
        // Call the greeting2() method of the "mervan" object (also prints "Hello! My name is Mervan Polat")
        mervan.greeting2();
        // Call the changeName() method of the "mervan" object to change the name to "Bedirhan Polat"
        mervan.changeName("Bedirhan Polat");
        // Print the updated name of the "mervan" object (should be Bedirhan Polat)
        System.out.println(mervan.name);

        // Create a new Student object named "bedirhanPolat" using the parameterized constructor
        Student bedirhanPolat = new Student(29, "Bedirhan Polat", 54.43);
        // Print the rollNo of the "bedirhanPolat" object (should be 29)
        System.out.println(bedirhanPolat.rollNo);

        Student random = new Student(mervan);
        System.out.println(random.name);    // Prints Bedirhan Polat

        Student one = new Student();
        Student two = new Student();

        one.name = "Rahul Kushwaha";
        two = one;
        System.out.println(two.name);   //Prints Rahul Kushwaha
    }

    // Define the static nested class Student
    static class Student {
        // Declare instance variables (properties) of the Student class
        int rollNo;
        String name;
        double marks;

        // Define the greeting() method that prints a greeting message with the student's name
        void greeting() {
            System.out.println("Hello! My name is " + name);
        }

        // Define the changeName() method that updates the student's name with the given new name
        void changeName(String newName) {
            name = newName;
        }

        // random will replace 'this' and 'other' will be replaced by the variable called 'mervan'
        // Define a constructor that accepts another Student object as a parameter
        Student(Student other) {
            // Set the value of the instance variable 'name' to the value of the 'name' variable of the 'other' Student object
            this.name = other.name;
            // Set the value of the instance variable 'rollNo' to the value of the 'rollNo' variable of the 'other' Student object
            this.rollNo = other.rollNo;
            // Set the value of the instance variable 'marks' to the value of the 'marks' variable of the 'other' Student object
            this.marks = other.marks;
        }

        // Define the greeting2() method that prints a greeting message with the student's name using the "this" keyword
        void greeting2() {
            System.out.println("Hello! My name is " + this.name);
        }

        // Define the default constructor for the Student class, initializing instance variables with default values
//        Student() {
//            this.rollNo = 19;
//            this.name = "Mervan Polat";
//            this.marks = 89.54;
//        }

        //Calling a constructor from another constructor
        Student() {
            this (12,"Abdullah",54.43);
        }

        // Define the parameterized constructor for the Student class, which accepts three parameters
        Student(int rollNo, String name, double marks) {
            // Set the value of the instance variable 'rollNo' to the value of the 'rollNo' parameter
            this.rollNo = rollNo;
            // Set the value of the instance variable 'name' to the value of the 'name' parameter
            this.name = name;
            // Set the value of the instance variable 'marks' to the value of the 'marks' parameter
            this.marks = marks;
        }

    }
}
