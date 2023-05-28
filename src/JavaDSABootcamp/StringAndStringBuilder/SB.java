package JavaDSABootcamp.StringAndStringBuilder;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+ i);
            //This way we don't create extra objects as we did in StringPerformance lecture, we are just modifying it.
            builder.append(ch);
        }
        System.out.println(builder);
        //Prints abcdefghijklmnopqrstuvwxyz

        builder.deleteCharAt(0);

        System.out.println(builder);
        //Prints bcdefghijklmnopqrstuvwxyz

        builder.reverse();

        System.out.println(builder);
        //Prints zyxwvutsrqponmlkjihgfedcb
    }
}
