package day190717;

import java.util.*;

//数组分割，求最小和差
public class banaryArr {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,8,8,80,90};
//        ArrayList list1 = new ArrayList(Collections.singleton(arr));
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int a:arr) {
            linkedList.add(a);
        }
        System.out.println(linkedList.toString());
//                Collections.addAll(linkedList, arr);
        solution(linkedList);
    }

    private static void solution(LinkedList<Integer> arr) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l1.addLast((int)arr.getLast());
        arr.removeLast();
        l2.addLast((int)arr.getLast());
        arr.removeLast();

        while (arr.size()>0){
            int sum1 = 0,sum2 = 0;
            for (int a:l1) {
                sum1+=a;
            }
            for (int a:l2) {
                sum2+=a;
            }
            if (sum1>sum2){
                l2.addLast((int)arr.getLast());
                arr.removeLast();
            }else {
                l1.addLast((int)arr.getLast());
                arr.removeLast();
            }
        }

        System.out.println("l1为："+l1.toString());
        System.out.println("l2为："+l2.toString());
    }
}
