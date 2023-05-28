package JavaDSABootcamp.Recursion;

public class ConceptOfPassingNumbers {
    public static void main(String[] args) {
        fun(5);
        //Stack Overflow Error -> But Why? -> Explained at notes
        System.out.println();
        //Code fixed
        fun(5);
        //Prints 5 4 3 2 1
    }

    //What will be the output of the following recursive call?
    static void fun(int n) {
        if (n==0)return;

        System.out.print(n + " ");
        fun(--n);
    }
}
