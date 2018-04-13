package offer;


import java.util.ArrayList;

/*
一个整型数组里除了两个数字之外，其他的数字都出现了两次。
请写程序找出这两个只出现一次的数字。
* */
public class FindNumsAppearOnce2 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = tmp ^ array[i];
        }
        int temp = 0;
        for (int i = 0; ; i++) {
            if ((tmp & (1 << i)) == 1) {
                temp = i;
                break;
            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & (1 << temp)) == 1) {
                a.add(array[i]);
            } else {
                b.add(array[i]);
            }
        }
        tmp = 0;
        for (int i = 0; i < a.size(); i++) {
            tmp = tmp ^ a.get(i);
        }
        num1[0] = tmp;
        tmp = 0;
        for (int i = 0; i < b.size(); i++) {
            tmp = tmp ^ b.get(i);
        }
        num2[0] = tmp;
    }
}
