package JavaDSABootcamp.Recursion;

public class WhatIsRecursion {
    public static void main(String[] args) {
        //Q: If all these functions have the same parameter and the same body, then why are you creating these functions
        //   again and again?
        //A: A simple solution to this is, call the functions itself.
        print(1);
    }

    static void print(int n){
        System.out.println(n);
        //1
        //2
        //3
        //4   
        //5
        if (n==5) return;
        //Prints itself
        print(n+1);
    }
}
