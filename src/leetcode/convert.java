package leetcode;

import org.junit.Test;

public class convert {
    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        StringBuffer[] str = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            str[i] = new StringBuffer("");
        }
        int cols = 0;
        int length = 0;
        while (length < s.length()) {
            int tmp = cols % (numRows - 1);
            if (tmp == 0) {
                for (int i = 0; i < numRows; i++) {
                    if (length >= s.length()) break;
                    str[i].append(s.charAt(length++));
                }
            } else {
                str[numRows - 1 - tmp].append(s.charAt(length++));
            }
            cols++;
        }
        String res = "";
        for (int i = 0; i < numRows; i++) {
            res += str[i].toString();
        }
        return res;
    }

    @Test
    public void test() {
        String res = convert("PAYPALISHIRING", 4);
        System.out.println(res);
    }
}
