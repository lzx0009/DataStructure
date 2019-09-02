package day190808;

import java.util.ArrayList;

//输出数组的全部组合方式
public class pinshu {
    public static void main(String[] args) {

        System.out.println(RectCover("1234"));

    }
    public static ArrayList<String> RectCover(String s) {

        ArrayList<String> list = new ArrayList<String>();
        String[] c = s.split("");
        int count = s.length()-1;
        int n = sum(s.length());
        String tep = "";
        for (int i = 0; i < n; i++){
            if (count == 0){
                count = s.length()-1;
            }
            String ss = String.valueOf(c);
            list.add(ss);
//            System.out.println(Arrays.toString(c));//132  312  321 231 213

            tep = c[count];
            c[count] = c[count -1];
            c[count -1] = tep;

            count--;
        }

        return list;
    }

    private static int sum(int a) {
        if(a == 1){
            return 1;
        }
        return sum(a - 1)*a;
    }
}
