package leetcode;

import org.junit.Test;

/*去掉字符串中重复的字符*/
public class removeChar {
    private String remove(String cin) {
        if (cin.length() == 0) return cin;
        StringBuffer sb = new StringBuffer("");
        int i = 0, len = cin.length();
        while (i < len) {
            boolean flag = false;
            char tmp = cin.charAt(i);
            if (cin.indexOf(tmp) == cin.lastIndexOf(tmp)) {
                flag = true;
            } else {
                flag = false;
            }
            if (i++ == cin.indexOf(tmp)) {
                sb.append(tmp);
            } else if (flag == true) {
                sb.append(tmp);
            }
        }
        return sb.toString();
    }

    @Test
    public void test() {
        String res = remove("abdaadcefadefcd");
        res = "";
    }
}
