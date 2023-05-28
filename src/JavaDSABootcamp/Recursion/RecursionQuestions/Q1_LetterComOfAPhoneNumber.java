package JavaDSABootcamp.Recursion.RecursionQuestions;
import java.util.ArrayList;

public class Q1_LetterComOfAPhoneNumber {
    public static void main(String[] args) {
        pad("", "12");
        //Prints
        //ad
        //ae
        //af
        //bd
        //be
        //bf
        //cd
        //ce
        //cf
        System.out.println(padArrayList("", "13")); //Prints [ag, ah, ai, bg, bh, bi, cg, ch, ci]
        System.out.println(padCount("", "45")); //Prints 9
    }

    // This program demonstrates the use of recursion to generate all possible letter combinations of a
    // given phone number. It does this by converting the digits to characters using their ASCII values,
    // and then building the combinations recursively. The code provides three different ways to achieve this:
    // printing the combinations directly, returning them as an ArrayList, and counting the number of combinations.

    //The expression (digit-1)*3 is used to calculate the starting index of the group of characters that correspond to the given digit on the phone keypad.

    //For example, on a standard phone keypad, the numbers 2, 3, 4, 5, 6, 7, 8, and 9 have the following corresponding characters:

    //2: abc
    //3: def
    //4: ghi
    //5: jkl
    //6: mno
    //7: pqrs
    //8: tuv
    //9: wxyz

    //The characters start from 'a', which has an ASCII value of 97.
    //To map each digit to its corresponding character set, you can use the following formula:
    //Starting index of character set = (digit - 1) * 3
    //This works because the character sets are evenly spaced, with 3 characters per digit (except for 7 and 9, which have 4 characters each).
    //Note that this formula assumes 1-based indexing, meaning that the first character 'a' has an index of 1.

    //Here's a breakdown of how the formula works for each digit:

    //• For digit 2: (2 - 1) * 3 = 3, which gives us the starting index of 'a'.
    //• For digit 3: (3 - 1) * 3 = 6, which gives us the starting index of 'd'.
    //• For digit 4: (4 - 1) * 3 = 9, which gives us the starting index of 'g'.
    //• And so on...

    /*Keep in mind that this formula does not handle the case of digits 7 and 9, which have 4 characters instead of 3.
      To handle these cases, you would need to add conditional logic to adjust the starting index and character count accordingly.*/

    //pad function generates all the possible letter combinations
    //for the given unprocessed phone number and prints them

    static void pad(String processed, String unprocessed) {
        // Base case: if there are no more digits to process, print the combination
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        // Get the first digit from the unprocessed phone number
        int digit = unprocessed.charAt(0) - '0';

        // Generate possible characters for the current digit
        for (int i = (digit-1)*3; i < digit * 3; i++) {
            // Calculate the character using the ASCII value of 'a' + the offset (i)
            char ch = (char) ('a' + i);
            // Add the character to the processed string and call the function recursively
            pad(processed + ch, unprocessed.substring(1));
        }
    }

    // padArrayList function generates all the possible letter combinations
    // for the given unprocessed phone number and returns them as an ArrayList
    static ArrayList<String> padArrayList(String processed, String unprocessed) {
        // Base case: if there are no more digits to process, add the combination to the list
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();

        // Generate possible characters for the current digit
        for (int i = (digit-1)*3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            // Add the result of the recursive call to the list
            list.addAll(padArrayList(processed + ch, unprocessed.substring(1)));
        }
        return list;
    }

    // padCount function counts all the possible letter combinations
    // for the given unprocessed phone number and returns the count
    static int padCount(String processed, String unprocessed) {
        // Base case: if there are no more digits to process, increment the count
        if (unprocessed.isEmpty()) {
            return 1;
        }
        int counter = 0;
        int digit = unprocessed.charAt(0) - '0';

        // Generate possible characters for the current digit
        for (int i = (digit-1)*3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            // Increment the counter with the result of the recursive call
            counter = counter + (padCount(processed + ch, unprocessed.substring(1)));
        }
        return counter;
    }
}
