package day190715;

public class findDiff {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,3,2,4};

//        通过二进制异或操作，发现不同项。
        int res = 2^4^3^4^2;

        System.out.println("不同项为："+res);
    }
}
