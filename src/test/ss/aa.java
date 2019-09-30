package test.ss;

import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        System.out.println("你好".length());
        Scanner sc = new Scanner(System.in);
        String in = null;
        if (sc.hasNextLine()){
            in = sc.nextLine();
        }
//        String[] s = in.split(" ");
//        int len = Integer.parseInt(s[1]);
//        String str = null;
//
//        str = s[0].substring(0,len);
//        char c = str.charAt(len-1);
//        if((c<'a' && c>'z')||(c<'A' && c>'Z'))
//        str = str.substring(0,len-1);
//        System.out.println(str);

        String[] split = in.split(",");
        int len = split.length;
        int i = 0;
        int[] num = new int[len];
        for (String s:split) {
            num[i++] = Integer.parseInt(s);
        }
        int sum = 0;
        int tep = 0;
        for (i=0;i<len;i++){
            if(num[i] <=0 && sum ==0){
                continue;
            }

            tep = tep+num[i];
            if (tep>sum){
                sum = tep;
            }

        }
        System.out.println(sum);
    }
}
