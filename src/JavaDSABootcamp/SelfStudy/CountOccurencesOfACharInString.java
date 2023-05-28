package JavaDSABootcamp.SelfStudy;

public class CountOccurencesOfACharInString {
    public static void main(String[] args) {

        //Count occurrences of a character in string

        //Let's say how many times does the letter 'a' occur in the below string?
        //In the below string I want to find out how many times the char 'a' is repeated?
        String s = "Java Programming";

        //First we need to get the length of the string. The below function will give the total length.
        System.out.println(s.length()); //total length: 16

        //In the next step, we need to find the length without the letter 'a' involved.
        //This is the following logic to calculate the length without 'a'. We replaced it with empty string.
        //So wherever the letter a occurs, .replace functionality will replace it with an empty string.

        System.out.println(s.replace("a", ""));             //prints: Jv Progrmming
        System.out.println(s.replace("a", "").length());    //prints: 13

        /*
        Now if you think about it, the answer is already in front of our eyes.
        The only thing that's left is to convert those both lengths into an int, and then subtract the lesser length from
        the total length. This will give us the number of occurrence of the target letter.
        */

        int totalLength = s.length();
        int lengthWithoutA = s.replace("a", "").length();
        int calcOccurenceOfA = totalLength - lengthWithoutA;

        //Output
        System.out.println("The letter 'a' occurs " + calcOccurenceOfA + " times in " + s);


    }
}
