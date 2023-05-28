package JavaDSABootcamp.MathDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Eingabe: "); //prompt user for input
        int n = input.nextInt(); //read user input

        factors(n); //call factors() method with input n
        //Example input: 20
        //Prints 1 2 4 5 10 20
        System.out.println();

        factors2(n); //call factors2() method with input n
        //Example input: 20
        //Prints 1 20 2 10 4 5

        System.out.println();

        factors3(n); //call factors3() method with input n
        //Example input: 20
        //Prints 1 2 4 5 10 20
    }

    static void factors(int n) {
        for (int i = 1; i <= n; i++) { //loop through all numbers from 1 to n
            if (n % i == 0) { //check if n is divisible by i
                System.out.print(i + " "); //print i if it is a factor of n
            }
        }
    }

    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) { //loop through all numbers from 1 to sqrt(n)
            if (n % i == 0) { //check if n is divisible by i
                if (n/i == i) { //if i is the square root of n, print i without its pair
                    System.out.print(i);
                } else { //otherwise, print both i and its pair
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }

    //both time and space will be O(sqrt(n))
    static void factors3(int n) {
        ArrayList<Integer> list = new ArrayList<>(); //initialize an empty ArrayList
        for (int i = 1; i <= Math.sqrt(n); i++) { //loop through all numbers from 1 to sqrt(n)
            if (n % i == 0) { //check if n is divisible by i
                if (n/i == i) { //if i is the square root of n, print i without its pair
                    System.out.print(i + " ");
                } else { //otherwise, print i and add its pair to the ArrayList
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) { //loop through the ArrayList in reverse order
            System.out.print(list.get(i) + " "); //print each element in the ArrayList
        }
    }
}