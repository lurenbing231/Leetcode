package qiuzhao.pdd;

import java.util.Scanner;

public class biancheng42 {
    private static int c = 0;
    private static int b = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int A = sc.nextInt();
        int R = sc.nextInt();
        if (A > M) {
            System.out.println("0.00000");
            return;
        }
        for (int i = 1; i <= R; i++) {
            find(M, A, R, i);
        }
        String tmp = (double) (c) / (double) (c + b) + "0000";
        System.out.println(tmp.substring(0, 7));
    }

    private static void find(int M, int A, int R, int k) {
        if (k >= A && k <= M) {
            c++;
            return;
        }
        if (k > M) {
            b++;
            return;
        }
        for (int i = 1; i <= R; i++) {
            find(M, A, R, k + i);
        }
    }
}
