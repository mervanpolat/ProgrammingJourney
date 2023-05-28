package JavaDSABootcamp.Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int ans = fibonacci(4);
        //Prints the nth fibonacci number
        System.out.println(ans);
        //Prints 3
    }

    static int fibonacci(int n){
        //Base condition
        if (n<2) return n;
        //When the first function call is finished, then the second function call gets executed and then and only then
        //return keyword gets executed! The whole line at 16 is the last statement -> return fibonacci(n-1) + fibonacci(n-2);
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
