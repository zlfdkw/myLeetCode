/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        return dp(coins, amount);
    }

    public int dp(int[] coins, int amount) {
        if(amount == 0) return 0;
        if(amount < 0) return -1;
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int temp = dp(coins, amount - coin);
            if(temp == -1) continue;
            res = Math.min(res, temp + 1);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    } 
}
// @lc code=end

