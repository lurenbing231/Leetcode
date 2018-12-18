package Algroithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode30 {
    static class Solution {
        public static void main(String[] args){
            findSubstring("barfoofoobarthefoobarman", new String[]{"foo", "bar", "the"});
        }
        public static List<Integer> findSubstring(String s, String[] words) {
            HashMap<String, Integer> wordSum = new HashMap<>();
            for(String word : words) {
                wordSum.put(word, wordSum.getOrDefault(word, 0) + 1);
            }
            int len = words[0].length(), slen = s.length(), sum = words.length;
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i<len; i++) {
                int flag = 0;
                int start = i;
                int sumLen = 0;
                HashMap<String, Integer> wordFlag = new HashMap<>();
                while(start + len * sum <= slen) {
                    String tmp = s.substring(start + sumLen, start + sumLen + len);
                    if(wordSum.containsKey(tmp)) {
                        wordFlag.put(tmp, wordFlag.getOrDefault(tmp, 0) + 1);
                        if (wordFlag.get(tmp) > wordSum.get(tmp)){
                            wordFlag = new HashMap<>();
                            start += len;
                            flag = 0;
                            sumLen = 0;
                            continue;
                        }
                        flag ++;
                        if (flag == sum){
                            result.add(start);
                            wordFlag = new HashMap<>();
                            start += len;
                            sumLen = 0;
                            flag = 0;
                            continue;
                        }
                        sumLen += len;
                    } else {
                        start += len;
                        sumLen = 0;
                        flag = 0;
                        wordFlag = new HashMap<>();
                        continue;
                    }
                }
            }
            return result;
        }
    }
}
