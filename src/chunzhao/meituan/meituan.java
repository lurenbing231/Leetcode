package chunzhao.meituan;

import java.util.Scanner;

public class meituan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] n = new int[str.length()];
        int[] tmp=new int[10];
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            n[i] = Integer.parseInt(ch.toString());
            tmp[n[i]]++;
        }
        for (int i = 1; i < 10; i++) {
            if (tmp[i]==0){
                System.out.println(""+i);
                return;
            }
        }
        if (tmp[0]==0){
            System.out.println("10");
            return;
        }
        int m=Integer.MAX_VALUE;
        int s=0;
        for (int i=1;i<10;i++){
            if (tmp[i]<m) {
                m=tmp[i];
                s=i;
            }
        }
        if (m<tmp[0]){
            for (int i=0;i<=m;i++){
                System.out.print(""+s);
            }
        }else {
            System.out.print(""+s);
            for (int i=0;i<=tmp[0];i++){
                System.out.print(""+0);
            }
        }
    }
}
