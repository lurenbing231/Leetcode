package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        permuteUniqueBack(result, nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    private void permuteUniqueBack(List<List<Integer>> result,
                                   int[] nums,
                                   List<Integer> tmp,
                                   boolean[] flag) {
        if (nums.length == tmp.size()) {
            result.add(new ArrayList<>(tmp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (flag[i] || (i > 0 && nums[i] == nums[i - 1] && !flag[i - 1])) {
                    continue;
                }
                tmp.add(nums[i]);
                flag[i] = true;
                permuteUniqueBack(result, nums, tmp, flag);
                tmp.remove(tmp.size() - 1);
                flag[i] = false;
            }
        }
    }
}
