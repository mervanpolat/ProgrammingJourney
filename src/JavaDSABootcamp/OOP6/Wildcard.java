package JavaDSABootcamp.OOP6;

import java.util.List;

public class Wildcard {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }
}
