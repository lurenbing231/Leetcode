package offer;

import org.junit.Test;

public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0) return "";
        if(n==0) return str;
        int k = n%str.length();
        String pre = str.substring(0,k);
        String last = str.substring(k,str.length());
        return last+pre;
    }
    @Test
    public void test(){
        LeftRotateString("cdefgab",2);
    }
}
