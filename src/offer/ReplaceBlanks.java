package offer;

/**
 * Created by zhaoliang on 2017/11/10.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class ReplaceBlanks {
    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
        char[] a = string.toCharArray();
        string = "";
        for (int i=0;i<a.length;i++){
            if (a[i]==' '){
                string += "%20";
            }else {
                string += a[i];
            }
        }
        return string;
    }
}
