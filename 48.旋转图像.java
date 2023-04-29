/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i < n;i++) {
            for(int j = i;j < n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int[] row : matrix) {
            reverse(row);
        }
    }

    public void reverse(int[] row) {
        int i = 0;
        int j = row.length - 1;
        while(j > i) {
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
            i++;j--;
        }
    }
}
// @lc code=end

