package JavaDSABootcamp.TwoDimArrays;

public class Q1_SearchInContinuousMatrices {
    public static void main(String[] args) {

        /*
        In continuous variant every row is sorted. Any time you see the word, you immediately should come to the
        conclusion, that your solution has to be logarithmic log(n) or binary search which is the same. The property
        about this matrix is that the last element of every row is <= first element of the next row .

        Speciality of the below matrix:

        1) Rows are sorted
        2) Row continuity

        e.g 3 <= 4
        {0,1,2,3},
        {4,5,6,7},
        {8,9,10,11},

        Binary Search in Every Row?

        m = row, n = col
        Time Complexity: O(m*log(n)) -> Binary Search

        */
        int[][]arr = {
                {0,1,2,3,5,6},
                {7,8,9,10,11},
                {12,13,14,15},
        };

        System.out.println(arr.length);
        //Prints 3

        System.out.println(arr[2][3]);
        //Prints 15

        //System.out.println(arr[3][3]);
        //Prints Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        //Output for col
        System.out.println(arr[0].length);
        //Prints 6

        System.out.println(search(arr,11));
        //Prints true

    }

    static boolean search(int[][] matrix, int target) {
        //If the length of the array is equal to zero, print false. Because the array has no size
        if (matrix.length == 0) {
            return false;
        }

        //totalRows is equal to the length of my array, which is 3 for the case of arr
        int totalRows = matrix.length;
        //totalColumns is equal to the length of the column of array, which is 6 for the case of arr
        int totalColumns = matrix[0].length;

    /*
      The left and right pointer to our search. We imagine a visualization
      of a 1D array and will use our mapping system to convert these indices
      into concrete locations in the 2D matrix.

      The last position in the matrix if we consider it as array will be
      rows * cols - 1 indices.

      Same as an array...an array's last index is arr.length - 1.
    */
        int left = 0;
        int right = totalRows * totalColumns - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

      /*
        We need to map from our conceptualized 1D array back to our 2D matrix to index
        into it.

        Look above for the mapping explanation
      */
            //Wraparound -> Check more about it on YouTube!
            int middleElementValue = matrix[middle / totalColumns][middle % totalColumns];

      /*
        3 possibilities:
          1.) We found the target
          2.) We went too high in value...go "left"
          3.) We went too low in value...go "right"
      */
            if (middleElementValue == target) {
                return true; // element found
            } else if (middleElementValue < target) {
                left = middle + 1; // go right
            } else {
                right = middle - 1; // go left
            }
        }

        return false;
    }
}

/*
  Here is a very pure 2D matrix to exemplify our mapping system. Each cell has its conceptual
  index if we flattened the 2D matrix into a 1D sorted array.

  [ 0, 1, 2 ]
  [ 3, 4, 5 ]
  [ 6, 7, 8 ]

  totalRows = 3
  totalColumns = 3

  Coordinate Mappings -> (row, col)

  [ (0, 0), (0, 1), (0, 2) ]
  [ (1, 0), (1, 1), (1, 2) ]
  [ (2, 0), (2, 1), (2, 2) ]

  Given a 1D index position .. we declare our mapping equations:

  row in 2D matrix: 1DIndex / totalColumns
  col in 2D matrix: 1DIndex % totalColumns

  Example:

  We want to find the coordinate for element 6.
  row in 2D matrix: (6) / 3 = 2
  col in 2D matrix: (6) % 3 = 0

  Output: (2, 0)

  We are correct.
*/
