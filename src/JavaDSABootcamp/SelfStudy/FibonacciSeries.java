package JavaDSABootcamp.SelfStudy;

public class FibonacciSeries {
    public static void main(String[] args) {

        //Fibonacci Series

        int n1, n2, temp;

        //This task is the same as swapping values.
        n1 = 0;
        n2 = 1;
        temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;

        //I used the same methodology of the above logic and applied to my for loop, which worked.
            //This loop runs until 10 is reached (exclusive)
        for (int i = 0; i < 10; i++) {

            //n1 = 0 + 1 = 1
            n1 = n1 + n2;

            //The value of n1 is stored in temp which is 1
            //0 = 1 -> temp = 1;
            temp = n1;

            //The value of n2 is stored in n1, which is again nothing but swapping values.
            //1 = 1; -> n1 = 1; -> nothing changed when it comes to value, but for the coming iterations, the difference will be obvious
            n1 = n2;

            //Final step is to store the value of temp to n2.
            n2 = temp;

            //Output
            System.out.println(n1);
        }
    }
}
