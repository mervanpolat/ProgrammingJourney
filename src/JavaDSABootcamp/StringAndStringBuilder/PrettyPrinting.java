package JavaDSABootcamp.StringAndStringBuilder;

public class PrettyPrinting {
    public static void main(String[] args) {
        float num = 2343.43434f;
        System.out.printf("Number is: %.2f", num);
        //Prints Number is: 2343,43
        System.out.println();

        System.out.println(Math.PI);
        //Prints 3.141592653589793
        System.out.printf("PI: %.3f", Math.PI);
        //Prints PI: 3,142
        System.out.println();
        //The order in which you have placed your placeholders, in that order you should place your values
        System.out.printf("Hello my name is %s and I am from %s", "Mervan", "Turkey");
        //Hello my name is Mervan and I am from Turkey

        //For more: https://www.baeldung.com/java-string-formatting-named-placeholders
    }
}
