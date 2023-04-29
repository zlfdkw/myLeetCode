/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        char[] array = s.toCharArray();
        // StringBuilder builder = new StringBuilder();
        int fuhao = 1;
        int i = 0;
        long result = 0;
        for (; i < array.length;i++) {
            if( i == array.length) {
                return 0;
            }
            if(array[i] !=  ' ') {
                if(array[i] == '-') {
                    fuhao = -1;
                    i++;
                    break;
                } else if (array[i] == '+') {
                    i++;
                    break;
                }
                break;
            } else {
                continue;
            }
        }
        for(;i < array.length && array[i] <= '9' && array[i] >= '0';i++) {
            result = result * 10 + array[i] - '0';
            if(result * fuhao > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE * fuhao;
            } else if (result * fuhao < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE * fuhao;
            }
        }
        return (int)result * fuhao;
    }
}
// @lc code=end

