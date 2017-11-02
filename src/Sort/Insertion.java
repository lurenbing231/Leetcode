package Sort;


/**
 * Created by zhaoliang on 2017/10/26.
 */
public class Insertion {
    public static int[] sort(int[] s) {
        int temp;
        for (int i = 1; i < s.length; i++) {
            temp = s[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp < s[j]) {
                    s[j + 1] = s[j];
                    s[j] = temp;
                } else {
                    s[j + 1] = temp;
                    break;
                }
            }
        }
        return s;
    }
}
