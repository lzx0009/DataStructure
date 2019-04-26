package tree;

public class BinarTree {
    Treenode node;

    public Treenode getNode() {
        return node;
    }

    public void setNode(Treenode node) {
        this.node = node;
    }

    public void fountShow() {
        node.fountShow();
    }

    public void findNode(Treenode node) {

        if(node.findNode(node)){

            System.out.println("�ҵ���");
        }else {
            System.out.println("�Ҳ�����");

        }
    }
}
