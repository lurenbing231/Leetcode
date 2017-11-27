package offer;

/**
 * Created by zhaoliang on 2017/11/24.       自己的算法（找规律：从target=2开始，每个都是上一个的二倍）
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpStepII {
    public int JumpFloorII(int target) {
        if (target == 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        return JumpFloorII(target - 1) * 2;
    }
}
