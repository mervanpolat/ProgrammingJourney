package JavaDSABootcamp.PatternQuestion;

public class Pattern {
    public static void main(String[] args) {
        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
    }
    static void Pattern1(){
        for (int i = 0; i < 5; i++) {
            System.out.print("* * * * *");
            System.out.println();
            //* * * * *
            //* * * * *
            //* * * * *
            //* * * * *
            //* * * * *
        }
        System.out.println();
    }
    static void Pattern2(){
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            //When one row is printed, we need to add a new line
            System.out.println();
        }

        //*
        //* *
        //* * *
        //* * * *
        //* * * * *

        System.out.println();
    }
    static void Pattern3(){
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
    }
    static void Pattern4(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //1
        //12
        //123
        //1234
    }
}
