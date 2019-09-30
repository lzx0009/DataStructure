package tree.binarytree;

public class TreeNode {

    int value;
    //右节点
    TreeNode rNode;
    //左节点
    TreeNode lNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLNode(TreeNode treeNode) {
        this.lNode = treeNode;
    }

    public void setrNode(TreeNode rNode) {
        this.rNode = rNode;
    }

    //前序遍历 中-左-右
    public void fontShow() {
        System.out.print(value+" ");

        if(lNode != null){
            lNode.fontShow();
        }

        if (rNode!=null){
            rNode.fontShow();
        }
    }

    //中序遍历 左-中-右
    public void midShow() {
        if (lNode != null){
            lNode.midShow();
        }
        System.out.print(value+" ");

        if (rNode!=null){
            rNode.midShow();
        }

    }

    //后序遍历  左-右-中
    public void afterShow(){
        if (lNode != null){
            lNode.afterShow();
        }

        if (rNode!=null){
            rNode.afterShow();
        }

        System.out.print(value+" ");
    }
}
