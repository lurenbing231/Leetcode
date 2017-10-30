package TwoFind;

/**
 * Created by zhaoliang on 2017/10/30.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        for (int j = array[0].length - 1, i = 0; (j >= 0 && i < array.length); ) {
            if (array[i][j] == target) return true;
            if (array[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
