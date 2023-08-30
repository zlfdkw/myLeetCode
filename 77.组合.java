import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {

    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        
        backtrack(n, k, 1);
        return res;
    }

    void backtrack(int n, int k, int start) {
        if(temp.size() == k) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for(int i = start;i <= n;i++) {
            temp.addLast(i);
            backtrack(n, k, i + 1);
            temp.removeLast();
        }
    }
}
// @lc code=end

