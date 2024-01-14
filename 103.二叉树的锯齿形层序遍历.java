import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> deque = new ArrayDeque<>();
        int length = 1;
        int flag = 0;
        deque.add(root);
        while (!deque.isEmpty()) {
            int temp = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode cur = deque.poll();
                list.add(cur.val);
                switch(flag) {
                    case 0:
                        if (cur.right != null) {
                            deque.add(cur.right);
                            temp++;
                        }
                        if (cur.left != null) {
                            deque.add(cur.left);
                            temp++;
                        }
                        break;
                    case 1:
                        if (cur.left != null) {
                            deque.add(cur.left);
                            temp++;
                        }
                        if (cur.right != null) {
                            deque.add(cur.right);
                            temp++;
                        }
                        break;
                }
            }
            result.add(list);
            length = temp;
            flag = flag == 0 ? 1 : 0;
        }
        return result;
    }
}
// @lc code=end

