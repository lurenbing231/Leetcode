package offer;

/**
 * Created by zhaoliang on 2017/11/10.
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class RebuildTwoForksTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = aa(pre, 0, pre.length - 1, in, 0, pre.length - 1);
        return root;
    }


    private TreeNode aa(int[] pre, int prestart, int preend, int[] in, int instart, int inend) {
        if (prestart > preend || instart > inend) return null;
        TreeNode root = new TreeNode(pre[prestart]);
        for (int i = instart; i <= inend; i++) {
            if (pre[prestart] == in[i]) {
                root.left = aa(pre, prestart + 1, prestart + i - instart, in, instart, i - 1);
                root.right = aa(pre, prestart + i - instart + 1, preend, in, i + 1, inend);
            }
        }
        return root;
    }
}
