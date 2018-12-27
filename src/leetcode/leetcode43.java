package leetcode;

public class leetcode43 {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int tmp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int s = result[i + j + 1] + tmp;
                result[i + j] += s / 10;
                result[i + j + 1] = s % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (!(sb.length() == 0 && r == 0)) {
                sb.append(r);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
