package AlgorithmsBook.Sort;

/**
 * Created by zhaoliang on 2017/11/10.
 */
public class Heapsort {
    public static int[] sort(int[] a) {

        int N = a.length;
        int[] b = new int[N + 1];
        for (int i = 0; i < N; i++) b[i + 1] = a[i];
        for (int k = N / 2; k >= 1; k--) {
            sink(b, k, N);
        }
        while (N > 1) {
            exch(b, 1, N--);
            a[N]=b[N+1];
            sink(b, 1, N);
        }
        return a;
    }

    private static void sink(int[] b, int k, int N) {
        while (2*k <= N) {
            int j = 2 * k;
            if (j < N && b[j] < b[j + 1]) j++;
            if (b[k] >= b[j]) break;
            exch(b, k, j);
            k = j;
        }
    }

    private static void exch(int[] b, int k, int N) {
        int temp;
        temp = b[k];
        b[k] = b[N];
        b[N] = temp;
    }
}
