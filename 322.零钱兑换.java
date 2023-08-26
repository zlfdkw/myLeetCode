import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    // int[] memo;
    public int coinChange(int[] coins, int amount) {
        // memo = new int[amount + 1];
        // Arrays.fill(memo, -666);
        // return dp(coins, amount);

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1;i < dp.length; i++) {
            for (int coin : coins) {
                if(i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }

    // public int dp(int[] coins, int amount) {
    //     if(amount == 0) return 0;
    //     if(amount < 0) return -1;
    //     if(memo[amount] != -666) return memo[amount];
    //     int res = Integer.MAX_VALUE;
    //     for (int coin : coins) {
    //         int temp = dp(coins, amount - coin);
    //         if(temp == -1) continue;
    //         res = Math.min(res, temp + 1);
    //     }
    //     memo[amount] = res == Integer.MAX_VALUE ? -1 : res;
    //     return memo[amount];
    // } 


}
// @lc code=end

