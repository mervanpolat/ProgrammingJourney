package JavaDSABootcamp.Searching.LineareSearchAlgo;

public class QuestionEvenDigitsTwo {
    public static void main(String[] args) {
        //Declaration
        int[]arr = {123,3456,6542,54,5};
        //Method call
        LengthOfNumber(arr);
    }

    static void LengthOfNumber(int[]arr) {
        //count if it's an even number of digit
        int count = 0;

        //iterate by looking at each number in the arr array
        //Using enhanced for-loop
        for (int i : arr) {
            //Converts the number into String
            String number = String.valueOf(i);
            //Gets the length of the String number and stores it inside a variable of int datatype
            int numberLength = number.length();

            //Checks whether even or not even using the modulo operator
            if (numberLength % 2 == 0) {
                //Count is incremented by one each time when the above condition gets executed
                count++;
                //Output
                System.out.print(i + ", ");
                //Prints 3456, 6542, 54,
            }
        }
        //Prints a new line
        System.out.println();
        //Prints the total number of count
        System.out.println(count);
        //Prints 3
    }
}
