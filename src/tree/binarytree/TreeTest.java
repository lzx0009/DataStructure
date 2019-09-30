package tree.binarytree;

public class TreeTest {

    public static void main(String[] args) {
        //创建树
        BinaryTree bTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        bTree.setRoot(root);

        //为根节点创建子节点
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        root.setrNode(node3);
        root.setLNode(node2);
        node2.setLNode(node4);
        node2.setrNode(node5);
        node3.setLNode(node6);
        node3.setrNode(node7);

        //前序遍历
        bTree.fontShow();
        //中序遍历
        bTree.midShow();
        //后序遍历
        bTree.afterShow();
    }
}
