package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        premuteAdd(result, new ArrayList<>(), nums);
        return result;
    }

    private void premuteAdd(List<List<Integer>> result,
                            List<Integer> tmp,
                            int[] nums) {
        if (tmp.size() == nums.length) {
            result.add(new ArrayList<>(tmp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tmp.contains(nums[i])) {
                    continue;
                }
                tmp.add(nums[i]);
                premuteAdd(result, tmp, nums);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}
