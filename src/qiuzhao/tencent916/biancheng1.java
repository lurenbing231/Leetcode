package qiuzhao.tencent916;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for1:
        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            for (int b = 1; b <= B; b++) {
                int tmp = A * b;
                if (tmp % B == C) {
                    System.out.println("YES");
                    continue for1;
                }
            }
            System.out.println("NO");
        }
    }
}
