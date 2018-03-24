package Algroithms;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8};
        System.out.println("排序之前：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        //选择排序
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int n = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    n = j;
                }
            }
            a[n] = a[i];
            a[i] = min;
        }
        System.out.println();
        System.out.println("排序之后：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
    }
}
