package JavaDSABootcamp.OOP2.Singleton;
public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of the 'Singleton' class and store it in 'obj'
        Singleton obj = Singleton.getInstance();

        // Get the singleton instance of the 'Singleton' class again and store it in 'obj2'
        Singleton obj2 = Singleton.getInstance();

        // Get the singleton instance of the 'Singleton' class once more and store it in 'obj3'
        Singleton obj3 = Singleton.getInstance();

        // This code snippet demonstrates how to use the Singleton class from a main method in another class called Polymorphism.
        // The comments explain each line of the code and the purpose it serves.
        //
        // The Polymorphism class is defined with a public static void main(String[] args) method, which serves as the entry point of the program.
        // The Singleton.getInstance() method is called to get the singleton instance of the Singleton class, and the reference to the instance is stored in a variable called obj.
        // The Singleton.getInstance() method is called again to get the singleton instance of the Singleton class, and the reference to the instance is stored in a variable called obj2.
        // The Singleton.getInstance() method is called once more to get the singleton instance of the Singleton class, and the reference to the instance is stored in a variable called obj3.
        // In each case, the Singleton.getInstance() method returns the same instance of the Singleton class, ensuring that there is only one instance throughout the lifetime of the application.
    }
}
