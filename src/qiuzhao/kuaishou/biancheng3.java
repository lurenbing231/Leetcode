package qiuzhao.kuaishou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> cf = new ArrayList<>();
        int sum = 0;
        int flag = 0;
        boolean bioji = true;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if (bioji && tmp < 0) {
                continue;
            }
            bioji = false;
            sum += tmp;
            if (tmp < 0) {
                flag += tmp;
            } else if (flag < 0) {
                cf.add(flag);
                flag = 0;
            }
        }
        sum -= flag;
        Collections.sort(cf);
        for (int i = 0; i < M-1 && i < cf.size(); i++) {
            sum -= cf.get(i);
        }
        System.out.println(sum);
    }
}
