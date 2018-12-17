package qiuzhao.xiecheng;

import java.util.*;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (time >= b && time <= c) {
                list.add(a);
            }
        }
        if (list.size() == 0) {
            System.out.println("null");
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
