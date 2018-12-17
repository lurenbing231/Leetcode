package chunzhao.wanmeishijie;
/*使用迪杰斯特拉算法，计算无向带权图上任意一个节点到其他节点的距离。
输入
输入：n,p,无向连通带权图g.g是一个n*n的邻接矩阵。如果i，j之间无法通行，则G[i][j] = -1。
输出
第p个点到其他点的最短距离。用逗号分隔。顺序为从0到n。
样例输入
6 0
-1 1 4 -1 -1 -1
1 -1 2 7 5 -1
4 2 -1 -1 1 -1
-1 7 -1 -1 3 2
-1 5 1 3 -1 6
-1 -1 -1 2 6 -1
样例输出
1,3,7,4,9*/

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[][] g = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = sc.nextInt();
            }
        }
        int[] tmp = new int[n];
        int[] flag = new int[n];
        flag[p] = 1;
        int i = 1;
        int bj = p;
        while (i <= n) {
            for (int j = 0; j < n; j++) {
                if (tmp[j] == 0 && g[bj][j] != -1) {
                    tmp[j] = tmp[bj] + g[bj][j];
                } else if (tmp[j]!=0&&g[bj][j]!=-1){
                    if (tmp[j]>g[bj][j]+tmp[bj]){
                        tmp[j]=g[bj][j]+tmp[bj];
                    }
                }
                tmp[p]=0;
            }
            for (int j = 0;j<n;j++){
                if (flag[j]==0&&tmp[j]!=0){
                    bj = j;
                    flag[bj]=1;
                    break;
                }
            }
            i++;
        }
        for (int j=0;j<n;j++){
            if (j!=p){
                System.out.print(tmp[j]);
                if (j+1<n&&j+1!=p){
                    System.out.print(",");
                }
            }
        }
    }
}
