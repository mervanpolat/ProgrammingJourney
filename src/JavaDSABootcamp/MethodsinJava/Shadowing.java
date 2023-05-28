package JavaDSABootcamp.MethodsinJava;

/**
 What is shadowing in Java?

 Shadowing in Java is basically a practice  of using two variables with the same name
 within the scope that overlaps. Shadowing doesn't take place in methods. **/

public class Shadowing {
    //This will have its own scope
    static int x = 90;  //this will be shadowed at 20 or -> System.out.println(x);  //Prints 40
    public static void main(String[] args) {
        System.out.println(x);  //Prints 90

        /*In the below line we're adding another variable with the same name that overlaps.
        Because lower level scope is overriding the higher level scope.*/

        //Important: Scope will begin when value is initialised.

        int x = 40;             //the class variable at line 11 is shadowed by this variable

        System.out.println(x);  //Prints 40
        fun();                  //Prints 90

    }

    static void fun() {
        System.out.println(x);
    }

}
