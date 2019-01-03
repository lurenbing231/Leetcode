package leetcode.LongestCommonPrefix;

/**
 * Created by zhaoliang on 2017/10/21.
 * 查找所有字符串的公共前缀
 */
public class myTest2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        char[][] chars = new char[strs.length][];
        for (int i = 0; i < strs.length; i++) {
            chars[i] = strs[i].toCharArray();
        }
        String string = "";
        for (int i = 0; i < chars[0].length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (chars[j].length <= i) return string;
                if (chars[0][i] != chars[j][i]) return string;
            }
            string += chars[0][i];
        }
        return string;
    }
}
