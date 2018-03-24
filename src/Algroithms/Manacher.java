package Algroithms;

import java.util.Arrays;

//字符串中回文串
public class Manacher {
    public static void main(String[] args) {
        char[] a = {'a', 'b', 'a', 'c', 'd', 'c', 'a', 'b', 'b', 'a', 'c', 'b'};
        int arrayLength = a.length;
        char[] n = new char[2 * arrayLength + 1];
        //建字符串数组
        n[0] = '#';
        for (int i = 0; i < arrayLength; i++) {
            n[2 * i + 1] = a[i];
            n[2 * i + 2] = '#';
        }
        int[] bn = new int[n.length];
        int index = 0, rn = 0;
        for (int i = 0; i < n.length; i++) {
            if (i < rn) {
                if (bn[2 * index - i] < (rn - i)) {
                    bn[i] = bn[2 * index - i];
                } else {
                    bn[i] = rn - i;
                    while (rn <= n.length && i - rn - 1 >= 0) {
                        if (n[i + rn + 1] == n[i - rn - 1]) {
                            rn++;
                            bn[i]++;
                            index = i;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                while (i + bn[i] + 1 < n.length && i - bn[i] - 1 >= 0) {
                    if (n[i + bn[i] + 1] == n[i - bn[i] - 1]) {
                        rn++;
                        bn[i]++;
                        index = i;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(bn[i] + " ");
        }
    }
}
