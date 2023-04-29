import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0;i < nums.length;i ++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
// @lc code=end

