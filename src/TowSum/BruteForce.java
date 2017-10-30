package TowSum;

import org.junit.Test;

/**
 * Created by zhaoliang on 2017/10/19.
 */
public class BruteForce {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("没有这两个数！");
    }
}
