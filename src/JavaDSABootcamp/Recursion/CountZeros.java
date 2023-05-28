package JavaDSABootcamp.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n1 = 30005;
        System.out.println(zeros(n1));  //Prints 3
    }

    // Declare a static variable to keep track of the number of zeros found
    static int counter = 0;

    // A recursive function that counts the number of zeros in a given integer
    static int zeros(int num) {
        // Base case: if the number is 0, return the counter
        if (num==0) return counter;

        // Get the last digit of the number
        int lastDigit = num%10;

        // If the last digit is 0, increment the counter
        if(lastDigit == 0) ++counter;

        // Recursively call the function with the number divided by 10
        // This will shift the decimal place of the number by one to the left,
        // effectively removing the last digit of the number
        return zeros(num/10);
    }
}
