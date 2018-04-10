package offer;


import java.util.HashMap;
import java.util.Set;

/*
一个整型数组里除了两个数字之外，其他的数字都出现了两次。
请写程序找出这两个只出现一次的数字。
* */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hashMap.containsKey(array[i])){
                hashMap.put(array[i],2);
            }else {
                hashMap.put(array[i],1);
            }
        }
        Set<Integer> keys = hashMap.keySet();
        boolean flag=true;
        for (Integer key:keys){
            if (hashMap.get(key)==1){
                if (flag){
                    num1[0]=key;
                    flag=false;
                }else {
                    num2[0]=key;
                    break;
                }
            }
        }
    }
}
