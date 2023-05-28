package JavaDSABootcamp.Searching.LineareSearchAlgo;

public class LinearSearch {
    public static void main(String[] args) {
        //Declaration
        int[]arr = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};

        //Calling and printing the method linearSearch
        System.out.println(linearSearch(arr,15));
        //Prints -1
        System.out.println(linearSearch(arr,9));
        //Prints 19

        //Calling and printing the method linearSearch2
        System.out.println(linearSearch2(arr, -3));
        //Prints -3
        System.out.println(linearSearch2(arr, 10));
        //Prints 10

        //Calling and printing the method linearSearch3
        System.out.println(linearSearch3(arr, -3));
        //Prints true
        System.out.println(linearSearch3(arr, -13));
        //Prints false
    }

    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        //For every element in the array
        for (int element : arr) {
            //check if the element equals my target
            if (element == target) {
                //If the above condition is met then return true
                return true;
            }
        }
        //this line will execute if none of the above return statements have been executed
        //hence the target is not found, this results to false
        return false;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //For every element in the array
        for (int element : arr) {
            //check if the element equals my target
            if (element == target) {
                //If the above condition is met then return the element
                return element;
            }
        }
        //this line will execute if none of the above return statements have been executed
        //hence the target is not found, this results to -1
        //In this method you have to worry about if the target is equal to -1.
        //In this case we could stumble in a dilemma, is that -1 my target or my return -1?
        //To solve this, you return Integer.MAX_VALUE without doing this, it might be possible that -1 is my target value
        return Integer.MAX_VALUE;
    }

    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            //Check for element at every index if it equals to target
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
        //The reason why I didn't assign Integer.MAX_VALUE; is because I know that my index will never be -1.
        return -1;
    }
}
