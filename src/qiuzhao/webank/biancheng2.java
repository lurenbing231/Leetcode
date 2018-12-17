package qiuzhao.webank;

import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[7];
        for (int i = 1; i <= 6; i++) {
            n[i] = sc.nextInt();
        }
        int res = n[6];
        res += n[5];
        int tmp = n[1] - n[5] * 11;
        n[1] = tmp > 0 ? tmp : 0;
        res += n[4];
        tmp = n[2] - n[4] * 5;
        n[2] = tmp > 0 ? tmp : 0;
        if (tmp < 0) {
            tmp = n[1] + tmp * 4;
            n[1] = tmp > 0 ? tmp : 0;
        }
        if (n[3] != 0) {
            res += n[3] % 4 == 0 ? n[3] / 4 : n[3] / 4 + 1;
        }
        tmp = 4 - n[3] % 4;
        if (tmp == 1) {
            if (n[2] > 0) {
                n[2]--;
                n[1] = (n[1] - 5) > 0 ? (n[1] - 5) : 0;
            } else {
                n[1] = (n[1] - 9) > 0 ? (n[1] - 9) : 0;
            }
        }
        if (tmp == 2) {
            if (n[2] >= 3) {
                n[2] -= 3;
                n[1] = (n[1] - 6) > 0 ? (n[1] - 6) : 0;
            } else if (n[2] == 2) {
                n[2] = 0;
                n[1] = (n[1] - 10) > 0 ? (n[1] - 10) : 0;
            } else if (n[2] == 1) {
                n[2] = 0;
                n[1] = (n[1] - 14) > 0 ? (n[1] - 14) : 0;
            } else if (n[2] == 0) {
                n[1] = (n[1] - 18) > 0 ? (n[1] - 18) : 0;
            }
        }
        if (tmp == 3) {
            if (n[2] >= 5) {
                n[2] -= 5;
                n[1] = (n[1] - 7) > 0 ? (n[1] - 7) : 0;
            } else if (n[2] == 4) {
                n[2] = 0;
                n[1] = (n[1] - 11) > 0 ? (n[1] - 11) : 0;
            } else if (n[2] == 3) {
                n[2] = 0;
                n[1] = (n[1] - 15) > 0 ? (n[1] - 15) : 0;
            } else if (n[2] == 2) {
                n[2] = 0;
                n[1] = (n[1] - 19) > 0 ? (n[1] - 19) : 0;
            } else if (n[2] == 1) {
                n[2] = 0;
                n[1] = (n[1] - 23) > 0 ? (n[1] - 23) : 0;
            } else if (n[2] == 0) {
                n[2] = 0;
                n[1] = (n[1] - 27) > 0 ? (n[1] - 27) : 0;
            }
        }
        if (n[2] != 0) {
            res += n[2] % 9 == 0 ? n[2] / 9 : n[2] / 9 + 1;
        }
        tmp = (9 - n[2] % 9) * 4 == 36 ? 0 : (9 - n[2] % 9) * 4;
        if (n[1] - tmp > 0) {
            res += (n[1] - tmp) % 36 == 0 ? (n[1] - tmp) / 36 : (n[1] - tmp) / 36 + 1;
        }
        System.out.println(res);
    }
}
