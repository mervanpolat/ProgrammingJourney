package JavaDSABootcamp.Recursion;

public class Message {
    public static void main(String[] args) {
        //Write a function that prints helloWorld
        Message();
        System.out.println();
        //It might be a case, that you should do a particular task multiple times:
        //Q: How can I print "Hello World" five times by calling the method just a single time?
        //A: By calling methods
        Message();
        //Hello World
        //Hello World
        //Hello World
        //Hello World
        //Hello World

        /*
        Q: What's happening over here?
        A: Function calling another function
        */
    }

    static void Message(){
        System.out.println("Hello World");
        Message1();
    }
    static void Message1(){
        System.out.println("Hello World");
        Message2();
    }
    static void Message2(){
        System.out.println("Hello World");
        Message3();
    }
    static void Message3(){
        System.out.println("Hello World");
        Message4();
    }
    static void Message4(){
        System.out.println("Hello World");
    }
}
