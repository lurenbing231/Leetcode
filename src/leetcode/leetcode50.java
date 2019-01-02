package leetcode;

public class leetcode50 {
    public double myPow(double x, int n) {
        double result = 1;
        long tmp = Math.abs((long)n);
        while (tmp > 0) {
            if ((tmp & 1) == 1) {
                result *= x;
            }
            tmp >>= 1;
            x *= x;
        }
        return n < 0 ? 1 / result : result;
    }

}
