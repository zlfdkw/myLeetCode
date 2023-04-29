/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0;i < nums.length;i++) {
            while(nums[i] == 0) {
                for(int j = i + 1;j < nums.length;j++) {
                    nums[j - 1] = nums[j];
                }
                nums[nums.length - 1] = 0;
            }
        }
    }
}
// @lc code=end

