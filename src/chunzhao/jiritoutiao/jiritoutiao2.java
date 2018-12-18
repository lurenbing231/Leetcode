package chunzhao.jiritoutiao;

import java.util.Scanner;

public class jiritoutiao2 {
    private static int n;
    private static int res = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String s = "a";
        String m = s;
        t(s, m, 0);
        System.out.println("" + res);
    }

    private static void t(String s, String m, int r) {
        if (s.length() == n && r < res) {
            res = r;
            return;
        }
        if ((s + s).length() <= n) {
            t(s + s, s, r + 1);
        }
        if ((s + m).length() <= n) {
            t(s + m, m, r + 1);
        }
        return;
    }
}
