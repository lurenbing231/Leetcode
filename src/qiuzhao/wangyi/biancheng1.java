package qiuzhao.wangyi;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int s = n-k;
            if (k == 1 || s == 0) {
                System.out.println("0 0");
                continue;
            }
            if (s < k - 1) {
                System.out.println("0 " + s);
            } else {
                System.out.println("0 " + (k - 1));
            }
        }
    }
}
