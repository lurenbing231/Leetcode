package Sort;

/**
 * Created by zhaoliang on 2017/11/2.
 * 快速排序
 */
public class Quick {
    public static int[] sort(int[] a) {
        sort(a, 0, a.length - 1);
        return a;
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    //将元素进行切分
    private static int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = a[lo];
        int b = 0;
        while (true) {
            while (a[++i] < v) if (i == lo) break;
            while (v < a[--j]) if (j == lo) break;
            if (i >= j) break;
            b = a[j];
            a[j] = a[i];
            a[i] = b;
        }
        b = a[j];
        a[j] = a[lo];
        a[lo] = b;
        return j;
    }
}
