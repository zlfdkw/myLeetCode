/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        dummy1.next = null;
        ListNode dummy2 = new ListNode(-1);
        dummy2.next = null;
        // ListNode p = head;
        ListNode p1 = dummy1;
        ListNode p2 = dummy2;

        while(head != null) {
            if(head.val < x) {
                ListNode temp1 = new ListNode(head.val);
                temp1.next = null;
                p1.next = temp1;
                p1 = p1.next;
                head = head.next;
            }else {
                ListNode temp2 = new ListNode(head.val);
                temp2.next = null;
                p2.next = temp2;
                p2 = p2.next;
                head = head.next;
            }
        }
        ListNode temp = dummy1;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = dummy2.next;
        return dummy1.next;
    }
}
// @lc code=end

