package wangyi;

import java.util.Scanner;

/*
牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
输入描述:
每个输入包含一个测试用例。
每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。

输出描述:
输出牛牛最后面向的方向，N表示北，S表示南，E表示东，W表示西。

输入例子1:
3
LRR

输出例子1:
E
* */
public class GetLost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] chars = sc.next().toCharArray();
        char f = 'N';
        for (int i = 0; i < n; i++) {
            switch (f) {
                case 'N': {
                    if (chars[i] == 'L') f = 'W';
                    if (chars[i] == 'R') f = 'E';
                    break;
                }
                case 'S': {
                    if (chars[i] == 'L') f = 'E';
                    if (chars[i] == 'R') f = 'W';
                    break;
                }
                case 'W': {
                    if (chars[i] == 'L') f = 'S';
                    if (chars[i] == 'R') f = 'N';
                    break;
                }
                case 'E': {
                    if (chars[i] == 'L') f = 'N';
                    if (chars[i] == 'R') f = 'S';
                    break;
                }
            }
        }
        System.out.println(f);
    }
}
