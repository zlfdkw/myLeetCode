import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    List<List<String>> res  = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        ArrayList<String> board = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j < n;j++) {
                sb.append('.');
            }
            board.add(sb.toString());
        }
        backtrack(board, 0);
        return res;
    }

    void backtrack(ArrayList<String> board, int row) {
        if(row == board.size()) {
            res.add(new ArrayList<>(board));
            return;
        }
        int n = board.get(row).length();
        for(int col = 0;col < n;col++) {
            if(!isValid(board, row, col)) {
                continue;
            }
            StringBuilder sb = new StringBuilder(board.get(row));
            sb.setCharAt(col, 'Q');
            board.set(row, sb.toString());

            backtrack(board, row + 1);

            sb.setCharAt(col, '.');
            board.set(row, sb.toString());
        }
    }

    boolean isValid(ArrayList<String> board, int row, int col) {
        int n = board.size();

        for(int i = 0;i < n;i++) {
            if(board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0;i--,j--) {
            if(board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < n;i--,j++) {
            if(board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

}
// @lc code=end

