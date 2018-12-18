package chunzhao.jiritoutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jinritoutiao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String tmp = countExp(sc.nextLine());
            char[] chars = tmp.toCharArray();

        }
    }

    private static String countExp(String expression) {
        List<String> expList = middleToBehind(expression);
        while (expList.size() > 1) {
            for (int i = 0; i < expList.size(); i++) {
                if (isOperator(expList.get(i))) {
                    expList.add(i - 2, twoOperators(expList.get(i - 2), expList.get(i - 1), expList.get(i)));
                    expList.remove(i - 1);
                    expList.remove(i - 1);
                    expList.remove(i - 1);
                    break;
                }
            }
        }
        return expList.get(0);
    }

    private static String twoOperators(String operator1, String operator2, String o) {
        String result = "";
        int o1 = Integer.parseInt(operator1);
        int o2 = Integer.parseInt(operator2);
        int count = 0;
        if (o.equals("+")) {
            count = o1 + o2;
        } else if (o.equals("-")) {
            count = o1 - o2;
        } else if (o.equals("*")) {
            count = o1 * o2;
        }
        return result + count;
    }

    private static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*"))
            return true;
        return false;
    }

    private static List<String> middleToBehind(String expression) {
        List<String> result = new ArrayList<String>();
        if (expression.length() == 0)
            return result;
        int begin = 0;
        char[] operator = new char[100];
        int oTop = -1;
        while (begin < expression.length()) {
            String now = "";
            if (expression.charAt(begin) <= '9' && expression.charAt(begin) >= '0') {
                while (true) {
                    if (begin < expression.length() && expression.charAt(begin) <= '9'
                            && expression.charAt(begin) >= '0') {
                        now = now + expression.charAt(begin++);
                    } else {
                        break;
                    }
                }
                result.add(now);
            } else {
                char o = expression.charAt(begin++);
                if (oTop == -1) {
                    operator[++oTop] = o;
                } else if (comOperation(operator[oTop], o)) {
                    result.add("" + operator[oTop--]);
                    operator[++oTop] = o;
                } else {
                    operator[++oTop] = o;
                }
            }
        }
        while (oTop > -1) {
            result.add("" + operator[oTop--]);
        }
        return result;
    }

    private static boolean comOperation(char first, char second) {
        if (first == '+') {
            if (second == '+')
                return true;
            else if (second == '-')
                return true;
            else if (second == '*')
                return false;
        } else if (first == '-') {
            if (second == '+')
                return true;
            else if (second == '-')
                return true;
            else if (second == '*')
                return false;
        } else if (first == '*') {
            if (second == '+')
                return true;
            else if (second == '-')
                return true;
            else if (second == '*')
                return true;
        }
        return false;
    }
}
