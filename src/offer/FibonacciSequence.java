package offer;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by zhaoliang on 2017/11/16.
 */
public class FibonacciSequence {
    private int[] a;

    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        a = new int[n+1];
        a[n] = Sequence(n);
        return a[n];
    }

    private int Sequence(int se) {
        if(se==1){
            return 1;
        }
        if(se==0){
            return 0;
        }
        return Sequence(se-1)+Sequence(se-2);
    }
    @Test
    public void test(){
        try{
            throw new Exception("1");
        }catch (IOException e){
            try {
                throw new Exception("2");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }catch (Exception e) {
            try {
                throw new Exception("3");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }finally {
            try {
                throw new Exception("4");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
