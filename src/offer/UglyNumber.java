package offer;
/*
把只包含因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含因子7。
习惯上我们把1当做是第一个丑数。
求按从小到大的顺序的第N个丑数。
* */

import org.junit.Test;

public class UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7) return index;
        int t2 = 0, t3 = 0, t5 = 0;
        int[] t = new int[index];
        t[0] = 1;
        for (int i = 1; i < index; i++) {
            t[i] = Math.min(t[t2] * 2, t[t3] * 3);
            t[i] = Math.min(t[i], t[t5] * 5);
            if (t[i] == t[t2] * 2) t2++;
            if (t[i] == t[t3] * 3) t3++;
            if (t[i] == t[t5] * 5) t5++;
        }
        return t[index - 1];
    }
}
