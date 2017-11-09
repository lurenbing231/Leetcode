package AlgorithmsBook.Sort;

/**
 * Created by zhaoliang on 2017/11/2.
 * 自顶向下归并排序
 */
public class Merge {
    private static int[] aux;

    public static void merge(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (aux[j] < aux[i]) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }

    private static void merge_2(int[] a, int lo, int mid, int hi) {
        for (int i = lo; i <= mid; i++) {
            aux[i] = a[i];
        }

        for (int j = mid + 1; j <= hi; j++)
            aux[j] = a[hi - j + mid + 1];

        int i = lo, j = hi;
        for (int k = lo; k <= hi; k++)
            if (aux[j] < aux[i]) a[k] = aux[j--];
            else a[k] = aux[i++];
    }

    public static int[] sort(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
        return a;
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
}
