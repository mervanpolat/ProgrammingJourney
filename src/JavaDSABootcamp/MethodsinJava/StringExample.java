package JavaDSABootcamp.MethodsinJava;

public class StringExample {
    public static void main(String[] args) {

        //This is how you print the greet() method
        System.out.println(greet());
        //Prints Hello Mervan

        //This is the other way of printing the greet() method
        String ans = greet();
        System.out.println(ans);
        //Prints Hello Mervan

    }



    //Return Method of String datatype has to include return statement of the same datatype
    static String greet() {

        String greeting = "Hello Mervan";

        return greeting;
    }
}
