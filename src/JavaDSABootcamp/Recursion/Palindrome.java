package JavaDSABootcamp.Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
        // Prints: racecar is a palindrome: true
        System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
        // Prints: hello is a palindrome: false
        System.out.println(str1.charAt(str1.length()-1));
        // Prints the last char which is r
        System.out.println(str1.substring(1,str1.length()-1));
        // Prints aceca
    }

    static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            // base case: if the string is empty or has only one character, it is a palindrome
            return true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // if the first and last characters of the string are equal, call the function recursively with the middle substring
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // if the first and last characters are not equal, it is not a palindrome
            return false;
        }
    }
}
