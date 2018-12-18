package chunzhao.tencent;

import java.util.Scanner;

public class tencentMoni1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean[] res = new boolean[t];
        for (int i = 0; i < t; i++) {
            res[i] = false;
        }
        int[][] x = new int[t][4];
        int[][] y = new int[t][4];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 4; j++) {
                x[i][j] = sc.nextInt();
            }
            for (int j = 0; j < 4; j++) {
                y[i][j] = sc.nextInt();
            }
            int a = ((x[i][0] - x[i][1]) * (x[i][0] - x[i][1]) + (y[i][0] - y[i][1]) * (y[i][0] - y[i][1]));
            int b = ((x[i][0] - x[i][2]) * (x[i][0] - x[i][2]) + (y[i][0] - y[i][2]) * (y[i][0] - y[i][2]));
            int c = ((x[i][3] - x[i][1]) * (x[i][3] - x[i][1]) + (y[i][3] - y[i][1]) * (y[i][3] - y[i][1]));
            int d = ((x[i][3] - x[i][2]) * (x[i][3] - x[i][2]) + (y[i][3] - y[i][2]) * (y[i][3] - y[i][2]));
            if (a == b && c == d && a == c) res[i] = true;
            a = ((x[i][0] - x[i][1]) * (x[i][0] - x[i][1]) + (y[i][0] - y[i][1]) * (y[i][0] - y[i][1]));
            b = ((x[i][0] - x[i][3]) * (x[i][0] - x[i][3]) + (y[i][0] - y[i][3]) * (y[i][0] - y[i][3]));
            c = ((x[i][2] - x[i][1]) * (x[i][2] - x[i][1]) + (y[i][2] - y[i][1]) * (y[i][2] - y[i][1]));
            d = ((x[i][3] - x[i][2]) * (x[i][3] - x[i][2]) + (y[i][3] - y[i][2]) * (y[i][3] - y[i][2]));
            if (a == b && c == d && a == c) res[i] = true;
            if (a == b && c == d && a == c) res[i] = true;
            a = ((x[i][0] - x[i][2]) * (x[i][0] - x[i][2]) + (y[i][0] - y[i][2]) * (y[i][0] - y[i][2]));
            b = ((x[i][0] - x[i][3]) * (x[i][0] - x[i][3]) + (y[i][0] - y[i][3]) * (y[i][0] - y[i][3]));
            c = ((x[i][2] - x[i][1]) * (x[i][2] - x[i][1]) + (y[i][2] - y[i][1]) * (y[i][2] - y[i][1]));
            d = ((x[i][3] - x[i][1]) * (x[i][3] - x[i][1]) + (y[i][3] - y[i][1]) * (y[i][3] - y[i][1]));
            if (a == b && c == d && a == c) res[i] = true;
        }
        for (int i=0;i<t;i++){
            if (res[i]){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
