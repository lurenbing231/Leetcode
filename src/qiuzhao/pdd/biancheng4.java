package qiuzhao.pdd;

import java.util.Scanner;

public class biancheng4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int A = sc.nextInt();
        int R = sc.nextInt();
        if (M - A + 1 >= R) {
            System.out.println("1.00000");
            return;
        }
        if (A>M){
            System.out.println("0.00000");
            return;
        }
        String tmp = (double) (M - A + 1) / (double) R + "0000";
        System.out.println(tmp.substring(0, 7));
    }
}
