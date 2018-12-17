package qiuzhao.wangyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int first = 0;
        int last = s.length() - 1;
        int res = 1;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                max++;
            } else {
                res = Math.max(res, max);
                max = 1;
            }
        }
        res = Math.max(res, max);
        if (s.charAt(first) != s.charAt(last)) {
            max=1;
            int j=last-1;
            int i =1;
            while (i<j){
                if (s.charAt(i) != s.charAt(i - 1)) {
                    max++;
                    i++;
                }else {
                    break;
                }
            }
            max++;
            while (j>i){
                if (s.charAt(j) != s.charAt(j + 1)) {
                    max++;
                    j--;
                }else {
                    break;
                }
            }
            res = Math.max(res,max);
        }
        System.out.println(res);
    }
}
