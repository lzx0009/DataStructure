package day190808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deno {

    public static void main(String[] args) {
        int[] i = new int[100];
        int[] l = new int[25];

        for (int i1 = 0; i1<25; i1++) {
            l[i1] = i[i1];
        }
        List lq = new ArrayList();
        i=null;
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(i));
    }
}
