package tree;

public class Test {
    public static void main(String[] args){
        Solution a = new Solution();
        int[] pre = new int[]{1,2,4,7,3,5,6,8};
        int[] in = new int[]{4,7,2,1,5,3,8,6};

        System.out.println(a.reConstructBinaryTree(pre,in).toString());



//        BinarTree tree = new BinarTree();
//        Treenode root = new Treenode(1);
//        tree.setNode(root);
//        Treenode n1= new Treenode(2);
//        Treenode n2= new Treenode(3);
//
//        root.setLeftNode(n1);
//        root.setRightNode(n2);
//        n1.setLeftNode(new Treenode(4));
//        n1.setRightNode(new Treenode(5));
//        n2.setLeftNode(new Treenode(6));
//        n2.setRightNode(new Treenode(7));
//
//        Treenode a = new Treenode(9);
//        tree.findNode(a);
//        tree.fountShow();
    }
}
