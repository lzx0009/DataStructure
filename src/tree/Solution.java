package tree;


public class Solution {

    private Treenode tNode;
    public String toString() {
        return tNode.toString();
    }

    public Treenode reConstructBinaryTree(int [] pre, int [] in) {

        if (pre.length==0) return new Treenode(0);
            Treenode fount = new Treenode(pre[0]);
            int fountIndex = 0;
            for (int i = 0; i < in.length; i++) {
                if (fount.data == in[i]) {
                    fountIndex = i;
                    break;
                }
            }
//        int[] pre = new int[]{1,2,4,7,3,5,6,8};
//        int[] in = new int[]{4,7,2,1,5,3,8,6};
            if (fountIndex == 0) {
                fount.leftNode = null;
            }else {

                int[] npre = new int[fountIndex];
                for (int i = 0; i < fountIndex; i++) {
                    npre[i] = pre[i + 1];
                }
                int[] nin = new int[fountIndex];
                for (int i = 0; i < fountIndex; i++) {
                    nin[i] = in[i];
                }

                fount.leftNode = reConstructBinaryTree(npre, nin);
            }

//        int[] pre = new int[]{1,2,4,7,3,5,6,8};
//        int[] in = new int[]{4,7,2,1,5,3,8,6};
            if (fountIndex + 1 == in.length) {
                fount.rightNode = null;
            } else{

                int[] npre1 = new int[in.length - fountIndex-1];
                for (int i = 0; i < in.length - fountIndex-1; i++) {
                    npre1[i] = pre[i + fountIndex + 1];
                }
                int[] nin1 = new int[in.length - fountIndex-1];
                for (int i = 0; i < in.length - fountIndex-1; i++) {
                    nin1[i] = in[i + fountIndex + 1];
                }
                fount.rightNode = reConstructBinaryTree(npre1, nin1);
            }


            return fount;



    }
}
