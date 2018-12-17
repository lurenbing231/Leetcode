package qiuzhao.webank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class biancheng1 {
    static String GetResult(int N) {
        int i = 1;
        int tmp = N - 1;
        while (tmp > 0) {
            i++;
            tmp -= i;
        }
        tmp += i;
        if (i % 2 == 1) {
            return i + 1 - tmp + "/" + tmp;
        } else {
            return tmp + "/" + (i + 1 - tmp);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        int _N;
        _N = Integer.parseInt(in.nextLine().trim());

        res = GetResult(_N);
        System.out.println(res);
    }
}
