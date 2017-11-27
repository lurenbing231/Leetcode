package offer;

/**
 * Created by zhaoliang on 2017/11/27.
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Power {
    //自己的代码
    public double Power(double base, int exponent) {
        double n = 1;
        int length = exponent;
        if (exponent == 0) return n;
        if (exponent < 0) length = 0 - exponent;
        for (int i = 0; i < length; i++)
            n *= base;
        if (exponent < 0) n = 1 / n;
        return n;
    }

    /**
      * 1.全面考察指数的正负、底数是否为零等情况。
      * 2.写出指数的二进制表达，例如13表达为二进制1101。
      * 3.举例:10^1101 = 10^0001*10^0100*10^1000。
      * 4.通过&1和>>1来逐位读取1101，为1时将该位代表的乘数累乘到最终结果。
      */
    public double Power_bz(double base, int exponent) {
        double res = 1, suan = base;
        int expon;
        if (exponent > 0) {
            expon = exponent;
        } else if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("分母不能为0");
            }
            expon = -exponent;
        } else {
            return 1;
        }
        while (expon != 0) {
            if ((expon & 1) == 1)
                res *= suan;
            suan *= suan;
            expon >>= 1;
        }
        return exponent > 0 ? res : (1 / res);
    }
}
