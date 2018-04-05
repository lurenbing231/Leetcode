package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class printtree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (root == null) {
            return arrayList;
        }
        queue.offer(root);
        while (queue.size() != 0) {
            TreeNode tmp = queue.remove();
            if (tmp.left != null) {
                queue.offer(tmp.left);
            }
            if (tmp.right != null) {
                queue.offer(tmp.right);
            }
            arrayList.add(tmp.val);
        }
        return arrayList;
    }
}
