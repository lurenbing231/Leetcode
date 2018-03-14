package offer;

import org.junit.Test;

public class zhuose {
    int n;
    int m;
    int[][] a;
    int[] x;
    int sum;
    public int mcoloring(int mm,int nn,int[][] aa){
        n=nn;
        a=aa;
        x=new int[n+1];
        m=mm;
        sum=0;
        backtrack(1);
        return sum;
    }
    public void backtrack(int t){
        if(t>n){
            sum++;
        }else{
            for(int i=1;i<=m;i++){
                x[t]=i;
                if(ok(t))
                    backtrack(t+1);
                x[t]=0;
            }
        }
    }
    public boolean ok(int k){
        for(int j=1;j<=n;j++){
            if(a[k][j]==1&&x[j]==x[k])
                return false;
        }
        return true;
    }
    public int main(int n,int m) {
        int[][] a=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if (i==0||j==0){
                    a[i][j] = -1;
                }else if((i-j==1)||(j-i==1)||(i-j)==(n-1)||(j-i)==(n-1)) {
                    a[i][j] = 1;
                }else {
                    a[i][j] = 0;
                }
            }
        }
        zhuose c=new zhuose();
        return c.mcoloring(m, n, a);
    }
    @Test
    public void  test(){
        System.out.println(main(3,3)+" ");
    }
}
