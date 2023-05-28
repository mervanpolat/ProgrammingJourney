package JavaDSABootcamp.Recursion.RecursionPatternQuestions;

public class Q1_Triangle1 {
    public static void main(String[] args) {
        starPattern1Recursive(4);
        //* * * *
        //* * *
        //* *
        //*
        System.out.println();
        starPattern1Kunal(4,0);
        //* * * *
        //* * *
        //* *
        //*

    }

    static void starPattern1Recursive(int rows) {
        if (rows == 0) { // Base case: when there are no more rows to print
            return;
        }
        for (int i = 0; i < rows; i++) { // Print the stars for the current row
            System.out.print("* ");
        }
        System.out.println(); // Move to the next line after printing stars for the current row
        starPattern1Recursive(rows - 1); // Recursive call with rows - 1 to print the pattern for the remaining rows
    }

    static void starPattern1Kunal(int row, int col) {
        // Base case: If the current row is 0, then we're done.
        if (row == 0) return;

        // If the current column is less than the row number, print a star
        if (col < row) {
            System.out.print("* ");

            // Recursively call the function with the next column
            starPattern1Kunal(row, ++col);
        }
        else {
            // If the current column is equal to or greater than the row number,
            // print a newline and move on to the next row
            System.out.println();

            // Recursively call the function with the next row and column 0
            starPattern1Kunal(--row, 0);
        }
        //* * * *
        //* * *
        //* *
        //*
    }

    static void starPattern2Kunal(int row, int col){
        if (row == 0) return;

        if (col < row) {
            starPattern2Kunal(row,++col);
            System.out.print("* ");
        } else {
            starPattern2Kunal(--row, 0);
            System.out.println();
        }
    }
}
