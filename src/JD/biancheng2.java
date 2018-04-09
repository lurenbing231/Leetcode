package JD;

import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] n = new long[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextLong();
        }
        for (int i=0;i<t;i++){
            if (n[i] % 2 == 0) {
                long y = 1;
                while (n[i] % 2 == 0) {
                    n[i] = n[i] / 2;
                    y *= 2;
                }
                System.out.println(n[i] + " " + y);
            } else {
                System.out.println("No");
            }
        }
    }
}
