package qiuzhao.jiritoutiao;

import java.util.*;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Integer>> s = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> tmp = new ArrayList<>();
            List<Integer> flag = new ArrayList<>();
            while (true) {
                int t = sc.nextInt();
                if (t != 0) {
                    tmp.add(t);
                    for (Integer ss : s.keySet()) {
                        if (s.get(ss).contains(t)&&!flag.contains(ss)){
                            flag.add(ss);
                        }
                    }
                } else {
                    t = i+1;
                    tmp.add(t);
                    for (Integer ss : s.keySet()) {
                        if (s.get(ss).contains(t)&&!flag.contains(ss)){
                            flag.add(ss);
                        }
                    }
                    s.put(i, tmp);
                    flag.add(i);
                    break;
                }
            }
            List<Integer> con = new ArrayList<>();
            for (Integer integer : flag) {
                con.addAll(s.remove(integer));
            }
            s.put(i,con);
        }
        int res = 0;
        for (Integer i : s.keySet()) {
            res ++;
        }
        System.out.println(res);
    }
}
