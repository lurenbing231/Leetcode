package RomantoInteger;

/**
 * Created by zhaoliang on 2017/10/21.
 */
public class Test {
    String string = "MCMXCVI";
    @org.junit.Test
    public void test(){
        myTest myTest = new myTest();
        System.out.println(""+myTest.romanToInt(string));
    }
}
