package day190902;

import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;

public class Queuedemo {
    public static void main(String[] args) {
//        Queue queue = new Queue() {
//        };

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.add(5);
        stack.push(7);
        stack.pop();
//        stack.pop();
        System.out.println(stack.toString());

        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);

    }
}
