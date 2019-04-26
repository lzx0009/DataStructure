package practice;

public class Main {

    public static void main(String[] args){
        ListNode a = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        ListNode a4 = new ListNode(5);
        System.out.println(a.getData());
        System.out.println("׷�ӽڵ�");
        a.append(new ListNode(2));
        System.out.println(a.next().getData());
        a.append(a2);
        System.out.println(a.next().next().getData());
        a.append(new ListNode(4)).append(new ListNode(5));
        System.out.println(a.next().next().next().getData());
        System.out.println(a.next().next().next().next().getData());
        System.out.println("ok");
        System.out.println(a.toString());
    }
}
