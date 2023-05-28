package JavaDSABootcamp.TwoDimArrays;

public class Q2_SearchInDiscontinuousVariant {
    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=FOa55B9Ikfg

        /*  The rows are sorted, the cols are also sorted. But the only change here is that, there's no guarantee
            that the last item in any row is related or <= than the first item in the next row e.g. 11<=8.
            This is not the same as what we did before, because we can't draw the same relationships.
            #1 Thing: How can I reduce my search space?
            The way we reduce it, is we chop it in half, but not straightforward as we did before.
            A reduction of search space entails a decision and in binary search our decision is:
            1) go left
            2) go right
            3) if mid == target -> return mid;

            We need to take a forking in decisions, to either go lower in value or upper in value. This matrix is
            gradiented, because the columns are sorted.

            {1,4,7,11},
            {8,9,10,20},
            {11,12,17,30}
        */
        int[][]arr = {
                {1,4,7,11},
                {8,9,10,20},
                {11,12,17,30}
        };

    }

    static boolean search(int[][] matrix, int target) {
        //If the length of the array is equal to zero, then return false
        if (matrix.length == 0) {
            return false;
        }

        //Get the length of the col at the 0th row of my array
        int col = matrix[0].length - 1;
        //row is equal to 0th row of my array
        int row = 0;

        while (col >= 0 && row <= matrix.length - 1) {
      /*
        Cases:
          target == item : We found the item. Return true.
          target < item : Target must be to our left...go down in value
          target > item : Target must be to our below...go up in value
      */
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }
}