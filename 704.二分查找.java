/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int temp = (left + right) / 2;
            if(nums[temp] > target) {
                right = temp - 1;
                continue;
            } else if (nums[temp] < target) {
                left = temp + 1;
                continue;
            } else {
                return temp;
            }
        }
        return -1;
    }
}
// @lc code=end

