package IsPalindrome;

/**
 * Created by zhaoliang on 2017/10/20.
 */
public class myTest {
    public boolean isPalindrome(int x) {
        int i = 1000000000;
        long left = 0;
        long right = 0;
        int a = 0;
        int b = 0;
        if (x < 0) return false;
        for (; i >= 1; i = i / 10) {
            if (x / i != 0) break;
        }
        for (int j = 1; j < i; j = j * 10, i = i / 10) {
            a = x / i;
            left = a % 10;
            b = x / j;
            right = b % 10;
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}
