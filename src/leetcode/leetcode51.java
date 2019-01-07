package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        dfs(board, 0, result);
        return result;
    }

    private void dfs(char[][] board, int k, List<List<String>> result) {
        if (k == board.length) {
            result.add(convert(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSuccess(board, i, k)) {
                board[k][i] = 'Q';
                dfs(board, k + 1, result);
                board[k][i] = '.';
            }
        }
    }

    private List<String> convert(char[][] board) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder stringBuilder = new StringBuilder("");
            for (int j = 0; j < board.length; j++) {
                stringBuilder.append(board[i][j]);
            }
            tmp.add(stringBuilder.toString());
        }
        return tmp;
    }

    private boolean isSuccess(char[][] board, int s, int k) {
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q' && (j == s || k + j == s + i || s + k == i + j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
