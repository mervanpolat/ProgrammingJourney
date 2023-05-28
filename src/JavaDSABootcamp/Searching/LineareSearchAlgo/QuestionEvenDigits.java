package JavaDSABootcamp.Searching.LineareSearchAlgo;

public class QuestionEvenDigits {
    //Q5: Find Numbers with Even Number of Digits
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
        //Declaration
        int[]arr = {12,345,2,6,3,7896};
        //Output
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        //return count that we'll keep track of

        //find length of the integer of a given number
        //count if it's an even amount of digits
        int count = 0;

        //iterate by looking at each number in the nums array
        //Using conventional for-loop prints the index value of array
        //The enhanced for loop prints the element of the index, which is the real question in this exercise
        for (int i : nums) {
            //find the length of this i
            //convert into a String
            String s = String.valueOf(i);
            int length = s.length();
            //If this length is even, add 1 to count
            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
        //Returns 2
    }

}
