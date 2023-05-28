package JavaDSABootcamp.Sorting.CycleSortAndQuestions;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[]arr = {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[]arr) {
        //array -> {3,5,2,1,4};
        //1. i = 0;
        //2. i = 0;
        //3. i = 0;
        int i = 0;
        //1. 0 < 5 -> true
        //2. 0 < 5 -> true
        //3. 0 < 5 -> true
        while (i < arr.length) {
            //1. i = 0; arr[i] = 2; correctIndex = 2;
            //2. i = 0; arr[i] = 2; correctIndex = 1;
            //3. i = 0; arr[i] = 5; correctIndex = 4;
            //4. i = 0; arr[i] = 4; correctIndex = 3;
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
                //1. {2,5,3,1,4};
                //2. {5,2,3,1,4};
                //3. {4,2,3,1,5};
                //4. {1,2,3,4,5};
            } else {
                //else increment i!
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second ) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
