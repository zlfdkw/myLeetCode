/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 找出字符串中第一个匹配项的下标
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int res = -1;
        int i = 0; 
        int j = 0;
        while(i < haystack.length()) {
            if(haystack.charAt(i) == needle.charAt(j)) {
                res = i;
                while(haystack.charAt(i) == needle.charAt(j)) {
                    j++;
                    if(j == needle.length()) {
                        return res;
                    }
                    i++;
                    if(i == haystack.length()) {
                        return -1;
                    }
                }
                i = res;
                res = -1;
            }
            i++;
            j= 0;
        }
        return res;
    }
}
// @lc code=end

