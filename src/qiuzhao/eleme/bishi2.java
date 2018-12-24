package qiuzhao.eleme;

public class bishi2 {
    private int[] sort(int[] input) {
        int[] tmp = new int[10];
        for (int i = 0;i<input.length;i++){
            tmp[i]++;
        }
        int[] result = new int[1000000];
        int k = 0;
        for (int i = 0; i<=9;i++){
            for (int j = 0; j < tmp[i]; j++){
                result[k++] = i;
            }
        }
        return result;
    }
}
