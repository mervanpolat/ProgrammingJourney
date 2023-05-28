package JavaDSABootcamp.StringAndStringBuilder;

public class StringComparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";

        //==
        System.out.println(a==b);
        //Prints true

        String name1 = new String("Mervan");
        String name2 = new String("Mervan");

        System.out.println(name2==name1);
        //Prints false

        System.out.println(name1.equals(name2));
        //Prints true
    }
}
