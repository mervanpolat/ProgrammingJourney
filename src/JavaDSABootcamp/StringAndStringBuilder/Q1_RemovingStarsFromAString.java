package JavaDSABootcamp.StringAndStringBuilder;

public class Q1_RemovingStarsFromAString {
    public static void main(String[] args) {

        String text = "Me**rvan Po**lat";
        int counter = 0;
        for(char ch:text.toCharArray()) {
            if (ch == '*') {
                System.out.print(ch + " ");
                ++counter;
            }
        }

        System.out.println("\n" + counter);

        //In your for loop, you are iterating through each character in the "text" string using the enhanced for loop.
        //The enhanced for loop works by assigning each element of an array (in this case, each character of the string)
        //to a temporary variable, which in your code is named "ch".
        //So, in each iteration of the loop, "ch" represents the current character being checked.
        //When you wrote if (text.charAt(ch) == '*'), you were trying to access the character at index "ch" in the
        //"text" string, which is incorrect because "ch" is not an index, but a character.
        //Therefore, to fix this issue, you should change if (text.charAt(ch) == '*') to if (ch == '*').
        //This way, you are checking if the current character "ch" is equal to the character '*', which is what you intended to do.
    }
}
