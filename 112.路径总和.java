/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        traverse(root, targetSum, 0);
        return flag;
    }

    public void traverse(TreeNode root, int targetSum, int result) {
        if (root == null) {
            return;
        }
        result = result + root.val;
        if (targetSum == result && root.left == null && root.right == null) {
            flag = true;
        }
        traverse(root.left, targetSum, result);
        traverse(root.right, targetSum, result);
        result = result - root.val;
    }
}
// @lc code=end

