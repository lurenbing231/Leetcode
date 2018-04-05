package tencent;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        if (m == 1) {
            System.out.println(n / 2 + "");
        } else {
            long s = m*m;
            System.out.println(n/(2*m)*s);
        }
    }
}
