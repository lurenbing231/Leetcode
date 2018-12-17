package qiuzhao.xiecheng;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int res = 0;
        while (n > 0) {
            if (n%2==1) {
                res++;
            }
            n=n/2;
        }
        System.out.println(res);
    }
}
