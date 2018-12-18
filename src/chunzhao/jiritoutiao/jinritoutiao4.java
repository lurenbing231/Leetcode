package chunzhao.jiritoutiao;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class jinritoutiao4 {
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map1 = new TreeMap<>();
        double avg1 = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (null == map1.get(a)) {
                avg1 = (avg1 * map1.size() + a) / (map1.size() + 1);
            }
            map1.put(a, a);
        }
        Map<Integer, Integer> map2 = new TreeMap<>();
        double avg2 = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            if (null == map2.get(a)) {
                avg2 = (avg2 * map2.size() + a) / (map2.size() + 1);
            }
            map2.put(a, a);
        }
        t(map1, avg1, map2, avg2, 0);
        System.out.println("" + res);
    }

    private static void t(Map<Integer, Integer> map1, double avg1, Map<Integer, Integer> map2, double avg2, int r) {
        for (int key = 0; key < 1000; key++) {
            if (null != map1.get(key) && map1.get(key) < avg1 && map1.get(key) > avg2 && map1.size() > 1 && null == map2.get(key)) {
                System.out.println(map2.get(key));
                avg1 = (avg1 * map1.size() - map1.get(key)) / (map1.size() - 1);
                avg2 = (avg2 * map2.size() + map1.get(key)) / (map2.size() + 1);
                map1.remove(key);
                map2.put(key, key);
                t(map1, avg1, map2, avg2, r + 1);
            } else {
                if (res < r)
                    res = r;
            }
            if (null != map2.get(key) && map2.get(key) < avg2 && map2.get(key) > avg1 && map2.size() > 1 && null == map1.get(key)) {
                avg2 = (avg2 * map2.size() - map2.get(key)) / (map2.size() - 1);
                avg1 = (avg1 * map1.size() + map2.get(key)) / (map1.size() + 1);
                map2.remove(key);
                map1.put(key, key);
                t(map1, avg1, map2, avg2, r + 1);
            } else {
                if (res < r)
                    res = r;
            }
        }
        if (res < r)
            res = r;
        return;
    }
}
