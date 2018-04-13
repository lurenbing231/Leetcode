package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
给定一颗二叉搜索树，请找出其中的第k大的结点。
例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
* */
public class KthNode {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null||k==0) return null;
        ArrayList<TreeNode> res = new ArrayList<>();
        setList(pRoot, res);
        if (res.size()<k) return null;
        Collections.sort(res, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                int a = o1.val;
                int b = o2.val;
                return a > b ? 1 : -1;
            }
        });
        return res.get(k - 1);
    }

    private void setList(TreeNode pRoot, ArrayList<TreeNode> res) {
        if (pRoot == null) return;
        res.add(pRoot);
        setList(pRoot.left, res);
        setList(pRoot.right, res);
    }
}
