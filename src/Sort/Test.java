package Sort;

/**
 * Created by zhaoliang on 2017/10/20.
 */
public class Test {
    @org.junit.Test
    public void test() {
        int[] x = new int[]{5, 9, 7, 8, 1, 5, 6, 7, 10};
        Selection selection = new Selection();
        int[] ints = selection.sort(x);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        Insertion insertion = new Insertion();
        int[] ints1 = insertion.sort(x);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i] + " ");
        }
        System.out.println();
        Shell shell = new Shell();
        int[] ints2 = shell.sort(x);
        for (int i = 0; i < ints2.length; i++) {
            System.out.print(ints2[i] + " ");
        }
    }
}
