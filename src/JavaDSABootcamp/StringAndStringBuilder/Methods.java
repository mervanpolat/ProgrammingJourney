package JavaDSABootcamp.StringAndStringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Mervan Polat";
        System.out.println(name.toCharArray());
        //Mervan Polat
        System.out.println(Arrays.toString(name.toCharArray()));
        //[M, e, r, v, a, n,  , P, o, l, a, t]
        System.out.println(name.toLowerCase());
        //mervan polat
    }
}
