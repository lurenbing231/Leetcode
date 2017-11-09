package AlgorithmsBook.Sort;

/**
 * Created by zhaoliang on 2017/10/20.
 */
public class Test {
    @org.junit.Test
    public void test() {
        int[] x = new int[]{5, 9, 7, 8, 1, 5, 6, 7, 10, 4, 8, 15, 64, 54, 85, 99, 74, 32, 52, 64, 36, 56, 84, 16, 75, 98};
        //选择排序
        System.out.println("选择排序");
        Selection selection = new Selection();
        int[] ints = selection.sort(x);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        //插入排序
        System.out.println("插入排序");
        Insertion insertion = new Insertion();
        int[] ints1 = insertion.sort(x);
        for (int i = 0; i < ints1.length; i++) {
            System.out.print(ints1[i] + " ");
        }
        System.out.println();
        //希尔排序
        System.out.println("希尔排序");
        Shell shell = new Shell();
        int[] ints2 = shell.sort(x);
        for (int i = 0; i < ints2.length; i++) {
            System.out.print(ints2[i] + " ");
        }
        System.out.println();
        //自顶向下归并排序
        System.out.println("自顶向下归并排序");
        Merge merge = new Merge();
        int[] ints3 = merge.sort(x);
        for (int i = 0; i < ints3.length; i++) {
            System.out.print(ints3[i] + " ");
        }
        System.out.println();
        //自底向上归并排序
        System.out.println("自底向上归并排序");
        MergeBU mergeBU = new MergeBU();
        int[] ints4 = mergeBU.sort(x);
        for (int i = 0; i < ints4.length; i++) {
            System.out.print(ints4[i] + " ");
        }
        System.out.println();
        //快速排序
        System.out.println("快速排序");
        Quick quick = new Quick();
        int[] ints5 = quick.sort(x);
        for (int i = 0; i < ints5.length; i++) {
            System.out.print(ints5[i] + " ");
        }
        System.out.println();
        //三向切分快速排序
        System.out.println("三向切分快速排序");
        Quick3way quick3way = new Quick3way();
        int[] ints6 = quick3way.sort(x);
        for (int i = 0; i < ints6.length; i++) {
            System.out.print(ints6[i] + " ");
        }
        System.out.println();
    }
}
