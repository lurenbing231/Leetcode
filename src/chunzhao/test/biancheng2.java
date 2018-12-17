package chunzhao.test;

import java.util.Scanner;
public class biancheng2 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n<=0)
            System.out.println("0");
        else{
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=input.nextInt();
            int out=0;

            for(int j=2;j<=n;j++)
                for(int m=0;m<n-j+1;m++)
                    out=out+dis(arr,m,j);
            System.out.println(out);
        }
    }
    public static int dis(int[] a,int m,int j){
        int max=a[m];
        int min=a[m];
        for(int i=1;i<j;i++){
            if(a[m+i]>max)
                max=a[m+i];
            if(a[m+i]<min)
                min=a[m+i];
        }
        return max-min;
    }
}