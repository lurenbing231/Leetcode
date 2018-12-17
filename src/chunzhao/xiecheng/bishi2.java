package chunzhao.xiecheng;

import java.util.Scanner;

public class bishi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] t = new int[3][n];
        for (int i = 0; i < n; i++) {
            t[0][i] = in.nextInt();
            t[1][i] = in.nextInt();
            t[2][i] = in.nextInt();
        }
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (a <= t[0][i] && b <= t[1][i]) {
                res = c * t[2][i];
                c = i;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (c == i) {
                System.out.print(1 + ",");
                continue;
            }
            System.out.print(0 + ",");
        }
        System.out.print((float) res + "");
    }
}
