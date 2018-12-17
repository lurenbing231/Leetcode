package qiuzhao.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] s = new int[n + 1][n + 1];
        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            s[x][y] = 1;
        }
        Stack<Integer> list = new Stack<>();
        list.push(1);
        int min = Integer.MAX_VALUE;
        for (int i = 2; i <= n; i++) {
            if (s[1][i] == 1 && !list.contains(i)) {
                list.push(i);
                min = Math.min(min, 1 + getLength(s, list, n, min,i));
                list.pop();
            }
        }
        System.out.println(min);
    }

    private static int getLength(int[][] s, Stack<Integer> list, int n, int min,int pre) {
        for (int i = 2; i <= n; i++) {
            if (s[pre][i] == 1 && !list.contains(i)) {
                list.push(i);
                min = Math.min(min, 1 + getLength(s, list, n, min,i));
                list.pop();
            }
        }
        return min;
    }
}
