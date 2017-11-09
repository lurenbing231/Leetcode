package AlgorithmsBook.Sort;

/**
 * Created by zhaoliang on 2017/10/20.
 * 选择排序
 */
public class Selection {
    public static int[] sort(int[] x) {
        int temp = Integer.MAX_VALUE;
        int t = 0;
        for (int i = 0; i < x.length; i++) {
            temp = Integer.MAX_VALUE;
            for (int j = i; j < x.length; j++) {
                if (x[j] < temp) {
                    temp = x[j];
                    t = j;
                }
            }
            x[t] = x[i];
            x[i] = temp;
        }
        return x;
    }
}
