package jiritoutiao;

import java.util.Scanner;

public class biancheng4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int z = 0; z < n; z++) {
            int k = sc.nextInt();
            String st = sc.nextLine();
            String[] chars = st.substring(1, st.length()).split(" ");
            int[] a = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                a[i] = Integer.parseInt(chars[i]);
            }
            int first = 0;
            int last = a.length - 1;
            int m1 = a[first], m2 = a[last];
            k--;
            while (first < last) {
                if (k == 0) break;
                if (((float) a[first] / (float) a[last - 1]) > ((float) a[first + 1] / (float)a[last])) {
                    m1 = a[first + 1];
                    k--;
                } else {
                    m2 = a[last - 1];
                    k--;
                }
            }
            System.out.println(m1 + " " + m2);
        }
    }
}
