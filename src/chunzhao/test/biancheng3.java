package chunzhao.test;

import java.util.Scanner;

public class biancheng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int P1 = sc.nextInt();
        int P2 = sc.nextInt();
        int P3 = sc.nextInt();
        int T1 = sc.nextInt();
        int T2 = sc.nextInt();
        int result = 0;
        int rp = 0;
        for(int i = 0; i<n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (i!=0){
                int cnts = l-rp;
                if (cnts-T1>0){
                    result += T1*P1;
                    if (cnts-T1-T2>0){
                        result += T2*P2;
                        result += (cnts-T1-T2)*P3;
                    } else {
                        result += (cnts-T1)*P2;
                    }
                } else {
                    result += cnts*P1;
                }
            }
            result += (r-l)*P1;
            rp = r;
        }
        System.out.println(result);
    }
}
