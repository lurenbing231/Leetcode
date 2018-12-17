package qiuzhao.pdd;

import java.util.HashMap;
import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        int mz = 0;
        int res = 0;
        for (int i = 1; i < N; i++) {
            int mzl = 0;
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int j = 0; j < N; j++) {
                int tmp = n[j] % i;
                if (hashMap.containsKey(tmp)) {
                    if (hashMap.get(tmp) == n[j]) {
                        mzl++;
                    } else {
                        hashMap.put(tmp, n[j]);
                    }
                } else {
                    hashMap.put(tmp, n[j]);
                }
            }
            if (mz < mzl) {
                mz = mzl;
                res = i;
            }
        }
        System.out.println(res);
    }
}
