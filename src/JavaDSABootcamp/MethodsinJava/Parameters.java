package JavaDSABootcamp.MethodsinJava;

public class Parameters {
    public static void main(String[] args) {

        /*You have to pass int values in the order of declaration,
          Here a is replaced with 24 and b is replaced with 54*/
        int ans = sum3(24,54);
        //Output
        System.out.println(ans);
        //Prints 78

    }

    //pass the value of numbers when you are calling the method in main()

    static int sum3(int a, int b) {
        int sum = a + b;

        return sum;
    }
}
