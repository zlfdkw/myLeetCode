import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.util.ElementScanner6;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(true) {
            if(i == nums1.length || j == nums2.length) {
                int[] result = new int[list.size()];
                for(int k = 0;k < list.size();k++) {
                    result[k] = list.get(k);
                }
                return result;
            }
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
    }
}
// @lc code=end

