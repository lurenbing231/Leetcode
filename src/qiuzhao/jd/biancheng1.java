package qiuzhao.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] E = new int[n + 1][n + 1];
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                E[a][b] = 1;
                E[b][a] = 1;
            }
            boolean res = true;
            List<Integer> shiyong = new ArrayList<>();
            for1:
            for (int x = 1; x <= n; x++) {
                if (shiyong.contains(x)) {
                    continue;
                } else {
                    List<Integer> dangqian = new ArrayList<>();
                    for (int y = 1; y <= n; y++) {
                        if (E[x][y] != 1 && !dangqian.contains(y)) {
                            dangqian.add(y);
                        }
                    }
                    for (Integer integer : dangqian) {
                        for (int y = 1; y <= n; y++) {
                            if (dangqian.contains(y) && E[integer][y] == 1) {
                                res = false;
                                break for1;
                            }
                            if (!dangqian.contains(y) && E[integer][y] != 1) {
                                res = false;
                                break for1;
                            }
                        }
                    }
                    shiyong.addAll(dangqian);
                }
            }
            System.out.println(res?"Yes":"No");
        }
    }
}
