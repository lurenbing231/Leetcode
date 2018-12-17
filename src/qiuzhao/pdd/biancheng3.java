package qiuzhao.pdd;

import java.util.*;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (map.containsKey(x)) {
                List tmp = map.get(x);
                tmp.add(y);
                map.put(x, tmp);
            } else {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(y);
                map.put(x, tmp);
                list.add(x);
            }
        }
        int res = 0;
        List<Integer> flag = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (Integer integer : list) {
                if ((i == 0 && integer <= p[i]) || (i != 0 && integer > p[i - 1] && integer <= p[i])) {
                    flag.addAll(map.get(integer));
                }
            }
            if (flag.size() > 0) {
                Collections.sort(flag);
                res = res + p[i] - flag.get(flag.size() - 1);
                flag.remove(flag.size() - 1);
            } else {
                res = res + p[i];
            }
        }
        System.out.println(res);
    }
}
