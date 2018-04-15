package InterviewGolden;
/*
给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。
保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
测试样例：
"aeiou"
返回：True
"BarackObama"
返回：False
* */

public class Different {
    public boolean checkDifferent(String iniString) {
        if(iniString.length()>257) return false;
        for (int i=0;i<iniString.length();i++){
            for (int j = i+1;j<iniString.length();j++){
                if (iniString.charAt(i)==iniString.charAt(j)) return false;
            }
        }
        return true;
    }
}
