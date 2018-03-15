package AlgorithmsBook.Seek;

import org.junit.Test;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class TreePrinter {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int[][] printTree(TreeNode root) {
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        TreeNode last=root;
        TreeNode nlast=root;
        TreeNode tmp=root;
        int[][] result= new int[500][500];
        int a=0,b=0;
        if(root!=null){
            queue.add(root);
            while(queue.size()!=0){
                tmp=queue.poll();
                result[a][b]=tmp.val;
                if(last==tmp) {
                    last=nlast;
                    a++;
                    b=0;
                }else{
                    b++;
                }
                if(tmp.left!=null) {
                    queue.add(tmp.left);
                    nlast=tmp.left;
                }
                if(tmp.right!=null) {
                    queue.add(tmp.right);
                    nlast=tmp.right;
                }
            }
        }
        return result;
    }
    @Test
    public void test(){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        int[][] result=printTree(root);
        for (int i=0;i<result.length;i++){
            for (int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]+",");
            }
        }
    }
}
