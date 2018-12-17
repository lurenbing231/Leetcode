package qiuzhao.jiritoutiao;

import java.util.Scanner;

public class biancheng4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] ints = new int[n * t];
        for (int i = 0; i < n; i++) {
            ints[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = n; i < n * t; i++) {
            ints[i] = ints[j++];
        }
        System.out.println(getCount(ints,ints.length));
    }
    public static int getCount(int[] a,int len){
        int[] longest=new int[len];
        for(int i=0;i<len;i++){
            longest[i]=1;
        }
        for(int j=1;j<len;j++){
            for(int i=0;i<j;i++){
                if(a[j]>=a[i]&&longest[j]<longest[i]+1){
                    longest[j]=longest[i]+1;
                }
            }
        }
        int max=0;
        for(int j=0;j<len;j++){
            if(longest[j]>max){
                max=longest[j];
            }
        }
        return max;
    }

}
