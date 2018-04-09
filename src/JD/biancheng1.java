package JD;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        int cnt = 0;
        while (i <= j) {
            if (chars[i] == chars[j]) {
                i++;
                j++;
                cnt++;
            } else {
                int tmp = 1;
                while (true) {
                    if (chars[i + tmp] == chars[j]) {
                        i = tmp + i+1;
                        j--;
                        cnt++;
                        break;
                    } else if (chars[i] == chars[j - tmp]) {
                        j = j - tmp-1;
                        i++;
                        cnt++;
                        break;
                    } else if ((i + tmp) <= (j - tmp) && chars[i + tmp] == chars[j - tmp]) {
                        i = tmp + i+1;
                        j = j - tmp;
                        j--;
                        cnt++;
                        break;
                    } else if ((i + tmp) > (j - tmp)) {
                        i = tmp + i;
                        j = j - tmp;
                        break;
                    }
                    tmp++;
                }
            }
        }
        int res = 0;
        for (int k = 0; k < cnt; k++) {
            if (res != 0) res *= 2;
            res = 1;
        }
        System.out.println(res + s.length() + "");
    }
}
