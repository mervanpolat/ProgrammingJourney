package JavaDSABootcamp.Searching.LineareSearchAlgo;

public class SearchInStringMervan {
    public static void main(String[] args) {
        //Q1: Search in String -> Mervan's Method

        //Declaration
        String name = "Mervan";
        //Target letter
        String target = "a";

        System.out.println(search(name, target));
        //Prints true

        target = "z";
        System.out.println(search(name, target));
        //Prints false
    }

    static boolean search(String name, String target) {
        //Calculates the length of the passed name with the target letter
        int lengthWithTargetLetter = name.length();
        //Calculates the length of the passed name without the target letter
        int lengthWithoutTargetLetter = name.replace(target, "").length();
        //Calculates the occurrence of the target letter through the difference between the above two variables
        int calculateOccurrence = lengthWithTargetLetter - lengthWithoutTargetLetter;

        //If the occurrence is equal to zero -> or target letter doesn't contain in name
        if (calculateOccurrence == 0) {
            //return false
            return false;
        }
        //else return true
        return true;
    }
}
