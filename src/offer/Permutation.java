package offer;
/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
* */

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str.length() > 0) {
            Permutationstr(str.toCharArray(), 0, res);
            Collections.sort(res);
        }
        return res;
    }

    private void Permutationstr(char[] str, int i, ArrayList<String> list) {
        if (i == str.length - 1) {
            String res = String.valueOf(str);
            if (!list.contains(res)) {
                list.add(res);
            }
        } else {
            for (int j = i; j < str.length; j++) {
                swap(str, i, j);
                Permutationstr(str, i + 1, list);
                swap(str, i, j);
            }
        }
    }

    private void swap(char[] str, int i, int j) {
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }

}
