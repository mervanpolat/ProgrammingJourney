package JavaDSABootcamp.Sorting.CycleSortAndQuestions;

public class Q5_SetMismatch {

    public int[] findErrorNums(int[] arr) {
        //Cycle Sort
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //Search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                //Return duplicate and the missing number, respectively!
                return new int[]{arr[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
