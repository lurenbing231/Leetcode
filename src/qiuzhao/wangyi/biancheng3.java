package qiuzhao.wangyi;

import java.util.*;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] flag = new int[m + 1];
        List<Integer> tg = new ArrayList<>();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            flag[a]++;
            if (a != 1) {
                tg.add(b);
            }
        }
        int res = 0;
        Collections.sort(tg);
        Arrays.sort(flag, 2, flag.length);
        max = flag[m - 1];
        while (max >= flag[1]) {
            res += tg.remove(0);
            flag[m - 1]--;
            Arrays.sort(flag);
            max = flag[m - 1];
        }
        System.out.println(res);
    }
}
