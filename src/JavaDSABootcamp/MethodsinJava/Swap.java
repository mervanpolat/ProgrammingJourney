package JavaDSABootcamp.MethodsinJava;

public class Swap {
    public static void main(String[] args) {

        //In this exercise we will apply the same thing to methods as we did for swapping values.

        //Variable declaration
        int a,b,temp;

        //Assigning values
        a = 10;
        b = 40;
        temp = 0;

        //Swapping numbers
        temp = a;
        a = b;
        b = temp;

        //Output
        System.out.println(a);  //Prints 40
        System.out.println(b);  //Prints 10

        swap(4,5);         //Prints 5, 4
        swap(52,34);       //Prints 34, 52
        swap(343,64);      //Prints 64, 343
    }

    static void swap(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + ", " + b);
    }
}
