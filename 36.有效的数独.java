/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int line[][] = new int[9][9];
        int column[][] = new int[9][9];
        int cell[][] = new int[9][9];
        for(int i =0;i < 9;i++) {
            for(int j = 0;j < 9;j++) {
                if(board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0' - 1;
                if(line[i][num] != 0 || column[j][num] != 0 || cell[i / 3 * 3 + j / 3][num] != 0){
                    return false;
                }else {
                    line[i][num] = 1;
                    column[j][num] = 1;
                    cell[i / 3 * 3 + j / 3][num] = 1;
                }
            }
        }
        return true;
    }
}
// @lc code=end

