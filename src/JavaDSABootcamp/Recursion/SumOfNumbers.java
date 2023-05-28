package JavaDSABootcamp.Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int n) {
        //Factorial of 1 and 0 is 1, that's why we return here 1
        if (n<=1) return 1;
        return n + sum(n-1);
        //5 + (5-1 = 4) = 9
        //4 + (4-1 = 3) = 7
        //3 + (3-1 = 2) = 5
        //2 + (2-1 = 1) = 3
        //1 == 1 return 1;
        //9+7+5+3 = 24;
    }
}
