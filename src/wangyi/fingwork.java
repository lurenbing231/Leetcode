package wangyi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，牛牛依然使用自己的标准来帮助小伙伴们。牛牛的小伙伴太多了，于是他只好把这个任务交给了你。
输入描述:
每个输入包含一个测试用例。
每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
保证不存在两项工作的报酬相同。

输出描述:
对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。

输入例子1:
3 3
1 100
10 1000
1000000000 1001
9 10 1000000000

输出例子1:
100
1000
1001
*/
public class fingwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] t = new int[n + m + 1];
        int[] d = new int[n + 1];
        int[] v = new int[n + m + 1];
        int[] a = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            v[i] = sc.nextInt();
            d[i] = t[i];
        }
        for (int i = 1; i <= m; i++) {
            t[i + n] = sc.nextInt();
            a[i] = t[i + n];
        }
        Arrays.sort(t, 1, n + m + 1);
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 1; i <= n + m; i++) {
            if (null == map.get(t[i])) {
                map.put(t[i], ++cnt);
            }
        }
        int[] res = new int[n + m + 1];
        for (int i = 1; i <= n; i++) res[map.get(d[i])] = Math.max(res[map.get(d[i])], v[i]);
        for (int i = 2; i <= n + m; i++) res[i] = Math.max(res[i], res[i - 1]);
        for (int i = 1; i <= m; i++) {
            System.out.println(res[map.get(a[i])]);
        }
    }
}
