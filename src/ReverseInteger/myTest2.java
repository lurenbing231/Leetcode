package ReverseInteger;

/**
 * Created by zhaoliang on 2017/10/19.
 */
public class myTest2 {
    class Solution {
        public int reverse(int x) {
            long i = 1;
            long sum = 0;
            long sum1 = 0;
            long sum2 = 0;
            long a = 0;
            long b = 0;
            if(x==0){
                return x;
            }
            for(;;i=i*10){
                if(x/i == 0) break;
            }
            i = i/10;
            for(int j=1;i>=j;j=j*10,i=i/10){
                a = x/i;
                sum1 = a % 10;
                b = x/j;
                sum2 = b % 10;
                if(i==j){
                    sum = sum + sum1*j;
                    break;
                }
                sum = sum + sum1*j + sum2 * i;
            }
            if (sum> Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
                return 0;
            }
            return (int)sum;
        }
    }
}
