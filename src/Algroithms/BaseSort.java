package Algroithms;

import java.util.*;

public class BaseSort {
    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1};
        System.out.println("排序之前：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
        // 基数排序
        sort(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int anA : a) {
            System.out.print(anA + " ");
        }
    }

    private static void sort(int[] a) {
        int maxlength = 1;
        for (int anA : a) {
            if (maxlength < String.valueOf(anA).length()) {
                maxlength = String.valueOf(anA).length();
            }
        }
        int tmp = (int) Math.pow(10, maxlength);
        List<ArrayList<Integer>> queue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> queue1 = new ArrayList<>();
            queue.add(queue1);
        }
        for (int i = 1; i <= tmp; i *= 10) {
            for (int anA : a) {
                int entry = (anA / i) % 10;
                ArrayList<Integer> queue2 = queue.get(entry);
                queue2.add(anA);
                queue.set(entry, queue2);
            }
            int count = 0;
            for (int j = 0; j < 10; j++) {
                while (queue.get(j).size() > 0) {
                    ArrayList<Integer> queue3;
                    queue3 = queue.get(j);
                    a[count] = queue3.get(0);
                    queue3.remove(0);
                    count++;
                }
            }
        }
    }
}
