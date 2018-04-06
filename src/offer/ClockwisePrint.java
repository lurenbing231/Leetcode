package offer;

import org.junit.Test;

import java.util.ArrayList;

public class ClockwisePrint {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        int ilength = matrix.length - 1;
        int jlength = matrix[0].length - 1;
        int istart = 0, jstart = 0;
        while (istart <= ilength && jstart <= jlength) {
            for (int j = jstart; j <= jlength; j++) {
                res.add(matrix[istart][j]);
            }
            for (int i = istart + 1; i <= ilength; i++) {
                res.add(matrix[i][jlength]);
            }
            if (istart != ilength)
                for (int j = jlength - 1; j >= jstart; j--) {
                    res.add(matrix[ilength][j]);
                }
            if (jstart != jlength)
                for (int i = ilength - 1; i >= istart; i--) {
                    res.add(matrix[i][jstart]);
                }
            istart++;
            jstart++;
            ilength--;
            jlength--;
        }
        return res;
    }

    @Test
    public void test() {
        int[][] matrix = {{1},{2},{3},{4},{5}};
        ArrayList<Integer> res = printMatrix(matrix);
    }
}
