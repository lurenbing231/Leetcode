package leetcode;

import org.junit.Test;

public class longestPalindrome {
    public String longestPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.append('#');
            sb.append(s.charAt(i));
        }
        sb.append('#');
        int[] pr = manacher(sb);
        int maxid = 0;
        int maxlength = 0;
        for (int i = 0; i < pr.length; i++) {
            if (maxlength < pr[i]) {
                maxid = i;
                maxlength = pr[i];
            }
        }
        StringBuffer res = new StringBuffer();
        for (int i = maxid - pr[maxid] + 1; i < maxid + pr[maxid]; i++) {
            if (sb.charAt(i) != '#') {
                res.append(sb.charAt(i));
            }
        }
        return res.toString();
    }

    private int[] manacher(StringBuffer sb) {
        int[] pr = new int[sb.length()];
        int id = 1;
        int mx = 1;
        for (int i = 2; i < sb.length(); i++) {
            if (i < mx) {
                pr[i] = Math.min(pr[2 * id - i], mx - i);
            } else {
                pr[i] = 1;
            }
            while (i - pr[i] >= 0 && i + pr[i] < sb.length() && sb.charAt(i - pr[i]) == sb.charAt(i + pr[i])) {
                pr[i]++;
            }
            if (i + pr[i] - 1 > mx) {
                id = i;
                mx = i + pr[i] - 1;
            }
        }
        return pr;
    }

    @Test
    public void test() {
        longestPalindrome("babad");
    }
}
