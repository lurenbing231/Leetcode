package offer;
/*
数组最大子数组和
* */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) return 0;
        int res = array[0];
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            tmp += array[i];
            res = Math.max(tmp, res);
            if (tmp < 0) tmp = 0;
        }
        return res;
    }
}
