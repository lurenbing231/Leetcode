package DM5;

import org.junit.Test;

/**
 * Created by zhaoliang on 2017/10/26.
 */
public class test {
    @Test
    public void test(){
        try {
            String inputStr = "3wq3lwl399006";
            KeysUtil te = new KeysUtil();
            String s = decode.getInstance().encrypt(inputStr);
            System.out.println(s);
            String c = decode.getInstance().decrypt(s);
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
