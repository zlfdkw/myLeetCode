/*
 * @lc app=leetcode.cn id=129 lang=java
 *
 * [129] 求根节点到叶节点数字之和
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
    int result = 0;
    public int sumNumbers(TreeNode root) {
        int temp = 0;
        traverse(root, temp);
        return result;
    }

    public void traverse(TreeNode root, int temp) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            temp = temp * 10 + root.val;
            result = result + temp;
        }
        temp = temp * 10 + root.val;
        traverse(root.left, temp);
        traverse(root.right, temp);
        temp = (temp - root.val) / 10;
    }
}
// @lc code=end

