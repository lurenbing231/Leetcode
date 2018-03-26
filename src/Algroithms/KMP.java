package Algroithms;

import java.util.ArrayList;
import java.util.Scanner;

public class KMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String s = sc.nextLine();
        char[] arr = t.toCharArray();
        char[] mat = s.toCharArray();
        int[] next = getNext(mat);
        ArrayList<Integer> res = getKmp(arr, mat, next);
        for (Integer re : res) {
            System.out.print(" " + re);
        }
    }

    private static int[] getNext(char[] mat) {
        int[] next = new int[mat.length];
        next[0] = -1;
        next[1] = 0;
        int cn = 0;
        int j = 2;
        while (j < mat.length) {
            if (mat[j - 1] == mat[cn]) {
                next[j++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[j++] = 0;
            }
        }
        return next;
    }

    private static ArrayList<Integer> getKmp(char[] arr, char[] mat, int[] next) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = -1;
        while (i < arr.length) {
            while (j > -1 && mat[j + 1] != arr[i]) j = next[j];
            if (arr[i] == mat[j + 1]) {
                j++;
            }
            if (j + 1 == mat.length) {
                res.add(i - mat.length + 1);
                j = -1;
            }
            i++;
        }
        return res;
    }
}
