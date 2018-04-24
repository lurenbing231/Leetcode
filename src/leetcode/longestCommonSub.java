package leetcode;
/*最长公共子串*/
public class longestCommonSub {
    private int getlong(char[] a, char[] b) {
        if (a.length == 0 || b.length == 0) return 0;
        int[][] tmp = new int[a.length + 1][b.length + 1];
        for (int i = 1; i < a.length + 1; i++) {
            for (int j = 1; j < b.length + 1; j++) {
                if (a[i - 1] == b[j - 1]) {
                    tmp[i][j] = tmp[i - 1][j - 1] + 1;
                } else {
                    tmp[i][j] = Math.max(tmp[i - 1][j], tmp[i][j - 1]);
                }
            }
        }
        return tmp[a.length][b.length];
    }
}
