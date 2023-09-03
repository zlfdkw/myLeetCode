import java.util.LinkedList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */


// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    int tracknum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0);
        return res;
    }

    void backtrack(int[] candidates, int target, int start) {
        if(tracknum == target) {
            res.add(new LinkedList<>(track));
            return;
        }

        if(tracknum > target) {
            return;
        }

        for(int i = start;i < candidates.length;i++) {
            tracknum += candidates[i];
            track.addLast(candidates[i]);
            backtrack(candidates, target, i);
            tracknum -= candidates[i];
            track.removeLast();
        }
    }

    
}
// @lc code=end

