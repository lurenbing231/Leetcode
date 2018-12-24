package Algroithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0 || target <= 0) {
            return new ArrayList<>();
        }
        Arrays.sort(candidates);
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
            if (i > k && candidates[i] == candidates[i-1]) {
                continue;
            }
            tmp.add(candidates[i]);
            recursionSum(target - candidates[i],
                    candidates, tmp, result, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
