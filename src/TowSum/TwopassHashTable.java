package TowSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoliang on 2017/10/19.
 */
public class TwopassHashTable {
    public int[] twoSum(int[] sums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sums.length; i++) {
            map.put(sums[i], i);
        }
        for (int i = 0; i < sums.length; i++) {
            int com = target - sums[i];
            if (map.containsKey(com) && map.get(com) != i) {
                return new int[]{i, map.get(com)};
            }
        }
        throw new IllegalArgumentException("没有这两个数！");
    }
}
