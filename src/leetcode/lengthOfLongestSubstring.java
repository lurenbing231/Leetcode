package leetcode;

import org.junit.Test;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int[] jl = new int[500];
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (jl[s.charAt(i)] == 0) {
                jl[s.charAt(i)] = i + 1;
                tmp++;
            } else {
                max = Math.max(max, tmp);
                tmp = 1;
                i = jl[s.charAt(i)];
                jl = new int[500];
                jl[s.charAt(i)]=i+1;
            }
        }
        return Math.max(max, tmp);
    }

    @Test
    public void test() {
        lengthOfLongestSubstring("abcadcbb");
    }
}
