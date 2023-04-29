import java.util.List;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
        ListNode reverse = reverseList(copyList(head));
        while(head != null && reverse != null) {
            if(head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode new_head = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = new_head;
            new_head = head;
            head = temp;
        }
        return new_head;
    }

    public ListNode copyList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode newHead = new ListNode(head.val);
        ListNode p = head.next;
        ListNode q = newHead;
        while(p != null) {
            ListNode node = new ListNode(p.val);
            q.next = node;
            q = node;
            p = p.next;
        }
        return newHead;
    }
}
// @lc code=end

