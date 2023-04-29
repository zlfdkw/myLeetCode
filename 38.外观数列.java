/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        StringBuilder prev;
        int count;
        char c;
        for(int i = 1;i < n;i++) {
            prev = res;
            res = new StringBuilder();
            c = prev.charAt(0);
            count = 1;
            for(int j = 1;j < prev.length();j++) {
                if(c != prev.charAt(j)) {
                    res.append(count).append(c);
                    count = 1;
                    c = prev.charAt(j);
                } else {
                    count++;
                }
            }
            res.append(count).append(c);
        }
        return res.toString();
    }
}
// @lc code=end

