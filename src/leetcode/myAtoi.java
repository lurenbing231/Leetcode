package leetcode;

import org.junit.Test;

public class myAtoi {
    public int myAtoi(String str) {
        String[] cin = str.split(" ");
        int i = 0;
        long res = 0;
        char bj='+';
        boolean flag = true;
        while(i<cin.length){
            if(cin[i]!=null){
                for (int j=0;j<cin[i].length();j++) {
                    if ((cin[i].charAt(j) == '-' || cin[i].charAt(j) == '+') && flag) {
                        flag = false;
                        bj = cin[i].charAt(j);
                    } else if (cin[i].charAt(j) >= '0' && cin[i].charAt(j) <= '9') {
                        flag = false;
                        res = res * 10 + (cin[i].charAt(j) - 48);
                        if (bj == '-' && res > Integer.MAX_VALUE) {
                            return -2147483648;
                        }
                        if (bj == '+' && res > Integer.MAX_VALUE - 1) {
                            return 2147483647;
                        }
                    } else {
                        if (bj == '-') return (int) -res;
                        return (int) res;
                    }
                }
            }
            i++;
        }
        if(bj=='-') return (int) -res;
        return (int) res;
    }
    @Test
    public void test(){
        System.out.println(""+myAtoi("   +0 123"));
    }
}
