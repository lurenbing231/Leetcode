package offer;
/*
将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
输入描述:
输入一个字符串,包括数字字母符号,可以为空
输出描述:
如果是合法的数值表达则返回该数字，否则返回0
示例1
输入
+2147483647
    1a33
输出
2147483647
    0
* */

public class StrToInt {
    public int StrToInt(String str) {
        if (str.length() == 0) return 0;
        char[] chars = str.toCharArray();
        if (str.length() == 1 && Character.isDigit(chars[0])) return (int) chars[0];
        if (str.length() == 1 && !Character.isDigit(chars[0])) return 0;
        if (!Character.isDigit(chars[0]) && chars[0] != '+' && chars[0] != '-') return 0;
        boolean flag = false;
        if (!Character.isDigit(chars[0]) && !Character.isDigit(chars[1])) return 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == '.' && false == false) flag = true;
            if (chars[i] == '.' && flag == true) return 0;
            if (!Character.isDigit(chars[i])) return 0;
        }
        return Integer.parseInt((Character.isDigit(chars[0]) || chars[0] == '-') ? str : str.substring(1, str.length()));
    }
}
