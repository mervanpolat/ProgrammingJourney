package JavaDSABootcamp.Recursion;

public class Numbers {
    public static void main(String[] args) {
        //Q: Write a function that takes in a number and prints it.
        //   Print first five numbers: 1,2,3,4,5
        numberOne(1);
        //Prints
        //1
        //2
        //3
        //4
        //5
    }

    //What's happening here?
    //1. The below is a function calling other function.
    //2. All these functions have one thing in common.
    //3. The body and the definition of the functions are identical,
    //   taking the same parameter and executing the same body, just different name
    //4. All the function calls that happen in a programming language are stored in stack memory

    static void numberOne(int n){
        System.out.println(n);
        n++;
        numberTwo(n);
    }
    static void numberTwo(int n){
        System.out.println(n);
        n++;
        numberThree(n);
    }
    static void numberThree(int n){
        System.out.println(n);
        n++;
        numberFour(n);
    }
    static void numberFour(int n){
        System.out.println(n);
        n++;
        numberFive(n);
    }
    static void numberFive(int n){
        System.out.println(n);
    }
}
