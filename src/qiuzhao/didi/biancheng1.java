package qiuzhao.didi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class biancheng1 {
    static List<Character> list1 = new ArrayList<>();
    static List<Character> list2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        int[] flag = new int[strings.length];
        list1 = Arrays.asList(new Character[]{'q', 'w', 'e', 'r', 't', 'a', 's', 'd', 'f', 'g', 'z', 'x', 'c', 'v'});
        list2 = Arrays.asList(new Character[]{'y', 'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'b', 'n', 'm'});
        for (int i = 1; i < strings.length; i++) {
            if (strings[0].length() == strings[i].length()) {
                flag[i] = getScore(strings[0], strings[i]);
            } else if (strings[0].length() < strings[i].length()) {
                int tmp = strings[i].length() - strings[0].length();
                flag[i] = tmp * 3 + getScore(strings[0], strings[i]);
                flag[i] = Math.min(flag[i], tmp * 3 + getScore(strings[0], strings[i].substring(tmp)));
            } else {
                int tmp = strings[0].length() - strings[i].length();
                flag[i] = tmp * 3 + getScore(strings[i], strings[0]);
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = strings.length - 1; j > i; j--) {
                if (flag[j] < flag[j - 1]) {
                    int tmp = flag[j];
                    flag[j] = flag[j - 1];
                    flag[j - 1] = tmp;
                    String temp = strings[j];
                    strings[j] = strings[j - 1];
                    strings[j - 1] = temp;
                }
            }
        }
        for (int i = 1; i < strings.length; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(strings[i] + " ");
        }
    }

    private static int getScore(String str1, String str2) {
        int tmp = 0;
        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            if (a != b) {
                if ((list1.contains(a) && list1.contains(b)) || (list2.contains(a) && list2.contains(b))) {
                    tmp += 1;
                } else {
                    tmp += 2;
                }
            }
        }
        return tmp;
    }
}
