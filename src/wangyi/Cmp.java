package wangyi;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/*
小明陪小红去看钻石，他们从一堆钻石中随机抽取两颗并比较她们的重量。
这些钻石的重量各不相同。在他们们比较了一段时间后，它们看中了两颗钻石g1和g2。
现在请你根据之前比较的信息判断这两颗钻石的哪颗更重。

给定两颗钻石的编号g1,g2，编号从1开始，
同时给定关系数组vector,其中元素为一些二元组，第一个元素为一次比较中较重的钻石的编号，第二个元素为较轻的钻石的编号。
最后给定之前的比较次数n。
请返回这两颗钻石的关系，若g1更重返回1，g2更重返回-1，无法判断返回0。
输入数据保证合法，不会有矛盾情况出现。

测试样例：
2,3,[[1,2],[2,4],[1,3],[4,3]],4
返回: 1
*/
public class Cmp {
    private class node {
        int max;
        int min;
    }

    public int cmp(int g1, int g2, int[][] records, int n) {
        LinkedList<Integer> tree1 = new LinkedList<>();
        LinkedList<Integer> tree2 = new LinkedList<>();
        tree1.add(g1);
        tree2.add(g2);
        while (tree1.size() != 0) {
            for (int i = 0; i < n; i++) {
                if (tree1.getFirst() == records[i][0]) {
                    if (records[i][1] == g2) {
                        return 1;
                    }
                    tree1.add(records[i][1]);
                }
            }
            tree1.removeFirst();
        }
        while (tree2.size() != 0) {
            for (int i = 0; i < n; i++) {
                if (tree2.getFirst() == records[i][0]) {
                    if (records[i][1] == g1) {
                        return -1;
                    }
                    tree2.add(records[i][1]);
                }
            }
            tree2.removeFirst();
        }
        return 0;
    }

    @Test
    public void test() {
        int g1 = 2;
        int g2 = 3;
        int[][] vector = {{1, 2}, {2, 4}, {1, 3}, {4, 3}};
        int n = 4;
        int res = cmp(g1, g2, vector, n);
    }
}
