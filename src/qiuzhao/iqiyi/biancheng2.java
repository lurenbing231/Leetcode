package qiuzhao.iqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        int[] A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        sc.nextLine();
        for (int i = 0; i < M; i++) {
            String[] strs = sc.nextLine().split(" ");
            if (strs[0].equals("A")) {
                A[Integer.parseInt(strs[1])]++;
            } else {
                A[Integer.parseInt(strs[1])]--;
            }
        }
        int tmp = A[P];
        Arrays.sort(A);
        int res = 1;
        for (int i = N; i >= 0; i--) {
            if (A[i] == tmp) {
                System.out.println(res);
                return;
            }
            res++;
        }
    }
}
