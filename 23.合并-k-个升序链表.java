import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并 K 个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            lists.length, (a, b)->(a.val - b.val)
        );
        for(ListNode head : lists) {
            if(head != null) {
                pq.add(head);
            }
        }
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            p.next = temp;
            if(temp.next != null) {
                pq.add(temp.next);
            }
            p = p.next;
        }
        return dummy.next;
    }
}
// @lc code=end

