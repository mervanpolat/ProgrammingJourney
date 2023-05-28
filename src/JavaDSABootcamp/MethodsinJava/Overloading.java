package JavaDSABootcamp.MethodsinJava;

public class Overloading {
    public static void main(String[] args) {

        //Although the below two fun methods share the same name,
        //they coexist because they've different parameters of different data types

        fun(32);                                    //Prints
        fun("Mervan");                          //Prints Mervan
        System.out.println(sum(3,7));            //Prints 10
        System.out.println(sum2(3,5,6));       //Prints 14

        /*Important: In Method overloading you've to specify through parameters which method you're calling
                     otherwise it'll lead to error. This is not the case when we did the same thing for arrays,
                     but Method overloading requires you to specify either of the multiple functions.
        */
        //fun();      //Error: Cannot resolve fun();
    }

    static int sum(int a, int b) {
        int sum = a+b;
        return sum;
    }

    static int sum2(int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }


    /**Function overloading basically happens when two or more functions of the same name take an exist,
     * if the parameters are different.**/
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
