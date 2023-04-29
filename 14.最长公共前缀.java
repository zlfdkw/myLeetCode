/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        if(strs.length == 1) {return strs[0];}
        if(strs.length == 0) {return "";}
        for(int i = 0;i < strs[0].length();i++) {
            for(int j = 1;j < strs.length;j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != strs[j - 1].charAt(i) ) {
                    return builder.toString();
                }
            }
            builder.append(strs[1].charAt(i));
        }
        return builder.toString();
    }
}
// @lc code=end

