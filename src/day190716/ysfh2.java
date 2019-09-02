package day190716;

import java.util.Arrays;

public class ysfh2 {

    public static void main(String[] args) {
        int win = solution(5,3);
        System.out.println("剩下一位是："+win);
    }

    public static int solution(int n, int m) {
        boolean[] child = new boolean[n];
        for(int i=0;i<n;i++){
            child[i]=true;
        }

        int count = 0;
        int index = 0;
        int other = n;

        while(other>1){
            if(child[index]){
                count++;
                if(count == m){
                    count = 0;
                    child[index] = false;
                    other--;
                }
                if(index == n-1){
                    index = 0;
                }
            }
            index++;
        }


        for(int i= 0;i<n;i++){
            if(child[i]){
                return i;
            }
        }

        return -1;
    }
//    public static int solution(int total, int key){
//        int other = total;
//        boolean[] flag = new boolean[total];
//        for (int i= 0; i<total ; i++){
//            flag[i] = true;
//        }
//        System.out.println("初始化"+Arrays.toString(flag));
//
////       用来记录当前数到的位置
//        int index = 0;
//        int count = 0;
//        while (other > 1) {
//            if (flag[index]) {
//                //说明还没有被淘汰 计数器加1
//                count++;
//
//                if (count == key) {
//                    count = 0; //计数器归0
//                    flag[index] = false; //此人被淘汰
//                    other--;//未被淘汰的人数-1
//                }
//            }
//            index++;
//
//            //当当前人等于总人数时，则又从第一人开始计数
//            if (index == total) {
//                index = 0;
//            }
//        }
//        for (int j = 0 ; j<total; j++){
//            if (flag[j]){
//                return j+1;
//            }
//        }
//        return -1;
//    }
}
