package JavaDSABootcamp.MethodsinJava;

public class Scope {
    /**Scope basically means where we can access our variables**/
    public static void main(String[] args) {

        int a,b;

        a = 10;
        b = 20;

        /*Block Scope: For block scopes those variables that were initialised above the block scope can be reached,
                       but can't be declared with the same name twice but can be modified. And those variables that
                       were initialised below the block scope can't be reached. In simple terms, values initialised
                       in this block, will remain in this block regardless of data type.
         */


        {
            a = 78;

            int c = 99;
        }

        //System.out.println(c); //Prints Cannot resolve symbol 'c'

        //scoping in for-loops

        for (int i = 0; i < 4; i++) {
            System.out.println();
        }

        /*You can't access the variable i which is declared within the scope of for-loop but within for-loop
          this applies to all variables declared within the scope of for-loop*/
    }

    /**Method Scope basically means that any variable declared within the below method's scope
     * can only be reached within the method and not outside it. This is not the case when it comes to the
     * method itself.**/
    //Declaring a function without return statement
    static void random(int marks) {
        //You can do anything you want with marks within this function's scope
        int num = 454;
        System.out.println(num);
    }


}
