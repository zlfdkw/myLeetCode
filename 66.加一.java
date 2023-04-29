import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while(true) {
            if(i < 0) {
                return digits;
            }
            if(i == 0 && digits[i] == 9) {
                int[] newArray = new int[digits.length + 1];
                newArray[0] = 1;
                return newArray;
            }
            if((digits[i] + 1) <= 9) {
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
                i--;
                continue;
            }
        }
    }
}
// @lc code=end

