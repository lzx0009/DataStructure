package tree;

public class Treenode {

    int data;
    Treenode rightNode;
    Treenode leftNode;

    @Override
    public String toString() {
        return "Treenode{" +
                "data=" + data +
                ", rightNode=" + rightNode +
                ", leftNode=" + leftNode +
                '}';
    }

    //ǰ�����  ��->��->��
    public void fountShow(){
        System.out.print(this.data+" ");
        if (this.leftNode!=null){
            this.leftNode.fountShow();
        }
        if (this.rightNode!=null){
            this.rightNode.fountShow();
        }
    }

    public Boolean findNode(Treenode node){
        if (this==node)return true;
        if (this.leftNode!=null){
            this.leftNode.findNode(node);
        }
        if (this.rightNode!=null){
            this.rightNode.findNode(node);
        }
        return false;
    }
    public Treenode(int data) {
        this.data = data;
    }

    public void setRightNode(Treenode node){
        this.rightNode=node;
    }
    public void setLeftNode(Treenode node){
        this.leftNode=node;
    }

    public Treenode rightNode(){
        return this.rightNode;
    }
    public Treenode leftNode(){
        return this.leftNode;
    }
    public int getData(){
        return this.data;
    }
}
