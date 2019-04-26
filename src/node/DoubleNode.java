package node;

public class DoubleNode {

    private int data;
    private DoubleNode next;
    private DoubleNode pre;

    public void append(DoubleNode node) {
        DoubleNode currentNode = this;
        while (true) {
            DoubleNode tep = currentNode.next;
            if (tep == null)
                break;
            currentNode = tep;
        }
        node.pre = currentNode;
        currentNode.next = node;
    }


    public int data(){
        return this.data;
    }
    public  DoubleNode pre(){
        return this.pre;
    }
    public DoubleNode next(){
        return this.next;
    }
    public DoubleNode(int data) {
        this.data = data;
    }
}
