package qiuzhao.jiritoutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] str = new String[n];
            boolean flag = false;
            for (int j = 0;j<n;j++) {
                str[j] = sc.nextLine();
                for (int m = 0 ;m<j; m++) {
                    if (str[j].length()!=str[m].length()) {
                        continue;
                    }
                    char[] chars1 = str[m].toCharArray();
                    char[] chars2 = str[j].toCharArray();
                    char tmp = chars1[0];
                    List<Integer> list = new ArrayList<>();
                    for (int a = 0; a<chars2.length; a++) {
                        if (tmp == chars2[a]) {
                            list.add(a);
                        }
                    }
                    for (Integer integer:list) {
                        int x = 1;
                        int y = integer + 1;
                        while (x<chars1.length){
                            if (y==chars1.length) {
                                y=0;
                            }
                            if (chars1[x]==chars2[y]) {
                                x++;
                                y++;
                            }else {
                                break;
                            }
                        }
                        if (x==chars1.length){
                            flag=true;
                            break;
                        }
                        x = 1;
                        y = integer-1;
                        while (x<chars1.length){
                            if (y==-1) {
                                y=chars2.length-1;
                            }
                            if (chars1[x]==chars2[y]) {
                                x++;
                                y--;
                            }else {
                                break;
                            }
                        }
                        if (x==chars1.length){
                            flag=true;
                            break;
                        }
                    }
                }
            }
            System.out.println(flag?"Yeah":"Sad");
        }
    }
}
