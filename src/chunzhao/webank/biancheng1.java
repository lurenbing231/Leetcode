package chunzhao.webank;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tmp = 1;
        int i = 1;
        long[] falg = new long[128];
        falg[0] = 1;
        for (; i < 128; i++) {
            if (tmp > n) break;
            tmp *= 2;
            falg[i] = tmp;
        }
        falg[i] = 0;
        int res =0;
        if (i>1) res+=2;
        for (int j = 2; j < i; j++) {
            if (falg[0] + falg[j - 1]>n) break;
            res +=1* f(n, (falg[0] + falg[j - 1]), 1, j-2, falg);
        }
        System.out.println(res+"");
    }

    private static int f(long n, long sum, int start, int i, long[] falg) {
        if (i<start) return 1;
        if (start == i && n < (sum + falg[start])) return 1;
        if (start == i && n >= (sum + falg[start])) return 2;
        if (i - start == 1 && n < (sum + falg[start] + falg[i])) return 1;
        if (i - start == 1 && n >= (sum + falg[start] + falg[i])) return 2;
        if (n < (sum + falg[start] + falg[i])) {
            return 1 * f(n, (sum + falg[start] + falg[i]), start + 1, i - 1, falg);
        } else {
            return 2 * f(n, (sum + falg[start] + falg[i]), start + 1, i - 1, falg);
        }
    }
}
