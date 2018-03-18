package Algroithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*亮亮解出了卷轴隐藏的秘密，来到了一片沼泽地。这里有很多空地，而面试直通卡可能埋在任意一块空地中，
好在亮亮发现了一堆木材，他可以将木材铺在两个空地之间的沼泽地上。
因为亮亮不知道面试直通卡具体在哪一块空地中，所以必须要保证任意一块空地对于亮亮来说是可以抵达的。
 “怎么还有鳄鱼！没办法，看来有些空地不能直接到达了。”
 亮亮虽然没有洁癖，但是沼泽地实在太臭了，所以亮亮不会循环利用木材。
 而且木材不能拼接在一起使用，所以亮亮必须要知道在耗费木材最少的情况下，最长的那根木材至少需要多长。

输入描述:
第一行包含两个整数N(1≤N≤10000),M(1≤M≤1000000)。N表示公有N块空地。
接下来M行，每行包含三个整数P(1≤P≤N),Q(1≤Q≤N),K代表P,Q两个间没有鳄鱼，需要耗费K的木材。


输出描述:
一个整数，即耗费木材最少的情况下，最长的那根木材长度。

输入例子1:
4 3
1 2 1
2 3 1
3 4 2

输出例子1:
2*/
public class findBao {
    private static class node {
        int p;
        int q;
        int k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<node> v = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            node nodes = new node();
            nodes.p = sc.nextInt()-1;
            nodes.q = sc.nextInt()-1;
            nodes.k = sc.nextInt();
            v.add(nodes);
        }
        int[] res = new int[n];
        res[0] = 0;
        int result = toPrim(v, res, n);
        System.out.println(result + "");
    }

    private static int toPrim(List<node> v, int[] res, int n) {
        //用来记录权值
        int d[] = new int[n];
        //用来记录点是否已经取过
        int tmp[] = new int[n];
        tmp[0] = 1;
        //用于比较
        int t;
        //用于记录点
        int k = 0;
        //记录最终权值和
        int num = 0;
        //记录最小生成树的最大权值
        int result = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i).q == 0) {
                d[v.get(i).p] = v.get(i).k;
                v.remove(i);
            }
            if (v.get(i).p == 0) {
                d[v.get(i).q] = v.get(i).k;
                v.remove(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (d[i] == 0) d[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < n; i++) {
            t = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (d[j] < t && d[j] != 0) {
                    t = d[j];
                    k = j;
                }
            }
            num += t;
            res[i] = k;
            if (d[k] > result) result = d[k];
            d[k] = 0;
            //更新权值d[]数组
            for (int j = 0; j < n; j++) {
                for (int z = 0; z < v.size(); z++) {
                    if (d[j] != 0 && d[j] > v.get(z).k&&((v.get(z).p==j&&v.get(z).q==k)||(v.get(z).p==k&&v.get(z).q==j))) {
                        d[j] = v.get(z).k;
                        v.remove(z);
                    }
                }
            }
        }
        return result;
    }
}
