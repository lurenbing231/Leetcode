package qiuzhao.kuaishou;

import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] n = str.split(",");
        int[] cost = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            cost[i] = Integer.parseInt(n[i]);
        }
        System.out.println(Math.min(cost[0] + sum(cost, 0), cost[1] + sum(cost, 1)));
    }

    private static int sum(int[] cost, int k) {
        if (k == cost.length - 1) {
            return 0;
        }
        if (k == cost.length - 2) {
            return cost[cost.length - 1];
        }
        return Math.min(cost[k + 1] + sum(cost, k + 1), cost[k + 2] + sum(cost, k + 2));
    }
}
