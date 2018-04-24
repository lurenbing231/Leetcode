package leetcode;

import org.junit.Test;

/*最长不下降子序列*/
public class longestNotDescentSubsequence {
    public int getLong(int[] cin) {
        if (cin.length == 0) return 0;
        if (cin.length == 1) return 1;
        int[] d = new int[cin.length];
        int len = 1;
        for (int i = 1; i < cin.length; i++) {
            if (cin[i] >= d[len - 1]) {
                d[len++] = cin[i];
            } else {
                int j = len - 2;
                for (; j >= 0; j--) {
                    if (d[j] <= cin[i]) {
                        d[j + 1] = cin[i];
                        break;
                    }
                }
                if (j <= 0) {
                    d[j+1] = cin[i];
                }
            }
        }
        return len;
    }
    @Test
    public void test(){
        int[] cin = {1,2,3,2,3,2};
        System.out.println(""+getLong(cin));
    }
}
