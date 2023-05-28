package JavaDSABootcamp.StringAndStringBuilder;

public class WhatIsAString {
    public static void main(String[] args) {
        //a: is a reference variable pointing to 10
        //int: is a primitive stored in stack memory
        //int a = 10;

        //arr: is a reference variable pointing to the below object stored in heap
        int[]arr = {2,3,4,5,6,7,8,9};

        //name: is a reference variable pointing to "Mervan Polat".
        //String is a collection of characters
        String name = "Mervan Polat";

        //Strings are immutable due to security reasons
        String a = "Mervan";
        String b = "Mervan";

        System.out.println(a);    //Prints Mervan
        //Creating a new object in reference variable a
        a = "Kunal";
        System.out.println(a);    //Prints Kunal

        //Q: What's happening at line 20-23? A: We created a new object called Kunal.
        //Q: What happened to the object called "Mervan"? A: Garbage Collection :)

        /*Q: Why can't we modify String objects? p: person
          String p1,p2,p3,p4 --> "Mervan";
          Let's suppose one person decides to change his/her name, if it wasn't mutable all the other person's name will be changed too.
          For security reasons, that's why it is immutable.
        */

        System.out.println(name);
        //Prints Mervan Polat

    }
}
