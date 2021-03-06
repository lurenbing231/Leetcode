package offer;
/*
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
* */

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumvers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] tmp = new int[k];
        if (k > input.length || k <= 0) {
            return res;
        }
        for (int i = 0; i < k; i++) {
            tmp[i] = input[i];
        }
        Arrays.sort(tmp);
        for (int i = k; i < input.length; i++) {
            if (tmp[k - 1] > input[i]) {
                tmp[k - 1] = input[i];
                Arrays.sort(tmp);
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(tmp[i]);
        }
        return res;
    }
}
