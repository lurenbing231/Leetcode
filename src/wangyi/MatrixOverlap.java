package wangyi;
/*
平面内有n个矩形, 第i个矩形的左下角坐标为(x1[i], y1[i]), 右上角坐标为(x2[i], y2[i])。
如果两个或者多个矩形有公共区域则认为它们是相互重叠的(不考虑边界和角落)。
请你计算出平面内重叠矩形数量最多的地方,有多少个矩形相互重叠。

输入描述:
输入包括五行。
第一行包括一个整数n(2 <= n <= 50), 表示矩形的个数。
第二行包括n个整数x1[i](-10^9 <= x1[i] <= 10^9),表示左下角的横坐标。
第三行包括n个整数y1[i](-10^9 <= y1[i] <= 10^9),表示左下角的纵坐标。
第四行包括n个整数x2[i](-10^9 <= x2[i] <= 10^9),表示右上角的横坐标。
第五行包括n个整数y2[i](-10^9 <= y2[i] <= 10^9),表示右上角的纵坐标。

输出描述:
输出一个正整数, 表示最多的地方有多少个矩形相互重叠,如果矩形都不互相重叠,输出1。

输入例子1:
2
0 90
0 90
100 200
100 200

输出例子1:
2
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MatrixOverlap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        Set<Integer> xx = new HashSet<>();
        Set<Integer> yy = new HashSet<>();
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            xx.add(x1[i]);
        }
        for (int i = 0; i < n; i++) {
            y1[i] = sc.nextInt();
            yy.add(y1[i]);
        }
        for (int i = 0; i < n; i++) {
            x2[i] = sc.nextInt();
            xx.add(x2[i]);
        }
        for (int i = 0; i < n; i++) {
            y2[i] = sc.nextInt();
            yy.add(y2[i]);
        }
        int res = 0;
        for (int x : xx) {
            for (int y : yy) {
                int ans = 0;
                for (int i = 0; i < n; i++) {
                    if (x1[i] <= x && y1[i] <= y && x2[i] > x && y2[i] > y) ans++;
                }
                res = Math.max(res, ans);
            }
        }
        System.out.println("" + res);
    }
}
