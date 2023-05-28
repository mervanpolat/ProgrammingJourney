package JavaDSABootcamp.MethodsinJava;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Mervan Polat";

        greet(name);
        //Prints Mervan Polat

    }

        /*The name of the above String variable doesn't have to math the below parameter name "text".
          If we pass a value to the parameter text, it will be automatically replaced with the value we assigned
          to the above variable called "name".

          Important: text parameter of the String function greet() is within String function's scope but not within main() scope.
                     greet(String text) -> within main() Method's scope but (String text) is not within main() Method's scope
         */
        static void greet(String text) {
            System.out.println(text);
    }
}
