package chunzhao.aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] cin = new int[3];
        cin[0] = in.nextInt();
        cin[1] = in.nextInt();
        cin[2] = in.nextInt();
        Arrays.sort(cin);
        int res = 0;
        while (cin[0] < cin[1]) {
            res++;
            cin[0] += 2;
        }
        if (cin[0] > cin[1]) {
            cin[1] += 1;
            cin[2] += 1;
            res++;
        }
        while (cin[1] < cin[2]) {
            cin[1]++;
            res++;
        }
        System.out.println(res + "");
    }
}
