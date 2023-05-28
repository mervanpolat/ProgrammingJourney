package JavaDSABootcamp.Searching.LineareSearchAlgo;

public class MiniumumNumber {
    public static void main(String[] args) {
        //Q3: Minimum Number
        int[]arr = {-4,-3,-2,-1,0, 1,2,3,4,5,6,7,8,9,10};

        minimum(arr);
        //Prints -4
    }

    static void minimum(int[]arr) {
        //Assuming 0th index is the minimum
        int minimum = arr[0];

        //Iterate through the whole array to find the smallest element
        for (int i = 0; i < arr.length; i++) {
            //If the element of i index is smaller than my assumed minimum then store it as new minimum number
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        //Output
        System.out.println(minimum);
    }
}
