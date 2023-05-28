package JavaDSABootcamp.ArraysAndArraysList;
public class RollNumber {

    public static void main(String[] args) {

        /*An array is a collection of datatype (primitives, objects, complex datatype, etc.)
          that you can store.*/

        //Q: Store a roll number
        int a = 19;

        //Q: Store a person's name
        String name = "Mervan Polat";

        //Syntax
        //datatype[] variable_name = new datatype[size];

        //Q: Store 5 roll numbers
        int[] rnos = new int[5];

        /*Important: All the values assigned to the array have to be of the same data type.
                     You can't mix data types in arrays, also the below int[] means that rnos2, which is ref. variable
                     is pointing to an array object that contains data type of int.*/

        //This is a direct way of doing the same thing as we did for Q: Store 5 roll numbers
        int[] rnos2 = {1,2,3,4,5};

        //HOW DO ARRAYS WORK?

        //Declaration
        int[] ros;              /*Declaration of array. ros is getting defined in the stack,
                                  currently it's not pointing to an object.*/
        //Initialisation
        ros = new int[5];       //Object for ros array of int datatype has been created in the memory (heap).

        System.out.println(ros[2]);     //Prints 0 -> Because my arr ros is empty

        String[] arr = new String[4];
        System.out.println(arr[1]);     //Prints null -> null is a special value that you can only assign to non-primitives
                                        //               any ref. variable has by default null type like int[] ros;

    }
}
