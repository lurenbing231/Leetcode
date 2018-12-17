package chunzhao.JD;

import java.util.Scanner;
import java.util.Stack;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            boolean flag = false;
            char[] s = sc.next().toCharArray();
            int cnt = 0;
            Stack<Character> left = new Stack<>();
            for (int j = 0; j < s.length; j++) {
                if (s[j] == '(') {
                    left.add(s[j]);
                } else {
                    if (left.size() > 0) {
                        left.remove(0);
                    } else if (cnt < 2) {
                        cnt++;
                    } else {
                        System.out.println("No");
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false&&left.size()==cnt)
                System.out.println("Yes");
            if (flag == false&&left.size()!=cnt)
                System.out.println("No");
        }
    }
}
