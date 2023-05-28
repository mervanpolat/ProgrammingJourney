package JavaDSABootcamp.Searching.LineareSearchAlgo;
import java.util.Arrays;

public class SearchStringKunal {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(search(name,target));
        //Prints true

        target = 'n';
        System.out.println(search(name, target));
        //Prints true

        target = 'f';
        System.out.println(search(name,target));
        //Prints false

        //Converting String variable to array
        System.out.println(Arrays.toString(name.toCharArray()));
        //[K, u, n, a, l]
    }
    static boolean search(String str, char target) {
        //.length() in String is a function, unlike in arrays which is a variable
        if (str.length() == 0) {
            //If the length of my str variable is zero, then return false
            return false;
        }

        //Iterate the below code till the length of my str variable
        for (int i = 0; i < str.length(); i++) {
            //if the below target char is equal to char at i index, then return true
            if (target == str.charAt(i)) {
                return true;
            }
        }
        //Else return false
        return false;
    }

    static boolean search2(String str, char target) {
        //.length() in String is a function, unlike in arrays which is a variable
        if (str.length() == 0) {
            return false;
        }
        //"For every character in my str.CharArray return true if a char is equal to my target char, else return false."
        for (char ch: str.toCharArray()) {
            if (ch == target) {
                //If the above condition is met return true
                return true;
            }
        }
        //Else return false
        return false;
    }
}
