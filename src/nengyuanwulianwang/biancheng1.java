package nengyuanwulianwang;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, m;
        int v, p, q;
        int[][] group = new int[60 + 20][3];
        int[][] material = new int[60][3];
        int j = 0;
        int k = 0;
        int sum = 0;
        int[] dq = new int[32000];
        N = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            v = sc.nextInt();
            p = sc.nextInt();
            q = sc.nextInt();
            material[i][0] = q;
            material[i][1] = v;
            material[i][2] = p;
        }
        for (int i = 0; i < m; i++) {
            if (material[i][0] == 0) {
                j++;
                group[sum][1] = j;
                group[sum][2] = material[i][1] * material[i][2];
                group[sum][0] = material[i][1];
                k = 0;
                sum++;
            } else {
                k++;
                if (k != 2) {
                    group[sum][1] = j;
                    group[sum][2] = material[i][1] * material[i][2] + group[sum - 1][2];
                    group[sum][0] = material[i][1] + group[sum - 1][0];
                } else {
                    group[sum][1] = j;
                    group[sum][2] = material[i][1] * material[i][2] + group[sum - 2][2];
                    group[sum][0] = material[i][1] + group[sum - 2][0];
                    sum++;
                    group[sum][1] = j;
                    group[sum][2] = material[i][1] * material[i][2] + group[sum - 2][2];
                    group[sum][0] = material[i][1] + group[sum - 2][0];
                }
                sum++;
            }
        }
        sum = 0;
        for (int i = 1; i <= j; i++) {
            for (int n = N; n > 0; n--) {
                k = 0;
                while (group[sum][1] == i) {
                    k++;
                    if (n - group[sum][0] >= 0)
                        dq[n] = Math.max(dq[n], dq[n - group[sum][0]] + group[sum][2]);
                    sum++;
                }
                sum = sum - k;
            }
            sum = sum + k;
        }
        System.out.println("" + dq[N]);
    }
}
