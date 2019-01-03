package leetcode.LongestCommonPrefix;

/**
 * Created by zhaoliang on 2017/10/21.
 * 查找任意两个字符串的公共前缀
 */
public class myTest {
    public String longestCommonPrefix(String[] strs) {
        char[][] s = new char[strs.length][];
        if (strs.length==1) return strs[0];
        for (int i = 0; i < strs.length; i++) {
            s[i] = strs[i].toCharArray();
        }
        int length = 0;
        String str = null;
        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                int n = 0;
                if (s[i].length < s[j].length) {
                    for (int x = 0; x < s[i].length; x++) {
                        if (s[i][x] == s[j][x]) {
                            n++;
                        } else {
                            break;
                        }
                    }
                    if (length < n) {
                        length = n;
                        str = null;
                        for (int x = 0; x < n; x++) {
                            str = str + s[i][x];
                        }
                    }
                } else {
                    for (int x = 0; x < s[j].length; x++) {
                        if (s[i][x] == s[j][x]) {
                            n++;
                        } else {
                            break;
                        }
                    }
                    if (length < n) {
                        length = n;
                        str = "" + s[i][0];
                        for (int x = 1; x < n; x++) {
                            str = str + s[i][x];
                        }
                    }
                }

            }
        }
        if (str == null) return "";
        return str;
    }
}
