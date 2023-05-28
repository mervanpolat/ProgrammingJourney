package JavaDSABootcamp.Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(multiplication(1234));
        //Prints 24
    }

    static int multiplication(int n) {
        //if one digit is remaining, return that digit.
        if (n%10==n) return n;

        return (n%10) * multiplication(n/10);
    }
}
