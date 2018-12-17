package chunzhao.aiqiyi;

import java.util.Scanner;

public class biancheng1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int length = str.length();
        int[] vis = new int[length];
        int max = 0;
        int pos = 0;
        StringBuffer res = new StringBuffer();
        for (int i=0;i<length;i++){
            vis[i]=str.charAt(i);
            if (vis[i]>max){
                max = vis[i];
                pos=i;
            }
        }
        int maxn = 0;
        for (int i=length-1;i>=pos;i--){
            if (vis[i]>=maxn){
                res.append(str.charAt(i));
                maxn = vis[i];
            }
        }
        System.out.println(res.reverse());
    }
}
