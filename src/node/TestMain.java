package node;

/**
 *
 */
public class TestMain {

    public static void main(String []args){

//        Node node = new Node(3);
//        System.out.println(node.toString());
//        node.append(new Node(4));
//        System.out.println(node.next().getData());

        DoubleNode ndo = new DoubleNode(3);
//        System.out.println("�ڵ�ǰ���ǣ�"+ndo.pre().data());
        System.out.println("�ڵ�Ϊ��"+ndo.data());
//        System.out.println("�ڵ����Ϊ��"+ndo.next().data());
        System.out.println("׷�ӽڵ�");
        DoubleNode a = new DoubleNode(4);
        System.out.println("jjjjjjjjjjjjjj"+a);
        ndo.append(a);
        System.out.println("�½ڵ�ǰ���ǣ�"+ndo.next().pre().data());
        System.out.println("�ڵ�Ϊ��"+ndo.next().data());
//        System.out.println("�ڵ����Ϊ��"+ndo.next().next().data());


    }
}
