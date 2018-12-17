package qiuzhao.iqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] pre = new int[3];
        int[] last = new int[3];
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 3; i++) {
            pre[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            num1 += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(pre);
        for (int i = 3; i < 6; i++) {
            last[i - 3] = Integer.parseInt(String.valueOf(str.charAt(i)));
            num2 += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(pre);
        int tmp = Math.abs(num1 - num2);
        if (tmp == 0) {
            System.out.println(0);
            return;
        }
        if (num1 > num2) {
            System.out.println(getSum(tmp, pre, last));
        } else {
            System.out.println(getSum(tmp, last, pre));
        }
    }

    private static int getSum(int tmp, int[] max, int[] min) {
        if (9 - min[0] >= tmp || max[2] >= tmp) {
            return 1;
        }
        if (max[2] + max[1] >= tmp || 18 - min[0] - min[1] >= tmp || max[2] + (9 - min[0]) >= tmp) {
            return 2;
        }
        return 3;
    }
}
