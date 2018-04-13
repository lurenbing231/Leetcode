package offer;
/*
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
* */

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Print {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        ArrayList<Integer> tmp = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(pRoot);
        linkedList.add(null);
        while (linkedList.size() != 0) {
            TreeNode cnt = linkedList.removeFirst();
            if (cnt == null) {
                ArrayList<Integer> copy = new ArrayList<>(tmp);
                res.add(copy);
                tmp = new ArrayList<>();
                if (linkedList.size()>0) linkedList.add(null);
            } else {
                tmp.add(cnt.val);
                if (cnt.left != null) linkedList.add(cnt.left);
                if (cnt.right != null) linkedList.add(cnt.right);
            }
        }
        return res;
    }

    @Test
    public void test() {
        TreeNode root = null;
        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> res = Print(root);
        res = null;
    }
}
