package chunzhao.jiritoutiao;

import java.util.Scanner;

public class biancheng2 {
    private static long res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int m = sc.nextInt();
        int[] a1 = new int[n1];
        int[] b1 = new int[n2];
        for (int i=0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        for (int i=0;i<n2;i++){
            b1[i] = sc.nextInt();
        }
        f(a1, n1 - 1, b1, n2 - 1, m);
        System.out.println(res%1000000007 + "");
    }

    private static void f(int[] a1, int i, int[] b1, int j, int m) {
        if (m == 0) {
            res++;
            return;
        }
        if (j < 0) return;
        if (i < 0) return;
        if (m < 0) return;
        for (int k = 0; k <= i; k++) {
            f(a1, i - k, b1, j, m - a1[i - k]);
        }
        f(a1, i, b1, j - 1, m - a1[j]);
    }
}
