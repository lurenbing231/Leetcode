package offer;

import java.util.LinkedList;

/*
操作给定的二叉树，将其变换为源二叉树的镜像。
* */
public class Mirror {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public void Mirror(TreeNode root) {
        if (root == null) return;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(root);
        while (list.size() != 0) {
            TreeNode tmp = list.poll();
            if (tmp.left != null) {
                list.offer(tmp.left);
            }
            if (tmp.right != null) {
                list.offer(tmp.right);
            }
            TreeNode jh = tmp.left;
            tmp.left = tmp.right;
            tmp.right = jh;
        }
    }
}
