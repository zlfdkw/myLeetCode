import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char i : s_array) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
                continue;
            }
            map.put(i, map.get(i) + 1);

        }
        for (char j : t_array) {
            if(!map.containsKey(j)) {
                return false;
            }
            map.put(j, map.get(j) - 1);
        }
        for (Integer values : map.values()) {
            if(values != 0 ){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

