package leetcode;

import org.junit.Test;

/*实现平方根*/
public class sqrt {
    private double erfensqrt(double cin) {
        if (cin < 0) {
            throw new RuntimeException("不能为负数");
        }
        if (cin == 0) {
            return 0;
        }
        double val = cin;
        double last = cin;
        val = (val+cin/val)/2;
        while (Math.abs(val-last)>Math.ulp(1)){
            last = val;
            val = (val+cin/val)/2;
        }
        return val;
    }
    @Test
    public void test(){
        System.out.println(Math.ulp(1));
        System.out.println(""+erfensqrt(9));
    }
}
