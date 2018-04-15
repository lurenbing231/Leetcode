package jiritoutiao;

import java.util.Scanner;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            long[] ints = new long[m];
            for (int j = 0; j < m; j++) {
                ints[j] = sc.nextLong();
            }
            if (m <= 1) {
                System.out.println(0 + "");
            } else if (m == 2) {
                System.out.println(ints[1] - ints[0] + "");
            } else {
                int start = 1;
                int last = m - 2;
                while (start < m && last >= 0) {
                    if (ints[start] - ints[0] == ints[m - 1] - ints[last]) {
                        System.out.println(ints[start] - ints[0] + "");
                        break;
                    } else if (ints[start] - ints[0] < ints[m - 1] - ints[last]) {
                        start++;
                    } else if (ints[start] - ints[0] > ints[m - 1] - ints[last]) {
                        last--;
                    }
                }
            }
        }
    }
}
