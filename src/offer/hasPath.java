package offer;

/*
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
* */
public class hasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix.length == 0) return false;
        char[][] matrixs = new char[rows][cols];
        int[][] flags = new int[rows][cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixs[i][j] = matrix[k++];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrixs[i][j] == str[0]) {
                    flags[i][j] = 1;
                    if (isHasPath(matrixs, flags, i - 1, j, str, 1)
                            || isHasPath(matrixs, flags, i, j - 1, str, 1)
                            || isHasPath(matrixs, flags, i + 1, j, str, 1)
                            || isHasPath(matrixs, flags, i, j + 1, str, 1)) {
                        return true;
                    }
                }
                flags[i][j] = 0;
            }
        }
        return false;
    }

    private boolean isHasPath(char[][] matrixs, int[][] flags, int i, int j, char[] str, int k) {
        if (k == str.length) return true;
        if (i < 0 || j < 0 || i >= matrixs.length || j >= matrixs[0].length) return false;
        if (flags[i][j] == 1) return false;
        if (matrixs[i][j] != str[k]) {
            return false;
        } else {
            flags[i][j] = 1;
            k++;
            return isHasPath(matrixs, flags, i - 1, j, str, k)
                    || isHasPath(matrixs, flags, i, j - 1, str, k)
                    || isHasPath(matrixs, flags, i + 1, j, str, k)
                    || isHasPath(matrixs, flags, i, j + 1, str, k);
        }
    }
}
