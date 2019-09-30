package test.ss;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in = null;
        if (sc.hasNextLine()){
            in = sc.nextLine().split(" ");
        }

        int len = Integer.parseInt(in[1]);
        String s = in[0];
        int count =0;

//        s = s.substring(0,len);
        int lens = s.length();
        for (int i =0; i<lens; i++){
            char c = s.charAt(i);
            if((c<='z'&&c>='a') || (c<='Z'&&c>='A') || (c<='9'&&c>='0')){
            }else {
                count++;
                System.out.println("异常："+c);
            }
        }
        if (count == lens)count=0;
        System.out.println("retrun: "+s.substring(0,len-count));
    }
}
