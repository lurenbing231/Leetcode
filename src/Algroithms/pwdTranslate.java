package Algroithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*在情报传递过程中，为了防止情报被截获，往往需要对情报用一定的方式加密，简单的加密算法虽然不足以完全避免情报被破译，但仍然能防止情报被轻易的识别。我们给出一种最简的的加密方法，对给定的一个字符串，把其中从a-y,A-Y的字母用其后继字母替代，把z和Z用a和A替代，则可得到一个简单的加密字符串。
输入描述:
用gets(s)方式读取这一行字符串.每个字符串长度小于80个字符。


输出描述:
对于每组数据，输出每行字符串的加密字符串。

输入例子1:
Hello! How are you!

输出例子1:
Ifmmp! Ipx bsf zpv!*/
public class pwdTranslate {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] chars = new char[str.length()];
        chars = str.toCharArray();
        for (int i=0;i<str.length();i++){
            if (chars[i]>='a'&&chars[i]<='z'){
                chars[i]++;
            }else if (chars[i]>='A'&&chars[i]<='Z'){
                chars[i]++;
            }else if (chars[i]=='Z'){
                chars[i]='A';
            }else if (chars[i]=='z'){
                chars[i]='a';
            }
        }
        System.out.println("结果为：");
        for (int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
    }
}
