package chunzhao.xiecheng;

import java.util.Scanner;

public class bishi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (t[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (t[j] != 0) {
                        t[i] = t[j];
                        t[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(t[i] + "");
        }
    }
}
