package JavaDSABootcamp.Recursion;

public class FiboGoldenRatio {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fibonacci(i));
            //Prints
            //0
            //1
            //1
            //2
            //3
            //5
            //8
            //13
            //21
            //34
            //55
        }
        System.out.println(fibonacci(50));
        //Prints 2147483647
    }

    static int fibonacci(int n){
        //Just for demo, use long instead
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
