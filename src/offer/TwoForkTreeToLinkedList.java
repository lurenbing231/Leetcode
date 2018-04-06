package offer;
/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。
* */

import org.junit.Test;

public class TwoForkTreeToLinkedList {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private TreeNode pre = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        ConvertAs(pRootOfTree);
        TreeNode res = pRootOfTree;
        while (res.left != null) {
            res = res.left;
        }
        return res;
    }

    private void ConvertAs(TreeNode root) {
        if (root == null) return;
        ConvertAs(root.left);
        root.left = pre;
        if (pre != null) pre.right = root;
        pre = root;
        ConvertAs(root.right);
    }

    @Test
    public void test() {
        TreeNode root = null;
        root = new TreeNode(10);
        root.left = new TreeNode(6);
        ;
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(16);
        TreeNode res = Convert(root);
    }
}
