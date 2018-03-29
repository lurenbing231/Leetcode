package wangyi;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class bishi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        TreeMap<Integer, Integer> t = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int Ai = in.nextInt();
            int Pi = in.nextInt();
            if (null == t.get(Pi) || Ai < t.get(Pi)) {
                t.put(Pi, Ai);
            }
        }
        int[][] s = new int[m][2];
        for (int i = 0; i < m; i++) {
            s[i][0] = in.nextInt();
            s[i][1] = i;
        }
        quick(s);
        Set<Integer> keys = t.keySet();
        int i = m - 1;
        for (int key : keys) {
            while (s[m][0] >= t.get(key) && m >= 0) {
                s[m--][0] = key;
            }
            if (m < 0) break;
        }
    }

    private static void quick(int[][] a) {
        if (a.length > 0) {
            quickSort(a, 0, a.length - 1);
        }
    }

    private static void quickSort(int[][] a, int low, int high) {
        if (low < high) {
            int middle = getMiddle(a, low, high);
            quickSort(a, low, middle - 1);
            quickSort(a, middle + 1, high);
        }
    }

    private static int getMiddle(int[][] a, int low, int high) {
        int tmp = a[low][0];
        while (low < high) {
            while (low < high && a[high][0] >= tmp) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low][0] <= tmp) {
                low++;
            }
            a[high] = a[low];
        }
        a[low][0] = tmp;
        return low;
    }
}
