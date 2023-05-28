package JavaDSABootcamp.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        //Time Complexity: log(n)
        System.out.println(sum(1234));
        //Prints 10
        System.out.println(sum(34543));
        //Prints 19

    }

    static int sum(int n){
        if (n==0) return 0;
        return n%10 + sum(n/10);
    }
}
