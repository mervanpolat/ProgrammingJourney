package JavaDSABootcamp.Recursion;
public class ReverseNumber {

    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse(num)); // Output: 54321
    }

     static int reverse(int num) {
        if (num < 10) {
            return num;
        } else {
            int quotient = num / 10;
            int remainder = num % 10;
            int reversedNum = reverse(quotient);
            return reversedNum * 10 + remainder;
        }
    }
}