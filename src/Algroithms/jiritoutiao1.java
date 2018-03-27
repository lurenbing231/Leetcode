package Algroithms;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class jiritoutiao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, a);
        }
        Set<Integer> keys = map.keySet();
        int[] tmp = new int[map.size()];
        int x = 0;
        for (Integer key : keys) {
            tmp[x] = map.get(key);
            x++;
        }
        for (int i = 0; i < tmp.length; i++) {
            for (int j = i; j < tmp.length; j++) {
                if (tmp[j] - tmp[i] == k) {
                    res++;
                    break;
                }
                if (tmp[j] - tmp[i] > k) break;
            }
        }
        System.out.println("" + res);
    }
}
