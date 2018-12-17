package qiuzhao.huawei;
import java.util.Scanner;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        int l = num1.length();
        int r = num2.length();
        int[] num = new int[l + r];
        for (int i = 0; i < l; i++) {
            int n1 = num1.charAt(l - 1 - i) - '0';
            int tmp = 0;
            for (int j = 0; j < r; j++) {
                int n2 = num2.charAt(r - 1 - j) - '0';
                tmp = tmp + num[i + j] + n1 * n2;
                num[i + j] = tmp % 10;
                tmp /= 10;
            }
            num[i + r] = tmp;
        }

        int i = l + r - 1;
        while (i > 0 && num[i] == 0) {
            i--;
        }
        String result = "";
        while (i >= 0) {
            result += num[i--];
        }
        System.out.println(result);
    }
}
