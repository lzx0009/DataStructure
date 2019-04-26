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
//        System.out.println("节点前驱是："+ndo.pre().data());
        System.out.println("节点为："+ndo.data());
//        System.out.println("节点后置为："+ndo.next().data());
        System.out.println("追加节点");
        DoubleNode a = new DoubleNode(4);
        System.out.println("jjjjjjjjjjjjjj"+a);
        ndo.append(a);
        System.out.println("新节点前驱是："+ndo.next().pre().data());
        System.out.println("节点为："+ndo.next().data());
//        System.out.println("节点后置为："+ndo.next().next().data());


    }
}
