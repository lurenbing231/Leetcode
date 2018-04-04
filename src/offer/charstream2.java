package offer;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class charstream2 {
    private Map<Character, Integer> map = new LinkedHashMap<>();

    //Insert one char from stringstream
    private void Insert(char ch) {
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }
        char res = FirstAppearingOnce();
        System.out.print(res);
    }

    //return the first appearence once char in current stringstream
    private char FirstAppearingOnce() {
        Set<Character> sets = map.keySet();
        for (Character set : sets) {
            if (map.get(set) == 1) {
                return set;
            }
        }
        return '#';
    }

    @Test
    public void test() {
        char[] chars = {'g', 'o', 'o', 'g', 'l', 'e'};
        for (char aChar : chars) {
            Insert(aChar);
        }
    }
}
