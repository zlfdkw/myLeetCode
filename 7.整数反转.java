/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        double res = 0;
        while (x != 0) {
            int t = x % 10;
            res = res * 10 + t;
            //如果数字溢出，直接返回0
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
                return 0;
            }
            x = x / 10;
        }
        return (int)res;
    }
}
// @lc code=end

