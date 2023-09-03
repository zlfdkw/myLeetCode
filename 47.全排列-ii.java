import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {

    HashSet<LinkedList<Integer>> hs = new HashSet<>();
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        backtrack(nums ,0);
        res.addAll(hs);
        return res;
    }

    //排列树
    void backtrack(int[] nums) {
        if(track.size() == nums.length) {
            hs.add(new LinkedList<>(track));
        }
        for(int i = 0;i < nums.length;i++) {
            if(used[i] == true) {
                continue;
            }
            track.addLast(nums[i]);
            used[i] = true;
            backtrack(nums);
            track.removeLast();
            used[i] = false;
        }
    }

    //组合/子集树
    void backtrack(int[] nums, int start) {
        if(track.size() == nums.length) {
            hs.add(new LinkedList<>(track));
        }
        for(int i = start;i < nums.length;i++) {
            track.addLast(nums[i]);
            backtrack(nums, i + 1);
            track.removeLast();
        }
    }
}
// @lc code=end

