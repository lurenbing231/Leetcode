package Algroithms;

import java.util.Scanner;

/*妞妞得到一个(1~n)的排列p1, p2, p3,...,pn, 听村里的老人牛牛说如果让这个排列变为:

对于所有的1 <= i <= n, 都满足pi ≠ i, 就可以获得Google Girl Hackathon的入场券。

妞妞仅允许的操作是: 交换排列中两个相邻的元素, 并且妞妞允许做这个操作任意次。

但是Google Girl Hackathon就快要开始了, 妞妞希望做最少的操作就使排列满足要求, 妞妞希望你能帮助她。


输入描述:
输入包括两行, 第一行包括一个正整数n(2 <= n <= 10^5), 表示排列的长度和范围。
第二行包括n个正整数p1, p2, p3,...,pn, 即妞妞得到的排列, 保证是一个1~n的排列。


输出描述:
输出一个整数, 表示妞妞需要的操作次数。

输入例子1:
5
1 4 3 5 2

输出例子1:
2*/
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int res = 0;
        p[1] = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            p[i] = sc.nextInt();
            if (p[i - 1] == i - 1) {
                p[i - 1] = p[i];
                p[i] = i - 1;
                res++;
            }
        }
        if (p[n] == n) {
            p[n] = n - 1;
            p[n - 1] = n;
            res++;
        }
        System.out.println(res + "");
    }
}
