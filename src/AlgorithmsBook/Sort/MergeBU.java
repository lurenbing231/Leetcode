package AlgorithmsBook.Sort;

/**
 * Created by zhaoliang on 2017/11/2.
 * 自底向上归并排序
 */
public class MergeBU {
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

    public static int[] sort(int[] a) {
        int N = a.length;
        aux = new int[N];
        for (int sz = 1; sz < N; sz = sz * 2) {
            for (int lo = 0; lo < N - sz; lo += sz * 2) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
        return a;
    }
}
