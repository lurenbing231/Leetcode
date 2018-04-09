package offer;

import org.junit.Test;

/*
统计一个数字在排序数组中出现的次数。
* */
public class GetNumberOfK {

    public int GetNumberOfK(int[] array, int k) {
        if (array.length <= 0) return 0;
        int res = 0;
        int low = 0, high = array.length - 1;
        int tmp = -1;
        while (low <= high) {
            if (array[low + (high - low) / 2] == k) {
                tmp = low + (high - low) / 2;
                break;
            }
            if (array[low + (high - low) / 2] < k) {
                low = low + (high - low) / 2 + 1;
            } else if (array[low + (high - low) / 2] > k) {
                high = low + (high - low) / 2 - 1;
            }
        }
        if (tmp == -1) {
            return 0;
        }
        res++;
        for (int i = tmp + 1; i < array.length; i++) {
            if (array[i] == k) res++;
            else break;
        }
        for (int i = tmp - 1; i >= 0; i--) {
            if (array[i] == k) res++;
            else break;
        }
        return res;
    }

    @Test
    public void test() {
        int[] array = {1, 1, 2, 3, 4, 6, 6, 7, 8, 9, 9, 9, 10};
        int k = GetNumberOfK(array, 6);
        System.out.println(k + "");
    }
}
