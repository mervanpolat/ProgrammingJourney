package JavaDSABootcamp.Recursion.RecursionSubsetSubsequenceStringQuestions;

public class Q3_SkipAStringIfNotTheRequiredString {
    public static void main(String[] args) {
        // calling the skipAppNotApple method with different inputs
        // calling the method skipAppNotApple() with the unprocessed parameter.
        // the reason why it's printing the same is, because the string "bacappledah" includes "apple" inside it.
        System.out.println(skipAppNotApple("bacappledah")); //Prints bacappledah

        // calling the method skipAppNotApple() with the unprocessed parameter "bacappefg".
        // this will print "bacefg", because the string "app" is inside the unprocessed string "bacappefg".
        System.out.println(skipAppNotApple("bacappefg"));   //Prints bacefg
    }

    static String skipAppNotApple(String unprocessed) {
        // base case: if the unprocessed string is empty, return an empty string
        if (unprocessed.isEmpty()) {
            return "";
        }

        // if the unprocessed string starts with "app" and it's not "apple", skip it
        if (unprocessed.startsWith("app") && !(unprocessed.startsWith("apple"))) {
            return skipAppNotApple(unprocessed.substring(3));
        } else {
            // if the first three characters of the unprocessed string are not "app" or they are "apple", include the first character in the result and move to the next character
            return unprocessed.charAt(0) + skipAppNotApple(unprocessed.substring(1));
        }
    }
}
