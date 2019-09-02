package day190715;

import java.util.ArrayList;
import java.util.Stack;

public class Stackdemo {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println(s1.toString());
        s1.push(4);
        System.out.println(s1.toString());
        System.out.println("输出pop：");

        int ad[] = new int[4];
        for (int a:ad) {
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            int pop = s2.pop();
            while (!s2.empty()){
                s1.push(s2.pop());
            }
            System.out.println(pop);
        }


    }
}
