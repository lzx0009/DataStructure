package day190902;

public class findTwoChar {
    public static void main(String[] args) {
        String str = new String("86awe6rtca324");
        System.out.println(fingTwoChar(str, str.length()));
    }

    private static String fingTwoChar(String str, int length) {
        int i=0,j=0;
        String[] s = str.split("");
        while (i<length-1){
            j=i+1;
            while (j<length){
                if (s[i].equals(s[j])){
                    return s[j];
                } else {
                    j++;
                }
            }
            i++;
        }
        return null;
    }
}
