package offer;
/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。


完全理解错了，这个输出结果是单个字符
* */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class charstream {
    private Map<Character, Integer> map = new LinkedHashMap<>();

    //Insert one char from stringstream
    public void Insert(char ch) {
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        Set<Character> sets = map.keySet();
        for (Character set : sets) {
            if (map.get(set) == 1) {
                return set;
            }
        }
        return '#';
    }
}
