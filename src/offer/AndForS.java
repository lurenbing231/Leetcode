package offer;
/*
输入一个递增排序的数组和一个数字S，
在数组中查找两个数，是的他们的和正好是S，
如果有多对数字的和等于S，输出两个数的乘积最小的。
* */

import java.util.ArrayList;

public class AndForS {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                res.add(array[i]);
                res.add(array[j]);
                return res;
            }
            if (array[i] + array[j] < sum) {
                i++;
            }
            if (array[i] + array[j] > sum) {
                j--;
            }
        }
        return res;
    }
}
