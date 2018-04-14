package offer;

import org.junit.Test;

/*地上有一个m行和n列的方格。
一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
但是不能进入行坐标和列坐标的数位之和大于k的格子。
 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。
 请问该机器人能够达到多少个格子？
 * */
public class movingCount {
    private int thresh = 0;

    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows < 1 || cols < 1) return 0;
        int[][] flags = new int[rows][cols];
        flags[0][0] = 1;
        thresh = threshold;
        return 1 + isMovingCount(1, 0, flags) + isMovingCount(0, 1, flags);
    }

    private int isMovingCount(int i, int j, int[][] flags) {
        if (i < 0 || j < 0 || i >= flags.length || j >= flags[0].length) return 0;
        if (flags[i][j] == 1) return 0;
        char[] chars1 = ("" + i).toCharArray();
        char[] chars2 = ("" + j).toCharArray();
        int sum = 0;
        for (int k = 0; k < chars1.length; k++) {
            int tmp = chars1[k] - 48;
            sum += tmp;
        }
        for (int k = 0; k < chars2.length; k++) {
            int tmp = chars2[k] - 48;
            sum += tmp;
        }
        if (sum <= thresh) {
            flags[i][j] = 1;
            return 1 + isMovingCount(i - 1, j, flags)
                    + isMovingCount(i, j - 1, flags)
                    + isMovingCount(i + 1, j, flags)
                    + isMovingCount(i, j + 1, flags);
        } else return 0;
    }

    @Test
    public void test() {
        movingCount(10, 1, 100);
    }
}
