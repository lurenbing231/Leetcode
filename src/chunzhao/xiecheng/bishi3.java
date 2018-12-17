package chunzhao.xiecheng;

import java.util.Scanner;

public class bishi3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strArray = s.split(" ");
        int n = strArray.length;
        int[][] t = new int[n][n];
        for (int i = 0; i < strArray.length; i++) {
            t[0][i] = Integer.parseInt(strArray[i]);
        }
        for (int i = 1; i < n; i++) {
            String s2 = in.nextLine();
            String[] strArray2 = s2.split(" ");
            for (int j = 0; j < n; j++) {
                t[i][j] = Integer.parseInt(strArray2[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print( t[j][i]+" ");
            }
            System.out.println();
        }
    }
}
