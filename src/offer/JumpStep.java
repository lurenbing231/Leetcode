package offer;

import org.junit.Test;

/**
 * Created by zhaoliang on 2017/11/24.    自己的算法
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpStep {
    private int a=0;
    public int JumpFloor(int target) {
        if (target == 0) return 0;
        JumpFloor1(target);
        return a;
    }

    private void JumpFloor1(int n) {
        if (n < 2){
            a+=1;
            return ;
        }
        else if (n == 2) {
            a+=2;
            return ;
        }
        else {
            JumpFloor(n - 1);
            JumpFloor(n - 2);
        }
    }

    @Test
    public void test() {
        int target = 6;
        System.out.println("" + JumpFloor(target));
    }
}
