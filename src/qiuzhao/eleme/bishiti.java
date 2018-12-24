package qiuzhao.eleme;

import org.junit.Test;

public class bishiti {
    @Test
    public void Test() {
        shuzu(new int[]{6, -3, -2, 7, -15, 1, 2, 2});
    }

    public int shuzu(int[] input) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < input.length; i++) {
            tmp += input[i];
            if (tmp < 0) {
                max = Math.max(tmp - input[i], max);
                tmp = 0;
            }
        }
        max = Math.max(tmp, max);
        return max;
    }
}
