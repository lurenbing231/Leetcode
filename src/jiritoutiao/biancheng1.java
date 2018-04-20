package jiritoutiao;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length()<=0) {
            System.out.println("");
            return;
        }
        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int res = 0;
            int s = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] j = new int[n + 2][m + 2];
            for (int i = 0; i < n + 2; i++) {
                j[i][0] = -1;
                j[i][m + 1] = -1;
            }
            for (int i = 0; i < m + 2; i++) {
                j[0][i] = -1;
                j[n + 1][i] = -1;
            }
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x>n||m>n){
                System.out.println(""+0);
                break;
            }
            while (s < str.length()) {
                if (j[x][y] != -1) {
                    res++;
                } else {
                    break;
                }
                if (str.charAt(s) == 'u') {
                    x--;
                    s++;
                } else if (str.charAt(s) == 'd') {
                    x++;
                    s++;
                } else if (str.charAt(s) == 'l') {
                    y--;
                    s++;
                } else if (str.charAt(s) == 'r') {
                    y++;
                    s++;
                }
            }
            System.out.println(res + "");
        }
    }
}
