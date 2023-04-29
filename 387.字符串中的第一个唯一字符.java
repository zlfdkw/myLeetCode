import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap();
        for(int i = 0;i < chars.length;i++) {
            if(!map.containsKey(chars[i])) {
                map.put(chars[i], 0);
            }
            map.put(chars[i], map.get(chars[i]) + 1);
        }
        for(int i = 0;i <chars.length;i++) {
            if(map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

