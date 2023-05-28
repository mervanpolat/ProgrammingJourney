package JavaDSABootcamp.OOP6;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> listNum = Arrays.asList(1,2,44,6,75);
        List<String> listStr = Arrays.asList("Hallo" , "Hello", "Hola");
        Wildcard.printList(listNum);
        System.out.println();
        Wildcard.printList(listStr);
    }
}
