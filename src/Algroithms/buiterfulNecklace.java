package Algroithms;

import java.util.Scanner;

/*妞妞参加了Nowcoder Girl女生编程挑战赛, 但是很遗憾, 她没能得到她最喜欢的黑天鹅水晶项链。

于是妞妞决定自己来制作一条美丽的项链。一条美丽的项链需要满足以下条件:

1、需要使用n种特定的水晶宝珠

2、第i种水晶宝珠的数量不能少于li颗, 也不能多于ri颗

3、一条美丽的项链由m颗宝珠组成

妞妞意识到满足条件的项链种数可能会很多, 所以希望你来帮助她计算一共有多少种制作美丽的项链的方案。

输入描述:
输入包括n+1行, 第一行包括两个正整数(1 <= n <= 20, 1 <= m <= 100), 表示水晶宝珠的种数和一条美丽的项链需要的水晶宝珠的数量。

接下来的n行, 每行两个整数li, ri(0 <= li <= ri <= 10), 表示第i种宝珠的数量限制区间。

输出描述:
输出一个整数, 表示满足限定条件的方案数。保证答案在64位整数范围内。

输入例子1:
3 5
0 3
0 3
0 3

输出例子1:
12*/
//背包问题
public class buiterfulNecklace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] tmp = new int[2][101];
        tmp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int sta = sc.nextInt();
            int end = sc.nextInt();
            tmp[i & 1] = new int[101];
            for (int j = sta; j <= end; j++) {
                for (int z = m; z >= j; z--) {
                    tmp[i & 1][z] += tmp[i + 1 & 1][z - j];
                }
            }
        }
        System.out.println(tmp[n & 1][m]);
    }
}
