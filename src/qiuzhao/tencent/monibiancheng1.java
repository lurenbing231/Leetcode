package qiuzhao.tencent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class monibiancheng1 {
    static Map<Integer, Integer> map = new HashMap<>();
    public static long[][] arr = new long[101][101];
    static int k;
    static int A;
    static int X;
    static int B;
    static int Y;

    public static void inint(int[][] a){
        a[0][0] = 1;
        for (int i=1;i<=100;i++) {
            a[i][0] = 1;
            for (int j =1;k<=100;j++) {
                a[i][j] = (a[i-1][j-1]*a[i-1][j])%1000000007;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        A = sc.nextInt();
        X = sc.nextInt();
        B = sc.nextInt();
        Y = sc.nextInt();
        getMap(X, Y, k);
        long result = 0;
        for (Integer integer : map.keySet()) {
            long fm = 1;
            long fz = 1;
            for (int i = 0; i<integer; i++) {
                fm *= (X-i);
            }
            for (int i = integer; i > 0; i--) {
                fz *= i;
            }
            long a = fm / fz;
            fm = 1;
            fz = 1;
            for (int i = 0; i<integer; i++) {
                fm *= (Y-i);
            }
            for (int i = map.get(integer); i > 0; i--) {
                fz *= i;
            }
            long b = fm / fz;
            result = result + a * b;
        }
        System.out.println(result % 1000000007);
    }

    private static void getMap(int x, int y, int l) {
        if (l < 0 || x < 0 || y < 0) {
            return;
        }
        if (l == 0) {
            map.put(X - x, Y - y);
            return;
        }
        getMap(x - 1, y, l - A);
        getMap(x, y - 1, l - B);
    }
}
