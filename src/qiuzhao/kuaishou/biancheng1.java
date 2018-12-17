package qiuzhao.kuaishou;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        int tmp = a % b;
        String s = (double) tmp / (double) b + "";
        String strs = s.substring(2);
        String res = "";
        int x = 0;
        if (strs.length() >= 16) {
            for1:
            for (int i = 1; i < 8; i++) {
                for (; x < 15; x++) {
                    res = strs.substring(x, x + i);
                    for (int j = x + i + 1; j < 15 && j + i < 15; j += i) {
                        if (!res.equals(strs.substring(j, j + i))) {
                            res = "";
                            break;
                        }
                    }
                    if (!res.equals("")) {
                        break for1;
                    }
                }
            }
        }
        if (res == "") {
            if (strs.equals("0")) {
                System.out.println(c);
            } else {
                System.out.println(c + "." + strs);
            }
        } else {
            System.out.println(c + "." +strs.substring(0,x) + "(" + res + ")");
        }
    }
}