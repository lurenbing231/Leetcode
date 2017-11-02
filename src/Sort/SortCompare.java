package Sort;


import org.junit.*;

/**
 * Created by zhaoliang on 2017/11/2.
 * 比较算法时间
 */
public class SortCompare {
    public static double time(String alg, int[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Insertion.sort(a);
        if (alg.equals("Selection")) Selection.sort(a);
        if (alg.equals("Shell")) Shell.sort(a);
        //if (alg.equals("Merge")) Merge.sort(a);
        //if (alg.equals("Quick")) Quick.sort(a);
        //if (alg.equals("Heap")) Heap.sort(a);
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        int[] a = new int[]{5, 9, 7, 8, 1, 5, 6, 7, 10, 12, 11, 36, 54, 41, 24, 56, 98, 74, 87, 12, 15, 18, 97, 85, 74, 96, 32, 65, 41, 48, 55, 66, 99, 77, 88, 44, 11, 33, 32, 35, 39, 68, 54, 75, 84, 74, 10, 0, 21, 3, 5};
        total = time(alg, a);
        return total;
    }

    public static void main(String[] args) {
        String alg1 = "Insertion";
        String alg2 = "Selection";
        int N = 0;
        int T = 0;
        double t1 = timeRandomInput(alg1, N, T);
        double t2 = timeRandomInput(alg2, N, T);
        System.out.println("t1为" + t1 + "\nt2为" + t2);
    }
}
