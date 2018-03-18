package Algroithms;


import java.util.Scanner;

public class Prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("节点数：");
        int n = sc.nextInt();
        System.out.println("边数：");
        int m = sc.nextInt();
        int[][] v = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            v[a][b] = c;
            v[b][a] = c;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (v[i][j] == 0) v[i][j] = Integer.MAX_VALUE;
            }
        }
        int[] res = new int[n];
        res[0] = 0;
        toPrim(v, res, n);
    }

    private static void toPrim(int v[][], int res[], int n) {
        //用来记录权值
        int d[] = new int[n];
        //用来记录点是否已经取过
        int tmp[] = new int[n];
        tmp[0] = 1;
        //用于比较
        int t;
        //用于记录点
        int k = 0;
        //记录最终权值和
        int num = 0;
        for (int i = 1; i < n; i++) {
            d[i] = v[0][i];
        }
        for (int i = 1; i < n; i++) {
            t = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (d[j] < t && d[j] != 0) {
                    t = d[j];
                    k = j;
                }
            }
            num += t;
            res[i] = k;
            d[k] = 0;
            //更新权值d[]数组
            for (int j = 0; j < n; j++) {
                if (d[j] != 0 && d[j] > v[k][j]) {
                    d[j] = v[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("第" + (i + 1) + "个放入的点是：" + res[i]);
        }
        System.out.println("权值和为：" + num);
    }
}
