package Algroithms;

public class leetcode38 {
    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder("");
        StringBuilder str = new StringBuilder("1");
        result = str;
        for (int i = 1; i < n; i++) {
            str = result;
            result = new StringBuilder();
            char zm = str.charAt(0);
            int cnt = 1;
            for (int j = 1; j < str.length(); j++) {
                if (zm != str.charAt(j)) {
                    result.append(cnt).append(zm);
                    cnt = 1;
                } else {
                    cnt++;
                }
                zm = str.charAt(j);
            }
            result.append(cnt).append(zm);
        }
        return result.toString();
    }
}
