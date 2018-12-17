package qiuzhao.meituan;

import java.util.*;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int start = 0;
        int end = k - 1;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < k - 1; i++) {
            map.put(s[i], map.getOrDefault(s[i], 0) + 1);
        }
        while (end < n) {
            map.put(s[end], map.getOrDefault(s[end], 0) + 1);
            end++;
            for (Integer integer : map.keySet()) {
                if (map.get(integer) >= t) {
                    result++;
                    break;
                }
            }
            map.put(s[start], map.getOrDefault(s[start], 1) - 1);
            start++;
        }
        System.out.println(result);
    }
}
