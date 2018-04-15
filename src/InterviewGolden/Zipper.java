package InterviewGolden;

import org.junit.Test;

/*利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
若压缩后的字符串没有变短，则返回原先的字符串。

给定一个string iniString为待压缩的串(长度小于等于10000)，
保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。

测试样例
"aabcccccaaa"
返回："a2b1c5a3"
"welcometonowcoderrrrr"
返回："welcometonowcoderrrrr"
* */
public class Zipper {
    public String zipString(String iniString) {
        if (iniString.length() <= 2) return iniString;
        StringBuffer sb = new StringBuffer();
        char tmp = iniString.charAt(0);
        sb.append(tmp);
        int cnt = 1;
        for (int i = 1; i < iniString.length(); i++) {
            if (tmp == iniString.charAt(i)) {
                cnt++;
            } else {
                tmp = iniString.charAt(i);
                sb.append(cnt);
                sb.append(iniString.charAt(i));
                cnt = 1;
            }
        }
        sb.append(cnt);
        if (iniString.length() > sb.length()) return sb.toString();
        return iniString;
    }

    @Test
    public void test() {
        String string = "qwertyuioplkjhgfdsAzxcvbNM";
        zipString(string);
    }
}
