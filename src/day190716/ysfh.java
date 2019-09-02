package day190716;

import java.util.LinkedList;

//约瑟夫环
public class ysfh {
    public static void main(String[] args) {
        int total = 5;
        int keynum = 3;
        LinkedList<Integer> sum = new LinkedList<>();
        for (int i = 0;i<total;i++){
            sum.add(i+1);
        }
        System.out.println("当前队伍："+sum.toString());
        int index = 0;
        while (sum.size()>1){
            for (int j=1 ; j<keynum ; j++){
                if (index == sum.size()-1){
                    index = 0;
                }else {
                    index++;
                }
            }
            System.out.println(sum.get(index)+" 被移除");
            sum.remove(index);
            System.out.println("队列："+sum.toString());
        }

        System.out.println("剩余："+sum.toString());
    }
}
