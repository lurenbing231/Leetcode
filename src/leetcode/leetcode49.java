package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            int[] tmp = new int[26];
            for (char c : str.toCharArray()) {
                tmp[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append(tmp[i]);
            }
            String b = sb.toString();
            if (!hashMap.containsKey(b)) {
                hashMap.put(b,new ArrayList<>());
            }
            hashMap.get(b).add(str);
        }
        return new ArrayList<>(hashMap.values());
    }
}
