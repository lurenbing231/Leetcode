package qiuzhao.huawei;

import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            StringBuilder s = new StringBuilder(strs[i]);
            s.reverse();
            strs[i] = s.toString();
            res = res + strs[i] + " ";
        }
        System.out.println(res.substring(0, res.length() - 1));
    }
}
