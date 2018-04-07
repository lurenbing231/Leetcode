package offer;

/*
输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
* */

import org.junit.Test;

import java.util.ArrayList;

public class FindPath {

    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;

        }

    }

    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    private ArrayList<Integer> tmp = new ArrayList<>();

    private ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return res;
        FindPathtmp(root, target);
        return res;
    }

    private void FindPathtmp(TreeNode root, int target) {
        tmp.add(root.val);
        if (root.left == null && root.right == null) {
            if (target - root.val == 0) {
                ArrayList<Integer> copy = (ArrayList<Integer>) tmp.clone();
                res.add(copy);
                tmp.remove(tmp.size() - 1);
                return;
            } else {
                tmp.remove(tmp.size() - 1);
                return;
            }
        }
        if (root.left != null) {
            FindPathtmp(root.left, target - root.val);
        }
        if (root.right != null) {
            FindPathtmp(root.right, target - root.val);
        }
        tmp.remove(tmp.size() - 1);
    }

    @Test
    public void test() {
        TreeNode root = null;
        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        ArrayList<ArrayList<Integer>> res = FindPath(root, 22);
        res = null;
    }
}
