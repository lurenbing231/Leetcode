package chunzhao.aiqiyi;

import java.util.ArrayList;
import java.util.Scanner;

public class biancheng3 {
    private static long res = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        ArrayList<Integer> sss = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            sum += tmp;
            int cnt = in.nextInt()-tmp;
            if (cnt!=0){
                sss.add(cnt);
            }
        }
        int[] top = new int[sss.size()];
        for (int i=0;i<sss.size();i++){
            top[i]=sss.get(i);
        }
        if (sum > m) {
            System.out.println(0 + "");
        } else if (sum == m) {
            System.out.println(1 + "");
        } else {
            allsum(m - sum, top, 0);
            System.out.println(res + "");
        }
    }

    private static void allsum(int sum, int[] top, int k) {
        for (int j = 0; j <= top[k]; j++) {
            if (sum-j<0) return;
            if (sum-j==0){
                res++;
                return;
            }
            if(k+1==top.length) continue;
            allsum(sum - j, top, k + 1);
        }
    }
}
