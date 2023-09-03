import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javafx.scene.layout.Background;
import javafx.util.converter.NumberStringConverter;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();
    int tracknum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return res;
    }
    void backtrack(int[] candidates, int target, int start) {
        if(target == tracknum) {
            res.add(new LinkedList<>(track));
            return;
        }
        if(tracknum > target) {
            return;
        }
        for(int i = start;i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            track.addLast(candidates[i]);
            tracknum += candidates[i];
            backtrack(candidates, target, i + 1);
            track.removeLast();
            tracknum -= candidates[i];
        }
    }
}
// @lc code=end

