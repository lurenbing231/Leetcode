package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class leetcode39 {
    @Test
    public void test() {
        int[] candidates = new int[4];
        candidates[0] = 2;
        candidates[1] = 3;
        candidates[2] = 6;
        candidates[3] = 7;
        combinationSum(candidates, 7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0 || target <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        recursionSum(target, candidates, new ArrayList<>(), result, 0);
        return result;
    }

    private void recursionSum(int target,
                              int[] candidates,
                              List<Integer> tmp,
                              List<List<Integer>> result,
                              int k) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            List<Integer> s = new ArrayList<>(tmp);
            result.add(s);
            return;
        }
        for (int i = k; i < candidates.length; i++) {
            tmp.add(candidates[i]);
            recursionSum(target - candidates[i],
                    candidates, tmp, result, i);
            tmp.remove(tmp.size() - 1);
        }
    }
}
