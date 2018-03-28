package wangyi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
小Q正在给一条长度为n的道路设计路灯安置方案。
为了让问题更简单,小Q把道路视为n个方格,需要照亮的地方用'.'表示, 不需要照亮的障碍物格子用'X'表示。
小Q现在要在道路上设置一些路灯, 对于安置在pos位置的路灯, 这盏路灯可以照亮pos - 1, pos, pos + 1这三个位置。
小Q希望能安置尽量少的路灯照亮所有'.'区域, 希望你能帮他计算一下最少需要多少盏路灯。

输入描述:
输入的第一行包含一个正整数t(1 <= t <= 1000), 表示测试用例数
接下来每两行一个测试数据, 第一行一个正整数n(1 <= n <= 1000),表示道路的长度。
第二行一个字符串s表示道路的构造,只包含'.'和'X'。

输出描述:
对于每个测试用例, 输出一个正整数表示最少需要多少盏路灯。

输入例子1:
2
3
.X.
11
...XX....XX

输出例子1:
1
3
* */
public class StreetLamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t + 1];
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            char[] chars = sc.next().toCharArray();
            int d = 0;
            for (int j = 0; j < chars.length; j++) {
                if ('.' == chars[j]) d++;
                if ('X' == chars[j]) {
                    if (d == 0) {
                        continue;
                    }
                    if (d % 3 == 0 || d % 3 == 2) {
                        res[i] += d / 3;
                        if (d % 3 != 0) {
                            res[i] += 1;
                        }
                        d = 0;
                    }
                    if (d % 3 == 1) {
                        res[i] += d / 3 + 1;
                        j++;
                        d = 0;
                    }
                }
            }
            if (d != 0) {
                res[i] += d / 3;
                if (d % 3 != 0) res[i]++;
            }
        }
        for (int i = 1; i <= t; i++) {
            System.out.println("" + res[i]);
        }
    }
}
