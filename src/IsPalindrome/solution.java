package IsPalindrome;

/**
 * Created by zhaoliang on 2017/10/20.
 */
public class solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int e = 0;
        while (x > e) {
            e = e * 10 + x % 10;
            x /= 10;
        }
        return x == e || x == e / 10;
    }
}
