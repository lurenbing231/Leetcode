package offer;

import org.junit.Test;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum <= 2) return res;
        ArrayList<Integer> tmp = new ArrayList<>();
        int i = 1;
        int j = 2;
        tmp.add(i);
        tmp.add(j);
        while (j < sum&&i<j) {
            int cnt;
            if ((j - i) % 2 != 0) {
                cnt = (j - i + 1) / 2 * (i + j);
            } else {
                cnt = (j - i) / 2 * (i + j) + (i + j) / 2;
            }
            if (sum == cnt) {
                ArrayList<Integer> tmpres = new ArrayList<>(tmp);
                res.add(tmpres);
                tmp.remove(0);
                tmp.add(++j);
                i++;
            } else if (sum > cnt) {
                tmp.add(++j);
            } else if (sum < cnt) {
                tmp.remove(0);
                i++;
            }

        }
        return res;
    }

    @Test
    public void test() {
        FindContinuousSequence(9);
    }
}
