package node;

public class Node {

    private Node next;
    private int data;

    public void append(Node next){
        Node currentNode = this;
        while (true){
            Node tepNode=this.next;
            if(tepNode==null){
                break;
            }
            currentNode=tepNode;
        }
        currentNode.next=next;
    }
    public void insert(Node next){

    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
    public int getData(){
        return this.data;
    }

    public Node next(){
        return this.next;
    }

    public Node(int data) {

        this.data = data;
    }
}
