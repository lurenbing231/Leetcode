package Algroithms;
/*Kruskal方法*/
import java.util.*;
public class findBao2 {
    private static class node {
        int p;
        int q;
        int k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<node> v = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            node nodes = new node();
            nodes.p = sc.nextInt()-1;
            nodes.q = sc.nextInt()-1;
            nodes.k = sc.nextInt();
            v.add(nodes);
        }
        Collections.sort(v, new Comparator<node>() {
            @Override
            public int compare(node o1, node o2) {
                return o1.k-o2.k;
            }
        });
        int[] res = new int[n];
        res[0] = 0;
        int result = toPrim(v, res, n);
        System.out.println(result + "");
    }

    private static int toPrim(List<node> v, int[] res, int n) {
        //用来记录节点所属连通图
        int d[] = new int[n];
        for (int i=0;i<n;i++){
            d[i]=i;
        }
        //记录最终权值和
        int num = 0;
        //记录最小生成树的最大权值
        int result = 0;
        for(int i=0;i<v.size();i++){
            int rootp=voltage(v.get(i).p,d);
            int rootq=voltage(v.get(i).q,d);
            if (rootp!=rootq) {
                if (result<v.get(i).k){
                    result=v.get(i).k;
                }
                d=merge(rootp,rootq,d);
            }
        }
        return result;
    }

    private static int voltage(int q,int[] d) {
        while (q!=d[q]){
            d[q]=d[d[q]];
            q=d[q];
        }
        return q;
    }

    private static int[] merge(int rootp, int rootq, int[] d) {
        if (rootp!=rootq){
            d[rootp]=rootq;
        }
        return d;
    }

}
