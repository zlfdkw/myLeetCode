import java.util.HashSet;
import java.util.Hashtable;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++) {
            boolean result = set.add(nums[i]);
            if(result == false){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

