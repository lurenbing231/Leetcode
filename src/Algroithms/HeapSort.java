package Algroithms;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64};
        int arrayLength = a.length;
        //循环建堆
        for (int i = 0; i < arrayLength - 1; i++) {
            //建堆
            buildMaxHeap(a, arrayLength - 1 - i);
            swap(a, 0, arrayLength - i - 1);
            System.out.println(Arrays.toString(a));
        }
    }

    private static void buildMaxHeap(int[] a, int lastindex) {
        for (int i = (lastindex - 1) / 2; i >= 0; i--) {
            int k = i;
            while (k * 2 + 1 <= lastindex) {//如果当期节点有子节点
                int bigson = k * 2 + 1;
                if (bigson + 1 <= lastindex) {//存在右节点
                    if (a[bigson + 1] > a[bigson]) {
                        bigson++;
                    }
                }
                if (a[k] < a[bigson]) {
                    swap(a, k, bigson);
                    k = bigson;
                } else {
                    break;
                }
            }
        }

    }

    private static void swap(int[] a, int k, int bigson) {
        int b = a[k];
        a[k] = a[bigson];
        a[bigson] = b;
    }
}
