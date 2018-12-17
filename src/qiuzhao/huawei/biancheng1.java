package qiuzhao.huawei;

import java.util.*;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            list.add(str.charAt(i));
        }
        Collections.reverse(list);
        for (char c : list) {
            if (map.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("NULL");
    }
}
