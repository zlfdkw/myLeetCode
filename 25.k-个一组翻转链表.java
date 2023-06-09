/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) {
            return null;
        }
        ListNode a, b;
        a = b = head;
        for(int i = 0;i < k;i++) {
            if(b == null) {
                return head;
            }
            b = b.next;
        }
        ListNode  newHead = reverse(a, b);
        a.next = reverseKGroup(b, k);
        return newHead;
    }

    public ListNode reverse(ListNode head, ListNode tail) {
        if(head == tail || head.next == tail) {
            return head;
        }
        ListNode last = reverse(head.next, tail);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
// @lc code=end

