package JavaDSABootcamp.Sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //The Insertion Sort Algorithm
        //In Insertion Sort Algorithm we're sorting the array partially.
        int[]arr = {23,434,63,1,-5,-34};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        //Prints [-34, -5, 1, 23, 63, 434]
    }

    //1 - i -> j = 2
    //2 = i
    static void insertionSort(int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    //When element j !< j-1 -> break;
                    //Because the left hand side is already sorted
                    break;
                }
            }
        }
    }

    static void swap(int[]arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
