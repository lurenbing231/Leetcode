package Sort;

/**
 * Created by zhaoliang on 2017/11/2.
 * 希尔排序
 */
public class Shell {
    public static int[] sort(int[] s) {
        int len = s.length;
        int temp;
        int h = 1;
        while (h < len / 3) h = 3 * h + 1; // 1,4,13,40,121,364,1093...
        while (h >= 1) {
            for (int i = 1; i < len; i++) {
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
            h = h / 3;
        }
        return s;
    }
}
