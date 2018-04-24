package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

public class treebianli {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //前序遍历
    private ArrayList<Integer> prebianli(TreeNode tree) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode node = tree;
        Stack<TreeNode> tmp = new Stack<>();
        while (!tmp.empty() || node != null) {
            while (node != null) {
                res.add(node.val);
                tmp.push(node);
                node = node.left;
            }
            if (!tmp.empty()) {
                node = tmp.pop();
                node = node.right;
            }
        }
        return res;
    }

    //中序遍历
    private ArrayList<Integer> zhongbianli(TreeNode tree) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode node = tree;
        Stack<TreeNode> tmp = new Stack<>();
        while (!tmp.empty() || node != null) {
            while (node != null) {
                tmp.push(node);
                node = node.left;
            }
            if (!tmp.empty()) {
                node = tmp.pop();
                res.add(node.val);
                node = node.right;
            }
        }
        return res;
    }

    //后序遍历
    private ArrayList<Integer> lastbianli(TreeNode tree) {
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode node = tree;
        Stack<TreeNode> tmp = new Stack<>();
        Stack<Integer> flag = new Stack<>();
        while (!tmp.empty() || node != null) {
            while (node != null) {
                tmp.push(node);
                flag.push(0);
                node = node.left;
            }
            while (!tmp.empty()&&flag.peek()==1){
                flag.pop();
                res.add(tmp.pop().val);
            }
            if (!tmp.empty()) {
                flag.pop();
                flag.push(1);
                node = tmp.peek();
                node = node.right;
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
        ArrayList<Integer> res = lastbianli(root);
        for (int i = 0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
