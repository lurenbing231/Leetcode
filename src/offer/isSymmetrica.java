package offer;

/*
请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
* */
public class isSymmetrica {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return isS(pRoot.left, pRoot.right);
    }

    boolean isS(TreeNode left, TreeNode right) {
        if (left != null && right != null){
            return left.val==right.val&&isS(left.left,right.right)&&isS(left.right,right.left);
        }
        if (left==right&&left==null) return true;
        return false;
    }
}
