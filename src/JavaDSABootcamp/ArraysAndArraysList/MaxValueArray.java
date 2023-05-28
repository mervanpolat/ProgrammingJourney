package JavaDSABootcamp.ArraysAndArraysList;

public class MaxValueArray {
    public static void main(String[] args) {
        //Declaration
        int[] arr = {1,3,2,9,18};
        //Method Calling
        max(arr);
        //Prints 76
        System.out.println(maxRange(arr,1,3));
        //Prints 9
        System.out.println(maxRange(arr,1,4));
        //Prints 18
    }

    //Imagine that array is not empty
     static void max(int[] arr) {
        //Assuming the 0th index value is the largest element
        int max = arr[0];
        //Iterate through the whole array to find the largest element
         for (int i = 0; i < arr.length; i++) {
             //If the element of i index is greater than my assumed index then store it as new max element
             if (arr[i] > max) {
                 max = arr[i];
             }
         }
         //Output
         System.out.println(max);
    }

    //Applying the exact same method as we did above, but this time within a range

    //Problem: "I should at a particular startIndex and the for-loop should iterate so long till it has reached
    //          endIndex. After that I should print out the element of my endIndex."
    static int maxRange(int[] arr, int start, int end) {

        //Assigning the ELEMENT of my start index to max
        int maximum = arr[start];
        //The value of i is the index value of my start, end value is the index value of my end
        //Iterates as long as i has reached the index value of end
        for (int i = start; i <= end; i++) {
            //max variable stores the element of the index that is between start and end
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
