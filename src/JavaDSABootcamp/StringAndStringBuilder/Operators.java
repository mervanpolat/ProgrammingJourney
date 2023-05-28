package JavaDSABootcamp.StringAndStringBuilder;
import JavaDSABootcamp.ArraysAndArraysList.ArraysList;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        //Integer will be converted to Integer that will call toString()
        //This is the same as after a few steps: "a" + "1"

        System.out.println("Kunal" + new ArrayList<>());
        //Prints Kunal[]
        System.out.println("Kunal" + new Integer(58));
        //If it's an object -> .toString() -> Prints Kunal58

        //Error: Operator + is only defined for primitives and if one of the below values are of type String
        //System.out.println(new Integer(57) + new ArrayList<>());
        System.out.println(new Integer(58) + "" + new ArrayList<>()); //--> Datatype will be of String
        //Prints 58[]
    }
}
