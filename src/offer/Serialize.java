package offer;

import org.junit.Test;

public class Serialize {
    public class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val).append(",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    private int n = -1;

    private TreeNode Deserialize(String str) {
        if (str == null) {
            return null;
        }
        String[] strs = str.split(",");
        return Deserialize2(strs);
    }

    private TreeNode Deserialize2(String[] strs) {
        n++;
        TreeNode node = null;
        if (!strs[n].equals("#")) {
            node = new TreeNode(Integer.parseInt(strs[n]));
            node.left = Deserialize2(strs);
            node.right = Deserialize2(strs);
        }
        return node;
    }

    @Test
    public void test() {
        String strs = "8,6,10,5,7,9,11";
        Deserialize(strs);
    }
}
