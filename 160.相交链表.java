/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        for(ListNode p1 = headA; p1 != null; p1 = p1.next) {
            lenA++;
        }
        for(ListNode p2 = headB; p2 != null; p2 = p2.next) {
            lenB++;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        if(lenA > lenB) {
            for(int i = 0;i < lenA - lenB;i++) {
                p1 = p1.next;
            }
        } else {
            for(int i = 0;i < lenB - lenA;i++) {
                p2 = p2.next;
            }
        }
        while(p1 != null && p2 != null) {
            if(p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }
}
// @lc code=end

