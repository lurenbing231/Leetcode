package leetcode;

import org.junit.Test;

import java.util.ArrayList;

/*知道前序、中序遍历*/
public class lastbianli {
    private int i = 0;

    //求后序遍历
    private void getlast(String pre, String zhong) {
        if (zhong == null) {
            return;
        }
        char root = pre.charAt(i++);
        int tmp = zhong.indexOf(root);
        getlast(pre, zhong.substring(0, tmp));
        getlast(pre, zhong.substring(tmp + 1));

        System.out.println(" " + root);
    }


    public class TreeNode {
        char val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    //求tree
    private TreeNode getTree(String pre, String zhong) {
        if (zhong.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(pre.charAt(i++));
        int tmp = zhong.indexOf(root.val);

        root.left = getTree(pre, zhong.substring(0, tmp));
        root.right = getTree(pre, zhong.substring(tmp + 1));
        return root;
    }

    @Test
    public void test() {
        TreeNode treeNode = getTree("HGEDBFCA", "EGBDHFAC");
        treeNode = null;
    }
}
