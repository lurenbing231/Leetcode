package offer;

/*
在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
* */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) return -1;
        int[][] ints = new int[60][2];
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (ints[chars[i] - 65][0] == 0) {
                ints[chars[i] - 65][1] = i;
            }
            ints[chars[i] - 65][0]++;
        }
        int res = 10001;
        for (int i = 0; i < 60; i++) {
            if (ints[i][0] == 1 && ints[i][1] < res) {
                res = ints[i][1];
            }
        }
        if (res < 10001) return res;
        return 0;
    }
}
/*
也可以用LinkedHashMap
* */