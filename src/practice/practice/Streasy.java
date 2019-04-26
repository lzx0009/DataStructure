package practice.practice;

import java.util.Scanner;

public class Streasy {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String st=null;
        if (in.hasNextLine()){

            st = in.nextLine();
        }
        in.close();
        String str = st+" ";

        char[] c = str.toCharArray();
        StringBuffer nst = new StringBuffer();
        int count=1;
        for (int i=1;i<c.length;i++){
            if (i>0){
                if (c[i]==c[i-1]){
                    count++;
                }else {
                    String a1=String.valueOf(count);
                    nst.append(c[i-1]).append(a1);
                    count=1;
                }
            }
        }
        System.out.println(nst);
    }
}
