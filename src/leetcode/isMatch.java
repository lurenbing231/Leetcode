package leetcode;

import org.junit.Test;

public class isMatch {
    public boolean isMatch(String s, String p) {
        return isequals(s, p, 0, 0);
    }

    private boolean isequals(String s, String p, int i, int j) {
        if (i >= s.length() && j >= p.length()) {
            return true;
        }
        if (i < s.length() && j >= p.length()) {
            return false;
        }
        if (i >= s.length() && j + 1 <= p.length()) {
            if (j + 1 == p.length()) {
                return false;
            }
            if (p.charAt(j + 1) == '*') {
                return isequals(s, p, i, j + 2);
            } else {
                return false;
            }
        }
        if (j + 1 < p.length() && p.charAt(j + 1) != '*') {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                return isequals(s, p, i + 1, j + 1);
            } else {
                return false;
            }
        }
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                return isequals(s, p, i + 1, j) || isequals(s, p, i + 1, j + 2) || isequals(s, p, i, j + 2);
            } else {
                return isequals(s, p, i, j + 2);
            }
        }
        if (j + 1 >= p.length()) {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                return isequals(s, p, i + 1, j + 1);
            } else {
                return false;
            }
        }
        return false;
    }

    @Test
    public void test() {
        isMatch("bbbba", ".*a*a");
    }
}
