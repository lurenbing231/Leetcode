package offer;

import org.junit.Test;

/**
 * Created by zhaoliang on 2017/11/24.
 */
public class NumberOf {
    public int NumberOf1(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & (n - 1);
        }
        return sum;
    }
}
