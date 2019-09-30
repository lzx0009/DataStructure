package tree.binarytree;

public class BinaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void fontShow() {
        System.out.print("前序遍历：");
        root.fontShow();
        System.out.println(" 遍历完成！");
    }

    public void midShow() {
        System.out.print("中序遍历：");
        root.midShow();
        System.out.println(" 遍历完成！");
    }

    public void afterShow() {
        System.out.print("后序遍历：");
        root.afterShow();
        System.out.println(" 遍历完成！");
    }
}
