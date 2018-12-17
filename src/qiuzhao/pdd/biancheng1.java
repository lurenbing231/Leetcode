package qiuzhao.pdd;

import java.util.*;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine().toLowerCase();
        HashMap<String, Integer> hashMap = new HashMap<>();
        String tmp = "";
        for (int i = 0; i < strs.length(); i++) {
            char c = strs.charAt(i);
            if (c >= 'a' && c <= 'z') {
                tmp += c;
            } else if (tmp.length() > 0) {
                hashMap.put(tmp, hashMap.getOrDefault(tmp, 0) + 1);
                tmp = "";
            }
        }
        List<String> list = new ArrayList<>();
        int max = 0;
        for (String key : hashMap.keySet()) {
            if (max == hashMap.get(key)) {
                list.add(key);
            }
            if (max < hashMap.get(key)) {
                list.clear();
                list.add(key);
                max = hashMap.get(key);
            }
        }
        Collections.sort(list);
        for (String key : list) {
            System.out.print(key + " ");
        }
    }
}
