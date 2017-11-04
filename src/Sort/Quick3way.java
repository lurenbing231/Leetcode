package Sort;

/**
 * Created by zhaoliang on 2017/11/3.
 */
public class Quick3way {
    public static int[] sort(int[] a) {
        sort(a, 0, a.length - 1);
        return a;
    }

    private static void sort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int lt = lo, i = lo + 1, gt = hi;
        int v = a[lo];
        int j;
        while (i <= gt) {
            if (a[i] < v) {
                j = a[i];
                a[i] = a[lt];
                a[lt] = j;
                i++;
                lt++;
            } else if (a[i] > v) {
                j = a[i];
                a[i] = a[gt];
                a[gt] = j;
                gt--;
            } else {
                i++;
            }
            sort(a, lo, lt - 1);
            sort(a, gt + 1, hi);
        }
    }

}
