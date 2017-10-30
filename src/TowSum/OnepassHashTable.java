package TowSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoliang on 2017/10/19.
 */
public class OnepassHashTable {
    public int[] twoSum(int[] sums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<sums.length;i++){
            int com = target - sums[i];
            if (map.containsKey(com)){
                return new int[] {map.get(com),i};
            }
            map.put(sums[i],i);
        }
        throw new IllegalArgumentException("没有这两个数！");
    }
}
