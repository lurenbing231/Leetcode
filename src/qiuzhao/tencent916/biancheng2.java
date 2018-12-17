package qiuzhao.tencent916;

import java.util.*;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Set<Integer>> lists = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (lists.containsKey(a)) {
                Set<Integer> tmp = lists.get(a);
                tmp.add(b);
                lists.put(a, tmp);
            } else {
                Set<Integer> tmp = new HashSet<>();
                tmp.add(b);
                lists.put(a, tmp);
            }
        }
        for (int k = 0; k < n; k++) {
            for (Integer i : lists.keySet()) {
                if (lists.get(i)!=null) {
                    Set<Integer> tmp = lists.get(i);
                    for (Integer integer : lists.get(i)) {
                        Set<Integer> c = lists.get(integer);
                        if (c != null) {
                            tmp.addAll(c);
                        }
                    }
                    lists.put(i, tmp);
                }
            }
        }
        int[] flag = new int[n + 1];
        for (Integer i : lists.keySet()) {
            for (Integer integer : lists.get(i)) {
                flag[integer]++;
            }
        }
        int res = 0;
        for (int i = 0; i <= n; i++) {
            if (lists.get(i) != null && lists.get(i).contains(i)) {
                flag[i]++;
            }
            if ((lists.get(i) == null && flag[i] > 0) || (lists.get(i) != null && lists.get(i).size() < flag[i])) {
                res++;
            }
        }
        System.out.println(res);
    }
}
