import java.util.Stack;

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    // public ListNode reverseList(ListNode head) {
    //     Stack<ListNode> stack = new Stack<>();
    //     while(head != null) {
    //         stack.push(head);
    //         head = head.next;
    //     }
    //     if(stack.empty()) {
    //         return null;
    //     }
    //     ListNode temp = stack.pop();
    //     ListNode new_head = temp;
    //     ListNode node = temp;
    //     while(!stack.empty()) {
    //         node = stack.pop();
    //         temp.next = node;
    //         temp = node;
    //     }
    //     node.next = null;
    //     return new_head;   
    // }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}

// @lc code=end

