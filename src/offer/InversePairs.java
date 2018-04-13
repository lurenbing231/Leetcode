package offer;
/*
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
* */

public class InversePairs {
    public int InversePairs(int[] array) {
        if (array.length <= 1) return 0;
        int[] copy = array.clone();
        long res = FZ(array, copy, 0, array.length - 1);
        return (int) (res % 1000000007);
    }

    private long FZ(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = array[start];
            return 0;
        }
        int mid = start + (end - start) / 2;
        long left = FZ(copy, array, start, mid);
        long rignt = FZ(copy, array, mid + 1, end);
        long count = 0;
        int i = mid;
        int j = end;
        int tmp = end;
        while (i >= start && j >= mid + 1) {
            if (array[i] < array[j]) {
                copy[tmp--] = array[j--];
            } else {
                copy[tmp--] = array[i--];
                count = count + j - mid;
            }
        }
        for (; i >= start; i--) {
            copy[tmp--] = array[i--];
        }
        for (; j >= mid + 1; j--) {
            copy[tmp--] = array[j--];
        }
        return left + rignt + count;
    }
}
