package Algroithms;

import java.util.Scanner;

public class meituan2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        String strt = sc.nextLine();
        char[] s=strs.toCharArray();
        char[] t=strt.toCharArray();
        int num=0;
        for (int i=0;i<(s.length-t.length+1);i++){
            for (int j=0;j<t.length;j++){
                if (s[i+j]!=t[j]) num++;
            }
        }
        System.out.println(""+num);
    }
}
