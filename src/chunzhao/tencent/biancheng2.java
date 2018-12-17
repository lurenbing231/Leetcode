package chunzhao.tencent;

import java.util.Scanner;

public class biancheng2 {
    private static int k = 0;
    private static long res = 0;
    private static int X = 0;
    private static int Y = 0;
    private static int A = 0;
    private static int B = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        A = sc.nextInt();
        X = sc.nextInt();
        B = sc.nextInt();
        Y = sc.nextInt();
        for (int i = 0; i <= X; i++) {
            if (A*i>k) break;
            for (int j = 0; j <= Y; j++) {
                if (A*i+B*j==k) {
                    long ac = 1;
                    long ab = 1;
                    long bc = 1;
                    long bb = 1;
                    for (int a = 0; a < i; a++) ac *= (X - a);
                    for (int a = 1; a <= i; a++) ab *= a;
                    for (int b = 0; b < j; b++) bc *= (Y - b);
                    for (int b = 1; b <= j; b++) bb *= b;
                    res += (ac / ab) * (bc / bb);
                }
                if (A*i+B*j>k) break;
            }
        }
        System.out.println(res % 1000000007 + "");
    }
}
