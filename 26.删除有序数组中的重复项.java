/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 0;
        int count = 1;
        while(fast < nums.length) {
            if(nums[slow] == nums[fast]) {
                fast++;
                continue;
            }
            slow++;
            count++;
            nums[slow] = nums[fast];
            fast++;
        }
        return count;
    }
}
// @lc code=end

