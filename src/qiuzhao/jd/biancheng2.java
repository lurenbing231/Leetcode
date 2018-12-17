package qiuzhao.jd;

import java.util.*;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flag = new int[n + 1];
        Map<Integer, long[]> temp = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            long[] tmp = new long[3];
            tmp[0] = sc.nextLong();
            tmp[1] = sc.nextLong();
            tmp[2] = sc.nextLong();
            temp.put(i, tmp);
            for (int j = 1; j < i; j++) {
                if (flag[i] != 1) {
                    if (temp.get(j)[0] < tmp[0] && temp.get(j)[1] < tmp[1] && temp.get(j)[2] < tmp[2]) {
                        flag[j] = 1;
                    }
                    if (temp.get(j)[0] > tmp[0] && temp.get(j)[1] > tmp[1] && temp.get(j)[2] > tmp[2]) {
                        flag[i] = 1;
                        break;
                    }
                }
            }
        }
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += flag[i];
        }
        System.out.println(res);
    }
}
