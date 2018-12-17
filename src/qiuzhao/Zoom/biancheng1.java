package qiuzhao.Zoom;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while (n >= 3) {
            res += n / 3;
            n = n % 3 + n / 3;
        }
        if (n==2){
            res++;
        }
        System.out.println(res);
    }
}
