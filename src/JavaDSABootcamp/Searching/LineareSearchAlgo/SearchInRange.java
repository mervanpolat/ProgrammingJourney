package JavaDSABootcamp.Searching.LineareSearchAlgo;

public class SearchInRange {
    public static void main(String[] args) {
        //Q2: Search in range

        int[]arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(linearSearch(arr,6,3,7));
        //Prints 5
        System.out.println(linearSearch(arr,11,1,7));
        //Prints -1
        System.out.println(linearSearch(arr,9,6,10));
        //Prints 8
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //index starts at user defined range as well as ends at user defined range
        for (int index = start; index <= end; index++) {
            //You've to store element value of index in another int variable to compare it inside an if statement
            int element = arr[index];
            //This is the correct way of doing that, before that you did target == arr[index], which didn't function
            if (element == target) {
                //return the element of the index if the above condition is met
                return index;
            }
        }
        //this line will execute if none of the above return statements have been executed
        //hence the target is not found, this results to -1
        //The reason why I didn't assign Integer.MAX_VALUE; is because I know that my index will never be negative.
        return -1;
    }
}
